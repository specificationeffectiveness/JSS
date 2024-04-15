package net.oauth.v2;

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
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.accessToken;
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2Message18.completeParameters();
        oAuth2Accessor2.setProperty("OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22", (java.lang.Object) oAuth2Message18);
        java.lang.String str21 = oAuth2Accessor2.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("\n", "application%2Fx-www-form-urlencoded", "Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        oAuth2Accessor1.expires_in = "";
        java.lang.String str9 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "", "Authorization-Schesme=token_type");
        java.lang.Object obj5 = oAuth2Client3.getProperty("HTTP status");
        java.lang.String str6 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "client_secret" + "'", str6, "client_secret");
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        java.io.OutputStream outputStream4 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream4);
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("null  realm=\"redirect_uri_mismatch\"", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("OAuth2Message(hi!, , [])");
        oAuth2Accessor2.accessToken = "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        oAuth2Message4.method = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message4.getHeaders();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"" + "'", str1, "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"");
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
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
        oAuth2Message15.method = "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        java.lang.String str8 = parameter2.getKey();
        java.lang.String str10 = parameter2.setValue("null  realm=\"expires_in\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme" + "'", str8, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_grant" + "'", str10, "invalid_grant");
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("access_denied");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("none=UTF-8", (java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        int int12 = oAuth2ProblemException8.getHttpStatusCode();
        java.lang.String str13 = oAuth2ProblemException8.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap14 = oAuth2ProblemException8.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        oAuth2Exception5.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception("OAuth2Message(hi!, 2.0, [])", (java.lang.Throwable) oAuth2Exception5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str12 = oAuth2Accessor11.accessToken;
        java.lang.String str13 = oAuth2Accessor11.accessToken;
        oAuth2Accessor11.expires_in = "null  realm=\"invalid_token\"=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("none=UTF-8", "token_type", "response_type");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str12, "null  realm=\"Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.setProperty("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", (java.lang.Object) 100.0f);
        oAuth2Accessor1.code = "application/x-www-form-urlencoded";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("code", "invalid_token", "");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        java.lang.Object obj9 = oAuth2Accessor7.getProperty("PUT");
        java.lang.String str10 = oAuth2Accessor7.refreshToken;
        java.lang.Object obj12 = oAuth2Accessor7.getProperty("redirect_uri");
        net.oauth.v2.OAuth2Client oAuth2Client14 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor15 = new net.oauth.v2.OAuth2Accessor(oAuth2Client14);
        java.lang.String str16 = oAuth2Accessor15.tokenType;
        oAuth2Accessor15.expires_in = "GET";
        java.lang.String str19 = oAuth2Accessor15.expires_in;
        oAuth2Accessor7.setProperty("HTTP request", (java.lang.Object) oAuth2Accessor15);
        net.oauth.v2.OAuth2Client oAuth2Client21 = oAuth2Accessor7.client;
        oAuth2Accessor7.code = "null  realm=\"client_secret\"";
        oAuth2Accessor7.refreshToken = "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])";
        net.oauth.v2.OAuth2.Parameter[] parameterArray29 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList30 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList30, parameterArray29);
        net.oauth.v2.OAuth2Message oAuth2Message32 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList30);
        java.lang.String str34 = oAuth2Message32.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap35 = oAuth2Message32.getParameterMap();
        oAuth2Accessor7.setProperty("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", (java.lang.Object) strMap35);
        oAuth2Client3.setProperty("null%20%20realm%3D%22Authorization-Schesme%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "GET" + "'", str19, "GET");
        org.junit.Assert.assertNull(oAuth2Client21);
        org.junit.Assert.assertNotNull(parameterArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("", "code_and_token");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str5 = parameter2.setValue("null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"?Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "code_and_token" + "'", str3, "code_and_token");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "code_and_token" + "'", str5, "code_and_token");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "GET";
        oAuth2Accessor1.scope = "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str16 = oAuth2Accessor1.code;
        oAuth2Accessor1.accessToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(oAuth2Client11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        java.lang.Object obj12 = oAuth2Client3.getProperty("UTF-8");
        java.lang.Object obj14 = oAuth2Client3.getProperty("\n");
        java.lang.String str15 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor16 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream9);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("", "bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream13);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP status" + "'", str7, "HTTP status");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "unauthorized_client" + "'", str8, "unauthorized_client");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap38 = oAuth2ProblemException34.getParameters();
        java.lang.String str39 = oAuth2ProblemException34.getProblem();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException43 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception44 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException43);
        net.oauth.v2.OAuth2Exception oAuth2Exception45 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException43.addSuppressed((java.lang.Throwable) oAuth2Exception45);
        net.oauth.v2.OAuth2Exception oAuth2Exception47 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception45);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException49 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception50 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException49);
        int int51 = oAuth2ProblemException49.getHttpStatusCode();
        oAuth2Exception47.addSuppressed((java.lang.Throwable) oAuth2ProblemException49);
        net.oauth.v2.OAuth2.Parameter[] parameterArray56 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList57 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList57, parameterArray56);
        net.oauth.v2.OAuth2Message oAuth2Message59 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList57);
        java.lang.String str61 = oAuth2Message59.getHeader("");
        java.lang.String str62 = oAuth2Message59.URL;
        oAuth2ProblemException49.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str62);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException65 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception66 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException65);
        int int67 = oAuth2ProblemException65.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception68 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException65.addSuppressed((java.lang.Throwable) oAuth2Exception68);
        java.util.Map<java.lang.String, java.lang.Object> strMap70 = oAuth2ProblemException65.getParameters();
        oAuth2ProblemException49.addSuppressed((java.lang.Throwable) oAuth2ProblemException65);
        net.oauth.v2.OAuth2Exception oAuth2Exception72 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException49);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException74 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception75 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException74);
        int int76 = oAuth2ProblemException74.getHttpStatusCode();
        oAuth2ProblemException49.addSuppressed((java.lang.Throwable) oAuth2ProblemException74);
        java.lang.Throwable[] throwableArray78 = oAuth2ProblemException49.getSuppressed();
        oAuth2ProblemException34.addSuppressed((java.lang.Throwable) oAuth2ProblemException49);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        org.junit.Assert.assertNotNull(parameterArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 200 + "'", int67 == 200);
        org.junit.Assert.assertNotNull(strMap70);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 200 + "'", int76 == 200);
        org.junit.Assert.assertNotNull(throwableArray78);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
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
        java.lang.String str19 = oAuth2Message8.getParameter("none=invalid_client");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"access_denied\"" + "'", str17, "null  realm=\"access_denied\"");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.setProperty("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", (java.lang.Object) 100.0f);
        oAuth2Accessor1.accessToken = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        java.lang.String str11 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=HTTP%20status";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
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
        java.lang.String str30 = oAuth2Client3.clientSecret;
        java.lang.String str31 = oAuth2Client3.clientSecret;
        java.lang.String str32 = oAuth2Client3.clientId;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str30, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str31, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "token_type" + "'", str32, "token_type");
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
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
        oAuth2Accessor1.expires_in = "client_credentials?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        int int5 = oAuth2ProblemException3.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException3.getParameters();
        int int9 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str10 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception: OAuth2Message(hi!, , [])", (java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("OAuth2Message(DELETE, client_id, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Throwable) oAuth2Exception11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
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
        java.lang.String str17 = oAuth2Message5.getParameter("client_credentials");
        java.lang.String str18 = oAuth2Message5.getClientId();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
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
        java.lang.Object obj30 = oAuth2Accessor7.getProperty("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        java.lang.String str31 = oAuth2Accessor7.scope;
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
        org.junit.Assert.assertNull(obj30);
        org.junit.Assert.assertNull(str31);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21", "null  realm=\"code_and_token\"", "net.oauth.v2.OAuth2Exception: HTTP request");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null  realm=\"code_and_token\"" + "'", str4, "null  realm=\"code_and_token\"");
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str10 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str6 = parameter2.getKey();
        java.lang.String str7 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme" + "'", str6, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
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
        java.util.Map<java.lang.String, java.lang.String> strMap35 = oAuth2Message32.getParameterMap();
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
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str9 = oAuth2Message5.getCode();
        java.lang.String str11 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str11, "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        oAuth2Message7.completeParameters();
        java.lang.String str12 = oAuth2Message7.getHeader("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        java.lang.String str14 = oAuth2Message7.getWWWAuthenticateHeader("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = oAuth2Message7.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"" + "'", str14, "null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(POST, refresh_token, [])");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(DELETE, client_id, [])");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("application%2Fx-www-form-urlencoded", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "application%2Fx-www-form-urlencoded" + "'", str3, "application%2Fx-www-form-urlencoded");
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("\ufffd\n", strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("none=token", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22unsupported_grant_type%22", strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\n" + "'", str6, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none=token" + "'", str7, "none=token");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null%20%20realm%3D%22unsupported_grant_type%22" + "'", str9, "null%20%20realm%3D%22unsupported_grant_type%22");
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "redirect_uri", "invalid_scope");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.Object obj6 = oAuth2Client3.getProperty("Location?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "redirect_uri" + "'", str4, "redirect_uri");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Accessor9.state;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor9.client;
        java.lang.Object obj13 = oAuth2Client11.getProperty("OAuth2Message(hi!, OAuth2Message(Authorization-Schesme=token_type, , []), [])");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int19 = oAuth2ProblemException18.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException18);
        java.lang.Throwable[] throwableArray21 = oAuth2Exception20.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception22 = new net.oauth.v2.OAuth2Exception("unsupported_response_type", (java.lang.Throwable) oAuth2Exception20);
        java.lang.Class<?> wildcardClass23 = oAuth2Exception20.getClass();
        oAuth2Client11.setProperty("Authorization-Schesme", (java.lang.Object) oAuth2Exception20);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(oAuth2Client11);
        org.junit.Assert.assertNull(obj13);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertNotNull(throwableArray21);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.state;
        oAuth2Accessor1.tokenType = "null  realm=\"code_and_token\"";
        java.lang.String str14 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
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
        oAuth2Message5.method = "null  realm=\"invalid_token\"";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(POST, refresh_token, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"null%20%20realm%3D%22%250A%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "client_credentials=application%252Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(POST, refresh_token, [])" + "'", str7, "OAuth2Message(POST, refresh_token, [])");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "redirect_uri", "invalid_scope");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.String str5 = oAuth2Client3.redirectUri;
        java.lang.String str6 = oAuth2Client3.redirectUri;
        java.lang.String str7 = oAuth2Client3.clientSecret;
        java.lang.Object obj9 = oAuth2Client3.getProperty("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "redirect_uri" + "'", str4, "redirect_uri");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "assertion_type" + "'", str5, "assertion_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "assertion_type" + "'", str6, "assertion_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid_scope" + "'", str7, "invalid_scope");
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
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
        java.lang.String str20 = oAuth2Accessor17.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("hi!");
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.String str7 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"?Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("null  realm=\"code_and_token\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("client_id", "net.oauth.v2.OAuth2ProblemException: HTTP status 200", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null  realm=\"code_and_token\"" + "'", str8, "null  realm=\"code_and_token\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str9, "null  realm=\"OAuth2Message%28DELETE%2C%20client_id%2C%20%5B%5D%29%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException29 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception30 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException29);
        net.oauth.v2.OAuth2Exception oAuth2Exception31 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException29.addSuppressed((java.lang.Throwable) oAuth2Exception31);
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception31);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException35 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException35);
        int int37 = oAuth2ProblemException35.getHttpStatusCode();
        oAuth2Exception33.addSuppressed((java.lang.Throwable) oAuth2ProblemException35);
        int int39 = oAuth2ProblemException35.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException41 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap42 = oAuth2ProblemException41.getParameters();
        java.lang.String[] strArray52 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList53 = net.oauth.v2.OAuth2.newList(strArray52);
        java.lang.String str54 = net.oauth.v2.OAuth2.addParameters("assertion", strArray52);
        java.lang.String str55 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray52);
        oAuth2ProblemException41.setParameter("application%252Fx-www-form-urlencoded", (java.lang.Object) "Location");
        oAuth2ProblemException35.setParameter("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "Location");
        boolean boolean58 = parameter2.equals((java.lang.Object) "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "null%20%20realm%3D%22invalid_token%22=expires_in" + "'", str26, "null%20%20realm%3D%22invalid_token%22=expires_in");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 200 + "'", int37 == 200);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        org.junit.Assert.assertNotNull(strMap42);
        org.junit.Assert.assertNotNull(strArray52);
        org.junit.Assert.assertNotNull(parameterList53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str54, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str55, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception: POST");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception: invalid_token", (java.lang.Throwable) oAuth2Exception2);
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.accessToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("access_token");
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        java.lang.String str11 = oAuth2Accessor1.code;
        java.lang.String str12 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "null  realm=\"\"";
        java.lang.String str8 = oAuth2Accessor1.tokenType;
        java.lang.String str9 = oAuth2Accessor1.scope;
        java.lang.String str10 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"client_secret\"");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException3.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException3.getParameters();
        java.lang.String str8 = oAuth2ProblemException3.getProblem();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException3);
        java.lang.String str10 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"client_secret\"" + "'", str10, "null  realm=\"client_secret\"");
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
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
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList50 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str51 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList50);
        java.lang.String str52 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList50);
        net.oauth.v2.OAuth2Message oAuth2Message53 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList50);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList54 = oAuth2Message53.getParameters();
        oAuth2Message53.method = "DELETE";
        oAuth2Message53.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList58 = oAuth2Message53.getParameters();
        oAuth2Client3.setProperty("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Message53);
        java.lang.String str60 = oAuth2Message53.getCode();
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
        org.junit.Assert.assertNotNull(parameterList50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "unsupported_grant_type" + "'", str51, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "username" + "'", str52, "username");
        org.junit.Assert.assertNotNull(strEntryList54);
        org.junit.Assert.assertNotNull(strEntryList58);
        org.junit.Assert.assertNull(str60);
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
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
        java.lang.String str36 = oAuth2Message32.getHeader("null%20%20realm%3D%22Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%3Fnet.oauth.v2.OAuth2Exception%3DHTTP%2520status");
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
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=refresh_token", "password", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Client oAuth2Client3 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Accessor4.tokenType;
        oAuth2Accessor4.tokenType = "response_type";
        java.lang.String str8 = oAuth2Accessor4.state;
        java.lang.String str9 = oAuth2Accessor4.refreshToken;
        oAuth2Accessor4.tokenType = "username";
        oAuth2ProblemException1.setParameter("invalid_request", (java.lang.Object) oAuth2Accessor4);
        oAuth2Accessor4.accessToken = "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor4.state = "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str5 = parameter2.setValue("error");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "POST" + "'", str3, "POST");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "POST" + "'", str5, "POST");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
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
        java.lang.String str12 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str12, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("redirect_uri");
        java.lang.String str8 = oAuth2Accessor2.expires_in;
        oAuth2Accessor2.accessToken = "net.oauth.v2.OAuth2ProblemException: hi!";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.lang.String str20 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.io.OutputStream outputStream21 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17, outputStream21);
        java.io.InputStream inputStream23 = null;
        net.oauth.v2.OAuth2Message oAuth2Message24 = new net.oauth.v2.OAuth2Message("OAuth2Message(HTTP request, , [])", "OAuth2Message(, client_id, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17, inputStream23);
        oAuth2Accessor2.setProperty("null  realm=\"client_id\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) parameterList17);
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "unsupported_grant_type" + "'", str18, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "username" + "'", str19, "username");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        oAuth2Message5.method = "POST";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getParameters();
        java.lang.String str14 = oAuth2Message5.toString();
        java.lang.String str15 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(POST, access_token, [])" + "'", str14, "OAuth2Message(POST, access_token, [])");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "POST" + "'", str15, "POST");
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.method = "OAuth2Message(hi!, , [])";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertNotNull(byteArray1);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "", "Authorization-Schesme=token_type");
        java.lang.Object obj5 = oAuth2Client3.getProperty("HTTP status");
        java.lang.String str6 = oAuth2Client3.redirectUri;
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str13 = oAuth2Message12.method;
        java.lang.String str15 = oAuth2Message12.getParameter("state");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message12.getParameterMap();
        java.lang.String str18 = oAuth2Message12.getHeader("null  realm=\"redirect_uri_mismatch\"");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList19 = oAuth2Message12.getParameters();
        oAuth2Client3.setProperty("null  realm=\"net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer\"", (java.lang.Object) strEntryList19);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "client_secret" + "'", str6, "client_secret");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "refresh_token" + "'", str13, "refresh_token");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strEntryList19);
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("Authorization-Schesme=error");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, 117, 116, 104, 111, 114, 105, 122, 97, 116, 105, 111, 110, 45, 83, 99, 104, 101, 115, 109, 101, 61, 101, 114, 114, 111, 114]");
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.OutputStream outputStream12 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9, outputStream12);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        oAuth2Accessor1.setProperty("unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) parameterList9);
        oAuth2Accessor1.expires_in = "none=invalid_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP request" + "'", str11, "HTTP request");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.lang.String str16 = oAuth2Message12.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message12.getParameters();
        java.lang.String str18 = oAuth2Message12.getCode();
        java.lang.String str19 = oAuth2Message12.getClientId();
        java.lang.String str20 = oAuth2Message12.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = oAuth2Message12.getParameters();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str16, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strEntryList21);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("POST");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Throwable) oAuth2Exception2);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException3.getParameters();
        net.oauth.v2.OAuth2.Parameter[] parameterArray10 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList11 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, parameterArray10);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str15 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        oAuth2ProblemException3.setParameter("OAuth2Message(Authorization-Schesme=token_type, , [])", (java.lang.Object) parameterList11);
        java.io.OutputStream outputStream20 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11, outputStream20);
        net.oauth.v2.OAuth2Message oAuth2Message22 = new net.oauth.v2.OAuth2Message("\n", "error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(parameterArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.toString();
        java.lang.String str10 = oAuth2Message5.getHeader("OAuth2Message(hi!, , [])");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getHeaders();
        oAuth2Message5.method = "null  realm=\"null%2520%2520realm%253D%2522Location%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%2522%253Fnet.oauth.v2.OAuth2Exception%253DHTTP%252520status\"";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, GET, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str3, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException0);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException6 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException6);
        int int8 = oAuth2ProblemException6.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException6.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception9.addSuppressed((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException12);
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = oAuth2ProblemException0.getParameters();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Authorization-Schesme%3Dnull%26realm%3Dnone%3DUTF-8");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.code = "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "assertion_type";
        oAuth2Accessor1.tokenType = "null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        net.oauth.v2.OAuth2Client oAuth2Client15 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor16 = new net.oauth.v2.OAuth2Accessor(oAuth2Client15);
        java.lang.String str17 = oAuth2Accessor16.tokenType;
        java.lang.String str18 = oAuth2Accessor16.tokenType;
        oAuth2Accessor16.code = "unsupported_grant_type";
        oAuth2Accessor16.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray26 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList27 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList27, parameterArray26);
        net.oauth.v2.OAuth2Message oAuth2Message29 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        java.util.Map<java.lang.String, java.lang.String> strMap30 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        java.lang.String str31 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        java.util.Map<java.lang.String, java.lang.String> strMap32 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList27);
        oAuth2Accessor16.setProperty("response_type", (java.lang.Object) strMap32);
        java.lang.Object obj35 = oAuth2Accessor16.getProperty("Authorization-Schesme=token_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor36 = oAuth2Accessor16.clone();
        java.lang.Object obj38 = oAuth2Accessor16.getProperty("redirect_uri_mismatch");
        net.oauth.v2.OAuth2Client oAuth2Client39 = oAuth2Accessor16.client;
        oAuth2Accessor16.expires_in = "client_credentials";
        oAuth2Accessor1.setProperty("net.oauth.v2.OAuth2Exception: invalid_request", (java.lang.Object) "client_credentials");
        oAuth2Accessor1.accessToken = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException: client_id";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(parameterArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertNotNull(oAuth2Accessor36);
        org.junit.Assert.assertNull(obj38);
        org.junit.Assert.assertNull(oAuth2Client39);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("\ufffd\n", "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.getClientId();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str14 = oAuth2Message8.getWWWAuthenticateHeader("null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.lang.String str15 = oAuth2Message8.URL;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str12, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"" + "'", str14, "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "URL" + "'", str15, "URL");
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        java.lang.String str5 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str4, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str5, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        java.lang.String[] strArray5 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"client_id\"", "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream7);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str9, "net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Authorization-Schesme=null&realm=none%3DUTF-8");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.String str7 = oAuth2Accessor6.expires_in;
        java.lang.String str8 = oAuth2Accessor6.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "refresh_token" + "'", str7, "refresh_token");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        java.lang.Throwable[] throwableArray8 = oAuth2Exception6.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception9);
        oAuth2ProblemException1.setParameter("client_secret", (java.lang.Object) oAuth2Exception10);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
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
        java.lang.String str14 = oAuth2Accessor6.state;
        oAuth2Accessor6.expires_in = "null  realm=\"unsupported_grant_type%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "token" + "'", str14, "token");
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
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
        java.lang.String str16 = parameter11.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str13, "net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "PUT" + "'", str15, "PUT");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=" + "'", str16, "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=");
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
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
        java.lang.String str18 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str13, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "token_type" + "'", str16, "token_type");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str17, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        oAuth2Accessor2.accessToken = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str7 = oAuth2Accessor2.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str7, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int9 = oAuth2ProblemException8.getHttpStatusCode();
        java.lang.String str10 = oAuth2ProblemException8.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray14 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList15 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, parameterArray14);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        oAuth2ProblemException8.setParameter("code", (java.lang.Object) parameterList15);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParameters("invalid_request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) parameterList15);
        java.lang.String str22 = oAuth2Client3.clientId;
        java.lang.String str23 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token" + "'", str4, "token");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(parameterArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "invalid_request" + "'", str20, "invalid_request");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HTTP request" + "'", str22, "HTTP request");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "token" + "'", str23, "token");
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(DELETE, client_id, [])");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.getValue();
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.String str8 = oAuth2Accessor6.tokenType;
        java.lang.String str9 = oAuth2Accessor6.tokenType;
        oAuth2Accessor6.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str13 = oAuth2Accessor6.refreshToken;
        java.lang.String[] strArray24 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList25 = net.oauth.v2.OAuth2.newList(strArray24);
        java.lang.String str26 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str27 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.io.InputStream inputStream28 = null;
        net.oauth.v2.OAuth2Message oAuth2Message29 = new net.oauth.v2.OAuth2Message("state", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25, inputStream28);
        oAuth2Accessor6.setProperty("null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29", (java.lang.Object) "");
        java.lang.Object obj32 = oAuth2Accessor6.getProperty("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        boolean boolean33 = parameter2.equals((java.lang.Object) oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "POST" + "'", str4, "POST");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strArray24);
        org.junit.Assert.assertNotNull(parameterList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str26, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(obj32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
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
        java.lang.Object obj32 = oAuth2Accessor30.getProperty("OAuth2Message(OAuth2Message(hi!, GET, []), none, [])?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("none", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, inputStream16);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("assertion_type", "error_description#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2.Parameter[] parameterArray5 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList6 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, parameterArray5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getHeaders();
        oAuth2Message8.method = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str14 = oAuth2Message8.getParameter("none");
        java.lang.String str15 = oAuth2Message8.getClientId();
        boolean boolean16 = parameter2.equals((java.lang.Object) oAuth2Message8);
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "", "client_credentials");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("assertion_type", "redirect_uri", "invalid_scope");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.String str5 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2Client oAuth2Client7 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor8.clone();
        oAuth2Accessor9.expires_in = "refresh_token";
        net.oauth.v2.OAuth2.Parameter[] parameterArray15 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList16 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16, parameterArray15);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList16);
        java.lang.String str20 = oAuth2Message18.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList21 = oAuth2Message18.getHeaders();
        oAuth2Message18.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList24 = oAuth2Message18.getParameters();
        java.lang.String str25 = oAuth2Message18.toString();
        oAuth2Accessor9.setProperty("", (java.lang.Object) oAuth2Message18);
        java.lang.String str27 = oAuth2Message18.getCode();
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) str27);
        java.lang.String str29 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "redirect_uri" + "'", str4, "redirect_uri");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "assertion_type" + "'", str5, "assertion_type");
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(strEntryList21);
        org.junit.Assert.assertNotNull(strEntryList24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str25, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "redirect_uri" + "'", str29, "redirect_uri");
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.code;
        java.lang.String str10 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        oAuth2Message5.method = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str11 = oAuth2Message5.getParameter("none");
        java.lang.String str12 = oAuth2Message5.getClientId();
        java.lang.String str14 = oAuth2Message5.getParameter("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException0.setParameter("username", (java.lang.Object) "hi!");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception16);
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception16);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException20 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception21 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException20);
        int int22 = oAuth2ProblemException20.getHttpStatusCode();
        oAuth2Exception18.addSuppressed((java.lang.Throwable) oAuth2ProblemException20);
        net.oauth.v2.OAuth2.Parameter[] parameterArray27 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList28 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28, parameterArray27);
        net.oauth.v2.OAuth2Message oAuth2Message30 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str32 = oAuth2Message30.getHeader("");
        java.lang.String str33 = oAuth2Message30.URL;
        oAuth2ProblemException20.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str33);
        java.lang.Throwable[] throwableArray35 = oAuth2ProblemException20.getSuppressed();
        int int36 = oAuth2ProblemException20.getHttpStatusCode();
        int int37 = oAuth2ProblemException20.getHttpStatusCode();
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException20);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertNotNull(parameterArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 200 + "'", int37 == 200);
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "OAuth2Message(hi!, , [])";
        oAuth2Accessor1.scope = "error";
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2ProblemException: hi!";
        java.lang.String str13 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str13, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "access_token";
        oAuth2Accessor1.expires_in = "net.oauth.v2.OAuth2Exception: HTTP request";
        oAuth2Accessor1.code = "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.Object obj16 = oAuth2Accessor1.getProperty("null  realm=\"OAuth2Message%28scope%2C%20DELETE%2C%20%5B%5D%29\"");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.Throwable[] throwableArray3 = oAuth2Exception2.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2ProblemException: none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Throwable) oAuth2Exception2);
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        net.oauth.v2.OAuth2Client oAuth2Client3 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Accessor4.tokenType;
        java.lang.String str6 = oAuth2Accessor4.tokenType;
        oAuth2Accessor4.code = "unsupported_grant_type";
        oAuth2Accessor4.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray14 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList15 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, parameterArray14);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str19 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        oAuth2Accessor4.setProperty("response_type", (java.lang.Object) strMap20);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList24 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap25 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        oAuth2Accessor4.setProperty("invalid_token", (java.lang.Object) parameterList24);
        java.lang.String str27 = net.oauth.v2.OAuth2.addParameters("null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        net.oauth.v2.OAuth2Message oAuth2Message28 = new net.oauth.v2.OAuth2Message("null%20%20realm%3D%22%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        java.lang.String str30 = oAuth2Message28.getHeader("null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(parameterArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(parameterList24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str27, "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
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
        java.lang.String str15 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("application%2Fx-www-form-urlencoded", "HTTP%20status", "token_type  realm=\"%0A\"");
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        java.lang.String str20 = oAuth2Message12.getClientId();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
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
        java.lang.String str27 = parameter2.setValue("null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "POST" + "'", str25, "POST");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "expires_in" + "'", str27, "expires_in");
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str4 = parameter2.setValue("");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = oAuth2Message9.method;
        java.lang.String str11 = oAuth2Message9.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message9.getHeaders();
        boolean boolean13 = parameter2.equals((java.lang.Object) oAuth2Message9);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "refresh_token" + "'", str10, "refresh_token");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str11, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        oAuth2Message5.method = "POST";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message5.getParameters();
        java.lang.String str14 = oAuth2Message5.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = oAuth2Message5.getParameterMap();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(POST, access_token, [])" + "'", str14, "OAuth2Message(POST, access_token, [])");
        org.junit.Assert.assertNotNull(strEntryList15);
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        oAuth2Accessor1.scope = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str9 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) false);
        java.lang.String str13 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException3.getParameters();
        java.lang.Throwable[] throwableArray5 = oAuth2ProblemException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException3.getParameters();
        oAuth2ProblemException1.setParameter("error", (java.lang.Object) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        java.lang.String str11 = oAuth2Exception10.toString();
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: HTTP status 200" + "'", str11, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: HTTP status 200");
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("2.0", (java.lang.Throwable) oAuth2Exception2);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException("unsupported_grant_type");
        java.lang.String str6 = oAuth2ProblemException5.getProblem();
        oAuth2Exception3.addSuppressed((java.lang.Throwable) oAuth2ProblemException5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.Class<?> wildcardClass3 = parameter2.getClass();
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "OAuth2Message(hi!, , [])";
        oAuth2Accessor1.scope = "error";
        java.lang.String str11 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
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
        java.lang.String str17 = oAuth2Message5.getCode();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = oAuth2Message5.getParameterMap();
        java.lang.String str19 = oAuth2Message5.method;
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
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
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
        java.lang.String str17 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "error_uri" + "'", str17, "error_uri");
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("HTTP request", "invalid_request", "HTTP request");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str7 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "invalid_request" + "'", str5, "invalid_request");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP request" + "'", str7, "HTTP request");
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("\n", strArray11);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("HTTP%20status", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HTTP%20status?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "HTTP%20status?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
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
        java.lang.String str31 = oAuth2Client3.redirectUri;
        java.lang.Object obj33 = oAuth2Client3.getProperty("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNull(obj33);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.io.InputStream inputStream14 = null;
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("state", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, inputStream14);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str18 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.BaseGrantType.getInstance();
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.refreshToken = "";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        oAuth2Accessor1.tokenType = "null  realm=\"redirect_uri_mismatch\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String[] strArray16 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList17 = net.oauth.v2.OAuth2.newList(strArray16);
        oAuth2Accessor7.setProperty("invalid_scope", (java.lang.Object) parameterList17);
        oAuth2Accessor7.refreshToken = "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception: expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream7);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("none%3Dinvalid_client");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 111, 110, 101, 37, 51, 68, 105, 110, 118, 97, 108, 105, 100, 95, 99, 108, 105, 101, 110, 116]");
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        net.oauth.v2.OAuth2Client oAuth2Client6 = new net.oauth.v2.OAuth2Client("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "", "access_denied");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        boolean boolean8 = parameter2.equals((java.lang.Object) oAuth2Accessor7);
        oAuth2Accessor7.tokenType = "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        java.lang.String str9 = oAuth2Accessor8.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.getValue();
        java.lang.String str4 = parameter2.getValue();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        java.lang.String str9 = oAuth2ProblemException8.getProblem();
        boolean boolean10 = parameter2.equals((java.lang.Object) str9);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str9, "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Accessor10.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor12 = oAuth2Accessor10.clone();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(oAuth2Accessor12);
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str15 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
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
        java.lang.String str18 = oAuth2Message8.getWWWAuthenticateHeader("invalid_client");
        java.util.Map<java.lang.String, java.lang.String> strMap19 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"invalid_client\"" + "'", str18, "null  realm=\"invalid_client\"");
        org.junit.Assert.assertNotNull(strMap19);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client8 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str9 = oAuth2Client8.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter13 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str14 = parameter13.toString();
        java.lang.String str16 = parameter13.setValue("access_denied");
        oAuth2Client8.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter13);
        oAuth2Client3.setProperty("null  realm=\"client_id\"", (java.lang.Object) "application/x-www-form-urlencoded");
        java.lang.String str19 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException22 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(hi!, , [])");
        oAuth2Client3.setProperty("null  realm=\"password\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Authorization-Schesme=token_type" + "'", str14, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "token_type" + "'", str16, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
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
        java.lang.String str37 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(obj35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str37, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getValue();
        java.lang.String str9 = parameter2.setValue("2.0");
        java.lang.String str10 = parameter2.getKey();
        java.lang.String str12 = parameter2.setValue("grant_type");
        java.lang.String str13 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme" + "'", str10, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2.0" + "'", str12, "2.0");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "grant_type" + "'", str13, "grant_type");
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.URL;
        java.lang.String str9 = oAuth2Message5.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message5.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
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
        java.lang.Object obj28 = oAuth2Client16.getProperty("net.oauth.v2.OAuth2Exception: invalid_request");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(obj28);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.state = "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor1.clone();
        java.lang.String str8 = oAuth2Accessor7.refreshToken;
        java.lang.String str9 = oAuth2Accessor7.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
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
        oAuth2Accessor1.code = "authorization_code";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray7 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList8 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, parameterArray7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        oAuth2ProblemException1.setParameter("code", (java.lang.Object) parameterList8);
        java.io.OutputStream outputStream13 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8, outputStream13);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("redirect_uri");
        int int3 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException5 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException5.getParameters();
        java.lang.Throwable[] throwableArray7 = oAuth2ProblemException5.getSuppressed();
        java.lang.Throwable[] throwableArray8 = oAuth2ProblemException5.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException5);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception("OAuth2Message(scope, DELETE, [])", (java.lang.Throwable) oAuth2ProblemException5);
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception10);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%3A%20invalid_request", (java.lang.Throwable) oAuth2ProblemException2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(throwableArray7);
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("expires_in", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, inputStream7);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "invalid_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22error_description%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null%20%20realm%3D%22error_description%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22" + "'", str10, "null%20%20realm%3D%22error_description%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22");
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        java.lang.Object obj9 = oAuth2Accessor1.getProperty("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        java.lang.String str10 = oAuth2Accessor1.expires_in;
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str11, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("client_credentials", "Authorization-Schesme=error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream8);
        java.lang.String str10 = oAuth2Message9.getClientId();
        java.lang.String str11 = oAuth2Message9.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\n" + "'", str6, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "client_credentials" + "'", str7, "client_credentials");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "client_credentials" + "'", str11, "client_credentials");
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        net.oauth.v2.OAuth2Client oAuth2Client1 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = new net.oauth.v2.OAuth2Accessor(oAuth2Client1);
        java.lang.String str3 = oAuth2Accessor2.tokenType;
        java.lang.String str4 = oAuth2Accessor2.tokenType;
        oAuth2Accessor2.code = "unsupported_grant_type";
        oAuth2Accessor2.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray12 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList13 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, parameterArray12);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        oAuth2Accessor2.setProperty("response_type", (java.lang.Object) strMap18);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList22 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        oAuth2Accessor2.setProperty("invalid_token", (java.lang.Object) parameterList22);
        java.lang.String str25 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        java.lang.String str26 = net.oauth.v2.OAuth2.addParameters("none=invalid_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList22);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(parameterArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(parameterList22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "none=invalid_client" + "'", str26, "none=invalid_client");
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        net.oauth.v2.OAuth2Client oAuth2Client6 = new net.oauth.v2.OAuth2Client("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "", "access_denied");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        boolean boolean8 = parameter2.equals((java.lang.Object) oAuth2Accessor7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str14 = oAuth2Message13.method;
        java.lang.String str15 = oAuth2Message13.toString();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message13.getHeaders();
        java.lang.String str17 = oAuth2Message13.getCode();
        oAuth2Message13.completeParameters();
        boolean boolean19 = parameter2.equals((java.lang.Object) oAuth2Message13);
        java.lang.String str20 = parameter2.toString();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "refresh_token" + "'", str14, "refresh_token");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str15, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "none=UTF-8" + "'", str20, "none=UTF-8");
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
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
        java.lang.String str19 = oAuth2Message5.URL;
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        int int4 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("password", "null  realm=\"password\"", "assertion_type");
        java.lang.Object obj5 = oAuth2Client3.getProperty("expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Client oAuth2Client7 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        java.lang.String str9 = oAuth2Accessor8.tokenType;
        java.lang.String str10 = oAuth2Accessor8.tokenType;
        java.lang.Object obj12 = oAuth2Accessor8.getProperty("client_secret");
        oAuth2Accessor8.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor8.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client17 = oAuth2Accessor8.client;
        java.lang.String str18 = oAuth2Accessor8.expires_in;
        oAuth2Accessor8.scope = "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"";
        java.lang.String str21 = oAuth2Accessor8.refreshToken;
        oAuth2Client3.setProperty("application%2Fx-www-form-urlencoded?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor8);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(oAuth2Client17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("Authorization-Schesme=scope");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.refreshToken;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
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
        java.lang.Object obj23 = oAuth2Accessor1.getProperty("UTF-8");
        oAuth2Accessor1.refreshToken = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str16, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(Authorization-Schesme=token_type, , [])", "OAuth2Message(POST, refresh_token, [])", "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Client oAuth2Client8 = new net.oauth.v2.OAuth2Client("state", "net.oauth.v2.OAuth2Exception", "HTTP response");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2ProblemException: hi!", (java.lang.Object) oAuth2Accessor9);
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = oAuth2Accessor1.clone();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor27);
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.lang.String str13 = oAuth2Message12.getClientId();
        java.lang.String str14 = oAuth2Message12.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message12.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Client oAuth2Client3 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Accessor4.tokenType;
        oAuth2Accessor4.tokenType = "response_type";
        java.lang.String str8 = oAuth2Accessor4.state;
        java.lang.String str9 = oAuth2Accessor4.refreshToken;
        oAuth2Accessor4.tokenType = "username";
        oAuth2ProblemException1.setParameter("invalid_request", (java.lang.Object) oAuth2Accessor4);
        java.lang.Throwable[] throwableArray13 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
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
        int int24 = oAuth2ProblemException8.getHttpStatusCode();
        int int25 = oAuth2ProblemException8.getHttpStatusCode();
        int int26 = oAuth2ProblemException8.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 200 + "'", int25 == 200);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
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
        oAuth2Accessor15.state = "OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor15);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("access_denied");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("none=UTF-8", (java.lang.Throwable) oAuth2ProblemException2);
        int int5 = oAuth2ProblemException2.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("assertion", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("none", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=scope", "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "access_token";
        oAuth2Accessor1.expires_in = "net.oauth.v2.OAuth2Exception: HTTP request";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("assertion_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("application%252Fx-www-form-urlencoded", "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream7);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "assertion_type" + "'", str6, "assertion_type");
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray9);
        java.io.OutputStream outputStream16 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15, outputStream16);
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
        org.junit.Assert.assertNotNull(parameterList15);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.getClientId();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
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
        oAuth2Accessor13.tokenType = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion" + "'", str12, "assertion");
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
        org.junit.Assert.assertNull(oAuth2Client14);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        oAuth2Message8.URL = "OAuth2Message(hi!, GET, [])";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
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
        java.lang.Object obj17 = oAuth2Accessor10.getProperty("GET");
        java.lang.String str18 = oAuth2Accessor10.expires_in;
        java.lang.String str19 = oAuth2Accessor10.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(obj17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "GET" + "'", str18, "GET");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("authorization_code", (java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException10 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException10);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException10.addSuppressed((java.lang.Throwable) oAuth2Exception12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception12);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException16 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException16);
        int int18 = oAuth2ProblemException16.getHttpStatusCode();
        oAuth2Exception14.addSuppressed((java.lang.Throwable) oAuth2ProblemException16);
        net.oauth.v2.OAuth2.Parameter[] parameterArray23 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList24 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList24, parameterArray23);
        net.oauth.v2.OAuth2Message oAuth2Message26 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList24);
        java.lang.String str28 = oAuth2Message26.getHeader("");
        java.lang.String str29 = oAuth2Message26.URL;
        oAuth2ProblemException16.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str29);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException32 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception33 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException32);
        int int34 = oAuth2ProblemException32.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception35 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException32.addSuppressed((java.lang.Throwable) oAuth2Exception35);
        java.util.Map<java.lang.String, java.lang.Object> strMap37 = oAuth2ProblemException32.getParameters();
        oAuth2ProblemException16.addSuppressed((java.lang.Throwable) oAuth2ProblemException32);
        net.oauth.v2.OAuth2Exception oAuth2Exception39 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException16);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException41 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception42 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException41);
        int int43 = oAuth2ProblemException41.getHttpStatusCode();
        oAuth2ProblemException16.addSuppressed((java.lang.Throwable) oAuth2ProblemException41);
        int int45 = oAuth2ProblemException16.getHttpStatusCode();
        java.lang.String str46 = oAuth2ProblemException16.getProblem();
        net.oauth.v2.OAuth2Client oAuth2Client47 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor48 = new net.oauth.v2.OAuth2Accessor(oAuth2Client47);
        java.lang.String str49 = oAuth2Accessor48.tokenType;
        java.lang.String str50 = oAuth2Accessor48.tokenType;
        java.lang.Object obj52 = oAuth2Accessor48.getProperty("client_secret");
        oAuth2Accessor48.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Exception oAuth2Exception58 = new net.oauth.v2.OAuth2Exception("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception59 = new net.oauth.v2.OAuth2Exception("application%252Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2Exception58);
        oAuth2Accessor48.setProperty("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"", (java.lang.Object) oAuth2Exception58);
        oAuth2ProblemException16.addSuppressed((java.lang.Throwable) oAuth2Exception58);
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2ProblemException16);
        net.oauth.v2.OAuth2Exception oAuth2Exception63 = new net.oauth.v2.OAuth2Exception("none%3Dinvalid_client", (java.lang.Throwable) oAuth2ProblemException16);
        java.lang.Class<?> wildcardClass64 = oAuth2ProblemException16.getClass();
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 200 + "'", int18 == 200);
        org.junit.Assert.assertNotNull(parameterArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 200 + "'", int34 == 200);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 200 + "'", int43 == 200);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 200 + "'", int45 == 200);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNull(str50);
        org.junit.Assert.assertNull(obj52);
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "none" + "'", str6, "none");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Authorization-Schesme" + "'", str7, "Authorization-Schesme");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.refreshToken;
        java.lang.String str10 = oAuth2Accessor1.state;
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.expires_in;
        java.lang.String str6 = oAuth2Accessor2.expires_in;
        oAuth2Accessor2.state = "application%2Fx-www-form-urlencoded";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "refresh_token" + "'", str6, "refresh_token");
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
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
        java.lang.String str18 = oAuth2Message13.method;
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTTP request" + "'", str18, "HTTP request");
    }

    @Test
    public void test2194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2194");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.refreshToken;
        java.lang.String str10 = oAuth2Accessor1.state;
        oAuth2Accessor1.expires_in = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2195");
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
        oAuth2Message13.URL = "";
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strEntryList17);
    }

    @Test
    public void test2196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2196");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.clientSecret;
        java.lang.String str6 = oAuth2Client3.clientId;
        java.lang.Object obj8 = oAuth2Client3.getProperty("null  realm=\"invalid_client\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str5, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2197");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2198");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray3);
    }

    @Test
    public void test2199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2199");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.OAuth2.ErrorCode;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2200");
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
        oAuth2Message7.method = "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_client" + "'", str13, "invalid_client");
    }

    @Test
    public void test2201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2201");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("expires_in", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = oAuth2Message5.getParameterMap();
        java.lang.String str7 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP request" + "'", str7, "HTTP request");
    }

    @Test
    public void test2202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2202");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22unsupported_grant_type%22", strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null%20%20realm%3D%22unsupported_grant_type%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null%20%20realm%3D%22unsupported_grant_type%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2203");
        java.lang.String[] strArray3 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2Exception=HTTP%20status" + "'", str7, "net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test2204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2204");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2ProblemException: error_uri", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2ProblemException: error_uri" + "'", str7, "net.oauth.v2.OAuth2ProblemException: error_uri");
    }

    @Test
    public void test2205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2205");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("token", "access_token");
        java.lang.Object obj3 = null;
        boolean boolean4 = parameter2.equals(obj3);
        java.lang.String str5 = parameter2.getValue();
        boolean boolean7 = parameter2.equals((java.lang.Object) 10.0f);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "access_token" + "'", str5, "access_token");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2206");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        oAuth2Message8.method = "application%2Fx-www-form-urlencoded";
        java.lang.String str12 = oAuth2Message8.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test2207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2207");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str13 = oAuth2Message8.getCode();
        java.lang.String str14 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str12, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2208");
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
        oAuth2Accessor1.code = "OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test2209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2209");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("\ufffd\n", "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request", "null  realm=\"unsupported_grant_type\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strMap9);
    }

    @Test
    public void test2210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2210");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2211");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "error_uri" + "'", str2, "error_uri");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "error_uri" + "'", str3, "error_uri");
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test2212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2212");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        oAuth2Message5.method = "PUT=unsupported_grant_type";
        java.lang.String str11 = oAuth2Message5.getHeader("net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2213");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        java.lang.String str3 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test2214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2214");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("scope", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
    }

    @Test
    public void test2215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2215");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2216");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test2217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2217");
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
        java.lang.String str26 = oAuth2ProblemException7.getProblem();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList32 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str33 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList32);
        java.io.InputStream inputStream34 = null;
        net.oauth.v2.OAuth2Message oAuth2Message35 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList32, inputStream34);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList36 = oAuth2Message35.getHeaders();
        java.lang.String str38 = oAuth2Message35.getHeader("error_uri");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList39 = oAuth2Message35.getHeaders();
        oAuth2ProblemException7.setParameter("Authorization-Schesme=token_type", (java.lang.Object) strEntryList39);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 200 + "'", int24 == 200);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "invalid_token" + "'", str25, "invalid_token");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "invalid_token" + "'", str26, "invalid_token");
        org.junit.Assert.assertNotNull(parameterList32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "unsupported_grant_type" + "'", str33, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList36);
        org.junit.Assert.assertNull(str38);
        org.junit.Assert.assertNotNull(strEntryList39);
    }

    @Test
    public void test2218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2218");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("invalid_grant");
        java.lang.String str8 = parameter2.getKey();
        java.lang.String str9 = parameter2.getValue();
        java.lang.String str10 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme" + "'", str8, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "invalid_grant" + "'", str9, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_grant" + "'", str10, "invalid_grant");
    }

    @Test
    public void test2219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2219");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        oAuth2Accessor1.state = "";
        oAuth2Accessor1.accessToken = "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2220");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("2.0", "redirect_uri_mismatch");
    }

    @Test
    public void test2221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2221");
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
        java.lang.Object obj16 = oAuth2Accessor9.getProperty("PUT");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Authorization-Schesme=token_type" + "'", str14, "Authorization-Schesme=token_type");
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test2222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2222");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test2223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2223");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("hi!", "", "OAuth2Message(scope, DELETE, [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str4, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test2224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2224");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getParameter("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        java.lang.String str8 = oAuth2Message5.getCode();
        java.lang.String str9 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test2225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2225");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.lang.String str1 = oAuth2ProblemException0.getProblem();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("code_and_token", (java.lang.Throwable) oAuth2Exception7);
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception8);
        int int10 = oAuth2ProblemException3.getHttpStatusCode();
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException3);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test2226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2226");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = oAuth2Accessor2.clone();
        java.lang.String str20 = oAuth2Accessor2.code;
        oAuth2Accessor2.code = "null  realm=\"redirect_uri_mismatch\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(oAuth2Client16);
        org.junit.Assert.assertNotNull(oAuth2Accessor19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null  realm=\"client_secret\"" + "'", str20, "null  realm=\"client_secret\"");
    }

    @Test
    public void test2227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2227");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("#net.oauth.v2.OAuth2Exception=HTTP%20status", "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2228");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str5 = parameter2.setValue("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str6, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2229");
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
        net.oauth.v2.OAuth2Client oAuth2Client13 = oAuth2Accessor1.client;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor14 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(oAuth2Client9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(oAuth2Client13);
        org.junit.Assert.assertNotNull(oAuth2Accessor14);
    }

    @Test
    public void test2230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2230");
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
        oAuth2Accessor9.code = "none=token";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = oAuth2Accessor9.clone();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor16);
        org.junit.Assert.assertNotNull(oAuth2Accessor19);
    }

    @Test
    public void test2231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2231");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList6 = oAuth2Message5.getParameters();
        java.lang.String str7 = oAuth2Message5.method;
        oAuth2Message5.method = "application%252Fx-www-form-urlencoded";
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strEntryList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str7, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test2232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2232");
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
        java.lang.String str22 = oAuth2Message15.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message15.completeParameters();
        java.lang.String str25 = oAuth2Message15.getParameter("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "refresh_token" + "'", str20, "refresh_token");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str22, "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertNull(str25);
    }

    @Test
    public void test2233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2233");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream7);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP request" + "'", str6, "HTTP request");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2234");
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
        java.lang.String str18 = oAuth2ProblemException0.toString();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "net.oauth.v2.OAuth2ProblemException: HTTP status 200" + "'", str18, "net.oauth.v2.OAuth2ProblemException: HTTP status 200");
    }

    @Test
    public void test2235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2235");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getWWWAuthenticateHeader("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        oAuth2Message4.method = "authorization_code";
        java.lang.String str9 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"" + "'", str6, "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "authorization_code" + "'", str9, "authorization_code");
    }

    @Test
    public void test2236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2236");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream7);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("null  realm=\"password\"", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str14 = oAuth2Message12.getHeader("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20Location%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        java.lang.String str15 = oAuth2Message12.getClientId();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2237");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        java.lang.String str10 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2238");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test2239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2239");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client9 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client9);
        java.lang.String str11 = oAuth2Accessor10.tokenType;
        java.lang.String str12 = oAuth2Accessor10.tokenType;
        oAuth2Accessor10.code = "unsupported_grant_type";
        oAuth2Accessor10.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray20 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList21 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21, parameterArray20);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.util.Map<java.lang.String, java.lang.String> strMap24 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.lang.String str25 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        java.util.Map<java.lang.String, java.lang.String> strMap26 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList21);
        oAuth2Accessor10.setProperty("response_type", (java.lang.Object) strMap26);
        oAuth2Accessor7.setProperty("PUT", (java.lang.Object) "response_type");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test2240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2240");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("OAuth2Message(HTTP response, GET, [])", "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22" + "'", str3, "OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"" + "'", str5, "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
    }

    @Test
    public void test2241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2241");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("UTF-8", "null  realm=\"password\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        java.lang.String str12 = oAuth2Message8.getHeader("null%20%20realm%3D%22invalid_token%22=expires_in");
        java.lang.String str13 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2242");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, inputStream13);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("Location", "application%2Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.lang.String str16 = oAuth2Message15.method;
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Location" + "'", str16, "Location");
    }

    @Test
    public void test2243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2243");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test2244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2244");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null%20%20realm%3D%22unsupported_grant_type%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: unsupported_response_type", "null  realm=\"net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test2245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2245");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2246");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("assertion", strArray8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2247");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.lang.String str7 = oAuth2Message5.getClientId();
        java.lang.String str8 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test2248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2248");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap3 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test2249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2249");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2250");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("authorization_code", (java.lang.Throwable) oAuth2ProblemException2);
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException2.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray6);
    }

    @Test
    public void test2251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2251");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.lang.String str7 = oAuth2Message5.getClientId();
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str10 = oAuth2Message5.getHeader("net.oauth.v2.OAuth2Exception=HTTP%20status");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test2252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2252");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null  realm=\"expires_in\"");
    }

    @Test
    public void test2253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2253");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.lang.String str15 = oAuth2Message8.getHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        oAuth2Message8.method = "net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str18 = oAuth2Message8.getCode();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2254");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test2255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2255");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception7);
    }

    @Test
    public void test2256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2256");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.expires_in = "access_token";
        oAuth2Accessor1.expires_in = "net.oauth.v2.OAuth2Exception: HTTP request";
        oAuth2Accessor1.expires_in = "";
        oAuth2Accessor1.code = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2257");
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
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test2258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2258");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor9.clone();
        java.lang.String str11 = oAuth2Accessor9.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2259");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test2260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2260");
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
        net.oauth.v2.OAuth2Client oAuth2Client19 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor20 = new net.oauth.v2.OAuth2Accessor(oAuth2Client19);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = oAuth2Accessor20.clone();
        oAuth2Accessor21.expires_in = "refresh_token";
        java.lang.String str24 = oAuth2Accessor21.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor25 = oAuth2Accessor21.clone();
        java.lang.String str26 = oAuth2Accessor25.refreshToken;
        oAuth2Client3.setProperty("null%20%20realm%3D%22Authorization-Schesme%22%3Fpassword%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id", (java.lang.Object) str26);
        java.lang.Object obj29 = oAuth2Client3.getProperty("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str17, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(oAuth2Accessor25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(obj29);
    }

    @Test
    public void test2261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2261");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test2262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2262");
        net.oauth.v2.OAuth2Client oAuth2Client1 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = new net.oauth.v2.OAuth2Accessor(oAuth2Client1);
        oAuth2Accessor2.code = "error_description";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2Exception9);
        int int11 = oAuth2ProblemException7.getHttpStatusCode();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception16);
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception16);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException20 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception21 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException20);
        int int22 = oAuth2ProblemException20.getHttpStatusCode();
        oAuth2Exception18.addSuppressed((java.lang.Throwable) oAuth2ProblemException20);
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2ProblemException20);
        oAuth2Accessor2.setProperty("error_uri", (java.lang.Object) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception("HTTP%20status?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Throwable) oAuth2Exception26);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
    }

    @Test
    public void test2263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2263");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        oAuth2Message4.method = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str10 = oAuth2Message4.getHeader("null  realm=\"code_and_token\"");
        java.lang.String str11 = oAuth2Message4.URL;
        oAuth2Message4.URL = "HTTP response";
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
    }

    @Test
    public void test2264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2264");
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
        java.lang.String str28 = oAuth2Accessor1.state;
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2265");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("2.0", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("redirect_uri", "assertion_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("null  realm=\"\"", "null  realm=\"none%3DUTF-8\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream11);
        java.lang.String str14 = oAuth2Message12.getParameter("null  realm=\"password\"");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str8, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2.0" + "'", str9, "2.0");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test2266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2266");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("\n");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParametersAsFragment("invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&Authorization-Schesme=" + "'", str3, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&Authorization-Schesme=");
    }

    @Test
    public void test2267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2267");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2268");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        java.lang.String str10 = oAuth2Message8.getCode();
        java.lang.String str11 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2269");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream5 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream5);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream8);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream10);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test2270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2270");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("bearer");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test2271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2271");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2272");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.refreshToken = "null  realm=\"\"";
        oAuth2Accessor1.scope = "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
    }

    @Test
    public void test2273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2273");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
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
        java.lang.String str25 = oAuth2Accessor7.scope;
        boolean boolean26 = parameter2.equals((java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException28 = new net.oauth.v2.OAuth2ProblemException("access_denied");
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException28);
        boolean boolean30 = parameter2.equals((java.lang.Object) oAuth2Exception29);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(parameterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2274");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        oAuth2Message5.completeParameters();
        java.lang.String str10 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20hi%21\"" + "'", str10, "null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20hi%21\"");
    }

    @Test
    public void test2275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2275");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2276");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        oAuth2Accessor1.code = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        oAuth2Accessor1.expires_in = "net.oauth.v2.OAuth2Exception: HTTP request";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2277");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList18 = oAuth2Message12.getHeaders();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strEntryList18);
    }

    @Test
    public void test2278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2278");
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
        java.lang.String str16 = oAuth2Accessor1.state;
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
    public void test2279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2279");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.Object obj6 = null;
        boolean boolean7 = parameter2.equals(obj6);
        java.lang.String str9 = parameter2.setValue("OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "none" + "'", str9, "none");
    }

    @Test
    public void test2280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2280");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException3);
        int int6 = oAuth2ProblemException3.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Throwable) oAuth2ProblemException3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test2281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2281");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
    }

    @Test
    public void test2282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2282");
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
        java.lang.String str30 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor31 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str30, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test2283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2283");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test2284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2284");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "Authorization-Schesme";
        oAuth2Accessor1.scope = "invalid_token";
        java.lang.String str10 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2285");
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
        java.lang.String str16 = oAuth2Message5.getWWWAuthenticateHeader("OAuth2Message(POST, refresh_token, [])");
        oAuth2Message5.completeParameters();
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "GET" + "'", str13, "GET");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null  realm=\"OAuth2Message%28POST%2C%20refresh_token%2C%20%5B%5D%29\"" + "'", str16, "null  realm=\"OAuth2Message%28POST%2C%20refresh_token%2C%20%5B%5D%29\"");
    }

    @Test
    public void test2286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2286");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.refreshToken = "none";
        java.lang.String str12 = oAuth2Accessor1.tokenType;
        java.lang.Object obj14 = oAuth2Accessor1.getProperty("null  realm=\"null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "response_type" + "'", str12, "response_type");
        org.junit.Assert.assertNull(obj14);
    }

    @Test
    public void test2287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2287");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2288");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        oAuth2Accessor1.expires_in = "invalid_token";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        oAuth2Accessor1.expires_in = "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
    }

    @Test
    public void test2289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2289");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2290");
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
        net.oauth.v2.OAuth2Client oAuth2Client35 = new net.oauth.v2.OAuth2Client("HTTP request", "invalid_request", "HTTP request");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor36 = new net.oauth.v2.OAuth2Accessor(oAuth2Client35);
        oAuth2Client3.setProperty("error_description", (java.lang.Object) oAuth2Accessor36);
        oAuth2Accessor36.code = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str40 = oAuth2Accessor36.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test2291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2291");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException28 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException28);
        int int30 = oAuth2ProblemException28.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception31 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException28.addSuppressed((java.lang.Throwable) oAuth2Exception31);
        java.util.Map<java.lang.String, java.lang.Object> strMap33 = oAuth2ProblemException28.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException35 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int36 = oAuth2ProblemException35.getHttpStatusCode();
        java.lang.String str37 = oAuth2ProblemException35.getProblem();
        oAuth2ProblemException28.addSuppressed((java.lang.Throwable) oAuth2ProblemException35);
        int int39 = oAuth2ProblemException35.getHttpStatusCode();
        int int40 = oAuth2ProblemException35.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request", (java.lang.Throwable) oAuth2ProblemException35);
        oAuth2ProblemException0.addSuppressed((java.lang.Throwable) oAuth2ProblemException35);
        net.oauth.v2.OAuth2Client oAuth2Client44 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor45 = new net.oauth.v2.OAuth2Accessor(oAuth2Client44);
        oAuth2Accessor45.refreshToken = "assertion";
        java.lang.String str48 = oAuth2Accessor45.state;
        java.lang.String str49 = oAuth2Accessor45.expires_in;
        oAuth2Accessor45.code = "Authorization-Schesme";
        oAuth2Accessor45.expires_in = "invalid_token";
        oAuth2ProblemException0.setParameter("null  realm=\"unsupported_grant_type\"", (java.lang.Object) "invalid_token");
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 200 + "'", int23 == 200);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "hi!" + "'", str24, "hi!");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 200 + "'", int30 == 200);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 200 + "'", int39 == 200);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 200 + "'", int40 == 200);
        org.junit.Assert.assertNull(str48);
        org.junit.Assert.assertNull(str49);
    }

    @Test
    public void test2292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2292");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test2293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2293");
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
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList18 = net.oauth.v2.OAuth2Message.decodeAuthorization("GET");
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.lang.String str20 = oAuth2Message19.URL;
        java.lang.String str22 = oAuth2Message19.getHeader("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2ProblemException11.setParameter("null  realm=\"expires_in\"", (java.lang.Object) str22);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertNotNull(parameterList18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "token_type" + "'", str20, "token_type");
        org.junit.Assert.assertNull(str22);
    }

    @Test
    public void test2294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2294");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        oAuth2Message5.method = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str10 = oAuth2Message5.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = oAuth2Message5.getParameterMap();
        oAuth2Message5.completeParameters();
        java.lang.String str14 = oAuth2Message5.getHeader("OAuth2Message(HTTP response, GET, [])");
        java.lang.String str16 = oAuth2Message5.getParameter("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2295");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message12.getHeaders();
        oAuth2Message12.completeParameters();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNotNull(strEntryList17);
    }

    @Test
    public void test2296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2296");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor1.scope;
        oAuth2Accessor1.refreshToken = "username";
        java.lang.String str10 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = oAuth2Accessor1.clone();
        java.lang.String str12 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(oAuth2Accessor11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "username" + "'", str12, "username");
    }

    @Test
    public void test2297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2297");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        int int14 = oAuth2ProblemException12.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = oAuth2ProblemException12.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client17 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        oAuth2Accessor18.refreshToken = "assertion";
        java.lang.String str21 = oAuth2Accessor18.state;
        oAuth2ProblemException12.setParameter("error_uri", (java.lang.Object) oAuth2Accessor18);
        oAuth2Accessor9.setProperty("null  realm=\"invalid_token\"", (java.lang.Object) oAuth2Accessor18);
        net.oauth.v2.OAuth2Client oAuth2Client25 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor26 = new net.oauth.v2.OAuth2Accessor(oAuth2Client25);
        oAuth2Accessor26.refreshToken = "assertion";
        java.lang.String str29 = oAuth2Accessor26.state;
        java.lang.String str30 = oAuth2Accessor26.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor31 = oAuth2Accessor26.clone();
        java.lang.String str32 = oAuth2Accessor31.tokenType;
        java.lang.Object obj34 = oAuth2Accessor31.getProperty("token");
        oAuth2Accessor31.scope = "unsupported_response_type";
        java.lang.String[] strArray45 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList46 = net.oauth.v2.OAuth2.newList(strArray45);
        java.lang.String str47 = net.oauth.v2.OAuth2.addParameters("assertion", strArray45);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList48 = net.oauth.v2.OAuth2.newList(strArray45);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList49 = net.oauth.v2.OAuth2.newList(strArray45);
        oAuth2Accessor31.setProperty("HTTP request", (java.lang.Object) parameterList49);
        oAuth2Accessor18.setProperty("OAuth2Message(DELETE, client_id, [])", (java.lang.Object) oAuth2Accessor31);
        oAuth2Accessor18.refreshToken = "Location";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(oAuth2Accessor31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(obj34);
        org.junit.Assert.assertNotNull(strArray45);
        org.junit.Assert.assertNotNull(parameterList46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str47, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList48);
        org.junit.Assert.assertNotNull(parameterList49);
    }

    @Test
    public void test2298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2298");
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
        java.lang.String str18 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str18, "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test2299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2299");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        oAuth2Message8.completeParameters();
        oAuth2Message8.method = "null  realm=\"unsupported_grant_type%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test2300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2300");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray3);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "access_token" + "'", str5, "access_token");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str7, "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2301");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str4 = parameter2.setValue("");
        java.lang.String str6 = parameter2.setValue("token");
        java.lang.String str7 = parameter2.toString();
        java.lang.String str8 = parameter2.getValue();
        java.lang.String str9 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none=token" + "'", str7, "none=token");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "token" + "'", str8, "token");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "none" + "'", str9, "none");
    }

    @Test
    public void test2302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2302");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.lang.String str10 = oAuth2Message8.method;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test2303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2303");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = oAuth2Message9.URL;
        java.lang.String str11 = oAuth2Message9.getClientId();
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2304");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        java.lang.String str12 = oAuth2Accessor1.code;
        java.lang.String str13 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(oAuth2Client11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2305");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("HTTP status");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?Authorization-Schesme=HTTP" + "'", str3, "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?Authorization-Schesme=HTTP");
    }

    @Test
    public void test2306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2306");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream6);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream8);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
    }

    @Test
    public void test2307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2307");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        java.lang.String str10 = oAuth2Accessor1.scope;
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2308");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.BaseTokenType baseTokenType3 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType3;
        net.oauth.v2.OAuth2.TokenType = baseTokenType3;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType3);
        net.oauth.v2.OAuth2.TokenType = baseTokenType3;
        oAuth2ProblemException1.setParameter("null  realm=\"POST%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23password%3Derror_uri%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%26redirect_uri_mismatch%3Dnet.oauth.v2.OAuth2ProblemException%253A%2520client_id\"", (java.lang.Object) baseTokenType3);
        org.junit.Assert.assertNotNull(baseTokenType3);
    }

    @Test
    public void test2309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2309");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("unsupported_response_type");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test2310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2310");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        java.lang.String str10 = oAuth2Client3.redirectUri;
        net.oauth.v2.BaseTokenType baseTokenType12 = net.oauth.v2.OAuth2.TokenType;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType12);
        net.oauth.v2.OAuth2.TokenType = baseTokenType12;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType12);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType12);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType12);
        oAuth2Client3.setProperty("OAuth2Message(invalid_grant, invalid_client, [])", (java.lang.Object) baseTokenType12);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(baseTokenType12);
    }

    @Test
    public void test2311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2311");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Client3.setProperty("null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str9 = oAuth2Client3.redirectUri;
        java.lang.Object obj11 = oAuth2Client3.getProperty("none=UTF-8");
        java.lang.String str12 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token" + "'", str9, "token");
        org.junit.Assert.assertNull(obj11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "invalid_grant" + "'", str12, "invalid_grant");
    }

    @Test
    public void test2312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2312");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test2313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2313");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null%20%20realm%3D%22code_and_token%22", "net.oauth.v2.OAuth2Exception=HTTP%20status");
    }

    @Test
    public void test2314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2314");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "scope";
        oAuth2Accessor1.code = "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"";
        oAuth2Accessor1.state = "null%20%20realm%3D%22invalid_token%22=expires_in";
        java.lang.String str11 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "Authorization-Schesme=invalid_scope%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test2315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2315");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("hi!", "", "OAuth2Message(scope, DELETE, [])");
        java.lang.String str4 = oAuth2Client3.clientId;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2316");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.BaseResponseType.getInstance();
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test2317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2317");
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
        java.lang.String str19 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str19, "null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test2318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2318");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        oAuth2Accessor1.expires_in = "invalid_token";
        java.lang.String str10 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2319");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor2.clone();
        java.lang.String str7 = oAuth2Accessor6.expires_in;
        oAuth2Accessor6.accessToken = "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "refresh_token" + "'", str7, "refresh_token");
    }

    @Test
    public void test2320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2320");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("none=invalid_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2321");
        net.oauth.v2.OAuth2.Parameter[] parameterArray6 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList7 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, parameterArray6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str12 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str13 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream14 = null;
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: Location", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream14);
        java.io.OutputStream outputStream16 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream16);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("null%20%20realm%3D%22Location%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22%3Fnet.oauth.v2.OAuth2Exception%3DHTTP%2520status", "null%20%20realm%3D%22code_and_token%22", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str19 = oAuth2Message18.URL;
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null%20%20realm%3D%22code_and_token%22" + "'", str19, "null%20%20realm%3D%22code_and_token%22");
    }

    @Test
    public void test2322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2322");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str5 = parameter2.setValue("OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
        java.lang.String str7 = parameter2.setValue("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str5, "unauthorized_client?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])" + "'", str7, "OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])");
    }

    @Test
    public void test2323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2323");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str4 = parameter2.setValue("");
        java.lang.String str6 = parameter2.setValue("token");
        java.lang.String str7 = parameter2.toString();
        java.lang.String str8 = parameter2.getValue();
        java.lang.String[] strArray17 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList18 = net.oauth.v2.OAuth2.newList(strArray17);
        java.lang.String str19 = net.oauth.v2.OAuth2.addParameters("assertion", strArray17);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray17);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList21 = net.oauth.v2.OAuth2.newList(strArray17);
        boolean boolean22 = parameter2.equals((java.lang.Object) parameterList21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "UTF-8" + "'", str4, "UTF-8");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "none=token" + "'", str7, "none=token");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "token" + "'", str8, "token");
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertNotNull(parameterList18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str19, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str20, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2324");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.accessToken = "hi!";
        oAuth2Accessor1.accessToken = "invalid_token";
        java.lang.String str8 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2325");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        oAuth2Accessor1.scope = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.scope = "PUT=unsupported_grant_type";
        net.oauth.v2.OAuth2.Parameter[] parameterArray14 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList15 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, parameterArray14);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str19 = oAuth2Message17.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = oAuth2Message17.getHeaders();
        java.lang.String str21 = oAuth2Message17.URL;
        java.lang.String str22 = oAuth2Message17.getClientId();
        java.lang.String str23 = oAuth2Message17.URL;
        oAuth2Message17.method = "null  realm=\"client_id\"";
        oAuth2Accessor1.setProperty("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "null  realm=\"client_id\"");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(parameterArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strEntryList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test2326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2326");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        java.lang.String str7 = oAuth2Accessor1.state;
        java.lang.String str8 = oAuth2Accessor1.code;
        java.lang.Object obj10 = oAuth2Accessor1.getProperty("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test2327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2327");
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
        java.lang.String str28 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2.Parameter[] parameterArray32 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList33 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList33, parameterArray32);
        net.oauth.v2.OAuth2Message oAuth2Message35 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList33);
        java.lang.String str37 = oAuth2Message35.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = oAuth2Message35.getParameterMap();
        oAuth2Message35.URL = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        java.lang.String str41 = oAuth2Message35.URL;
        oAuth2Client3.setProperty("", (java.lang.Object) oAuth2Message35);
        java.lang.Object obj44 = oAuth2Client3.getProperty("null%20%20realm%3D%22invalid_token%22=expires_in?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(parameterArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str41, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertNull(obj44);
    }

    @Test
    public void test2328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2328");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test2329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2329");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("scope", "HTTP request", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.lang.String str13 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "OAuth2Message(scope, HTTP request, [])" + "'", str13, "OAuth2Message(scope, HTTP request, [])");
    }

    @Test
    public void test2330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2330");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream5 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str7, "null%2520%2520realm%253D%2522invalid_token%2522%3Dexpires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test2331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2331");
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
        oAuth2Accessor19.tokenType = "null%20%20realm%3D%22invalid_token%22=expires_in";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
    }

    @Test
    public void test2332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2332");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.method;
        oAuth2Message8.method = "application%2Fx-www-form-urlencoded";
        oAuth2Message8.URL = "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"";
        java.lang.String str15 = oAuth2Message8.getParameter("PUT");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test2333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2333");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Client3.setProperty("null  realm=\"redirect_uri_mismatch\"", (java.lang.Object) "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException12.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception14);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException18 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException18);
        int int20 = oAuth2ProblemException18.getHttpStatusCode();
        oAuth2Exception16.addSuppressed((java.lang.Throwable) oAuth2ProblemException18);
        oAuth2Client3.setProperty("null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) oAuth2Exception16);
        java.lang.Throwable[] throwableArray23 = oAuth2Exception16.getSuppressed();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNotNull(throwableArray23);
    }

    @Test
    public void test2334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2334");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = oAuth2ProblemException1.getParameters();
        int int6 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test2335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2335");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "refresh_token";
        java.lang.String str5 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test2336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2336");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream8 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ufffd\n" + "'", str10, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test2337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2337");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        java.lang.String str7 = oAuth2Accessor1.scope;
        java.lang.String str8 = oAuth2Accessor1.state;
        java.lang.String str9 = oAuth2Accessor1.tokenType;
        java.lang.String str10 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2338");
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
        java.lang.String str21 = oAuth2Message15.getClientId();
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
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2339");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("HTTP status", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unauthorized_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTTP status" + "'", str4, "HTTP status");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unauthorized_client" + "'", str5, "unauthorized_client");
    }

    @Test
    public void test2340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2340");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, inputStream15);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HTTP request" + "'", str9, "HTTP request");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2341");
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
        oAuth2Accessor10.scope = "net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str18 = oAuth2Accessor10.refreshToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test2342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2342");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream13);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message14.getParameters();
        java.lang.String str16 = oAuth2Message14.getClientId();
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "refresh_token" + "'", str12, "refresh_token");
        org.junit.Assert.assertNotNull(strEntryList15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2343");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("UTF-8", "application%252Fx-www-form-urlencoded", "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str4, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2344");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        boolean boolean7 = parameter2.equals((java.lang.Object) "invalid_token");
        java.lang.String str9 = parameter2.setValue("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str10 = parameter2.getKey();
        net.oauth.v2.BaseErrorCode baseErrorCode11 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode11);
        boolean boolean13 = parameter2.equals((java.lang.Object) baseErrorCode11);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "token_type" + "'", str9, "token_type");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme" + "'", str10, "Authorization-Schesme");
        org.junit.Assert.assertNotNull(baseErrorCode11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test2345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2345");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList15 = oAuth2Message5.getParameters();
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
        org.junit.Assert.assertNotNull(strEntryList15);
    }

    @Test
    public void test2346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2346");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException27 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception28 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException27.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        net.oauth.v2.OAuth2Exception oAuth2Exception31 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception29);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException33 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception34 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException33);
        int int35 = oAuth2ProblemException33.getHttpStatusCode();
        oAuth2Exception31.addSuppressed((java.lang.Throwable) oAuth2ProblemException33);
        net.oauth.v2.OAuth2.Parameter[] parameterArray40 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList41 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList41, parameterArray40);
        net.oauth.v2.OAuth2Message oAuth2Message43 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList41);
        java.lang.String str45 = oAuth2Message43.getHeader("");
        java.lang.String str46 = oAuth2Message43.URL;
        oAuth2ProblemException33.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str46);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException49 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception50 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException49);
        int int51 = oAuth2ProblemException49.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception52 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException49.addSuppressed((java.lang.Throwable) oAuth2Exception52);
        java.util.Map<java.lang.String, java.lang.Object> strMap54 = oAuth2ProblemException49.getParameters();
        oAuth2ProblemException33.addSuppressed((java.lang.Throwable) oAuth2ProblemException49);
        net.oauth.v2.OAuth2Exception oAuth2Exception56 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException33);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException58 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception59 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException58);
        int int60 = oAuth2ProblemException58.getHttpStatusCode();
        oAuth2ProblemException33.addSuppressed((java.lang.Throwable) oAuth2ProblemException58);
        oAuth2Client7.setProperty("OAuth2Message(hi!, OAuth2Message(Authorization-Schesme=token_type, , []), [])", (java.lang.Object) oAuth2ProblemException33);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor63 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "token_type" + "'", str22, "token_type");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertNotNull(parameterArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 200 + "'", int51 == 200);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 200 + "'", int60 == 200);
    }

    @Test
    public void test2347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2347");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test2348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2348");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.state;
        oAuth2Accessor1.code = "net.oauth.v2.OAuth2Exception: HTTP request";
        net.oauth.v2.OAuth2Client oAuth2Client13 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str14 = oAuth2Client13.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter18 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str19 = parameter18.toString();
        java.lang.String str21 = parameter18.setValue("access_denied");
        oAuth2Client13.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter18);
        java.lang.String str23 = oAuth2Client13.clientSecret;
        java.lang.Object obj25 = oAuth2Client13.getProperty("application%2Fx-www-form-urlencoded");
        java.lang.String str26 = oAuth2Client13.clientId;
        java.lang.String str27 = oAuth2Client13.clientSecret;
        java.lang.Object obj29 = oAuth2Client13.getProperty("Location");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor30 = new net.oauth.v2.OAuth2Accessor(oAuth2Client13);
        java.lang.String[] strArray43 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList44 = net.oauth.v2.OAuth2.newList(strArray43);
        java.lang.String str45 = net.oauth.v2.OAuth2.addParameters("assertion", strArray43);
        java.lang.String str46 = net.oauth.v2.OAuth2.addParametersAsFragment("none", strArray43);
        java.lang.String str47 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"", strArray43);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList48 = net.oauth.v2.OAuth2.newList(strArray43);
        java.lang.String str49 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList48);
        java.lang.String str50 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList48);
        net.oauth.v2.OAuth2Message oAuth2Message51 = new net.oauth.v2.OAuth2Message("error_description", "scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList48);
        oAuth2Client13.setProperty("null%20%20realm%3D%22invalid_token%22=expires_in", (java.lang.Object) "scope");
        oAuth2Accessor1.setProperty("PUT", (java.lang.Object) oAuth2Client13);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str14, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Authorization-Schesme=token_type" + "'", str19, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "token_type" + "'", str21, "token_type");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str23, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "token_type" + "'", str26, "token_type");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str27, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj29);
        org.junit.Assert.assertNotNull(strArray43);
        org.junit.Assert.assertNotNull(parameterList44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str45, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str46, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str47, "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str49, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str50, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2349");
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
        java.lang.String str35 = oAuth2ProblemException26.getProblem();
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
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
    }

    @Test
    public void test2350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2350");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2351");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test2352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2352");
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
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16, outputStream18);
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
    public void test2353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2353");
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
        java.lang.String str31 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "token_type" + "'", str31, "token_type");
    }

    @Test
    public void test2354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2354");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "redirect_uri_mismatch";
        java.lang.String str12 = oAuth2Accessor1.state;
        oAuth2Accessor1.code = "Authorization-Schesme=null&realm=none%3DUTF-8";
        oAuth2Accessor1.refreshToken = "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2355");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        org.junit.Assert.assertNotNull(baseGrantType0);
    }

    @Test
    public void test2356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2356");
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
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList28 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str29 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str30 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        net.oauth.v2.OAuth2Message oAuth2Message31 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList32 = oAuth2Message31.getParameters();
        oAuth2Message31.method = "DELETE";
        oAuth2Message31.completeParameters();
        java.lang.String str37 = oAuth2Message31.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap38 = oAuth2Message31.getParameterMap();
        oAuth2Accessor15.setProperty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) strMap38);
        java.lang.String str40 = oAuth2Accessor15.code;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(parameterList28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "unsupported_grant_type" + "'", str29, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "username" + "'", str30, "username");
        org.junit.Assert.assertNotNull(strEntryList32);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test2357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2357");
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
        java.lang.Class<?> wildcardClass19 = oAuth2Message5.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test2358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2358");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("bearer");
        oAuth2Accessor1.refreshToken = "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2359");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("PUT", "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
    }

    @Test
    public void test2360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2360");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.Object obj6 = oAuth2Client3.getProperty("null%20%20realm%3D%22unsupported_grant_type%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test2361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2361");
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
        java.lang.String str16 = oAuth2Message7.getCode();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_grant" + "'", str11, "invalid_grant");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2362");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "Authorization-Schesme=error");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme=error" + "'", str4, "Authorization-Schesme=error");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=error" + "'", str5, "Authorization-Schesme=error");
    }

    @Test
    public void test2363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2363");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.redirectUri;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int9 = oAuth2ProblemException8.getHttpStatusCode();
        java.lang.String str10 = oAuth2ProblemException8.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray14 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList15 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, parameterArray14);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        oAuth2ProblemException8.setParameter("code", (java.lang.Object) parameterList15);
        java.lang.String str20 = net.oauth.v2.OAuth2.addParameters("invalid_request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        oAuth2Client3.setProperty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) parameterList15);
        java.lang.Object obj23 = oAuth2Client3.getProperty("invalid_scope");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token" + "'", str4, "token");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(parameterArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "invalid_request" + "'", str20, "invalid_request");
        org.junit.Assert.assertNull(obj23);
    }

    @Test
    public void test2364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2364");
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
        java.lang.String str31 = oAuth2Client3.clientSecret;
        java.lang.Object obj33 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.Object obj35 = oAuth2Client3.getProperty("null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str31, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj33);
        org.junit.Assert.assertNull(obj35);
    }

    @Test
    public void test2365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2365");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"hi%21\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2366");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.Object obj15 = oAuth2Client3.getProperty("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.Class<?> wildcardClass16 = oAuth2Client3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test2367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2367");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message8.getParameters();
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList12);
    }

    @Test
    public void test2368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2368");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.lang.String str10 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.code = "net.oauth.v2.OAuth2ProblemException: error_uri";
        oAuth2Accessor1.refreshToken = "null  realm=\"OAuth2Message%28scope%2C%20DELETE%2C%20%5B%5D%29\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Authorization-Schesme=token_type" + "'", str10, "Authorization-Schesme=token_type");
    }

    @Test
    public void test2369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2369");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.Throwable throwable9 = null;
        // The following exception was thrown during execution in test generation
        try {
            oAuth2Exception8.addSuppressed(throwable9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test2370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2370");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str12 = oAuth2Accessor11.code;
        java.lang.String str13 = oAuth2Accessor11.expires_in;
        oAuth2Accessor11.refreshToken = "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: HTTP status 200";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test2371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2371");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("none=UTF-8");
        java.lang.String str13 = oAuth2Message8.getWWWAuthenticateHeader("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        oAuth2Message8.method = "access_token#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str9, "OAuth2Message(Authorization-Schesme=token_type, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"none%3DUTF-8\"" + "'", str11, "null  realm=\"none%3DUTF-8\"");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"unsupported_grant_type%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str13, "null  realm=\"unsupported_grant_type%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test2372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2372");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("null%20%20realm%3D%22invalid_token%22=POST");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str2, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
    }

    @Test
    public void test2373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2373");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("client_secret");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException13 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int14 = oAuth2ProblemException13.getHttpStatusCode();
        java.lang.String str15 = oAuth2ProblemException13.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray19 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList20 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList20, parameterArray19);
        net.oauth.v2.OAuth2Message oAuth2Message22 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList20);
        java.util.Map<java.lang.String, java.lang.String> strMap23 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList20);
        oAuth2ProblemException13.setParameter("code", (java.lang.Object) parameterList20);
        net.oauth.v2.OAuth2Message oAuth2Message25 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList20);
        oAuth2Message25.method = "authorization_code";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList28 = oAuth2Message25.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = oAuth2Message25.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList30 = oAuth2Message25.getHeaders();
        oAuth2Accessor1.setProperty("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) strEntryList30);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(parameterArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertNotNull(strEntryList28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strEntryList30);
    }

    @Test
    public void test2374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2374");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("none", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.io.InputStream inputStream16 = null;
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("OAuth2Message(POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, URL, [])", "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, inputStream16);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2375");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("application%252Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2Exception11);
        oAuth2Accessor1.setProperty("null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"", (java.lang.Object) oAuth2Exception11);
        net.oauth.v2.OAuth2Client oAuth2Client14 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client14);
    }

    @Test
    public void test2376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2376");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        oAuth2Accessor1.expires_in = "application/x-www-form-urlencoded";
        oAuth2Accessor1.state = "null  realm=\"net.oauth.v2.OAuth2Exception%3DHTTP%2520status\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2377");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap43 = oAuth2ProblemException8.getParameters();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNotNull(strMap43);
    }

    @Test
    public void test2378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2378");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("2.0");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "2.0" + "'", str1, "2.0");
    }

    @Test
    public void test2379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2379");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("error_description");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[101, 114, 114, 111, 114, 95, 100, 101, 115, 99, 114, 105, 112, 116, 105, 111, 110]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "error_description" + "'", str2, "error_description");
    }

    @Test
    public void test2380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2380");
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
        java.lang.String str19 = oAuth2Message16.getWWWAuthenticateHeader("hi!");
        java.lang.String str20 = oAuth2Message16.URL;
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "null  realm=\"hi%21\"" + "'", str19, "null  realm=\"hi%21\"");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "none=invalid_client" + "'", str20, "none=invalid_client");
    }

    @Test
    public void test2381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2381");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.lang.String str12 = oAuth2Message8.getClientId();
        java.lang.String str13 = oAuth2Message8.method;
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2382");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        oAuth2Accessor1.scope = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.scope = "PUT=unsupported_grant_type";
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception16);
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception16);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException20 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception21 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException20);
        int int22 = oAuth2ProblemException20.getHttpStatusCode();
        oAuth2Exception18.addSuppressed((java.lang.Throwable) oAuth2ProblemException20);
        net.oauth.v2.OAuth2.Parameter[] parameterArray27 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList28 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28, parameterArray27);
        net.oauth.v2.OAuth2Message oAuth2Message30 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str32 = oAuth2Message30.getHeader("");
        java.lang.String str33 = oAuth2Message30.URL;
        oAuth2ProblemException20.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str33);
        java.lang.Throwable[] throwableArray35 = oAuth2ProblemException20.getSuppressed();
        net.oauth.v2.OAuth2Client oAuth2Client37 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor38 = new net.oauth.v2.OAuth2Accessor(oAuth2Client37);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor39 = oAuth2Accessor38.clone();
        java.lang.String str40 = oAuth2Accessor38.tokenType;
        oAuth2ProblemException20.setParameter("scope", (java.lang.Object) str40);
        net.oauth.v2.OAuth2Exception oAuth2Exception42 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException20);
        oAuth2Accessor1.setProperty("#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2ProblemException20);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 200 + "'", int22 == 200);
        org.junit.Assert.assertNotNull(parameterArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(throwableArray35);
        org.junit.Assert.assertNotNull(oAuth2Accessor39);
        org.junit.Assert.assertNull(str40);
    }

    @Test
    public void test2383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2383");
        net.oauth.v2.OAuth2.Parameter[] parameterArray5 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList6 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, parameterArray5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream10 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream10);
        java.lang.String str12 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("invalid_client", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_client" + "'", str13, "invalid_client");
    }

    @Test
    public void test2384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2384");
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
        java.lang.Object obj28 = oAuth2Client3.getProperty("OAuth2Message(hi!, OAuth2Message(Authorization-Schesme=token_type, , []), [])");
        java.lang.String str29 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test2385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2385");
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
        java.lang.String str40 = oAuth2ProblemException1.toString();
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
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str40, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test2386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2386");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException26 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException26);
        int int28 = oAuth2ProblemException26.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception29 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException26.addSuppressed((java.lang.Throwable) oAuth2Exception29);
        java.util.Map<java.lang.String, java.lang.Object> strMap31 = oAuth2ProblemException26.getParameters();
        int int32 = oAuth2ProblemException26.getHttpStatusCode();
        java.lang.String str33 = oAuth2ProblemException26.getProblem();
        oAuth2ProblemException7.addSuppressed((java.lang.Throwable) oAuth2ProblemException26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 200 + "'", int28 == 200);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 200 + "'", int32 == 200);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!" + "'", str33, "hi!");
    }

    @Test
    public void test2387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2387");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "POST");
    }

    @Test
    public void test2388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2388");
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
        java.lang.String str17 = oAuth2Message5.method;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
    }

    @Test
    public void test2389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2389");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("error");
        java.lang.String str8 = parameter2.toString();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException10 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int11 = oAuth2ProblemException10.getHttpStatusCode();
        java.lang.String str12 = oAuth2ProblemException10.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray16 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList17 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17, parameterArray16);
        net.oauth.v2.OAuth2Message oAuth2Message19 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList17);
        oAuth2ProblemException10.setParameter("code", (java.lang.Object) parameterList17);
        net.oauth.v2.OAuth2Client oAuth2Client23 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor24 = new net.oauth.v2.OAuth2Accessor(oAuth2Client23);
        oAuth2Accessor24.refreshToken = "assertion";
        oAuth2ProblemException10.setParameter("error_description", (java.lang.Object) oAuth2Accessor24);
        oAuth2Accessor24.state = "code";
        java.lang.String str30 = oAuth2Accessor24.tokenType;
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList37 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str38 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList37);
        java.lang.String str39 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList37);
        net.oauth.v2.OAuth2Message oAuth2Message40 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList37);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList41 = oAuth2Message40.getParameters();
        oAuth2Message40.method = "DELETE";
        oAuth2Message40.completeParameters();
        java.lang.String str46 = oAuth2Message40.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap47 = oAuth2Message40.getParameterMap();
        oAuth2Accessor24.setProperty("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", (java.lang.Object) strMap47);
        boolean boolean49 = parameter2.equals((java.lang.Object) oAuth2Accessor24);
        java.lang.String str50 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=error" + "'", str8, "Authorization-Schesme=error");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNotNull(parameterList37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "unsupported_grant_type" + "'", str38, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "username" + "'", str39, "username");
        org.junit.Assert.assertNotNull(strEntryList41);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Authorization-Schesme=error" + "'", str50, "Authorization-Schesme=error");
    }

    @Test
    public void test2390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2390");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        oAuth2Accessor6.scope = "unsupported_response_type";
        oAuth2Accessor6.accessToken = "application%2Fx-www-form-urlencoded?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test2391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2391");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream6);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2392");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList19 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList19);
        java.lang.String str21 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList19);
        java.lang.String str22 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList19);
        java.lang.String str23 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList19);
        java.io.InputStream inputStream24 = null;
        net.oauth.v2.OAuth2Message oAuth2Message25 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList19, inputStream24);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList26 = oAuth2Message25.getParameters();
        oAuth2Accessor1.setProperty("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) strEntryList26);
        oAuth2Accessor1.state = "null%20%20realm%3D%22invalid_token%22=POST";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterList19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str21, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str22, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "refresh_token" + "'", str23, "refresh_token");
        org.junit.Assert.assertNotNull(strEntryList26);
    }

    @Test
    public void test2393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2393");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Accessor10.expires_in;
        java.lang.String str12 = oAuth2Accessor10.refreshToken;
        java.lang.String[] strArray23 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList24 = net.oauth.v2.OAuth2.newList(strArray23);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList25 = net.oauth.v2.OAuth2.newList(strArray23);
        java.lang.String str26 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray23);
        java.lang.String str27 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"unsupported_grant_type\"", strArray23);
        java.lang.String str28 = net.oauth.v2.OAuth2.addParameters("null  realm=\"2.0\"", strArray23);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList29 = net.oauth.v2.OAuth2.newList(strArray23);
        oAuth2Accessor10.setProperty("OAuth2Message(DELETE, client_id, [])", (java.lang.Object) strArray23);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strArray23);
        org.junit.Assert.assertNotNull(parameterList24);
        org.junit.Assert.assertNotNull(parameterList25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str26, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str28, "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList29);
    }

    @Test
    public void test2394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2394");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2ProblemException1.setParameter("OAuth2Message(hi!, GET, [])", (java.lang.Object) "HTTP status");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception6);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        java.lang.Throwable[] throwableArray9 = oAuth2Exception7.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception7);
        org.junit.Assert.assertNotNull(throwableArray9);
    }

    @Test
    public void test2395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2395");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int3 = oAuth2ProblemException2.getHttpStatusCode();
        java.lang.String str4 = oAuth2ProblemException2.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray8 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList9 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, parameterArray8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        oAuth2ProblemException2.setParameter("code", (java.lang.Object) parameterList9);
        java.lang.Throwable[] throwableArray14 = oAuth2ProblemException2.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception("application%2Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException19 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception20 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException19);
        net.oauth.v2.OAuth2Exception oAuth2Exception21 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException19.addSuppressed((java.lang.Throwable) oAuth2Exception21);
        net.oauth.v2.OAuth2Exception oAuth2Exception23 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception21);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException25 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception26 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException25);
        int int27 = oAuth2ProblemException25.getHttpStatusCode();
        oAuth2Exception23.addSuppressed((java.lang.Throwable) oAuth2ProblemException25);
        net.oauth.v2.OAuth2.Parameter[] parameterArray32 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList33 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList33, parameterArray32);
        net.oauth.v2.OAuth2Message oAuth2Message35 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList33);
        java.lang.String str37 = oAuth2Message35.getHeader("");
        java.lang.String str38 = oAuth2Message35.URL;
        oAuth2ProblemException25.setParameter("OAuth2Message(hi!, , [])", (java.lang.Object) str38);
        java.lang.Throwable[] throwableArray40 = oAuth2ProblemException25.getSuppressed();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException42 = new net.oauth.v2.OAuth2ProblemException("Location");
        oAuth2ProblemException25.addSuppressed((java.lang.Throwable) oAuth2ProblemException42);
        net.oauth.v2.OAuth2Exception oAuth2Exception44 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2ProblemException: unsupported_response_type", (java.lang.Throwable) oAuth2ProblemException25);
        oAuth2Exception15.addSuppressed((java.lang.Throwable) oAuth2Exception44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(throwableArray14);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(parameterArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(str37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(throwableArray40);
    }

    @Test
    public void test2396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2396");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
    }

    @Test
    public void test2397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2397");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream9 = null;
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("", "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?Authorization-Schesme=HTTP", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream9);
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test2398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2398");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.Object obj6 = null;
        boolean boolean7 = parameter2.equals(obj6);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int12 = oAuth2ProblemException11.getHttpStatusCode();
        java.lang.String str13 = oAuth2ProblemException11.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray17 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList18 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18, parameterArray17);
        net.oauth.v2.OAuth2Message oAuth2Message20 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        java.util.Map<java.lang.String, java.lang.String> strMap21 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        oAuth2ProblemException11.setParameter("code", (java.lang.Object) parameterList18);
        net.oauth.v2.OAuth2Message oAuth2Message23 = new net.oauth.v2.OAuth2Message("POST", "refresh_token", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList18);
        oAuth2Message23.method = "authorization_code";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList26 = oAuth2Message23.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = oAuth2Message23.getParameterMap();
        java.lang.String str28 = oAuth2Message23.URL;
        boolean boolean29 = parameter2.equals((java.lang.Object) oAuth2Message23);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList30 = oAuth2Message23.getParameters();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(parameterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strEntryList26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "refresh_token" + "'", str28, "refresh_token");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strEntryList30);
    }

    @Test
    public void test2399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2399");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"DELETE%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2400");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.String str7 = oAuth2Accessor1.state;
        oAuth2Accessor1.expires_in = "2.0";
        oAuth2Accessor1.scope = "Location?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2401");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("2.0", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2402");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.lang.String str10 = oAuth2Message8.getWWWAuthenticateHeader("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        java.lang.String str12 = oAuth2Message8.getHeader("PUT");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"" + "'", str10, "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2403");
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
        java.lang.String str21 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "unsupported_grant_type" + "'", str21, "unsupported_grant_type");
    }

    @Test
    public void test2404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2404");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10, 35, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
    }

    @Test
    public void test2405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2405");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException24 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception25 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException24);
        int int26 = oAuth2ProblemException24.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception27 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException24.addSuppressed((java.lang.Throwable) oAuth2Exception27);
        java.util.Map<java.lang.String, java.lang.Object> strMap29 = oAuth2ProblemException24.getParameters();
        oAuth2ProblemException8.addSuppressed((java.lang.Throwable) oAuth2ProblemException24);
        java.lang.String str31 = oAuth2ProblemException24.getProblem();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
    }

    @Test
    public void test2406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2406");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "invalid_request";
        oAuth2Accessor1.tokenType = "null%20%20realm%3D%22invalid_token%22=expires_in";
        java.lang.String str12 = oAuth2Accessor1.code;
        java.lang.String str13 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.scope = "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "invalid_request" + "'", str13, "invalid_request");
    }

    @Test
    public void test2407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2407");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream12 = null;
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("application%2Fx-www-form-urlencoded", "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream12);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("client_credentials=application%252Fx-www-form-urlencoded", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response" + "'", str11, "HTTP response");
    }

    @Test
    public void test2408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2408");
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
        java.lang.String str21 = oAuth2Accessor9.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor16);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2409");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor1.clone();
        java.lang.String str8 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test2410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2410");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        int int14 = oAuth2ProblemException12.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = oAuth2ProblemException12.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client17 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        oAuth2Accessor18.refreshToken = "assertion";
        java.lang.String str21 = oAuth2Accessor18.state;
        oAuth2ProblemException12.setParameter("error_uri", (java.lang.Object) oAuth2Accessor18);
        oAuth2Accessor9.setProperty("null  realm=\"invalid_token\"", (java.lang.Object) oAuth2Accessor18);
        java.lang.String str24 = oAuth2Accessor9.state;
        java.lang.Object obj26 = oAuth2Accessor9.getProperty("net.oauth.v2.OAuth2Exception: invalid_scope");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(obj26);
    }

    @Test
    public void test2411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2411");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"HTTP%20response%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"", "", "access_denied");
        java.lang.Object obj5 = null;
        oAuth2Client3.setProperty("", obj5);
        java.lang.Object obj8 = oAuth2Client3.getProperty("OAuth2Message%28Authorization-Schesme%3Dtoken_type%2C%20%2C%20%5B%5D%29");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2412");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("password", "null  realm=\"password\"", "assertion_type");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj8 = oAuth2Accessor6.getProperty("null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"");
        oAuth2Accessor6.code = "null  realm=\"hi%21\"";
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null  realm=\"password\"" + "'", str5, "null  realm=\"password\"");
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test2413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2413");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        java.lang.String str9 = oAuth2Accessor1.code;
        java.lang.String str10 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test2414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2414");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        net.oauth.v2.OAuth2Client oAuth2Client8 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client10 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client10);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor12 = oAuth2Accessor11.clone();
        oAuth2Client8.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor12);
        java.lang.String str14 = oAuth2Client8.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException17 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception18 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException17);
        net.oauth.v2.OAuth2Exception oAuth2Exception19 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException17.addSuppressed((java.lang.Throwable) oAuth2Exception19);
        oAuth2Client8.setProperty("authorization_code", (java.lang.Object) oAuth2Exception19);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client8);
        net.oauth.v2.OAuth2Client oAuth2Client23 = oAuth2Accessor22.client;
        net.oauth.v2.OAuth2.Parameter[] parameterArray27 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList28 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28, parameterArray27);
        net.oauth.v2.OAuth2Message oAuth2Message30 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str32 = oAuth2Message30.getHeader("");
        java.lang.String str33 = oAuth2Message30.getClientId();
        oAuth2Message30.URL = "access_token";
        java.lang.String str36 = oAuth2Message30.getClientId();
        oAuth2Accessor22.setProperty("HTTP request", (java.lang.Object) oAuth2Message30);
        boolean boolean38 = parameter2.equals((java.lang.Object) oAuth2Accessor22);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertNotNull(oAuth2Accessor12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str14, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertNotNull(parameterArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test2415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2415");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList5 = oAuth2Message4.getParameters();
        java.lang.String str6 = oAuth2Message4.getCode();
        java.lang.String str8 = oAuth2Message4.getWWWAuthenticateHeader("Authorization-Schesme=access_token");
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strEntryList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "null  realm=\"Authorization-Schesme%3Daccess_token\"" + "'", str8, "null  realm=\"Authorization-Schesme%3Daccess_token\"");
    }

    @Test
    public void test2416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2416");
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
        oAuth2Accessor19.state = "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        java.lang.String str22 = oAuth2Accessor19.accessToken;
        net.oauth.v2.OAuth2Client oAuth2Client23 = oAuth2Accessor19.client;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(oAuth2Client23);
    }

    @Test
    public void test2417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2417");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException12 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException12);
        int int14 = oAuth2ProblemException12.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap15 = oAuth2ProblemException12.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client17 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor18 = new net.oauth.v2.OAuth2Accessor(oAuth2Client17);
        oAuth2Accessor18.refreshToken = "assertion";
        java.lang.String str21 = oAuth2Accessor18.state;
        oAuth2ProblemException12.setParameter("error_uri", (java.lang.Object) oAuth2Accessor18);
        oAuth2Accessor9.setProperty("null  realm=\"invalid_token\"", (java.lang.Object) oAuth2Accessor18);
        oAuth2Accessor9.state = "null  realm=\"hi%21%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test2418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2418");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.refreshToken = "net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str11 = oAuth2Accessor1.state;
        java.lang.String str12 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2419");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.scope = "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test2420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2420");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.accessToken;
        net.oauth.v2.OAuth2.Parameter[] parameterArray11 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList12 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12, parameterArray11);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str17 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        oAuth2Message18.completeParameters();
        oAuth2Accessor2.setProperty("OAuth2Message%28HTTP%20response%2C%20GET%2C%20%5B%5D%29=net.oauth.v2.OAuth2Exception%3A%20null%20%20realm%3D%22redirect_uri_mismatch%22", (java.lang.Object) oAuth2Message18);
        oAuth2Accessor2.refreshToken = "OAuth2Message%28POST%2C%20access_token%2C%20%5B%5D%29";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2421");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2Exception%3A%20invalid_request\"", "OAuth2Message(HTTP request, , [])", "net.oauth.v2.OAuth2Exception: null  realm=\"redirect_uri_mismatch\"");
    }

    @Test
    public void test2422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2422");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList14 = oAuth2Message5.getHeaders();
        java.lang.String str16 = oAuth2Message5.getHeader("OAuth2Message(, token_type, [])");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2423");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException1.getSuppressed();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException1.getParameters();
        java.lang.Object obj9 = null;
        oAuth2ProblemException1.setParameter("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", obj9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test2424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2424");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("none=invalid_client");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none=invalid_client" + "'", str1, "none=invalid_client");
    }

    @Test
    public void test2425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2425");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("PUT", "unsupported_grant_type");
        java.lang.String str4 = parameter2.setValue("error_description");
        net.oauth.v2.OAuth2.Parameter parameter7 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str8 = parameter7.toString();
        java.lang.String str9 = parameter7.getKey();
        java.lang.String str10 = parameter7.getValue();
        boolean boolean11 = parameter2.equals((java.lang.Object) str10);
        net.oauth.v2.OAuth2.Parameter[] parameterArray14 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList15 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15, parameterArray14);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList15);
        java.lang.String str19 = oAuth2Message17.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = oAuth2Message17.getHeaders();
        java.lang.String str21 = oAuth2Message17.URL;
        boolean boolean22 = parameter2.equals((java.lang.Object) str21);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_grant_type" + "'", str4, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme" + "'", str9, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "token_type" + "'", str10, "token_type");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parameterArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strEntryList20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test2426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2426");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        java.lang.String str11 = oAuth2Message5.getClientId();
        java.lang.String str12 = oAuth2Message5.URL;
        java.lang.String str13 = oAuth2Message5.URL;
        java.lang.String str14 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "access_token" + "'", str12, "access_token");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "access_token" + "'", str13, "access_token");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "OAuth2Message(hi!, access_token, [])" + "'", str14, "OAuth2Message(hi!, access_token, [])");
    }

    @Test
    public void test2427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2427");
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
        java.lang.String str17 = oAuth2Message8.getCode();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2428");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[79, 65, 117, 116, 104, 50, 77, 101, 115, 115, 97, 103, 101, 40, 104, 105, 33, 44, 32, 44, 32, 91, 93, 41]");
    }

    @Test
    public void test2429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2429");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"null%20%20realm%3D%22OAuth2Message%2528scope%252C%2520DELETE%252C%2520%255B%255D%2529%22\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22null%2520%2520realm%253D%2522OAuth2Message%252528scope%25252C%252520DELETE%25252C%252520%25255B%25255D%252529%2522%22" + "'", str1, "null%20%20realm%3D%22null%2520%2520realm%253D%2522OAuth2Message%252528scope%25252C%252520DELETE%25252C%252520%25255B%25255D%252529%2522%22");
    }

    @Test
    public void test2430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2430");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = oAuth2Message8.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test2431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2431");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.tokenType = "Authorization-Schesme=refresh_token";
        java.lang.String str9 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.expires_in = "state";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2432");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList17 = oAuth2Message12.getHeaders();
        oAuth2Message12.method = "PUT";
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNotNull(strEntryList17);
    }

    @Test
    public void test2433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2433");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"none%3DUTF-8\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22none%253DUTF-8%22" + "'", str1, "null%20%20realm%3D%22none%253DUTF-8%22");
    }

    @Test
    public void test2434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2434");
        net.oauth.v2.OAuth2Client oAuth2Client5 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client7 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = new net.oauth.v2.OAuth2Accessor(oAuth2Client7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = oAuth2Accessor8.clone();
        oAuth2Client5.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor9);
        java.lang.String str11 = oAuth2Client5.clientSecret;
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException14 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception15 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException14);
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception16);
        oAuth2Client5.setProperty("authorization_code", (java.lang.Object) oAuth2Exception16);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor19 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        java.lang.String str20 = oAuth2Client5.clientId;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor21 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2.Parameter[] parameterArray27 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList28 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28, parameterArray27);
        net.oauth.v2.OAuth2Message oAuth2Message30 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.util.Map<java.lang.String, java.lang.String> strMap31 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str32 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str33 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        net.oauth.v2.OAuth2Message oAuth2Message34 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.util.Map<java.lang.String, java.lang.String> strMap35 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        oAuth2Accessor21.setProperty("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) parameterList28);
        java.lang.String str38 = net.oauth.v2.OAuth2.addParameters("null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        java.lang.String str39 = net.oauth.v2.OAuth2.addParametersAsFragment("Authorization-Schesme=access_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList28);
        org.junit.Assert.assertNotNull(oAuth2Accessor9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str11, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "token_type" + "'", str20, "token_type");
        org.junit.Assert.assertNotNull(parameterArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str38, "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Authorization-Schesme=access_token" + "'", str39, "Authorization-Schesme=access_token");
    }

    @Test
    public void test2435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2435");
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
        net.oauth.v2.OAuth2.Parameter[] parameterArray24 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList25 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25, parameterArray24);
        net.oauth.v2.OAuth2Message oAuth2Message27 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        net.oauth.v2.OAuth2Message oAuth2Message28 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        java.lang.String str29 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList25);
        oAuth2Client7.setProperty("null  realm=\"\"", (java.lang.Object) str29);
        java.lang.String str31 = oAuth2Client7.clientSecret;
        java.lang.String str32 = oAuth2Client7.clientSecret;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertNotNull(parameterArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str31, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str32, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test2436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2436");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str6 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Authorization-Schesme=token_type" + "'", str6, "Authorization-Schesme=token_type");
    }

    @Test
    public void test2437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2437");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2Exception8);
    }

    @Test
    public void test2438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2438");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2439");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream7);
        java.io.OutputStream outputStream9 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream9);
        java.util.Map<java.lang.String, java.lang.String> strMap11 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_grant_type" + "'", str4, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "username" + "'", str5, "username");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(strMap12);
    }

    @Test
    public void test2440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2440");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("grant_type");
        java.io.InputStream inputStream4 = null;
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("OAuth2Message(hi!, GET, [])", "none", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, inputStream4);
        java.lang.String str6 = oAuth2Message5.toString();
        oAuth2Message5.URL = "net.oauth.v2.OAuth2Exception=HTTP%20status";
        java.lang.String str9 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])" + "'", str6, "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(OAuth2Message(hi!, GET, []), net.oauth.v2.OAuth2Exception=HTTP%20status, [])" + "'", str9, "OAuth2Message(OAuth2Message(hi!, GET, []), net.oauth.v2.OAuth2Exception=HTTP%20status, [])");
    }

    @Test
    public void test2441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2441");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2ProblemException1.setParameter("OAuth2Message(hi!, GET, [])", (java.lang.Object) "HTTP status");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        java.lang.Throwable[] throwableArray8 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray8);
    }

    @Test
    public void test2442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2442");
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
        java.lang.String str28 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.code = "null  realm=\"expires_in%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str27, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test2443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2443");
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
        java.lang.String str16 = oAuth2Accessor10.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "GET" + "'", str14, "GET");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test2444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2444");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream7 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream7);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "OAuth2Message(2.0, UTF-8, [])", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        java.io.OutputStream outputStream13 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream13);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test2445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2445");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: client_id", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "null%20%20realm%3D%22invalid_token%22=expires_in#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.lang.String str17 = oAuth2Message15.getHeader("");
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2446");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException7 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        oAuth2Exception4.addSuppressed((java.lang.Throwable) oAuth2ProblemException7);
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException7);
        java.lang.String str10 = oAuth2ProblemException7.getProblem();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_token" + "'", str10, "invalid_token");
    }

    @Test
    public void test2447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2447");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = oAuth2Message9.URL;
        java.lang.String str11 = oAuth2Message9.toString();
        java.lang.String str12 = oAuth2Message9.method;
        oAuth2Message9.method = "application%2Fx-www-form-urlencoded?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "GET" + "'", str10, "GET");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(HTTP response, GET, [])" + "'", str11, "OAuth2Message(HTTP response, GET, [])");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HTTP response" + "'", str12, "HTTP response");
    }

    @Test
    public void test2448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2448");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str11 = oAuth2Message5.getHeader("error_uri");
        java.lang.String str12 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test2449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2449");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("net.oauth.v2.OAuth2Exception=HTTP%20status", "HTTP%20status", "OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj6 = oAuth2Client3.getProperty("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test2450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2450");
        java.lang.String[] strArray5 = new java.lang.String[] {};
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("access_token", strArray5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT", strArray5);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParameters("null  realm=\"\"", strArray5);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_token" + "'", str7, "access_token");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT" + "'", str8, "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=PUT");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"\"" + "'", str9, "null  realm=\"\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22" + "'", str10, "null%20%20realm%3D%22net.oauth.v2.OAuth2Exception%253A%2520net.oauth.v2.OAuth2Exception%253A%2520invalid_request%22");
    }

    @Test
    public void test2451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2451");
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
        java.lang.String str19 = oAuth2Accessor17.scope;
        java.lang.String str20 = oAuth2Accessor17.state;
        java.lang.Object obj22 = oAuth2Accessor17.getProperty("OAuth2Message(POST, access_token, [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNull(obj22);
    }

    @Test
    public void test2452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2452");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "GET";
        oAuth2Accessor1.scope = "#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str16 = oAuth2Accessor1.code;
        oAuth2Accessor1.code = "unsupported_grant_type";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(oAuth2Client11);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2453");
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
        java.lang.String str16 = oAuth2Accessor15.code;
        java.lang.String str17 = oAuth2Accessor15.refreshToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test2454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2454");
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
        java.util.Map<java.lang.String, java.lang.String> strMap35 = oAuth2Message32.getParameterMap();
        java.lang.String str36 = oAuth2Message32.URL;
        java.lang.String str38 = oAuth2Message32.getHeader("Authorization-Schesme");
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
        org.junit.Assert.assertNotNull(strMap35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DELETE" + "'", str36, "DELETE");
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test2455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2455");
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
        oAuth2Accessor1.accessToken = "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "HTTP request" + "'", str14, "HTTP request");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test2456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2456");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"net.oauth.v2.OAuth2Exception%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test2457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2457");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("HTTP request", "invalid_request", "HTTP request");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor4 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str5 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "HTTP request" + "'", str5, "HTTP request");
    }

    @Test
    public void test2458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2458");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getHeaders();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test2459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2459");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        oAuth2ProblemException0.setParameter("application%252Fx-www-form-urlencoded", (java.lang.Object) "Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception16 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException0);
        java.util.Map<java.lang.String, java.lang.Object> strMap17 = oAuth2ProblemException0.getParameters();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test2460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2460");
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
        oAuth2Accessor1.tokenType = "null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
    }

    @Test
    public void test2461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2461");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str6 = oAuth2Message4.getHeader("response_type");
        oAuth2Message4.method = "null  realm=\"unsupported_grant_type\"#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str10 = oAuth2Message4.getHeader("null  realm=\"code_and_token\"");
        java.lang.String str11 = oAuth2Message4.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message4.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message4.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "UTF-8" + "'", str11, "UTF-8");
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test2462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2462");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException1.getProblem();
        java.lang.String str7 = oAuth2ProblemException1.getProblem();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
    }

    @Test
    public void test2463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2463");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.OutputStream outputStream11 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9, outputStream11);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("token_type", "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream13);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2ProblemException%3A%20hi%21\"", "net.oauth.v2.OAuth2ProblemException: error_uri", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("net.oauth.v2.OAuth2ProblemException: access_denied", "null  realm=\"null%20%20realm%3D%22null%2520%2520realm%253D%25222.0%2522%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%2526net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer%22\"?Authorization-Schesme=token_type&Authorization-Schesme=token_type&null%20%20realm%3D%22password%22=OAuth2Message%28refresh_token%2C%20application%2Fx-www-form-urlencoded%2C%20%5B%5D%29", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        org.junit.Assert.assertNotNull(parameterList9);
    }

    @Test
    public void test2464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2464");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception13 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception12);
        net.oauth.v2.OAuth2Exception oAuth2Exception14 = new net.oauth.v2.OAuth2Exception("code_and_token", (java.lang.Throwable) oAuth2Exception13);
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2Exception14);
        oAuth2Exception5.addSuppressed((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception17 = new net.oauth.v2.OAuth2Exception("OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])", (java.lang.Throwable) oAuth2Exception5);
    }

    @Test
    public void test2465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2465");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.accessToken;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("");
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.state = "none";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2466");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.getValue();
        java.lang.String str5 = parameter2.toString();
        java.lang.String str7 = parameter2.setValue("access_token");
        java.lang.String str9 = parameter2.setValue("HTTP%20request");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "POST" + "'", str4, "POST");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str5, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "POST" + "'", str7, "POST");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "access_token" + "'", str9, "access_token");
    }

    @Test
    public void test2467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2467");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, inputStream15);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParameters("null  realm=\"invalid_token\"=expires_in", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str18 = net.oauth.v2.OAuth2.addParameters("null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str12, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "refresh_token" + "'", str14, "refresh_token");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "null  realm=\"invalid_token\"=expires_in" + "'", str17, "null  realm=\"invalid_token\"=expires_in");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "null  realm=\"POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id\"&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test2468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2468");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor1.clone();
        java.lang.String str9 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2469");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        oAuth2Accessor1.tokenType = "URL";
        net.oauth.v2.OAuth2Client oAuth2Client7 = oAuth2Accessor1.client;
        net.oauth.v2.OAuth2Client oAuth2Client8 = oAuth2Accessor1.client;
        oAuth2Accessor1.code = "net.oauth.v2.OAuth2ProblemException%3A%20hi%21=";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client7);
        org.junit.Assert.assertNull(oAuth2Client8);
    }

    @Test
    public void test2470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2470");
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
        oAuth2Accessor1.tokenType = "client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21";
        java.lang.String str19 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test2471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2471");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream7 = null;
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream7);
        java.lang.String str10 = oAuth2Message8.getWWWAuthenticateHeader("unauthorized_client%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        oAuth2Message8.method = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"" + "'", str10, "null  realm=\"unauthorized_client%253Fnet.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
    }
}

