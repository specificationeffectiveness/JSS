package net.oauth.v2;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

    public static boolean debug = false;

    @Test
    public void test1501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1501");
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
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(baseTokenType26);
    }

    @Test
    public void test1502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1502");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.String str7 = parameter2.setValue("client_secret");
        java.lang.String str8 = parameter2.getKey();
        java.lang.String str9 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none" + "'", str7, "none");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme" + "'", str8, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client_secret" + "'", str9, "client_secret");
    }

    @Test
    public void test1503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1503");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("URL");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1504");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException1.setParameter("code", (java.lang.Object) parameterList8);
        net.oauth.v2.OAuth2Client oAuth2Client14 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2Accessor15.refreshToken = "assertion";
        oAuth2ProblemException1.setParameter("error_description", (java.lang.Object) oAuth2Accessor15);
        int int19 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap20 = oAuth2ProblemException1.getParameters();
        int int21 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
    }

    @Test
    public void test1505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1505");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("2.0");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[50, 46, 48]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "2.0" + "'", str2, "2.0");
    }

    @Test
    public void test1506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1506");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1507");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.code = "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!";
        oAuth2Accessor1.code = "authorization_code=assertion";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1508");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.lang.String str10 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1509");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str16 = oAuth2Message12.getHeader("assertion_type");
        oAuth2Message12.URL = "null  realm=\"code_and_token\"";
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1510");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "#net.oauth.v2.OAuth2Exception=HTTP%20status";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test1511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1511");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.lang.String str12 = oAuth2Message7.getHeader("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message7.getParameterMap();
        oAuth2Message7.URL = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1512");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.Object obj15 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str16 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "token_type" + "'", str16, "token_type");
    }

    @Test
    public void test1513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1513");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test1514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1514");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        java.lang.String str8 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1515");
        net.oauth.v2.OAuth2Client oAuth2Client2 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor3 = new net.oauth.v2.OAuth2Accessor(oAuth2Client2);
        java.lang.String str4 = oAuth2Accessor3.tokenType;
        oAuth2Accessor3.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client7 = oAuth2Accessor3.client;
        oAuth2Accessor3.refreshToken = "null  realm=\"\"";
        java.lang.String[] strArray18 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList19 = net.oauth.v2.OAuth2.newList(strArray18);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParameters("assertion", strArray18);
        oAuth2Accessor3.setProperty("client_secret", (java.lang.Object) strArray18);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList22 = net.oauth.v2.OAuth2.newList(strArray18);
        java.io.InputStream inputStream23 = null;
        net.oauth.v2.OAuth2Message oAuth2Message24 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception: ", "DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList22, inputStream23);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(oAuth2Client7);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertNotNull(parameterList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str20, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList22);
    }

    @Test
    public void test1516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1516");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test1517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1517");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1518");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("client_id");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, 108, 105, 101, 110, 116, 95, 105, 100]");
    }

    @Test
    public void test1519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1519");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str3, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null  realm=\"invalid_token\"" + "'", str4, "null  realm=\"invalid_token\"");
    }

    @Test
    public void test1520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1520");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "POST";
        java.lang.String str9 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1521");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.URL = "2.0";
        oAuth2Message5.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message5.getParameterMap();
        java.lang.String str13 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, 2.0, [])" + "'", str13, "OAuth2Message(hi!, 2.0, [])");
    }

    @Test
    public void test1522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1522");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1523");
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
        oAuth2Accessor22.refreshToken = "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
    }

    @Test
    public void test1524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1524");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException16 = new net.oauth.v2.OAuth2ProblemException("hi!");
        oAuth2Exception13.addSuppressed((java.lang.Throwable) oAuth2ProblemException16);
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException16);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1525");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2ProblemException1.setParameter("UTF-8", (java.lang.Object) "invalid_grant");
        java.lang.String str5 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1526");
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
        oAuth2Accessor2.refreshToken = "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])";
        net.oauth.v2.OAuth2.Parameter[] parameterArray24 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList25 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25, parameterArray24);
        net.oauth.v2.OAuth2Message oAuth2Message27 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str29 = oAuth2Message27.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap30 = oAuth2Message27.getParameterMap();
        oAuth2Accessor2.setProperty("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", (java.lang.Object) strMap30);
        net.oauth.v2.OAuth2Client oAuth2Client32 = oAuth2Accessor2.client;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(oAuth2Client16);
        org.junit.Assert.assertNotNull(parameterArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(oAuth2Client32);
    }

    @Test
    public void test1527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1527");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.refreshToken = "";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        oAuth2Accessor8.tokenType = "client_credentials";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
    }

    @Test
    public void test1528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1528");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.scope = "invalid_client";
        net.oauth.v2.OAuth2.Parameter[] parameterArray12 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList13 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, parameterArray12);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.lang.String str17 = oAuth2Message15.getHeader("");
        java.lang.String str18 = oAuth2Message15.URL;
        oAuth2Accessor1.setProperty("invalid_request", (java.lang.Object) str18);
        oAuth2Accessor1.state = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(parameterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1529");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1530");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        boolean boolean7 = parameter2.equals((java.lang.Object) "invalid_token");
        java.lang.String str8 = parameter2.getKey();
        java.lang.String str9 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme" + "'", str8, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme" + "'", str9, "Authorization-Schesme");
    }

    @Test
    public void test1531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1531");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1532");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message15.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message15.getParameters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strEntryList17);
    }

    @Test
    public void test1533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1533");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test1534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1534");
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
        java.lang.String str17 = oAuth2Message8.toString();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str17, "OAuth2Message(DELETE, client_id, [])");
    }

    @Test
    public void test1535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1535");
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
        java.lang.String str22 = parameter2.setValue("net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
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
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "token_type" + "'", str22, "token_type");
    }

    @Test
    public void test1536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1536");
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
        java.lang.String str25 = parameter2.setValue("hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
    }

    @Test
    public void test1537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1537");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("token", "access_token");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception");
        boolean boolean5 = parameter2.equals((java.lang.Object) oAuth2Exception4);
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        java.lang.String str8 = oAuth2Accessor7.tokenType;
        java.lang.String str9 = oAuth2Accessor7.tokenType;
        java.lang.Object obj11 = oAuth2Accessor7.getProperty("client_secret");
        java.lang.String str12 = oAuth2Accessor7.state;
        java.lang.String str13 = oAuth2Accessor7.tokenType;
        java.lang.String str14 = oAuth2Accessor7.code;
        oAuth2Accessor7.refreshToken = "password";
        boolean boolean17 = parameter2.equals((java.lang.Object) "password");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test1538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1538");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "expires_in");
    }

    @Test
    public void test1539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1539");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str13 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1540");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException3.getParameters();
        java.lang.Throwable[] throwableArray5 = oAuth2ProblemException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException3.getParameters();
        oAuth2ProblemException1.setParameter("error", (java.lang.Object) oAuth2ProblemException3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int12 = oAuth2ProblemException11.getHttpStatusCode();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2ProblemException11);
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = oAuth2ProblemException3.getParameters();
        java.lang.String str15 = oAuth2ProblemException3.toString();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2ProblemException: HTTP status 200" + "'", str15, "net.oauth.v2.OAuth2ProblemException: HTTP status 200");
    }

    @Test
    public void test1541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1541");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("access_token");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1542");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.Object obj6 = oAuth2Client3.getProperty("HTTP response");
        java.lang.String str7 = oAuth2Client3.clientId;
        java.lang.Object obj9 = oAuth2Client3.getProperty("OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error_description" + "'", str4, "error_description");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "error_description" + "'", str7, "error_description");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1543");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        oAuth2Accessor1.scope = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.scope = "client_credentials=application%252Fx-www-form-urlencoded";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1544");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1545");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        oAuth2Message8.method = "application%2Fx-www-form-urlencoded";
        java.lang.String str12 = oAuth2Message8.getClientId();
        oAuth2Message8.method = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1546");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str9 = oAuth2Message5.getCode();
        java.lang.String str11 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str12 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str11, "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test1547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1547");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str8, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1548");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test1549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1549");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str6 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "scope" + "'", str6, "scope");
    }

    @Test
    public void test1550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1550");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("redirect_uri");
        java.lang.String str6 = parameter2.setValue("access_token");
        java.lang.String str7 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "redirect_uri" + "'", str6, "redirect_uri");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_token" + "'", str7, "access_token");
    }

    @Test
    public void test1551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1551");
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
        net.oauth.v2.OAuth2.Parameter parameter27 = new net.oauth.v2.OAuth2.Parameter("\n", "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        oAuth2ProblemException7.setParameter("UTF-8?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "\n");
        int int29 = oAuth2ProblemException7.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
    }

    @Test
    public void test1552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1552");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        java.lang.String str11 = oAuth2Message7.getParameter("2.0");
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1553");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray9);
        java.io.InputStream inputStream14 = null;
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, inputStream14);
        java.lang.String str16 = oAuth2Message15.getClientId();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1554");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        oAuth2Accessor10.refreshToken = "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
    }

    @Test
    public void test1555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1555");
        net.oauth.v2.OAuth2.Parameter parameter5 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str6 = parameter5.toString();
        java.lang.String str7 = parameter5.getKey();
        net.oauth.v2.OAuth2.Parameter parameter10 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str11 = parameter10.getValue();
        java.lang.String str12 = parameter10.getValue();
        net.oauth.v2.OAuth2.Parameter parameter15 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        net.oauth.v2.OAuth2.Parameter[] parameterArray16 = new net.oauth.v2.OAuth2.Parameter[] { parameter5, parameter10, parameter15 };
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList17 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17, parameterArray16);
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception=HTTP%20status", "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.lang.String str20 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.lang.String str21 = net.oauth.v2.OAuth2.addParameters("null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme=token_type" + "'", str6, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "token_type" + "'", str12, "token_type");
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29" + "'", str20, "Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"?Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29" + "'", str21, "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"?Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
    }

    @Test
    public void test1556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1556");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor17 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test1557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1557");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("response_type");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[114, 101, 115, 112, 111, 110, 115, 101, 95, 116, 121, 112, 101]");
    }

    @Test
    public void test1558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1558");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream9);
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test1559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1559");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.scope;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1560");
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
        java.lang.String str15 = oAuth2Accessor1.code;
        java.lang.String str16 = oAuth2Accessor1.code;
        java.lang.String str17 = oAuth2Accessor1.accessToken;
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
    public void test1561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1561");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
    }

    @Test
    public void test1562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1562");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        java.lang.String str7 = oAuth2Message4.getCode();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1563");
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
        oAuth2Accessor15.expires_in = "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor15);
    }

    @Test
    public void test1564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1564");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        oAuth2Message8.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test1565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1565");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("redirect_uri_mismatch");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1566");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message5.getHeaders();
        java.lang.String str15 = oAuth2Message5.getClientId();
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
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1567");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        java.lang.Object obj6 = null;
        oAuth2Accessor1.setProperty("null  realm=\"none%3DUTF-8\"", obj6);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1568");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "DELETE";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception: HTTP request";
        java.lang.String str15 = oAuth2Accessor1.accessToken;
        java.lang.String str16 = oAuth2Accessor1.code;
        oAuth2Accessor1.expires_in = "Authorization-Schesme=token_type";
        java.lang.Class<?> wildcardClass19 = oAuth2Accessor1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "DELETE" + "'", str15, "DELETE");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1569");
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
        java.lang.String str18 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str18, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1570");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("token", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream12);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("client_id", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.OutputStream outputStream15 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream15);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "unsupported_grant_type" + "'", str9, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "username" + "'", str10, "username");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "client_id" + "'", str14, "client_id");
    }

    @Test
    public void test1571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1571");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "application/x-www-form-urlencoded";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        byte[] byteArray13 = net.oauth.v2.OAuth2.encodeCharacters("client_credentials");
        oAuth2Accessor1.setProperty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) "client_credentials");
        net.oauth.v2.OAuth2Client oAuth2Client19 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client21 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client21);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor23 = oAuth2Accessor22.clone();
        oAuth2Client19.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor23);
        java.lang.String str25 = oAuth2Client19.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException28 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException28);
        net.oauth.v2.OAuth2Exception oAuth2Exception30 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException28.addSuppressed((java.lang.Throwable) oAuth2Exception30);
        oAuth2Client19.setProperty("authorization_code", (java.lang.Object) oAuth2Exception30);
        net.oauth.v2.OAuth2Client oAuth2Client34 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor35 = new net.oauth.v2.OAuth2Accessor(oAuth2Client34);
        java.lang.String str36 = oAuth2Accessor35.tokenType;
        oAuth2Accessor35.tokenType = "response_type";
        oAuth2Accessor35.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str42 = oAuth2Accessor35.scope;
        java.lang.String str43 = oAuth2Accessor35.accessToken;
        oAuth2Accessor35.expires_in = "DELETE";
        oAuth2Client19.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor35);
        java.lang.String str47 = oAuth2Accessor35.refreshToken;
        java.lang.String str48 = oAuth2Accessor35.tokenType;
        oAuth2Accessor1.setProperty("null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) str48);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNotNull(byteArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray13), "[99, 108, 105, 101, 110, 116, 95, 99, 114, 101, 100, 101, 110, 116, 105, 97, 108, 115]");
        org.junit.Assert.assertNotNull(oAuth2Accessor23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str25, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertNull(str47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "response_type" + "'", str48, "response_type");
    }

    @Test
    public void test1572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1572");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1573");
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
        java.lang.Object obj19 = oAuth2Client3.getProperty("Location");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor20 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String[] strArray33 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList34 = net.oauth.v2.OAuth2.newList(strArray33);
        java.lang.String str35 = net.oauth.v2.OAuth2.addParameters("assertion", strArray33);
        java.lang.String str36 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray33);
        java.lang.String str37 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", strArray33);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList38 = net.oauth.v2.OAuth2.newList(strArray33);
        java.lang.String str39 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        java.lang.String str40 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        net.oauth.v2.OAuth2Message oAuth2Message41 = new net.oauth.v2.OAuth2Message("error_description", "scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        oAuth2Client3.setProperty("null%20%20realm%3D%22invalid_token%22=expires_in", (java.lang.Object) "scope");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException47 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int48 = oAuth2ProblemException47.getHttpStatusCode();
        java.lang.String str49 = oAuth2ProblemException47.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray53 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList54 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList54, parameterArray53);
        net.oauth.v2.OAuth2Message oAuth2Message56 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList54);
        java.util.Map<java.lang.String, java.lang.String> strMap57 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList54);
        oAuth2ProblemException47.setParameter("code", (java.lang.Object) parameterList54);
        java.io.InputStream inputStream59 = null;
        net.oauth.v2.OAuth2Message oAuth2Message60 = new net.oauth.v2.OAuth2Message("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none=invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList54, inputStream59);
        oAuth2Message60.URL = "invalid_client";
        oAuth2Client3.setProperty("null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) "invalid_client");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str13, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "token_type" + "'", str16, "token_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str17, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(parameterList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str35, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str36, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str37, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str39, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str40, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 200 + "'", int48 == 200);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(parameterArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(strMap57);
    }

    @Test
    public void test1574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1574");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        java.io.InputStream inputStream3 = null;
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", "unsupported_response_type", parameterCollection2, inputStream3);
    }

    @Test
    public void test1575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1575");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.scope = "invalid_client";
        net.oauth.v2.OAuth2.Parameter[] parameterArray12 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList13 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, parameterArray12);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.lang.String str17 = oAuth2Message15.getHeader("");
        java.lang.String str18 = oAuth2Message15.URL;
        oAuth2Accessor1.setProperty("invalid_request", (java.lang.Object) str18);
        oAuth2Accessor1.refreshToken = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(parameterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1576");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.state = "client_secret";
        oAuth2Accessor1.tokenType = "password";
        oAuth2Accessor1.code = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1577");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str8, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test1578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1578");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("none");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 111, 110, 101]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "none" + "'", str2, "none");
    }

    @Test
    public void test1579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1579");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("GET");
    }

    @Test
    public void test1580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1580");
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
        java.lang.String str19 = parameter2.toString();
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str19, "null%20%20realm%3D%22invalid_token%22=POST");
    }

    @Test
    public void test1581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1581");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("OAuth2Message(OAuth2Message(, client_id, []), access_token, [])", "Authorization-Schesme=null&realm=none=UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream16);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test1582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1582");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null%20%20realm%3D%22Authorization-Schesme%22%3Fpassword%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id");
    }

    @Test
    public void test1583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1583");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1584");
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
        java.lang.String[] strArray28 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList29 = net.oauth.v2.OAuth2.newList(strArray28);
        java.lang.String str30 = net.oauth.v2.OAuth2.addParameters("assertion", strArray28);
        java.lang.String str31 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray28);
        java.lang.String str32 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray28);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList33 = net.oauth.v2.OAuth2.newList(strArray28);
        oAuth2Accessor1.setProperty("", (java.lang.Object) parameterList33);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strArray28);
        org.junit.Assert.assertNotNull(parameterList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str30, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str31, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str32, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList33);
    }

    @Test
    public void test1585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1585");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor33 = oAuth2Accessor22.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor34 = oAuth2Accessor22.clone();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(oAuth2Accessor33);
        org.junit.Assert.assertNotNull(oAuth2Accessor34);
    }

    @Test
    public void test1586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1586");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1587");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.refreshToken = "none";
        oAuth2Accessor1.code = "Authorization-Schesme%3Dnull%26realm%3Dnone%3DUTF-8";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1588");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        oAuth2Message5.method = "POST";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getParameters();
        java.lang.String str14 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1589");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.expires_in;
        java.lang.String str6 = oAuth2Accessor2.refreshToken;
        net.oauth.v2.OAuth2.Parameter parameter10 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str11 = parameter10.toString();
        java.lang.String str13 = parameter10.setValue("none");
        net.oauth.v2.OAuth2Client oAuth2Client14 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        java.lang.String str16 = oAuth2Accessor15.tokenType;
        oAuth2Accessor15.tokenType = "response_type";
        oAuth2Accessor15.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str22 = oAuth2Accessor15.scope;
        java.lang.String str23 = oAuth2Accessor15.expires_in;
        boolean boolean24 = parameter10.equals((java.lang.Object) oAuth2Accessor15);
        oAuth2Accessor2.setProperty("error", (java.lang.Object) parameter10);
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Authorization-Schesme=token_type" + "'", str11, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test1590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1590");
        net.oauth.v2.OAuth2Client oAuth2Client1 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = new net.oauth.v2.OAuth2Accessor(oAuth2Client1);
        java.lang.String str3 = oAuth2Accessor2.tokenType;
        java.lang.String str4 = oAuth2Accessor2.tokenType;
        java.lang.Object obj6 = oAuth2Accessor2.getProperty("client_secret");
        oAuth2Accessor2.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str9 = oAuth2Accessor2.scope;
        java.lang.String str10 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception13);
        oAuth2Accessor2.setProperty("OAuth2Message(hi!, , [])", (java.lang.Object) oAuth2Exception14);
        java.lang.Throwable[] throwableArray16 = oAuth2Exception14.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("null%20%20realm%3D%22invalid_token%22=expires_in", (java.lang.Throwable) oAuth2Exception14);
        java.lang.Throwable[] throwableArray18 = oAuth2Exception14.getSuppressed();
        java.lang.Throwable[] throwableArray19 = oAuth2Exception14.getSuppressed();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(throwableArray16);
        org.junit.Assert.assertNotNull(throwableArray18);
        org.junit.Assert.assertNotNull(throwableArray19);
    }

    @Test
    public void test1591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1591");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = oAuth2Message9.URL;
        java.lang.String str11 = oAuth2Message9.toString();
        java.lang.String str13 = oAuth2Message9.getHeader("OAuth2Message(OAuth2Message(hi!, GET, []), none, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(HTTP response, GET, [])" + "'", str11, "OAuth2Message(HTTP response, GET, [])");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1592");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.URL;
        java.lang.String str9 = oAuth2Message5.getCode();
        java.lang.String str10 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1593");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception3);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception("token");
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test1594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1594");
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
        oAuth2Accessor24.code = "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
    }

    @Test
    public void test1595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1595");
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
        java.io.InputStream inputStream20 = null;
        net.oauth.v2.OAuth2Message oAuth2Message21 = new net.oauth.v2.OAuth2Message("redirect_uri_mismatch", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, inputStream20);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList22 = oAuth2Message21.getParameters();
        java.lang.String str24 = oAuth2Message21.getWWWAuthenticateHeader("error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str26 = oAuth2Message21.getHeader("net.oauth.v2.OAuth2Exception: POST");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strEntryList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "null  realm=\"error_description%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str24, "null  realm=\"error_description%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test1596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1596");
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
        java.lang.String[] strArray18 = new java.lang.String[] {};
        java.lang.String str19 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray18);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray18);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2.newList(strArray18);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList22 = net.oauth.v2.OAuth2.newList(strArray18);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        java.lang.String str24 = net.oauth.v2.OAuth2.addParameters("grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        oAuth2Accessor1.setProperty("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "grant_type");
        oAuth2Accessor1.code = "response_type";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "DELETE" + "'", str20, "DELETE");
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertNotNull(parameterList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "grant_type" + "'", str24, "grant_type");
    }

    @Test
    public void test1597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1597");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getWWWAuthenticateHeader("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        oAuth2Message4.method = "authorization_code";
        oAuth2Message4.URL = "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"";
        java.lang.String str11 = oAuth2Message4.method;
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message4.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"" + "'", str6, "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "authorization_code" + "'", str11, "authorization_code");
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test1598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1598");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1599");
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
        oAuth2Message5.URL = "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        java.lang.String str19 = oAuth2Message5.getHeader("null  realm=\"client_id\"");
        oAuth2Message5.method = "net.oauth.v2.OAuth2ProblemException: none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1600");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"client_secret\"");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1601");
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
        oAuth2Accessor15.refreshToken = "";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test1602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1602");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1603");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        oAuth2Accessor6.scope = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str9 = oAuth2Accessor6.expires_in;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1604");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        oAuth2Message8.method = "application%2Fx-www-form-urlencoded";
        java.lang.String str12 = oAuth2Message8.getClientId();
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1605");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str2, "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1606");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.state = "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor1.clone();
        java.lang.String str8 = oAuth2Accessor7.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1607");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap41 = oAuth2ProblemException17.getParameters();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertNotNull(parameterArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap41);
    }

    @Test
    public void test1608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1608");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1609");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: refresh_token", "application%252Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str6, "null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1610");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client12 = oAuth2Accessor11.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertNotNull(oAuth2Accessor11);
        org.junit.Assert.assertNull(oAuth2Client12);
    }

    @Test
    public void test1611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1611");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception73 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException51);
        java.lang.String str74 = oAuth2Exception73.toString();
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
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str74, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1612");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream6);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("null  realm=\"password\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("Authorization-Schesme=refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream12 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"password\"" + "'", str10, "null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Authorization-Schesme=refresh_token" + "'", str11, "Authorization-Schesme=refresh_token");
    }

    @Test
    public void test1613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1613");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.OAuth2.ErrorCode;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1614");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("error_description", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1615");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.lang.String str1 = oAuth2ProblemException0.getProblem();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        oAuth2ProblemException0.setParameter("assertion", (java.lang.Object) parameterList4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str14 = oAuth2Message12.getHeader("response_type");
        oAuth2Message12.method = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.Map<java.lang.String, java.lang.String> strMap17 = oAuth2Message12.getParameterMap();
        oAuth2ProblemException0.setParameter("access_token", (java.lang.Object) oAuth2Message12);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test1616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1616");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.accessToken = "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test1617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1617");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1618");
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
        java.lang.Throwable[] throwableArray19 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client21 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client21);
        oAuth2Accessor22.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        int int31 = oAuth2ProblemException27.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception35 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException34);
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException34.addSuppressed((java.lang.Throwable) oAuth2Exception36);
        net.oauth.v2.OAuth2Exception oAuth2Exception38 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception36);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException40 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException40);
        int int42 = oAuth2ProblemException40.getHttpStatusCode();
        oAuth2Exception38.addSuppressed((java.lang.Throwable) oAuth2ProblemException40);
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2ProblemException40);
        oAuth2Accessor22.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException27);
        java.lang.String str46 = oAuth2Accessor22.state;
        oAuth2ProblemException1.setParameter("OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.lang.Object) oAuth2Accessor22);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException49 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception52 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception53 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception52);
        net.oauth.v2.OAuth2Exception oAuth2Exception54 = new net.oauth.v2.OAuth2Exception("code_and_token", (java.lang.Throwable) oAuth2Exception53);
        oAuth2ProblemException49.addSuppressed((java.lang.Throwable) oAuth2Exception54);
        int int56 = oAuth2ProblemException49.getHttpStatusCode();
        int int57 = oAuth2ProblemException49.getHttpStatusCode();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException49);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 200 + "'", int56 == 200);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 200 + "'", int57 == 200);
    }

    @Test
    public void test1619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1619");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getWWWAuthenticateHeader("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        oAuth2Message4.method = "authorization_code";
        oAuth2Message4.URL = "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"";
        java.lang.String str11 = oAuth2Message4.method;
        java.lang.String str12 = oAuth2Message4.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"" + "'", str6, "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "authorization_code" + "'", str11, "authorization_code");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(authorization_code, null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\", [])" + "'", str12, "OAuth2Message(authorization_code, null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\", [])");
    }

    @Test
    public void test1620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1620");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test1621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1621");
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
        java.lang.Throwable[] throwableArray32 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 200 + "'", int17 == 200);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(throwableArray32);
    }

    @Test
    public void test1622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1622");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "DELETE";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception: HTTP request";
        oAuth2Accessor1.code = "null%2520%2520realm%253D%2522net.oauth.v2.OAuth2ProblemException%25253A%252520Location%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2522%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test1623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1623");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.lang.String str10 = oAuth2Message8.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        java.lang.String str12 = oAuth2Message8.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getHeaders();
        java.lang.Class<?> wildcardClass14 = oAuth2Message8.getClass();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(, client_id, [])" + "'", str12, "OAuth2Message(, client_id, [])");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1624");
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
        java.lang.String str13 = parameter2.getValue();
        java.lang.String str15 = parameter2.setValue("expires_in");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertNotNull(baseGrantType7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "token_type" + "'", str12, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1625");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor2.clone();
        oAuth2Accessor5.accessToken = "";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
    }

    @Test
    public void test1626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1626");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"invalid_client\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1627");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("unsupported_response_type");
        net.oauth.v2.OAuth2Client oAuth2Client3 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor4.clone();
        java.lang.Object obj7 = oAuth2Accessor5.getProperty("PUT");
        java.lang.String str8 = oAuth2Accessor5.refreshToken;
        java.lang.Object obj10 = oAuth2Accessor5.getProperty("redirect_uri");
        net.oauth.v2.OAuth2Client oAuth2Client12 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = new net.oauth.v2.OAuth2Accessor(oAuth2Client12);
        java.lang.String str14 = oAuth2Accessor13.tokenType;
        oAuth2Accessor13.expires_in = "GET";
        java.lang.String str17 = oAuth2Accessor13.expires_in;
        oAuth2Accessor5.setProperty("HTTP request", (java.lang.Object) oAuth2Accessor13);
        oAuth2ProblemException1.setParameter("", (java.lang.Object) oAuth2Accessor13);
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "GET" + "'", str17, "GET");
    }

    @Test
    public void test1628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1628");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: refresh_token", "application%252Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test1629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1629");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.io.OutputStream outputStream15 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12, outputStream15);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2Accessor1.setProperty("error_uri", (java.lang.Object) str17);
        oAuth2Accessor1.state = "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1630");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str4 = parameter2.setValue("");
        java.lang.String str6 = parameter2.setValue("response_type");
        java.lang.String str7 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none" + "'", str7, "none");
    }

    @Test
    public void test1631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1631");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str5 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_client\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "refresh_token" + "'", str6, "refresh_token");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null  realm=\"invalid_client\"" + "'", str7, "null  realm=\"invalid_client\"");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"" + "'", str8, "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1632");
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
        java.lang.String str15 = oAuth2Message7.getCode();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1633");
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
        int int25 = oAuth2ProblemException7.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
    }

    @Test
    public void test1634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1634");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("client_credentials", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("HTTP response");
        java.lang.String str7 = parameter2.setValue("null  realm=\"access_denied\"");
        java.lang.String str8 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str3, "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str5, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP response" + "'", str7, "HTTP response");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "client_credentials" + "'", str8, "client_credentials");
    }

    @Test
    public void test1635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1635");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.Object obj6 = null;
        boolean boolean7 = parameter2.equals(obj6);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        boolean boolean12 = parameter2.equals((java.lang.Object) parameterList9);
        java.lang.String str13 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme" + "'", str13, "Authorization-Schesme");
    }

    @Test
    public void test1636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1636");
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
        oAuth2Accessor17.tokenType = "Authorization-Schesme=token_type";
        java.lang.String str22 = oAuth2Accessor17.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1637");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream6);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream10);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTTP status" + "'", str4, "HTTP status");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unauthorized_client" + "'", str5, "unauthorized_client");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1638");
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
        java.lang.String str18 = parameter2.setValue("null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str3, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str16, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "POST" + "'", str18, "POST");
    }

    @Test
    public void test1639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1639");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1640");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        oAuth2Accessor1.expires_in = "2.0";
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("none=invalid_client");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1641");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test1642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1642");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        oAuth2Accessor2.tokenType = "";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test1643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1643");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream8);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream13 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream13);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "username" + "'", str6, "username");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"invalid_token\"" + "'", str12, "null  realm=\"invalid_token\"");
    }

    @Test
    public void test1644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1644");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.toString();
        java.lang.String str12 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str11, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1645");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(oAuth2Client6);
    }

    @Test
    public void test1646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1646");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.Object obj6 = oAuth2Client3.getProperty("null  realm=\"2.0\"");
        java.lang.Object obj8 = null;
        oAuth2Client3.setProperty("error_description", obj8);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error_description" + "'", str4, "error_description");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test1647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1647");
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
        oAuth2Accessor2.refreshToken = "#net.oauth.v2.OAuth2Exception=HTTP%20status";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(oAuth2Client16);
    }

    @Test
    public void test1648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1648");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.state;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        oAuth2Accessor1.setProperty("password", (java.lang.Object) "hi!");
        java.lang.String str11 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1649");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str11 = oAuth2Message5.getHeader("error_uri");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strEntryList12);
    }

    @Test
    public void test1650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1650");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("PUT=unsupported_grant_type", "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"", "HTTP response");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
    }

    @Test
    public void test1651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1651");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = oAuth2Accessor1.clone();
        java.lang.String str22 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str16, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1652");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "OAuth2Message(hi!, , [])", "Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
    }

    @Test
    public void test1653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1653");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "";
        java.lang.String str11 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1654");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = parameter2.getKey();
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
        boolean boolean20 = parameter2.equals((java.lang.Object) parameterList14);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test1655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1655");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(Authorization-Schesme=token_type, , [])", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str4, "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1656");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1657");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("OAuth2Message(HTTP request, , [])", "OAuth2Message(, client_id, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1658");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2ProblemException: Location", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str11, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test1659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1659");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        java.lang.String str8 = oAuth2Message4.getParameter("UTF-8");
        java.lang.String str9 = oAuth2Message4.URL;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "UTF-8" + "'", str9, "UTF-8");
    }

    @Test
    public void test1660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1660");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException3.getParameters();
        java.lang.Throwable[] throwableArray5 = oAuth2ProblemException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException3.getParameters();
        oAuth2ProblemException1.setParameter("error", (java.lang.Object) oAuth2ProblemException3);
        java.lang.String str10 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2ProblemException: invalid_token" + "'", str10, "net.oauth.v2.OAuth2ProblemException: invalid_token");
    }

    @Test
    public void test1661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1661");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"", "OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "unsupported_grant_type" + "'", str8, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "username" + "'", str9, "username");
    }

    @Test
    public void test1662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1662");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT", strArray4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "access_token" + "'", str6, "access_token");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT" + "'", str7, "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2Exception" + "'", str8, "net.oauth.v2.OAuth2Exception");
    }

    @Test
    public void test1663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1663");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        boolean boolean7 = parameter2.equals((java.lang.Object) "invalid_token");
        java.lang.String str9 = parameter2.setValue("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str10 = parameter2.getKey();
        net.oauth.v2.OAuth2.Parameter[] parameterArray13 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList14 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, parameterArray13);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.lang.String str18 = oAuth2Message16.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message16.getHeaders();
        java.lang.String str20 = oAuth2Message16.URL;
        java.lang.String str21 = oAuth2Message16.getClientId();
        java.lang.String str22 = oAuth2Message16.getCode();
        boolean boolean23 = parameter2.equals((java.lang.Object) str22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme" + "'", str10, "Authorization-Schesme");
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strEntryList19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test1664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1664");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP status", strArray5);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", strArray5);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DELETE" + "'", str7, "DELETE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "invalid_request" + "'", str8, "invalid_request");
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP status" + "'", str10, "HTTP status");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str11, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(parameterList12);
    }

    @Test
    public void test1665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1665");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1666");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException5);
        int int7 = oAuth2ProblemException5.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException5.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception8.addSuppressed((java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception13);
        oAuth2ProblemException1.setParameter("HTTP%20status", (java.lang.Object) oAuth2Exception13);
        java.lang.String str16 = oAuth2Exception13.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: invalid_token" + "'", str16, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: invalid_token");
    }

    @Test
    public void test1667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1667");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2Exception: OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception: OAuth2Message(hi!, , [])" + "'", str1, "net.oauth.v2.OAuth2Exception: OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1668");
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
        java.lang.String[] strArray25 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList26 = net.oauth.v2.OAuth2.newList(strArray25);
        java.lang.String str27 = net.oauth.v2.OAuth2.addParameters("assertion", strArray25);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList28 = net.oauth.v2.OAuth2.newList(strArray25);
        java.lang.String str29 = net.oauth.v2.OAuth2.addParameters("hi!", strArray25);
        java.lang.String str30 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"", strArray25);
        oAuth2ProblemException8.setParameter("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!", (java.lang.Object) strArray25);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList32 = net.oauth.v2.OAuth2.newList(strArray25);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(parameterList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str29, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str30, "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList32);
    }

    @Test
    public void test1669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1669");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.Object obj9 = null;
        oAuth2Accessor1.setProperty("", obj9);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1670");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client12 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = new net.oauth.v2.OAuth2Accessor(oAuth2Client12);
        java.lang.String str14 = oAuth2Accessor13.tokenType;
        java.lang.String str15 = oAuth2Accessor13.refreshToken;
        java.lang.String str16 = oAuth2Accessor13.code;
        java.lang.String str17 = oAuth2Accessor13.code;
        java.lang.String str18 = oAuth2Accessor13.tokenType;
        java.lang.String str19 = oAuth2Accessor13.state;
        java.lang.String str20 = oAuth2Accessor13.code;
        java.lang.String str21 = oAuth2Accessor13.code;
        oAuth2Accessor13.state = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        oAuth2Accessor13.code = "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList32 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message33 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32);
        java.lang.String str34 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList32);
        net.oauth.v2.OAuth2Message oAuth2Message35 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = oAuth2Message35.getParameterMap();
        java.lang.String str37 = oAuth2Message35.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList38 = oAuth2Message35.getHeaders();
        oAuth2Accessor13.setProperty("null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message35);
        oAuth2Accessor10.setProperty("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor13);
        oAuth2Accessor13.scope = "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(parameterList32);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str37, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        org.junit.Assert.assertNotNull(strEntryList38);
    }

    @Test
    public void test1671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1671");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1672");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        java.lang.Throwable[] throwableArray13 = oAuth2Exception12.getSuppressed();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test1673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1673");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"error_description%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test1674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1674");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int3 = oAuth2ProblemException2.getHttpStatusCode();
        java.lang.Throwable[] throwableArray4 = oAuth2ProblemException2.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("GET", (java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test1675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1675");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str12 = oAuth2Accessor11.accessToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = oAuth2Accessor11.clone();
        oAuth2Accessor11.accessToken = "null  realm=\"none%3DUTF-8\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
    }

    @Test
    public void test1676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1676");
        java.lang.String[] strArray5 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"client_id\"", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream7);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(parameterList6);
    }

    @Test
    public void test1677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1677");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[68, 69, 76, 69, 84, 69, 35, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
    }

    @Test
    public void test1678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1678");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        oAuth2Message8.method = "application%2Fx-www-form-urlencoded";
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str15 = oAuth2Message8.getWWWAuthenticateHeader("null%20%20realm%3D%22Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%3Fnet.oauth.v2.OAuth2Exception%3DHTTP%2520status");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522Location%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2522%253Fnet.oauth.v2.OAuth2Exception%253DHTTP%252520status\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522Location%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2522%253Fnet.oauth.v2.OAuth2Exception%253DHTTP%252520status\"");
    }

    @Test
    public void test1679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1679");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null  realm=\"2.0\"", strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("Location", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Location?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "Location?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1680");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("", "HTTP request");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP request" + "'", str3, "HTTP request");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "=HTTP%20request" + "'", str4, "=HTTP%20request");
    }

    @Test
    public void test1681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1681");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("PUT", "unsupported_grant_type");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.getValue();
        java.lang.String str5 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PUT" + "'", str3, "PUT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_grant_type" + "'", str4, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PUT=unsupported_grant_type" + "'", str5, "PUT=unsupported_grant_type");
    }

    @Test
    public void test1682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1682");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22" + "'", str1, "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22");
    }

    @Test
    public void test1683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1683");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException22 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2Accessor19.setProperty("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=HTTP%20status", (java.lang.Object) "error_uri");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
    }

    @Test
    public void test1684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1684");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1685");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.tokenType = "refresh_token";
        java.lang.String str12 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1686");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str5 = oAuth2Accessor2.tokenType;
        java.lang.String str6 = oAuth2Accessor2.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1687");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.refreshToken = "none";
        java.lang.String str12 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "response_type" + "'", str12, "response_type");
    }

    @Test
    public void test1688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1688");
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
        oAuth2Accessor19.accessToken = "OAuth2Message(POST, access_token, [])";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client18);
    }

    @Test
    public void test1689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1689");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1690");
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
        java.lang.String str38 = oAuth2ProblemException9.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str38, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1691");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.lang.String str10 = oAuth2Message8.getWWWAuthenticateHeader("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"" + "'", str10, "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test1692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1692");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap12 = oAuth2ProblemException11.getParameters();
        java.lang.Throwable[] throwableArray13 = oAuth2ProblemException11.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client18 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str19 = oAuth2Client18.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter23 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str24 = parameter23.toString();
        java.lang.String str26 = parameter23.setValue("access_denied");
        oAuth2Client18.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter23);
        oAuth2ProblemException11.setParameter("state", (java.lang.Object) oAuth2Client18);
        oAuth2Exception10.addSuppressed((java.lang.Throwable) oAuth2ProblemException11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(throwableArray13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Authorization-Schesme=token_type" + "'", str24, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "token_type" + "'", str26, "token_type");
    }

    @Test
    public void test1693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1693");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1694");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.accessToken;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("");
        oAuth2Accessor1.expires_in = "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test1695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1695");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception("invalid_token", (java.lang.Throwable) oAuth2Exception8);
        java.lang.String str10 = oAuth2Exception9.toString();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception: invalid_token" + "'", str10, "net.oauth.v2.OAuth2Exception: invalid_token");
    }

    @Test
    public void test1696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1696");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        oAuth2Accessor2.refreshToken = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1697");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        oAuth2Message4.method = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str9 = oAuth2Message4.getClientId();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1698");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "", "Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        oAuth2Accessor6.expires_in = "net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
    }

    @Test
    public void test1699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1699");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.lang.String str15 = oAuth2Message8.getHeader("");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1700");
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
        int int40 = oAuth2ProblemException35.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(parameterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 200 + "'", int37 == 200);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 200 + "'", int40 == 200);
    }

    @Test
    public void test1701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1701");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1702");
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
        java.lang.String str17 = oAuth2Accessor1.refreshToken;
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
    public void test1703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1703");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        java.lang.String str13 = oAuth2Exception6.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2Exception: invalid_request" + "'", str13, "net.oauth.v2.OAuth2Exception: invalid_request");
    }

    @Test
    public void test1704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1704");
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
        java.lang.String str38 = oAuth2Client3.clientSecret;
        java.lang.String[] strArray43 = new java.lang.String[] { "response_type" };
        java.lang.String str44 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray43);
        java.lang.String str45 = net.oauth.v2.OAuth2.addParameters("bearer", strArray43);
        oAuth2Client3.setProperty("Location", (java.lang.Object) str45);
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
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str38, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str44, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "bearer" + "'", str45, "bearer");
    }

    @Test
    public void test1705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1705");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception10);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        int int16 = oAuth2ProblemException14.getHttpStatusCode();
        oAuth2Exception12.addSuppressed((java.lang.Throwable) oAuth2ProblemException14);
        oAuth2Client3.setProperty("", (java.lang.Object) oAuth2Exception12);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
    }

    @Test
    public void test1706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1706");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.Object obj8 = oAuth2Accessor2.getProperty("Authorization-Schesme=null&realm=none%3DUTF-8");
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1707");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        boolean boolean7 = parameter2.equals((java.lang.Object) "invalid_token");
        boolean boolean9 = parameter2.equals((java.lang.Object) "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test1708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1708");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("token_type", "OAuth2Message(POST, refresh_token, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream12);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str15 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "unsupported_grant_type" + "'", str9, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "username" + "'", str10, "username");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "access_token" + "'", str14, "access_token");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1709");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1710");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1711");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        oAuth2Accessor1.accessToken = "client_credentials";
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        java.lang.Object obj11 = oAuth2Accessor1.getProperty("net.oauth.v2.OAuth2Exception=HTTP%20status");
        oAuth2Accessor1.refreshToken = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client_credentials" + "'", str9, "client_credentials");
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test1712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1712");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        java.lang.Class<?> wildcardClass6 = baseResponseType0.getClass();
        org.junit.Assert.assertNotNull(baseResponseType0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test1713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1713");
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
        java.lang.String str27 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor28 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
        org.junit.Assert.assertNotNull(parameterArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str27, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1714");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.method;
        java.lang.String str15 = oAuth2Message8.getParameter("net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message8.URL = "application/x-www-form-urlencoded#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.Map<java.lang.String, java.lang.String> strMap18 = oAuth2Message8.getParameterMap();
        java.lang.Class<?> wildcardClass19 = oAuth2Message8.getClass();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DELETE" + "'", str13, "DELETE");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1715");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str6 = parameter2.setValue("assertion_type");
        java.lang.String str8 = parameter2.setValue("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "assertion_type" + "'", str8, "assertion_type");
    }

    @Test
    public void test1716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1716");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2ProblemException1.setParameter("OAuth2Message(hi!, GET, [])", (java.lang.Object) "HTTP status");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        java.lang.Throwable[] throwableArray9 = oAuth2Exception7.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2ProblemException11.setParameter("UTF-8", (java.lang.Object) "invalid_grant");
        oAuth2Exception7.addSuppressed((java.lang.Throwable) oAuth2ProblemException11);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test1717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1717");
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
        oAuth2Accessor17.tokenType = "code";
        java.lang.String str22 = oAuth2Accessor17.state;
        java.lang.String str23 = oAuth2Accessor17.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "code" + "'", str23, "code");
    }

    @Test
    public void test1718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1718");
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
        java.lang.String str18 = oAuth2Message15.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message15.getParameters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(POST, refresh_token, [])" + "'", str18, "OAuth2Message(POST, refresh_token, [])");
        org.junit.Assert.assertNotNull(strEntryList19);
    }

    @Test
    public void test1719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1719");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str13 = oAuth2Message12.URL;
        java.lang.String str15 = oAuth2Message12.getHeader("null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22");
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_scope" + "'", str13, "invalid_scope");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1720");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22invalid_token%22=POST", "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: refresh_token");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2ProblemException: refresh_token" + "'", str4, "net.oauth.v2.OAuth2ProblemException: refresh_token");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1721");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.String str14 = oAuth2Client3.clientSecret;
        java.lang.Object obj16 = oAuth2Client3.getProperty("invalid_grant");
        java.lang.String str17 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str14, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test1722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1722");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str8 = oAuth2Message4.URL;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "application/x-www-form-urlencoded" + "'", str8, "application/x-www-form-urlencoded");
    }

    @Test
    public void test1723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1723");
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
        java.lang.String str20 = oAuth2Client7.redirectUri;
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList25 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message26 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str27 = oAuth2Message26.toString();
        oAuth2Client7.setProperty("OAuth2Message(2.0, UTF-8, [])", (java.lang.Object) str27);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(parameterList25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str27, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test1724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1724");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.code = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "assertion_type";
        java.lang.String str12 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1725");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: refresh_token", "application%252Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test1726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1726");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("client_credentials=application%252Fx-www-form-urlencoded", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DELETE" + "'", str5, "DELETE");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "client_credentials=application%252Fx-www-form-urlencoded" + "'", str7, "client_credentials=application%252Fx-www-form-urlencoded");
    }

    @Test
    public void test1727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1727");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "access_token";
        oAuth2Accessor1.expires_in = "net.oauth.v2.OAuth2Exception: HTTP request";
        java.lang.String str13 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1728");
        net.oauth.v2.OAuth2.Parameter[] parameterArray5 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList6 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, parameterArray5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("null  realm=\"client_secret\"", "HTTP status", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1729");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getValue();
        java.lang.String str5 = parameter2.toString();
        java.lang.String str6 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
    }

    @Test
    public void test1730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1730");
        net.oauth.v2.OAuth2Client oAuth2Client1 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = new net.oauth.v2.OAuth2Accessor(oAuth2Client1);
        java.lang.String str3 = oAuth2Accessor2.tokenType;
        oAuth2Accessor2.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor2.client;
        oAuth2Accessor2.refreshToken = "null  realm=\"\"";
        java.lang.String[] strArray17 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList18 = net.oauth.v2.OAuth2.newList(strArray17);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParameters("assertion", strArray17);
        oAuth2Accessor2.setProperty("client_secret", (java.lang.Object) strArray17);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2.newList(strArray17);
        java.lang.String str22 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client6);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(parameterList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str19, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str22, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1731");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.accessToken = "net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client6);
    }

    @Test
    public void test1732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1732");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray9);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15, outputStream16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
    }

    @Test
    public void test1733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1733");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1734");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"unsupported_grant_type%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
    }

    @Test
    public void test1735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1735");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.accessToken = "net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1736");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.refreshToken;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        oAuth2Accessor6.state = "Authorization-Schesme=scope";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "assertion" + "'", str7, "assertion");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test1737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1737");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("application%252Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2Exception11);
        oAuth2Accessor1.setProperty("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"", (java.lang.Object) oAuth2Exception11);
        oAuth2Accessor1.refreshToken = "application/x-www-form-urlencoded";
        java.lang.String str16 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1738");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("assertion", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str8, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion" + "'", str10, "assertion");
    }

    @Test
    public void test1739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1739");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"error_description%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22error_description%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22" + "'", str1, "null%20%20realm%3D%22error_description%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22");
    }

    @Test
    public void test1740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1740");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        oAuth2Message4.method = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message4.getParameterMap();
        java.lang.String str10 = oAuth2Message4.URL;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
    }

    @Test
    public void test1741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1741");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "GET");
    }

    @Test
    public void test1742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1742");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("access_token");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1743");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream8);
        java.lang.String str10 = oAuth2Message9.getClientId();
        java.lang.String str11 = oAuth2Message9.getClientId();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "access_token" + "'", str6, "access_token");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1744");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        java.lang.String str3 = oAuth2ProblemException0.getProblem();
        int int4 = oAuth2ProblemException0.getHttpStatusCode();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test1745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1745");
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
        oAuth2Accessor17.tokenType = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str22 = oAuth2Accessor17.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test1746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1746");
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
        java.lang.String str18 = oAuth2Client3.clientId;
        java.lang.Object obj20 = oAuth2Client3.getProperty("null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        java.lang.String str21 = oAuth2Client3.redirectUri;
        java.lang.String[] strArray33 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList34 = net.oauth.v2.OAuth2.newList(strArray33);
        java.lang.String str35 = net.oauth.v2.OAuth2.addParameters("assertion", strArray33);
        java.lang.String str36 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray33);
        java.lang.String str37 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray33);
        java.lang.String str38 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Authorization-Schesme\"", strArray33);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList39 = net.oauth.v2.OAuth2.newList(strArray33);
        oAuth2Client3.setProperty("error_uri", (java.lang.Object) parameterList39);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "token_type" + "'", str18, "token_type");
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertNotNull(parameterList34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str35, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str36, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str37, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str38, "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList39);
    }

    @Test
    public void test1747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1747");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1748");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1749");
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
        java.lang.String str20 = oAuth2Client7.redirectUri;
        java.lang.String str21 = oAuth2Client7.clientId;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "token_type" + "'", str21, "token_type");
    }

    @Test
    public void test1750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1750");
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
        oAuth2Accessor1.refreshToken = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1751");
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
        java.lang.String str20 = oAuth2Message18.getWWWAuthenticateHeader("\n");
        java.lang.String str21 = oAuth2Message18.getClientId();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "token_type" + "'", str10, "token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "token_type  realm=\"%0A\"" + "'", str20, "token_type  realm=\"%0A\"");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1752");
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
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList33 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str34 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList33);
        java.lang.String str35 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList33);
        net.oauth.v2.OAuth2Message oAuth2Message36 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList33);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList37 = oAuth2Message36.getParameters();
        oAuth2Message36.method = "DELETE";
        oAuth2Message36.completeParameters();
        java.lang.String str41 = oAuth2Message36.getClientId();
        java.lang.String str42 = oAuth2Message36.getCode();
        oAuth2Accessor1.setProperty("net.oauth.v2.OAuth2ProblemException: hi!", (java.lang.Object) str42);
        java.lang.String str44 = oAuth2Accessor1.tokenType;
        java.lang.Object obj46 = oAuth2Accessor1.getProperty("DELETE#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Accessor1.scope = "null%20%20realm%3D%22net.oauth.v2.OAuth2ProblemException%253A%2520Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNotNull(parameterList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "unsupported_grant_type" + "'", str34, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "username" + "'", str35, "username");
        org.junit.Assert.assertNotNull(strEntryList37);
        org.junit.Assert.assertNull(str41);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNull(str44);
        org.junit.Assert.assertNull(obj46);
    }

    @Test
    public void test1753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1753");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        oAuth2Accessor1.scope = "HTTP status";
        oAuth2Accessor1.code = "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1754");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        net.oauth.v2.OAuth2.Parameter[] parameterArray14 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList15 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, parameterArray14);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str19 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str20 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str21 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.io.InputStream inputStream22 = null;
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: Location", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, inputStream22);
        java.io.OutputStream outputStream24 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15, outputStream24);
        net.oauth.v2.OAuth2Message oAuth2Message26 = new net.oauth.v2.OAuth2Message("null%20%20realm%3D%22Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%3Fnet.oauth.v2.OAuth2Exception%3DHTTP%2520status", "null%20%20realm%3D%22code_and_token%22", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        boolean boolean27 = parameter2.equals((java.lang.Object) "null%20%20realm%3D%22code_and_token%22");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertNotNull(parameterArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test1755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1755");
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
        net.oauth.v2.OAuth2Client oAuth2Client16 = oAuth2Accessor1.client;
        oAuth2Accessor1.tokenType = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(oAuth2Client16);
    }

    @Test
    public void test1756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1756");
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
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message12.getParameterMap();
        java.lang.String str18 = oAuth2Message12.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str19 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str18, "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(scope, HTTP request, [])" + "'", str19, "OAuth2Message(scope, HTTP request, [])");
    }

    @Test
    public void test1757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1757");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.lang.String str10 = oAuth2Message8.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        java.lang.String str12 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Authorization-Schesme=token_type" + "'", str12, "Authorization-Schesme=token_type");
    }

    @Test
    public void test1758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1758");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str2, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1759");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        net.oauth.v2.OAuth2Message oAuth2Message3 = new net.oauth.v2.OAuth2Message("access_token", "response_type", parameterCollection2);
        java.lang.String str5 = oAuth2Message3.getParameter("net.oauth.v2.OAuth2Exception: invalid_token");
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1760");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("HTTP request", "invalid_request", "HTTP request");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj8 = oAuth2Client3.getProperty("null  realm=\"invalid_token\"=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "invalid_request" + "'", str5, "invalid_request");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test1761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1761");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.code = "null  realm=\"none%3DUTF-8\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1762");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null%20%20realm%3D%22net.oauth.v2.OAuth2ProblemException%253A%2520Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "null  realm=\"null%20%20realm%3D%22OAuth2Message%2528scope%252C%2520DELETE%252C%2520%255B%255D%2529%22\"");
    }

    @Test
    public void test1763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1763");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "null  realm=\"null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1764");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("URL", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.Class<?> wildcardClass5 = parameterList2.getClass();
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "URL?Authorization-Schesme=null" + "'", str3, "URL?Authorization-Schesme=null");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test1765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1765");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.state = "hi!";
        java.lang.String str5 = oAuth2Accessor2.scope;
        oAuth2Accessor2.state = "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1766");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "\ufffd\n";
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception=HTTP%20status";
        oAuth2Accessor1.expires_in = "null  realm=\"password\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1767");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1768");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1769");
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
        java.lang.String str24 = oAuth2ProblemException7.getProblem();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "invalid_token" + "'", str24, "invalid_token");
    }

    @Test
    public void test1770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1770");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1771");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22invalid_token%22=POST", "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: refresh_token");
        java.lang.String[] strArray13 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray13);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("assertion", strArray13);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray13);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("expires_in", strArray13);
        oAuth2Client3.setProperty("invalid_token", (java.lang.Object) strArray13);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1772");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getHeaders();
        java.lang.String str15 = oAuth2Message8.getParameter("PUT");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message8.getParameters();
        oAuth2Message8.completeParameters();
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntryList16);
    }

    @Test
    public void test1773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1773");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        java.lang.String str4 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.accessToken = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.accessToken = "";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1774");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_grant", "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1775");
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
        java.lang.String str34 = oAuth2Client18.redirectUri;
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test1776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1776");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "";
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "2.0";
        net.oauth.v2.OAuth2Client oAuth2Client14 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(oAuth2Client14);
    }

    @Test
    public void test1777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1777");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.method;
        java.lang.String str13 = oAuth2Message5.method;
        java.lang.String str14 = oAuth2Message5.getCode();
        java.lang.String str15 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1778");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "invalid_request";
        oAuth2Accessor1.tokenType = "null%20%20realm%3D%22invalid_token%22=expires_in";
        oAuth2Accessor1.expires_in = "OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str14 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1779");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1780");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"%0A%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1781");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("bearer");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
    }

    @Test
    public void test1782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1782");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor2.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor2.clone();
        java.lang.String str9 = oAuth2Accessor8.state;
        oAuth2Accessor8.code = "";
        oAuth2Accessor8.expires_in = "null  realm=\"code_and_token\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1783");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.state;
        oAuth2Accessor2.code = "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1784");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException3);
        java.lang.Throwable[] throwableArray6 = oAuth2Exception5.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("unsupported_response_type", (java.lang.Throwable) oAuth2Exception5);
        java.lang.Throwable[] throwableArray8 = oAuth2Exception5.getSuppressed();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test1785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1785");
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
        oAuth2Accessor1.tokenType = "null  realm=\"unsupported_grant_type\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test1786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1786");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1787");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, inputStream13);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("URL", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("client_credentials", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(Authorization-Schesme=token_type, , [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("application/x-www-form-urlencoded", "OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "unsupported_grant_type" + "'", str12, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str18, "OAuth2Message(Authorization-Schesme=token_type, , [])");
    }

    @Test
    public void test1788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1788");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("token", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        java.lang.String str14 = oAuth2Message12.getParameter("null  realm=\"client_id\"");
        oAuth2Message12.completeParameters();
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "unsupported_grant_type" + "'", str8, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "username" + "'", str9, "username");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1789");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1790");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.tokenType = "code_and_token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1791");
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
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "null  realm=\"unsupported_grant_type\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str21 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test1792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1792");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1793");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor12 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1794");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", "null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        java.lang.Object obj5 = null;
        oAuth2Client3.setProperty("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", obj5);
    }

    @Test
    public void test1795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1795");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(POST, refresh_token, [])");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "OAuth2Message(POST, refresh_token, [])" + "'", str2, "OAuth2Message(POST, refresh_token, [])");
    }

    @Test
    public void test1796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1796");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.code;
        oAuth2Accessor1.accessToken = "authorization_code";
        net.oauth.v2.OAuth2Client oAuth2Client6 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client6);
    }

    @Test
    public void test1797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1797");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("\ufffd\n", "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request", "null  realm=\"unsupported_grant_type\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.lang.String str9 = oAuth2Message8.getCode();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1798");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1799");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getClientId();
        oAuth2Message8.method = "username";
        java.lang.String str14 = oAuth2Message8.method;
        java.lang.String str15 = oAuth2Message8.getCode();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "username" + "'", str14, "username");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1800");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test1801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1801");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream13);
        java.lang.String str15 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "refresh_token" + "'", str12, "refresh_token");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1802");
        java.lang.String[] strArray6 = new java.lang.String[] { "password", "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "redirect_uri_mismatch", "net.oauth.v2.OAuth2ProblemException: client_id", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" };
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray6);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray6);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.Class<?> wildcardClass10 = strMap9.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str7, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test1803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1803");
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
        int int24 = oAuth2ProblemException7.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
    }

    @Test
    public void test1804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1804");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1805");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj6 = oAuth2Accessor4.getProperty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str7 = oAuth2Accessor4.tokenType;
        java.lang.String str8 = oAuth2Accessor4.scope;
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1806");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1807");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        boolean boolean6 = parameter2.equals((java.lang.Object) "OAuth2Message(hi!, , [])");
        java.lang.String str8 = parameter2.setValue("bearer");
        java.lang.String str9 = parameter2.getKey();
        java.lang.String str10 = parameter2.getKey();
        java.lang.String str11 = parameter2.toString();
        java.lang.String str12 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "scope" + "'", str8, "scope");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme" + "'", str9, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme" + "'", str10, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Authorization-Schesme=bearer" + "'", str11, "Authorization-Schesme=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Authorization-Schesme=bearer" + "'", str12, "Authorization-Schesme=bearer");
    }

    @Test
    public void test1808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1808");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1809");
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
        oAuth2Message7.method = "null  realm=\"\"";
        java.lang.String str17 = oAuth2Message7.getHeader("refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_client" + "'", str13, "invalid_client");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test1810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1810");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null%20%20realm%3D%22code_and_token%22");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1811");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1812");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.tokenType = "Authorization-Schesme=refresh_token";
        java.lang.String str9 = oAuth2Accessor1.refreshToken;
        java.lang.String str10 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1813");
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
        java.lang.String str14 = oAuth2Accessor1.refreshToken;
        java.lang.String str15 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1814");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none=invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream15);
        java.io.OutputStream outputStream17 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10, outputStream17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test1815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1815");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        oAuth2Message5.method = "POST";
        oAuth2Message5.completeParameters();
        java.lang.String str15 = oAuth2Message5.getParameter("URL?Authorization-Schesme=null");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1816");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = oAuth2Accessor7.clone();
        net.oauth.v2.OAuth2Client oAuth2Client14 = oAuth2Accessor13.client;
        oAuth2Accessor13.refreshToken = "";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion" + "'", str12, "assertion");
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
        org.junit.Assert.assertNull(oAuth2Client14);
    }

    @Test
    public void test1817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1817");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null  realm=\"unsupported_grant_type\"");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception1);
    }

    @Test
    public void test1818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1818");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.Throwable[] throwableArray3 = oAuth2Exception2.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test1819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1819");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(POST, refresh_token, [])", "Location", "null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"");
    }

    @Test
    public void test1820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1820");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        boolean boolean6 = parameter2.equals((java.lang.Object) "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        oAuth2ProblemException8.setParameter("net.oauth.v2.OAuth2Exception", (java.lang.Object) "username");
        boolean boolean13 = parameter2.equals((java.lang.Object) "net.oauth.v2.OAuth2Exception");
        java.lang.String str15 = parameter2.setValue("net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str16 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scope" + "'", str15, "scope");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1821");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.String str8 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1822");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream10);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("client_credentials?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1823");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.tokenType = "username";
        java.lang.String str9 = oAuth2Accessor1.tokenType;
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "username" + "'", str9, "username");
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "username" + "'", str11, "username");
    }

    @Test
    public void test1824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1824");
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
        java.lang.String str29 = oAuth2Client3.redirectUri;
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test1825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1825");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.lang.String str8 = oAuth2Message5.URL;
        java.lang.String str10 = oAuth2Message5.getParameter("net.oauth.v2.OAuth2ProblemException: invalid_token");
        java.lang.String str11 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "hi!" + "'", str11, "hi!");
    }

    @Test
    public void test1826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1826");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        java.lang.String str2 = oAuth2Exception1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" + "'", str2, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
    }

    @Test
    public void test1827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1827");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        java.lang.String str4 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.refreshToken = "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test1828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1828");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("error");
        net.oauth.v2.OAuth2Client oAuth2Client8 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        java.lang.String str10 = oAuth2Accessor9.tokenType;
        java.lang.String str11 = oAuth2Accessor9.tokenType;
        java.lang.String str12 = oAuth2Accessor9.scope;
        boolean boolean13 = parameter2.equals((java.lang.Object) str12);
        java.lang.String str14 = parameter2.getKey();
        java.lang.String str15 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Authorization-Schesme" + "'", str14, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Authorization-Schesme" + "'", str15, "Authorization-Schesme");
    }

    @Test
    public void test1829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1829");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        int int5 = oAuth2ProblemException3.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException3.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client8 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        oAuth2Accessor9.refreshToken = "assertion";
        java.lang.String str12 = oAuth2Accessor9.state;
        oAuth2ProblemException3.setParameter("error_uri", (java.lang.Object) oAuth2Accessor9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException15 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException15);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException15.addSuppressed((java.lang.Throwable) oAuth2Exception17);
        int int19 = oAuth2ProblemException15.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException22 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception23 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException22);
        net.oauth.v2.OAuth2Exception oAuth2Exception24 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException22.addSuppressed((java.lang.Throwable) oAuth2Exception24);
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception24);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException28 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException28);
        int int30 = oAuth2ProblemException28.getHttpStatusCode();
        oAuth2Exception26.addSuppressed((java.lang.Throwable) oAuth2ProblemException28);
        oAuth2ProblemException15.addSuppressed((java.lang.Throwable) oAuth2ProblemException28);
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2ProblemException28);
        oAuth2Exception1.addSuppressed((java.lang.Throwable) oAuth2ProblemException3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
    }

    @Test
    public void test1830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1830");
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
        java.lang.String[] strArray32 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList33 = net.oauth.v2.OAuth2.newList(strArray32);
        java.lang.String str34 = net.oauth.v2.OAuth2.addParameters("assertion", strArray32);
        java.lang.String str35 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray32);
        java.lang.String str36 = net.oauth.v2.OAuth2.addParameters("POST", strArray32);
        java.lang.String str37 = net.oauth.v2.OAuth2.addParameters("null  realm=\"password\"", strArray32);
        oAuth2Accessor1.setProperty("OAuth2Message(scope, HTTP request, [])", (java.lang.Object) "null  realm=\"password\"");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertNotNull(parameterList33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str34, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str35, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str36, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "null  realm=\"password\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str37, "null  realm=\"password\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1831");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        oAuth2Message10.URL = "null  realm=\"2.0\"";
        oAuth2Message10.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test1832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1832");
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
        java.lang.String str36 = oAuth2Message32.getWWWAuthenticateHeader("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        java.lang.String str38 = oAuth2Message32.getHeader("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
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
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"" + "'", str36, "null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test1833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1833");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = oAuth2Message5.getParameters();
        java.lang.String str7 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strEntryList6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1834");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message4.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message4.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test1835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1835");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "assertion";
        oAuth2Accessor1.accessToken = "client_secret";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\n" + "'", str7, "\ufffd\n");
    }

    @Test
    public void test1836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1836");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str13 = oAuth2Message8.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message8.getParameterMap();
        java.lang.String str16 = oAuth2Message8.URL;
        java.lang.String str17 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str12, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "client_id" + "'", str16, "client_id");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "client_id" + "'", str17, "client_id");
    }

    @Test
    public void test1837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1837");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "Authorization-Schesme";
        oAuth2Accessor1.expires_in = "invalid_token";
        oAuth2Accessor1.code = "";
        oAuth2Accessor1.refreshToken = "invalid_token";
        oAuth2Accessor1.refreshToken = "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test1838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1838");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.refreshToken;
        oAuth2Accessor6.accessToken = "error_uri";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "assertion" + "'", str7, "assertion");
    }

    @Test
    public void test1839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1839");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException17 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException17.addSuppressed((java.lang.Throwable) oAuth2Exception19);
        int int21 = oAuth2ProblemException17.getHttpStatusCode();
        java.lang.String str22 = oAuth2ProblemException17.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap23 = oAuth2ProblemException17.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception24 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap28 = oAuth2ProblemException27.getParameters();
        java.lang.Throwable[] throwableArray29 = oAuth2ProblemException27.getSuppressed();
        java.lang.Throwable[] throwableArray30 = oAuth2ProblemException27.getSuppressed();
        net.oauth.v2.OAuth2.Parameter[] parameterArray34 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList35 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList35, parameterArray34);
        net.oauth.v2.OAuth2Message oAuth2Message37 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList35);
        oAuth2ProblemException27.setParameter("username", (java.lang.Object) "hi!");
        java.lang.Throwable[] throwableArray39 = oAuth2ProblemException27.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception40 = new net.oauth.v2.OAuth2Exception("error_description", (java.lang.Throwable) oAuth2ProblemException27);
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2ProblemException27);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNotNull(throwableArray30);
        org.junit.Assert.assertNotNull(parameterArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(throwableArray39);
    }

    @Test
    public void test1840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1840");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = oAuth2ProblemException14.getParameters();
        java.lang.String[] strArray25 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList26 = net.oauth.v2.OAuth2.newList(strArray25);
        java.lang.String str27 = net.oauth.v2.OAuth2.addParameters("assertion", strArray25);
        java.lang.String str28 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray25);
        oAuth2ProblemException14.setParameter("application%252Fx-www-form-urlencoded", (java.lang.Object) "Location");
        oAuth2ProblemException8.setParameter("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "Location");
        java.lang.Throwable[] throwableArray31 = oAuth2ProblemException8.getSuppressed();
        java.lang.String str32 = oAuth2ProblemException8.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strArray25);
        org.junit.Assert.assertNotNull(parameterList26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str28, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str32, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1841");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("username");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[117, 115, 101, 114, 110, 97, 109, 101]");
    }

    @Test
    public void test1842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1842");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.scope = "invalid_client";
        net.oauth.v2.OAuth2Client oAuth2Client9 = oAuth2Accessor1.client;
        java.lang.String str10 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "OAuth2Message(scope, DELETE, [])";
        oAuth2Accessor1.tokenType = "scope";
        java.lang.String str15 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.scope = "null  realm=\"invalid_token\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(oAuth2Client9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "scope" + "'", str15, "scope");
    }

    @Test
    public void test1843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1843");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.lang.String str12 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1844");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor9.client;
        java.lang.Object obj13 = oAuth2Client11.getProperty("assertion");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(oAuth2Client11);
        org.junit.Assert.assertNull(obj13);
    }

    @Test
    public void test1845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1845");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.lang.Throwable[] throwableArray6 = oAuth2Exception4.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2Exception11);
        int int13 = oAuth2ProblemException9.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = oAuth2ProblemException9.getParameters();
        oAuth2Exception7.addSuppressed((java.lang.Throwable) oAuth2ProblemException9);
        java.lang.String[] strArray26 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList27 = net.oauth.v2.OAuth2.newList(strArray26);
        java.lang.String str28 = net.oauth.v2.OAuth2.addParameters("assertion", strArray26);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList29 = net.oauth.v2.OAuth2.newList(strArray26);
        java.lang.String str30 = net.oauth.v2.OAuth2.addParameters("hi!", strArray26);
        java.lang.String str31 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"", strArray26);
        oAuth2ProblemException9.setParameter("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!", (java.lang.Object) strArray26);
        java.lang.String str33 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(, client_id, [])", strArray26);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertNotNull(parameterList27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str28, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str30, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str31, "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OAuth2Message(, client_id, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str33, "OAuth2Message(, client_id, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1846");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj11 = oAuth2Accessor9.getProperty("GET");
        java.lang.String str12 = oAuth2Accessor9.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1847");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(hi!, GET, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap3 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertNotNull(strMap3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str4, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1848");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
    }

    @Test
    public void test1849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1849");
        net.oauth.v2.OAuth2Client oAuth2Client1 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = new net.oauth.v2.OAuth2Accessor(oAuth2Client1);
        java.lang.String str3 = oAuth2Accessor2.tokenType;
        java.lang.String str4 = oAuth2Accessor2.refreshToken;
        java.lang.String str5 = oAuth2Accessor2.code;
        java.lang.String str6 = oAuth2Accessor2.code;
        java.lang.String str7 = oAuth2Accessor2.tokenType;
        java.lang.String str8 = oAuth2Accessor2.state;
        net.oauth.v2.BaseTokenType baseTokenType10 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType10;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType10);
        oAuth2Accessor2.setProperty("code_and_token", (java.lang.Object) baseTokenType10);
        oAuth2Accessor2.scope = "expires_in";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        java.lang.Throwable[] throwableArray20 = oAuth2Exception19.getSuppressed();
        oAuth2Accessor2.setProperty("application/x-www-form-urlencoded", (java.lang.Object) oAuth2Exception19);
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception("response_type", (java.lang.Throwable) oAuth2Exception19);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(baseTokenType10);
        org.junit.Assert.assertNotNull(throwableArray20);
    }

    @Test
    public void test1850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1850");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.toString();
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1851");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"password\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=access_token");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1852");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1853");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "client_id";
        oAuth2Accessor1.state = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        java.lang.String str10 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1854");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("error_description");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test1855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1855");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("application%2Fx-www-form-urlencoded", "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(HTTP request, , [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP response" + "'", str10, "HTTP response");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(HTTP request, , [])" + "'", str13, "OAuth2Message(HTTP request, , [])");
    }

    @Test
    public void test1856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1856");
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
        java.lang.Throwable[] throwableArray19 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client21 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client21);
        oAuth2Accessor22.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        int int31 = oAuth2ProblemException27.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception35 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException34);
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException34.addSuppressed((java.lang.Throwable) oAuth2Exception36);
        net.oauth.v2.OAuth2Exception oAuth2Exception38 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception36);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException40 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException40);
        int int42 = oAuth2ProblemException40.getHttpStatusCode();
        oAuth2Exception38.addSuppressed((java.lang.Throwable) oAuth2ProblemException40);
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2ProblemException40);
        oAuth2Accessor22.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException27);
        java.lang.String str46 = oAuth2Accessor22.state;
        oAuth2ProblemException1.setParameter("OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.lang.Object) oAuth2Accessor22);
        java.lang.String str48 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(throwableArray19);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 200 + "'", int42 == 200);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str48, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1857");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = oAuth2ProblemException2.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Throwable) oAuth2ProblemException2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test1858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1858");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        oAuth2ProblemException0.setParameter("application%252Fx-www-form-urlencoded", (java.lang.Object) "Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException0);
        java.lang.Throwable[] throwableArray17 = oAuth2ProblemException0.getSuppressed();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(throwableArray17);
    }

    @Test
    public void test1859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1859");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream12);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("URL", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("client_credentials", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=error", "error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream16);
        java.lang.String str18 = oAuth2Message17.URL;
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "error" + "'", str18, "error");
    }

    @Test
    public void test1860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1860");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("HTTP request", "invalid_request", "HTTP request");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Class<?> wildcardClass7 = oAuth2Client3.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "invalid_request" + "'", str5, "invalid_request");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test1861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1861");
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
        java.lang.String str22 = oAuth2Message12.URL;
        java.lang.String str23 = oAuth2Message12.URL;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null  realm=\"invalid_token\"" + "'", str22, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "null  realm=\"invalid_token\"" + "'", str23, "null  realm=\"invalid_token\"");
    }

    @Test
    public void test1862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1862");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("token_type", "OAuth2Message(POST, refresh_token, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        java.lang.String str13 = oAuth2Message12.URL;
        java.lang.String str14 = oAuth2Message12.getCode();
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "unsupported_grant_type" + "'", str8, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "username" + "'", str9, "username");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(POST, refresh_token, [])" + "'", str13, "OAuth2Message(POST, refresh_token, [])");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1863");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.expires_in = "null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        oAuth2Accessor1.code = "invalid_grant";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1864");
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
        java.lang.String str29 = oAuth2Client3.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor30 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "token_type" + "'", str29, "token_type");
    }

    @Test
    public void test1865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1865");
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
        oAuth2Accessor11.refreshToken = "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
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
    public void test1866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1866");
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
        java.lang.Object obj19 = oAuth2Client3.getProperty("null  realm=\"OAuth2Message%28scope%2C%20DELETE%2C%20%5B%5D%29\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertNull(obj16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test1867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1867");
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
        java.lang.String str14 = parameter11.getKey();
        java.lang.String str16 = parameter11.setValue("null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str13, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str14, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "PUT" + "'", str16, "PUT");
    }

    @Test
    public void test1868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1868");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Location" + "'", str2, "Location");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
    }

    @Test
    public void test1869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1869");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "application%252Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test1870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1870");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.URL = "2.0";
        java.lang.String str11 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1871");
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
        oAuth2Accessor21.refreshToken = "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        net.oauth.v2.OAuth2Client oAuth2Client26 = oAuth2Accessor21.client;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(oAuth2Client26);
    }

    @Test
    public void test1872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1872");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("unsupported_response_type");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        int int8 = oAuth2ProblemException4.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException11.addSuppressed((java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException17 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        int int19 = oAuth2ProblemException17.getHttpStatusCode();
        oAuth2Exception15.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        int int22 = oAuth2ProblemException17.getHttpStatusCode();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        java.lang.Throwable[] throwableArray24 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertNotNull(throwableArray24);
    }

    @Test
    public void test1873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1873");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("Authorization-Schesme=refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16);
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
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Authorization-Schesme=refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "Authorization-Schesme=refresh_token?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1874");
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
        net.oauth.v2.OAuth2.Parameter[] parameterArray37 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList38 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList38, parameterArray37);
        net.oauth.v2.OAuth2Message oAuth2Message40 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList38);
        java.lang.String str42 = oAuth2Message40.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap43 = oAuth2Message40.getParameterMap();
        oAuth2Message40.URL = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        oAuth2ProblemException9.setParameter("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", (java.lang.Object) "OAuth2Message(Authorization-Schesme=token_type, , [])");
        java.lang.String str47 = oAuth2ProblemException9.getProblem();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(parameterArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "hi!" + "'", str47, "hi!");
    }

    @Test
    public void test1875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1875");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        java.lang.String str12 = oAuth2Exception6.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception: invalid_request" + "'", str12, "net.oauth.v2.OAuth2Exception: invalid_request");
    }

    @Test
    public void test1876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1876");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str9 = oAuth2Message7.getParameter("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message7.getHeaders();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test1877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1877");
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
        java.lang.String str17 = oAuth2Client3.clientSecret;
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList24 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str25 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        java.lang.String str26 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        net.oauth.v2.OAuth2Message oAuth2Message27 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList28 = oAuth2Message27.getParameters();
        java.lang.String str29 = oAuth2Message27.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList30 = oAuth2Message27.getParameters();
        oAuth2Client3.setProperty("redirect_uri_mismatch", (java.lang.Object) strEntryList30);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str35 = oAuth2ProblemException34.getProblem();
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException34);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException39 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception40 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException39);
        int int41 = oAuth2ProblemException39.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception42 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException39.addSuppressed((java.lang.Throwable) oAuth2Exception42);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException45 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception42.addSuppressed((java.lang.Throwable) oAuth2ProblemException45);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException49 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception50 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException49);
        net.oauth.v2.OAuth2Exception oAuth2Exception51 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException49.addSuppressed((java.lang.Throwable) oAuth2Exception51);
        net.oauth.v2.OAuth2Exception oAuth2Exception53 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception51);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException55 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception56 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException55);
        int int57 = oAuth2ProblemException55.getHttpStatusCode();
        oAuth2Exception53.addSuppressed((java.lang.Throwable) oAuth2ProblemException55);
        net.oauth.v2.OAuth2.Parameter[] parameterArray62 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList63 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList63, parameterArray62);
        net.oauth.v2.OAuth2Message oAuth2Message65 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList63);
        java.lang.String str67 = oAuth2Message65.getHeader("");
        java.lang.String str68 = oAuth2Message65.URL;
        oAuth2ProblemException55.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str68);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException71 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception72 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException71);
        int int73 = oAuth2ProblemException71.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception74 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException71.addSuppressed((java.lang.Throwable) oAuth2Exception74);
        java.util.Map<java.lang.String, java.lang.Object> strMap76 = oAuth2ProblemException71.getParameters();
        oAuth2ProblemException55.addSuppressed((java.lang.Throwable) oAuth2ProblemException71);
        oAuth2ProblemException45.addSuppressed((java.lang.Throwable) oAuth2ProblemException55);
        net.oauth.v2.OAuth2Exception oAuth2Exception79 = new net.oauth.v2.OAuth2Exception("invalid_scope", (java.lang.Throwable) oAuth2ProblemException45);
        oAuth2Exception36.addSuppressed((java.lang.Throwable) oAuth2ProblemException45);
        oAuth2Client3.setProperty("null%20%20realm%3D%22code_and_token%22", (java.lang.Object) oAuth2Exception36);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str17, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(parameterList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "unsupported_grant_type" + "'", str25, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "username" + "'", str26, "username");
        org.junit.Assert.assertNotNull(strEntryList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strEntryList30);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str35, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 200 + "'", int41 == 200);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 200 + "'", int57 == 200);
        org.junit.Assert.assertNotNull(parameterArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 200 + "'", int73 == 200);
        org.junit.Assert.assertNotNull(strMap76);
    }

    @Test
    public void test1878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1878");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"invalid_token\"=expires_in");
    }

    @Test
    public void test1879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1879");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "none=invalid_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1880");
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
        java.util.Map<java.lang.String, java.lang.String> strMap20 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test1881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1881");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("HTTP status");
    }

    @Test
    public void test1882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1882");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "redirect_uri", "invalid_scope");
        java.lang.Object obj5 = oAuth2Client3.getProperty("DELETE");
        java.lang.Object obj7 = oAuth2Client3.getProperty("bearer");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test1883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1883");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.toString();
        java.lang.String str9 = oAuth2Message5.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test1884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1884");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.String str7 = oAuth2Accessor1.expires_in;
        java.lang.String str8 = oAuth2Accessor1.code;
        java.lang.String str9 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1885");
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
        java.lang.Class<?> wildcardClass14 = strEntryList13.getClass();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test1886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1886");
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
        java.lang.String str43 = oAuth2Exception42.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "net.oauth.v2.OAuth2Exception: invalid_scope" + "'", str43, "net.oauth.v2.OAuth2Exception: invalid_scope");
    }

    @Test
    public void test1887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1887");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "OAuth2Message(hi!, , [])";
        oAuth2Accessor1.scope = "error";
        java.lang.Object obj12 = oAuth2Accessor1.getProperty("GET");
        oAuth2Accessor1.state = "null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj12);
    }

    @Test
    public void test1888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1888");
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
        java.lang.String str29 = oAuth2Client3.clientSecret;
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
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str29, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1889");
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
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
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
    public void test1890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1890");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str12 = oAuth2Message10.getParameter("OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test1891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1891");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.toString();
        oAuth2Message8.URL = "state";
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str11, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test1892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1892");
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
        java.lang.Throwable throwable60 = null;
        // The following exception was thrown during execution in test generation
        try {
            oAuth2Exception42.addSuppressed(throwable60);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
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
    }

    @Test
    public void test1893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1893");
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
        java.lang.String str26 = parameter2.toString();
        java.lang.String str27 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in" + "'", str26, "null%20%20realm%3D%22invalid_token%22=expires_in");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "expires_in" + "'", str27, "expires_in");
    }

    @Test
    public void test1894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1894");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("password", "null  realm=\"password\"", "assertion_type");
        java.lang.Object obj5 = oAuth2Client3.getProperty("expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException11);
        int int13 = oAuth2ProblemException11.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException11.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("token_type", (java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2Exception16);
        oAuth2Client3.setProperty("", (java.lang.Object) oAuth2Exception17);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "password" + "'", str6, "password");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
    }

    @Test
    public void test1895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1895");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("access_denied", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream13);
        java.lang.String str16 = oAuth2Message14.getParameter("state");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message14.getParameters();
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "unsupported_grant_type" + "'", str7, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "username" + "'", str8, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str12, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strEntryList17);
    }

    @Test
    public void test1896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1896");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        oAuth2Accessor9.accessToken = "Authorization-Schesme=token_type";
        java.lang.String str13 = oAuth2Accessor9.expires_in;
        java.lang.String str14 = oAuth2Accessor9.accessToken;
        java.lang.Class<?> wildcardClass15 = oAuth2Accessor9.getClass();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Authorization-Schesme=token_type" + "'", str14, "Authorization-Schesme=token_type");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test1897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1897");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("DELETE");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str4 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[68, 69, 76, 69, 84, 69]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "DELETE" + "'", str2, "DELETE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "DELETE" + "'", str3, "DELETE");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "DELETE" + "'", str4, "DELETE");
    }

    @Test
    public void test1898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1898");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = oAuth2ProblemException27.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        java.lang.Throwable[] throwableArray34 = oAuth2ProblemException27.getSuppressed();
        java.lang.Class<?> wildcardClass35 = throwableArray34.getClass();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(throwableArray34);
        org.junit.Assert.assertNotNull(wildcardClass35);
    }

    @Test
    public void test1899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1899");
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
        oAuth2Accessor7.refreshToken = "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        oAuth2Accessor7.accessToken = "null%20%20realm%3D%22%22";
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
    public void test1900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1900");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        java.lang.String str11 = oAuth2Accessor1.code;
        oAuth2Accessor1.accessToken = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "unsupported_grant_type" + "'", str11, "unsupported_grant_type");
    }

    @Test
    public void test1901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1901");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.refreshToken = "none";
        oAuth2Accessor1.code = "none";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1902");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("net.oauth.v2.OAuth2Exception: invalid_request");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception%3A%20invalid_request" + "'", str1, "net.oauth.v2.OAuth2Exception%3A%20invalid_request");
    }

    @Test
    public void test1903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1903");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        java.lang.Class<?> wildcardClass9 = baseResponseType0.getClass();
        org.junit.Assert.assertNotNull(baseResponseType0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test1904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1904");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.method = "UTF-8";
        oAuth2Message5.method = "invalid_grant";
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
    }

    @Test
    public void test1905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1905");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1906");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test1907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1907");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray11);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1908");
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
        java.lang.String str15 = oAuth2Message12.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getParameters();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntryList16);
    }

    @Test
    public void test1909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1909");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("authorization_code", "assertion");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "authorization_code" + "'", str3, "authorization_code");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "assertion" + "'", str4, "assertion");
    }

    @Test
    public void test1910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1910");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[76, 111, 99, 97, 116, 105, 111, 110, 35, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
    }

    @Test
    public void test1911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1911");
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
        java.lang.Class<?> wildcardClass19 = oAuth2Accessor9.getClass();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor16);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test1912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1912");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.state;
        java.lang.String str6 = oAuth2Accessor2.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test1913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1913");
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
        java.lang.String str13 = oAuth2Accessor1.expires_in;
        java.lang.String str14 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.state = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(baseTokenType9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1914");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none=invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream15);
        oAuth2Message16.completeParameters();
        java.lang.String str19 = oAuth2Message16.getParameter("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message16.URL = "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test1915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1915");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        java.lang.Object obj5 = oAuth2Client3.getProperty("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test1916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1916");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("GET", "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "access_token" + "'", str6, "access_token");
        org.junit.Assert.assertNotNull(parameterList7);
    }

    @Test
    public void test1917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1917");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.String str7 = oAuth2Accessor6.refreshToken;
        java.lang.String str8 = oAuth2Accessor6.code;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test1918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1918");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "scope";
        oAuth2Accessor1.code = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"";
        java.lang.String str9 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1919");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("OAuth2Message(POST, access_token, [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message%28POST%2C%20access_token%2C%20%5B%5D%29" + "'", str1, "OAuth2Message%28POST%2C%20access_token%2C%20%5B%5D%29");
    }

    @Test
    public void test1920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1920");
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
        java.lang.String str24 = oAuth2Client23.clientSecret;
        java.lang.String str25 = oAuth2Client23.clientSecret;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str24, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str25, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1921");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("access_token");
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2.Parameter parameter13 = new net.oauth.v2.OAuth2.Parameter("null%20%20realm%3D%22%22", "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        oAuth2Accessor1.setProperty("Authorization-Schesme=null&realm=none=UTF-8", (java.lang.Object) parameter13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test1922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1922");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str11 = oAuth2Message5.getHeader("error_uri");
        java.lang.String str13 = oAuth2Message5.getParameter("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str14 = oAuth2Message5.getCode();
        oAuth2Message5.method = "error_uri";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1923");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1924");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("none=UTF-8");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 111, 110, 101, 61, 85, 84, 70, 45, 56]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "none=UTF-8" + "'", str2, "none=UTF-8");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "none=UTF-8" + "'", str3, "none=UTF-8");
    }

    @Test
    public void test1925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1925");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(OAuth2Message(hi!, GET, []), none, [])", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
    }

    @Test
    public void test1926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1926");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message8.getParameters();
        java.lang.String str13 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "DELETE" + "'", str13, "DELETE");
    }

    @Test
    public void test1927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1927");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.String str20 = oAuth2Client7.clientSecret;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1928");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("null  realm=\"invalid_token\"");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        oAuth2Accessor6.state = "null  realm=\"code_and_token\"";
        java.lang.String str9 = oAuth2Accessor6.expires_in;
        java.lang.String str10 = oAuth2Accessor6.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1929");
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
        java.lang.String str15 = oAuth2Message5.getParameter("net.oauth.v2.OAuth2Exception: ");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test1930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1930");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getValue();
        java.lang.String str5 = parameter2.toString();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
    }

    @Test
    public void test1931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1931");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception18);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
    }

    @Test
    public void test1932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1932");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        oAuth2Message7.completeParameters();
        java.lang.String str10 = oAuth2Message7.toString();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(invalid_grant, invalid_client, [])" + "'", str10, "OAuth2Message(invalid_grant, invalid_client, [])");
    }

    @Test
    public void test1933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1933");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test1934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1934");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("client_credentials", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DELETE" + "'", str5, "DELETE");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "client_credentials" + "'", str9, "client_credentials");
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
    }

    @Test
    public void test1935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1935");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null%20%20realm%3D%22unsupported_grant_type%22");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"unsupported_grant_type\"" + "'", str1, "null  realm=\"unsupported_grant_type\"");
    }

    @Test
    public void test1936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1936");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("state", "net.oauth.v2.OAuth2Exception", "HTTP response");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "state" + "'", str5, "state");
    }

    @Test
    public void test1937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1937");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.Class<?> wildcardClass3 = parameter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test1938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1938");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        java.util.Map<java.lang.String, java.lang.String> strMap20 = oAuth2Message12.getParameterMap();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strMap20);
    }

    @Test
    public void test1939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1939");
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
        java.lang.String str20 = oAuth2Client18.clientId;
        java.lang.Object obj22 = oAuth2Client18.getProperty("=HTTP%20request");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "token_type" + "'", str20, "token_type");
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test1940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1940");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException7.getParameters();
        java.lang.Throwable[] throwableArray9 = oAuth2ProblemException7.getSuppressed();
        int int10 = oAuth2ProblemException7.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        int int16 = oAuth2ProblemException12.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        net.oauth.v2.OAuth2Exception oAuth2Exception21 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException19.addSuppressed((java.lang.Throwable) oAuth2Exception21);
        net.oauth.v2.OAuth2Exception oAuth2Exception23 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception21);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException25 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException25);
        int int27 = oAuth2ProblemException25.getHttpStatusCode();
        oAuth2Exception23.addSuppressed((java.lang.Throwable) oAuth2ProblemException25);
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2ProblemException25);
        int int30 = oAuth2ProblemException25.getHttpStatusCode();
        java.lang.String str31 = oAuth2ProblemException25.getProblem();
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2ProblemException25);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        int int34 = oAuth2ProblemException7.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(throwableArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
    }

    @Test
    public void test1941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1941");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1942");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str13 = oAuth2Message5.getParameter("assertion");
        java.lang.String str14 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1943");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        oAuth2Message8.method = "application%2Fx-www-form-urlencoded";
        oAuth2Message8.URL = "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"";
        java.lang.String str14 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"" + "'", str14, "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"");
    }

    @Test
    public void test1944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1944");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer", "hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test1945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1945");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.scope;
        oAuth2Accessor1.scope = "invalid_client";
        net.oauth.v2.OAuth2.Parameter[] parameterArray12 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList13 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, parameterArray12);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.lang.String str17 = oAuth2Message15.getHeader("");
        java.lang.String str18 = oAuth2Message15.URL;
        oAuth2Accessor1.setProperty("invalid_request", (java.lang.Object) str18);
        oAuth2Accessor1.accessToken = "";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(parameterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test1946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1946");
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
        net.oauth.v2.OAuth2Client oAuth2Client13 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor14 = new net.oauth.v2.OAuth2Accessor(oAuth2Client13);
        oAuth2Accessor14.refreshToken = "assertion";
        java.lang.String str17 = oAuth2Accessor14.state;
        java.lang.String str18 = oAuth2Accessor14.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = oAuth2Accessor14.clone();
        java.lang.String str20 = oAuth2Accessor19.tokenType;
        java.lang.Object obj22 = oAuth2Accessor19.getProperty("token");
        oAuth2Accessor19.scope = "unsupported_response_type";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        int int29 = oAuth2ProblemException27.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception30 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2Exception30);
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = oAuth2ProblemException27.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int35 = oAuth2ProblemException34.getHttpStatusCode();
        java.lang.String str36 = oAuth2ProblemException34.getProblem();
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2ProblemException34);
        int int38 = oAuth2ProblemException34.getHttpStatusCode();
        int int39 = oAuth2ProblemException34.getHttpStatusCode();
        oAuth2Accessor19.setProperty("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) int39);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor41 = oAuth2Accessor19.clone();
        oAuth2ProblemException1.setParameter("null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"", (java.lang.Object) oAuth2Accessor19);
        java.lang.Throwable[] throwableArray43 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(oAuth2Accessor19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 200 + "'", int29 == 200);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "hi!" + "'", str36, "hi!");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 200 + "'", int38 == 200);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor41);
        org.junit.Assert.assertNotNull(throwableArray43);
    }

    @Test
    public void test1947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1947");
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
        java.lang.Object obj35 = oAuth2Client16.getProperty("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str36 = oAuth2Client16.redirectUri;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str33, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test1948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1948");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getWWWAuthenticateHeader("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        java.lang.String str7 = oAuth2Message4.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"" + "'", str6, "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(, token_type, [])" + "'", str7, "OAuth2Message(, token_type, [])");
    }

    @Test
    public void test1949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1949");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("\ufffd\n", strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("none=token", strArray4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\n" + "'", str6, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none=token" + "'", str7, "none=token");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str8, "access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
    }

    @Test
    public void test1950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1950");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("OAuth2Message(invalid_grant, invalid_client, [])");
    }

    @Test
    public void test1951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1951");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("unsupported_response_type");
    }

    @Test
    public void test1952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1952");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("state", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream13);
        oAuth2Message14.completeParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message14.getParameterMap();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1953");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test1954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1954");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor9.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = oAuth2Accessor10.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNotNull(oAuth2Accessor11);
    }

    @Test
    public void test1955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1955");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Client3.setProperty("null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str9 = oAuth2Client3.redirectUri;
        java.lang.Object obj11 = oAuth2Client3.getProperty("none=UTF-8");
        java.lang.String str12 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token" + "'", str9, "token");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HTTP request" + "'", str12, "HTTP request");
    }

    @Test
    public void test1956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1956");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "", "Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2.Parameter parameter9 = new net.oauth.v2.OAuth2.Parameter("invalid_grant", "");
        oAuth2Accessor5.setProperty("assertion_type", (java.lang.Object) parameter9);
    }

    @Test
    public void test1957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1957");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("state", "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        java.lang.String str3 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str3, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test1958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1958");
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
        java.lang.String str27 = oAuth2Client16.redirectUri;
        java.lang.String str28 = oAuth2Client16.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str28, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test1959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1959");
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
        oAuth2Accessor1.refreshToken = "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "authorization_code=assertion";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test1960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1960");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("application%2Fx-www-form-urlencoded", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "application%2Fx-www-form-urlencoded?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "application%2Fx-www-form-urlencoded?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1961");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.method;
        java.lang.String str10 = oAuth2Message5.getHeader("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test1962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1962");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test1963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1963");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException1.setParameter("code", (java.lang.Object) parameterList8);
        net.oauth.v2.OAuth2Client oAuth2Client14 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        oAuth2Accessor15.refreshToken = "assertion";
        oAuth2ProblemException1.setParameter("error_description", (java.lang.Object) oAuth2Accessor15);
        oAuth2Accessor15.state = "code";
        java.lang.String str21 = oAuth2Accessor15.tokenType;
        java.lang.String str22 = oAuth2Accessor15.state;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "code" + "'", str22, "code");
    }

    @Test
    public void test1964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1964");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str8 = oAuth2Message4.method;
        java.lang.String str10 = oAuth2Message4.getParameter("client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        java.lang.String str11 = oAuth2Message4.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "refresh_token" + "'", str8, "refresh_token");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str11, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test1965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1965");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"password\"", "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1966");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test1967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1967");
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
        java.lang.String str34 = parameter11.getKey();
        java.lang.String str35 = parameter11.getKey();
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
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str34, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str35, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test1968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1968");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message8.getParameterMap();
        java.lang.String str14 = oAuth2Message8.toString();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str14, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test1969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1969");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        oAuth2Message5.URL = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        java.lang.String str11 = oAuth2Message5.URL;
        java.lang.String str13 = oAuth2Message5.getHeader("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str11, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test1970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1970");
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
        java.util.Map<java.lang.String, java.lang.String> strMap23 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str24 = net.oauth.v2.OAuth2.addParametersAsFragment("error_description", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "error_description" + "'", str20, "error_description");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "error_description" + "'", str24, "error_description");
    }

    @Test
    public void test1971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1971");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        java.lang.String str8 = parameter2.getKey();
        java.lang.String str10 = parameter2.setValue("invalid_client");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme" + "'", str8, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_grant" + "'", str10, "invalid_grant");
    }

    @Test
    public void test1972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1972");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.tokenType = "null  realm=\"none%3DUTF-8\"";
        oAuth2Accessor1.refreshToken = "null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test1973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1973");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException25 = new net.oauth.v2.OAuth2ProblemException("Location");
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2ProblemException25);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException29 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception30 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException29);
        int int31 = oAuth2ProblemException29.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap32 = oAuth2ProblemException29.getParameters();
        java.lang.Throwable[] throwableArray33 = oAuth2ProblemException29.getSuppressed();
        oAuth2ProblemException25.setParameter("null  realm=\"invalid_client\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) throwableArray33);
        java.lang.String str35 = oAuth2ProblemException25.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(throwableArray33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str35, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test1974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1974");
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
        net.oauth.v2.OAuth2.Parameter[] parameterArray31 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList32 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32, parameterArray31);
        net.oauth.v2.OAuth2Message oAuth2Message34 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32);
        java.lang.String str36 = oAuth2Message34.getHeader("");
        java.lang.String str37 = oAuth2Message34.getClientId();
        java.lang.String str39 = oAuth2Message34.getHeader("UTF-8");
        oAuth2Client3.setProperty("hi!", (java.lang.Object) "UTF-8");
        java.lang.String str41 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNotNull(parameterArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "token_type" + "'", str41, "token_type");
    }

    @Test
    public void test1975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1975");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException1.getSuppressed();
        java.lang.Throwable[] throwableArray4 = oAuth2ProblemException1.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("OAuth2Message(scope, DELETE, [])", (java.lang.Throwable) oAuth2ProblemException1);
        java.lang.String str7 = oAuth2Exception6.toString();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(throwableArray4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2Exception: OAuth2Message(scope, DELETE, [])" + "'", str7, "net.oauth.v2.OAuth2Exception: OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test1976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1976");
        java.lang.String[] strArray12 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray12);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("assertion", strArray12);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray12);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray12);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray12);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", strArray12);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParametersAsFragment("POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", strArray12);
        org.junit.Assert.assertNotNull(strArray12);
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str19, "POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1977");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getParameter("Authorization-Schesme=null&realm=none%3DUTF-8");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1978");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor2.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor2.clone();
        java.lang.String str9 = oAuth2Accessor8.state;
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor8.client;
        oAuth2Accessor8.refreshToken = "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"?Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test1979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1979");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.completeParameters();
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
    }

    @Test
    public void test1980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1980");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("UTF-8", "null  realm=\"password\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("application%252Fx-www-form-urlencoded", "PUT=unsupported_grant_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        org.junit.Assert.assertNotNull(parameterList7);
    }

    @Test
    public void test1981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1981");
        java.lang.String[] strArray3 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str5, "net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertNotNull(strMap6);
    }

    @Test
    public void test1982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1982");
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
        java.lang.String str20 = oAuth2Message15.URL;
        java.lang.String str21 = oAuth2Message15.getCode();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "refresh_token" + "'", str20, "refresh_token");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test1983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1983");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "UTF-8" + "'", str1, "UTF-8");
    }

    @Test
    public void test1984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1984");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.lang.Throwable[] throwableArray6 = oAuth2Exception4.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2Exception11);
        int int13 = oAuth2ProblemException9.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = oAuth2ProblemException9.getParameters();
        oAuth2Exception7.addSuppressed((java.lang.Throwable) oAuth2ProblemException9);
        int int16 = oAuth2ProblemException9.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = oAuth2ProblemException9.getParameters();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList22 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        java.lang.String str24 = oAuth2Message23.method;
        java.lang.String str25 = oAuth2Message23.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = oAuth2Message23.getParameterMap();
        java.lang.String str27 = oAuth2Message23.URL;
        oAuth2ProblemException9.setParameter("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message23);
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception("invalid_client", (java.lang.Throwable) oAuth2ProblemException9);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 200 + "'", int13 == 200);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(parameterList22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "refresh_token" + "'", str24, "refresh_token");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str25, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "application/x-www-form-urlencoded" + "'", str27, "application/x-www-form-urlencoded");
    }

    @Test
    public void test1985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1985");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("client_credentials", "Authorization-Schesme=error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream8);
        java.lang.String str10 = oAuth2Message9.getClientId();
        java.lang.String str11 = oAuth2Message9.getCode();
        oAuth2Message9.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\n" + "'", str6, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "client_credentials" + "'", str7, "client_credentials");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test1986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1986");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor28 = oAuth2Accessor6.clone();
        java.lang.String str29 = oAuth2Accessor28.refreshToken;
        oAuth2Accessor28.scope = "null  realm=\"DELETE%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
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
        org.junit.Assert.assertNotNull(oAuth2Accessor28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "assertion" + "'", str29, "assertion");
    }

    @Test
    public void test1987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1987");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getParameters();
        java.lang.String str11 = oAuth2Message8.toString();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str11, "OAuth2Message(Authorization-Schesme=token_type, , [])");
    }

    @Test
    public void test1988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1988");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str6 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "invalid_grant" + "'", str6, "invalid_grant");
    }

    @Test
    public void test1989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1989");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test1990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1990");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray11);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray11);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22%22", strArray11);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList19 = net.oauth.v2.OAuth2.newList(strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList19);
    }

    @Test
    public void test1991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1991");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("assertion", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test1992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1992");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test1993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1993");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.BaseErrorCode baseErrorCode11 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode11;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode11;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode11);
        oAuth2ProblemException1.setParameter("null  realm=\"\"", (java.lang.Object) baseErrorCode11);
        int int16 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(baseErrorCode11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
    }

    @Test
    public void test1994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1994");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.OutputStream outputStream11 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("client_secret", "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message15.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP request" + "'", str10, "HTTP request");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test1995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1995");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("unsupported_response_type");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        int int8 = oAuth2ProblemException4.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException11);
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException11.addSuppressed((java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception13);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException17 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        int int19 = oAuth2ProblemException17.getHttpStatusCode();
        oAuth2Exception15.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        int int22 = oAuth2ProblemException17.getHttpStatusCode();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException17);
        oAuth2ProblemException1.setParameter("null%20%20realm%3D%22%22", (java.lang.Object) "expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2.Parameter[] parameterArray30 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList31 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList31, parameterArray30);
        net.oauth.v2.OAuth2Message oAuth2Message33 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList31);
        java.lang.String str35 = oAuth2Message33.getHeader("hi!");
        java.lang.String str36 = oAuth2Message33.URL;
        java.lang.String str38 = oAuth2Message33.getParameter("net.oauth.v2.OAuth2ProblemException: invalid_token");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList39 = oAuth2Message33.getHeaders();
        oAuth2Message33.URL = "null  realm=\"password\"=OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])";
        oAuth2ProblemException1.setParameter("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"", (java.lang.Object) oAuth2Message33);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertNotNull(parameterArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strEntryList39);
    }

    @Test
    public void test1996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1996");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "error", "invalid_client");
    }

    @Test
    public void test1997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1997");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("HTTP request");
    }

    @Test
    public void test1998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1998");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message5.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
    }

    @Test
    public void test1999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test1999");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest3.test2000");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        java.lang.String str13 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNull(str13);
    }
}

