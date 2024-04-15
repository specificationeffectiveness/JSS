package ca.jimr.gae;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test0001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0001");
        java.lang.String str0 = ca.jimr.gae.profiler.MiniProfilerFilter.REQUEST_ID_HEADER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "X-Mini-Profile-Request-Id" + "'", str0, "X-Mini-Profile-Request-Id");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = ca.jimr.gae.profiler.MiniProfilerFilter.MEMCACHE_NAMESPACE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mini_profile" + "'", str0, "mini_profile");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.Object obj0 = new java.lang.Object();
        java.lang.Class<?> wildcardClass1 = obj0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = ca.jimr.gae.profiler.MiniProfilerFilter.INCLUDES_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mini_profile_includes" + "'", str0, "mini_profile_includes");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = ca.jimr.gae.profiler.MiniProfilerFilter.REQUEST_ID_ATTRIBUTE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mini_profile_request_id" + "'", str0, "mini_profile_request_id");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet1 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet1.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        javax.servlet.FilterChain filterChain5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest3, servletResponse4, filterChain5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration2 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet2 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet2.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        javax.servlet.FilterConfig filterConfig1 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        java.lang.String str0 = ca.jimr.gae.profiler.MiniProfilerFilter.MEMCACHE_KEY_FORMAT_STRING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "mini_profile_request_%s" + "'", str0, "mini_profile_request_%s");
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.lang.Class<?> wildcardClass4 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.FilterConfig filterConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        javax.servlet.FilterChain filterChain4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest2, servletResponse3, filterChain4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        java.lang.String str0 = ca.jimr.gae.profiler.MiniProfilerFilter.REQUEST_ID_PARAM_REDIRECT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "_mprid_" + "'", str0, "_mprid_");
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.Throwable throwable2 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration2 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext2 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.init();
        java.lang.String str6 = miniProfilerServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("");
        step1.close();
        java.lang.Class<?> wildcardClass3 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass2 = servletConfig1.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
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
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet3.getServletConfig();
        java.lang.String str5 = miniProfilerServlet3.getServletInfo();
        miniProfilerServlet3.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        javax.servlet.FilterConfig filterConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        javax.servlet.ServletRequest servletRequest1 = null;
        javax.servlet.ServletResponse servletResponse2 = null;
        javax.servlet.FilterChain filterChain3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest1, servletResponse2, filterChain3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet2 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet2.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet3.getServletConfig();
        java.lang.String str8 = miniProfilerServlet3.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass4 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest3, servletResponse4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet2 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet2.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet2.getServletConfig();
        java.lang.String str5 = miniProfilerServlet2.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass5 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("");
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
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet3.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        java.lang.String str9 = miniProfilerServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass2 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        java.lang.Class<?> wildcardClass5 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        java.lang.String str5 = miniProfilerServlet3.getServletInfo();
        java.lang.String str6 = miniProfilerServlet3.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet3.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext2 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet2 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet2.destroy();
        miniProfilerServlet2.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        java.lang.String str6 = miniProfilerServlet3.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet3.getServletConfig();
        java.lang.String str8 = miniProfilerServlet3.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
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
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        java.lang.Class<?> wildcardClass1 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass1);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
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
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet3.getServletConfig();
        java.lang.String str5 = miniProfilerServlet3.getServletInfo();
        miniProfilerServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
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
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass3 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        javax.servlet.FilterChain filterChain5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest3, servletResponse4, filterChain5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("_mprid_");
        java.lang.Class<?> wildcardClass2 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        miniProfilerServlet5.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
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
            miniProfilerServlet0.log("", throwable9);
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
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
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
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
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
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
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
        java.lang.Class<?> wildcardClass16 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        java.lang.String str5 = miniProfilerServlet3.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet3.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
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
            java.lang.String str10 = miniProfilerServlet0.getServletName();
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
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
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
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass3 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        miniProfilerServlet4.destroy();
        miniProfilerServlet4.init();
        java.lang.String str12 = miniProfilerServlet4.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        javax.servlet.ServletRequest servletRequest3 = null;
        javax.servlet.ServletResponse servletResponse4 = null;
        javax.servlet.FilterChain filterChain5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.doFilter(servletRequest3, servletResponse4, filterChain5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("");
        java.lang.Class<?> wildcardClass5 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass6 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        java.lang.Class<?> wildcardClass2 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("_mprid_", strMap2);
        java.lang.Class<?> wildcardClass4 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        java.lang.String str9 = miniProfilerServlet4.getServletInfo();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet4.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile_includes");
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass7 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
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
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("");
        java.lang.Class<?> wildcardClass2 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
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
        java.lang.Class<?> wildcardClass22 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str21, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        java.lang.String str11 = miniProfilerServlet8.getServletInfo();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
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
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
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
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable11);
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
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet8.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
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
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
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
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
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
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
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
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
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
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
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
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
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
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap17);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("");
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
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        java.lang.String str8 = miniProfilerServlet5.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.destroy();
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
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration6 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet3.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        java.lang.Class<?> wildcardClass7 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("_mprid_");
        java.lang.Class<?> wildcardClass7 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass5 = servletConfig4.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
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
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
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
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
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
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletRequest servletRequest2 = null;
        javax.servlet.ServletResponse servletResponse3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest2, servletResponse3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass2 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        step1.close();
        step1.close();
        java.lang.Class<?> wildcardClass4 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
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
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
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
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
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
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass4 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass3 = servletConfig2.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration1 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
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
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
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
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        javax.servlet.FilterConfig filterConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig10);
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
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet2 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet2.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet2.getServletConfig();
        miniProfilerServlet2.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
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
            javax.servlet.ServletContext servletContext11 = miniProfilerServlet0.getServletContext();
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
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
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
        miniProfilerServlet7.destroy();
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
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
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
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
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
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("");
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
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
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
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
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
            java.lang.String str9 = miniProfilerServlet0.getServletName();
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
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext2 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
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
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet10.getServletConfig();
        java.lang.String str15 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.init();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet10.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig18);
        org.junit.Assert.assertNull(servletConfig19);
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
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
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet11.getServletConfig();
        java.lang.String str16 = miniProfilerServlet11.getServletInfo();
        miniProfilerServlet11.init();
        miniProfilerServlet11.init();
        miniProfilerServlet11.init();
        java.lang.String str20 = miniProfilerServlet11.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        javax.servlet.FilterConfig filterConfig7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass4 = servletConfig3.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("hi!", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("_mprid_", strMap8);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        javax.servlet.FilterConfig filterConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet7.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile");
        java.lang.Class<?> wildcardClass11 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
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
        miniProfilerServlet13.destroy();
        java.lang.String str15 = miniProfilerServlet13.getServletInfo();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.destroy();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig16);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
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
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        step1.close();
        java.lang.Class<?> wildcardClass3 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
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
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet3 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet3.getServletConfig();
        java.lang.String str8 = miniProfilerServlet3.getServletInfo();
        miniProfilerServlet3.init();
        miniProfilerServlet3.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet3.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet3.getServletConfig();
        miniProfilerServlet3.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet5.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
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
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
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
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration3 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass5 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass4 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration4 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
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
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
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
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
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
            javax.servlet.ServletContext servletContext11 = miniProfilerServlet0.getServletContext();
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
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext3 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
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
        miniProfilerServlet13.destroy();
        java.lang.String str15 = miniProfilerServlet13.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
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
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
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
            miniProfilerServlet0.log("hi!", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
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
            java.lang.String str9 = miniProfilerServlet0.getServletName();
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
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
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
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet10.getServletConfig();
        java.lang.String str15 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        java.lang.String str19 = miniProfilerServlet10.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
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
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap8);
        java.lang.Class<?> wildcardClass10 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
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
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass7 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
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
            java.lang.String str12 = miniProfilerServlet0.getServletName();
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
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("");
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
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
}

