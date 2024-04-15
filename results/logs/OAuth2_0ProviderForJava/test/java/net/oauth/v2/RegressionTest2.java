package net.oauth.v2;

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
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("assertion");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1002");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("access_denied");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("none=UTF-8", (java.lang.Throwable) oAuth2ProblemException2);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = oAuth2ProblemException2.getParameters();
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1003");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        net.oauth.v2.OAuth2Message oAuth2Message3 = new net.oauth.v2.OAuth2Message("redirect_uri", "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", parameterCollection2);
    }

    @Test
    public void test1004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1004");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        oAuth2Client3.setProperty("authorization_code", (java.lang.Object) oAuth2Exception14);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str18 = oAuth2Accessor17.expires_in;
        java.lang.String str19 = oAuth2Accessor17.state;
        oAuth2Accessor17.tokenType = "net.oauth.v2.OAuth2ProblemException: Location";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1005");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        oAuth2Accessor7.setProperty("invalid_scope", (java.lang.Object) parameterList17);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test1006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1006");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.String str8 = oAuth2Accessor6.refreshToken;
        java.lang.String str9 = oAuth2Accessor6.code;
        java.lang.String str10 = oAuth2Accessor6.code;
        java.lang.String str11 = oAuth2Accessor6.tokenType;
        oAuth2Accessor1.setProperty("error", (java.lang.Object) str11);
        java.lang.String str13 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1007");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1008");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("OAuth2Message(hi!, , [])", "code");
        java.lang.String str4 = parameter2.setValue("null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "code" + "'", str4, "code");
    }

    @Test
    public void test1009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1009");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("error_uri");
        oAuth2Accessor1.expires_in = "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1010");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getValue();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message9.getParameters();
        java.lang.String str11 = oAuth2Message9.getCode();
        boolean boolean12 = parameter2.equals((java.lang.Object) str11);
        java.lang.String str13 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
    }

    @Test
    public void test1011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1011");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1012");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
    }

    @Test
    public void test1013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1013");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream9);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1014");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str13 = oAuth2Message5.getHeader("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1015");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        oAuth2Message5.method = "POST";
        java.lang.String str14 = oAuth2Message5.getParameter("state");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1016");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_client\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null  realm=\"invalid_client\"" + "'", str6, "null  realm=\"invalid_client\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1017");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("null  realm=\"\"");
        java.lang.String str6 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme=null%20%20realm%3D%22%22" + "'", str6, "Authorization-Schesme=null%20%20realm%3D%22%22");
    }

    @Test
    public void test1018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1018");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        oAuth2Message5.method = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str10 = oAuth2Message5.getClientId();
        java.lang.String str12 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer\"" + "'", str12, "null  realm=\"net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer\"");
    }

    @Test
    public void test1019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1019");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1020");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str11, "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1021");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("password");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1022");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        java.lang.String str20 = oAuth2Message12.getCode();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1023");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("application%252Fx-www-form-urlencoded");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 112, 112, 108, 105, 99, 97, 116, 105, 111, 110, 37, 50, 53, 50, 70, 120, 45, 119, 119, 119, 45, 102, 111, 114, 109, 45, 117, 114, 108, 101, 110, 99, 111, 100, 101, 100]");
    }

    @Test
    public void test1024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1024");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.String str8 = oAuth2Accessor6.refreshToken;
        java.lang.String str9 = oAuth2Accessor6.code;
        java.lang.String str10 = oAuth2Accessor6.code;
        java.lang.String str11 = oAuth2Accessor6.tokenType;
        oAuth2Accessor1.setProperty("error", (java.lang.Object) str11);
        oAuth2Accessor1.scope = "OAuth2Message(hi!, , [])";
        java.lang.String str15 = oAuth2Accessor1.accessToken;
        java.lang.String str16 = oAuth2Accessor1.refreshToken;
        java.lang.String str17 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1025");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"code_and_token\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22code_and_token%22" + "'", str1, "null%20%20realm%3D%22code_and_token%22");
    }

    @Test
    public void test1026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1026");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "null  realm=\"\"";
        java.lang.String str8 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Client oAuth2Client9 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(oAuth2Client9);
    }

    @Test
    public void test1027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1027");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null%20%20realm%3D%22invalid_token%22=expires_in");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1028");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("access_denied");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1029");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.refreshToken = "username";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1030");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("access_denied");
    }

    @Test
    public void test1031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1031");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Accessor10.expires_in;
        java.lang.String str12 = oAuth2Accessor10.refreshToken;
        oAuth2Accessor10.refreshToken = "client_credentials";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1032");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("state");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[115, 116, 97, 116, 101]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "state" + "'", str2, "state");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "state" + "'", str3, "state");
    }

    @Test
    public void test1033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1033");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.code;
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception12);
        oAuth2Accessor1.setProperty("OAuth2Message(hi!, , [])", (java.lang.Object) oAuth2Exception13);
        java.lang.Throwable[] throwableArray15 = oAuth2Exception13.getSuppressed();
        java.lang.Throwable[] throwableArray16 = oAuth2Exception13.getSuppressed();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test1034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1034");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
    }

    @Test
    public void test1035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1035");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.Object obj15 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        net.oauth.v2.OAuth2Client oAuth2Client20 = new net.oauth.v2.OAuth2Client("state", "net.oauth.v2.OAuth2Exception", "HTTP response");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client20);
        oAuth2Client3.setProperty("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", (java.lang.Object) oAuth2Accessor21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1036");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream14 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream14);
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1037");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("access_denied");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("none=UTF-8", (java.lang.Throwable) oAuth2ProblemException2);
        java.lang.String str5 = oAuth2ProblemException2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2ProblemException: access_denied" + "'", str5, "net.oauth.v2.OAuth2ProblemException: access_denied");
    }

    @Test
    public void test1038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1038");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        java.lang.Class<?> wildcardClass5 = oAuth2Client3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str4, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1039");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.getClientId();
        java.lang.String str14 = oAuth2Message5.getClientId();
        java.lang.String str16 = oAuth2Message5.getParameter("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1040");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", "null  realm=\"code_and_token\"", "net.oauth.v2.OAuth2Exception: HTTP request");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        oAuth2Accessor4.expires_in = "net.oauth.v2.OAuth2Exception: ";
        java.lang.String str7 = oAuth2Accessor4.tokenType;
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1041");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = oAuth2ProblemException8.getParameters();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        int int15 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = oAuth2ProblemException8.getParameters();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message22 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.lang.String str23 = oAuth2Message22.method;
        java.lang.String str24 = oAuth2Message22.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = oAuth2Message22.getParameterMap();
        java.lang.String str26 = oAuth2Message22.URL;
        oAuth2ProblemException8.setParameter("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message22);
        java.lang.String str28 = oAuth2Message22.toString();
        java.lang.Class<?> wildcardClass29 = oAuth2Message22.getClass();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "refresh_token" + "'", str23, "refresh_token");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str24, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "application/x-www-form-urlencoded" + "'", str26, "application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str28, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(wildcardClass29);
    }

    @Test
    public void test1042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1042");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2Accessor1.setProperty("response_type", (java.lang.Object) strMap17);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        oAuth2Accessor1.setProperty("invalid_token", (java.lang.Object) parameterList21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test1043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1043");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1044");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        int int6 = oAuth2ProblemException4.getHttpStatusCode();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException4);
        java.lang.String str8 = oAuth2ProblemException4.getProblem();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test1045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1045");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str5, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1046");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.refreshToken;
        java.lang.Object obj9 = oAuth2Accessor1.getProperty("invalid_client");
        java.lang.String str10 = oAuth2Accessor1.code;
        java.lang.String str11 = oAuth2Accessor1.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\n" + "'", str10, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "response_type" + "'", str11, "response_type");
    }

    @Test
    public void test1047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1047");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        oAuth2Message5.URL = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        java.lang.String str11 = oAuth2Message5.URL;
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getParameters();
        java.lang.String str15 = oAuth2Message5.getParameter("null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str11, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1048");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("client_secret");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1049");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strEntryList14);
    }

    @Test
    public void test1050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1050");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray11);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"", strArray11);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1051");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str6 = parameter2.getKey();
        java.lang.String str8 = parameter2.setValue("OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "access_denied" + "'", str8, "access_denied");
    }

    @Test
    public void test1052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1052");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "client_id";
        oAuth2Accessor1.state = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1053");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1054");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        java.lang.String str8 = oAuth2Accessor1.code;
        oAuth2Accessor1.refreshToken = "password";
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1055");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int12 = oAuth2ProblemException11.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException11);
        int int14 = oAuth2ProblemException11.getHttpStatusCode();
        net.oauth.v2.OAuth2.Parameter parameter18 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str19 = parameter18.toString();
        java.lang.String str20 = parameter18.getKey();
        oAuth2ProblemException11.setParameter("\n", (java.lang.Object) str20);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Authorization-Schesme=token_type" + "'", str19, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Authorization-Schesme" + "'", str20, "Authorization-Schesme");
    }

    @Test
    public void test1056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1056");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Client oAuth2Client16 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client18 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client18);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor20 = oAuth2Accessor19.clone();
        oAuth2Client16.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor20);
        java.lang.String str22 = oAuth2Client16.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor23 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        oAuth2Client3.setProperty("application%2Fx-www-form-urlencoded", (java.lang.Object) oAuth2Client16);
        java.lang.String str26 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test1057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1057");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.refreshToken = "HTTP request";
        net.oauth.v2.OAuth2Client oAuth2Client8 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        oAuth2Accessor9.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception16);
        int int18 = oAuth2ProblemException14.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException21 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException21);
        net.oauth.v2.OAuth2Exception oAuth2Exception23 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException21.addSuppressed((java.lang.Throwable) oAuth2Exception23);
        net.oauth.v2.OAuth2Exception oAuth2Exception25 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception23);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        int int29 = oAuth2ProblemException27.getHttpStatusCode();
        oAuth2Exception25.addSuppressed((java.lang.Throwable) oAuth2ProblemException27);
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2ProblemException27);
        oAuth2Accessor9.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException14);
        oAuth2Accessor9.expires_in = "null  realm=\"redirect_uri_mismatch\"";
        oAuth2Accessor1.setProperty("username", (java.lang.Object) "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
    }

    @Test
    public void test1058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1058");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("unsupported_response_type", "null  realm=\"client_id\"", "access_denied");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_response_type" + "'", str4, "unsupported_response_type");
    }

    @Test
    public void test1059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1059");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        oAuth2Message5.URL = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        java.lang.String str11 = oAuth2Message5.toString();
        java.lang.String str12 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, OAuth2Message(Authorization-Schesme=token_type, , []), [])" + "'", str11, "OAuth2Message(hi!, OAuth2Message(Authorization-Schesme=token_type, , []), [])");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str12, "OAuth2Message(Authorization-Schesme=token_type, , [])");
    }

    @Test
    public void test1060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1060");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("client_id");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "client_id" + "'", str3, "client_id");
    }

    @Test
    public void test1061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1061");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        java.lang.String str8 = oAuth2Accessor1.state;
        net.oauth.v2.OAuth2Client oAuth2Client9 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(oAuth2Client9);
    }

    @Test
    public void test1062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1062");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.toString();
        java.lang.String str11 = oAuth2Message5.method;
        java.lang.String str12 = oAuth2Message5.toString();
        oAuth2Message5.URL = "Authorization-Schesme=error";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str10, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1063");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("2.0");
        oAuth2Accessor1.accessToken = "client_id";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1064");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.tokenType = "code_and_token";
        java.lang.String str13 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1065");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        int int3 = oAuth2ProblemException0.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        int int9 = oAuth2ProblemException5.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        int int20 = oAuth2ProblemException18.getHttpStatusCode();
        oAuth2Exception16.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        int int23 = oAuth2ProblemException18.getHttpStatusCode();
        java.lang.String str24 = oAuth2ProblemException18.getProblem();
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = oAuth2ProblemException18.getParameters();
        java.lang.String str27 = oAuth2ProblemException18.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str27, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1066");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        oAuth2Accessor5.expires_in = "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
    }

    @Test
    public void test1067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1067");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("scope", "PUT");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PUT" + "'", str3, "PUT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PUT" + "'", str4, "PUT");
    }

    @Test
    public void test1068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1068");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "invalid_request");
        java.lang.Object obj5 = oAuth2Client3.getProperty("null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1069");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%3Fnet.oauth.v2.OAuth2Exception%3DHTTP%2520status" + "'", str1, "null%20%20realm%3D%22Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%3Fnet.oauth.v2.OAuth2Exception%3DHTTP%2520status");
    }

    @Test
    public void test1070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1070");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1071");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
    }

    @Test
    public void test1072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1072");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "Authorization-Schesme=token_type");
    }

    @Test
    public void test1073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1073");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str10 = oAuth2Message5.toString();
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str10, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1074");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        java.lang.String str11 = oAuth2Accessor1.code;
        java.lang.String str12 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1075");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.Object obj6 = null;
        boolean boolean7 = parameter2.equals(obj6);
        java.lang.String str8 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
    }

    @Test
    public void test1076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1076");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2.Parameter parameter6 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str7 = parameter6.toString();
        java.lang.String str9 = parameter6.setValue("none");
        net.oauth.v2.OAuth2Client oAuth2Client10 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client10);
        java.lang.String str12 = oAuth2Accessor11.tokenType;
        oAuth2Accessor11.tokenType = "response_type";
        oAuth2Accessor11.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str18 = oAuth2Accessor11.scope;
        java.lang.String str19 = oAuth2Accessor11.expires_in;
        boolean boolean20 = parameter6.equals((java.lang.Object) oAuth2Accessor11);
        oAuth2ProblemException0.setParameter("username", (java.lang.Object) oAuth2Accessor11);
        java.lang.String[] strArray30 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList31 = net.oauth.v2.OAuth2.newList(strArray30);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList32 = net.oauth.v2.OAuth2.newList(strArray30);
        java.lang.String str33 = net.oauth.v2.OAuth2.addParameters("UTF-8", strArray30);
        oAuth2Accessor11.setProperty("null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) strArray30);
        oAuth2Accessor11.accessToken = "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme=token_type" + "'", str7, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(parameterList31);
        org.junit.Assert.assertNotNull(parameterList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str33, "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1077");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.String str7 = parameter2.setValue("client_secret");
        net.oauth.v2.OAuth2Client oAuth2Client8 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        java.lang.String str10 = oAuth2Accessor9.tokenType;
        java.lang.String str11 = oAuth2Accessor9.refreshToken;
        oAuth2Accessor9.scope = "2.0";
        oAuth2Accessor9.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str16 = oAuth2Accessor9.tokenType;
        oAuth2Accessor9.setProperty("", (java.lang.Object) 10);
        boolean boolean20 = parameter2.equals((java.lang.Object) oAuth2Accessor9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none" + "'", str7, "none");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1078");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("unsupported_grant_type", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1079");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "assertion";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\n" + "'", str7, "\ufffd\n");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1080");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.lang.String str9 = oAuth2Message7.getCode();
        java.lang.String str10 = oAuth2Message7.URL;
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_client" + "'", str10, "invalid_client");
    }

    @Test
    public void test1081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1081");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientSecret;
        java.lang.Object obj15 = oAuth2Client3.getProperty("application%2Fx-www-form-urlencoded");
        java.lang.String str16 = oAuth2Client3.clientId;
        java.lang.String str17 = oAuth2Client3.clientSecret;
        java.lang.Object obj19 = oAuth2Client3.getProperty("URL?Authorization-Schesme=null");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str13, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "token_type" + "'", str16, "token_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str17, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test1082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1082");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("invalid_grant");
    }

    @Test
    public void test1083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1083");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray6);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray6);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray6);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", "error_description", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DELETE" + "'", str8, "DELETE");
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertNotNull(parameterList10);
    }

    @Test
    public void test1084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1084");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2Message15.method = "authorization_code";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message15.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = oAuth2Message15.getParameterMap();
        java.lang.String str21 = oAuth2Message15.getWWWAuthenticateHeader("net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message15.completeParameters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str21, "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1085");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1086");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        oAuth2Message8.method = "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
    }

    @Test
    public void test1087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1087");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1088");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = oAuth2ProblemException8.getParameters();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        int int15 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = oAuth2ProblemException8.getParameters();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message22 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.lang.String str23 = oAuth2Message22.method;
        java.lang.String str24 = oAuth2Message22.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = oAuth2Message22.getParameterMap();
        java.lang.String str26 = oAuth2Message22.URL;
        oAuth2ProblemException8.setParameter("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message22);
        java.lang.String str28 = oAuth2Message22.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = oAuth2Message22.getParameterMap();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "refresh_token" + "'", str23, "refresh_token");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str24, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "application/x-www-form-urlencoded" + "'", str26, "application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str28, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strMap29);
    }

    @Test
    public void test1089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1089");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        oAuth2Client3.setProperty("authorization_code", (java.lang.Object) oAuth2Exception14);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str18 = oAuth2Accessor17.expires_in;
        java.lang.String str19 = oAuth2Accessor17.state;
        oAuth2Accessor17.expires_in = "unsupported_grant_type";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1090");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.state = "password";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1091");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null%20%20realm%3D%22invalid_token%22=POST");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test1092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1092");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream5 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream5);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test1093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1093");
        net.oauth.v2.OAuth2.Parameter parameter4 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str5 = parameter4.toString();
        java.lang.String str6 = parameter4.getKey();
        net.oauth.v2.OAuth2.Parameter parameter9 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str10 = parameter9.getValue();
        java.lang.String str11 = parameter9.getValue();
        net.oauth.v2.OAuth2.Parameter parameter14 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        net.oauth.v2.OAuth2.Parameter[] parameterArray15 = new net.oauth.v2.OAuth2.Parameter[] { parameter4, parameter9, parameter14 };
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList16 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, parameterArray15);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception=HTTP%20status", "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str19 = oAuth2Message18.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "token_type" + "'", str10, "token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(net.oauth.v2.OAuth2Exception=HTTP%20status, OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, []), [Authorization-Schesme=token_type, Authorization-Schesme=token_type, null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29])" + "'", str19, "OAuth2Message(net.oauth.v2.OAuth2Exception=HTTP%20status, OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, []), [Authorization-Schesme=token_type, Authorization-Schesme=token_type, null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29])");
    }

    @Test
    public void test1094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1094");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray5);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_request" + "'", str10, "invalid_request");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test1095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1095");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1096");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.Throwable[] throwableArray3 = oAuth2Exception2.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = oAuth2ProblemException4.getParameters();
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException4.getSuppressed();
        java.lang.Throwable[] throwableArray7 = oAuth2ProblemException4.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException4.getParameters();
        oAuth2Exception2.addSuppressed((java.lang.Throwable) oAuth2ProblemException4);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1097");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1098");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client6);
    }

    @Test
    public void test1099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1099");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        java.lang.String str8 = oAuth2Accessor7.tokenType;
        java.lang.String str9 = oAuth2Accessor7.refreshToken;
        oAuth2Accessor7.scope = "2.0";
        oAuth2Accessor7.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor7.expires_in = "client_credentials";
        oAuth2Accessor1.setProperty("null%20%20realm%3D%22invalid_token%22=POST", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str17 = oAuth2Accessor7.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1100");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.scope = "unsupported_response_type";
        oAuth2Accessor6.expires_in = "GET";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1101");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException();
        java.lang.String str13 = oAuth2ProblemException12.getProblem();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        oAuth2ProblemException12.setParameter("assertion", (java.lang.Object) parameterList16);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = oAuth2ProblemException12.getParameters();
        oAuth2Client3.setProperty("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"", (java.lang.Object) strMap19);
        net.oauth.v2.OAuth2Client oAuth2Client25 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str26 = oAuth2Client25.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = new net.oauth.v2.OAuth2Accessor(oAuth2Client25);
        oAuth2Client3.setProperty("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor27);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "token" + "'", str26, "token");
    }

    @Test
    public void test1102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1102");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.Throwable[] throwableArray2 = oAuth2Exception1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test1103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1103");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1104");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client7 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter12 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str13 = parameter12.toString();
        java.lang.String str15 = parameter12.setValue("access_denied");
        oAuth2Client7.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter12);
        oAuth2ProblemException0.setParameter("state", (java.lang.Object) oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.String str19 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter[] parameterArray25 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList26 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26, parameterArray25);
        net.oauth.v2.OAuth2Message oAuth2Message28 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.lang.String str30 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.lang.String str31 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        net.oauth.v2.OAuth2Message oAuth2Message32 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = oAuth2Message32.getParameterMap();
        oAuth2Client7.setProperty("", (java.lang.Object) oAuth2Message32);
        java.lang.String str36 = oAuth2Message32.getWWWAuthenticateHeader("OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null  realm=\"OAuth2Message%28scope%2C%20DELETE%2C%20%5B%5D%29\"" + "'", str36, "null  realm=\"OAuth2Message%28scope%2C%20DELETE%2C%20%5B%5D%29\"");
    }

    @Test
    public void test1105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1105");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test1106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1106");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("null  realm=\"invalid_token\"");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1107");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test1108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1108");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.OAuth2.ErrorCode;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1109");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "redirect_uri_mismatch";
        oAuth2Accessor1.accessToken = "Authorization-Schesme=error";
        java.lang.String str14 = oAuth2Accessor1.state;
        oAuth2Accessor1.tokenType = "scope";
        java.lang.String str17 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1110");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.BaseResponseType baseResponseType11 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType11);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType11);
        oAuth2Client3.setProperty("Authorization-Schesme", (java.lang.Object) baseResponseType11);
        net.oauth.v2.OAuth2.Parameter[] parameterArray21 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList22 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList22, parameterArray21);
        net.oauth.v2.OAuth2Message oAuth2Message24 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        java.util.Map<java.lang.String, java.lang.String> strMap25 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        oAuth2Client3.setProperty("none=UTF-8", (java.lang.Object) strMap25);
        java.lang.Class<?> wildcardClass27 = oAuth2Client3.getClass();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
        org.junit.Assert.assertNotNull(parameterArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test1111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1111");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getHeaders();
        java.lang.String str12 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1112");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        oAuth2Accessor7.setProperty("invalid_scope", (java.lang.Object) parameterList17);
        net.oauth.v2.OAuth2Client oAuth2Client23 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        oAuth2Accessor7.setProperty("client_secret", (java.lang.Object) "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
    }

    @Test
    public void test1113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1113");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int8 = oAuth2ProblemException7.getHttpStatusCode();
        java.lang.String str9 = oAuth2ProblemException7.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray13 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList14 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, parameterArray13);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        oAuth2ProblemException7.setParameter("code", (java.lang.Object) parameterList14);
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.io.OutputStream outputStream20 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14, outputStream20);
        oAuth2ProblemException1.setParameter("HTTP%20status", (java.lang.Object) parameterList14);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1114");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1115");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("authorization_code", "assertion");
        java.lang.String str3 = parameter2.getKey();
        java.lang.Object obj4 = null;
        boolean boolean5 = parameter2.equals(obj4);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "authorization_code" + "'", str3, "authorization_code");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test1116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1116");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.String str8 = oAuth2Accessor1.code;
        java.lang.String str9 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        oAuth2Accessor1.code = "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList20 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message21 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList20);
        java.lang.String str22 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList20);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = oAuth2Message23.getParameterMap();
        java.lang.String str25 = oAuth2Message23.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList26 = oAuth2Message23.getHeaders();
        oAuth2Accessor1.setProperty("null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message23);
        java.lang.String[] strArray34 = new java.lang.String[] {};
        java.lang.String str35 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray34);
        java.lang.String str36 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray34);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList37 = net.oauth.v2.OAuth2.newList(strArray34);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList38 = net.oauth.v2.OAuth2.newList(strArray34);
        net.oauth.v2.OAuth2Message oAuth2Message39 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        java.lang.String str40 = net.oauth.v2.OAuth2.addParameters("grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        oAuth2Accessor1.setProperty("null  realm=\"unsupported_grant_type\"", (java.lang.Object) str40);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(parameterList20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str25, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        org.junit.Assert.assertNotNull(strEntryList26);
        org.junit.Assert.assertNotNull(strArray34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DELETE" + "'", str36, "DELETE");
        org.junit.Assert.assertNotNull(parameterList37);
        org.junit.Assert.assertNotNull(parameterList38);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "grant_type" + "'", str40, "grant_type");
    }

    @Test
    public void test1117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1117");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str6 = oAuth2Message4.toString();
        java.lang.String str7 = oAuth2Message4.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str6, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str7, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test1118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1118");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("OAuth2Message(Authorization-Schesme=token_type, , [])", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str5 = parameter2.setValue("client_credentials");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str3, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str5, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1119");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor1.client;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client6);
    }

    @Test
    public void test1120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1120");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        int int11 = oAuth2ProblemException9.getHttpStatusCode();
        oAuth2Exception7.addSuppressed((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2.Parameter[] parameterArray16 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList17 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17, parameterArray16);
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.lang.String str21 = oAuth2Message19.getHeader("");
        java.lang.String str22 = oAuth2Message19.URL;
        oAuth2ProblemException9.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str22);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException25 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException25);
        int int27 = oAuth2ProblemException25.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException25.addSuppressed((java.lang.Throwable) oAuth2Exception28);
        java.util.Map<java.lang.String, java.lang.Object> strMap30 = oAuth2ProblemException25.getParameters();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2ProblemException25);
        net.oauth.v2.OAuth2Exception oAuth2Exception32 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception35 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException34);
        int int36 = oAuth2ProblemException34.getHttpStatusCode();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2ProblemException34);
        int int38 = oAuth2ProblemException9.getHttpStatusCode();
        java.lang.String str39 = oAuth2ProblemException9.getProblem();
        net.oauth.v2.OAuth2Client oAuth2Client40 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor41 = new net.oauth.v2.OAuth2Accessor(oAuth2Client40);
        java.lang.String str42 = oAuth2Accessor41.tokenType;
        java.lang.String str43 = oAuth2Accessor41.tokenType;
        java.lang.Object obj45 = oAuth2Accessor41.getProperty("client_secret");
        oAuth2Accessor41.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Exception oAuth2Exception51 = new net.oauth.v2.OAuth2Exception("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception52 = new net.oauth.v2.OAuth2Exception("application%252Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2Exception51);
        oAuth2Accessor41.setProperty("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"", (java.lang.Object) oAuth2Exception51);
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2Exception51);
        java.lang.String str55 = oAuth2ProblemException9.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 200 + "'", int38 == 200);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(obj45);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str55, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1121");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream10);
        java.lang.String str12 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("client_credentials=application%252Fx-www-form-urlencoded", "invalid_grant", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HTTP status" + "'", str8, "HTTP status");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "unauthorized_client" + "'", str9, "unauthorized_client");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "token" + "'", str14, "token");
    }

    @Test
    public void test1122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1122");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int15 = oAuth2ProblemException14.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException14);
        java.lang.Throwable[] throwableArray17 = oAuth2Exception16.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception("unsupported_response_type", (java.lang.Throwable) oAuth2Exception16);
        oAuth2ProblemException7.setParameter("null  realm=\"password\"", (java.lang.Object) "unsupported_response_type");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test1123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1123");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream10);
        java.io.OutputStream outputStream12 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream12);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1124");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray11);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1125");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message4.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message4.getHeaders();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test1126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1126");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1127");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        boolean boolean6 = parameter2.equals((java.lang.Object) "OAuth2Message(hi!, , [])");
        java.lang.String str7 = parameter2.getKey();
        java.lang.String str9 = parameter2.setValue("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "scope" + "'", str9, "scope");
    }

    @Test
    public void test1128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1128");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        oAuth2Accessor1.expires_in = "2.0";
        oAuth2Accessor1.expires_in = "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29";
    }

    @Test
    public void test1129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1129");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        java.lang.String str21 = oAuth2Message12.getHeader("application%2Fx-www-form-urlencoded");
        java.lang.String str22 = oAuth2Message12.URL;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "assertion_type" + "'", str22, "assertion_type");
    }

    @Test
    public void test1130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1130");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException11.addSuppressed((java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException17 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        int int19 = oAuth2ProblemException17.getHttpStatusCode();
        oAuth2Exception15.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2.Parameter[] parameterArray24 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList25 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25, parameterArray24);
        net.oauth.v2.OAuth2Message oAuth2Message27 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str29 = oAuth2Message27.getHeader("");
        java.lang.String str30 = oAuth2Message27.URL;
        oAuth2ProblemException17.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str30);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException33 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException33);
        int int35 = oAuth2ProblemException33.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException33.addSuppressed((java.lang.Throwable) oAuth2Exception36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = oAuth2ProblemException33.getParameters();
        oAuth2ProblemException17.addSuppressed((java.lang.Throwable) oAuth2ProblemException33);
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        java.lang.Class<?> wildcardClass42 = oAuth2Exception41.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertNotNull(parameterArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(wildcardClass42);
    }

    @Test
    public void test1131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1131");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.setProperty("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) (short) 10);
        java.lang.String str13 = oAuth2Accessor6.state;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1132");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Accessor10.expires_in;
        java.lang.Object obj13 = oAuth2Accessor10.getProperty("application%2Fx-www-form-urlencoded");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1133");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str14 = oAuth2Message8.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message8.getParameterMap();
        java.lang.String str16 = oAuth2Message8.getCode();
        java.lang.String str17 = oAuth2Message8.getClientId();
        java.lang.String str19 = oAuth2Message8.getParameter("response_type");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1134");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "", "");
    }

    @Test
    public void test1135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1135");
        java.lang.String[] strArray6 = new java.lang.String[] {};
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray6);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray6);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("hi!", strArray6);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("response_type", strArray6);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray6);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "DELETE" + "'", str8, "DELETE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "invalid_request" + "'", str9, "invalid_request");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "response_type" + "'", str11, "response_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1136");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test1137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1137");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        oAuth2Accessor9.accessToken = "Authorization-Schesme=token_type";
        oAuth2Accessor9.expires_in = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        java.lang.String str15 = oAuth2Accessor9.expires_in;
        oAuth2Accessor9.accessToken = "Location";
        java.lang.String str18 = oAuth2Accessor9.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str18, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
    }

    @Test
    public void test1138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1138");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(hi!, GET, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1139");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("UTF-8", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1140");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.scope = "unsupported_response_type";
        oAuth2Accessor6.state = "token";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        oAuth2Accessor6.setProperty("Authorization-Schesme=refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) parameterList17);
        java.lang.String str20 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test1141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1141");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "\ufffd\n", "Authorization-Schesme");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1142");
        java.lang.String[] strArray4 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str6, "net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str7, "net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str8, "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test1143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1143");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
    }

    @Test
    public void test1144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1144");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2ProblemException: HTTP status 200");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1145");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Client oAuth2Client14 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = oAuth2Accessor17.clone();
        oAuth2Client14.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str20 = oAuth2Client14.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor21);
        java.lang.String str23 = oAuth2Accessor21.scope;
        oAuth2Accessor21.code = "null  realm=\"password\"";
        java.lang.String str26 = oAuth2Accessor21.scope;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1146");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str10 = oAuth2Message8.toString();
        oAuth2Message8.URL = "Authorization-Schesme=error";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str10, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
    }

    @Test
    public void test1147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1147");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1148");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        oAuth2Client3.setProperty("authorization_code", (java.lang.Object) oAuth2Exception14);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Client oAuth2Client18 = oAuth2Accessor17.client;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client18);
        java.lang.String str20 = oAuth2Client18.redirectUri;
        java.lang.String str21 = oAuth2Client18.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str21, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1149");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.String str5 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        java.lang.Throwable[] throwableArray12 = oAuth2Exception10.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("client_id");
        java.lang.Throwable[] throwableArray15 = oAuth2ProblemException14.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException18.addSuppressed((java.lang.Throwable) oAuth2Exception20);
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception20);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException24 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception25 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException24);
        int int26 = oAuth2ProblemException24.getHttpStatusCode();
        oAuth2Exception22.addSuppressed((java.lang.Throwable) oAuth2ProblemException24);
        net.oauth.v2.OAuth2.Parameter[] parameterArray31 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList32 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32, parameterArray31);
        net.oauth.v2.OAuth2Message oAuth2Message34 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32);
        java.lang.String str36 = oAuth2Message34.getHeader("");
        java.lang.String str37 = oAuth2Message34.URL;
        oAuth2ProblemException24.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str37);
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2ProblemException24);
        oAuth2Exception10.addSuppressed((java.lang.Throwable) oAuth2ProblemException14);
        oAuth2ProblemException1.setParameter("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2ProblemException14);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        org.junit.Assert.assertNotNull(parameterArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
    }

    @Test
    public void test1150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1150");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"");
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1151");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1152");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        java.lang.String str3 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str2, "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2ProblemException: none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str3, "net.oauth.v2.OAuth2ProblemException: none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1153");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1154");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        int int21 = oAuth2ProblemException19.getHttpStatusCode();
        oAuth2Exception17.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException6);
        java.lang.String str25 = oAuth2Accessor1.code;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "error_description" + "'", str25, "error_description");
    }

    @Test
    public void test1155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1155");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.toString();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        boolean boolean9 = parameter2.equals((java.lang.Object) str8);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme=token_type" + "'", str4, "Authorization-Schesme=token_type");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\n" + "'", str8, "\ufffd\n");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1156");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("net.oauth.v2.OAuth2Exception: HTTP request");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        oAuth2Accessor1.setProperty("hi!", (java.lang.Object) "UTF-8");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(parameterList13);
    }

    @Test
    public void test1157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1157");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Client oAuth2Client12 = oAuth2Accessor11.client;
        java.lang.String str13 = oAuth2Accessor11.accessToken;
        java.lang.Object obj15 = oAuth2Accessor11.getProperty("grant_type");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test1158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1158");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "", "access_denied");
        java.lang.Object obj5 = oAuth2Client3.getProperty("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.BaseGrantType baseGrantType7 = net.oauth.v2.BaseGrantType.getInstance();
        oAuth2Client3.setProperty("null  realm=\"code_and_token\"", (java.lang.Object) baseGrantType7);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(baseGrantType7);
    }

    @Test
    public void test1159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1159");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int12 = oAuth2ProblemException11.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException11);
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2Exception13);
        java.lang.String str15 = oAuth2Exception4.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2Exception" + "'", str15, "net.oauth.v2.OAuth2Exception");
    }

    @Test
    public void test1160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1160");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2.Parameter parameter12 = new net.oauth.v2.OAuth2.Parameter("HTTP response", "unsupported_grant_type");
        oAuth2Accessor1.setProperty("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", (java.lang.Object) "unsupported_grant_type");
        java.lang.String str14 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1161");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception10);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        int int16 = oAuth2ProblemException14.getHttpStatusCode();
        oAuth2Exception12.addSuppressed((java.lang.Throwable) oAuth2ProblemException14);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException14);
        int int19 = oAuth2ProblemException14.getHttpStatusCode();
        java.lang.String str20 = oAuth2ProblemException14.getProblem();
        java.lang.Throwable[] throwableArray21 = oAuth2ProblemException14.getSuppressed();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertNotNull(throwableArray21);
    }

    @Test
    public void test1162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1162");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        oAuth2Accessor1.scope = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Client oAuth2Client10 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client12 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = new net.oauth.v2.OAuth2Accessor(oAuth2Client12);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor14 = oAuth2Accessor13.clone();
        oAuth2Client10.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor14);
        java.lang.String str16 = oAuth2Client10.clientSecret;
        java.lang.String str17 = oAuth2Client10.redirectUri;
        java.lang.Object obj19 = oAuth2Client10.getProperty("invalid_token");
        oAuth2Accessor1.setProperty("invalid_request", (java.lang.Object) oAuth2Client10);
        java.lang.String str21 = oAuth2Accessor1.code;
        java.lang.String str22 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str16, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1163");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = oAuth2ProblemException8.getParameters();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        int int15 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = oAuth2ProblemException8.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = oAuth2ProblemException8.getParameters();
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1164");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(scope, DELETE, [])");
        java.io.OutputStream outputStream2 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream2);
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1165");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(hi!, , [])");
        oAuth2Accessor1.setProperty("Authorization-Schesme=null&realm=none=UTF-8", (java.lang.Object) oAuth2ProblemException14);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test1166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1166");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1167");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 37, 51, 68, 115, 99, 111, 112, 101, 37, 50, 54, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 37, 51, 68, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 37, 50, 54, 98, 101, 97, 114, 101, 114, 37, 51, 68, 98, 101, 97, 114, 101, 114, 35, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str2, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1168");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.Object obj8 = oAuth2Accessor6.getProperty("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str9 = oAuth2Accessor6.refreshToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion" + "'", str9, "assertion");
    }

    @Test
    public void test1169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1169");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.lang.String str16 = oAuth2Message12.toString();
        java.lang.String str18 = oAuth2Message12.getWWWAuthenticateHeader("null  realm=\"OAuth2Message%28scope%2C%20DELETE%2C%20%5B%5D%29\"");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str16, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"null%20%20realm%3D%22OAuth2Message%2528scope%252C%2520DELETE%252C%2520%255B%255D%2529%22\"" + "'", str18, "null  realm=\"null%20%20realm%3D%22OAuth2Message%2528scope%252C%2520DELETE%252C%2520%255B%255D%2529%22\"");
    }

    @Test
    public void test1170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1170");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException();
        java.lang.String str3 = oAuth2ProblemException2.getProblem();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        oAuth2ProblemException2.setParameter("assertion", (java.lang.Object) parameterList6);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29", "Authorization-Schesme=scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream9);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1171");
        net.oauth.v2.OAuth2.Parameter parameter3 = new net.oauth.v2.OAuth2.Parameter("token", "access_token");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception");
        boolean boolean6 = parameter3.equals((java.lang.Object) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Throwable) oAuth2Exception5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test1172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1172");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str16 = oAuth2Message15.toString();
        oAuth2Message15.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message15.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message15.getParameters();
        boolean boolean20 = parameter2.equals((java.lang.Object) oAuth2Message15);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = oAuth2Message15.getHeaders();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str16, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strEntryList19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strEntryList21);
    }

    @Test
    public void test1173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1173");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        net.oauth.v2.OAuth2Message oAuth2Message3 = new net.oauth.v2.OAuth2Message("", "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", parameterCollection2);
    }

    @Test
    public void test1174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1174");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        java.io.InputStream inputStream3 = null;
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", parameterCollection2, inputStream3);
        oAuth2Message4.URL = "unsupported_grant_type";
    }

    @Test
    public void test1175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1175");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.oauth.v2.OAuth2.addParametersAsFragment("error_uri", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1176");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1177");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message4.method = "access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test1178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1178");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1179");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test1180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1180");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("authorization_code", "assertion");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "authorization_code" + "'", str3, "authorization_code");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "authorization_code" + "'", str4, "authorization_code");
    }

    @Test
    public void test1181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1181");
        net.oauth.v2.OAuth2.Parameter parameter4 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str5 = parameter4.toString();
        java.lang.String str6 = parameter4.getKey();
        net.oauth.v2.OAuth2.Parameter parameter9 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str10 = parameter9.getValue();
        java.lang.String str11 = parameter9.getValue();
        net.oauth.v2.OAuth2.Parameter parameter14 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        net.oauth.v2.OAuth2.Parameter[] parameterArray15 = new net.oauth.v2.OAuth2.Parameter[] { parameter4, parameter9, parameter14 };
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList16 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, parameterArray15);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception=HTTP%20status", "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str19 = oAuth2Message18.URL;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "token_type" + "'", str10, "token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])" + "'", str19, "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
    }

    @Test
    public void test1182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1182");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test1183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1183");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"invalid_token\"=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "null  realm=\"invalid_token\"=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1184");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.getClientId();
        java.lang.String str11 = oAuth2Message5.toString();
        java.lang.String str12 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str11, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1185");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1186");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("password", "null  realm=\"password\"", "assertion_type");
        java.lang.Object obj5 = oAuth2Client3.getProperty("expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Client oAuth2Client8 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        java.lang.String str10 = oAuth2Accessor9.tokenType;
        java.lang.String str11 = oAuth2Accessor9.tokenType;
        java.lang.Object obj13 = oAuth2Accessor9.getProperty("client_secret");
        oAuth2Accessor9.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor9.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client18 = oAuth2Accessor9.client;
        oAuth2Client3.setProperty("Authorization-Schesme=token_type", (java.lang.Object) oAuth2Accessor9);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "password" + "'", str6, "password");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertNull(oAuth2Client18);
    }

    @Test
    public void test1187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1187");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.code = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        java.lang.String str11 = oAuth2Accessor1.refreshToken;
        java.lang.String str12 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "PUT%3Dunsupported_grant_type";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1188");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.state = "client_secret";
        oAuth2Accessor1.tokenType = "password";
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test1189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1189");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null%20%20realm%3D%22code_and_token%22");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 37, 50, 48, 37, 50, 48, 114, 101, 97, 108, 109, 37, 51, 68, 37, 50, 50, 99, 111, 100, 101, 95, 97, 110, 100, 95, 116, 111, 107, 101, 110, 37, 50, 50]");
    }

    @Test
    public void test1190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1190");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        int int15 = oAuth2ProblemException13.getHttpStatusCode();
        oAuth2Exception11.addSuppressed((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.lang.String str25 = oAuth2Message23.getHeader("");
        java.lang.String str26 = oAuth2Message23.URL;
        oAuth2ProblemException13.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str26);
        java.lang.Throwable[] throwableArray28 = oAuth2ProblemException13.getSuppressed();
        oAuth2Client3.setProperty("redirect_uri", (java.lang.Object) throwableArray28);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor30 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        oAuth2Accessor30.scope = "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21";
        oAuth2Accessor30.expires_in = "GET";
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
    }

    @Test
    public void test1191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1191");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        java.lang.Object obj12 = oAuth2Client3.getProperty("UTF-8");
        java.lang.Object obj14 = oAuth2Client3.getProperty("\n");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str16 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "token_type" + "'", str16, "token_type");
    }

    @Test
    public void test1192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1192");
        java.lang.String[] strArray5 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray5);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str8, "net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test1193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1193");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        net.oauth.v2.OAuth2.Parameter[] parameterArray5 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList6 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, parameterArray5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = oAuth2Message8.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        oAuth2Message8.URL = "2.0";
        oAuth2Message8.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message8.getParameterMap();
        oAuth2ProblemException1.setParameter("OAuth2Message(POST, refresh_token, [])", (java.lang.Object) oAuth2Message8);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1194");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor4.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor5.clone();
        oAuth2Accessor5.refreshToken = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor5.state = "Authorization-Schesme=refresh_token";
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
    }

    @Test
    public void test1195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1195");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str9 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1196");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        net.oauth.v2.OAuth2Client oAuth2Client11 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor12 = new net.oauth.v2.OAuth2Accessor(oAuth2Client11);
        java.lang.String str13 = oAuth2Accessor12.tokenType;
        oAuth2Accessor12.tokenType = "response_type";
        oAuth2Accessor12.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str19 = oAuth2Accessor12.scope;
        java.lang.String str20 = oAuth2Accessor12.accessToken;
        oAuth2Accessor12.refreshToken = "none";
        oAuth2Accessor1.setProperty("HTTP%20status", (java.lang.Object) "none");
        java.lang.String str24 = oAuth2Accessor1.code;
        oAuth2Accessor1.code = "username";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1197");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("redirect_uri", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(2.0, UTF-8, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HTTP request" + "'", str8, "HTTP request");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "redirect_uri" + "'", str11, "redirect_uri");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(2.0, UTF-8, [])" + "'", str12, "OAuth2Message(2.0, UTF-8, [])");
    }

    @Test
    public void test1198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1198");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null  realm=\"2.0\"");
    }

    @Test
    public void test1199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1199");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException8.getParameters();
        boolean boolean10 = parameter2.equals((java.lang.Object) oAuth2ProblemException8);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = oAuth2ProblemException8.getParameters();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test1200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1200");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        java.lang.Class<?> wildcardClass6 = baseGrantType0.getClass();
        org.junit.Assert.assertNotNull(baseGrantType0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1201");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.lang.String str11 = oAuth2Message7.method;
        java.lang.String str12 = oAuth2Message7.getCode();
        java.lang.String str13 = oAuth2Message7.URL;
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_client" + "'", str13, "invalid_client");
    }

    @Test
    public void test1202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1202");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.BaseResponseType baseResponseType11 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType11);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType11);
        oAuth2Client3.setProperty("Authorization-Schesme", (java.lang.Object) baseResponseType11);
        java.lang.String str18 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str20 = oAuth2Client3.clientSecret;
        java.lang.String str21 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "token_type" + "'", str21, "token_type");
    }

    @Test
    public void test1203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1203");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.scope = "unsupported_response_type";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        int int16 = oAuth2ProblemException14.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception17);
        java.util.Map<java.lang.String, java.lang.Object> strMap19 = oAuth2ProblemException14.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException21 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int22 = oAuth2ProblemException21.getHttpStatusCode();
        java.lang.String str23 = oAuth2ProblemException21.getProblem();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2ProblemException21);
        int int25 = oAuth2ProblemException21.getHttpStatusCode();
        int int26 = oAuth2ProblemException21.getHttpStatusCode();
        oAuth2Accessor6.setProperty("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) int26);
        oAuth2Accessor6.state = "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str30 = oAuth2Accessor6.state;
        java.lang.String str31 = oAuth2Accessor6.scope;
        oAuth2Accessor6.code = "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str30, "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "unsupported_response_type" + "'", str31, "unsupported_response_type");
    }

    @Test
    public void test1204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1204");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(hi!, GET, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream5 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str7, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1205");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str1, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test1206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1206");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "Authorization-Schesme";
        java.lang.String str8 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1207");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Authorization-Schesme=refresh_token");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
    }

    @Test
    public void test1208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1208");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(Authorization-Schesme=token_type, , [])", "", "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str4, "OAuth2Message(Authorization-Schesme=token_type, , [])");
    }

    @Test
    public void test1209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1209");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("OAuth2Message(POST, access_token, [])", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream9);
        java.lang.String str11 = oAuth2Message10.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP status" + "'", str6, "HTTP status");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unauthorized_client" + "'", str7, "unauthorized_client");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(POST, access_token, [])" + "'", str11, "OAuth2Message(POST, access_token, [])");
    }

    @Test
    public void test1210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1210");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("net.oauth.v2.OAuth2ProblemException: net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29" + "'", str3, "null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str5, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test1211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1211");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22" + "'", str1, "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22");
    }

    @Test
    public void test1212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1212");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.toString();
        java.lang.String str7 = parameter2.getValue();
        java.lang.String str8 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme=token_type" + "'", str6, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "token_type" + "'", str8, "token_type");
    }

    @Test
    public void test1213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1213");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str13 = oAuth2Message5.getParameter("assertion");
        java.lang.String str15 = oAuth2Message5.getHeader("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
        java.lang.String str16 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str16, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1214");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1215");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22Authorization-Schesme%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%20%20realm%3D%22Authorization-Schesme%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1216");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid_request" + "'", str7, "invalid_request");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str9, "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1217");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.expires_in = "invalid_scope";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1218");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str11 = oAuth2Message5.getHeader("error_uri");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message5.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message5.getParameterMap();
        oAuth2Message5.URL = "HTTP%20request";
        java.lang.String str17 = oAuth2Message5.getParameter("null  realm=\"OAuth2Message%28POST%2C%20refresh_token%2C%20%5B%5D%29\"");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1219");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str14 = oAuth2Message12.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message12.getParameterMap();
        oAuth2Accessor1.setProperty("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) strMap15);
        oAuth2Accessor1.expires_in = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.code = "unauthorized_client";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1220");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.Class<?> wildcardClass12 = oAuth2Message5.getClass();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test1221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1221");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.scope = "unauthorized_client";
        oAuth2Accessor1.scope = "null%20%20realm%3D%22invalid_token%22=POST";
    }

    @Test
    public void test1222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1222");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.URL;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
    }

    @Test
    public void test1223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1223");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1224");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        java.lang.Object obj12 = oAuth2Client3.getProperty("UTF-8");
        java.lang.String[] strArray22 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList23 = net.oauth.v2.OAuth2.newList(strArray22);
        java.lang.String str24 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList23);
        java.io.InputStream inputStream25 = null;
        net.oauth.v2.OAuth2Message oAuth2Message26 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23, inputStream25);
        java.lang.String str28 = oAuth2Message26.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str29 = oAuth2Message26.URL;
        oAuth2Message26.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Client3.setProperty("null  realm=\"client_id\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNotNull(strArray22);
        org.junit.Assert.assertNotNull(parameterList23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str24, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null  realm=\"invalid_token\"" + "'", str28, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "invalid_scope" + "'", str29, "invalid_scope");
    }

    @Test
    public void test1225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1225");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "invalid_request";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        oAuth2Accessor10.scope = "net.oauth.v2.OAuth2Exception";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
    }

    @Test
    public void test1226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1226");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        int int4 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("token_type", (java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test1227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1227");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str1, "OAuth2Message(DELETE, client_id, [])");
    }

    @Test
    public void test1228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1228");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        oAuth2Accessor1.refreshToken = "none=invalid_client";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1229");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test1230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1230");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1231");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str11 = oAuth2Message5.getHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        oAuth2Message5.method = "Authorization-Schesme=null%20%20realm%3D%22%22";
        java.lang.String str15 = oAuth2Message5.getWWWAuthenticateHeader("DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"DELETE%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str15, "null  realm=\"DELETE%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1232");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test1233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1233");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        net.oauth.v2.OAuth2Client oAuth2Client7 = oAuth2Accessor1.client;
        java.lang.String str8 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(oAuth2Client7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1234");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Client oAuth2Client3 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Accessor4.tokenType;
        oAuth2Accessor4.tokenType = "response_type";
        java.lang.String str8 = oAuth2Accessor4.state;
        java.lang.String str9 = oAuth2Accessor4.refreshToken;
        oAuth2Accessor4.tokenType = "username";
        oAuth2ProblemException1.setParameter("invalid_request", (java.lang.Object) oAuth2Accessor4);
        net.oauth.v2.OAuth2Client oAuth2Client17 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client19 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor20 = new net.oauth.v2.OAuth2Accessor(oAuth2Client19);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = oAuth2Accessor20.clone();
        oAuth2Client17.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor21);
        java.lang.String str23 = oAuth2Client17.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor25 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        net.oauth.v2.OAuth2Client oAuth2Client30 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client32 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor33 = new net.oauth.v2.OAuth2Accessor(oAuth2Client32);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor34 = oAuth2Accessor33.clone();
        oAuth2Client30.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor34);
        java.lang.String str36 = oAuth2Client30.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor37 = new net.oauth.v2.OAuth2Accessor(oAuth2Client30);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor38 = new net.oauth.v2.OAuth2Accessor(oAuth2Client30);
        oAuth2Client17.setProperty("application%2Fx-www-form-urlencoded", (java.lang.Object) oAuth2Client30);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException41 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = oAuth2ProblemException41.getParameters();
        java.lang.Throwable[] throwableArray43 = oAuth2ProblemException41.getSuppressed();
        oAuth2Client30.setProperty("assertion", (java.lang.Object) oAuth2ProblemException41);
        java.lang.Object obj46 = oAuth2Client30.getProperty("");
        oAuth2ProblemException1.setParameter("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", obj46);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException49 = new net.oauth.v2.OAuth2ProblemException("token_type");
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException49);
        java.lang.String str51 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str23, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str36, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(throwableArray43);
        org.junit.Assert.assertNull(obj46);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str51, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test1235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1235");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "application/x-www-form-urlencoded";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.state = "invalid_grant";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test1236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1236");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.scope;
        java.lang.String str8 = oAuth2Accessor1.state;
        java.lang.String str9 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1237");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=refresh_token", "password", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream5);
        oAuth2Message6.URL = "net.oauth.v2.OAuth2ProblemException: access_denied";
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test1238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1238");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.String str8 = oAuth2Accessor6.refreshToken;
        java.lang.String str9 = oAuth2Accessor6.code;
        java.lang.String str10 = oAuth2Accessor6.code;
        java.lang.String str11 = oAuth2Accessor6.tokenType;
        oAuth2Accessor1.setProperty("error", (java.lang.Object) str11);
        oAuth2Accessor1.scope = "OAuth2Message(hi!, , [])";
        java.lang.String str15 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.expires_in = "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        oAuth2Accessor1.scope = "null  realm=\"password\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1239");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("token_type");
        boolean boolean8 = parameter2.equals((java.lang.Object) oAuth2ProblemException7);
        java.lang.String str9 = parameter2.toString();
        java.lang.String str10 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=scope" + "'", str9, "Authorization-Schesme=scope");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "scope" + "'", str10, "scope");
    }

    @Test
    public void test1240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1240");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("application%2Fx-www-form-urlencoded");
    }

    @Test
    public void test1241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1241");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        java.lang.String str8 = oAuth2Accessor7.tokenType;
        java.lang.String str9 = oAuth2Accessor7.tokenType;
        oAuth2Accessor7.code = "unsupported_grant_type";
        oAuth2Accessor7.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray17 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList18 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18, parameterArray17);
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.lang.String str22 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        oAuth2Accessor7.setProperty("response_type", (java.lang.Object) strMap23);
        java.lang.Object obj26 = oAuth2Accessor7.getProperty("Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = oAuth2Accessor7.clone();
        oAuth2Client3.setProperty("invalid_token", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str29 = oAuth2Accessor7.tokenType;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(parameterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNotNull(oAuth2Accessor27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "GET" + "'", str29, "GET");
    }

    @Test
    public void test1242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1242");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Client oAuth2Client14 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = oAuth2Accessor17.clone();
        oAuth2Client14.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str20 = oAuth2Client14.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor21);
        net.oauth.v2.OAuth2Client oAuth2Client23 = oAuth2Accessor21.client;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client23);
        net.oauth.v2.OAuth2Client oAuth2Client26 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = new net.oauth.v2.OAuth2Accessor(oAuth2Client26);
        java.lang.String str28 = oAuth2Accessor27.tokenType;
        java.lang.String str29 = oAuth2Accessor27.tokenType;
        oAuth2Accessor27.code = "unsupported_grant_type";
        oAuth2Accessor27.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray37 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList38 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList38, parameterArray37);
        net.oauth.v2.OAuth2Message oAuth2Message40 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        java.util.Map<java.lang.String, java.lang.String> strMap41 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        java.lang.String str42 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        oAuth2Accessor27.setProperty("response_type", (java.lang.Object) strMap43);
        oAuth2Accessor24.setProperty("POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) strMap43);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(parameterArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test1243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1243");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        oAuth2Message5.URL = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        oAuth2Message5.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message5.getParameterMap();
        java.lang.String str17 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1244");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("state", "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1245");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "access_token" + "'", str5, "access_token");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str7, "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1246");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable0 = null;
        java.io.OutputStream outputStream1 = null;
        net.oauth.v2.OAuth2.formEncode(parameterIterable0, outputStream1);
    }

    @Test
    public void test1247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1247");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception3.getSuppressed();
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2ProblemException: hi!", "PUT");
        net.oauth.v2.OAuth2Client oAuth2Client9 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client9);
        java.lang.String str11 = oAuth2Accessor10.tokenType;
        java.lang.String str12 = oAuth2Accessor10.refreshToken;
        java.lang.String str13 = oAuth2Accessor10.code;
        java.lang.String str14 = oAuth2Accessor10.code;
        java.lang.String str15 = oAuth2Accessor10.tokenType;
        java.lang.String str16 = oAuth2Accessor10.state;
        net.oauth.v2.BaseTokenType baseTokenType18 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType18;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType18);
        oAuth2Accessor10.setProperty("code_and_token", (java.lang.Object) baseTokenType18);
        oAuth2Accessor10.scope = "expires_in";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        java.lang.Throwable[] throwableArray28 = oAuth2Exception27.getSuppressed();
        oAuth2Accessor10.setProperty("application/x-www-form-urlencoded", (java.lang.Object) oAuth2Exception27);
        boolean boolean30 = parameter8.equals((java.lang.Object) oAuth2Exception27);
        oAuth2Exception3.addSuppressed((java.lang.Throwable) oAuth2Exception27);
        java.lang.Throwable throwable32 = null;
        // The following exception was thrown during execution in test generation
        try {
            oAuth2Exception3.addSuppressed(throwable32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(baseTokenType18);
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test1248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1248");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1249");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.lang.String str13 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1250");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Client oAuth2Client14 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = oAuth2Accessor17.clone();
        oAuth2Client14.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str20 = oAuth2Client14.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor21);
        java.lang.String str23 = oAuth2Accessor21.scope;
        oAuth2Accessor21.code = "null  realm=\"password\"";
        java.lang.String str26 = oAuth2Accessor21.refreshToken;
        java.lang.String str27 = oAuth2Accessor21.tokenType;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException33 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException33);
        net.oauth.v2.OAuth2Exception oAuth2Exception35 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException33.addSuppressed((java.lang.Throwable) oAuth2Exception35);
        net.oauth.v2.OAuth2Exception oAuth2Exception37 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception35);
        net.oauth.v2.OAuth2Exception oAuth2Exception38 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception37);
        net.oauth.v2.OAuth2Exception oAuth2Exception39 = new net.oauth.v2.OAuth2Exception("invalid_token", (java.lang.Throwable) oAuth2Exception38);
        net.oauth.v2.OAuth2Exception oAuth2Exception40 = new net.oauth.v2.OAuth2Exception("application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Throwable) oAuth2Exception39);
        oAuth2Accessor21.setProperty("OAuth2Message(2.0, UTF-8, [])", (java.lang.Object) "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1251");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Client oAuth2Client10 = new net.oauth.v2.OAuth2Client("OAuth2Message(Authorization-Schesme=token_type, , [])", "OAuth2Message(POST, refresh_token, [])", "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Client3.setProperty("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "OAuth2Message(POST, refresh_token, [])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
    }

    @Test
    public void test1252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1252");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.accessToken;
        java.lang.String str8 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1253");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str10 = oAuth2Message5.getHeader("invalid_request");
        java.lang.String str11 = oAuth2Message5.getCode();
        java.lang.String str12 = oAuth2Message5.getClientId();
        java.lang.String str13 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test1254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1254");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor1.scope;
        oAuth2Accessor1.refreshToken = "username";
        java.lang.String str10 = oAuth2Accessor1.scope;
        java.lang.Object obj12 = oAuth2Accessor1.getProperty("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.lang.Object obj14 = oAuth2Accessor1.getProperty("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str15 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1255");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.URL;
        java.lang.String str14 = oAuth2Message5.getCode();
        java.lang.String str15 = oAuth2Message5.method;
        java.lang.String str16 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "GET" + "'", str16, "GET");
    }

    @Test
    public void test1256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1256");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("PUT", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DELETE" + "'", str5, "DELETE");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PUT" + "'", str7, "PUT");
    }

    @Test
    public void test1257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1257");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str9 = oAuth2Message7.getParameter("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str10 = oAuth2Message7.method;
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1258");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        java.lang.Object obj12 = oAuth2Client3.getProperty("UTF-8");
        java.lang.Object obj14 = oAuth2Client3.getProperty("\n");
        java.lang.Object obj16 = oAuth2Client3.getProperty("null  realm=\"none%3DUTF-8\"");
        java.lang.String str17 = oAuth2Client3.clientId;
        java.lang.String str18 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "token_type" + "'", str17, "token_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str18, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1259");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream13);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "refresh_token" + "'", str12, "refresh_token");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1260");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.tokenType = "username";
        oAuth2Accessor1.refreshToken = "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])";
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test1261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1261");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        net.oauth.v2.BaseGrantType baseGrantType7 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.OAuth2.GrantType = baseGrantType7;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType7);
        boolean boolean10 = parameter2.equals((java.lang.Object) baseGrantType7);
        java.lang.String str12 = parameter2.setValue("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str13 = parameter2.toString();
        java.lang.String str15 = parameter2.setValue("Location");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertNotNull(baseGrantType7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "token_type" + "'", str12, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str13, "Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1262");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message%28hi%21%2C%20%2C%20%5B%5D%29" + "'", str1, "OAuth2Message%28hi%21%2C%20%2C%20%5B%5D%29");
    }

    @Test
    public void test1263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1263");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2Message15.method = "authorization_code";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message15.getParameters();
        oAuth2Message15.method = "null  realm=\"none%3DUTF-8\"";
        java.lang.String str22 = oAuth2Message15.getParameter("UTF-8");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = oAuth2Message15.getHeaders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strEntryList23);
    }

    @Test
    public void test1264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1264");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        oAuth2Message11.completeParameters();
        java.lang.String str13 = oAuth2Message11.getCode();
        java.lang.String str14 = oAuth2Message11.method;
        java.lang.String str15 = oAuth2Message11.getClientId();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "client_credentials" + "'", str14, "client_credentials");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1265");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        int int4 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception5.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        int int20 = oAuth2ProblemException18.getHttpStatusCode();
        oAuth2Exception16.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        net.oauth.v2.OAuth2.Parameter[] parameterArray25 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList26 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26, parameterArray25);
        net.oauth.v2.OAuth2Message oAuth2Message28 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.lang.String str30 = oAuth2Message28.getHeader("");
        java.lang.String str31 = oAuth2Message28.URL;
        oAuth2ProblemException18.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str31);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception35 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException34);
        int int36 = oAuth2ProblemException34.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception37 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException34.addSuppressed((java.lang.Throwable) oAuth2Exception37);
        java.util.Map<java.lang.String, java.lang.Object> strMap39 = oAuth2ProblemException34.getParameters();
        oAuth2ProblemException18.addSuppressed((java.lang.Throwable) oAuth2ProblemException34);
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        net.oauth.v2.OAuth2Exception oAuth2Exception42 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        net.oauth.v2.OAuth2Exception oAuth2Exception43 = new net.oauth.v2.OAuth2Exception("Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Throwable) oAuth2Exception42);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap39);
    }

    @Test
    public void test1266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1266");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("authorization_code", "assertion");
        java.lang.String str3 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "authorization_code=assertion" + "'", str3, "authorization_code=assertion");
    }

    @Test
    public void test1267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1267");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1268");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream9);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1269");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2.Parameter parameter6 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str7 = parameter6.toString();
        java.lang.String str9 = parameter6.setValue("none");
        net.oauth.v2.OAuth2Client oAuth2Client10 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client10);
        java.lang.String str12 = oAuth2Accessor11.tokenType;
        oAuth2Accessor11.tokenType = "response_type";
        oAuth2Accessor11.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str18 = oAuth2Accessor11.scope;
        java.lang.String str19 = oAuth2Accessor11.expires_in;
        boolean boolean20 = parameter6.equals((java.lang.Object) oAuth2Accessor11);
        oAuth2ProblemException0.setParameter("username", (java.lang.Object) oAuth2Accessor11);
        java.lang.String[] strArray30 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList31 = net.oauth.v2.OAuth2.newList(strArray30);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList32 = net.oauth.v2.OAuth2.newList(strArray30);
        java.lang.String str33 = net.oauth.v2.OAuth2.addParameters("UTF-8", strArray30);
        oAuth2Accessor11.setProperty("null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) strArray30);
        java.lang.String str35 = oAuth2Accessor11.state;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme=token_type" + "'", str7, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(parameterList31);
        org.junit.Assert.assertNotNull(parameterList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str33, "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str35);
    }

    @Test
    public void test1270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1270");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1271");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream6);
        java.lang.Class<?> wildcardClass8 = parameterList3.getClass();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTTP status" + "'", str4, "HTTP status");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unauthorized_client" + "'", str5, "unauthorized_client");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1272");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1273");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        java.lang.String str3 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1274");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=access_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1275");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1276");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test1277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1277");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.String str7 = oAuth2Accessor2.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1278");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("password");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "password" + "'", str1, "password");
    }

    @Test
    public void test1279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1279");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        java.lang.String str7 = oAuth2ProblemException1.getProblem();
        java.lang.String str8 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str8, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1280");
        net.oauth.v2.OAuth2.Parameter[] parameterArray6 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList7 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, parameterArray6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.OutputStream outputStream11 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream11);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("HTTP request", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str14 = oAuth2Message13.method;
        java.lang.String str16 = oAuth2Message13.getParameter("2.0");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message13.getHeaders();
        java.lang.String str18 = oAuth2Message13.toString();
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(HTTP request, , [])" + "'", str18, "OAuth2Message(HTTP request, , [])");
    }

    @Test
    public void test1281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1281");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str11 = oAuth2Message5.getHeader("error_uri");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message5.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message5.getParameterMap();
        oAuth2Message5.URL = "HTTP%20request";
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message5.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1282");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        oAuth2Message12.method = "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str16 = oAuth2Message12.getHeader("OAuth2Message(hi!, GET, [])");
        java.lang.String str18 = oAuth2Message12.getHeader("");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test1283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1283");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray11);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("null  realm=\"client_id\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParametersAsFragment("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"client_id\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "null  realm=\"client_id\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1284");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.toString();
        java.lang.String str9 = oAuth2Message5.getCode();
        java.lang.String str10 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str10, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1285");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("\ufffd\n", "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request", "null  realm=\"unsupported_grant_type\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.lang.String str10 = oAuth2Message8.getWWWAuthenticateHeader("unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"unsupported_grant_type%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str10, "null  realm=\"unsupported_grant_type%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1286");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client7 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter12 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str13 = parameter12.toString();
        java.lang.String str15 = parameter12.setValue("access_denied");
        oAuth2Client7.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter12);
        oAuth2ProblemException0.setParameter("state", (java.lang.Object) oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.String str19 = oAuth2Client7.redirectUri;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test1287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1287");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1288");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"redirect_uri_mismatch\"", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request");
        boolean boolean4 = parameter2.equals((java.lang.Object) "token_type  realm=\"%0A\"");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test1289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1289");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor4.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor5.clone();
        oAuth2Accessor5.refreshToken = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor5.refreshToken = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
    }

    @Test
    public void test1290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1290");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(hi!, GET, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        java.io.OutputStream outputStream4 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream4);
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1291");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message8.getParameters();
        java.lang.String str14 = oAuth2Message8.getHeader("scope");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1292");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.tokenType = "Authorization-Schesme=refresh_token";
        java.lang.String str9 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2.Parameter[] parameterArray13 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList14 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, parameterArray13);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        oAuth2Message16.completeParameters();
        java.lang.String str18 = oAuth2Message16.getClientId();
        java.lang.String str19 = oAuth2Message16.getClientId();
        java.lang.String str21 = oAuth2Message16.getHeader("net.oauth.v2.OAuth2Exception=HTTP%20status");
        oAuth2Message16.method = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        oAuth2Accessor1.setProperty("OAuth2Message(hi!, GET, [])", (java.lang.Object) oAuth2Message16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1293");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Accessor4.refreshToken;
        oAuth2Accessor4.tokenType = "OAuth2Message(scope, DELETE, [])";
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1294");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2.Parameter parameter6 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str7 = parameter6.toString();
        java.lang.String str9 = parameter6.setValue("none");
        net.oauth.v2.OAuth2Client oAuth2Client10 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client10);
        java.lang.String str12 = oAuth2Accessor11.tokenType;
        oAuth2Accessor11.tokenType = "response_type";
        oAuth2Accessor11.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str18 = oAuth2Accessor11.scope;
        java.lang.String str19 = oAuth2Accessor11.expires_in;
        boolean boolean20 = parameter6.equals((java.lang.Object) oAuth2Accessor11);
        oAuth2ProblemException0.setParameter("username", (java.lang.Object) oAuth2Accessor11);
        java.lang.String[] strArray30 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList31 = net.oauth.v2.OAuth2.newList(strArray30);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList32 = net.oauth.v2.OAuth2.newList(strArray30);
        java.lang.String str33 = net.oauth.v2.OAuth2.addParameters("UTF-8", strArray30);
        oAuth2Accessor11.setProperty("null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) strArray30);
        oAuth2Accessor11.expires_in = "OAuth2Message(hi!, , [])";
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme=token_type" + "'", str7, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strArray30);
        org.junit.Assert.assertNotNull(parameterList31);
        org.junit.Assert.assertNotNull(parameterList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str33, "UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1295");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.refreshToken = "none";
        java.lang.String str12 = oAuth2Accessor1.tokenType;
        java.lang.String str13 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "response_type" + "'", str12, "response_type");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1296");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("null  realm=\"client_id\"", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream11);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(parameterList8);
    }

    @Test
    public void test1297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1297");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        oAuth2Accessor2.refreshToken = "client_credentials";
        oAuth2Accessor2.code = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor2.code = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test1298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1298");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int6 = oAuth2ProblemException5.getHttpStatusCode();
        java.lang.String str7 = oAuth2ProblemException5.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2ProblemException5.setParameter("code", (java.lang.Object) parameterList12);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str18 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str19 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParameters("error_description", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.io.OutputStream outputStream21 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12, outputStream21);
        java.lang.String str23 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error_description" + "'", str20, "error_description");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HTTP status" + "'", str23, "HTTP status");
    }

    @Test
    public void test1299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1299");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "scope";
        oAuth2Accessor1.code = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"";
        oAuth2Accessor1.state = "null%20%20realm%3D%22invalid_token%22=expires_in";
        oAuth2Accessor1.expires_in = "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1300");
        byte[] byteArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str1 = net.oauth.v2.OAuth2.decodeCharacters(byteArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test1301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1301");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2ProblemException: access_denied");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1302");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
    }

    @Test
    public void test1303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1303");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("token", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        java.lang.String str14 = oAuth2Message12.getParameter("null  realm=\"client_id\"");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message12.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "unsupported_grant_type" + "'", str8, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "username" + "'", str9, "username");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1304");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1305");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.refreshToken;
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.refreshToken = "UTF-8";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1306");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "OAuth2Message(hi!, GET, [])";
        java.lang.String str9 = oAuth2Accessor1.state;
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test1307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1307");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        int int21 = oAuth2ProblemException19.getHttpStatusCode();
        oAuth2Exception17.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException6);
        oAuth2Accessor1.expires_in = "null  realm=\"redirect_uri_mismatch\"";
        oAuth2Accessor1.refreshToken = "assertion";
        oAuth2Accessor1.refreshToken = "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.Object obj32 = oAuth2Accessor1.getProperty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor33 = oAuth2Accessor1.clone();
        oAuth2Accessor1.accessToken = "response_type";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(oAuth2Accessor33);
    }

    @Test
    public void test1308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1308");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("unsupported_response_type");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("Authorization-Schesme=null&realm=none=UTF-8", (java.lang.Throwable) oAuth2ProblemException2);
        java.lang.String str4 = oAuth2ProblemException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2ProblemException: unsupported_response_type" + "'", str4, "net.oauth.v2.OAuth2ProblemException: unsupported_response_type");
    }

    @Test
    public void test1309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1309");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1310");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.lang.String str11 = oAuth2Message7.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message7.getHeaders();
        java.lang.String str14 = oAuth2Message7.getParameter("redirect_uri_mismatch");
        java.lang.String str15 = oAuth2Message7.getClientId();
        java.lang.String str16 = oAuth2Message7.URL;
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "invalid_client" + "'", str16, "invalid_client");
    }

    @Test
    public void test1311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1311");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2Message15.method = "authorization_code";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message15.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = oAuth2Message15.getParameterMap();
        java.lang.String str20 = oAuth2Message15.getCode();
        oAuth2Message15.method = "";
        java.lang.String str24 = oAuth2Message15.getHeader("net.oauth.v2.OAuth2ProblemException: HTTP status 200");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1312");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("HTTP status");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[72, 84, 84, 80, 32, 115, 116, 97, 116, 117, 115]");
    }

    @Test
    public void test1313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1313");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        java.lang.Class<?> wildcardClass8 = oAuth2Exception6.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test1314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1314");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2.Parameter[] parameterArray13 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList14 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, parameterArray13);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.lang.String str18 = oAuth2Message16.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message16.getParameters();
        oAuth2Message16.URL = "2.0";
        oAuth2Message16.completeParameters();
        oAuth2Accessor1.setProperty("hi!", (java.lang.Object) oAuth2Message16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strEntryList19);
    }

    @Test
    public void test1315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1315");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        java.lang.Class<?> wildcardClass11 = oAuth2Message8.getClass();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1316");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.expires_in;
        java.lang.String str6 = oAuth2Accessor2.refreshToken;
        java.lang.String str7 = oAuth2Accessor2.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1317");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        int int3 = oAuth2ProblemException0.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        int int9 = oAuth2ProblemException5.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        int int20 = oAuth2ProblemException18.getHttpStatusCode();
        oAuth2Exception16.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        int int23 = oAuth2ProblemException18.getHttpStatusCode();
        java.lang.String str24 = oAuth2ProblemException18.getProblem();
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = oAuth2ProblemException18.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = oAuth2ProblemException18.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client32 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client34 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor35 = new net.oauth.v2.OAuth2Accessor(oAuth2Client34);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor36 = oAuth2Accessor35.clone();
        oAuth2Client32.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor36);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor38 = new net.oauth.v2.OAuth2Accessor(oAuth2Client32);
        java.lang.String str39 = oAuth2Accessor38.state;
        oAuth2Accessor38.accessToken = "Authorization-Schesme=token_type";
        oAuth2Accessor38.expires_in = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        java.lang.String str44 = oAuth2Accessor38.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor45 = oAuth2Accessor38.clone();
        oAuth2Accessor38.accessToken = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        oAuth2ProblemException18.setParameter("invalid_scope", (java.lang.Object) oAuth2Accessor38);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(oAuth2Accessor36);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str44, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor45);
    }

    @Test
    public void test1318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1318");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1319");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.expires_in;
        java.lang.String str6 = oAuth2Accessor2.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1320");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: hi!", "application%2Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\n" + "'", str6, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "client_credentials" + "'", str7, "client_credentials");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test1321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1321");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1322");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(POST, refresh_token, [])", "DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str4, "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test1323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1323");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        oAuth2Message12.method = "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str16 = oAuth2Message12.getHeader("OAuth2Message(hi!, GET, [])");
        java.lang.String str17 = oAuth2Message12.getClientId();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1324");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2ProblemException: Location");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1325");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client4 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client4);
        java.lang.String str6 = oAuth2Accessor5.tokenType;
        java.lang.String str7 = oAuth2Accessor5.tokenType;
        java.lang.Object obj9 = oAuth2Accessor5.getProperty("client_secret");
        oAuth2Accessor5.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str12 = oAuth2Accessor5.scope;
        java.lang.String str13 = oAuth2Accessor5.code;
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception16);
        oAuth2Accessor5.setProperty("OAuth2Message(hi!, , [])", (java.lang.Object) oAuth2Exception17);
        java.lang.Throwable[] throwableArray19 = oAuth2Exception17.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception("null%20%20realm%3D%22invalid_token%22=expires_in", (java.lang.Throwable) oAuth2Exception17);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception20);
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception20);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test1326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1326");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=token_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"password\"");
    }

    @Test
    public void test1327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1327");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("redirect_uri");
        java.lang.String str8 = oAuth2Accessor2.expires_in;
        oAuth2Accessor2.accessToken = "net.oauth.v2.OAuth2ProblemException: hi!";
        java.lang.Object obj12 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2Exception");
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1328");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("state");
        oAuth2Accessor1.scope = "\ufffd\n";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1329");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("token", "access_token");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception");
        boolean boolean5 = parameter2.equals((java.lang.Object) oAuth2Exception4);
        java.lang.Throwable[] throwableArray6 = oAuth2Exception4.getSuppressed();
        java.lang.Class<?> wildcardClass7 = throwableArray6.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1330");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "Authorization-Schesme";
        oAuth2Accessor1.expires_in = "invalid_token";
        oAuth2Accessor1.code = "";
        oAuth2Accessor1.expires_in = "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1331");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.toString();
        net.oauth.v2.OAuth2.Parameter[] parameterArray6 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList7 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, parameterArray6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str11 = oAuth2Message9.getHeader("");
        java.lang.String str12 = oAuth2Message9.getClientId();
        java.lang.String str14 = oAuth2Message9.getHeader("UTF-8");
        boolean boolean15 = parameter2.equals((java.lang.Object) str14);
        java.lang.String str16 = parameter2.toString();
        java.lang.String str17 = parameter2.getValue();
        java.lang.String str18 = parameter2.getKey();
        java.lang.String str19 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str3, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str16, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "POST" + "'", str17, "POST");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"invalid_token\"" + "'", str18, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null  realm=\"invalid_token\"" + "'", str19, "null  realm=\"invalid_token\"");
    }

    @Test
    public void test1332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1332");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1333");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1334");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        oAuth2Accessor2.code = "HTTP response";
        java.lang.String str7 = oAuth2Accessor2.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1335");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(Authorization-Schesme=token_type, , [])", "OAuth2Message(POST, refresh_token, [])", "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(POST, refresh_token, [])" + "'", str4, "OAuth2Message(POST, refresh_token, [])");
    }

    @Test
    public void test1336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1336");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test1337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1337");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL");
    }

    @Test
    public void test1338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1338");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.URL;
        java.lang.String str14 = oAuth2Message5.getWWWAuthenticateHeader("redirect_uri_mismatch");
        java.lang.String str15 = oAuth2Message5.method;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message5.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message5.getHeaders();
        java.lang.String str19 = oAuth2Message5.getHeader("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        java.lang.String str20 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test1339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1339");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(DELETE, client_id, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1340");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str7 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token" + "'", str4, "token");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token" + "'", str7, "token");
    }

    @Test
    public void test1341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1341");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message4.getParameterMap();
        java.lang.String str10 = oAuth2Message4.getHeader("null  realm=\"redirect_uri_mismatch\"");
        java.lang.String str12 = oAuth2Message4.getHeader("none");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message4.getParameters();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strEntryList13);
    }

    @Test
    public void test1342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1342");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Client oAuth2Client14 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = oAuth2Accessor17.clone();
        oAuth2Client14.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str20 = oAuth2Client14.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor21);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList27 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str28 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        net.oauth.v2.OAuth2Message oAuth2Message29 = new net.oauth.v2.OAuth2Message("state", "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        oAuth2Accessor21.setProperty("Authorization-Schesme", (java.lang.Object) parameterList27);
        oAuth2Accessor21.state = "unsupported_grant_type";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(parameterList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test1343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1343");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.Object obj15 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        net.oauth.v2.OAuth2Client oAuth2Client17 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        oAuth2Accessor18.refreshToken = "assertion";
        java.lang.String str21 = oAuth2Accessor18.state;
        oAuth2Accessor18.accessToken = "code_and_token";
        oAuth2Accessor18.accessToken = "redirect_uri";
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2Exception", (java.lang.Object) "redirect_uri");
        java.lang.String str27 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test1344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1344");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("redirect_uri_mismatch");
    }

    @Test
    public void test1345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1345");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str7 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token" + "'", str4, "token");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid_grant" + "'", str7, "invalid_grant");
    }

    @Test
    public void test1346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1346");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("client_credentials", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str4 = parameter2.setValue("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("");
        boolean boolean7 = parameter2.equals((java.lang.Object) "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str4, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test1347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1347");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client7 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter12 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str13 = parameter12.toString();
        java.lang.String str15 = parameter12.setValue("access_denied");
        oAuth2Client7.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter12);
        oAuth2ProblemException0.setParameter("state", (java.lang.Object) oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.String str19 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2Client oAuth2Client21 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client21);
        java.lang.String str23 = oAuth2Accessor22.tokenType;
        java.lang.String str24 = oAuth2Accessor22.tokenType;
        java.lang.Object obj26 = oAuth2Accessor22.getProperty("client_secret");
        oAuth2Accessor22.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor22.code = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str31 = oAuth2Accessor22.accessToken;
        java.lang.String str32 = oAuth2Accessor22.refreshToken;
        java.lang.String str33 = oAuth2Accessor22.tokenType;
        oAuth2Client7.setProperty("unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) str33);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test1348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1348");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.code;
        oAuth2Accessor1.refreshToken = "DELETE";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1349");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "none=token");
    }

    @Test
    public void test1350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1350");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null%20%20realm%3D%22%22");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"\"" + "'", str1, "null  realm=\"\"");
    }

    @Test
    public void test1351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1351");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        int int15 = oAuth2ProblemException13.getHttpStatusCode();
        oAuth2Exception11.addSuppressed((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.lang.String str25 = oAuth2Message23.getHeader("");
        java.lang.String str26 = oAuth2Message23.URL;
        oAuth2ProblemException13.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str26);
        java.lang.Throwable[] throwableArray28 = oAuth2ProblemException13.getSuppressed();
        oAuth2Client3.setProperty("redirect_uri", (java.lang.Object) throwableArray28);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor30 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str31 = oAuth2Client3.clientId;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "token_type" + "'", str31, "token_type");
    }

    @Test
    public void test1352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1352");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.URL;
        java.lang.String str14 = oAuth2Message5.getWWWAuthenticateHeader("redirect_uri_mismatch");
        java.lang.String str15 = oAuth2Message5.method;
        java.lang.String str17 = oAuth2Message5.getWWWAuthenticateHeader("OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str18 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str17, "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test1353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1353");
        java.lang.String[] strArray12 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray12);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("state", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, inputStream16);
        java.lang.String str18 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.io.InputStream inputStream19 = null;
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("response_type", "scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, inputStream19);
        java.lang.String str21 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_client\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null  realm=\"invalid_client\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str21, "null  realm=\"invalid_client\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1354");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException1.setParameter("code", (java.lang.Object) parameterList8);
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = oAuth2ProblemException1.getParameters();
        java.lang.String str14 = oAuth2ProblemException1.getProblem();
        int int15 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
    }

    @Test
    public void test1355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1355");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.URL;
        oAuth2Message5.completeParameters();
        oAuth2Message5.URL = "none=invalid_client";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
    }

    @Test
    public void test1356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1356");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("", "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1357");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str5 = parameter2.setValue("refresh_token");
        java.lang.String str7 = parameter2.setValue("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "refresh_token" + "'", str7, "refresh_token");
    }

    @Test
    public void test1358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1358");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getParameter("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        java.lang.String str8 = oAuth2Message5.getCode();
        java.lang.String str9 = oAuth2Message5.URL;
        oAuth2Message5.method = "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1359");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2Accessor1.setProperty("response_type", (java.lang.Object) strMap17);
        java.lang.Object obj20 = oAuth2Accessor1.getProperty("Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = oAuth2Accessor1.clone();
        java.lang.Object obj23 = oAuth2Accessor1.getProperty("redirect_uri_mismatch");
        net.oauth.v2.OAuth2Client oAuth2Client24 = oAuth2Accessor1.client;
        oAuth2Accessor1.expires_in = "none=UTF-8";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
        org.junit.Assert.assertNull(obj23);
        org.junit.Assert.assertNull(oAuth2Client24);
    }

    @Test
    public void test1360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1360");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray2);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray2);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray2);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray2);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DELETE" + "'", str4, "DELETE");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertNotNull(parameterList7);
    }

    @Test
    public void test1361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1361");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("POST", "client_id");
        java.lang.String str3 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "POST" + "'", str3, "POST");
    }

    @Test
    public void test1362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1362");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.getKey();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int6 = oAuth2ProblemException5.getHttpStatusCode();
        java.lang.String str7 = oAuth2ProblemException5.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2ProblemException5.setParameter("code", (java.lang.Object) parameterList12);
        net.oauth.v2.OAuth2Client oAuth2Client18 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client18);
        oAuth2Accessor19.refreshToken = "assertion";
        oAuth2ProblemException5.setParameter("error_description", (java.lang.Object) oAuth2Accessor19);
        boolean boolean23 = parameter2.equals((java.lang.Object) oAuth2Accessor19);
        java.lang.String str24 = oAuth2Accessor19.expires_in;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test1363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1363");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme=error", "client_id");
    }

    @Test
    public void test1364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1364");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client7 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter12 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str13 = parameter12.toString();
        java.lang.String str15 = parameter12.setValue("access_denied");
        oAuth2Client7.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter12);
        oAuth2ProblemException0.setParameter("state", (java.lang.Object) oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.String str19 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter[] parameterArray25 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList26 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26, parameterArray25);
        net.oauth.v2.OAuth2Message oAuth2Message28 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.lang.String str30 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.lang.String str31 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        net.oauth.v2.OAuth2Message oAuth2Message32 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList26);
        java.util.Map<java.lang.String, java.lang.String> strMap33 = oAuth2Message32.getParameterMap();
        oAuth2Client7.setProperty("", (java.lang.Object) oAuth2Message32);
        java.lang.String str35 = oAuth2Message32.getClientId();
        java.lang.String str36 = oAuth2Message32.getClientId();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test1365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1365");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
    }

    @Test
    public void test1366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1366");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        oAuth2Accessor2.refreshToken = "client_credentials";
        oAuth2Accessor2.scope = "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test1367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1367");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.String str8 = oAuth2Accessor1.code;
        java.lang.String str9 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        java.lang.String str12 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" + "'", str12, "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
    }

    @Test
    public void test1368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1368");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "scope";
        oAuth2Accessor1.expires_in = "response_type";
        java.lang.String str9 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1369");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.redirectUri;
        java.lang.String str6 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str6, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1370");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message7.getParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message7.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message7.getParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message7.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message7.getHeaders();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test1371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1371");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.state;
        oAuth2Accessor1.refreshToken = "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1372");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.refreshToken = "null  realm=\"password\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1373");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("Authorization-Schesme=null&realm=none=UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Authorization-Schesme%3Dnull%26realm%3Dnone%3DUTF-8" + "'", str1, "Authorization-Schesme%3Dnull%26realm%3Dnone%3DUTF-8");
    }

    @Test
    public void test1374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1374");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj6 = oAuth2Accessor4.getProperty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str7 = oAuth2Accessor4.scope;
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1375");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        oAuth2Accessor9.accessToken = "Authorization-Schesme=token_type";
        oAuth2Accessor9.expires_in = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        java.lang.String str15 = oAuth2Accessor9.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor16 = oAuth2Accessor9.clone();
        java.lang.String str17 = oAuth2Accessor16.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str17, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
    }

    @Test
    public void test1376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1376");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("redirect_uri_mismatch");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "redirect_uri_mismatch" + "'", str1, "redirect_uri_mismatch");
    }

    @Test
    public void test1377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1377");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        java.lang.String str10 = oAuth2Accessor1.scope;
        oAuth2Accessor1.refreshToken = "net.oauth.v2.OAuth2Exception: HTTP request";
        oAuth2Accessor1.state = "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = oAuth2Accessor1.clone();
        java.lang.String str16 = oAuth2Accessor15.accessToken;
        java.lang.String str17 = oAuth2Accessor15.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(oAuth2Accessor15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1378");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1379");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        java.lang.Throwable[] throwableArray12 = oAuth2ProblemException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test1380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1380");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getKey();
        java.lang.String str8 = parameter2.toString();
        net.oauth.v2.OAuth2.Parameter parameter11 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2ProblemException: hi!", "PUT");
        boolean boolean12 = parameter2.equals((java.lang.Object) parameter11);
        java.lang.String str13 = parameter11.getKey();
        java.lang.String str15 = parameter11.setValue("");
        java.lang.String str16 = parameter11.getValue();
        boolean boolean18 = parameter11.equals((java.lang.Object) "net.oauth.v2.OAuth2ProblemException: none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str13, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PUT" + "'", str15, "PUT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test1381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1381");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("unsupported_response_type");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("Authorization-Schesme=null&realm=none=UTF-8", (java.lang.Throwable) oAuth2ProblemException2);
        int int4 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test1382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1382");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Client oAuth2Client7 = oAuth2Accessor1.client;
        java.lang.String str8 = oAuth2Accessor1.expires_in;
        java.lang.String str9 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(oAuth2Client7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1383");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        oAuth2Accessor1.scope = "HTTP status";
        java.lang.String str12 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1384");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.scope = "unsupported_response_type";
        oAuth2Accessor6.state = "token";
        oAuth2Accessor6.accessToken = "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1385");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1386");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "OAuth2Message(hi!, , [])";
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.tokenType = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1387");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        int int3 = oAuth2ProblemException0.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        int int9 = oAuth2ProblemException5.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        int int20 = oAuth2ProblemException18.getHttpStatusCode();
        oAuth2Exception16.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        int int23 = oAuth2ProblemException18.getHttpStatusCode();
        java.lang.String str24 = oAuth2ProblemException18.getProblem();
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        java.lang.Throwable[] throwableArray26 = oAuth2ProblemException0.getSuppressed();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertNotNull(throwableArray26);
    }

    @Test
    public void test1388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1388");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("null%20%20realm%3D%22net.oauth.v2.OAuth2ProblemException%253A%2520Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test1389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1389");
        java.lang.String[] strArray12 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray12);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("assertion", strArray12);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray12);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray12);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray12);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParametersAsFragment("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray12);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22%22", strArray12);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParameters("none=invalid_client", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str19, "null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "none=invalid_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str20, "none=invalid_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1390");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_grant_type" + "'", str4, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "username" + "'", str5, "username");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test1391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1391");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int9 = oAuth2ProblemException8.getHttpStatusCode();
        java.lang.String str10 = oAuth2ProblemException8.getProblem();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.lang.Throwable[] throwableArray13 = oAuth2ProblemException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test1392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1392");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.URL = "2.0";
        java.lang.String str11 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1393");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Client oAuth2Client16 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client18 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client18);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor20 = oAuth2Accessor19.clone();
        oAuth2Client16.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor20);
        java.lang.String str22 = oAuth2Client16.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor23 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        oAuth2Client3.setProperty("application%2Fx-www-form-urlencoded", (java.lang.Object) oAuth2Client16);
        java.lang.Object obj27 = oAuth2Client3.getProperty("Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Client oAuth2Client29 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor30 = new net.oauth.v2.OAuth2Accessor(oAuth2Client29);
        java.lang.String str31 = oAuth2Accessor30.tokenType;
        java.lang.String str32 = oAuth2Accessor30.refreshToken;
        java.lang.String str33 = oAuth2Accessor30.code;
        java.lang.Object obj35 = oAuth2Accessor30.getProperty("hi!");
        oAuth2Client3.setProperty("null  realm=\"invalid_token\"", (java.lang.Object) "hi!");
        java.lang.String str37 = oAuth2Client3.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor38 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "token_type" + "'", str37, "token_type");
    }

    @Test
    public void test1394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1394");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str14 = oAuth2Message8.getCode();
        java.lang.String str16 = oAuth2Message8.getParameter("null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1395");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("2.0", (java.lang.Throwable) oAuth2Exception2);
        java.lang.String str4 = oAuth2Exception2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2Exception: OAuth2Message(hi!, , [])" + "'", str4, "net.oauth.v2.OAuth2Exception: OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1396");
        net.oauth.v2.OAuth2.Parameter[] parameterArray5 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList6 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, parameterArray5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream12);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%22unsupported_grant_type%22", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null%20%20realm%3D%22unsupported_grant_type%22" + "'", str15, "null%20%20realm%3D%22unsupported_grant_type%22");
    }

    @Test
    public void test1397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1397");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1398");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer\"" + "'", str1, "null  realm=\"net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer\"");
    }

    @Test
    public void test1399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1399");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        oAuth2Accessor1.state = "\n";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1400");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Client oAuth2Client14 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = oAuth2Accessor17.clone();
        oAuth2Client14.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str20 = oAuth2Client14.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor21);
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = oAuth2ProblemException7.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception24 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.BaseTokenType baseTokenType26 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType26);
        net.oauth.v2.OAuth2.TokenType = baseTokenType26;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType26);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType26);
        net.oauth.v2.OAuth2.TokenType = baseTokenType26;
        oAuth2ProblemException7.setParameter("Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) baseTokenType26);
        net.oauth.v2.OAuth2.TokenType = baseTokenType26;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(baseTokenType26);
    }

    @Test
    public void test1401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1401");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "expires_in";
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        oAuth2Accessor1.state = "invalid_token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str8, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test1402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1402");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("Authorization-Schesme=error");
        oAuth2Accessor1.state = "code";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1403");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.code;
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception12);
        oAuth2Accessor1.setProperty("OAuth2Message(hi!, , [])", (java.lang.Object) oAuth2Exception13);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = oAuth2Accessor1.clone();
        oAuth2Accessor15.refreshToken = "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        java.lang.String str18 = oAuth2Accessor15.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str18, "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1404");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: hi!", "application%2Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\n" + "'", str7, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "client_credentials" + "'", str8, "client_credentials");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"" + "'", str12, "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
    }

    @Test
    public void test1405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1405");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        oAuth2Accessor7.setProperty("invalid_scope", (java.lang.Object) parameterList17);
        java.lang.String str19 = oAuth2Accessor7.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1406");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("authorization_code", (java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2Exception11);
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception11);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException15 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException15);
        int int17 = oAuth2ProblemException15.getHttpStatusCode();
        oAuth2Exception13.addSuppressed((java.lang.Throwable) oAuth2ProblemException15);
        net.oauth.v2.OAuth2.Parameter[] parameterArray22 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList23 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23, parameterArray22);
        net.oauth.v2.OAuth2Message oAuth2Message25 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23);
        java.lang.String str27 = oAuth2Message25.getHeader("");
        java.lang.String str28 = oAuth2Message25.URL;
        oAuth2ProblemException15.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str28);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException31 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception32 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException31);
        int int33 = oAuth2ProblemException31.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException31.addSuppressed((java.lang.Throwable) oAuth2Exception34);
        java.util.Map<java.lang.String, java.lang.Object> strMap36 = oAuth2ProblemException31.getParameters();
        oAuth2ProblemException15.addSuppressed((java.lang.Throwable) oAuth2ProblemException31);
        net.oauth.v2.OAuth2Exception oAuth2Exception38 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException40 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException40);
        int int42 = oAuth2ProblemException40.getHttpStatusCode();
        oAuth2ProblemException15.addSuppressed((java.lang.Throwable) oAuth2ProblemException40);
        int int44 = oAuth2ProblemException15.getHttpStatusCode();
        java.lang.String str45 = oAuth2ProblemException15.getProblem();
        net.oauth.v2.OAuth2Client oAuth2Client46 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor47 = new net.oauth.v2.OAuth2Accessor(oAuth2Client46);
        java.lang.String str48 = oAuth2Accessor47.tokenType;
        java.lang.String str49 = oAuth2Accessor47.tokenType;
        java.lang.Object obj51 = oAuth2Accessor47.getProperty("client_secret");
        oAuth2Accessor47.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Exception oAuth2Exception57 = new net.oauth.v2.OAuth2Exception("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception58 = new net.oauth.v2.OAuth2Exception("application%252Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2Exception57);
        oAuth2Accessor47.setProperty("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"", (java.lang.Object) oAuth2Exception57);
        oAuth2ProblemException15.addSuppressed((java.lang.Throwable) oAuth2Exception57);
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2ProblemException15);
        java.util.Map<java.lang.String, java.lang.Object> strMap62 = oAuth2ProblemException2.getParameters();
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        org.junit.Assert.assertNotNull(parameterArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 200 + "'", int44 == 200);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "hi!" + "'", str45, "hi!");
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNotNull(strMap62);
    }

    @Test
    public void test1407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1407");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        oAuth2Client3.setProperty("authorization_code", (java.lang.Object) oAuth2Exception14);
        net.oauth.v2.OAuth2Client oAuth2Client18 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client18);
        java.lang.String str20 = oAuth2Accessor19.tokenType;
        oAuth2Accessor19.tokenType = "response_type";
        oAuth2Accessor19.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str26 = oAuth2Accessor19.scope;
        java.lang.String str27 = oAuth2Accessor19.accessToken;
        oAuth2Accessor19.expires_in = "DELETE";
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor19);
        oAuth2Accessor19.tokenType = "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1408");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("client_secret");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, 108, 105, 101, 110, 116, 95, 115, 101, 99, 114, 101, 116]");
    }

    @Test
    public void test1409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1409");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Client oAuth2Client14 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = oAuth2Accessor17.clone();
        oAuth2Client14.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str20 = oAuth2Client14.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor21);
        java.lang.String str23 = oAuth2Accessor21.scope;
        oAuth2Accessor21.code = "null  realm=\"password\"";
        java.lang.String str26 = oAuth2Accessor21.refreshToken;
        java.lang.String str27 = oAuth2Accessor21.tokenType;
        oAuth2Accessor21.expires_in = "null  realm=\"Authorization-Schesme\"";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1410");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.state;
        oAuth2Accessor1.refreshToken = "UTF-8";
        oAuth2Accessor1.code = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1411");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("invalid_client");
        java.lang.String str6 = parameter2.toString();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int10 = oAuth2ProblemException9.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException9);
        java.lang.Class<?> wildcardClass12 = oAuth2ProblemException9.getClass();
        boolean boolean13 = parameter2.equals((java.lang.Object) wildcardClass12);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "none=UTF-8" + "'", str3, "none=UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "none=invalid_client" + "'", str6, "none=invalid_client");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(wildcardClass12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test1412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1412");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream8);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("URL", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str11 = oAuth2Message10.toString();
        java.lang.String str12 = oAuth2Message10.getCode();
        oAuth2Message10.completeParameters();
        java.lang.String str15 = oAuth2Message10.getHeader("net.oauth.v2.OAuth2Exception");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unsupported_grant_type" + "'", str7, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])" + "'", str11, "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1413");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("net.oauth.v2.OAuth2ProblemException: refresh_token");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 80, 114, 111, 98, 108, 101, 109, 69, 120, 99, 101, 112, 116, 105, 111, 110, 58, 32, 114, 101, 102, 114, 101, 115, 104, 95, 116, 111, 107, 101, 110]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: refresh_token" + "'", str2, "net.oauth.v2.OAuth2ProblemException: refresh_token");
    }

    @Test
    public void test1414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1414");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1415");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])");
    }

    @Test
    public void test1416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1416");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1417");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Client oAuth2Client16 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client18 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client18);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor20 = oAuth2Accessor19.clone();
        oAuth2Client16.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor20);
        java.lang.String str22 = oAuth2Client16.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor23 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        oAuth2Client3.setProperty("application%2Fx-www-form-urlencoded", (java.lang.Object) oAuth2Client16);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = oAuth2ProblemException27.getParameters();
        java.lang.Throwable[] throwableArray29 = oAuth2ProblemException27.getSuppressed();
        oAuth2Client16.setProperty("assertion", (java.lang.Object) oAuth2ProblemException27);
        java.lang.Object obj32 = oAuth2Client16.getProperty("");
        java.lang.String str33 = oAuth2Client16.clientSecret;
        java.lang.String str34 = oAuth2Client16.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str33, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "token_type" + "'", str34, "token_type");
    }

    @Test
    public void test1418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1418");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message%28POST%2C%20refresh_token%2C%20%5B%5D%29%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "OAuth2Message%28POST%2C%20refresh_token%2C%20%5B%5D%29%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1419");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.URL;
        java.lang.String str14 = oAuth2Message5.getWWWAuthenticateHeader("redirect_uri_mismatch");
        java.lang.String str15 = oAuth2Message5.method;
        oAuth2Message5.method = "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
    }

    @Test
    public void test1420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1420");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.URL;
        java.lang.String str14 = oAuth2Message5.getWWWAuthenticateHeader("redirect_uri_mismatch");
        java.lang.String str15 = oAuth2Message5.method;
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message5.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message5.getHeaders();
        java.lang.String str18 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GET" + "'", str18, "GET");
    }

    @Test
    public void test1421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1421");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "null  realm=\"\"";
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("assertion", strArray16);
        oAuth2Accessor1.setProperty("client_secret", (java.lang.Object) strArray16);
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception: HTTP request";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2ProblemException: access_denied";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1422");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("null  realm=\"code_and_token\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("client_id", "net.oauth.v2.OAuth2ProblemException: HTTP status 200", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str11 = oAuth2Message10.getCode();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null  realm=\"code_and_token\"" + "'", str8, "null  realm=\"code_and_token\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str9, "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1423");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 37, 50, 48, 37, 50, 48, 114, 101, 97, 108, 109, 37, 51, 68, 37, 50, 50, 105, 110, 118, 97, 108, 105, 100, 95, 116, 111, 107, 101, 110, 37, 50, 50, 61, 101, 120, 112, 105, 114, 101, 115, 95, 105, 110, 63, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 72, 84, 84, 80, 37, 50, 48, 115, 116, 97, 116, 117, 115]");
    }

    @Test
    public void test1424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1424");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "client_id");
    }

    @Test
    public void test1425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1425");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        int int21 = oAuth2ProblemException19.getHttpStatusCode();
        oAuth2Exception17.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException6);
        oAuth2Accessor1.accessToken = "password";
        java.lang.String str27 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor28 = oAuth2Accessor1.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(oAuth2Accessor28);
    }

    @Test
    public void test1426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1426");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor1.clone();
        oAuth2Accessor5.tokenType = "net.oauth.v2.OAuth2Exception: POST";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
    }

    @Test
    public void test1427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1427");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream8);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test1428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1428");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        oAuth2Accessor2.accessToken = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor2.code = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1429");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message12.getHeaders();
        java.lang.String str14 = oAuth2Message12.URL;
        java.lang.String str15 = oAuth2Message12.getCode();
        java.lang.String str17 = oAuth2Message12.getParameter("OAuth2Message(hi!, GET, [])");
        java.lang.String str19 = oAuth2Message12.getWWWAuthenticateHeader("null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "invalid_scope" + "'", str14, "invalid_scope");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null  realm=\"null%20%20realm%3D%22unauthorized_client%25253Fnet.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"" + "'", str19, "null  realm=\"null%20%20realm%3D%22unauthorized_client%25253Fnet.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
    }

    @Test
    public void test1430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1430");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception1);
    }

    @Test
    public void test1431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1431");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("client_credentials", "Authorization-Schesme=error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream12);
        java.io.OutputStream outputStream14 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9, outputStream14);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("bearer", "null%20%20realm%3D%22unsupported_grant_type%22", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream16);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParameters("OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\n" + "'", str10, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "client_credentials" + "'", str11, "client_credentials");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29" + "'", str19, "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29");
    }

    @Test
    public void test1432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1432");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "\ufffd\n";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str19 = oAuth2Message18.method;
        oAuth2Message18.method = "application%2Fx-www-form-urlencoded";
        java.lang.String str22 = oAuth2Message18.getClientId();
        oAuth2Accessor1.setProperty("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message18);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "unsupported_grant_type" + "'", str16, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "username" + "'", str17, "username");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1433");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str14 = oAuth2Message8.getClientId();
        oAuth2Message8.method = "\n";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1434");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Client3.setProperty("null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str9 = oAuth2Client3.redirectUri;
        java.lang.String str10 = oAuth2Client3.clientSecret;
        java.lang.String str11 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor12 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token" + "'", str9, "token");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_grant" + "'", str10, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token" + "'", str11, "token");
    }

    @Test
    public void test1435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1435");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"password\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: hi!", "null  realm=\"error_description%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1436");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        java.lang.String str3 = parameter2.toString();
        net.oauth.v2.OAuth2Client oAuth2Client4 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client4);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor5.clone();
        oAuth2Accessor6.state = "hi!";
        oAuth2Accessor6.tokenType = "unauthorized_client";
        boolean boolean11 = parameter2.equals((java.lang.Object) oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29" + "'", str3, "null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test1437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1437");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.refreshToken = "assertion_type";
        java.lang.String str14 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1438");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client7 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Client7.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter12 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str13 = parameter12.toString();
        java.lang.String str15 = parameter12.setValue("access_denied");
        oAuth2Client7.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter12);
        oAuth2ProblemException0.setParameter("state", (java.lang.Object) oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.Object obj20 = null;
        oAuth2Client7.setProperty("net.oauth.v2.OAuth2Exception: HTTP request", obj20);
        java.lang.String str22 = oAuth2Client7.clientId;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException25 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException25);
        int int27 = oAuth2ProblemException25.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException25.addSuppressed((java.lang.Throwable) oAuth2Exception28);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException31 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception28.addSuppressed((java.lang.Throwable) oAuth2ProblemException31);
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException31);
        net.oauth.v2.OAuth2Client oAuth2Client38 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client40 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor41 = new net.oauth.v2.OAuth2Accessor(oAuth2Client40);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor42 = oAuth2Accessor41.clone();
        oAuth2Client38.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor42);
        java.lang.String str44 = oAuth2Client38.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor45 = new net.oauth.v2.OAuth2Accessor(oAuth2Client38);
        oAuth2ProblemException31.setParameter("\ufffd\n", (java.lang.Object) oAuth2Accessor45);
        java.lang.String str47 = oAuth2Accessor45.scope;
        oAuth2Accessor45.code = "null  realm=\"password\"";
        oAuth2Client7.setProperty("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor45);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "token_type" + "'", str22, "token_type");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor42);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str44, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test1439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1439");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1440");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        java.io.InputStream inputStream3 = null;
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("OAuth2Message(, client_id, [])", "access_token", parameterCollection2, inputStream3);
        java.lang.String str5 = oAuth2Message4.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OAuth2Message(OAuth2Message(, client_id, []), access_token, [])" + "'", str5, "OAuth2Message(OAuth2Message(, client_id, []), access_token, [])");
    }

    @Test
    public void test1441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1441");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1442");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1443");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("unsupported_grant_type");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test1444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1444");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("state", "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream10);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1445");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("null  realm=\"client_secret\"", "HTTP status", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1446");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1447");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test1448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1448");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.BaseTokenType baseTokenType5 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType5;
        net.oauth.v2.OAuth2.TokenType = baseTokenType5;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType5);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType5);
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) baseTokenType5);
        org.junit.Assert.assertNotNull(baseTokenType5);
    }

    @Test
    public void test1449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1449");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        java.lang.String str9 = oAuth2Message7.getClientId();
        java.lang.String str10 = oAuth2Message7.method;
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_grant" + "'", str10, "invalid_grant");
    }

    @Test
    public void test1450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1450");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException1.setParameter("code", (java.lang.Object) parameterList8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = oAuth2ProblemException13.getParameters();
        java.lang.Throwable[] throwableArray15 = oAuth2ProblemException13.getSuppressed();
        int int16 = oAuth2ProblemException13.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException18.addSuppressed((java.lang.Throwable) oAuth2Exception20);
        int int22 = oAuth2ProblemException18.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException25 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException25);
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException25.addSuppressed((java.lang.Throwable) oAuth2Exception27);
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception27);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException31 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception32 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException31);
        int int33 = oAuth2ProblemException31.getHttpStatusCode();
        oAuth2Exception29.addSuppressed((java.lang.Throwable) oAuth2ProblemException31);
        oAuth2ProblemException18.addSuppressed((java.lang.Throwable) oAuth2ProblemException31);
        int int36 = oAuth2ProblemException31.getHttpStatusCode();
        java.lang.String str37 = oAuth2ProblemException31.getProblem();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2ProblemException31);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException31);
        net.oauth.v2.OAuth2Exception oAuth2Exception40 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException31);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(throwableArray15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 200 + "'", int33 == 200);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test1451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1451");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("client_credentials", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "client_credentials?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "client_credentials?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1452");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: Location", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream12);
        java.io.OutputStream outputStream14 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream14);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1453");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1454");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1455");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getKey();
        java.lang.String str8 = parameter2.toString();
        net.oauth.v2.OAuth2.Parameter parameter11 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2ProblemException: hi!", "PUT");
        boolean boolean12 = parameter2.equals((java.lang.Object) parameter11);
        java.lang.String str13 = parameter11.getKey();
        java.lang.String str14 = parameter11.getValue();
        net.oauth.v2.OAuth2Client oAuth2Client18 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str19 = oAuth2Client18.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter23 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str24 = parameter23.toString();
        java.lang.String str26 = parameter23.setValue("access_denied");
        oAuth2Client18.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter23);
        java.lang.String str28 = oAuth2Client18.clientSecret;
        java.lang.Object obj30 = oAuth2Client18.getProperty("application%2Fx-www-form-urlencoded");
        java.lang.String str31 = oAuth2Client18.clientId;
        java.lang.String str32 = oAuth2Client18.clientSecret;
        boolean boolean33 = parameter11.equals((java.lang.Object) oAuth2Client18);
        net.oauth.v2.BaseTokenType baseTokenType34 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType34);
        net.oauth.v2.OAuth2.TokenType = baseTokenType34;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType34);
        net.oauth.v2.OAuth2.TokenType = baseTokenType34;
        boolean boolean39 = parameter11.equals((java.lang.Object) baseTokenType34);
        net.oauth.v2.OAuth2.TokenType = baseTokenType34;
        net.oauth.v2.OAuth2.TokenType = baseTokenType34;
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str13, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PUT" + "'", str14, "PUT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Authorization-Schesme=token_type" + "'", str24, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "token_type" + "'", str26, "token_type");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str28, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "token_type" + "'", str31, "token_type");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str32, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(baseTokenType34);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test1456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1456");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str6, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test1457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1457");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])" + "'", str1, "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
    }

    @Test
    public void test1458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1458");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        int int15 = oAuth2ProblemException13.getHttpStatusCode();
        oAuth2Exception11.addSuppressed((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.lang.String str25 = oAuth2Message23.getHeader("");
        java.lang.String str26 = oAuth2Message23.URL;
        oAuth2ProblemException13.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str26);
        java.lang.Throwable[] throwableArray28 = oAuth2ProblemException13.getSuppressed();
        oAuth2Client3.setProperty("redirect_uri", (java.lang.Object) throwableArray28);
        net.oauth.v2.OAuth2Client oAuth2Client31 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor32 = new net.oauth.v2.OAuth2Accessor(oAuth2Client31);
        java.lang.String str33 = oAuth2Accessor32.tokenType;
        java.lang.String str34 = oAuth2Accessor32.tokenType;
        java.lang.Object obj36 = oAuth2Accessor32.getProperty("client_secret");
        oAuth2Accessor32.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor32.tokenType = "state";
        java.lang.String str41 = oAuth2Accessor32.accessToken;
        oAuth2Client3.setProperty("UTF-8", (java.lang.Object) str41);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor43 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        oAuth2Accessor43.tokenType = "Authorization-Schesme=error";
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(obj36);
        org.junit.Assert.assertNull(str41);
    }

    @Test
    public void test1459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1459");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null%20%20realm%3D%22net.oauth.v2.OAuth2ProblemException%253A%2520Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%2520%2520realm%253D%2522net.oauth.v2.OAuth2ProblemException%25253A%252520Location%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2522%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" + "'", str1, "null%2520%2520realm%253D%2522net.oauth.v2.OAuth2ProblemException%25253A%252520Location%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2522%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
    }

    @Test
    public void test1460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1460");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client9 = oAuth2Accessor1.client;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        java.lang.Class<?> wildcardClass11 = oAuth2Accessor10.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(oAuth2Client9);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test1461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1461");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("expires_in", strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1462");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "redirect_uri_mismatch";
        java.lang.String str12 = oAuth2Accessor1.state;
        java.lang.String str13 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1463");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        int int21 = oAuth2ProblemException19.getHttpStatusCode();
        oAuth2Exception17.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException6);
        oAuth2Accessor1.scope = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str27 = oAuth2Accessor1.scope;
        oAuth2Accessor1.scope = "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1464");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test1465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1465");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1466");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("none=UTF-8");
        java.lang.String str12 = oAuth2Message8.toString();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str9, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"none%3DUTF-8\"" + "'", str11, "null  realm=\"none%3DUTF-8\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str12, "OAuth2Message(Authorization-Schesme=token_type, , [])");
    }

    @Test
    public void test1467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1467");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("2.0", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("OAuth2Message(POST, access_token, [])", "access_denied", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str12 = oAuth2Message10.getHeader("net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str7, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2.0" + "'", str8, "2.0");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "unsupported_grant_type" + "'", str9, "unsupported_grant_type");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1468");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        oAuth2Accessor2.tokenType = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        oAuth2Accessor2.state = "application%2Fx-www-form-urlencoded";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test1469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1469");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("PUT", "unsupported_grant_type");
        java.lang.String str4 = parameter2.setValue("error_description");
        net.oauth.v2.OAuth2.Parameter parameter7 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str8 = parameter7.toString();
        java.lang.String str9 = parameter7.getKey();
        java.lang.String str10 = parameter7.getValue();
        boolean boolean11 = parameter2.equals((java.lang.Object) str10);
        java.lang.String str12 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_grant_type" + "'", str4, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme" + "'", str9, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "token_type" + "'", str10, "token_type");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "error_description" + "'", str12, "error_description");
    }

    @Test
    public void test1470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1470");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        java.lang.Object obj12 = oAuth2Client3.getProperty("UTF-8");
        java.lang.Object obj14 = oAuth2Client3.getProperty("unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str15 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test1471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1471");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        int int8 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        java.util.Map<java.lang.String, java.lang.Object> strMap11 = oAuth2ProblemException6.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int14 = oAuth2ProblemException13.getHttpStatusCode();
        java.lang.String str15 = oAuth2ProblemException13.getProblem();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException13);
        oAuth2ProblemException3.setParameter("redirect_uri_mismatch", (java.lang.Object) oAuth2ProblemException6);
        oAuth2Exception1.addSuppressed((java.lang.Throwable) oAuth2ProblemException3);
        java.lang.Throwable[] throwableArray19 = oAuth2Exception1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test1472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1472");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null  realm=\"2.0\"", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16, outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1473");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null%20%20realm%3D%22invalid_token%22=expires_in");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"invalid_token\"=expires_in" + "'", str1, "null  realm=\"invalid_token\"=expires_in");
    }

    @Test
    public void test1474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1474");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.String str7 = parameter2.setValue("client_secret");
        java.lang.String str9 = parameter2.setValue("Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none" + "'", str7, "none");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client_secret" + "'", str9, "client_secret");
    }

    @Test
    public void test1475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1475");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message5.getParameters();
        java.lang.String str10 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "2.0";
        java.lang.String str13 = oAuth2Message5.method;
        java.lang.String str15 = oAuth2Message5.getParameter("invalid_token");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntryList16);
    }

    @Test
    public void test1476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1476");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("redirect_uri", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HTTP request" + "'", str8, "HTTP request");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "redirect_uri" + "'", str11, "redirect_uri");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str12, "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test1477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1477");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str5 = parameter2.setValue("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str7 = parameter2.setValue("null  realm=\"null%20%20realm%3D%22unauthorized_client%25253Fnet.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str7, "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1478");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("error");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "error" + "'", str1, "error");
    }

    @Test
    public void test1479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1479");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor4.clone();
        java.lang.String str6 = oAuth2Accessor4.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1480");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2Accessor1.setProperty("response_type", (java.lang.Object) strMap17);
        java.lang.Object obj20 = oAuth2Accessor1.getProperty("Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = oAuth2Accessor1.clone();
        java.lang.Object obj23 = oAuth2Accessor21.getProperty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test1481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1481");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        int int6 = oAuth2ProblemException2.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException2.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("invalid_token", (java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = oAuth2ProblemException9.getParameters();
        java.lang.Throwable[] throwableArray11 = oAuth2ProblemException9.getSuppressed();
        java.lang.Throwable[] throwableArray12 = oAuth2ProblemException9.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        oAuth2Exception8.addSuppressed((java.lang.Throwable) oAuth2Exception13);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(throwableArray11);
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test1482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1482");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.toString();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str7 = parameter2.setValue("URL");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme=token_type" + "'", str4, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
    }

    @Test
    public void test1483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1483");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException: client_id" + "'", str1, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException: client_id");
    }

    @Test
    public void test1484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1484");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        java.lang.String str7 = oAuth2ProblemException1.getProblem();
        int int8 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test1485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1485");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        java.lang.String str10 = oAuth2Message7.getHeader("error_uri");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message7.getHeaders();
        java.lang.String str12 = oAuth2Message7.getCode();
        java.lang.String str13 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message7.getHeaders();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strEntryList14);
    }

    @Test
    public void test1486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1486");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        int int21 = oAuth2ProblemException19.getHttpStatusCode();
        oAuth2Exception17.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException6);
        java.lang.Class<?> wildcardClass25 = oAuth2ProblemException6.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test1487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1487");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("net.oauth.v2.OAuth2ProblemException: net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1488");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.scope = "unsupported_response_type";
        java.lang.String[] strArray20 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2.newList(strArray20);
        java.lang.String str22 = net.oauth.v2.OAuth2.addParameters("assertion", strArray20);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList23 = net.oauth.v2.OAuth2.newList(strArray20);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList24 = net.oauth.v2.OAuth2.newList(strArray20);
        oAuth2Accessor6.setProperty("HTTP request", (java.lang.Object) parameterList24);
        java.lang.String str26 = oAuth2Accessor6.scope;
        net.oauth.v2.OAuth2Client oAuth2Client27 = oAuth2Accessor6.client;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str22, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList23);
        org.junit.Assert.assertNotNull(parameterList24);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "unsupported_response_type" + "'", str26, "unsupported_response_type");
        org.junit.Assert.assertNull(oAuth2Client27);
    }

    @Test
    public void test1489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1489");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException11.addSuppressed((java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException17 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        int int19 = oAuth2ProblemException17.getHttpStatusCode();
        oAuth2Exception15.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2.Parameter[] parameterArray24 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList25 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25, parameterArray24);
        net.oauth.v2.OAuth2Message oAuth2Message27 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str29 = oAuth2Message27.getHeader("");
        java.lang.String str30 = oAuth2Message27.URL;
        oAuth2ProblemException17.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str30);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException33 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException33);
        int int35 = oAuth2ProblemException33.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException33.addSuppressed((java.lang.Throwable) oAuth2Exception36);
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = oAuth2ProblemException33.getParameters();
        oAuth2ProblemException17.addSuppressed((java.lang.Throwable) oAuth2ProblemException33);
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        java.lang.String str42 = oAuth2Exception41.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertNotNull(parameterArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str42, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1490");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.getClientId();
        java.lang.String str14 = oAuth2Message5.getClientId();
        java.lang.String str16 = oAuth2Message5.getParameter("assertion");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strEntryList17);
    }

    @Test
    public void test1491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1491");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("redirect_uri");
        net.oauth.v2.OAuth2Client oAuth2Client9 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client9);
        java.lang.String str11 = oAuth2Accessor10.tokenType;
        oAuth2Accessor10.expires_in = "GET";
        java.lang.String str14 = oAuth2Accessor10.expires_in;
        oAuth2Accessor2.setProperty("HTTP request", (java.lang.Object) oAuth2Accessor10);
        net.oauth.v2.OAuth2Client oAuth2Client16 = oAuth2Accessor2.client;
        oAuth2Accessor2.code = "null  realm=\"client_secret\"";
        java.lang.String str19 = oAuth2Accessor2.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(oAuth2Client16);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1492");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("2.0", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("redirect_uri", "assertion_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str6, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2.0" + "'", str7, "2.0");
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test1493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1493");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1494");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("error_uri");
        java.lang.String str9 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1495");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        java.lang.String str11 = oAuth2Accessor1.code;
        oAuth2Accessor1.tokenType = "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
    }

    @Test
    public void test1496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1496");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor4.clone();
        java.lang.String str6 = oAuth2Accessor4.code;
        java.lang.String str7 = oAuth2Accessor4.code;
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1497");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception15);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        int int21 = oAuth2ProblemException19.getHttpStatusCode();
        oAuth2Exception17.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2ProblemException19);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException6);
        oAuth2Accessor1.accessToken = "password";
        java.lang.String str27 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.code = "null  realm=\"none%3DUTF-8\"";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test1498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1498");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        oAuth2Accessor9.accessToken = "Authorization-Schesme=token_type";
        oAuth2Accessor9.expires_in = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        java.lang.String str15 = oAuth2Accessor9.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor16 = oAuth2Accessor9.clone();
        oAuth2Accessor9.accessToken = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        oAuth2Accessor9.code = "OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22";
        java.lang.String str21 = oAuth2Accessor9.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor16);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str21, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1499");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("state");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test1500");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(Authorization-Schesme=token_type, , [])", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        java.lang.Object obj5 = oAuth2Client3.getProperty("none=invalid_client");
        org.junit.Assert.assertNull(obj5);
    }
}

