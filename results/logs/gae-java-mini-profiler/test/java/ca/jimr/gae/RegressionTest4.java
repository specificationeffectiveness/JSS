package ca.jimr.gae;

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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.destroy();
        java.lang.String str12 = miniProfilerServlet7.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.init();
        java.lang.String str13 = miniProfilerServlet8.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
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
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
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
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile", strMap26);
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
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable10);
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
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.destroy();
        java.lang.String str12 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet9.getServletConfig();
        java.lang.String str14 = miniProfilerServlet9.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
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
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
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
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass12 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.destroy();
        java.lang.String str16 = miniProfilerServlet8.getServletInfo();
        java.lang.String str17 = miniProfilerServlet8.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
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
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable11);
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
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet11.getServletConfig();
        java.lang.String str13 = miniProfilerServlet11.getServletInfo();
        miniProfilerServlet11.init();
        java.lang.String str15 = miniProfilerServlet11.getServletInfo();
        miniProfilerServlet11.destroy();
        miniProfilerServlet11.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        java.lang.String str13 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet8.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext6 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
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
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("");
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
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet13.destroy();
        java.lang.String str15 = miniProfilerServlet13.getServletInfo();
        miniProfilerServlet13.destroy();
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet8.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
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
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("hi!", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap14);
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
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
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
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
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
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
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
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet8.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("_mprid_");
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
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable10);
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
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
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
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
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
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
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
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap26);
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
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
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
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass11 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
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
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
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
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
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
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
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
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
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
        boolean boolean16 = miniProfilerFilter0.shouldProfile("hi!");
        java.lang.Class<?> wildcardClass17 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
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
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
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
            miniProfilerServlet0.log("");
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
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        javax.servlet.FilterConfig filterConfig20 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig20);
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
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
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
        java.lang.Class<?> wildcardClass17 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.destroy();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile_request_id");
        step1.close();
        java.lang.Class<?> wildcardClass3 = step1.getClass();
        org.junit.Assert.assertNotNull(step1);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
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
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet15 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet15.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet15.getServletConfig();
        miniProfilerServlet15.init();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet15.getServletConfig();
        miniProfilerServlet15.init();
        java.lang.String str21 = miniProfilerServlet15.getServletInfo();
        miniProfilerServlet15.destroy();
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertNull(servletConfig19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        javax.servlet.FilterConfig filterConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("hi!", strMap11);
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
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        java.lang.String str10 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        miniProfilerServlet5.init();
        java.lang.String str13 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet5.getServletConfig();
        java.lang.String str16 = miniProfilerServlet5.getServletInfo();
        java.lang.String str17 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
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
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable4 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
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
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        boolean boolean16 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        java.lang.Class<?> wildcardClass17 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet10.getServletConfig();
        java.lang.String str12 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.destroy();
        java.lang.String str14 = miniProfilerServlet10.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet10.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig16);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("_mprid_");
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
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
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
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id");
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
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("");
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
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.init();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
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
            javax.servlet.ServletContext servletContext15 = miniProfilerServlet0.getServletContext();
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
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
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
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.lang.Class<?> wildcardClass19 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.init();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        java.lang.String str10 = miniProfilerServlet7.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        java.lang.String str12 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet7.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        boolean boolean16 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
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
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
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
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
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
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
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
        java.lang.Class<?> wildcardClass22 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        java.lang.Class<?> wildcardClass14 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet6.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
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
        miniProfilerServlet7.destroy();
        java.lang.String str13 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.init();
        java.lang.String str16 = miniProfilerServlet7.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        boolean boolean16 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean18 = miniProfilerFilter0.shouldProfile("_mprid_");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
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
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
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
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet8.getServletConfig();
        java.lang.String str12 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
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
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext4 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        java.lang.String str8 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.destroy();
        miniProfilerServlet5.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet5.getServletConfig();
        miniProfilerServlet5.init();
        java.lang.String str14 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
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
            javax.servlet.ServletContext servletContext9 = miniProfilerServlet0.getServletContext();
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
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
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
            miniProfilerServlet0.log("mini_profile_request_id", throwable11);
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
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
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
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("");
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
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
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
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable13);
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
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id");
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
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
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
            java.util.Enumeration enumeration9 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
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
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getServletName();
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
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet10.getServletConfig();
        java.lang.String str15 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.init();
        miniProfilerServlet10.init();
        java.lang.String str18 = miniProfilerServlet10.getServletInfo();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.init();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig23 = miniProfilerServlet10.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(servletConfig23);
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Class<?> wildcardClass8 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
            java.lang.String str9 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
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
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
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
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        java.lang.String str11 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", throwable13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.destroy();
        java.lang.String str8 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet6.getServletConfig();
        java.lang.String str10 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.destroy();
        miniProfilerServlet6.destroy();
        java.lang.String str14 = miniProfilerServlet6.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet6.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
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
            miniProfilerServlet0.log("mini_profile_includes");
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
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.destroy();
        java.lang.String str11 = miniProfilerServlet7.getServletInfo();
        java.lang.String str12 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("", strMap14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet9.getServletConfig();
        java.lang.String str14 = miniProfilerServlet9.getServletInfo();
        java.lang.String str15 = miniProfilerServlet9.getServletInfo();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNull(servletConfig16);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet9.getServletConfig();
        java.lang.String str14 = miniProfilerServlet9.getServletInfo();
        miniProfilerServlet9.init();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.init();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet9.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertNull(servletConfig19);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
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
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile");
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
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass11 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_id", throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
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
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet11 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.init();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet11.getServletConfig();
        miniProfilerServlet11.destroy();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig17);
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
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
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
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
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
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
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable13);
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
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        boolean boolean19 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.FilterConfig filterConfig20 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig20);
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
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
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
        java.lang.Throwable throwable13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable13);
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
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
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
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
            java.lang.String str11 = miniProfilerServlet0.getServletName();
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
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
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
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean15 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("_mprid_");
        javax.servlet.FilterConfig filterConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
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
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap14);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
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
            java.lang.String str9 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
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
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("_mprid_", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("", strMap17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = null;
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("_mprid_", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet7.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet7.getServletConfig();
        miniProfilerServlet7.init();
        miniProfilerServlet7.destroy();
        java.lang.String str13 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        java.lang.String str15 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.init();
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
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
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
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
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
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
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
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
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
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile", strMap26);
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
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass13 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass6 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass10 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("", throwable11);
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
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
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
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet13 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet13.destroy();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet13.getServletConfig();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet13.getServletConfig();
        miniProfilerServlet13.init();
        java.lang.String str18 = miniProfilerServlet13.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("_mprid_", strMap14);
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
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
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
        miniProfilerServlet7.destroy();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet7.getServletConfig();
        java.lang.String str12 = miniProfilerServlet7.getServletInfo();
        java.lang.String str13 = miniProfilerServlet7.getServletInfo();
        java.lang.String str14 = miniProfilerServlet7.getServletInfo();
        java.lang.String str15 = miniProfilerServlet7.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable10);
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
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
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
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig20 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig20);
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
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
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
            miniProfilerServlet0.log("mini_profile_request_%s");
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
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        ca.jimr.gae.profiler.MiniProfiler.Step step1 = ca.jimr.gae.profiler.MiniProfiler.step("mini_profile");
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
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet5.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet5.getServletConfig();
        java.lang.String str8 = miniProfilerServlet5.getServletInfo();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
        miniProfilerServlet5.init();
        java.lang.String str11 = miniProfilerServlet5.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
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
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("X-Mini-Profile-Request-Id", strMap8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
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
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
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
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable12);
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
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet5 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet5.getServletConfig();
        java.lang.String str7 = miniProfilerServlet5.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet5.getServletConfig();
        java.lang.String str9 = miniProfilerServlet5.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
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
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean14 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        boolean boolean16 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = null;
        java.lang.String str30 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap29);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("mini_profile");
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
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
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
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
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
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
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
            miniProfilerServlet0.log("mini_profile", throwable11);
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
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes", throwable10);
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
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
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
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("", strMap14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str3, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str6, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
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
            java.lang.String str13 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
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
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration12 = miniProfilerServlet0.getInitParameterNames();
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
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
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
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!", throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.destroy();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.destroy();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet10 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.destroy();
        java.lang.String str13 = miniProfilerServlet10.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
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
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet9.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.Throwable throwable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("hi!", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("hi!", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap11);
        java.lang.Class<?> wildcardClass13 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig12);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
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
            miniProfilerServlet0.log("mini_profile");
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
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
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
            java.util.Enumeration enumeration11 = miniProfilerServlet0.getInitParameterNames();
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
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.Class<?> wildcardClass9 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        miniProfilerServlet10.init();
        javax.servlet.ServletConfig servletConfig21 = miniProfilerServlet10.getServletConfig();
        javax.servlet.ServletConfig servletConfig22 = miniProfilerServlet10.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(servletConfig21);
        org.junit.Assert.assertNull(servletConfig22);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile", throwable14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet6 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet6.getServletConfig();
        java.lang.String str11 = miniProfilerServlet6.getServletInfo();
        miniProfilerServlet6.init();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet6.getServletConfig();
        miniProfilerServlet6.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet6.getServletConfig();
        java.lang.String str17 = miniProfilerServlet6.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
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
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        miniProfilerFilter0.destroy();
        boolean boolean7 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("");
        boolean boolean11 = miniProfilerFilter0.shouldProfile("hi!");
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
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
            miniProfilerServlet0.log("", throwable14);
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
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
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
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration10 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        java.lang.String str1 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
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
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("mini_profile_request_%s");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("hi!");
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
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
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
        miniProfilerServlet0.init();
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
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean10 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean12 = miniProfilerFilter0.shouldProfile("hi!");
        javax.servlet.FilterConfig filterConfig13 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = miniProfilerServlet0.getInitParameter("mini_profile");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("", strMap26);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str27, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet4 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet4.getServletConfig();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet4.getServletConfig();
        miniProfilerServlet4.init();
        miniProfilerServlet4.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration5 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        java.lang.String str10 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.destroy();
        java.lang.String str12 = miniProfilerServlet8.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        miniProfilerServlet8.destroy();
        java.lang.String str16 = miniProfilerServlet8.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
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
        java.lang.Throwable throwable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_", throwable14);
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
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        java.lang.Class<?> wildcardClass10 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile", strMap23);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        java.lang.String str27 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap26);
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
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.init();
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
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean9 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("X-Mini-Profile-Request-Id");
        miniProfilerFilter0.destroy();
        boolean boolean11 = miniProfilerFilter0.shouldProfile("");
        boolean boolean13 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
            java.lang.String str11 = miniProfilerServlet0.getServletName();
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
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        javax.servlet.FilterConfig filterConfig12 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig12);
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
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap23);
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
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
        boolean boolean10 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        boolean boolean17 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
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
        java.lang.String str24 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap23);
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
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
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
        java.lang.Class<?> wildcardClass13 = miniProfilerServlet0.getClass();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
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
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = miniProfilerServlet0.getInitParameter("mini_profile");
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
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("X-Mini-Profile-Request-Id");
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
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext5 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
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
            java.lang.String str8 = miniProfilerServlet0.getServletName();
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
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
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
        java.lang.String str12 = miniProfilerServlet10.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet10.getServletConfig();
        java.lang.String str14 = miniProfilerServlet10.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet10.getServletConfig();
        miniProfilerServlet10.destroy();
        miniProfilerServlet10.destroy();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet10.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertNull(servletConfig18);
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
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
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
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
        javax.servlet.ServletRequest servletRequest15 = null;
        javax.servlet.ServletResponse servletResponse16 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.service(servletRequest15, servletResponse16);
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
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertNull(servletConfig13);
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext8 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet17 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet17.init();
        javax.servlet.ServletConfig servletConfig19 = miniProfilerServlet17.getServletConfig();
        miniProfilerServlet17.init();
        javax.servlet.ServletConfig servletConfig21 = miniProfilerServlet17.getServletConfig();
        java.lang.String str22 = miniProfilerServlet17.getServletInfo();
        miniProfilerServlet17.init();
        miniProfilerServlet17.init();
        javax.servlet.ServletConfig servletConfig25 = miniProfilerServlet17.getServletConfig();
        javax.servlet.ServletConfig servletConfig26 = miniProfilerServlet17.getServletConfig();
        miniProfilerServlet17.init();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init((javax.servlet.ServletConfig) miniProfilerServlet17);
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
        org.junit.Assert.assertNull(servletConfig19);
        org.junit.Assert.assertNull(servletConfig21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNull(servletConfig25);
        org.junit.Assert.assertNull(servletConfig26);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet9 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet9.getServletConfig();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet9.getServletConfig();
        miniProfilerServlet9.destroy();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig11);
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
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
            java.lang.String str10 = miniProfilerServlet0.getInitParameter("_mprid_");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
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
        java.lang.String str21 = miniProfilerResourceLoader0.getResource("mini_profile", strMap20);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str15, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n" + "'", str18, "jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("jquery.tmpl.min.js\njquery-1.6.2.min.js\nmini_profiler.css\nmini_profiler.html\nmini_profiler.js\nMiniProfilerResourceLoader.class\n", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("hi!", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("_mprid_", strMap14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        java.lang.String str18 = miniProfilerResourceLoader0.getResource("mini_profile_request_id", strMap17);
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
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        java.lang.String str8 = miniProfilerServlet0.getServletInfo();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("X-Mini-Profile-Request-Id", throwable10);
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
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        java.lang.String str12 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
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
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
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
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext12 = miniProfilerServlet0.getServletContext();
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
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = miniProfilerServlet0.getServletName();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertNull(servletConfig7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext7 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
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
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet7 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet7.destroy();
        java.lang.String str9 = miniProfilerServlet7.getServletInfo();
        miniProfilerServlet7.destroy();
        miniProfilerServlet7.init();
        miniProfilerServlet7.init();
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
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader miniProfilerResourceLoader0 = new ca.jimr.gae.profiler.resources.MiniProfilerResourceLoader();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = null;
        java.lang.String str3 = miniProfilerResourceLoader0.getResource("hi!", strMap2);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = null;
        java.lang.String str6 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        java.lang.String str9 = miniProfilerResourceLoader0.getResource("mini_profile_includes", strMap8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = null;
        java.lang.String str12 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        java.lang.String str15 = miniProfilerResourceLoader0.getResource("mini_profile_request_%s", strMap14);
        java.lang.Class<?> wildcardClass16 = miniProfilerResourceLoader0.getClass();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
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
        // The following exception was thrown during execution in test generation
        try {
            javax.servlet.ServletContext servletContext10 = miniProfilerServlet0.getServletContext();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig9);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        boolean boolean3 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean5 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean7 = miniProfilerFilter0.shouldProfile("mini_profile_request_%s");
        boolean boolean9 = miniProfilerFilter0.shouldProfile("_mprid_");
        miniProfilerFilter0.destroy();
        boolean boolean12 = miniProfilerFilter0.shouldProfile("hi!");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig7 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig7);
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = miniProfilerServlet0.getInitParameter("");
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
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.init();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
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
        java.lang.String str10 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig11 = miniProfilerServlet0.getServletConfig();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet12 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet12.destroy();
        java.lang.String str14 = miniProfilerServlet12.getServletInfo();
        javax.servlet.ServletConfig servletConfig15 = miniProfilerServlet12.getServletConfig();
        java.lang.String str16 = miniProfilerServlet12.getServletInfo();
        miniProfilerServlet12.init();
        java.lang.String str18 = miniProfilerServlet12.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNull(servletConfig15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str6 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig8 = miniProfilerServlet0.getServletConfig();
        java.lang.String str9 = miniProfilerServlet0.getServletInfo();
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(servletConfig8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
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
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = miniProfilerServlet0.getServletName();
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
    public void test2472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2472");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test2473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2473");
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
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        java.lang.String str13 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig17 = miniProfilerServlet8.getServletConfig();
        java.lang.String str18 = miniProfilerServlet8.getServletInfo();
        java.lang.String str19 = miniProfilerServlet8.getServletInfo();
        javax.servlet.ServletConfig servletConfig20 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig23 = miniProfilerServlet8.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertNull(servletConfig17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(servletConfig20);
        org.junit.Assert.assertNull(servletConfig23);
    }

    @Test
    public void test2474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2474");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("");
        boolean boolean4 = miniProfilerFilter0.shouldProfile("hi!");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
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
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test2475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2475");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet14 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet14.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet14.getServletConfig();
        java.lang.String str17 = miniProfilerServlet14.getServletInfo();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet14.getServletConfig();
        java.lang.String str19 = miniProfilerServlet14.getServletInfo();
        miniProfilerServlet14.destroy();
        javax.servlet.ServletConfig servletConfig21 = miniProfilerServlet14.getServletConfig();
        miniProfilerServlet14.init();
        miniProfilerServlet14.destroy();
        java.lang.String str24 = miniProfilerServlet14.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(servletConfig18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(servletConfig21);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test2476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2476");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test2477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2477");
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
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet12 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet12.getServletConfig();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet12.getServletConfig();
        miniProfilerServlet12.init();
        miniProfilerServlet12.destroy();
        miniProfilerServlet12.init();
        javax.servlet.ServletConfig servletConfig20 = miniProfilerServlet12.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(servletConfig11);
        org.junit.Assert.assertNull(servletConfig14);
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertNull(servletConfig20);
    }

    @Test
    public void test2478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2478");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_includes");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2479");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.init();
        java.lang.Throwable throwable10 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2480");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean4 = miniProfilerFilter0.shouldProfile("mini_profile_includes");
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
        miniProfilerFilter0.destroy();
        java.lang.Class<?> wildcardClass8 = miniProfilerFilter0.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test2481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2481");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig6);
    }

    @Test
    public void test2482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2482");
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
    public void test2483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2483");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean6 = miniProfilerFilter0.shouldProfile("mini_profile");
        boolean boolean8 = miniProfilerFilter0.shouldProfile("mini_profile_request_id");
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
    public void test2484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2484");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("_mprid_");
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
    public void test2485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2485");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2486");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig3 = miniProfilerServlet0.getServletConfig();
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
        org.junit.Assert.assertNull(servletConfig3);
        org.junit.Assert.assertNull(servletConfig4);
    }

    @Test
    public void test2487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2487");
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
        javax.servlet.FilterConfig filterConfig15 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerFilter0.init(filterConfig15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test2488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2488");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.init();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
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
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2489");
        ca.jimr.gae.profiler.MiniProfilerFilter miniProfilerFilter0 = new ca.jimr.gae.profiler.MiniProfilerFilter();
        boolean boolean2 = miniProfilerFilter0.shouldProfile("mini_profile");
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        miniProfilerFilter0.destroy();
        boolean boolean8 = miniProfilerFilter0.shouldProfile("_mprid_");
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
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test2490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2490");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig1 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig4 = miniProfilerServlet0.getServletConfig();
        java.lang.String str5 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        java.lang.String str7 = miniProfilerServlet0.getServletInfo();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig12 = miniProfilerServlet8.getServletConfig();
        java.lang.String str13 = miniProfilerServlet8.getServletInfo();
        miniProfilerServlet8.init();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig16 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.init();
        javax.servlet.ServletConfig servletConfig18 = miniProfilerServlet8.getServletConfig();
        java.lang.String str19 = miniProfilerServlet8.getServletInfo();
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
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertNull(servletConfig12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(servletConfig16);
        org.junit.Assert.assertNull(servletConfig18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2491");
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
            java.util.Enumeration enumeration12 = miniProfilerServlet0.getInitParameterNames();
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
    public void test2492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2492");
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
            java.util.Enumeration enumeration8 = miniProfilerServlet0.getInitParameterNames();
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
    public void test2493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2493");
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
            miniProfilerServlet0.log("mini_profile");
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
    public void test2494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2494");
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
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2495");
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
        java.lang.Throwable throwable11 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.log("mini_profile_request_%s", throwable11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(servletConfig5);
    }

    @Test
    public void test2496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2496");
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
            javax.servlet.ServletContext servletContext11 = miniProfilerServlet0.getServletContext();
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
    public void test2497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2497");
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
            miniProfilerServlet0.log("");
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
    public void test2498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2498");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
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
    public void test2499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2499");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.init();
        javax.servlet.ServletConfig servletConfig2 = miniProfilerServlet0.getServletConfig();
        java.lang.String str3 = miniProfilerServlet0.getServletInfo();
        java.lang.String str4 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.init();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet8 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        javax.servlet.ServletConfig servletConfig9 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig10 = miniProfilerServlet8.getServletConfig();
        miniProfilerServlet8.destroy();
        java.lang.String str12 = miniProfilerServlet8.getServletInfo();
        javax.servlet.ServletConfig servletConfig13 = miniProfilerServlet8.getServletConfig();
        javax.servlet.ServletConfig servletConfig14 = miniProfilerServlet8.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            miniProfilerServlet0.init(servletConfig14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(servletConfig2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNull(servletConfig9);
        org.junit.Assert.assertNull(servletConfig10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNull(servletConfig13);
        org.junit.Assert.assertNull(servletConfig14);
    }

    @Test
    public void test2500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2500");
        ca.jimr.gae.profiler.MiniProfilerServlet miniProfilerServlet0 = new ca.jimr.gae.profiler.MiniProfilerServlet();
        miniProfilerServlet0.destroy();
        java.lang.String str2 = miniProfilerServlet0.getServletInfo();
        miniProfilerServlet0.destroy();
        miniProfilerServlet0.destroy();
        javax.servlet.ServletConfig servletConfig5 = miniProfilerServlet0.getServletConfig();
        javax.servlet.ServletConfig servletConfig6 = miniProfilerServlet0.getServletConfig();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Enumeration enumeration7 = miniProfilerServlet0.getInitParameterNames();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: ServletConfig has not been initialized");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNull(servletConfig5);
        org.junit.Assert.assertNull(servletConfig6);
    }
}

