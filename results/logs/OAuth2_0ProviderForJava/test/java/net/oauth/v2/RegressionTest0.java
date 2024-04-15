package net.oauth.v2;

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
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.UNSUPPORTED_GRANT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unsupported_grant_type" + "'", str0, "unsupported_grant_type");
    }

    @Test
    public void test0002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0002");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.ACCESS_DENIED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "access_denied" + "'", str0, "access_denied");
    }

    @Test
    public void test0003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0003");
        java.lang.String str0 = net.oauth.v2.BaseTokenType.BEARER;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "bearer" + "'", str0, "bearer");
    }

    @Test
    public void test0004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0004");
        java.lang.String str0 = net.oauth.v2.OAuth2.ASSERTION_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "assertion_type" + "'", str0, "assertion_type");
    }

    @Test
    public void test0005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0005");
        java.lang.String str0 = net.oauth.v2.OAuth2.USERNAME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "username" + "'", str0, "username");
    }

    @Test
    public void test0006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0006");
        java.lang.String str0 = net.oauth.v2.BaseResponseType.CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "code" + "'", str0, "code");
    }

    @Test
    public void test0007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0007");
        java.lang.String str0 = net.oauth.v2.BaseGrantType.REFRESH_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "refresh_token" + "'", str0, "refresh_token");
    }

    @Test
    public void test0008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0008");
        java.lang.String str0 = net.oauth.v2.OAuth2.EXPIRES_IN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "expires_in" + "'", str0, "expires_in");
    }

    @Test
    public void test0009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0009");
        java.lang.String str0 = net.oauth.v2.OAuth2ProblemException.HTTP_RESPONSE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HTTP response" + "'", str0, "HTTP response");
    }

    @Test
    public void test0010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0010");
        java.lang.String str0 = net.oauth.v2.OAuth2.SCOPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "scope" + "'", str0, "scope");
    }

    @Test
    public void test0011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0011");
        net.oauth.v2.OAuth2Exception oAuth2Exception0 = new net.oauth.v2.OAuth2Exception();
        java.lang.String str1 = oAuth2Exception0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception" + "'", str1, "net.oauth.v2.OAuth2Exception");
    }

    @Test
    public void test0012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0012");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.UNAUTHORIZED_CLIENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unauthorized_client" + "'", str0, "unauthorized_client");
    }

    @Test
    public void test0013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0013");
        java.lang.String str0 = net.oauth.v2.OAuth2.CLIENT_ID;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "client_id" + "'", str0, "client_id");
    }

    @Test
    public void test0014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0014");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.INVALID_SCOPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invalid_scope" + "'", str0, "invalid_scope");
    }

    @Test
    public void test0015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0015");
        net.oauth.v2.BaseGrantType baseGrantType0 = null;
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
    }

    @Test
    public void test0016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0016");
        java.lang.String str0 = net.oauth.v2.OAuth2.ASSERTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "assertion" + "'", str0, "assertion");
    }

    @Test
    public void test0017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0017");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("client_id");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0018");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "hi!" + "'", str1, "hi!");
    }

    @Test
    public void test0019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0019");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("unauthorized_client");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0020");
        java.lang.String str0 = net.oauth.v2.OAuth2.PASSWORD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test0021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0021");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("access_denied");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "access_denied" + "'", str1, "access_denied");
    }

    @Test
    public void test0022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0022");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("\ufffd\n");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0023");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("assertion_type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "assertion_type" + "'", str1, "assertion_type");
    }

    @Test
    public void test0024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0024");
        net.oauth.v2.BaseGrantType baseGrantType0 = null;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
    }

    @Test
    public void test0025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0025");
        java.lang.String str0 = net.oauth.v2.OAuth2Message.DELETE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "DELETE" + "'", str0, "DELETE");
    }

    @Test
    public void test0026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0026");
        java.lang.String str0 = net.oauth.v2.OAuth2.RESPONSE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "response_type" + "'", str0, "response_type");
    }

    @Test
    public void test0027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0027");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.INVALID_GRANT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invalid_grant" + "'", str0, "invalid_grant");
    }

    @Test
    public void test0028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0028");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.UNSUPPORTED_RESPONSE_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "unsupported_response_type" + "'", str0, "unsupported_response_type");
    }

    @Test
    public void test0029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0029");
        java.lang.String str0 = net.oauth.v2.OAuth2ProblemException.URL;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "URL" + "'", str0, "URL");
    }

    @Test
    public void test0030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0030");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.INVALID_CLIENT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invalid_client" + "'", str0, "invalid_client");
    }

    @Test
    public void test0031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0031");
        java.lang.String str0 = net.oauth.v2.OAuth2.ACCESS_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "access_token" + "'", str0, "access_token");
    }

    @Test
    public void test0032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0032");
        java.lang.String str0 = net.oauth.v2.OAuth2.REFRESH_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "refresh_token" + "'", str0, "refresh_token");
    }

    @Test
    public void test0033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0033");
        java.lang.String str0 = net.oauth.v2.OAuth2.ENCODING;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "UTF-8" + "'", str0, "UTF-8");
    }

    @Test
    public void test0034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0034");
        net.oauth.v2.OAuth2 oAuth2_0 = new net.oauth.v2.OAuth2();
    }

    @Test
    public void test0035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0035");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.REDIRECT_URI_MISMATCH;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "redirect_uri_mismatch" + "'", str0, "redirect_uri_mismatch");
    }

    @Test
    public void test0036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0036");
        java.lang.String str0 = net.oauth.v2.BaseGrantType.NONE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "none" + "'", str0, "none");
    }

    @Test
    public void test0037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0037");
        java.lang.String str0 = net.oauth.v2.OAuth2Message.PUT;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "PUT" + "'", str0, "PUT");
    }

    @Test
    public void test0038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0038");
        java.lang.String str0 = net.oauth.v2.OAuth2.VERSION_2_0;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "2.0" + "'", str0, "2.0");
    }

    @Test
    public void test0039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0039");
        java.lang.String str0 = net.oauth.v2.OAuth2.STATE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "state" + "'", str0, "state");
    }

    @Test
    public void test0040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0040");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.INVALID_REQUEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invalid_request" + "'", str0, "invalid_request");
    }

    @Test
    public void test0041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0041");
        java.lang.String str0 = net.oauth.v2.OAuth2Message.AUTH_SCHEME;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Authorization-Schesme" + "'", str0, "Authorization-Schesme");
    }

    @Test
    public void test0042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0042");
        java.lang.String str0 = net.oauth.v2.OAuth2.TOKEN_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "token_type" + "'", str0, "token_type");
    }

    @Test
    public void test0043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0043");
        java.lang.String str0 = net.oauth.v2.BaseGrantType.PASSWORD;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "password" + "'", str0, "password");
    }

    @Test
    public void test0044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0044");
        java.lang.String[] strArray6 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray6);
        java.lang.Class<?> wildcardClass8 = parameterList7.getClass();
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test0045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0045");
        java.lang.String str0 = net.oauth.v2.OAuth2.ERROR;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error" + "'", str0, "error");
    }

    @Test
    public void test0046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0046");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable1 = null;
        java.lang.String str2 = net.oauth.v2.OAuth2.addParametersAsFragment("access_denied", parameterIterable1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "access_denied" + "'", str2, "access_denied");
    }

    @Test
    public void test0047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0047");
        java.lang.String str0 = net.oauth.v2.OAuth2.ERROR_DESCRIPTION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error_description" + "'", str0, "error_description");
    }

    @Test
    public void test0048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0048");
        java.lang.String str0 = net.oauth.v2.OAuth2ProblemException.HTTP_STATUS_CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HTTP status" + "'", str0, "HTTP status");
    }

    @Test
    public void test0049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0049");
        java.lang.String str0 = net.oauth.v2.OAuth2.CLIENT_SECRET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "client_secret" + "'", str0, "client_secret");
    }

    @Test
    public void test0050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0050");
        java.lang.String str0 = net.oauth.v2.BaseResponseType.CODE_AND_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "code_and_token" + "'", str0, "code_and_token");
    }

    @Test
    public void test0051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0051");
        java.lang.String str0 = net.oauth.v2.BaseGrantType.AUTHORIZATION_CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "authorization_code" + "'", str0, "authorization_code");
    }

    @Test
    public void test0052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0052");
        java.lang.String str0 = net.oauth.v2.OAuth2ProblemException.HTTP_REQUEST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "HTTP request" + "'", str0, "HTTP request");
    }

    @Test
    public void test0053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0053");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray2);
        java.lang.Class<?> wildcardClass4 = byteArray2.getClass();
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\n" + "'", str3, "\ufffd\n");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0054");
        java.lang.String str0 = net.oauth.v2.OAuth2.CODE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "code" + "'", str0, "code");
    }

    @Test
    public void test0055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0055");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable1 = null;
        java.lang.String str2 = net.oauth.v2.OAuth2.addParametersAsFragment("", parameterIterable1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0056");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "bearer" + "'", str1, "bearer");
    }

    @Test
    public void test0057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0057");
        java.lang.String str0 = net.oauth.v2.OAuth2Message.POST;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "POST" + "'", str0, "POST");
    }

    @Test
    public void test0058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0058");
        java.lang.String str0 = net.oauth.v2.OAuth2Message.GET;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "GET" + "'", str0, "GET");
    }

    @Test
    public void test0059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0059");
        java.lang.String[] strArray6 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertNotNull(parameterList7);
    }

    @Test
    public void test0060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0060");
        java.util.Map<java.lang.String, java.lang.Integer> strMap0 = net.oauth.v2.BaseErrorCode.TO_HTTP_CODE;
        org.junit.Assert.assertNotNull(strMap0);
    }

    @Test
    public void test0061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0061");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("GET");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "GET" + "'", str1, "GET");
    }

    @Test
    public void test0062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0062");
        java.lang.String str0 = net.oauth.v2.OAuth2.GRANT_TYPE;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "grant_type" + "'", str0, "grant_type");
    }

    @Test
    public void test0063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0063");
        java.lang.String str0 = net.oauth.v2.BaseResponseType.TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "token" + "'", str0, "token");
    }

    @Test
    public void test0064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0064");
        java.lang.String str0 = net.oauth.v2.OAuth2.ERROR_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "error_uri" + "'", str0, "error_uri");
    }

    @Test
    public void test0065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0065");
        java.lang.String str0 = net.oauth.v2.OAuth2ProblemException.HTTP_LOCATION;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "Location" + "'", str0, "Location");
    }

    @Test
    public void test0066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0066");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("error_uri");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "error_uri" + "'", str1, "error_uri");
    }

    @Test
    public void test0067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0067");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0068");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("access_token");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "access_token" + "'", str1, "access_token");
    }

    @Test
    public void test0069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0069");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        java.lang.String str3 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str3, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0070");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        java.lang.Class<?> wildcardClass3 = oAuth2ProblemException0.getClass();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0071");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("authorization_code");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "authorization_code" + "'", str1, "authorization_code");
    }

    @Test
    public void test0072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0072");
        java.lang.String str0 = net.oauth.v2.BaseErrorCode.INVALID_TOKEN;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "invalid_token" + "'", str0, "invalid_token");
    }

    @Test
    public void test0073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0073");
        java.lang.String str0 = net.oauth.v2.OAuth2.FORM_ENCODED;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "application/x-www-form-urlencoded" + "'", str0, "application/x-www-form-urlencoded");
    }

    @Test
    public void test0074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0074");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("Authorization-Schesme");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[65, 117, 116, 104, 111, 114, 105, 122, 97, 116, 105, 111, 110, 45, 83, 99, 104, 101, 115, 109, 101]");
    }

    @Test
    public void test0075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0075");
        java.lang.String str0 = net.oauth.v2.BaseGrantType.CLIENT_CREDENTIALS;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "client_credentials" + "'", str0, "client_credentials");
    }

    @Test
    public void test0076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0076");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        java.lang.String str12 = oAuth2ProblemException8.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str12, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0077");
        java.lang.Throwable throwable1 = null;
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("URL", throwable1);
    }

    @Test
    public void test0078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0078");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("invalid_scope");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0079");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("username");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "username" + "'", str1, "username");
    }

    @Test
    public void test0080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0080");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("net.oauth.v2.OAuth2Exception");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("token_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "token_type" + "'", str3, "token_type");
    }

    @Test
    public void test0081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0081");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception3.getSuppressed();
        java.lang.Throwable throwable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            oAuth2Exception3.addSuppressed(throwable6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(throwableArray5);
    }

    @Test
    public void test0082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0082");
        java.lang.String str0 = net.oauth.v2.OAuth2.REDIRECT_URI;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "redirect_uri" + "'", str0, "redirect_uri");
    }

    @Test
    public void test0083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0083");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.lang.String str1 = oAuth2ProblemException0.getProblem();
        net.oauth.v2.OAuth2.Parameter parameter5 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str7 = parameter5.setValue("scope");
        oAuth2ProblemException0.setParameter("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) str7);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
    }

    @Test
    public void test0084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0084");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.scope = "GET";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0085");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable1 = null;
        java.lang.String str2 = net.oauth.v2.OAuth2.addParameters("Authorization-Schesme", parameterIterable1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Authorization-Schesme" + "'", str2, "Authorization-Schesme");
    }

    @Test
    public void test0086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0086");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("2.0");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap10 = oAuth2ProblemException9.getParameters();
        java.lang.Throwable[] throwableArray11 = oAuth2ProblemException9.getSuppressed();
        oAuth2Accessor1.setProperty("UTF-8", (java.lang.Object) throwableArray11);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(throwableArray11);
    }

    @Test
    public void test0087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0087");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.getCode();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0088");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("authorization_code");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0089");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0090");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        java.lang.Class<?> wildcardClass3 = baseResponseType0.getClass();
        org.junit.Assert.assertNotNull(baseResponseType0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0091");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("error", "GET");
    }

    @Test
    public void test0092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0092");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "redirect_uri";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test0093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0093");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("error_uri");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "error_uri" + "'", str1, "error_uri");
    }

    @Test
    public void test0094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0094");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray9);
        java.lang.Class<?> wildcardClass14 = strArray9.getClass();
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test0095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0095");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("response_type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "response_type" + "'", str1, "response_type");
    }

    @Test
    public void test0096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0096");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        oAuth2ProblemException1.setParameter("net.oauth.v2.OAuth2Exception", (java.lang.Object) "username");
        java.lang.String str6 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str6, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0097");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.lang.String str10 = oAuth2Message8.method;
        oAuth2Message8.method = "refresh_token";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0098");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        oAuth2ProblemException1.setParameter("\ufffd\n", (java.lang.Object) 0L);
        java.lang.String str6 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str6, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0099");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.tokenType = "OAuth2Message(hi!, GET, [])";
        java.lang.Object obj9 = oAuth2Accessor1.getProperty("hi!");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(obj9);
    }

    @Test
    public void test0100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0100");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message5.getParameterMap();
        java.lang.String str10 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0101");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0102");
        net.oauth.v2.BaseTokenType baseTokenType0 = new net.oauth.v2.BaseTokenType();
    }

    @Test
    public void test0103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0103");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable0 = null;
        java.lang.String str1 = net.oauth.v2.OAuth2.formEncode(parameterIterable0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0104");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0105");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0106");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0107");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.Class<?> wildcardClass13 = oAuth2Client3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0108");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "client_id";
        oAuth2Accessor1.state = "application/x-www-form-urlencoded";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
    }

    @Test
    public void test0109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0109");
        byte[] byteArray0 = new byte[] {};
        java.lang.String str1 = net.oauth.v2.OAuth2.decodeCharacters(byteArray0);
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray0);
        org.junit.Assert.assertNotNull(byteArray0);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray0), "[]");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0110");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("HTTP request", "application/x-www-form-urlencoded", "authorization_code");
    }

    @Test
    public void test0111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0111");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.Class<?> wildcardClass2 = oAuth2ProblemException1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test0112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0112");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.Class<?> wildcardClass6 = oAuth2Accessor1.getClass();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0113");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("scope");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[115, 99, 111, 112, 101]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "scope" + "'", str2, "scope");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "scope" + "'", str3, "scope");
    }

    @Test
    public void test0114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0114");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("POST");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "POST" + "'", str1, "POST");
    }

    @Test
    public void test0115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0115");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("HTTP response");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0116");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.toString();
        java.lang.Class<?> wildcardClass4 = parameter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str3, "null%20%20realm%3D%22invalid_token%22=POST");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0117");
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
        java.lang.String str14 = oAuth2Message5.getHeader("HTTP request");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0118");
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
        java.lang.Object obj18 = oAuth2Client3.getProperty("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj18);
    }

    @Test
    public void test0119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0119");
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
        java.lang.Object obj19 = oAuth2Accessor17.getProperty("");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0120");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.io.OutputStream outputStream8 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
    }

    @Test
    public void test0121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0121");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable1 = null;
        java.lang.String str2 = net.oauth.v2.OAuth2.addParameters("", parameterIterable1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0122");
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
        java.lang.Throwable[] throwableArray33 = oAuth2Exception32.getSuppressed();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNotNull(throwableArray33);
    }

    @Test
    public void test0123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0123");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("client_credentials");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "client_credentials" + "'", str1, "client_credentials");
    }

    @Test
    public void test0124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0124");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "HTTP request" + "'", str7, "HTTP request");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "client_credentials" + "'", str8, "client_credentials");
    }

    @Test
    public void test0125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0125");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0126");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("null  realm=\"unsupported_grant_type\"");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0127");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0128");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("PUT");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PUT" + "'", str1, "PUT");
    }

    @Test
    public void test0129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0129");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "application%2Fx-www-form-urlencoded" + "'", str1, "application%2Fx-www-form-urlencoded");
    }

    @Test
    public void test0130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0130");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap27 = oAuth2ProblemException8.getParameters();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(throwableArray23);
        org.junit.Assert.assertNotNull(strMap27);
    }

    @Test
    public void test0131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0131");
        net.oauth.v2.OAuth2.Parameter[] parameterArray5 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList6 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6, parameterArray5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0132");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        oAuth2Accessor1.expires_in = "authorization_code";
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0133");
        net.oauth.v2.BaseGrantType baseGrantType0 = net.oauth.v2.OAuth2.GrantType;
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.BaseGrantType.addExtension(baseGrantType0);
        net.oauth.v2.OAuth2.GrantType = baseGrantType0;
        java.lang.Class<?> wildcardClass4 = null; // flaky: baseGrantType0.getClass();
// flaky:         org.junit.Assert.assertNotNull(baseGrantType0);
// flaky:         org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test0134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0134");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("HTTP request");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[72, 84, 84, 80, 32, 114, 101, 113, 117, 101, 115, 116]");
    }

    @Test
    public void test0135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0135");
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
        java.lang.String str18 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str17, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test0136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0136");
        byte[] byteArray2 = new byte[] { (byte) -1, (byte) 10 };
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray2);
        java.lang.String str4 = net.oauth.v2.OAuth2.decodeCharacters(byteArray2);
        java.lang.String str5 = net.oauth.v2.OAuth2.decodeCharacters(byteArray2);
        org.junit.Assert.assertNotNull(byteArray2);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray2), "[-1, 10]");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\n" + "'", str3, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\ufffd\n" + "'", str4, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\ufffd\n" + "'", str5, "\ufffd\n");
    }

    @Test
    public void test0137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0137");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.String str3 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0138");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        java.lang.String str4 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str4, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0139");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable0 = null;
        java.io.OutputStream outputStream1 = null;
        net.oauth.v2.OAuth2.formEncodeInJson(parameterIterable0, outputStream1);
    }

    @Test
    public void test0140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0140");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        oAuth2Accessor6.scope = "application/x-www-form-urlencoded";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
    }

    @Test
    public void test0141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0141");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str4 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.Class<?> wildcardClass6 = parameterList3.getClass();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "unsupported_grant_type" + "'", str4, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "username" + "'", str5, "username");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0142");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        oAuth2Accessor1.expires_in = "2.0";
        oAuth2Accessor1.expires_in = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
    }

    @Test
    public void test0143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0143");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0144");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.accessToken = "hi!";
        java.lang.String str6 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
    }

    @Test
    public void test0145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0145");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str18 = oAuth2Message12.getParameter("error_uri");
        oAuth2Message12.method = "code";
        java.lang.String str21 = oAuth2Message12.method;
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "code" + "'", str21, "code");
    }

    @Test
    public void test0146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0146");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null  realm=\"password\"");
    }

    @Test
    public void test0147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0147");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
    }

    @Test
    public void test0148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0148");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("application%2Fx-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "application%252Fx-www-form-urlencoded" + "'", str1, "application%252Fx-www-form-urlencoded");
    }

    @Test
    public void test0149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0149");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("none");
        java.lang.Class<?> wildcardClass6 = parameter2.getClass();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0150");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" + "'", str1, "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
    }

    @Test
    public void test0151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0151");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("none");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none" + "'", str1, "none");
    }

    @Test
    public void test0152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0152");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("error_description");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0153");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0154");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("HTTP response");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[72, 84, 84, 80, 32, 114, 101, 115, 112, 111, 110, 115, 101]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "HTTP response" + "'", str2, "HTTP response");
    }

    @Test
    public void test0155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0155");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("code_and_token");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "code_and_token" + "'", str1, "code_and_token");
    }

    @Test
    public void test0156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0156");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap6 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0157");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("none=UTF-8");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none=UTF-8" + "'", str1, "none=UTF-8");
    }

    @Test
    public void test0158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0158");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str9 = oAuth2Message5.URL;
        java.lang.String str11 = oAuth2Message5.getHeader("invalid_request");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0159");
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
        java.lang.String str12 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str12, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0160");
        java.lang.Throwable throwable1 = null;
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("HTTP request", throwable1);
        java.lang.String str3 = oAuth2Exception2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2Exception: HTTP request" + "'", str3, "net.oauth.v2.OAuth2Exception: HTTP request");
    }

    @Test
    public void test0161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0161");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("OAuth2Message(hi!, , [])");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0162");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.refreshToken = "null  realm=\"password\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0163");
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
        java.lang.String str20 = oAuth2Client7.clientSecret;
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme=token_type" + "'", str13, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "token_type" + "'", str15, "token_type");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str19, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0164");
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
        java.util.Map<java.lang.String, java.lang.Object> strMap25 = oAuth2ProblemException6.getParameters();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 200 + "'", int21 == 200);
        org.junit.Assert.assertNotNull(strMap25);
    }

    @Test
    public void test0165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0165");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.expires_in = "authorization_code";
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test0166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0166");
        java.lang.String[] strArray1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = net.oauth.v2.OAuth2.addParameters("URL", strArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0167");
        java.lang.String[] strArray3 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "HTTP status", "HTTP response" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2.newList(strArray3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(parameterList4);
    }

    @Test
    public void test0168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0168");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("DELETE");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0169");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.method = "bearer";
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
    }

    @Test
    public void test0170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0170");
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
        oAuth2Accessor2.accessToken = "invalid_token";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str18, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test0171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0171");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("HTTP status");
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("access_token", "null%20%20realm%3D%22invalid_token%22=POST", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream6);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("", "token_type", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream8);
        org.junit.Assert.assertNotNull(parameterList5);
    }

    @Test
    public void test0172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0172");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.state = "Location";
        java.lang.Object obj11 = oAuth2Accessor1.getProperty("token_type");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0173");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str1, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0174");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.state = "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])";
        java.lang.String str10 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0175");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        java.lang.String str11 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0176");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        int int6 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.Throwable[] throwableArray7 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test0177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0177");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("UTF-8");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[85, 84, 70, 45, 56]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "UTF-8" + "'", str2, "UTF-8");
    }

    @Test
    public void test0178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0178");
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
        oAuth2Accessor9.tokenType = "token";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
    }

    @Test
    public void test0179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0179");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        oAuth2Accessor7.refreshToken = "assertion";
        java.lang.String str10 = oAuth2Accessor7.state;
        oAuth2ProblemException1.setParameter("error_uri", (java.lang.Object) oAuth2Accessor7);
        oAuth2Accessor7.accessToken = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0180");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int4 = oAuth2ProblemException3.getHttpStatusCode();
        java.lang.String str5 = oAuth2ProblemException3.getProblem();
        net.oauth.v2.OAuth2.Parameter[] parameterArray9 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList10 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10, parameterArray9);
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        oAuth2ProblemException3.setParameter("code", (java.lang.Object) parameterList10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("invalid_request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_request" + "'", str15, "invalid_request");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str16, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
    }

    @Test
    public void test0181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0181");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.lang.String str10 = oAuth2Message8.getCode();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0182");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0183");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        java.lang.String str8 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client9 = oAuth2Accessor1.client;
        java.lang.String str10 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(oAuth2Client9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0184");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.Class<?> wildcardClass9 = oAuth2Message8.getClass();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0185");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.OutputStream outputStream7 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4, outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP request" + "'", str6, "HTTP request");
    }

    @Test
    public void test0186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0186");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.expires_in = "GET";
        net.oauth.v2.OAuth2Client oAuth2Client5 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "client_id";
        java.lang.String str8 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0187");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.lang.String str12 = oAuth2Message8.toString();
        oAuth2Message8.method = "HTTP request";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str12, "OAuth2Message(DELETE, client_id, [])");
    }

    @Test
    public void test0188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0188");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        java.lang.String str10 = oAuth2Accessor6.accessToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0189");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor9 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str10 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str10, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0190");
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
        java.lang.String str23 = oAuth2ProblemException8.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str23, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0191");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList7 = oAuth2Message5.getHeaders();
        oAuth2Message5.method = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message5.URL = "null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strEntryList7);
    }

    @Test
    public void test0192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0192");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("Location");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0193");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.scope;
        java.lang.String str10 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0194");
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
        net.oauth.v2.OAuth2.ResponseType = baseResponseType11;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNotNull(baseResponseType11);
    }

    @Test
    public void test0195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0195");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        java.lang.String str10 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "response_type" + "'", str10, "response_type");
    }

    @Test
    public void test0196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0196");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message7.getParameters();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList9);
    }

    @Test
    public void test0197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0197");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2Exception: HTTP request");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception: HTTP request" + "'", str1, "net.oauth.v2.OAuth2Exception: HTTP request");
    }

    @Test
    public void test0198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0198");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("bearer");
    }

    @Test
    public void test0199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0199");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str18 = oAuth2Message12.getParameter("error_uri");
        oAuth2Message12.method = "code";
        java.lang.String str21 = oAuth2Message12.getClientId();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0200");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        java.lang.Class<?> wildcardClass5 = strMap4.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test0201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0201");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.String str6 = oAuth2Exception5.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str6, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0202");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.expires_in = "PUT";
        oAuth2Accessor1.expires_in = "application%252Fx-www-form-urlencoded";
        java.lang.String str10 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "application%252Fx-www-form-urlencoded" + "'", str10, "application%252Fx-www-form-urlencoded");
    }

    @Test
    public void test0203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0203");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("refresh_token", "HTTP request");
    }

    @Test
    public void test0204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0204");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("client_id");
        java.lang.String str2 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: client_id" + "'", str2, "net.oauth.v2.OAuth2ProblemException: client_id");
    }

    @Test
    public void test0205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0205");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test0206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0206");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str10 = parameter8.setValue("");
        java.lang.String str12 = parameter8.setValue("response_type");
        oAuth2ProblemException1.setParameter("assertion", (java.lang.Object) str12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "UTF-8" + "'", str10, "UTF-8");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0207");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11, inputStream13);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("Location", "application%2Fx-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        oAuth2Message15.method = "net.oauth.v2.OAuth2ProblemException: hi!";
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0208");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("access_token");
    }

    @Test
    public void test0209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0209");
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
        java.lang.String str13 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(baseTokenType9);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0210");
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
        java.lang.String str24 = oAuth2Client23.clientId;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "token_type" + "'", str24, "token_type");
    }

    @Test
    public void test0211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0211");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.lang.String str10 = oAuth2Message8.method;
        oAuth2Message8.method = "assertion";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test0212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0212");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str7 = oAuth2Message4.getParameter("state");
        java.lang.String str9 = oAuth2Message4.getWWWAuthenticateHeader("code_and_token");
        java.lang.String str10 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "null  realm=\"code_and_token\"" + "'", str9, "null  realm=\"code_and_token\"");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "refresh_token" + "'", str10, "refresh_token");
    }

    @Test
    public void test0213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0213");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        oAuth2Message5.method = "scope";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test0214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0214");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("error_description");
    }

    @Test
    public void test0215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0215");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("invalid_grant", "POST");
    }

    @Test
    public void test0216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0216");
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
        oAuth2Client3.setProperty("assertion_type", (java.lang.Object) "null%20%20realm%3D%22invalid_token%22=POST");
        java.lang.String str20 = oAuth2Client3.clientId;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "token_type" + "'", str20, "token_type");
    }

    @Test
    public void test0217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0217");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        java.lang.String str11 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList6);
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test0218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0218");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.Object obj6 = oAuth2Accessor2.getProperty("error");
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj6);
    }

    @Test
    public void test0219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0219");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0220");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[80, 79, 83, 84, 63, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 61, 115, 99, 111, 112, 101, 38, 97, 115, 115, 101, 114, 116, 105, 111, 110, 95, 116, 121, 112, 101, 61, 117, 110, 115, 117, 112, 112, 111, 114, 116, 101, 100, 95, 103, 114, 97, 110, 116, 95, 116, 121, 112, 101, 38, 98, 101, 97, 114, 101, 114, 61, 98, 101, 97, 114, 101, 114]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str2, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0221");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str2 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str2, "net.oauth.v2.OAuth2ProblemException: Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0222");
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
        java.lang.String str25 = net.oauth.v2.OAuth2.addParameters("", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList22);
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
    }

    @Test
    public void test0223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0223");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0224");
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
        java.lang.String str14 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Authorization-Schesme=error" + "'", str14, "Authorization-Schesme=error");
    }

    @Test
    public void test0225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0225");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.String str3 = oAuth2Accessor2.accessToken;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0226");
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
        net.oauth.v2.OAuth2Client oAuth2Client19 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client21 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor22 = new net.oauth.v2.OAuth2Accessor(oAuth2Client21);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor23 = oAuth2Accessor22.clone();
        oAuth2Client19.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor23);
        java.lang.String str25 = oAuth2Client19.clientSecret;
        java.lang.String str26 = oAuth2Client19.redirectUri;
        java.lang.Object obj28 = oAuth2Client19.getProperty("UTF-8");
        java.lang.Object obj30 = oAuth2Client19.getProperty("\n");
        oAuth2Accessor1.setProperty("OAuth2Message(hi!, , [])", obj30);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(oAuth2Accessor23);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str25, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNull(obj28);
        org.junit.Assert.assertNull(obj30);
    }

    @Test
    public void test0227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0227");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("client_secret", "", "Authorization-Schesme=token_type");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        java.lang.String str5 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme=token_type" + "'", str4, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0228");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception("application%252Fx-www-form-urlencoded", (java.lang.Throwable) oAuth2Exception2);
        java.lang.Throwable[] throwableArray4 = oAuth2Exception3.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray4);
    }

    @Test
    public void test0229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0229");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("redirect_uri");
        java.lang.String str2 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "redirect_uri" + "'", str2, "redirect_uri");
    }

    @Test
    public void test0230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0230");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        java.lang.Object obj9 = oAuth2Accessor6.getProperty("token");
        java.lang.Object obj11 = oAuth2Accessor6.getProperty("OAuth2Message(URL, assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer, [])");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(obj9);
        org.junit.Assert.assertNull(obj11);
    }

    @Test
    public void test0231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0231");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = oAuth2Message12.getParameters();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList20);
    }

    @Test
    public void test0232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0232");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0233");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(hi!, GET, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        java.io.OutputStream outputStream3 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream3);
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0234");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer", "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0235");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.util.Map<java.lang.String, java.lang.Object> strMap6 = oAuth2ProblemException1.getParameters();
        int int7 = oAuth2ProblemException1.getHttpStatusCode();
        int int8 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 200 + "'", int7 == 200);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 200 + "'", int8 == 200);
    }

    @Test
    public void test0236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0236");
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
        java.lang.String str16 = oAuth2Message15.toString();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(POST, refresh_token, [])" + "'", str16, "OAuth2Message(POST, refresh_token, [])");
    }

    @Test
    public void test0237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0237");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str17 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str17, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test0238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0238");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str2 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        java.io.OutputStream outputStream3 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test0239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0239");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("OAuth2Message(, client_id, [])");
    }

    @Test
    public void test0240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0240");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "Authorization-Schesme";
        java.lang.String str8 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "assertion" + "'", str8, "assertion");
    }

    @Test
    public void test0241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0241");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        java.lang.Class<?> wildcardClass3 = strMap2.getClass();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test0242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0242");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("URL");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "URL" + "'", str1, "URL");
    }

    @Test
    public void test0243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0243");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int3 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException2);
        int int5 = oAuth2ProblemException2.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException2.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str6, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0244");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("PUT");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0245");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.lang.String str12 = oAuth2Message8.toString();
        java.lang.String str14 = oAuth2Message8.getHeader("OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str12, "OAuth2Message(DELETE, client_id, [])");
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test0246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0246");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        int int6 = oAuth2ProblemException4.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception7);
        java.util.Map<java.lang.String, java.lang.Object> strMap9 = oAuth2ProblemException4.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException11 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int12 = oAuth2ProblemException11.getHttpStatusCode();
        java.lang.String str13 = oAuth2ProblemException11.getProblem();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2ProblemException11);
        oAuth2ProblemException1.setParameter("redirect_uri_mismatch", (java.lang.Object) oAuth2ProblemException4);
        java.lang.String str16 = oAuth2ProblemException4.toString();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 200 + "'", int12 == 200);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str16, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0247");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        java.lang.String str10 = oAuth2Message5.getWWWAuthenticateHeader("");
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"\"" + "'", str10, "null  realm=\"\"");
    }

    @Test
    public void test0248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0248");
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
        java.lang.String str24 = oAuth2Accessor21.code;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0249");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "assertion" + "'", str6, "assertion");
    }

    @Test
    public void test0250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0250");
        net.oauth.v2.OAuth2.Parameter[] parameterArray3 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList4 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, parameterArray3);
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.util.Map<java.lang.String, java.lang.String> strMap7 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str8 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("invalid_scope", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "invalid_scope" + "'", str10, "invalid_scope");
    }

    @Test
    public void test0251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0251");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str6 = oAuth2ProblemException1.getProblem();
        java.lang.String str7 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str7, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0252");
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
        java.lang.String str18 = oAuth2Message15.getHeader("URL");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0253");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2Exception=HTTP%20status");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0254");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.lang.String str1 = oAuth2ProblemException0.getProblem();
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap5 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        oAuth2ProblemException0.setParameter("assertion", (java.lang.Object) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0255");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException8 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException8);
        int int10 = oAuth2ProblemException8.getHttpStatusCode();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2ProblemException8);
        java.lang.Throwable throwable12 = null;
        // The following exception was thrown during execution in test generation
        try {
            oAuth2Exception6.addSuppressed(throwable12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot suppress a null exception.");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
    }

    @Test
    public void test0256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0256");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("error");
        java.lang.String str8 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme" + "'", str8, "Authorization-Schesme");
    }

    @Test
    public void test0257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0257");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.BaseErrorCode.addExtension(baseErrorCode0);
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test0258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0258");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("null  realm=\"invalid_token\"");
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.Object obj8 = oAuth2Accessor6.getProperty("error");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(obj8);
    }

    @Test
    public void test0259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0259");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        java.lang.Throwable[] throwableArray5 = oAuth2ProblemException1.getSuppressed();
        java.lang.Class<?> wildcardClass6 = oAuth2ProblemException1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0260");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray4);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("HTTP response", "GET", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0261");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.OutputStream outputStream9 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5, outputStream9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0262");
        java.lang.Iterable<net.oauth.v2.OAuth2.Parameter> parameterIterable0 = null;
        java.util.Map<java.lang.String, java.lang.String> strMap1 = net.oauth.v2.OAuth2.newMap(parameterIterable0);
        org.junit.Assert.assertNotNull(strMap1);
    }

    @Test
    public void test0263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0263");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        java.lang.String str11 = oAuth2Accessor1.expires_in;
        java.lang.String str12 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
    }

    @Test
    public void test0264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0264");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("error");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "error" + "'", str1, "error");
    }

    @Test
    public void test0265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0265");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        int int4 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("token_type", (java.lang.Throwable) oAuth2ProblemException2);
        java.lang.String str8 = oAuth2ProblemException2.getProblem();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test0266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0266");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("application%252Fx-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "application%2Fx-www-form-urlencoded" + "'", str1, "application%2Fx-www-form-urlencoded");
    }

    @Test
    public void test0267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0267");
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
        java.lang.String str30 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 200 + "'", int15 == 200);
        org.junit.Assert.assertNotNull(parameterArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(throwableArray28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test0268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0268");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        java.lang.String str10 = oAuth2Message7.getHeader("error_uri");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message7.getHeaders();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message7.getParameters();
        java.lang.Class<?> wildcardClass13 = strEntryList12.getClass();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0269");
        java.lang.String[] strArray0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2.newList(strArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test0270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0270");
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
        java.lang.Class<?> wildcardClass19 = oAuth2Client3.getClass();
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "token_type" + "'", str18, "token_type");
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test0271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0271");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("client_credentials", "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        java.lang.String str3 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str3, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0272");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor6.tokenType;
        oAuth2Accessor6.state = "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0273");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null%20%20realm%3D%22invalid_token%22=POST" + "'", str4, "null%20%20realm%3D%22invalid_token%22=POST");
    }

    @Test
    public void test0274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0274");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.setProperty("code", (java.lang.Object) (short) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.accessToken = "net.oauth.v2.OAuth2Exception=HTTP%20status";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0275");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
    }

    @Test
    public void test0276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0276");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str18 = oAuth2Message12.getParameter("error_uri");
        oAuth2Message12.completeParameters();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test0277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0277");
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
        java.lang.String str21 = oAuth2Accessor15.code;
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(parameterArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0278");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0279");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        java.lang.String str6 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0280");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.refreshToken = "HTTP request";
        java.lang.String str7 = oAuth2Accessor1.state;
        oAuth2Accessor1.state = "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0281");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream5 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList3);
    }

    @Test
    public void test0282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0282");
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
        java.lang.String str16 = oAuth2Message5.URL;
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
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0283");
        java.lang.String[] strArray3 = new java.lang.String[] {};
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray3);
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList6 = net.oauth.v2.OAuth2.newList(strArray3);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList7 = net.oauth.v2.OAuth2.newList(strArray3);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("none", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.Class<?> wildcardClass9 = parameterList7.getClass();
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "DELETE" + "'", str5, "DELETE");
        org.junit.Assert.assertNotNull(parameterList6);
        org.junit.Assert.assertNotNull(parameterList7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "none" + "'", str8, "none");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test0284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0284");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("HTTP status");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "HTTP%20status" + "'", str1, "HTTP%20status");
    }

    @Test
    public void test0285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0285");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "DELETE";
        java.lang.String str13 = oAuth2Accessor1.scope;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(oAuth2Client10);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0286");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.String str5 = oAuth2Accessor1.code;
        java.lang.Object obj7 = oAuth2Accessor1.getProperty("2.0");
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0287");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream6 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0288");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray7);
        java.io.OutputStream outputStream11 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10, outputStream11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList10);
    }

    @Test
    public void test0289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0289");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.code = "Authorization-Schesme";
        oAuth2Accessor1.scope = "invalid_token";
        oAuth2Accessor1.accessToken = "";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0290");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        int int5 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
    }

    @Test
    public void test0291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0291");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("token", "HTTP request", "invalid_grant");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.Object obj7 = oAuth2Accessor5.getProperty("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "invalid_grant" + "'", str4, "invalid_grant");
        org.junit.Assert.assertNull(obj7);
    }

    @Test
    public void test0292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0292");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = null;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
    }

    @Test
    public void test0293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0293");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("HTTP status");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0294");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("null  realm=\"invalid_token\"", "POST");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.getValue();
        java.lang.String str5 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "null  realm=\"invalid_token\"" + "'", str3, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "POST" + "'", str4, "POST");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "null  realm=\"invalid_token\"" + "'", str5, "null  realm=\"invalid_token\"");
    }

    @Test
    public void test0295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0295");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(DELETE, client_id, [])");
        java.util.Map<java.lang.String, java.lang.String> strMap2 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        java.util.Map<java.lang.String, java.lang.String> strMap3 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1);
        org.junit.Assert.assertNotNull(parameterList1);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap3);
    }

    @Test
    public void test0296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0296");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.io.OutputStream outputStream4 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2, outputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ufffd\n" + "'", str3, "\ufffd\n");
    }

    @Test
    public void test0297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0297");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        oAuth2ProblemException0.setParameter("application%252Fx-www-form-urlencoded", (java.lang.Object) "Location");
        java.util.Map<java.lang.String, java.lang.Object> strMap16 = oAuth2ProblemException0.getParameters();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0298");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParameters("assertion", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList14 = net.oauth.v2.OAuth2.newList(strArray9);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList14);
        org.junit.Assert.assertNotNull(strMap15);
    }

    @Test
    public void test0299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0299");
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
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList20 = oAuth2Message11.getParameters();
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str18, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertNotNull(strEntryList20);
    }

    @Test
    public void test0300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0300");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        java.lang.String str12 = oAuth2Message8.toString();
        oAuth2Message8.method = "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"";
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(DELETE, client_id, [])" + "'", str12, "OAuth2Message(DELETE, client_id, [])");
    }

    @Test
    public void test0301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0301");
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
        java.lang.String str15 = oAuth2Message5.getWWWAuthenticateHeader("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"" + "'", str15, "null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
    }

    @Test
    public void test0302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0302");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getParameters();
        oAuth2Message5.method = "OAuth2Message(hi!, , [])";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
    }

    @Test
    public void test0303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0303");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.code;
        oAuth2Accessor1.tokenType = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0304");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0305");
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
        java.lang.Class<?> wildcardClass20 = oAuth2Message15.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strEntryList18);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test0306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0306");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str18 = oAuth2Message12.getParameter("error_uri");
        java.lang.String str20 = oAuth2Message12.getWWWAuthenticateHeader("null%20%20realm%3D%22invalid_token%22=POST");
        oAuth2Message12.method = "unsupported_grant_type";
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str20, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
    }

    @Test
    public void test0307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0307");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        int int6 = oAuth2ProblemException1.getHttpStatusCode();
        oAuth2ProblemException1.setParameter("authorization_code", (java.lang.Object) "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test0308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0308");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        java.lang.String str4 = oAuth2Accessor1.refreshToken;
        java.lang.String str5 = oAuth2Accessor1.tokenType;
        java.lang.String str6 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "error_description" + "'", str6, "error_description");
    }

    @Test
    public void test0309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0309");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        java.lang.String str9 = oAuth2Accessor1.accessToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2Client oAuth2Client11 = oAuth2Accessor1.client;
        oAuth2Accessor1.accessToken = "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(oAuth2Accessor10);
        org.junit.Assert.assertNull(oAuth2Client11);
    }

    @Test
    public void test0310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0310");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.expires_in = "PUT";
        java.lang.String str8 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "PUT" + "'", str8, "PUT");
    }

    @Test
    public void test0311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0311");
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
        java.lang.String str20 = oAuth2Message11.URL;
        java.lang.String str21 = oAuth2Message11.getCode();
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strEntryList14);
        org.junit.Assert.assertNotNull(strEntryList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str18, "OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "GET" + "'", str20, "GET");
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test0312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0312");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0313");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.String str4 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str4, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test0314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0314");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("error_description");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "error_description" + "'", str1, "error_description");
    }

    @Test
    public void test0315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0315");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.accessToken;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor5 = oAuth2Accessor1.clone();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(oAuth2Accessor5);
    }

    @Test
    public void test0316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0316");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        java.lang.String str3 = oAuth2ProblemException1.getProblem();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "error_uri" + "'", str3, "error_uri");
    }

    @Test
    public void test0317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0317");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "unsupported_grant_type#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0318");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("POST");
        java.lang.String str2 = oAuth2Exception1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2Exception: POST" + "'", str2, "net.oauth.v2.OAuth2Exception: POST");
    }

    @Test
    public void test0319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0319");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        java.lang.String str2 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str2, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0320");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.Class<?> wildcardClass13 = parameter8.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test0321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0321");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        java.lang.String str5 = oAuth2Accessor1.state;
        oAuth2Accessor1.state = "null  realm=\"null%20%20realm%3D%22none%252523net.oauth.v2.OAuth2Exception%25253Dscope%252526assertion_type%25253Dunsupported_grant_type%252526bearer%25253Dbearer%22\"";
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0322");
        net.oauth.v2.BaseErrorCode baseErrorCode0 = net.oauth.v2.BaseErrorCode.getInstance();
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        net.oauth.v2.OAuth2.ErrorCode = baseErrorCode0;
        org.junit.Assert.assertNotNull(baseErrorCode0);
    }

    @Test
    public void test0323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0323");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", strArray9);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0324");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        net.oauth.v2.OAuth2.Parameter[] parameterArray6 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList7 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, parameterArray6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.lang.String str11 = oAuth2Message9.getHeader("");
        java.lang.String str12 = oAuth2Message9.method;
        oAuth2Accessor2.setProperty("Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) str12);
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
    }

    @Test
    public void test0325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0325");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        java.lang.String str6 = oAuth2Accessor1.state;
        java.lang.String str7 = oAuth2Accessor1.tokenType;
        java.lang.String str8 = oAuth2Accessor1.state;
        oAuth2Accessor1.scope = "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0326");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.toString();
        java.lang.String str10 = oAuth2Message5.getHeader("OAuth2Message(hi!, , [])");
        java.lang.String str12 = oAuth2Message5.getWWWAuthenticateHeader("net.oauth.v2.OAuth2Exception: HTTP request");
        java.lang.String str14 = oAuth2Message5.getWWWAuthenticateHeader("2.0");
        java.lang.String str16 = oAuth2Message5.getHeader("assertion_type");
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str8, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"" + "'", str12, "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"2.0\"" + "'", str14, "null  realm=\"2.0\"");
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0327");
        net.oauth.v2.OAuth2.Parameter[] parameterArray6 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList7 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7, parameterArray6);
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        net.oauth.v2.OAuth2Message oAuth2Message10 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.OutputStream outputStream11 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream11);
        net.oauth.v2.OAuth2Message oAuth2Message13 = new net.oauth.v2.OAuth2Message("HTTP request", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList7);
        java.io.OutputStream outputStream14 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList7, outputStream14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test0328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0328");
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
        java.lang.String str24 = oAuth2Accessor9.expires_in;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 200 + "'", int14 == 200);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNull(str24);
    }

    @Test
    public void test0329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0329");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.code = "error_description";
        java.lang.String str4 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("");
        net.oauth.v2.OAuth2Exception oAuth2Exception9 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception8);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception("code_and_token", (java.lang.Throwable) oAuth2Exception9);
        oAuth2Accessor1.setProperty("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Exception9);
        net.oauth.v2.OAuth2Exception oAuth2Exception12 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2Exception9);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0330");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0331");
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
        oAuth2Accessor9.code = "OAuth2Message(hi!, GET, [])";
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str15, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
    }

    @Test
    public void test0332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0332");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        oAuth2Accessor1.accessToken = "null  realm=\"Authorization-Schesme\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0333");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.scope;
        java.lang.String str11 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "state" + "'", str11, "state");
    }

    @Test
    public void test0334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0334");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.lang.String str8 = oAuth2Message7.getCode();
        oAuth2Message7.URL = "code_and_token";
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0335");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str5 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.io.InputStream inputStream6 = null;
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream6);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message7.getHeaders();
        java.lang.String str10 = oAuth2Message7.getHeader("error_uri");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message7.getHeaders();
        java.lang.String str12 = oAuth2Message7.getCode();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = oAuth2Message7.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "unsupported_grant_type" + "'", str5, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
    }

    @Test
    public void test0336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0336");
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
        oAuth2Message5.method = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(strMap16);
    }

    @Test
    public void test0337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0337");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception4);
        java.lang.Throwable[] throwableArray7 = oAuth2Exception6.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray7);
    }

    @Test
    public void test0338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0338");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor8 = oAuth2Accessor7.clone();
        java.lang.String str9 = oAuth2Accessor7.tokenType;
        oAuth2Accessor7.accessToken = "";
        java.lang.String str12 = oAuth2Accessor7.tokenType;
        oAuth2Accessor1.setProperty("\n#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) str12);
        oAuth2Accessor1.code = "code_and_token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(oAuth2Accessor8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0339");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "access_denied" + "'", str6, "access_denied");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
    }

    @Test
    public void test0340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0340");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(Authorization-Schesme=token_type, , [])" + "'", str9, "OAuth2Message(Authorization-Schesme=token_type, , [])");
    }

    @Test
    public void test0341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0341");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22%22" + "'", str1, "null%20%20realm%3D%22%22");
    }

    @Test
    public void test0342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0342");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str5 = parameter2.setValue("access_denied");
        java.lang.String str7 = parameter2.setValue("unsupported_response_type");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "token_type" + "'", str5, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "access_denied" + "'", str7, "access_denied");
    }

    @Test
    public void test0343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0343");
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
        oAuth2Accessor21.tokenType = "expires_in";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNotNull(parameterArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNull(obj20);
        org.junit.Assert.assertNotNull(oAuth2Accessor21);
    }

    @Test
    public void test0344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0344");
        net.oauth.v2.BaseResponseType baseResponseType0 = null;
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
    }

    @Test
    public void test0345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0345");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2ProblemException: client_id");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2ProblemException: client_id" + "'", str1, "net.oauth.v2.OAuth2ProblemException: client_id");
    }

    @Test
    public void test0346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0346");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.util.Map<java.lang.String, java.lang.String> strMap5 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.io.OutputStream outputStream6 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList3, outputStream6);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test0347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0347");
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
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strEntryList13);
    }

    @Test
    public void test0348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0348");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none", "UTF-8");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "none=UTF-8" + "'", str3, "none=UTF-8");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "none" + "'", str4, "none");
    }

    @Test
    public void test0349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0349");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str6 = oAuth2Message4.URL;
        java.lang.String str7 = oAuth2Message4.method;
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "application/x-www-form-urlencoded" + "'", str6, "application/x-www-form-urlencoded");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "refresh_token" + "'", str7, "refresh_token");
    }

    @Test
    public void test0350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0350");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "unsupported_grant_type" + "'", str1, "unsupported_grant_type");
    }

    @Test
    public void test0351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0351");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("net.oauth.v2.OAuth2ProblemException: Location");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2ProblemException: Location" + "'", str1, "net.oauth.v2.OAuth2ProblemException: Location");
    }

    @Test
    public void test0352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0352");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str9 = oAuth2Message5.toString();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0353");
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
        java.lang.Class<?> wildcardClass15 = oAuth2Message5.getClass();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "GET" + "'", str12, "GET");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"redirect_uri_mismatch\"" + "'", str14, "null  realm=\"redirect_uri_mismatch\"");
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test0354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0354");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str7 = parameter2.setValue("authorization_code");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
    }

    @Test
    public void test0355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0355");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList16 = oAuth2Message12.getHeaders();
        java.lang.String str18 = oAuth2Message12.getParameter("error_uri");
        java.lang.String str20 = oAuth2Message12.getWWWAuthenticateHeader("null%20%20realm%3D%22invalid_token%22=POST");
        java.lang.String str22 = oAuth2Message12.getParameter("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str23 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertNotNull(strEntryList16);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"" + "'", str20, "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str23, "OAuth2Message(unsupported_response_type, invalid_scope, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test0356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0356");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.lang.String str8 = oAuth2Message5.getClientId();
        oAuth2Message5.URL = "access_token";
        oAuth2Message5.method = "POST";
        java.lang.String str13 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0357");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("UTF-8");
    }

    @Test
    public void test0358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0358");
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
        java.lang.String str13 = oAuth2Exception12.toString();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request" + "'", str13, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2Exception: invalid_request");
    }

    @Test
    public void test0359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0359");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("OAuth2Message(scope, DELETE, [])");
        java.io.OutputStream outputStream2 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncodeInJson((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList1, outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0360");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        oAuth2Accessor7.refreshToken = "assertion";
        java.lang.String str10 = oAuth2Accessor7.state;
        oAuth2ProblemException1.setParameter("error_uri", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str12 = oAuth2Accessor7.tokenType;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor13 = oAuth2Accessor7.clone();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(oAuth2Accessor13);
    }

    @Test
    public void test0361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0361");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.state = "hi!";
        oAuth2Accessor2.tokenType = "unauthorized_client";
        oAuth2Accessor2.accessToken = "code";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test0362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0362");
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
        java.lang.String str14 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test0363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0363");
        java.lang.String[] strArray2 = new java.lang.String[] { "application%2Fx-www-form-urlencoded" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2.newList(strArray2);
        java.lang.String str4 = net.oauth.v2.OAuth2.addParametersAsFragment("null  realm=\"invalid_token\"", strArray2);
        org.junit.Assert.assertNotNull(strArray2);
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "null  realm=\"invalid_token\"" + "'", str4, "null  realm=\"invalid_token\"");
    }

    @Test
    public void test0364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0364");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getParameters();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        java.lang.String str16 = oAuth2Message8.getParameter("OAuth2Message(POST, refresh_token, [])");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test0365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0365");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
        org.junit.Assert.assertNotNull(parameterList1);
    }

    @Test
    public void test0366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0366");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap9 = oAuth2Message8.getParameterMap();
        java.lang.String str11 = oAuth2Message8.getWWWAuthenticateHeader("password");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strMap9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "null  realm=\"password\"" + "'", str11, "null  realm=\"password\"");
        org.junit.Assert.assertNotNull(strEntryList12);
    }

    @Test
    public void test0367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0367");
        java.lang.String[] strArray4 = new java.lang.String[] {};
        java.lang.String str5 = net.oauth.v2.OAuth2.addParametersAsFragment("", strArray4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("DELETE", strArray4);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("invalid_request", strArray4);
        java.lang.String str8 = net.oauth.v2.OAuth2.addParameters("hi!", strArray4);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray4);
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "DELETE" + "'", str6, "DELETE");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "invalid_request" + "'", str7, "invalid_request");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertNotNull(parameterList9);
    }

    @Test
    public void test0368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0368");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2.Parameter[] parameterArray8 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList9 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, parameterArray8);
        net.oauth.v2.OAuth2Message oAuth2Message11 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str13 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        net.oauth.v2.OAuth2Message oAuth2Message15 = new net.oauth.v2.OAuth2Message("client_credentials", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.util.Map<java.lang.String, java.lang.String> strMap16 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        oAuth2ProblemException1.setParameter("OAuth2Message(Authorization-Schesme=token_type, , [])", (java.lang.Object) parameterList9);
        java.util.Map<java.lang.String, java.lang.Object> strMap18 = oAuth2ProblemException1.getParameters();
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(parameterArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test0369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0369");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        java.lang.String str6 = oAuth2Accessor2.tokenType;
        oAuth2Accessor2.code = "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0370");
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
        java.lang.String str20 = oAuth2Accessor1.tokenType;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test0371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0371");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.toString();
        java.lang.String str11 = oAuth2Message8.getClientId();
        java.lang.String str13 = oAuth2Message8.getWWWAuthenticateHeader("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"" + "'", str13, "null  realm=\"null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer%26net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer\"");
    }

    @Test
    public void test0372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0372");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.refreshToken;
        java.lang.String str8 = oAuth2Accessor1.scope;
        net.oauth.v2.OAuth2Client oAuth2Client10 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor11 = new net.oauth.v2.OAuth2Accessor(oAuth2Client10);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor12 = oAuth2Accessor11.clone();
        java.lang.String str13 = oAuth2Accessor11.tokenType;
        java.lang.String str14 = oAuth2Accessor11.accessToken;
        oAuth2Accessor1.setProperty("\n", (java.lang.Object) str14);
        java.lang.String str16 = oAuth2Accessor1.state;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(oAuth2Accessor12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "response_type" + "'", str16, "response_type");
    }

    @Test
    public void test0373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0373");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception32 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException27);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
    }

    @Test
    public void test0374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0374");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("redirect_uri_mismatch");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[114, 101, 100, 105, 114, 101, 99, 116, 95, 117, 114, 105, 95, 109, 105, 115, 109, 97, 116, 99, 104]");
    }

    @Test
    public void test0375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0375");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "access_denied", "PUT");
    }

    @Test
    public void test0376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0376");
        net.oauth.v2.OAuth2Client oAuth2Client2 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor3 = new net.oauth.v2.OAuth2Accessor(oAuth2Client2);
        java.lang.String str4 = oAuth2Accessor3.tokenType;
        java.lang.String str5 = oAuth2Accessor3.tokenType;
        oAuth2Accessor3.code = "unsupported_grant_type";
        oAuth2Accessor3.tokenType = "GET";
        net.oauth.v2.OAuth2.Parameter[] parameterArray13 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList14 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14, parameterArray13);
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.lang.String str18 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList14);
        oAuth2Accessor3.setProperty("response_type", (java.lang.Object) strMap19);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList23 = net.oauth.v2.OAuth2Message.decodeAuthorization("invalid_scope");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList23);
        oAuth2Accessor3.setProperty("invalid_token", (java.lang.Object) parameterList23);
        net.oauth.v2.OAuth2Message oAuth2Message26 = new net.oauth.v2.OAuth2Message("", "null  realm=\"net.oauth.v2.OAuth2Exception%3A%20HTTP%20request\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList23);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(parameterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(parameterList23);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test0377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0377");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("redirect_uri");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception41 = new net.oauth.v2.OAuth2Exception("", (java.lang.Throwable) oAuth2ProblemException18);
        oAuth2Accessor2.setProperty("error", (java.lang.Object) "");
        java.lang.String str43 = oAuth2Accessor2.tokenType;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 200 + "'", int20 == 200);
        org.junit.Assert.assertNotNull(parameterArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 200 + "'", int36 == 200);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test0378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0378");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("OAuth2Message(scope, DELETE, [])", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("refresh_token", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList8);
        java.io.InputStream inputStream13 = null;
        net.oauth.v2.OAuth2Message oAuth2Message14 = new net.oauth.v2.OAuth2Message("null  realm=\"none%3DUTF-8\"", "null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList8, inputStream13);
        java.lang.String str15 = oAuth2Message14.getClientId();
        org.junit.Assert.assertNotNull(parameterList8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str10, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "refresh_token" + "'", str12, "refresh_token");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0379");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException0 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap1 = oAuth2ProblemException0.getParameters();
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException0.getSuppressed();
        java.lang.Throwable[] throwableArray3 = oAuth2ProblemException0.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException0);
        java.util.Map<java.lang.String, java.lang.Object> strMap5 = oAuth2ProblemException0.getParameters();
        int int6 = oAuth2ProblemException0.getHttpStatusCode();
        org.junit.Assert.assertNotNull(strMap1);
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray3);
        org.junit.Assert.assertNotNull(strMap5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
    }

    @Test
    public void test0380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0380");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.refreshToken = "HTTP request";
        oAuth2Accessor1.state = "null%20%20realm%3D%22invalid_token%22=POST";
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test0381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0381");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21" + "'", str1, "net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
    }

    @Test
    public void test0382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0382");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception3);
        java.lang.String str5 = oAuth2Exception3.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "net.oauth.v2.OAuth2Exception" + "'", str5, "net.oauth.v2.OAuth2Exception");
    }

    @Test
    public void test0383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0383");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme=token_type" + "'", str5, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0384");
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
        net.oauth.v2.OAuth2Client oAuth2Client26 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor27 = new net.oauth.v2.OAuth2Accessor(oAuth2Client26);
        java.lang.String str28 = oAuth2Accessor27.tokenType;
        java.lang.String str29 = oAuth2Accessor27.refreshToken;
        java.lang.String str30 = oAuth2Accessor27.code;
        java.lang.String str31 = oAuth2Accessor27.code;
        java.lang.String str32 = oAuth2Accessor27.tokenType;
        java.lang.String str33 = oAuth2Accessor27.state;
        oAuth2Client23.setProperty("redirect_uri", (java.lang.Object) str33);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str24, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test0385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0385");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList9);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("unsupported_response_type", "invalid_scope", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList9, inputStream11);
        java.lang.String str14 = oAuth2Message12.getWWWAuthenticateHeader("invalid_token");
        java.lang.String str15 = oAuth2Message12.URL;
        oAuth2Message12.URL = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Message12.URL = "assertion_type";
        java.lang.String str20 = oAuth2Message12.toString();
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"invalid_token\"" + "'", str14, "null  realm=\"invalid_token\"");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "invalid_scope" + "'", str15, "invalid_scope");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])" + "'", str20, "OAuth2Message(unsupported_response_type, assertion_type, [net.oauth.v2.OAuth2Exception=scope, assertion_type=unsupported_grant_type, bearer=bearer])");
    }

    @Test
    public void test0386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0386");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int3 = oAuth2ProblemException2.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException2);
        java.lang.Throwable[] throwableArray5 = oAuth2Exception4.getSuppressed();
        java.lang.Class<?> wildcardClass6 = oAuth2Exception4.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test0387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0387");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("PUT", "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "invalid_grant");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        java.io.InputStream inputStream15 = null;
        net.oauth.v2.OAuth2Message oAuth2Message16 = new net.oauth.v2.OAuth2Message("invalid_grant", "invalid_client", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13, inputStream15);
        net.oauth.v2.OAuth2Message oAuth2Message17 = new net.oauth.v2.OAuth2Message("URL", "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        net.oauth.v2.OAuth2Message oAuth2Message18 = new net.oauth.v2.OAuth2Message("client_credentials", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) "client_credentials");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "unsupported_grant_type" + "'", str14, "unsupported_grant_type");
    }

    @Test
    public void test0388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0388");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("POST");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0389");
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
        net.oauth.v2.OAuth2Exception oAuth2Exception23 = new net.oauth.v2.OAuth2Exception("OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Exception oAuth2Exception24 = new net.oauth.v2.OAuth2Exception("2.0", (java.lang.Throwable) oAuth2Exception23);
        oAuth2ProblemException14.addSuppressed((java.lang.Throwable) oAuth2Exception23);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 200 + "'", int5 == 200);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 200 + "'", int16 == 200);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 200 + "'", int19 == 200);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
    }

    @Test
    public void test0390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0390");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("error_uri");
        oAuth2ProblemException1.setParameter("OAuth2Message(hi!, GET, [])", (java.lang.Object) "HTTP status");
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer");
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException9 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException9);
        net.oauth.v2.OAuth2Exception oAuth2Exception11 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException9.addSuppressed((java.lang.Throwable) oAuth2Exception11);
        java.lang.Throwable[] throwableArray13 = oAuth2Exception11.getSuppressed();
        oAuth2Exception6.addSuppressed((java.lang.Throwable) oAuth2Exception11);
        org.junit.Assert.assertNotNull(throwableArray13);
    }

    @Test
    public void test0391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0391");
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
        int int31 = oAuth2ProblemException24.getHttpStatusCode();
        java.lang.String str32 = oAuth2ProblemException24.getProblem();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 200 + "'", int31 == 200);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
    }

    @Test
    public void test0392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0392");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("");
        java.lang.Throwable[] throwableArray2 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertNotNull(throwableArray2);
    }

    @Test
    public void test0393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0393");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("\ufffd\n", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParameters("client_credentials", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream8 = null;
        net.oauth.v2.OAuth2Message oAuth2Message9 = new net.oauth.v2.OAuth2Message("client_credentials", "Authorization-Schesme=error", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream8);
        java.lang.String str11 = oAuth2Message9.getHeader("client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\ufffd\n" + "'", str6, "\ufffd\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "client_credentials" + "'", str7, "client_credentials");
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test0394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0394");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.tokenType = "GET";
        oAuth2Accessor1.refreshToken = "Authorization-Schesme=token_type";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor1.client;
        oAuth2Accessor1.scope = "error_description";
        oAuth2Accessor1.tokenType = "token_type";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test0395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0395");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.lang.String str4 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str3, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test0396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0396");
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
        java.lang.String str15 = oAuth2Accessor1.code;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0397");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("access_token");
        java.lang.String str9 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0398");
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
        java.lang.String str13 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
// flaky:         org.junit.Assert.assertNotNull(baseGrantType7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "token_type" + "'", str12, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Authorization-Schesme" + "'", str13, "Authorization-Schesme");
    }

    @Test
    public void test0399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0399");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"invalid_token\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%20%20realm%3D%22invalid_token%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0400");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap8 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.io.InputStream inputStream11 = null;
        net.oauth.v2.OAuth2Message oAuth2Message12 = new net.oauth.v2.OAuth2Message("Authorization-Schesme=token_type", "null  realm=\"\"", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, inputStream11);
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test0401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0401");
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
        java.lang.Object obj26 = oAuth2Client23.getProperty("none");
        java.lang.String str27 = oAuth2Client23.redirectUri;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(oAuth2Accessor18);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str20, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Client23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str24, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNull(obj26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test0402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0402");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str10 = oAuth2Message5.getHeader("invalid_request");
        java.lang.String str11 = oAuth2Message5.getCode();
        java.lang.String str12 = oAuth2Message5.method;
        java.lang.String str13 = oAuth2Message5.getCode();
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0403");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("assertion", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("none", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0404");
        byte[] byteArray1 = new byte[] { (byte) 10 };
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str4 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[10]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "\n" + "'", str2, "\n");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\n" + "'", str3, "\n");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\n" + "'", str4, "\n");
    }

    @Test
    public void test0405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0405");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        java.lang.String str4 = oAuth2Accessor1.code;
        java.lang.Object obj6 = oAuth2Accessor1.getProperty("hi!");
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("client_secret");
        net.oauth.v2.OAuth2Client oAuth2Client9 = oAuth2Accessor1.client;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(oAuth2Client9);
    }

    @Test
    public void test0406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0406");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("access_denied");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        java.lang.String str3 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 99, 99, 101, 115, 115, 95, 100, 101, 110, 105, 101, 100]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "access_denied" + "'", str2, "access_denied");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "access_denied" + "'", str3, "access_denied");
    }

    @Test
    public void test0407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0407");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        oAuth2Message8.completeParameters();
        java.lang.String str12 = oAuth2Message8.getHeader("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test0408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0408");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("grant_type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "grant_type" + "'", str1, "grant_type");
    }

    @Test
    public void test0409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0409");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("token_type");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[116, 111, 107, 101, 110, 95, 116, 121, 112, 101]");
    }

    @Test
    public void test0410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0410");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        oAuth2Accessor1.refreshToken = "assertion";
        java.lang.String str4 = oAuth2Accessor1.state;
        java.lang.String str5 = oAuth2Accessor1.expires_in;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = oAuth2Accessor1.clone();
        java.lang.String str7 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(oAuth2Accessor6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0411");
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
        java.lang.String str16 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10);
        java.io.OutputStream outputStream17 = null;
        net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList10, outputStream17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 200 + "'", int4 == 200);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(parameterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test0412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0412");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        java.lang.String str4 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2.Parameter parameter8 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str9 = parameter8.toString();
        java.lang.String str11 = parameter8.setValue("access_denied");
        oAuth2Client3.setProperty("application/x-www-form-urlencoded", (java.lang.Object) parameter8);
        java.lang.String str13 = oAuth2Client3.clientId;
        java.lang.Object obj15 = oAuth2Client3.getProperty("Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
    }

    @Test
    public void test0413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0413");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("access_token");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[97, 99, 99, 101, 115, 115, 95, 116, 111, 107, 101, 110]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "access_token" + "'", str2, "access_token");
    }

    @Test
    public void test0414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0414");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.code;
        java.lang.String str6 = oAuth2Accessor2.scope;
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test0415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0415");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.expires_in = "PUT";
        net.oauth.v2.OAuth2Client oAuth2Client8 = oAuth2Accessor1.client;
        oAuth2Accessor1.tokenType = "token";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(oAuth2Client8);
    }

    @Test
    public void test0416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0416");
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
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str12, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "null  realm=\"unsupported_grant_type\"" + "'", str14, "null  realm=\"unsupported_grant_type\"");
    }

    @Test
    public void test0417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0417");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.Object obj5 = oAuth2Accessor1.getProperty("client_secret");
        oAuth2Accessor1.code = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.tokenType = "state";
        java.lang.String str10 = oAuth2Accessor1.state;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0418");
        net.oauth.v2.OAuth2.Parameter[] parameterArray4 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList5 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5, parameterArray4);
        net.oauth.v2.OAuth2Message oAuth2Message7 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("scope", "DELETE", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.toString();
        java.lang.String str10 = oAuth2Message8.URL;
        oAuth2Message8.completeParameters();
        java.lang.String str13 = oAuth2Message8.getHeader("unsupported_grant_type?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(scope, DELETE, [])" + "'", str9, "OAuth2Message(scope, DELETE, [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "DELETE" + "'", str10, "DELETE");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0419");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("null  realm=\"\"");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[110, 117, 108, 108, 32, 32, 114, 101, 97, 108, 109, 61, 34, 34]");
    }

    @Test
    public void test0420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0420");
        java.lang.String[] strArray7 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList8 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str9 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray7);
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
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList10);
    }

    @Test
    public void test0421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0421");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.refreshToken = "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.state = "OAuth2Message(hi!, , [])";
        java.lang.String str9 = oAuth2Accessor1.expires_in;
        oAuth2Accessor1.expires_in = "null  realm=\"none%3DUTF-8\"";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test0422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0422");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.expires_in = "refresh_token";
        java.lang.String str5 = oAuth2Accessor2.scope;
        oAuth2Accessor2.state = "none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test0423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0423");
        java.util.Collection<net.oauth.v2.OAuth2.Parameter> parameterCollection2 = null;
        net.oauth.v2.OAuth2Message oAuth2Message3 = new net.oauth.v2.OAuth2Message("assertion", "null  realm=\"unsupported_grant_type\"", parameterCollection2);
    }

    @Test
    public void test0424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0424");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        java.lang.String str3 = oAuth2Exception2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!" + "'", str3, "net.oauth.v2.OAuth2Exception: net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0425");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("OAuth2Message(hi!, GET, [])");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str1, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test0426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0426");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList1 = net.oauth.v2.OAuth2Message.decodeAuthorization("POST");
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
    public void test0427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0427");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str4 = parameter2.setValue("scope");
        java.lang.String str5 = parameter2.getValue();
        java.lang.String str7 = parameter2.setValue("none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "scope" + "'", str5, "scope");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "scope" + "'", str7, "scope");
    }

    @Test
    public void test0428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0428");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException1.getSuppressed();
        byte[] byteArray9 = net.oauth.v2.OAuth2.encodeCharacters("scope");
        java.lang.String str10 = net.oauth.v2.OAuth2.decodeCharacters(byteArray9);
        oAuth2ProblemException1.setParameter("error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) byteArray9);
        java.lang.String str12 = oAuth2ProblemException1.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(byteArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray9), "[115, 99, 111, 112, 101]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "scope" + "'", str10, "scope");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str12, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0429");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str1, "null%20%20realm%3D%222.0%22%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0430");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.code = "unsupported_grant_type";
        oAuth2Accessor1.scope = "null  realm=\"client_id\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0431");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        oAuth2Message5.completeParameters();
        java.lang.String str7 = oAuth2Message5.getClientId();
        java.lang.String str8 = oAuth2Message5.getClientId();
        java.lang.String str10 = oAuth2Message5.getHeader("net.oauth.v2.OAuth2Exception=HTTP%20status");
        oAuth2Message5.method = "OAuth2Message(POST, access_token, [])";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test0432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0432");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException3.addSuppressed((java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception("invalid_request", (java.lang.Throwable) oAuth2Exception5);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("error", (java.lang.Throwable) oAuth2Exception7);
    }

    @Test
    public void test0433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0433");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("net.oauth.v2.OAuth2ProblemException: hi!", "PUT");
        java.lang.String str3 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "net.oauth.v2.OAuth2ProblemException: hi!" + "'", str3, "net.oauth.v2.OAuth2ProblemException: hi!");
    }

    @Test
    public void test0434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0434");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("Location");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Location" + "'", str1, "Location");
    }

    @Test
    public void test0435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0435");
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
        oAuth2Message5.method = "net.oauth.v2.OAuth2Exception";
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "hi!" + "'", str12, "hi!");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
    }

    @Test
    public void test0436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0436");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = oAuth2Message5.getParameterMap();
        java.lang.String str9 = oAuth2Message5.URL;
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test0437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0437");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        oAuth2Message5.URL = "GET";
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList11 = oAuth2Message5.getParameters();
        java.lang.String str12 = oAuth2Message5.toString();
        oAuth2Message5.completeParameters();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNotNull(strEntryList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str12, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test0438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0438");
        java.lang.String[] strArray7 = new java.lang.String[] { "password", "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "redirect_uri_mismatch", "net.oauth.v2.OAuth2ProblemException: client_id", "net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer" };
        java.lang.String str8 = net.oauth.v2.OAuth2.addParametersAsFragment("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray7);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray7);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Authorization-Schesme\"", strArray7);
        org.junit.Assert.assertNotNull(strArray7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str8, "POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id" + "'", str10, "null  realm=\"Authorization-Schesme\"?password=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer&redirect_uri_mismatch=net.oauth.v2.OAuth2ProblemException%3A%20client_id");
    }

    @Test
    public void test0439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0439");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str9 = oAuth2Message8.getClientId();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getHeaders();
        java.lang.String str11 = oAuth2Message8.method;
        java.lang.String str13 = oAuth2Message8.getHeader("client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strEntryList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0440");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("net.oauth.v2.OAuth2ProblemException: hi!");
        oAuth2Accessor2.accessToken = "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor2.tokenType = "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
    }

    @Test
    public void test0441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0441");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        java.lang.String str5 = oAuth2Accessor1.state;
        java.lang.String str6 = oAuth2Accessor1.refreshToken;
        net.oauth.v2.OAuth2Client oAuth2Client7 = oAuth2Accessor1.client;
        java.lang.String str8 = oAuth2Accessor1.accessToken;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(oAuth2Client7);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test0442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0442");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("PUT=unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "PUT%3Dunsupported_grant_type" + "'", str1, "PUT%3Dunsupported_grant_type");
    }

    @Test
    public void test0443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0443");
        java.lang.String[] strArray5 = new java.lang.String[] { "null  realm=\"code_and_token\"", "net.oauth.v2.OAuth2ProblemException: Location", "HTTP%20status", "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" };
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray5);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer" + "'", str6, "none#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer?null%20%20realm%3D%22code_and_token%22=net.oauth.v2.OAuth2ProblemException%3A%20Location&HTTP%2520status=error_uri%3Fnet.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer");
    }

    @Test
    public void test0444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0444");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null  realm=\"password\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"password\"" + "'", str1, "null  realm=\"password\"");
    }

    @Test
    public void test0445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0445");
        java.lang.String str1 = net.oauth.v2.OAuth2.percentEncode("null  realm=\"unsupported_grant_type\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null%20%20realm%3D%22unsupported_grant_type%22" + "'", str1, "null%20%20realm%3D%22unsupported_grant_type%22");
    }

    @Test
    public void test0446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0446");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList2 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str3 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        java.util.Map<java.lang.String, java.lang.String> strMap4 = net.oauth.v2.OAuth2.newMap((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList2);
        org.junit.Assert.assertNotNull(parameterList2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "unsupported_grant_type" + "'", str3, "unsupported_grant_type");
        org.junit.Assert.assertNotNull(strMap4);
    }

    @Test
    public void test0447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0447");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("POST?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", "URL", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList10 = oAuth2Message8.getParameters();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList10);
    }

    @Test
    public void test0448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0448");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("Location");
        int int2 = oAuth2ProblemException1.getHttpStatusCode();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 200 + "'", int2 == 200);
    }

    @Test
    public void test0449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0449");
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
        java.lang.String str15 = oAuth2Accessor1.expires_in;
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str9, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test0450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0450");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.refreshToken;
        oAuth2Accessor1.scope = "2.0";
        oAuth2Accessor1.tokenType = "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        oAuth2Accessor1.expires_in = "client_credentials";
        oAuth2Accessor1.tokenType = "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test0451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0451");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap2 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException4 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception5 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception6 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException4.addSuppressed((java.lang.Throwable) oAuth2Exception6);
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException4);
        oAuth2ProblemException1.addSuppressed((java.lang.Throwable) oAuth2ProblemException4);
        net.oauth.v2.OAuth2Exception oAuth2Exception10 = new net.oauth.v2.OAuth2Exception("net.oauth.v2.OAuth2Exception", (java.lang.Throwable) oAuth2ProblemException1);
        org.junit.Assert.assertNotNull(strMap2);
    }

    @Test
    public void test0452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0452");
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
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException34 = new net.oauth.v2.OAuth2ProblemException("hi!");
        int int35 = oAuth2ProblemException34.getHttpStatusCode();
        net.oauth.v2.OAuth2Exception oAuth2Exception36 = new net.oauth.v2.OAuth2Exception("PUT", (java.lang.Throwable) oAuth2ProblemException34);
        java.lang.Throwable[] throwableArray37 = oAuth2Exception36.getSuppressed();
        oAuth2Client16.setProperty("null  realm=\"2.0\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) throwableArray37);
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 200 + "'", int35 == 200);
        org.junit.Assert.assertNotNull(throwableArray37);
    }

    @Test
    public void test0453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0453");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("2.0", "UTF-8", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str6 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP request", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        java.lang.String str7 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList4);
        org.junit.Assert.assertNotNull(parameterList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "HTTP request" + "'", str6, "HTTP request");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test0454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0454");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList3 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        net.oauth.v2.OAuth2Message oAuth2Message4 = new net.oauth.v2.OAuth2Message("refresh_token", "application/x-www-form-urlencoded", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str5 = oAuth2Message4.method;
        java.lang.String str6 = oAuth2Message4.toString();
        java.lang.String str7 = oAuth2Message4.getCode();
        org.junit.Assert.assertNotNull(parameterList3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "refresh_token" + "'", str5, "refresh_token");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])" + "'", str6, "OAuth2Message(refresh_token, application/x-www-form-urlencoded, [])");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test0455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0455");
        net.oauth.v2.BaseTokenType baseTokenType0 = net.oauth.v2.BaseTokenType.getInstance();
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.OAuth2.TokenType = baseTokenType0;
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        net.oauth.v2.BaseTokenType.addExtension(baseTokenType0);
        org.junit.Assert.assertNotNull(baseTokenType0);
    }

    @Test
    public void test0456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0456");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("username", strArray8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("invalid_scope", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray8);
        java.io.OutputStream outputStream13 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList12, outputStream13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList12);
    }

    @Test
    public void test0457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0457");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor1.code = "\ufffd\n";
        oAuth2Accessor1.state = "response_type";
        java.lang.String str7 = oAuth2Accessor1.code;
        oAuth2Accessor1.state = "assertion";
        oAuth2Accessor1.refreshToken = "OAuth2Message(Authorization-Schesme=token_type, , [])";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\ufffd\n" + "'", str7, "\ufffd\n");
    }

    @Test
    public void test0458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0458");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.tokenType = "OAuth2Message(OAuth2Message(hi!, GET, []), none, [])";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test0459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0459");
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
        java.lang.String str27 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str4, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "token_type" + "'", str11, "token_type");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "token_type" + "'", str13, "token_type");
        org.junit.Assert.assertNull(obj15);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str27, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0460");
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
        oAuth2Accessor1.expires_in = "OAuth2Message(, client_id, [])";
        org.junit.Assert.assertNotNull(oAuth2Accessor14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str16, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(obj19);
    }

    @Test
    public void test0461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0461");
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
        java.lang.Throwable[] throwableArray31 = oAuth2ProblemException24.getSuppressed();
        java.lang.Class<?> wildcardClass32 = throwableArray31.getClass();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 200 + "'", int10 == 200);
        org.junit.Assert.assertNotNull(parameterArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 200 + "'", int26 == 200);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(throwableArray31);
        org.junit.Assert.assertNotNull(wildcardClass32);
    }

    @Test
    public void test0462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0462");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str10 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response", strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str14 = net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str10, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0463");
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
        oAuth2Accessor1.scope = "none?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(oAuth2Client5);
        org.junit.Assert.assertNotNull(strArray16);
        org.junit.Assert.assertNotNull(parameterList17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str18, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0464");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("assertion_type");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "assertion_type" + "'", str1, "assertion_type");
    }

    @Test
    public void test0465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0465");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("", "token_type", "OAuth2Message(hi!, , [])");
        net.oauth.v2.OAuth2Client oAuth2Client5 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor6 = new net.oauth.v2.OAuth2Accessor(oAuth2Client5);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = oAuth2Accessor6.clone();
        oAuth2Client3.setProperty("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str9 = oAuth2Client3.clientSecret;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor10 = new net.oauth.v2.OAuth2Accessor(oAuth2Client3);
        java.lang.String str11 = oAuth2Client3.redirectUri;
        java.lang.String str12 = oAuth2Client3.redirectUri;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test0466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0466");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList15 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParametersAsFragment("hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray10);
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "hi!?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0467");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getKey();
        java.lang.String str5 = parameter2.getKey();
        java.lang.String str6 = parameter2.getValue();
        java.lang.String str7 = parameter2.getValue();
        java.lang.String str8 = parameter2.toString();
        java.lang.String str9 = parameter2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Authorization-Schesme" + "'", str4, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Authorization-Schesme" + "'", str5, "Authorization-Schesme");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "token_type" + "'", str6, "token_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "token_type" + "'", str7, "token_type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Authorization-Schesme=token_type" + "'", str8, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Authorization-Schesme=token_type" + "'", str9, "Authorization-Schesme=token_type");
    }

    @Test
    public void test0468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0468");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("unsupported_grant_type");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0469");
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
    public void test0470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0470");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("Authorization-Schesme", "token_type");
        java.lang.String str3 = parameter2.toString();
        java.lang.String str4 = parameter2.getValue();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Authorization-Schesme=token_type" + "'", str3, "Authorization-Schesme=token_type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "token_type" + "'", str4, "token_type");
    }

    @Test
    public void test0471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0471");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0472");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        java.lang.String str3 = oAuth2Accessor1.tokenType;
        java.lang.String str4 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.accessToken = "";
        java.lang.Object obj8 = oAuth2Accessor1.getProperty("bearer");
        java.lang.Object obj10 = oAuth2Accessor1.getProperty("");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(obj8);
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test0473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0473");
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
        java.lang.String str16 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(obj12);
        org.junit.Assert.assertNull(obj14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str16, "OAuth2Message(hi!, , [])");
    }

    @Test
    public void test0474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0474");
        net.oauth.v2.OAuth2Exception oAuth2Exception1 = new net.oauth.v2.OAuth2Exception("null  realm=\"none%2523net.oauth.v2.OAuth2Exception%253Dscope%2526assertion_type%253Dunsupported_grant_type%2526bearer%253Dbearer\"");
    }

    @Test
    public void test0475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0475");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("invalid_token");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException3 = new net.oauth.v2.OAuth2ProblemException();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException3.getParameters();
        java.lang.Throwable[] throwableArray5 = oAuth2ProblemException3.getSuppressed();
        java.lang.Throwable[] throwableArray6 = oAuth2ProblemException3.getSuppressed();
        net.oauth.v2.OAuth2Exception oAuth2Exception7 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException3);
        java.util.Map<java.lang.String, java.lang.Object> strMap8 = oAuth2ProblemException3.getParameters();
        oAuth2ProblemException1.setParameter("error", (java.lang.Object) oAuth2ProblemException3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = oAuth2ProblemException1.getProblem();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: net.oauth.v2.OAuth2ProblemException cannot be cast to java.lang.String");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(throwableArray5);
        org.junit.Assert.assertNotNull(throwableArray6);
        org.junit.Assert.assertNotNull(strMap8);
    }

    @Test
    public void test0476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0476");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("none%23net.oauth.v2.OAuth2Exception%3Dscope%26assertion_type%3Dunsupported_grant_type%26bearer%3Dbearer", "null  realm=\"null%2520%2520realm%253D%2522invalid_token%2522%3DPOST\"");
    }

    @Test
    public void test0477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0477");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        oAuth2Accessor2.state = "hi!";
        oAuth2Accessor2.setProperty("invalid_grant", (java.lang.Object) "redirect_uri_mismatch");
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
    }

    @Test
    public void test0478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0478");
        net.oauth.v2.BaseResponseType baseResponseType0 = net.oauth.v2.OAuth2.ResponseType;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
        net.oauth.v2.OAuth2.ResponseType = baseResponseType0;
        net.oauth.v2.BaseResponseType.addExtension(baseResponseType0);
// flaky:         org.junit.Assert.assertNotNull(baseResponseType0);
    }

    @Test
    public void test0479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0479");
        java.lang.String[] strArray3 = new java.lang.String[] { "application%2Fx-www-form-urlencoded" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList4 = net.oauth.v2.OAuth2.newList(strArray3);
        java.io.InputStream inputStream5 = null;
        net.oauth.v2.OAuth2Message oAuth2Message6 = new net.oauth.v2.OAuth2Message("null  realm=\"client_secret\"", "username", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList4, inputStream5);
        org.junit.Assert.assertNotNull(strArray3);
        org.junit.Assert.assertNotNull(parameterList4);
    }

    @Test
    public void test0480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0480");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException2 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception3 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException2);
        net.oauth.v2.OAuth2Exception oAuth2Exception4 = new net.oauth.v2.OAuth2Exception();
        oAuth2ProblemException2.addSuppressed((java.lang.Throwable) oAuth2Exception4);
        int int6 = oAuth2ProblemException2.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap7 = oAuth2ProblemException2.getParameters();
        net.oauth.v2.OAuth2Exception oAuth2Exception8 = new net.oauth.v2.OAuth2Exception("client_secret", (java.lang.Throwable) oAuth2ProblemException2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 200 + "'", int6 == 200);
        org.junit.Assert.assertNotNull(strMap7);
    }

    @Test
    public void test0481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0481");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("code");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "code" + "'", str1, "code");
    }

    @Test
    public void test0482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0482");
        boolean boolean1 = net.oauth.v2.OAuth2.isEmpty("net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test0483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0483");
        net.oauth.v2.OAuth2.Parameter[] parameterArray2 = new net.oauth.v2.OAuth2.Parameter[] {};
        java.util.ArrayList<net.oauth.v2.OAuth2.Parameter> parameterList3 = new java.util.ArrayList<net.oauth.v2.OAuth2.Parameter>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3, parameterArray2);
        net.oauth.v2.OAuth2Message oAuth2Message5 = new net.oauth.v2.OAuth2Message("hi!", "", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList3);
        java.lang.String str7 = oAuth2Message5.getHeader("hi!");
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList8 = oAuth2Message5.getHeaders();
        java.lang.String str10 = oAuth2Message5.getHeader("invalid_request");
        java.lang.String str11 = oAuth2Message5.getCode();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList12 = oAuth2Message5.getHeaders();
        java.lang.String str13 = oAuth2Message5.getCode();
        org.junit.Assert.assertNotNull(parameterArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(strEntryList8);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNotNull(strEntryList12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test0484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0484");
        java.lang.String[] strArray8 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList9 = net.oauth.v2.OAuth2.newList(strArray8);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray8);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(hi!, , [])", strArray8);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", strArray8);
        org.junit.Assert.assertNotNull(strArray8);
        org.junit.Assert.assertNotNull(parameterList9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "OAuth2Message(hi!, , [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "HTTP response#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer&net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0485");
        net.oauth.v2.OAuth2.Parameter parameter2 = new net.oauth.v2.OAuth2.Parameter("PUT", "unsupported_grant_type");
        java.lang.String str3 = parameter2.getKey();
        java.lang.String str4 = parameter2.toString();
        java.lang.String str5 = parameter2.getKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "PUT" + "'", str3, "PUT");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "PUT=unsupported_grant_type" + "'", str4, "PUT=unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PUT" + "'", str5, "PUT");
    }

    @Test
    public void test0486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0486");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("client_credentials");
        java.lang.String str2 = net.oauth.v2.OAuth2.decodeCharacters(byteArray1);
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, 108, 105, 101, 110, 116, 95, 99, 114, 101, 100, 101, 110, 116, 105, 97, 108, 115]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "client_credentials" + "'", str2, "client_credentials");
    }

    @Test
    public void test0487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0487");
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList5 = net.oauth.v2.OAuth2Message.decodeAuthorization("");
        java.lang.String str6 = net.oauth.v2.OAuth2.addParameters("unsupported_grant_type", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.lang.String str7 = net.oauth.v2.OAuth2.addParametersAsFragment("username", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        net.oauth.v2.OAuth2Message oAuth2Message8 = new net.oauth.v2.OAuth2Message("", "client_id", (java.util.Collection<net.oauth.v2.OAuth2.Parameter>) parameterList5);
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList9 = oAuth2Message8.getParameters();
        oAuth2Message8.method = "DELETE";
        oAuth2Message8.completeParameters();
        java.util.List<java.util.Map.Entry<java.lang.String, java.lang.String>> strEntryList13 = oAuth2Message8.getHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = oAuth2Message8.getParameterMap();
        org.junit.Assert.assertNotNull(parameterList5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "unsupported_grant_type" + "'", str6, "unsupported_grant_type");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "username" + "'", str7, "username");
        org.junit.Assert.assertNotNull(strEntryList9);
        org.junit.Assert.assertNotNull(strEntryList13);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test0488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0488");
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
        java.lang.Object obj32 = oAuth2Client16.getProperty("null  realm=\"access_denied\"");
        org.junit.Assert.assertNotNull(oAuth2Accessor7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str9, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(oAuth2Accessor20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "OAuth2Message(hi!, , [])" + "'", str22, "OAuth2Message(hi!, , [])");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(throwableArray29);
        org.junit.Assert.assertNull(obj32);
    }

    @Test
    public void test0489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0489");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        net.oauth.v2.OAuth2Accessor oAuth2Accessor2 = oAuth2Accessor1.clone();
        java.lang.Object obj4 = oAuth2Accessor2.getProperty("PUT");
        java.lang.String str5 = oAuth2Accessor2.refreshToken;
        java.lang.Object obj7 = oAuth2Accessor2.getProperty("redirect_uri");
        oAuth2Accessor2.refreshToken = "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer";
        net.oauth.v2.OAuth2Client oAuth2Client10 = oAuth2Accessor2.client;
        oAuth2Accessor2.accessToken = "OAuth2Message(, client_id, [])";
        oAuth2Accessor2.expires_in = "PUT=unsupported_grant_type";
        org.junit.Assert.assertNotNull(oAuth2Accessor2);
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(obj7);
        org.junit.Assert.assertNull(oAuth2Client10);
    }

    @Test
    public void test0490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0490");
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
        java.lang.Throwable[] throwableArray12 = oAuth2ProblemException1.getSuppressed();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 200 + "'", int9 == 200);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
        org.junit.Assert.assertNotNull(throwableArray12);
    }

    @Test
    public void test0491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0491");
        java.lang.String[] strArray11 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList12 = net.oauth.v2.OAuth2.newList(strArray11);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParameters("assertion", strArray11);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray11);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray11);
        java.lang.String str16 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Authorization-Schesme\"", strArray11);
        java.lang.String str17 = net.oauth.v2.OAuth2.addParametersAsFragment("OAuth2Message(POST, refresh_token, [])", strArray11);
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertNotNull(parameterList12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str16, "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str17, "OAuth2Message(POST, refresh_token, [])#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0492");
        java.lang.String[] strArray10 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList11 = net.oauth.v2.OAuth2.newList(strArray10);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParameters("assertion", strArray10);
        java.lang.String str13 = net.oauth.v2.OAuth2.addParametersAsFragment("Location", strArray10);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParameters("error_uri", strArray10);
        java.lang.String str15 = net.oauth.v2.OAuth2.addParameters("null  realm=\"Authorization-Schesme\"", strArray10);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList16 = net.oauth.v2.OAuth2.newList(strArray10);
        java.io.OutputStream outputStream17 = null;
        // The following exception was thrown during execution in test generation
        try {
            net.oauth.v2.OAuth2.formEncode((java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList16, outputStream17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray10);
        org.junit.Assert.assertNotNull(parameterList11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "assertion?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str13, "Location#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "error_uri?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str15, "null  realm=\"Authorization-Schesme\"?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList16);
    }

    @Test
    public void test0493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0493");
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
        java.lang.String str38 = oAuth2ProblemException35.toString();
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 200 + "'", int11 == 200);
        org.junit.Assert.assertNotNull(parameterArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 200 + "'", int27 == 200);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "error_uri" + "'", str36, "error_uri");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "net.oauth.v2.OAuth2ProblemException: error_uri" + "'", str38, "net.oauth.v2.OAuth2ProblemException: error_uri");
    }

    @Test
    public void test0494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0494");
        java.lang.String str1 = net.oauth.v2.OAuth2.decodePercent("null  realm=\"code_and_token\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "null  realm=\"code_and_token\"" + "'", str1, "null  realm=\"code_and_token\"");
    }

    @Test
    public void test0495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0495");
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
        java.lang.String str19 = net.oauth.v2.OAuth2.addParameters("net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList11);
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
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str19, "net.oauth.v2.OAuth2Exception?net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0496");
        net.oauth.v2.OAuth2Client oAuth2Client3 = new net.oauth.v2.OAuth2Client("invalid_client", "error_description", "OAuth2Message(hi!, GET, [])");
        java.lang.String str4 = oAuth2Client3.clientId;
        java.lang.Object obj6 = oAuth2Client3.getProperty("null  realm=\"2.0\"");
        java.lang.String str7 = oAuth2Client3.clientSecret;
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "error_description" + "'", str4, "error_description");
        org.junit.Assert.assertNull(obj6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "OAuth2Message(hi!, GET, [])" + "'", str7, "OAuth2Message(hi!, GET, [])");
    }

    @Test
    public void test0497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0497");
        byte[] byteArray1 = net.oauth.v2.OAuth2.encodeCharacters("client_credentials=net.oauth.v2.OAuth2Exception%3A%20net.oauth.v2.OAuth2ProblemException%3A%20hi%21");
        org.junit.Assert.assertNotNull(byteArray1);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(byteArray1), "[99, 108, 105, 101, 110, 116, 95, 99, 114, 101, 100, 101, 110, 116, 105, 97, 108, 115, 61, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 69, 120, 99, 101, 112, 116, 105, 111, 110, 37, 51, 65, 37, 50, 48, 110, 101, 116, 46, 111, 97, 117, 116, 104, 46, 118, 50, 46, 79, 65, 117, 116, 104, 50, 80, 114, 111, 98, 108, 101, 109, 69, 120, 99, 101, 112, 116, 105, 111, 110, 37, 51, 65, 37, 50, 48, 104, 105, 37, 50, 49]");
    }

    @Test
    public void test0498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0498");
        net.oauth.v2.OAuth2ProblemException oAuth2ProblemException1 = new net.oauth.v2.OAuth2ProblemException("hi!");
        net.oauth.v2.OAuth2Exception oAuth2Exception2 = new net.oauth.v2.OAuth2Exception((java.lang.Throwable) oAuth2ProblemException1);
        int int3 = oAuth2ProblemException1.getHttpStatusCode();
        java.util.Map<java.lang.String, java.lang.Object> strMap4 = oAuth2ProblemException1.getParameters();
        net.oauth.v2.OAuth2Client oAuth2Client6 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor7 = new net.oauth.v2.OAuth2Accessor(oAuth2Client6);
        oAuth2Accessor7.refreshToken = "assertion";
        java.lang.String str10 = oAuth2Accessor7.state;
        oAuth2ProblemException1.setParameter("error_uri", (java.lang.Object) oAuth2Accessor7);
        java.lang.String str12 = oAuth2Accessor7.tokenType;
        java.lang.String str13 = oAuth2Accessor7.refreshToken;
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 200 + "'", int3 == 200);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "assertion" + "'", str13, "assertion");
    }

    @Test
    public void test0499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0499");
        java.lang.String[] strArray9 = new java.lang.String[] { "net.oauth.v2.OAuth2Exception", "scope", "assertion_type", "unsupported_grant_type", "bearer", "bearer" };
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList10 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str11 = net.oauth.v2.OAuth2.addParametersAsFragment("username", strArray9);
        java.lang.String str12 = net.oauth.v2.OAuth2.addParametersAsFragment("invalid_scope", strArray9);
        java.util.List<net.oauth.v2.OAuth2.Parameter> parameterList13 = net.oauth.v2.OAuth2.newList(strArray9);
        java.lang.String str14 = net.oauth.v2.OAuth2.addParametersAsFragment("net.oauth.v2.OAuth2ProblemException: error_uri", (java.lang.Iterable<net.oauth.v2.OAuth2.Parameter>) parameterList13);
        org.junit.Assert.assertNotNull(strArray9);
        org.junit.Assert.assertNotNull(parameterList10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str11, "username#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str12, "invalid_scope#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
        org.junit.Assert.assertNotNull(parameterList13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer" + "'", str14, "net.oauth.v2.OAuth2ProblemException: error_uri#net.oauth.v2.OAuth2Exception=scope&assertion_type=unsupported_grant_type&bearer=bearer");
    }

    @Test
    public void test0500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test0500");
        net.oauth.v2.OAuth2Client oAuth2Client0 = null;
        net.oauth.v2.OAuth2Accessor oAuth2Accessor1 = new net.oauth.v2.OAuth2Accessor(oAuth2Client0);
        java.lang.String str2 = oAuth2Accessor1.tokenType;
        oAuth2Accessor1.tokenType = "response_type";
        oAuth2Accessor1.setProperty("token_type", (java.lang.Object) (byte) 10);
        java.lang.String str8 = oAuth2Accessor1.scope;
        oAuth2Accessor1.tokenType = "";
        java.lang.Object obj12 = oAuth2Accessor1.getProperty("null  realm=\"client_id\"");
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(obj12);
    }
}
