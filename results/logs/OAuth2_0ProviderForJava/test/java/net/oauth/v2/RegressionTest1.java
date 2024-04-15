package net.oauth.v2;

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
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.URL = "2.0";
        oAuth2Message5.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message5.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strEntryList13);
    }

    @Test
    public void test0502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0502");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray4);
        java.io.InputStream inputStream10 = null;
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("null  realm=\"client_id\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream10);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(parameterList9);
    }

    @Test
    public void test0503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0503");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str10 = oAuth2Message5.getHeader("invalid_request");
        java.lang.String str11 = oAuth2Message5.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
        org.junit.Assert.assertNotNull(strEntryList12);
    }

    @Test
    public void test0504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0504");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0505");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("\ufffd\n", "OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0506");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.Throwable[] throwableArray3 = oAuth2Exception2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0507");
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
        java.lang.String str19 = oAuth2Message15.getHeader("\ufffd\n");
        java.lang.String str20 = oAuth2Message15.method;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "authorization_code" + "'", str20, "authorization_code");
    }

    @Test
    public void test0508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0508");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str4 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str5 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str6 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0509");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "response_type";
        java.lang.String str5 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0510");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        java.lang.String str10 = oAuth2Accessor9.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0511");
        net.oauth.v2.BaseTokenType baseTokenType0 = null;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
    }

    @Test
    public void test0512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0512");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "refresh_token" + "'", str4, "refresh_token");
    }

    @Test
    public void test0513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0513");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str9 = oAuth2Message4.getWWWAuthenticateHeader("code_and_token");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message4.getParameterMap();
        java.lang.String str12 = oAuth2Message4.getParameter("null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"code_and_token\"" + "'", str9, "null  realm=\"code_and_token\"");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0514");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str14 = oAuth2Message8.getClientId();
        java.lang.String str16 = oAuth2Message8.getWWWAuthenticateHeader("client_secret");
        java.lang.String str18 = oAuth2Message8.getParameter("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null  realm=\"client_secret\"" + "'", str16, "null  realm=\"client_secret\"");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0515");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0516");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.lang.String str10 = oAuth2Message8.method;
        oAuth2Message8.URL = "none=UTF-8";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0517");
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
        net.oauth.v2.OAuth2.Parameter[] parameterArray22 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList23 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23, parameterArray22);
        net.oauth.v2.OAuth2Message oAuth2Message25 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23);
        java.lang.String str27 = oAuth2Message25.getHeader("");
        java.lang.String str28 = oAuth2Message25.getClientId();
        oAuth2Message25.URL = "access_token";
        java.lang.String str31 = oAuth2Message25.getClientId();
        oAuth2Accessor17.setProperty("HTTP request", (java.lang.Object) oAuth2Message25);
        oAuth2Message25.URL = "OAuth2Message(POST, access_token, [])";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client18);
        org.junit.Assert.assertNotNull(parameterArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test0518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0518");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("error_uri");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Class<?> wildcardClass9 = obj8.getClass();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0519");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientId;
        java.lang.String str10 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "token_type" + "'", str10, "token_type");
    }

    @Test
    public void test0520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0520");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        oAuth2Accessor1.expires_in = "invalid_token";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        java.lang.String str11 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0521");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int15 = oAuth2ProblemException14.getHttpStatusCode();
        java.lang.String str16 = oAuth2ProblemException14.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        oAuth2ProblemException14.setParameter("code", (java.lang.Object) parameterList21);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = oAuth2ProblemException14.getParameters();
        boolean boolean27 = parameter8.equals((java.lang.Object) oAuth2ProblemException14);
        java.lang.String str28 = parameter8.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Authorization-Schesme" + "'", str28, "Authorization-Schesme");
    }

    @Test
    public void test0522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0522");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.lang.String str8 = oAuth2Message5.getWWWAuthenticateHeader("expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str8, "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0523");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str2, "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0524");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.expires_in = "null  realm=\"client_secret\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0525");
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
        int int23 = oAuth2ProblemException7.getHttpStatusCode();
        java.lang.String str24 = oAuth2ProblemException7.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "net.oauth.v2.OAuth2ProblemException: invalid_token" + "'", str24, "net.oauth.v2.OAuth2ProblemException: invalid_token");
    }

    @Test
    public void test0526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0526");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message12.getParameters();
        oAuth2Message12.method = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.method = "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str19 = oAuth2Message12.getParameter("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0527");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("none=invalid_client");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none%3Dinvalid_client" + "'", str1, "none%3Dinvalid_client");
    }

    @Test
    public void test0528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0528");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("username");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0529");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "redirect_uri", "invalid_scope");
        java.lang.Object obj5 = oAuth2Client3.getProperty("DELETE");
        java.lang.String[] strArray15 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray15);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.io.InputStream inputStream18 = null;
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, inputStream18);
        java.lang.String str21 = oAuth2Message19.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str22 = oAuth2Message19.URL;
        java.lang.String str23 = oAuth2Message19.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList24 = oAuth2Message19.getParameters();
        oAuth2Client3.setProperty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) strEntryList24);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(strArray15);
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null  realm=\"invalid_token\"" + "'", str21, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "invalid_scope" + "'", str22, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str23, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(strEntryList24);
    }

    @Test
    public void test0530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0530");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test0531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0531");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0532");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getClientId();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0533");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test0534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0534");
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
        java.lang.String str26 = oAuth2Client16.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        java.lang.String str28 = oAuth2Client16.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "token_type" + "'", str28, "token_type");
    }

    @Test
    public void test0535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0535");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "invalid_scope");
    }

    @Test
    public void test0536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0536");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("Authorization-Schesme=null&realm=none%3DUTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Authorization-Schesme=null&realm=none=UTF-8" + "'", str1, "Authorization-Schesme=null&realm=none=UTF-8");
    }

    @Test
    public void test0537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0537");
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
        oAuth2Accessor2.expires_in = "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
    }

    @Test
    public void test0538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0538");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        oAuth2Accessor1.scope = "URL";
        oAuth2Accessor1.scope = "DELETE";
        net.oauth.v2.OAuth2Client oAuth2Client12 = oAuth2Accessor1.client;
        java.lang.String str13 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str13, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test0539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0539");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException1.setParameter("code", (java.lang.Object) parameterList8);
        java.lang.Throwable[] throwableArray13 = oAuth2ProblemException1.getSuppressed();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0540");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DELETE" + "'", str5, "DELETE");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0541");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "OAuth2Message(DELETE, client_id, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0542");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("error_description", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0543");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP response" + "'", str7, "HTTP response");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0544");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str15 = oAuth2Message13.getParameter("Authorization-Schesme=error");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0545");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = null;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
    }

    @Test
    public void test0546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0546");
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
        oAuth2Accessor1.tokenType = "Authorization-Schesme";
        net.oauth.v2.OAuth2Client oAuth2Client22 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor23 = new net.oauth.v2.OAuth2Accessor(oAuth2Client22);
        java.lang.String str24 = oAuth2Accessor23.tokenType;
        oAuth2Accessor23.tokenType = "response_type";
        java.lang.String str27 = oAuth2Accessor23.state;
        java.lang.String str28 = oAuth2Accessor23.refreshToken;
        oAuth2Accessor23.tokenType = "username";
        oAuth2Accessor1.setProperty("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor23);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test0547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0547");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        oAuth2Message8.completeParameters();
        java.lang.String str10 = oAuth2Message8.toString();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(, client_id, [])" + "'", str10, "OAuth2Message(, client_id, [])");
    }

    @Test
    public void test0548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0548");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.oauth.v2.OAuth2.addParametersAsFragment("unauthorized_client", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0549");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Accessor2.code;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0550");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream15);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("username", "net.oauth.v2.OAuth2Exception: HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str12, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "refresh_token" + "'", str14, "refresh_token");
    }

    @Test
    public void test0551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0551");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message4.getParameterMap();
        java.lang.String str10 = oAuth2Message4.getHeader("null  realm=\"redirect_uri_mismatch\"");
        java.lang.String str11 = oAuth2Message4.getClientId();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0552");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        oAuth2Message4.method = "client_secret";
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0553");
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
        java.lang.String str25 = oAuth2Accessor1.state;
        oAuth2Accessor1.scope = "none=UTF-8";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test0554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0554");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException8.getParameters();
        boolean boolean10 = parameter2.equals((java.lang.Object) oAuth2ProblemException8);
        java.lang.String str11 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Authorization-Schesme" + "'", str11, "Authorization-Schesme");
    }

    @Test
    public void test0555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0555");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        java.lang.String str11 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0556");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.URL = "";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test0557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0557");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = oAuth2Exception1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str2, "net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0558");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29" + "'", str1, "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29");
    }

    @Test
    public void test0559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0559");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str14 = oAuth2Message8.getWWWAuthenticateHeader("client_id");
        java.lang.String str15 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str12, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"client_id\"" + "'", str14, "null  realm=\"client_id\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "client_id" + "'", str15, "client_id");
    }

    @Test
    public void test0560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0560");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        java.lang.String str10 = oAuth2Accessor1.scope;
        oAuth2Accessor1.accessToken = "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0561");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("Location");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Location" + "'", str1, "Location");
    }

    @Test
    public void test0562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0562");
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
        java.lang.String str17 = oAuth2Message5.getHeader("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        java.lang.String str18 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "hi!" + "'", str18, "hi!");
    }

    @Test
    public void test0563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0563");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"client_id\"");
    }

    @Test
    public void test0564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0564");
        net.oauth.v2.BaseResponseType baseResponseType0 = null;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
    }

    @Test
    public void test0565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0565");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.state = "client_secret";
        java.lang.String str9 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client_secret" + "'", str9, "client_secret");
    }

    @Test
    public void test0566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0566");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("access_denied");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "access_denied" + "'", str1, "access_denied");
    }

    @Test
    public void test0567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0567");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int5 = oAuth2ProblemException4.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException4.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray10 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList11 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, parameterArray10);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        oAuth2ProblemException4.setParameter("code", (java.lang.Object) parameterList11);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none=invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, inputStream16);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(parameterArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str18, "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
    }

    @Test
    public void test0568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0568");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.URL = "access_denied";
        java.lang.String str13 = oAuth2Message8.getParameter("net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0569");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0570");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0571");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj11 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2Exception: HTTP request");
        java.lang.Object obj13 = oAuth2Client3.getProperty("null  realm=\"access_denied\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test0572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0572");
        java.lang.Throwable throwable0 = null;
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception(throwable0);
    }

    @Test
    public void test0573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0573");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("refresh_token");
        java.lang.String str2 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: refresh_token" + "'", str2, "net.oauth.v2.OAuth2ProblemException: refresh_token");
    }

    @Test
    public void test0574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0574");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "assertion";
        oAuth2Accessor1.state = "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.scope = "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\n" + "'", str7, "\ufffd\n");
    }

    @Test
    public void test0575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0575");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.method;
        oAuth2Message8.method = "assertion";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DELETE" + "'", str13, "DELETE");
    }

    @Test
    public void test0576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0576");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.method = "OAuth2Message(hi!, , [])";
        java.lang.String str12 = oAuth2Message5.getWWWAuthenticateHeader("Authorization-Schesme");
        java.lang.String str14 = oAuth2Message5.getParameter("GET");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"Authorization-Schesme\"" + "'", str12, "null  realm=\"Authorization-Schesme\"");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0577");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str18 = oAuth2Message12.getParameter("error_uri");
        java.lang.String str19 = oAuth2Message12.getClientId();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0578");
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
        java.lang.String str25 = parameter2.setValue("expires_in");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList29 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str30 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList29);
        net.oauth.v2.OAuth2Message oAuth2Message31 = new net.oauth.v2.OAuth2Message("state", "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList29);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList29);
        boolean boolean33 = parameter2.equals((java.lang.Object) parameterList29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
        org.junit.Assert.assertNotNull(parameterList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test0579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0579");
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
        oAuth2Accessor1.state = "null  realm=\"none%3DUTF-8\"";
        java.lang.Object obj16 = oAuth2Accessor1.getProperty("OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test0580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0580");
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
        java.lang.String str16 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0581");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("unsupported_grant_type", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0582");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.lang.String str11 = oAuth2Message5.getClientId();
        java.lang.String str12 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test0583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0583");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.lang.String str15 = oAuth2Message8.getHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str17 = oAuth2Message8.getHeader("OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0584");
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
        java.lang.String str33 = oAuth2Exception32.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "net.oauth.v2.OAuth2Exception: " + "'", str33, "net.oauth.v2.OAuth2Exception: ");
    }

    @Test
    public void test0585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0585");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        java.lang.String str11 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
    }

    @Test
    public void test0586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0586");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0587");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor1.scope;
        java.lang.String str8 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0588");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0589");
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
        java.lang.String str15 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Authorization-Schesme=error" + "'", str15, "Authorization-Schesme=error");
    }

    @Test
    public void test0590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0590");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str11, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0591");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream15);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream18 = null;
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: refresh_token", "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream18);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str12, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "refresh_token" + "'", str14, "refresh_token");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test0592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0592");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        java.util.Map<java.lang.String, java.lang.Object> strMap34 = oAuth2ProblemException9.getParameters();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap34);
    }

    @Test
    public void test0593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0593");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.refreshToken = "HTTP request";
        oAuth2Accessor1.tokenType = "null  realm=\"invalid_token\"";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0594");
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
        oAuth2Message13.method = "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0595");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0596");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message12.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message12.getParameterMap();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0597");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "\n");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test0598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0598");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0599");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test0600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0600");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22invalid_token%22=expires_in", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0601");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0602");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        oAuth2Message8.method = "state";
        org.junit.Assert.assertNotNull(parameterList5);
    }

    @Test
    public void test0603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0603");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        net.oauth.v2.BaseTokenType baseTokenType9 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType9;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType9);
        oAuth2Accessor1.setProperty("code_and_token", (java.lang.Object) baseTokenType9);
        net.oauth.v2.OAuth2.TokenType = baseTokenType9;
        net.oauth.v2.OAuth2.TokenType = baseTokenType9;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(baseTokenType9);
    }

    @Test
    public void test0604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0604");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22invalid_token%22=POST", "HTTP status", "error_uri");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str4, "null%20%20realm%3D%22invalid_token%22=POST");
    }

    @Test
    public void test0605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0605");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("PUT", "unsupported_grant_type");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.toString();
        java.lang.String str5 = parameter2.toString();
        java.lang.String str6 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PUT" + "'", str3, "PUT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PUT=unsupported_grant_type" + "'", str4, "PUT=unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PUT=unsupported_grant_type" + "'", str5, "PUT=unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PUT" + "'", str6, "PUT");
    }

    @Test
    public void test0606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0606");
        java.lang.String[] strArray4 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%22invalid_token%22=expires_in", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str6, "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test0607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0607");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("Authorization-Schesme=error");
        oAuth2Accessor1.tokenType = "error_uri";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0608");
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
        java.lang.String str17 = parameter2.setValue("null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str3, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "POST" + "'", str17, "POST");
    }

    @Test
    public void test0609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0609");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("error_description", "net.oauth.v2.OAuth2Exception: POST");
    }

    @Test
    public void test0610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0610");
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
        java.lang.String str13 = oAuth2Message5.URL;
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0611");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("hi!", strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("refresh_token", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0612");
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
        oAuth2Accessor1.refreshToken = "net.oauth.v2.OAuth2Exception: HTTP request";
        java.lang.Object obj24 = oAuth2Accessor1.getProperty("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNull(obj24);
    }

    @Test
    public void test0613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0613");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0614");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.state = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0615");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test0616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0616");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        oAuth2Message8.method = "Authorization-Schesme=token_type";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0617");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "DELETE";
        java.lang.String str13 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.tokenType = "invalid_grant";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DELETE" + "'", str13, "DELETE");
    }

    @Test
    public void test0618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0618");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("password");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[112, 97, 115, 115, 119, 111, 114, 100]");
    }

    @Test
    public void test0619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0619");
        java.lang.String[] strArray4 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str7, "null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test0620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0620");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Client3.redirectUri;
        java.lang.String str12 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0621");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getParameter("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        java.lang.String str8 = oAuth2Message5.getCode();
        java.lang.String str10 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"" + "'", str10, "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"");
    }

    @Test
    public void test0622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0622");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientSecret;
        java.lang.Object obj15 = oAuth2Client3.getProperty("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str13, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0623");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str10 = oAuth2Message5.getHeader("invalid_request");
        java.lang.String str11 = oAuth2Message5.getCode();
        java.lang.String str12 = oAuth2Message5.method;
        java.lang.String str13 = oAuth2Message5.method;
        java.lang.String str14 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
    }

    @Test
    public void test0624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0624");
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
        java.lang.String str19 = oAuth2Message15.getClientId();
        oAuth2Message15.URL = "code";
        oAuth2Message15.method = "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0625");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("application%2Fx-www-form-urlencoded");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0626");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.code = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        java.lang.String str11 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.state = "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0627");
        java.lang.String[] strArray4 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str6, "net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str7, "net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "#net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str8, "#net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test0628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0628");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        java.lang.String str8 = oAuth2Accessor7.tokenType;
        java.lang.String str9 = oAuth2Accessor7.tokenType;
        java.lang.Object obj11 = oAuth2Accessor7.getProperty("client_secret");
        oAuth2Accessor7.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str14 = oAuth2Accessor7.scope;
        java.lang.String str15 = oAuth2Accessor7.code;
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception18);
        oAuth2Accessor7.setProperty("OAuth2Message(hi!, , [])", (java.lang.Object) oAuth2Exception19);
        java.lang.Throwable[] throwableArray21 = oAuth2Exception19.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception("null%20%20realm%3D%22invalid_token%22=expires_in", (java.lang.Throwable) oAuth2Exception19);
        boolean boolean23 = parameter2.equals((java.lang.Object) oAuth2Exception22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test0629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0629");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "scope";
        oAuth2Accessor1.accessToken = "expires_in";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0630");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("access_token");
        oAuth2Accessor1.code = "username";
        java.lang.String str11 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0631");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.getClientId();
        java.lang.String str11 = oAuth2Message5.getCode();
        java.lang.String str12 = oAuth2Message5.getClientId();
        java.lang.String str14 = oAuth2Message5.getHeader("null  realm=\"Authorization-Schesme\"");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0632");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("code");
    }

    @Test
    public void test0633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0633");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("invalid_client");
        java.lang.String str6 = parameter2.toString();
        java.lang.String[] strArray9 = new java.lang.String[] {};
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray9);
        boolean boolean14 = parameter2.equals((java.lang.Object) strArray9);
        java.lang.String str15 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "none=UTF-8" + "'", str3, "none=UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTF-8" + "'", str5, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "none=invalid_client" + "'", str6, "none=invalid_client");
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "DELETE" + "'", str11, "DELETE");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "none" + "'", str15, "none");
    }

    @Test
    public void test0634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0634");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("code_and_token");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "code_and_token" + "'", str1, "code_and_token");
    }

    @Test
    public void test0635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0635");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"redirect_uri_mismatch\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0636");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.code;
        oAuth2Accessor1.refreshToken = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\n" + "'", str7, "\ufffd\n");
    }

    @Test
    public void test0637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0637");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception33);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException37 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception38 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException37);
        net.oauth.v2.OAuth2Exception oAuth2Exception39 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException37.addSuppressed((java.lang.Throwable) oAuth2Exception39);
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception39);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException43 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception44 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException43);
        int int45 = oAuth2ProblemException43.getHttpStatusCode();
        oAuth2Exception41.addSuppressed((java.lang.Throwable) oAuth2ProblemException43);
        oAuth2Exception34.addSuppressed((java.lang.Throwable) oAuth2Exception41);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
    }

    @Test
    public void test0638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0638");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str9 = oAuth2Message5.getCode();
        java.lang.Class<?> wildcardClass10 = oAuth2Message5.getClass();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0639");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OAuth2Message(2.0, UTF-8, [])" + "'", str5, "OAuth2Message(2.0, UTF-8, [])");
    }

    @Test
    public void test0640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0640");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("", "null  realm=\"redirect_uri_mismatch\"");
    }

    @Test
    public void test0641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0641");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        oAuth2Accessor1.scope = "HTTP status";
        java.lang.String str12 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "authorization_code" + "'", str12, "authorization_code");
    }

    @Test
    public void test0642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0642");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("\ufffd\n", "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message4.URL = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        java.lang.String str7 = oAuth2Message4.getClientId();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0643");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("HTTP request");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HTTP%20request" + "'", str1, "HTTP%20request");
    }

    @Test
    public void test0644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0644");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0645");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.String str7 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0646");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0647");
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
        java.lang.String str18 = oAuth2Accessor17.refreshToken;
        java.lang.String str19 = oAuth2Accessor17.code;
        net.oauth.v2.OAuth2Client oAuth2Client21 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client21);
        java.lang.String str23 = oAuth2Accessor22.tokenType;
        java.lang.String str24 = oAuth2Accessor22.tokenType;
        java.lang.String str25 = oAuth2Accessor22.tokenType;
        oAuth2Accessor22.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str29 = oAuth2Accessor22.scope;
        oAuth2Accessor22.expires_in = "access_token";
        oAuth2Accessor17.setProperty("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor22);
        oAuth2Accessor17.expires_in = "none=UTF-8";
        net.oauth.v2.OAuth2Client oAuth2Client35 = oAuth2Accessor17.client;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(oAuth2Client35);
    }

    @Test
    public void test0648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0648");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.refreshToken = "";
        java.lang.String str8 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test0649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0649");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException10 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException10);
        int int12 = oAuth2ProblemException10.getHttpStatusCode();
        oAuth2Exception8.addSuppressed((java.lang.Throwable) oAuth2ProblemException10);
        net.oauth.v2.OAuth2.Parameter[] parameterArray17 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList18 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18, parameterArray17);
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.lang.String str22 = oAuth2Message20.getHeader("");
        java.lang.String str23 = oAuth2Message20.URL;
        oAuth2ProblemException10.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str23);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        int int28 = oAuth2ProblemException26.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException26.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = oAuth2ProblemException26.getParameters();
        oAuth2ProblemException10.addSuppressed((java.lang.Throwable) oAuth2ProblemException26);
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException10);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException35 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException35);
        int int37 = oAuth2ProblemException35.getHttpStatusCode();
        oAuth2ProblemException10.addSuppressed((java.lang.Throwable) oAuth2ProblemException35);
        net.oauth.v2.OAuth2Exception oAuth2Exception39 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer", (java.lang.Throwable) oAuth2ProblemException35);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList46 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str47 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList46);
        java.lang.String str48 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList46);
        net.oauth.v2.OAuth2Message oAuth2Message49 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList46);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList50 = oAuth2Message49.getParameters();
        oAuth2Message49.method = "DELETE";
        oAuth2Message49.completeParameters();
        java.lang.String str54 = oAuth2Message49.getClientId();
        java.lang.String str55 = oAuth2Message49.getCode();
        java.lang.String str57 = oAuth2Message49.getHeader("redirect_uri_mismatch");
        java.lang.String str58 = oAuth2Message49.toString();
        oAuth2ProblemException35.setParameter("none=UTF-8", (java.lang.Object) oAuth2Message49);
        java.util.Map<java.lang.String, java.lang.Object> strMap60 = oAuth2ProblemException35.getParameters();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(parameterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 200 + "'", int37 == 200);
        org.junit.Assert.assertNotNull(parameterList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "unsupported_grant_type" + "'", str47, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "username" + "'", str48, "username");
        org.junit.Assert.assertNotNull(strEntryList50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str58, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertNotNull(strMap60);
    }

    @Test
    public void test0650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0650");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("none");
    }

    @Test
    public void test0651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0651");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%22invalid_token%22=expires_in", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0652");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(oAuth2Client6);
    }

    @Test
    public void test0653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0653");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray3);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("refresh_token", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DELETE" + "'", str5, "DELETE");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "refresh_token" + "'", str6, "refresh_token");
    }

    @Test
    public void test0654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0654");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str14 = oAuth2Message8.getHeader("");
        java.lang.String str15 = oAuth2Message8.getCode();
        java.lang.String str17 = oAuth2Message8.getWWWAuthenticateHeader("access_denied");
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"access_denied\"" + "'", str17, "null  realm=\"access_denied\"");
    }

    @Test
    public void test0655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0655");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        oAuth2ProblemException0.setParameter("application%252Fx-www-form-urlencoded", (java.lang.Object) "Location");
        java.lang.String str16 = oAuth2ProblemException0.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2ProblemException: HTTP status 200" + "'", str16, "net.oauth.v2.OAuth2ProblemException: HTTP status 200");
    }

    @Test
    public void test0656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0656");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("UTF-8", "null  realm=\"password\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        oAuth2Message8.URL = "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])";
        org.junit.Assert.assertNotNull(parameterList5);
    }

    @Test
    public void test0657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0657");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj6 = oAuth2Client3.getProperty("hi!");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0658");
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
        java.lang.String str19 = oAuth2Accessor18.tokenType;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0659");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("OAuth2Message(POST, access_token, [])", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream9);
        java.io.OutputStream outputStream11 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream11);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP status" + "'", str6, "HTTP status");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unauthorized_client" + "'", str7, "unauthorized_client");
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0660");
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
        java.lang.String str24 = oAuth2Client23.redirectUri;
        java.lang.Object obj26 = oAuth2Client23.getProperty("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0661");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0662");
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
        oAuth2Accessor6.scope = "net.oauth.v2.OAuth2ProblemException: Location";
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
    }

    @Test
    public void test0663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0663");
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
        java.lang.String str15 = parameter11.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str13, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "PUT" + "'", str14, "PUT");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT" + "'", str15, "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT");
    }

    @Test
    public void test0664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0664");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\n" + "'", str3, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0665");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0666");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = oAuth2Message4.getParameters();
        java.lang.String str6 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strEntryList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2.0" + "'", str6, "2.0");
    }

    @Test
    public void test0667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0667");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2ProblemException1.setParameter("OAuth2Message(hi!, GET, [])", (java.lang.Object) "HTTP status");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        int int8 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0668");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        oAuth2Accessor2.code = "HTTP response";
        java.lang.String str7 = oAuth2Accessor2.expires_in;
        oAuth2Accessor2.expires_in = "2.0";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0669");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0670");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 37, 50, 48, 37, 50, 48, 114, 101, 97, 108, 109, 37, 51, 68, 37, 50, 50, 105, 110, 118, 97, 108, 105, 100, 95, 116, 111, 107, 101, 110, 37, 50, 50, 61, 101, 120, 112, 105, 114, 101, 115, 95, 105, 110, 63, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
    }

   
    @Test
    public void test0672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0672");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0673");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "DELETE";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0674");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        oAuth2Accessor1.accessToken = "code_and_token";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        java.lang.String str8 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "code_and_token" + "'", str8, "code_and_token");
    }

    @Test
    public void test0675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0675");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test0676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0676");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int5 = oAuth2ProblemException4.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException4.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray10 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList11 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, parameterArray10);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        oAuth2ProblemException4.setParameter("code", (java.lang.Object) parameterList11);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str18 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParameters("error_description", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.io.OutputStream outputStream20 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11, outputStream20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(parameterArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "error_description" + "'", str19, "error_description");
    }

    @Test
    public void test0677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0677");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap13 = oAuth2ProblemException8.getParameters();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0678");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22invalid_token%22=POST", "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: refresh_token");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0679");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException0);
        java.lang.String str19 = oAuth2ProblemException0.getProblem();
        net.oauth.v2.OAuth2Client oAuth2Client24 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client26 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = new net.oauth.v2.OAuth2Accessor(oAuth2Client26);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor28 = oAuth2Accessor27.clone();
        oAuth2Client24.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor28);
        java.lang.String[] strArray37 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList38 = net.oauth.v2.OAuth2.newList(strArray37);
        oAuth2Accessor28.setProperty("invalid_scope", (java.lang.Object) parameterList38);
        oAuth2ProblemException0.setParameter("null  realm=\"Authorization-Schesme\"", (java.lang.Object) "invalid_scope");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(oAuth2Accessor28);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertNotNull(parameterList38);
    }

    @Test
    public void test0680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0680");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        int int4 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("token_type", (java.lang.Throwable) oAuth2ProblemException2);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException2.getParameters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0681");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("token_type", "OAuth2Message(POST, refresh_token, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Authorization-Schesme\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "unsupported_grant_type" + "'", str9, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "username" + "'", str10, "username");
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"Authorization-Schesme\"" + "'", str15, "null  realm=\"Authorization-Schesme\"");
    }

    @Test
    public void test0682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0682");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.lang.String str11 = oAuth2Message7.method;
        java.lang.String str12 = oAuth2Message7.getCode();
        java.lang.String str14 = oAuth2Message7.getParameter("none=invalid_client");
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0683");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException35 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        java.lang.String str36 = oAuth2ProblemException35.getProblem();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2ProblemException35);
        net.oauth.v2.OAuth2Client oAuth2Client42 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client44 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor45 = new net.oauth.v2.OAuth2Accessor(oAuth2Client44);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor46 = oAuth2Accessor45.clone();
        oAuth2Client42.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor46);
        java.lang.String str48 = oAuth2Client42.clientSecret;
        java.lang.String str49 = oAuth2Client42.redirectUri;
        java.lang.Object obj51 = oAuth2Client42.getProperty("UTF-8");
        java.lang.Object obj53 = oAuth2Client42.getProperty("\n");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor54 = new net.oauth.v2.OAuth2Accessor(oAuth2Client42);
        oAuth2ProblemException9.setParameter("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", (java.lang.Object) oAuth2Client42);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error_uri" + "'", str36, "error_uri");
        org.junit.Assert.assertNotNull(oAuth2Accessor46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str48, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "" + "'", str49, "");
        org.junit.Assert.assertNull(obj51);
        org.junit.Assert.assertNull(obj53);
    }

    @Test
    public void test0684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0684");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(DELETE, client_id, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0685");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("2.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2.0" + "'", str1, "2.0");
    }

    @Test
    public void test0686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0686");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.expires_in = "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0687");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"", "username", "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0688");
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
        java.lang.String str17 = oAuth2Accessor16.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Authorization-Schesme=token_type" + "'", str17, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0689");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test0690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0690");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22invalid_token%22=POST", "HTTP status", "error_uri");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTTP status" + "'", str4, "HTTP status");
    }

    @Test
    public void test0691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0691");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.lang.String str11 = oAuth2Message8.getParameter("OAuth2Message(Authorization-Schesme=token_type, , [])");
        java.lang.String str12 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "URL" + "'", str12, "URL");
    }

    @Test
    public void test0692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0692");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        net.oauth.v2.OAuth2Message oAuth2Message3 = new net.oauth.v2.OAuth2Message("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", "PUT%3Dunsupported_grant_type", parameterCollection2);
    }

    @Test
    public void test0693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0693");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("OAuth2Message(hi!, , [])");
        java.lang.String str8 = oAuth2Accessor2.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0694");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("OAuth2Message(DELETE, client_id, [])", "assertion");
        java.lang.String str3 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str3, "OAuth2Message(DELETE, client_id, [])");
    }

    @Test
    public void test0695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0695");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message12.getParameterMap();
        java.lang.String str17 = oAuth2Message12.getWWWAuthenticateHeader("\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str17, "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0696");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
    }

    @Test
    public void test0697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0697");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray11);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray11);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParametersAsFragment("application/x-www-form-urlencoded", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0698");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        java.lang.Object obj5 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test0699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0699");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getParameter("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        java.lang.String str8 = oAuth2Message5.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message5.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test0700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0700");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        net.oauth.v2.OAuth2.Parameter[] parameterArray8 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList9 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, parameterArray8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str13 = oAuth2Message11.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message11.getHeaders();
        oAuth2Message11.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message11.getParameters();
        java.lang.String str18 = oAuth2Message11.toString();
        oAuth2Accessor2.setProperty("", (java.lang.Object) oAuth2Message11);
        java.lang.String str20 = oAuth2Message11.getCode();
        java.lang.String str21 = oAuth2Message11.toString();
        java.lang.String str22 = oAuth2Message11.getClientId();
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str18, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str21, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0701");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0702");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        oAuth2Message12.completeParameters();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0703");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("#net.oauth.v2.OAuth2Exception=HTTP%20status", "none%3Dinvalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str8, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test0704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0704");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0705");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        int int6 = oAuth2ProblemException4.getHttpStatusCode();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException4);
        java.lang.String str8 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str8, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test0706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0706");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream10);
        java.lang.Class<?> wildcardClass12 = parameterList4.getClass();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "token_type" + "'", str8, "token_type");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test0707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0707");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0708");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        java.util.Map<java.lang.String, java.lang.String> strMap11 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0709");
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
        oAuth2Message13.method = "HTTP status";
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0710");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[117, 115, 101, 114, 110, 97, 109, 101, 35, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114, 38, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
    }

    @Test
    public void test0711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0711");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "null  realm=\"redirect_uri_mismatch\"";
        oAuth2Accessor1.accessToken = "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0712");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "redirect_uri", "invalid_scope");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_scope" + "'", str4, "invalid_scope");
    }

    @Test
    public void test0713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0713");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("none", strArray8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0714");
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
        net.oauth.v2.OAuth2Client oAuth2Client16 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client16);
        java.lang.String str18 = oAuth2Accessor17.tokenType;
        java.lang.String str19 = oAuth2Accessor17.tokenType;
        java.lang.String str20 = oAuth2Accessor17.tokenType;
        oAuth2Accessor17.accessToken = "";
        net.oauth.v2.OAuth2Client oAuth2Client23 = oAuth2Accessor17.client;
        boolean boolean24 = parameter2.equals((java.lang.Object) oAuth2Client23);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str3, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(oAuth2Client23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0715");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "error_description";
        oAuth2Accessor1.code = "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test0716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0716");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DELETE" + "'", str13, "DELETE");
        org.junit.Assert.assertNotNull(strEntryList14);
    }

    @Test
    public void test0717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0717");
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
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList35 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"none%3DUTF-8\"");
        java.lang.String str36 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList35);
        oAuth2Client16.setProperty("access_token", (java.lang.Object) str36);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertNotNull(parameterList35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Authorization-Schesme=null&realm=none%3DUTF-8" + "'", str36, "Authorization-Schesme=null&realm=none%3DUTF-8");
    }

    @Test
    public void test0718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0718");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0719");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"client_id\"");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0720");
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
        java.lang.Object obj18 = oAuth2Client3.getProperty("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0721");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str14 = oAuth2Message8.getWWWAuthenticateHeader("null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.lang.String str16 = oAuth2Message8.getHeader("invalid_scope");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str12, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"" + "'", str14, "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0722");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        oAuth2Accessor1.refreshToken = "null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0723");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22" + "'", str1, "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22");
    }

    @Test
    public void test0724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0724");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.state;
        oAuth2Accessor2.scope = "unsupported_response_type";
        java.lang.String str8 = oAuth2Accessor2.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0725");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException10 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException10);
        int int12 = oAuth2ProblemException10.getHttpStatusCode();
        oAuth2Exception8.addSuppressed((java.lang.Throwable) oAuth2ProblemException10);
        net.oauth.v2.OAuth2.Parameter[] parameterArray17 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList18 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18, parameterArray17);
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.lang.String str22 = oAuth2Message20.getHeader("");
        java.lang.String str23 = oAuth2Message20.URL;
        oAuth2ProblemException10.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str23);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        int int28 = oAuth2ProblemException26.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException26.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = oAuth2ProblemException26.getParameters();
        oAuth2ProblemException10.addSuppressed((java.lang.Throwable) oAuth2ProblemException26);
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException10);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException35 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException35);
        int int37 = oAuth2ProblemException35.getHttpStatusCode();
        oAuth2ProblemException10.addSuppressed((java.lang.Throwable) oAuth2ProblemException35);
        net.oauth.v2.OAuth2Exception oAuth2Exception39 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer", (java.lang.Throwable) oAuth2ProblemException35);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList46 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str47 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList46);
        java.lang.String str48 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList46);
        net.oauth.v2.OAuth2Message oAuth2Message49 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList46);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList50 = oAuth2Message49.getParameters();
        oAuth2Message49.method = "DELETE";
        oAuth2Message49.completeParameters();
        java.lang.String str54 = oAuth2Message49.getClientId();
        java.lang.String str55 = oAuth2Message49.getCode();
        java.lang.String str57 = oAuth2Message49.getHeader("redirect_uri_mismatch");
        java.lang.String str58 = oAuth2Message49.toString();
        oAuth2ProblemException35.setParameter("none=UTF-8", (java.lang.Object) oAuth2Message49);
        java.lang.String str60 = oAuth2ProblemException35.getProblem();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(parameterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 200 + "'", int37 == 200);
        org.junit.Assert.assertNotNull(parameterList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "unsupported_grant_type" + "'", str47, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "username" + "'", str48, "username");
        org.junit.Assert.assertNotNull(strEntryList50);
        org.junit.Assert.assertNull(str54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str58, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "hi!" + "'", str60, "hi!");
    }

    @Test
    public void test0726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0726");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0727");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        java.lang.Class<?> wildcardClass5 = oAuth2Accessor1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0728");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        oAuth2Message8.URL = "HTTP request";
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0729");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0730");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.redirectUri;
        java.lang.Object obj7 = oAuth2Client3.getProperty("unauthorized_client");
        oAuth2Client3.setProperty("null  realm=\"code_and_token\"", (java.lang.Object) (short) 10);
        java.lang.String str11 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0731");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str14 = oAuth2Message8.getClientId();
        java.lang.String str16 = oAuth2Message8.getHeader("null  realm=\"\"");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0732");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test0733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0733");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception24 = new net.oauth.v2.OAuth2Exception("null%20%20realm%3D%22invalid_token%22=POST", (java.lang.Throwable) oAuth2ProblemException9);
        java.lang.Throwable[] throwableArray25 = oAuth2Exception24.getSuppressed();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(throwableArray25);
    }

    @Test
    public void test0734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0734");
        net.oauth.v2.BaseTokenType baseTokenType0 = null;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
    }

    @Test
    public void test0735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0735");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"code_and_token\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0736");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0737");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"");
    }

    @Test
    public void test0738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0738");
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
        java.lang.String str18 = oAuth2Client3.redirectUri;
        java.lang.String str19 = oAuth2Client3.redirectUri;
        java.lang.String str20 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "token_type" + "'", str20, "token_type");
    }

    @Test
    public void test0739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0739");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("POST");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[80, 79, 83, 84]");
    }

    @Test
    public void test0740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0740");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test0741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0741");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0742");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.accessToken = "hi!";
        oAuth2Accessor1.tokenType = "code";
        java.lang.String str8 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "code" + "'", str8, "code");
    }

    @Test
    public void test0743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0743");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.String str14 = oAuth2Client3.clientSecret;
        java.lang.String str15 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str14, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test0744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0744");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("assertion", strArray8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("error_description", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
    }

    @Test
    public void test0745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0745");
        java.lang.String[] strArray7 = new java.lang.String[] { "password", "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "redirect_uri_mismatch", "net.oauth.v2.OAuth2ProblemException: client_id", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" };
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str8, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str9, "access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
    }

    @Test
    public void test0746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0746");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("username");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "username" + "'", str1, "username");
    }

    @Test
    public void test0747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0747");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2ProblemException7.setParameter("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor22);
        java.lang.String str24 = oAuth2Accessor22.state;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0748");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = oAuth2ProblemException1.getParameters();
        java.lang.Class<?> wildcardClass4 = oAuth2ProblemException1.getClass();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Location" + "'", str2, "Location");
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0749");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str14 = oAuth2Message8.getClientId();
        java.lang.String str16 = oAuth2Message8.getHeader("null  realm=\"\"");
        java.lang.String str17 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "client_id" + "'", str17, "client_id");
    }

    @Test
    public void test0750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0750");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("scope", "state");
    }

    @Test
    public void test0751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0751");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream5 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream5);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("null  realm=\"password\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"password\"" + "'", str9, "null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0752");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2ProblemException1.setParameter("OAuth2Message(hi!, GET, [])", (java.lang.Object) "HTTP status");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0753");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("client_credentials");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0754");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("client_credentials", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str7 = parameter2.setValue("application%2Fx-www-form-urlencoded");
        java.lang.String str8 = parameter2.toString();
        java.lang.String str9 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str3, "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str5, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str7, "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "client_credentials=application%252Fx-www-form-urlencoded" + "'", str8, "client_credentials=application%252Fx-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client_credentials" + "'", str9, "client_credentials");
    }

    @Test
    public void test0755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0755");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "";
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "token_type";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0756");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.expires_in = "";
        java.lang.String str11 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0757");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        oAuth2Accessor7.refreshToken = "assertion";
        java.lang.String str10 = oAuth2Accessor7.state;
        oAuth2ProblemException1.setParameter("error_uri", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str12 = oAuth2Accessor7.refreshToken;
        java.lang.String str13 = oAuth2Accessor7.code;
        oAuth2Accessor7.accessToken = "refresh_token";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion" + "'", str12, "assertion");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0758");
        java.lang.String[] strArray2 = new java.lang.String[] {};
        java.lang.String str3 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray2);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray2);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DELETE" + "'", str4, "DELETE");
        org.junit.Assert.assertNotNull(parameterList5);
    }

    @Test
    public void test0759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0759");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str5 = parameter2.setValue("refresh_token");
        java.lang.String str6 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme=refresh_token" + "'", str6, "Authorization-Schesme=refresh_token");
    }

    @Test
    public void test0760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0760");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        oAuth2Message10.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0761");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        java.lang.String str9 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0762");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("error");
        java.lang.String str8 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "error" + "'", str8, "error");
    }

    @Test
    public void test0763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0763");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("2.0", (java.lang.Throwable) oAuth2Exception2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception2);
    }

    @Test
    public void test0764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0764");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "OAuth2Message(scope, DELETE, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0765");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray5);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("URL", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "URL" + "'", str11, "URL");
    }

    @Test
    public void test0766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0766");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.toString();
        java.lang.String str7 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme=token_type" + "'", str6, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme=token_type" + "'", str7, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0767");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = oAuth2Message4.getParameters();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNotNull(strEntryList6);
    }

    @Test
    public void test0768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0768");
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
        oAuth2Accessor7.state = "unsupported_grant_type";
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
    }

    @Test
    public void test0769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0769");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP status", strArray5);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "invalid_request" + "'", str8, "invalid_request");
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP status" + "'", str10, "HTTP status");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0770");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[79, 65, 117, 116, 104, 50, 77, 101, 115, 115, 97, 103, 101, 40, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 114, 101, 115, 112, 111, 110, 115, 101, 95, 116, 121, 112, 101, 44, 32, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 44, 32, 91, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 44, 32, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 44, 32, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114, 93, 41]");
    }

    @Test
    public void test0771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0771");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null%20%20realm%3D%22invalid_token%22=POST", "OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0772");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test0773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0773");
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
        java.lang.String str17 = oAuth2Message13.getClientId();
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0774");
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
        java.lang.String str24 = oAuth2Message15.getParameter("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
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
    public void test0775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0775");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.String str3 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str3, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test0776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0776");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
    }

    @Test
    public void test0777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0777");
        java.lang.String[] strArray4 = new java.lang.String[] { "response_type" };
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("bearer", strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str5, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "bearer" + "'", str6, "bearer");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2Exception" + "'", str7, "net.oauth.v2.OAuth2Exception");
    }

    @Test
    public void test0778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0778");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Throwable) oAuth2ProblemException2);
    }

    @Test
    public void test0779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0779");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        oAuth2Accessor7.setProperty("invalid_scope", (java.lang.Object) parameterList17);
        oAuth2Accessor7.accessToken = "none=UTF-8";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
    }

    @Test
    public void test0780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0780");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.String str7 = oAuth2Accessor2.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0781");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.String str8 = oAuth2Accessor1.code;
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "password";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0782");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        java.lang.Object obj12 = oAuth2Client3.getProperty("UTF-8");
        java.lang.Object obj14 = oAuth2Client3.getProperty("\n");
        java.lang.Object obj16 = oAuth2Client3.getProperty("application/x-www-form-urlencoded");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException21 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap22 = oAuth2ProblemException21.getParameters();
        java.lang.Throwable[] throwableArray23 = oAuth2ProblemException21.getSuppressed();
        java.lang.Throwable[] throwableArray24 = oAuth2ProblemException21.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception25 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException21);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = oAuth2ProblemException21.getParameters();
        oAuth2ProblemException19.setParameter("error", (java.lang.Object) oAuth2ProblemException21);
        oAuth2Client3.setProperty("null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) "error");
        oAuth2Client3.setProperty("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) "\ufffd\n");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(throwableArray24);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test0783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0783");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22net.oauth.v2.OAuth2ProblemException%253A%2520Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%20%20realm%3D%22net.oauth.v2.OAuth2ProblemException%253A%2520Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0784");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream6);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("redirect_uri_mismatch", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "redirect_uri_mismatch" + "'", str10, "redirect_uri_mismatch");
    }

    @Test
    public void test0785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0785");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("client_credentials", "Authorization-Schesme=error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream11);
        java.io.OutputStream outputStream13 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream13);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("bearer", "null%20%20realm%3D%22unsupported_grant_type%22", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream15);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.OutputStream outputStream18 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "\ufffd\n" + "'", str9, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "client_credentials" + "'", str10, "client_credentials");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0786");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int3 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException2);
        int int5 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2.Parameter parameter9 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str10 = parameter9.toString();
        java.lang.String str11 = parameter9.getKey();
        oAuth2ProblemException2.setParameter("\n", (java.lang.Object) str11);
        net.oauth.v2.OAuth2Client oAuth2Client17 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str18 = oAuth2Client17.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException21 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Client17.setProperty("null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str23 = oAuth2Client17.redirectUri;
        java.lang.String str24 = oAuth2Client17.redirectUri;
        oAuth2ProblemException2.setParameter("GET", (java.lang.Object) str24);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Authorization-Schesme" + "'", str11, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "invalid_grant" + "'", str18, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "token" + "'", str23, "token");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "token" + "'", str24, "token");
    }

    @Test
    public void test0787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0787");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("invalid_token", (java.lang.Throwable) oAuth2ProblemException2);
        java.lang.Object obj5 = null;
        oAuth2ProblemException2.setParameter("null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29", obj5);
    }

    @Test
    public void test0788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0788");
        java.lang.String[] strArray5 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"client_id\"", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream7);
        oAuth2Message8.URL = "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(parameterList6);
    }

    @Test
    public void test0789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0789");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str10 = oAuth2Message5.getHeader("invalid_request");
        java.lang.String str11 = oAuth2Message5.getCode();
        java.lang.String str12 = oAuth2Message5.method;
        java.lang.String str13 = oAuth2Message5.method;
        oAuth2Message5.method = "PUT";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0790");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "redirect_uri_mismatch";
        java.lang.String str12 = oAuth2Accessor1.state;
        oAuth2Accessor1.state = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0791");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.accessToken;
        java.lang.String str6 = oAuth2Accessor2.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0792");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(OAuth2Message(hi!, GET, []), none, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "HTTP request");
    }

    @Test
    public void test0793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0793");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        java.lang.String str15 = oAuth2Message8.getClientId();
        oAuth2Message8.method = "";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0794");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("\ufffd\n", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.lang.String str3 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str3, "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0795");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message12.getParameterMap();
        java.lang.String str16 = oAuth2Message12.toString();
        java.lang.String str17 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str16, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str17, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test0796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0796");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0797");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("hi!", strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception: HTTP request", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "invalid_request" + "'", str8, "invalid_request");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception: HTTP request" + "'", str10, "net.oauth.v2.OAuth2Exception: HTTP request");
    }

    @Test
    public void test0798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0798");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("state", "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("", "null  realm=\"\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream8);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test0799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0799");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        java.lang.Class<?> wildcardClass2 = oAuth2ProblemException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0800");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.method = "UTF-8";
        java.lang.String str12 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"" + "'", str12, "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"");
    }

    @Test
    public void test0801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0801");
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
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0802");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("HTTP status");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("code_and_token", "null  realm=\"Authorization-Schesme\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test0803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0803");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0804");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException1.getParameters();
        java.lang.String str8 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0805");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor1.clone();
        oAuth2Accessor7.accessToken = "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
    }

    @Test
    public void test0806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0806");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.Class<?> wildcardClass7 = oAuth2Accessor1.getClass();
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test0807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0807");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("UTF-8", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"" + "'", str5, "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"");
    }

    @Test
    public void test0808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0808");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException8.getParameters();
        boolean boolean10 = parameter2.equals((java.lang.Object) oAuth2ProblemException8);
        int int11 = oAuth2ProblemException8.getHttpStatusCode();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
    }

    @Test
    public void test0809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0809");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        oAuth2Message12.URL = "null  realm=\"invalid_token\"";
        java.lang.String str22 = oAuth2Message12.getCode();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0810");
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
        java.lang.String str24 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str24, "null%20%20realm%3D%22invalid_token%22=POST");
    }

    @Test
    public void test0811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0811");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.getClientId();
        java.lang.String str11 = oAuth2Message5.toString();
        oAuth2Message5.URL = "null  realm=\"client_id\"";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str11, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0812");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("application%252Fx-www-form-urlencoded");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test0813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0813");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.scope;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("null  realm=\"redirect_uri_mismatch\"");
        java.lang.String str7 = oAuth2Accessor1.scope;
        java.lang.String str8 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0814");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("net.oauth.v2.OAuth2Exception: HTTP request", "net.oauth.v2.OAuth2ProblemException: error_uri", "application%2Fx-www-form-urlencoded");
    }

    @Test
    public void test0815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0815");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.io.InputStream inputStream19 = null;
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("UTF-8", "null  realm=\"password\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17, inputStream19);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = oAuth2Message20.getHeaders();
        oAuth2Accessor1.setProperty("2.0", (java.lang.Object) strEntryList21);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertNotNull(strEntryList21);
    }

    @Test
    public void test0816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0816");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request");
    }

    @Test
    public void test0817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0817");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("scope");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "scope" + "'", str1, "scope");
    }

    @Test
    public void test0818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0818");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0819");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0820");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0821");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        java.lang.String str10 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0822");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str9 = oAuth2Message4.getWWWAuthenticateHeader("code_and_token");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message4.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = oAuth2Message4.getParameterMap();
        java.lang.String str13 = oAuth2Message4.getWWWAuthenticateHeader("null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"code_and_token\"" + "'", str9, "null  realm=\"code_and_token\"");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"null%20%20realm%3D%22%250A%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str13, "null  realm=\"null%20%20realm%3D%22%250A%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0823");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0824");
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
        java.lang.String str20 = oAuth2ProblemException14.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str20, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0825");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "unsupported_grant_type" + "'", str3, "unsupported_grant_type");
    }

    @Test
    public void test0826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0826");
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
        int int23 = oAuth2ProblemException7.getHttpStatusCode();
        int int24 = oAuth2ProblemException7.getHttpStatusCode();
        java.lang.String str25 = oAuth2ProblemException7.getProblem();
        int int26 = oAuth2ProblemException7.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "invalid_token" + "'", str25, "invalid_token");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
    }

    @Test
    public void test0827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0827");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.lang.String str8 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test0828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0828");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(POST, access_token, [])");
    }

    @Test
    public void test0829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0829");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        net.oauth.v2.BaseTokenType baseTokenType9 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType9;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType9);
        oAuth2Accessor1.setProperty("code_and_token", (java.lang.Object) baseTokenType9);
        oAuth2Accessor1.scope = "expires_in";
        oAuth2Accessor1.tokenType = "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(baseTokenType9);
    }

    @Test
    public void test0830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0830");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("PUT", "OAuth2Message(POST, access_token, [])");
    }

    @Test
    public void test0831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0831");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getKey();
        net.oauth.v2.OAuth2Client oAuth2Client8 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor9.clone();
        java.lang.Object obj12 = oAuth2Accessor10.getProperty("PUT");
        java.lang.String str13 = oAuth2Accessor10.refreshToken;
        java.lang.Object obj15 = oAuth2Accessor10.getProperty("redirect_uri");
        net.oauth.v2.OAuth2Client oAuth2Client17 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        java.lang.String str19 = oAuth2Accessor18.tokenType;
        oAuth2Accessor18.expires_in = "GET";
        java.lang.String str22 = oAuth2Accessor18.expires_in;
        oAuth2Accessor10.setProperty("HTTP request", (java.lang.Object) oAuth2Accessor18);
        boolean boolean24 = parameter2.equals((java.lang.Object) "HTTP request");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "GET" + "'", str22, "GET");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test0832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0832");
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
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0833");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        oAuth2Accessor6.refreshToken = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0834");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null  realm=\"invalid_client\"");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 32, 32, 114, 101, 97, 108, 109, 61, 34, 105, 110, 118, 97, 108, 105, 100, 95, 99, 108, 105, 101, 110, 116, 34]");
    }

    @Test
    public void test0835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0835");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        java.lang.String str11 = oAuth2Accessor9.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0836");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        java.lang.String str8 = oAuth2Accessor1.state;
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=null&realm=none%3DUTF-8";
        java.lang.String str11 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Authorization-Schesme=null&realm=none%3DUTF-8" + "'", str11, "Authorization-Schesme=null&realm=none%3DUTF-8");
    }

    @Test
    public void test0837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0837");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        int int5 = oAuth2ProblemException3.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("token_type", (java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception("null  realm=\"redirect_uri_mismatch\"", (java.lang.Throwable) oAuth2Exception9);
        java.lang.String str11 = oAuth2Exception10.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"" + "'", str11, "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
    }

    @Test
    public void test0838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0838");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.Object obj15 = oAuth2Client3.getProperty("UTF-8");
        java.lang.String str16 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0839");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        oAuth2Accessor1.expires_in = "invalid_token";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        java.lang.String str11 = oAuth2Accessor10.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0840");
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
        java.lang.String str24 = oAuth2Accessor21.tokenType;
        java.lang.Object obj26 = oAuth2Accessor21.getProperty("invalid_client");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test0841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0841");
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
        java.lang.String str16 = oAuth2Message5.URL;
        java.lang.String str17 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str16, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0842");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0843");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "null  realm=\"\"";
        oAuth2Accessor1.expires_in = "null  realm=\"2.0\"";
        oAuth2Accessor1.code = "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
    }

    @Test
    public void test0844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0844");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0845");
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
        java.lang.String str17 = oAuth2Message15.getParameter("none");
        java.lang.String str19 = oAuth2Message15.getHeader("null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0846");
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
        java.lang.String str15 = oAuth2Message13.getHeader("code_and_token");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0847");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream7);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP request" + "'", str6, "HTTP request");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0848");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.lang.Throwable[] throwableArray13 = oAuth2ProblemException8.getSuppressed();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0849");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.String str8 = oAuth2Accessor1.code;
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        java.lang.Class<?> wildcardClass10 = oAuth2Accessor1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test0850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0850");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: client_id", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0851");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2.Parameter[] parameterArray8 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList9 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, parameterArray8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        oAuth2ProblemException1.setParameter("username", (java.lang.Object) "hi!");
        java.lang.Throwable[] throwableArray13 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception("error_description", (java.lang.Throwable) oAuth2ProblemException1);
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = oAuth2ProblemException1.getParameters();
        java.lang.Throwable[] throwableArray16 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(throwableArray16);
    }

    @Test
    public void test0852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0852");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = oAuth2Message5.getParameters();
        java.lang.String str7 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strEntryList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])" + "'", str7, "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])");
    }

    @Test
    public void test0853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0853");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.lang.String str10 = oAuth2Message8.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str13 = oAuth2Message8.getCode();
        java.lang.String str14 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(, client_id, [])" + "'", str12, "OAuth2Message(, client_id, [])");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0854");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.URL = "2.0";
        oAuth2Message5.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message5.getParameterMap();
        java.lang.String str14 = oAuth2Message5.getHeader("HTTP%20request");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0855");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0856");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int15 = oAuth2ProblemException14.getHttpStatusCode();
        java.lang.String str16 = oAuth2ProblemException14.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        oAuth2ProblemException14.setParameter("code", (java.lang.Object) parameterList21);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = oAuth2ProblemException14.getParameters();
        boolean boolean27 = parameter8.equals((java.lang.Object) oAuth2ProblemException14);
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = oAuth2ProblemException14.getParameters();
        int int29 = oAuth2ProblemException14.getHttpStatusCode();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
    }

    @Test
    public void test0857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0857");
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
        java.lang.String str14 = oAuth2Message5.getWWWAuthenticateHeader("unsupported_grant_type");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"" + "'", str14, "null  realm=\"unsupported_grant_type\"");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0858");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        java.lang.String str10 = oAuth2Accessor9.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0859");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0860");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getKey();
        java.lang.String str8 = parameter2.toString();
        net.oauth.v2.OAuth2.Parameter parameter11 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2ProblemException: hi!", "PUT");
        boolean boolean12 = parameter2.equals((java.lang.Object) parameter11);
        java.lang.String str13 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0861");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        java.io.OutputStream outputStream2 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0862");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP request" + "'", str7, "HTTP request");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0863");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test0864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0864");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0865");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str12 = oAuth2Message8.getCode();
        java.lang.String str13 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str9, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str11, "null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test0866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0866");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("null  realm=\"invalid_token\"");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        oAuth2Accessor6.scope = "HTTP request";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
    }

    @Test
    public void test0867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0867");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0868");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("error");
        java.lang.String str8 = parameter2.toString();
        java.lang.String str10 = parameter2.setValue("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=error" + "'", str8, "Authorization-Schesme=error");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "error" + "'", str10, "error");
    }

    @Test
    public void test0869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0869");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream10 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "token_type" + "'", str8, "token_type");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test0870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0870");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0871");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2.Parameter[] parameterArray15 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList16 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, parameterArray15);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str20 = oAuth2Message18.getHeader("");
        java.lang.String str21 = oAuth2Message18.URL;
        oAuth2ProblemException8.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str21);
        java.lang.Throwable[] throwableArray23 = oAuth2ProblemException8.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        int int28 = oAuth2ProblemException26.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException26.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = oAuth2ProblemException26.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = oAuth2ProblemException26.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = oAuth2ProblemException26.getParameters();
        oAuth2ProblemException8.setParameter("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) oAuth2ProblemException26);
        java.lang.String str35 = oAuth2ProblemException8.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str35, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0872");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("none=token", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream13);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion" + "'", str12, "assertion");
    }

    @Test
    public void test0873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0873");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0874");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.util.Map<java.lang.String, java.lang.String> strMap6 = oAuth2Message4.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0875");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message12.getHeaders();
        java.lang.String str14 = oAuth2Message12.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message12.getHeaders();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str14, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test0876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0876");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        oAuth2Accessor1.expires_in = "invalid_token";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        java.lang.Object obj12 = oAuth2Accessor1.getProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test0877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0877");
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
        java.lang.String str17 = oAuth2Client3.redirectUri;
        java.lang.String[] strArray27 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList28 = net.oauth.v2.OAuth2.newList(strArray27);
        java.lang.String str29 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.io.InputStream inputStream30 = null;
        net.oauth.v2.OAuth2Message oAuth2Message31 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28, inputStream30);
        java.lang.String str33 = oAuth2Message31.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str34 = oAuth2Message31.URL;
        oAuth2Message31.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2ProblemException: client_id", (java.lang.Object) "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str38 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertNotNull(parameterList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str29, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "null  realm=\"invalid_token\"" + "'", str33, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "invalid_scope" + "'", str34, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str38, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0878");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream12);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("URL", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("client_credentials", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("authorization_code", "OAuth2Message(Authorization-Schesme=token_type, , [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
    }

    @Test
    public void test0879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0879");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str1, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0880");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.io.OutputStream outputStream15 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14, outputStream15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
    }

    @Test
    public void test0881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0881");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0882");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str6 = oAuth2Message4.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = oAuth2Message4.getParameterMap();
        oAuth2Message4.method = "unauthorized_client";
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str6, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0883");
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
        java.lang.String str20 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.lang.String str21 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.io.InputStream inputStream22 = null;
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("redirect_uri_mismatch", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, inputStream22);
        java.lang.String str24 = net.oauth.v2.OAuth2.addParameters("password", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.lang.String str25 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "password" + "'", str24, "password");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "net.oauth.v2.OAuth2Exception" + "'", str25, "net.oauth.v2.OAuth2Exception");
    }

    @Test
    public void test0884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0884");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception42 = new net.oauth.v2.OAuth2Exception("invalid_scope", (java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException44 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception45 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException44);
        net.oauth.v2.OAuth2Exception oAuth2Exception46 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException44.addSuppressed((java.lang.Throwable) oAuth2Exception46);
        java.lang.Throwable[] throwableArray48 = oAuth2Exception46.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception49 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception46);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException51 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception52 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException51);
        net.oauth.v2.OAuth2Exception oAuth2Exception53 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException51.addSuppressed((java.lang.Throwable) oAuth2Exception53);
        int int55 = oAuth2ProblemException51.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap56 = oAuth2ProblemException51.getParameters();
        oAuth2Exception49.addSuppressed((java.lang.Throwable) oAuth2ProblemException51);
        int int58 = oAuth2ProblemException51.getHttpStatusCode();
        oAuth2Exception42.addSuppressed((java.lang.Throwable) oAuth2ProblemException51);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList66 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str67 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList66);
        java.lang.String str68 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList66);
        java.io.InputStream inputStream69 = null;
        net.oauth.v2.OAuth2Message oAuth2Message70 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: hi!", "application%2Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList66, inputStream69);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList66);
        oAuth2ProblemException51.setParameter("invalid_token", (java.lang.Object) parameterList66);
        java.lang.String str73 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList66);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(throwableArray48);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 200 + "'", int55 == 200);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 200 + "'", int58 == 200);
        org.junit.Assert.assertNotNull(parameterList66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "\ufffd\n" + "'", str67, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "client_credentials" + "'", str68, "client_credentials");
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test0885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0885");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        java.lang.String str15 = oAuth2Message8.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntryList16);
    }

    @Test
    public void test0886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0886");
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
        oAuth2Accessor1.scope = "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList28 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message29 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        net.oauth.v2.OAuth2Message oAuth2Message32 = new net.oauth.v2.OAuth2Message("", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        oAuth2Accessor1.setProperty("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request", (java.lang.Object) "");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList28);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(strMap31);
    }

    @Test
    public void test0887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0887");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("scope", "PUT");
        java.lang.Object obj3 = null;
        boolean boolean4 = parameter2.equals(obj3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0888");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.lang.String str7 = oAuth2Message5.getClientId();
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.completeParameters();
        java.lang.String str11 = oAuth2Message5.getWWWAuthenticateHeader("password");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
    }

    @Test
    public void test0889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0889");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getHeaders();
        java.lang.String str12 = oAuth2Message8.getParameter("OAuth2Message(OAuth2Message(hi!, GET, []), none, [])");
        java.lang.String str13 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0890");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getValue();
        boolean boolean6 = parameter2.equals((java.lang.Object) "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test0891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0891");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("username", "OAuth2Message(2.0, UTF-8, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test0892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0892");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("password", "null  realm=\"password\"", "assertion_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor4.clone();
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
    }

    @Test
    public void test0893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0893");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.toString();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str11, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
    }

    @Test
    public void test0894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0894");
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
        java.lang.String str13 = oAuth2Message5.URL;
        java.lang.String str15 = oAuth2Message5.getHeader("username");
        java.lang.String str16 = oAuth2Message5.getClientId();
        java.lang.String str17 = oAuth2Message5.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message5.getHeaders();
        java.lang.String str19 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0895");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
    }

    @Test
    public void test0896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0896");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "token_type" + "'", str8, "token_type");
    }

    @Test
    public void test0897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0897");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0898");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str14 = oAuth2Message8.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test0899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0899");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        oAuth2Message12.URL = "null  realm=\"OAuth2Message%28POST%2C%20refresh_token%2C%20%5B%5D%29\"";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message12.getParameters();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNotNull(strEntryList19);
    }

    @Test
    public void test0900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0900");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0901");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("PUT%3Dunsupported_grant_type", "HTTP%20status", "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0902");
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
        java.lang.String str17 = oAuth2Accessor2.code;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(oAuth2Client16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test0903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0903");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.String str7 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0904");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"password\"=OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str1, "null  realm=\"password\"=OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test0905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0905");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0906");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 32, 32, 114, 101, 97, 108, 109, 61, 34, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 37, 51, 65, 37, 50, 48, 72, 84, 84, 80, 37, 50, 48, 114, 101, 113, 117, 101, 115, 116, 34]");
    }

    @Test
    public void test0907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0907");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test0908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0908");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("PUT=unsupported_grant_type", "Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test0909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0909");
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
        oAuth2Message15.URL = "code_and_token";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test0910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0910");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str9 = oAuth2Message4.getWWWAuthenticateHeader("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message4.completeParameters();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str9, "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0911");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int15 = oAuth2ProblemException14.getHttpStatusCode();
        java.lang.String str16 = oAuth2ProblemException14.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        oAuth2ProblemException14.setParameter("code", (java.lang.Object) parameterList21);
        java.util.Map<java.lang.String, java.lang.Object> strMap26 = oAuth2ProblemException14.getParameters();
        boolean boolean27 = parameter8.equals((java.lang.Object) oAuth2ProblemException14);
        java.lang.String str29 = parameter8.setValue("none=token");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "access_denied" + "'", str29, "access_denied");
    }

    @Test
    public void test0912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0912");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getClientId();
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0913");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray4);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str8, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0914");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str14 = oAuth2Message8.getWWWAuthenticateHeader("null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.lang.String str15 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str12, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"" + "'", str14, "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0915");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.lang.String str11 = oAuth2Message8.getParameter("OAuth2Message(Authorization-Schesme=token_type, , [])");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        java.lang.String str14 = oAuth2Message8.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str14, "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0916");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        oAuth2Accessor9.accessToken = "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
    }

    @Test
    public void test0917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0917");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.String str7 = oAuth2Accessor6.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0918");
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
        net.oauth.v2.OAuth2.Parameter[] parameterArray22 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList23 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23, parameterArray22);
        net.oauth.v2.OAuth2Message oAuth2Message25 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23);
        java.lang.String str27 = oAuth2Message25.getHeader("");
        java.lang.String str28 = oAuth2Message25.getClientId();
        oAuth2Message25.URL = "access_token";
        java.lang.String str31 = oAuth2Message25.getClientId();
        oAuth2Accessor17.setProperty("HTTP request", (java.lang.Object) oAuth2Message25);
        java.lang.String str33 = oAuth2Accessor17.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client18);
        org.junit.Assert.assertNotNull(parameterArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0919");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("redirect_uri", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP request" + "'", str7, "HTTP request");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "redirect_uri" + "'", str10, "redirect_uri");
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test0920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0920");
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
        java.lang.String str31 = oAuth2Accessor19.refreshToken;
        java.lang.String str32 = oAuth2Accessor19.tokenType;
        java.lang.String str33 = oAuth2Accessor19.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "response_type" + "'", str32, "response_type");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "DELETE" + "'", str33, "DELETE");
    }

    @Test
    public void test0921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0921");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0922");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str6 = oAuth2Message4.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message4.getHeaders();
        java.lang.String str8 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str6, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "refresh_token" + "'", str8, "refresh_token");
    }

    @Test
    public void test0923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0923");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message12.getParameters();
        oAuth2Message12.method = "scope";
        java.lang.String str16 = oAuth2Message12.URL;
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTTP request" + "'", str16, "HTTP request");
    }

    @Test
    public void test0924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0924");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.lang.String str12 = oAuth2Message8.getCode();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0925");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getWWWAuthenticateHeader("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        oAuth2Message4.method = "authorization_code";
        java.lang.String str9 = oAuth2Message4.getCode();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"" + "'", str6, "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0926");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.lang.String str6 = oAuth2Message5.toString();
        java.lang.String str7 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])" + "'", str6, "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0927");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        oAuth2Accessor7.setProperty("invalid_scope", (java.lang.Object) parameterList17);
        java.lang.String str19 = oAuth2Accessor7.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test0928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0928");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "";
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test0929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0929");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        oAuth2Accessor1.accessToken = "client_credentials";
        oAuth2Accessor1.tokenType = "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])";
        oAuth2Accessor1.refreshToken = "null  realm=\"Authorization-Schesme\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0930");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.lang.String str15 = oAuth2Message8.getWWWAuthenticateHeader("");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"\"" + "'", str15, "null  realm=\"\"");
    }

    @Test
    public void test0931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0931");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", strArray11);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str18 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.io.InputStream inputStream19 = null;
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("none%3Dinvalid_client", "null  realm=\"code_and_token\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, inputStream19);
        java.io.OutputStream outputStream21 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16, outputStream21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0932");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        oAuth2Accessor7.refreshToken = "assertion";
        java.lang.String str10 = oAuth2Accessor7.state;
        oAuth2ProblemException1.setParameter("error_uri", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2Exception15);
        int int17 = oAuth2ProblemException13.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException20 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception21 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException20);
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException20.addSuppressed((java.lang.Throwable) oAuth2Exception22);
        net.oauth.v2.OAuth2Exception oAuth2Exception24 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception22);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        int int28 = oAuth2ProblemException26.getHttpStatusCode();
        oAuth2Exception24.addSuppressed((java.lang.Throwable) oAuth2ProblemException26);
        oAuth2ProblemException13.addSuppressed((java.lang.Throwable) oAuth2ProblemException26);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException26);
        java.lang.Object obj33 = null;
        oAuth2ProblemException1.setParameter("Authorization-Schesme=null&realm=none%3DUTF-8", obj33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
    }

    @Test
    public void test0933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0933");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("none=UTF-8");
        java.lang.String str12 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str9, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"none%3DUTF-8\"" + "'", str11, "null  realm=\"none%3DUTF-8\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Authorization-Schesme=token_type" + "'", str12, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0934");
        net.oauth.v2.OAuth2Client oAuth2Client1 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = new net.oauth.v2.OAuth2Accessor(oAuth2Client1);
        oAuth2Accessor2.refreshToken = "assertion";
        java.lang.String str5 = oAuth2Accessor2.state;
        java.lang.String str6 = oAuth2Accessor2.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor2.clone();
        java.lang.String str8 = oAuth2Accessor7.tokenType;
        java.lang.Object obj10 = oAuth2Accessor7.getProperty("token");
        oAuth2Accessor7.scope = "unsupported_response_type";
        java.lang.String[] strArray21 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList22 = net.oauth.v2.OAuth2.newList(strArray21);
        java.lang.String str23 = net.oauth.v2.OAuth2.addParameters("assertion", strArray21);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList24 = net.oauth.v2.OAuth2.newList(strArray21);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList25 = net.oauth.v2.OAuth2.newList(strArray21);
        oAuth2Accessor7.setProperty("HTTP request", (java.lang.Object) parameterList25);
        java.lang.String str27 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str28 = net.oauth.v2.OAuth2.addParameters("Authorization-Schesme=token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNotNull(strArray21);
        org.junit.Assert.assertNotNull(parameterList22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str23, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList24);
        org.junit.Assert.assertNotNull(parameterList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Authorization-Schesme=token_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str28, "Authorization-Schesme=token_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0935");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0936");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str19 = oAuth2Message12.getParameter("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"");
        java.lang.String str21 = oAuth2Message12.getWWWAuthenticateHeader("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str21, "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0937");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException3.getParameters();
        java.lang.Throwable[] throwableArray5 = oAuth2ProblemException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException3.getParameters();
        oAuth2ProblemException1.setParameter("error", (java.lang.Object) oAuth2ProblemException3);
        java.lang.String str10 = oAuth2ProblemException3.toString();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2ProblemException: HTTP status 200" + "'", str10, "net.oauth.v2.OAuth2ProblemException: HTTP status 200");
    }

    @Test
    public void test0938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0938");
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
        java.lang.String str16 = oAuth2Message5.URL;
        java.lang.String str17 = oAuth2Message5.URL;
        java.lang.String str18 = oAuth2Message5.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message5.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str16, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str17, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strEntryList19);
    }

    @Test
    public void test0939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0939");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message11.getParameterMap();
        java.lang.String str14 = oAuth2Message11.getParameter("");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0940");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.String str5 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error_description" + "'", str4, "error_description");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "invalid_client" + "'", str5, "invalid_client");
    }

    @Test
    public void test0941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0941");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str6 = parameter2.getKey();
        java.lang.String str7 = parameter2.getValue();
        java.lang.String str9 = parameter2.setValue("null%20%20realm%3D%22%22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "access_denied" + "'", str9, "access_denied");
    }

    @Test
    public void test0942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0942");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray8);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0943");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "", "Authorization-Schesme=token_type");
        java.lang.Object obj5 = oAuth2Client3.getProperty("HTTP status");
        java.lang.Object obj7 = oAuth2Client3.getProperty("");
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0944");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str14 = oAuth2Message8.getCode();
        java.lang.String str16 = oAuth2Message8.getHeader("redirect_uri_mismatch");
        java.lang.String str17 = oAuth2Message8.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str17, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertNotNull(strEntryList18);
    }

    @Test
    public void test0945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0945");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.expires_in = "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0946");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "invalid_request";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0947");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 32, 32, 114, 101, 97, 108, 109, 61, 34, 101, 120, 112, 105, 114, 101, 115, 95, 105, 110, 37, 51, 70, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 37, 51, 68, 115, 99, 111, 112, 101, 37, 50, 54, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 37, 51, 68, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 37, 50, 54, 98, 101, 97, 114, 101, 114, 37, 51, 68, 98, 101, 97, 114, 101, 114, 34]");
    }

    @Test
    public void test0948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0948");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2.Parameter[] parameterArray15 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList16 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, parameterArray15);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str20 = oAuth2Message18.getHeader("");
        java.lang.String str21 = oAuth2Message18.URL;
        oAuth2ProblemException8.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str21);
        java.lang.Throwable[] throwableArray23 = oAuth2ProblemException8.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        int int28 = oAuth2ProblemException26.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException26.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = oAuth2ProblemException26.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = oAuth2ProblemException26.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = oAuth2ProblemException26.getParameters();
        oAuth2ProblemException8.setParameter("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", (java.lang.Object) oAuth2ProblemException26);
        java.lang.Throwable[] throwableArray35 = oAuth2ProblemException26.getSuppressed();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(throwableArray35);
    }

    @Test
    public void test0949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0949");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        oAuth2Accessor1.state = "unsupported_grant_type";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
    }

    @Test
    public void test0950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0950");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException0.setParameter("username", (java.lang.Object) "hi!");
        java.lang.String str12 = oAuth2ProblemException0.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2ProblemException: HTTP status 200" + "'", str12, "net.oauth.v2.OAuth2ProblemException: HTTP status 200");
    }

    @Test
    public void test0951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0951");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getValue();
        java.lang.String str8 = parameter2.toString();
        java.lang.String str9 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme" + "'", str9, "Authorization-Schesme");
    }

    @Test
    public void test0952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0952");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
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
    public void test0953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0953");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.Object obj11 = oAuth2Client3.getProperty("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0954");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message15.getHeaders();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strEntryList19);
    }

    @Test
    public void test0955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0955");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.completeParameters();
        java.lang.String str17 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str17, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test0956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0956");
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
        oAuth2Accessor1.accessToken = "null  realm=\"invalid_client\"";
        oAuth2Accessor1.refreshToken = "OAuth2Message(2.0, UTF-8, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test0957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0957");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("error");
        java.lang.String str8 = parameter2.toString();
        java.lang.String str9 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=error" + "'", str8, "Authorization-Schesme=error");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme" + "'", str9, "Authorization-Schesme");
    }

    @Test
    public void test0958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0958");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0959");
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
        java.lang.String str14 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0960");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0961");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        oAuth2Accessor1.expires_in = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0962");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0963");
        java.lang.String[] strArray6 = new java.lang.String[] { "password", "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "redirect_uri_mismatch", "net.oauth.v2.OAuth2ProblemException: client_id", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" };
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray6);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray6);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str7, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertNotNull(parameterList8);
    }

    @Test
    public void test0964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0964");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str4, "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
    }

    @Test
    public void test0965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0965");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        java.lang.String str10 = oAuth2Message7.getHeader("error_uri");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message7.getHeaders();
        java.lang.String str12 = oAuth2Message7.getCode();
        oAuth2Message7.completeParameters();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0966");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.expires_in = "Authorization-Schesme=refresh_token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
    }

    @Test
    public void test0967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0967");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.lang.String str10 = oAuth2Message8.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0968");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "";
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "2.0";
        oAuth2Accessor1.state = "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList20 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream21 = null;
        net.oauth.v2.OAuth2Message oAuth2Message22 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList20, inputStream21);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList23 = oAuth2Message22.getParameters();
        oAuth2Accessor1.setProperty("null  realm=\"error_description%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Object) oAuth2Message22);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(parameterList20);
        org.junit.Assert.assertNotNull(strEntryList23);
    }

    @Test
    public void test0969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0969");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"invalid_client\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0970");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_request");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0971");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        int int7 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = oAuth2ProblemException9.getParameters();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException9);
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = oAuth2ProblemException9.getParameters();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test0972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0972");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        java.lang.String str2 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str2, "net.oauth.v2.OAuth2ProblemException: net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
    }

    @Test
    public void test0973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0973");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.state;
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0974");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("assertion", strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray7);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList10);
    }

    @Test
    public void test0975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0975");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0976");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22Authorization-Schesme%22%3Fpassword%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id" + "'", str1, "null%20%20realm%3D%22Authorization-Schesme%22%3Fpassword%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id");
    }

    @Test
    public void test0977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0977");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str9 = oAuth2Message4.getWWWAuthenticateHeader("code_and_token");
        oAuth2Message4.method = "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str12 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"code_and_token\"" + "'", str9, "null  realm=\"code_and_token\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0978");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getParameters();
        java.lang.String str15 = oAuth2Message5.getWWWAuthenticateHeader("expires_in");
        java.lang.Class<?> wildcardClass16 = oAuth2Message5.getClass();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"expires_in\"" + "'", str15, "null  realm=\"expires_in\"");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0979");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        oAuth2Accessor1.accessToken = "code_and_token";
        oAuth2Accessor1.accessToken = "redirect_uri";
        oAuth2Accessor1.expires_in = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0980");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0981");
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.OutputStream outputStream14 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10, outputStream14);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("HTTP request", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream17 = null;
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("Authorization-Schesme", "Authorization-Schesme", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream17);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParameters("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str19, "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0982");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("redirect_uri");
        java.lang.String str6 = parameter2.setValue("access_token");
        java.lang.String str7 = parameter2.toString();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: hi!", "application%2Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, inputStream16);
        boolean boolean18 = parameter2.equals((java.lang.Object) "application%2Fx-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "redirect_uri" + "'", str6, "redirect_uri");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme=access_token" + "'", str7, "Authorization-Schesme=access_token");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\ufffd\n" + "'", str14, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "client_credentials" + "'", str15, "client_credentials");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test0983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0983");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str6 = oAuth2Message4.toString();
        java.lang.String str7 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str6, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "refresh_token" + "'", str7, "refresh_token");
    }

    @Test
    public void test0984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0984");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message7.getHeaders();
        java.lang.Class<?> wildcardClass16 = strEntryList15.getClass();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strEntryList15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test0985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0985");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("error_description", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"password\"", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0986");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("redirect_uri");
        java.lang.String str8 = oAuth2Accessor2.expires_in;
        oAuth2Accessor2.state = "";
        oAuth2Accessor2.state = "net.oauth.v2.OAuth2ProblemException: HTTP status 200";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0987");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("state");
        oAuth2Accessor1.state = "invalid_token";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0988");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.lang.String str11 = oAuth2Message7.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message7.getHeaders();
        java.lang.String str13 = oAuth2Message7.URL;
        java.lang.String str15 = oAuth2Message7.getParameter("null  realm=\"none%3DUTF-8\"");
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_client" + "'", str13, "invalid_client");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0989");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        net.oauth.v2.OAuth2Client oAuth2Client7 = oAuth2Accessor2.client;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(oAuth2Client7);
    }

    @Test
    public void test0990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0990");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        oAuth2Accessor1.scope = "HTTP status";
        java.lang.String str12 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "none=token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HTTP status" + "'", str12, "HTTP status");
    }

    @Test
    public void test0991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0991");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Accessor10.expires_in;
        java.lang.String str12 = oAuth2Accessor10.refreshToken;
        oAuth2Accessor10.scope = "";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0992");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = oAuth2Message4.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = oAuth2Message4.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strEntryList5);
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test0993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0993");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "invalid_token");
    }

    @Test
    public void test0994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0994");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray10);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0995");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        java.lang.Throwable[] throwableArray9 = oAuth2Exception4.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test0996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0996");
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
        int int31 = oAuth2ProblemException27.getHttpStatusCode();
        java.lang.Throwable[] throwableArray32 = oAuth2ProblemException27.getSuppressed();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test0997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0997");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "net.oauth.v2.OAuth2Exception", "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0998");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message12.getHeaders();
        java.lang.String str14 = oAuth2Message12.toString();
        java.lang.String str15 = oAuth2Message12.getCode();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str14, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test0999");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test1000");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.refreshToken;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "assertion" + "'", str7, "assertion");
        org.junit.Assert.assertNull(obj9);
    }
}

