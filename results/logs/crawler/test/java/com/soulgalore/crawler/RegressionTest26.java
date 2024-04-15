package com.soulgalore.crawler;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest26 {

    public static boolean debug = false;

    @Test
    public void test13001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13001");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder7.setMaxLevels(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test13002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13002");
        com.soulgalore.crawler.util.HeaderUtil headerUtil0 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = headerUtil0.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil0.createHeadersFromString("CrawlerURL url:10");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = headerUtil0.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:Wrong content type");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil0.createHeadersFromString("CrawlerURL url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNotNull(headerUtil0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test13003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13003");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder0.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setStartUrl("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setNotOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setOnlyOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setStartUrl("100");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder14.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder14.setStartUrl("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder14.setRequestHeaders("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setNotOnPath("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads type:-1");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test13004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13004");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        boolean boolean15 = crawlerURL14.isWrongSyntax();
        java.lang.String str16 = crawlerURL14.getHost();
        java.net.URI uRI17 = crawlerURL14.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder19.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder19.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration24 = builder19.build();
        int int25 = crawlerConfiguration24.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil26 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean27 = crawlerConfiguration24.equals((java.lang.Object) headerUtil26);
        java.util.Map<java.lang.String, java.lang.String> strMap29 = headerUtil26.createHeadersFromString("CrawlerURL url:-1");
        java.util.Map<java.lang.String, java.lang.String> strMap31 = headerUtil26.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:52 type:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse37 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL14, (int) (byte) 10, strMap31, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:com.soulgalore.crawler.http.socket.timeout type:Malformed url", "AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1", 97L, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:CrawlerURL url:1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain", 308L);
        java.util.Map<java.lang.String, java.lang.String> strMap38 = hTMLPageResponse37.getResponseHeaders();
        java.lang.String str39 = hTMLPageResponse37.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNull(uRI17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(crawlerConfiguration24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(headerUtil26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:CrawlerURL url:1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain" + "'", str39, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:CrawlerURL url:1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
    }

    @Test
    public void test13005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13005");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet15 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet17 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet18 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray23 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL22 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet24 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, crawlerURLArray23);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray27 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet28 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28, hTMLPageResponseArray27);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult30 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, hTMLPageResponseSet26, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28);
        java.lang.String str31 = crawlerResult30.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet32 = crawlerResult30.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet33 = crawlerResult30.getNonWorkingUrls();
        java.lang.String str34 = crawlerResult30.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet35 = crawlerResult30.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray40 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL39 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, crawlerURLArray40);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray44 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet45 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45, hTMLPageResponseArray44);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult47 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, hTMLPageResponseSet43, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45);
        java.lang.String str48 = crawlerResult47.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet49 = crawlerResult47.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = crawlerResult47.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult51 = new com.soulgalore.crawler.core.CrawlerResult("CrawlerURL url:urls.txt", crawlerURLSet18, hTMLPageResponseSet35, hTMLPageResponseSet50);
        java.lang.String str52 = crawlerResult51.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet53 = crawlerResult51.getUrls();
        java.lang.String str54 = crawlerResult51.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet55 = crawlerResult51.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet56 = crawlerResult51.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet57 = crawlerResult51.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet58 = crawlerResult51.getVerifiedURLResponses();
        java.lang.String str59 = crawlerResult51.getTheStartPoint();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet17);
        org.junit.Assert.assertNotNull(crawlerURLSet18);
        org.junit.Assert.assertNotNull(crawlerURLArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet32);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet35);
        org.junit.Assert.assertNotNull(crawlerURLArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet49);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "CrawlerURL url:urls.txt" + "'", str52, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(crawlerURLSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CrawlerURL url:urls.txt" + "'", str54, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet55);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet56);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet57);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "CrawlerURL url:urls.txt" + "'", str59, "CrawlerURL url:urls.txt");
    }

    @Test
    public void test13006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13006");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads type:-1", "HTMLPageResponseurl:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:responseCode:1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:urls.txt type:com.soulgalore.crawler.http.connection.timeout type:AssetResponseCallable url:urls.txt", 0, (long) '#');
    }

    @Test
    public void test13007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13007");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder4.setOnlyOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setStartUrl("Wrong content type");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder12.setNotOnPath("35");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setMaxLevels((int) '#');
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration19 = builder18.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder18.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration22 = builder21.build();
        int int23 = crawlerConfiguration22.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(crawlerConfiguration19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(crawlerConfiguration22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test13008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13008");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setStartUrl("com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setMaxLevels((int) (short) 100);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder12.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder12.setRequestHeaders("CrawlerURL url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder18.setStartUrl("AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setMaxLevels(0);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test13009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13009");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder6.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setNotOnPath("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setOnlyOnPath("CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test13010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13010");
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray0 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet1 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, assetResponseArray0);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray3 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet4 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4, assetResponseArray3);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult6 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet7 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet8 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet9 = assetsVerificationResult6.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet10 = assetsVerificationResult6.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet11 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet12 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet13 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet14 = assetsVerificationResult6.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet15 = null;
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult16 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet14, assetResponseSet15);
        org.junit.Assert.assertNotNull(assetResponseArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assetResponseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assetResponseSet7);
        org.junit.Assert.assertNotNull(assetResponseSet8);
        org.junit.Assert.assertNotNull(assetResponseSet9);
        org.junit.Assert.assertNotNull(assetResponseSet10);
        org.junit.Assert.assertNotNull(assetResponseSet11);
        org.junit.Assert.assertNotNull(assetResponseSet12);
        org.junit.Assert.assertNotNull(assetResponseSet13);
        org.junit.Assert.assertNotNull(assetResponseSet14);
    }

    @Test
    public void test13011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13011");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        boolean boolean22 = hTMLPageResponse12.equals((java.lang.Object) builder21);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder21.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder24.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder26.setNotOnPath("CrawlerURL url:100");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder26.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder30.setStartUrl("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test13012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13012");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:com.soulgalore.crawler.nrofhttpthreads", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:com.soulgalore.crawler.http.socket.timeout type:Malformed url");
        java.net.URI uRI3 = crawlerURL2.getUri();
        org.junit.Assert.assertNull(uRI3);
    }

    @Test
    public void test13013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13013");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("", "com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher5 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL8 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean9 = crawlerURL8.isWrongSyntax();
        java.lang.String str10 = crawlerURL8.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL8, (int) 'a', strMap12, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str19 = hTMLPageResponse18.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = hTMLPageResponse18.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL21 = hTMLPageResponse18.getPageUrl();
        boolean boolean22 = crawlerURL21.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder23.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder23.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration28 = builder23.build();
        java.lang.String str29 = crawlerConfiguration28.getRequestHeaders();
        java.lang.String str30 = crawlerConfiguration28.getRequestHeaders();
        java.lang.String str31 = crawlerConfiguration28.getStartUrl();
        boolean boolean32 = crawlerConfiguration28.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = crawlerConfiguration28.getRequestHeadersMap();
        java.lang.String str34 = crawlerConfiguration28.getNotOnPath();
        boolean boolean35 = crawlerURL21.equals((java.lang.Object) crawlerConfiguration28);
        java.util.Map<java.lang.String, java.lang.String> strMap36 = crawlerConfiguration28.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable38 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Wrong content type", assetFetcher5, strMap36, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:com.soulgalore.crawler.http.socket.timeout type:Malformed url");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse44 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 581, strMap36, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:581encoding:AssetResponseCallable url:result.csv type:CrawlerURL url:CrawlerURL url:errorassets.csv", "AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:32encoding:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 35, "CrawlerURL url:35", 308L);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL45 = hTMLPageResponse44.getPageUrl();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "urls.txt" + "'", str10, "urls.txt");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str19, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNotNull(crawlerURL21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(crawlerConfiguration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(strMap36);
        org.junit.Assert.assertNotNull(crawlerURL45);
    }

    @Test
    public void test13014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13014");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher3 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration9 = builder4.build();
        int int10 = crawlerConfiguration9.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil11 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean12 = crawlerConfiguration9.equals((java.lang.Object) headerUtil11);
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil11.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = headerUtil11.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil11.createHeadersFromString("AssetResponseCallable url:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = headerUtil11.createHeadersFromString("CrawlerURL url:urls.txt");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = headerUtil11.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = headerUtil11.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap26 = headerUtil11.createHeadersFromString("AssetResponseCallable url:Wrong content type");
        java.util.Map<java.lang.String, java.lang.String> strMap28 = headerUtil11.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable30 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:result.csv", assetFetcher3, strMap28, "CrawlerURL url:urls.txt");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable32 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:35", assetFetcher1, strMap28, "CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.auth");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse33 = assetResponseCallable32.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(crawlerConfiguration9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(headerUtil11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap28);
    }

    @Test
    public void test13015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13015");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "Response timed out");
        com.soulgalore.crawler.util.HeaderUtil headerUtil4 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = headerUtil4.createHeadersFromString("");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) '4', strMap6, "com.soulgalore.crawler.http.socket.timeout", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 580, "com.soulgalore.crawler.auth", (long) (short) 1);
        org.jsoup.nodes.Document document13 = hTMLPageResponse12.getBody();
        java.lang.String str15 = hTMLPageResponse12.getHeaderValue("urls.txt");
        java.lang.String str16 = hTMLPageResponse12.getEncoding();
        org.jsoup.nodes.Document document17 = hTMLPageResponse12.getBody();
        int int18 = hTMLPageResponse12.getResponseCode();
        org.jsoup.nodes.Document document19 = hTMLPageResponse12.getBody();
        org.junit.Assert.assertNotNull(headerUtil4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 52 + "'", int18 == 52);
        org.junit.Assert.assertNull(document19);
    }

    @Test
    public void test13016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13016");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.authresponseCode:0encoding:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url type:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:-1encoding:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads type:AssetResponseCallable url:errorassets.csv", "HTMLPageResponseurl:urls.txtresponseCode:100encoding:com.soulgalore.crawler.http.socket.timeout type:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
    }

    @Test
    public void test13017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13017");
        com.soulgalore.crawler.util.AuthUtil authUtil0 = com.soulgalore.crawler.util.AuthUtil.getInstance();
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet2 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet4 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet6 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet8 = authUtil0.createAuthsFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<com.soulgalore.crawler.util.Auth> authSet10 = authUtil0.createAuthsFromString("AssetResponseCallable url:AssetResponseCallable url:1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:AssetResponseCallable url:AssetResponseCallable url:1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(authUtil0);
        org.junit.Assert.assertNotNull(authSet2);
        org.junit.Assert.assertNotNull(authSet4);
        org.junit.Assert.assertNotNull(authSet6);
        org.junit.Assert.assertNotNull(authSet8);
    }

    @Test
    public void test13018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13018");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "Response timed out");
        com.soulgalore.crawler.util.HeaderUtil headerUtil4 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = headerUtil4.createHeadersFromString("");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) '4', strMap6, "com.soulgalore.crawler.http.socket.timeout", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 580, "com.soulgalore.crawler.auth", (long) (short) 1);
        java.lang.String str14 = hTMLPageResponse12.getHeaderValue("errorurls.txt");
        java.lang.String str15 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray20 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL19 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, crawlerURLArray20);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet23 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray24 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet25 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25, hTMLPageResponseArray24);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult27 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, hTMLPageResponseSet23, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25);
        java.lang.String str28 = crawlerResult27.getTheStartPoint();
        java.lang.String str29 = crawlerResult27.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet30 = crawlerResult27.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = crawlerResult27.getNonWorkingUrls();
        boolean boolean32 = hTMLPageResponse12.equals((java.lang.Object) crawlerResult27);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet33 = crawlerResult27.getNonWorkingUrls();
        java.lang.String str34 = crawlerResult27.getTheStartPoint();
        java.lang.String str35 = crawlerResult27.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet36 = crawlerResult27.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet37 = crawlerResult27.getUrls();
        org.junit.Assert.assertNotNull(headerUtil4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "urls.txt" + "'", str15, "urls.txt");
        org.junit.Assert.assertNotNull(crawlerURLArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet30);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi!" + "'", str35, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet36);
        org.junit.Assert.assertNotNull(crawlerURLSet37);
    }

    @Test
    public void test13019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13019");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setMaxLevels(10);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder8.setOnlyOnPath("CrawlerURL url:hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder14.setNotOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setRequestHeaders("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder18.setOnlyOnPath("-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder18.setStartUrl("CrawlerURL url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test13020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13020");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        int int13 = hTMLPageResponse12.getResponseCode();
        int int14 = hTMLPageResponse12.getResponseCode();
        java.lang.String str15 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        int int17 = hTMLPageResponse12.getResponseCode();
        long long18 = hTMLPageResponse12.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = hTMLPageResponse12.getPageUrl();
        java.net.URI uRI20 = crawlerURL19.getUri();
        java.lang.String str21 = crawlerURL19.getReferer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str15, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 97 + "'", int17 == 97);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(crawlerURL19);
        org.junit.Assert.assertNull(uRI20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "urls.txt" + "'", str21, "urls.txt");
    }

    @Test
    public void test13021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13021");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.lang.String str13 = crawlerResult12.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet14 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet15 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray21 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL20 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, crawlerURLArray21);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet24 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray25 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26, hTMLPageResponseArray25);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult28 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, hTMLPageResponseSet24, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26);
        java.lang.String str29 = crawlerResult28.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult28.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = crawlerResult28.getNonWorkingUrls();
        java.lang.String str32 = crawlerResult28.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet33 = crawlerResult28.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL37 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray38 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL37 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet39 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet39, crawlerURLArray38);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet41 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray42 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet43, hTMLPageResponseArray42);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult45 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet39, hTMLPageResponseSet41, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet43);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet46 = crawlerResult45.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet47 = crawlerResult45.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet48 = crawlerResult45.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet49 = crawlerResult45.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = crawlerResult45.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet51 = crawlerResult45.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL55 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray56 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL55 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet57 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet57, crawlerURLArray56);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet59 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray60 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet61 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean62 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet61, hTMLPageResponseArray60);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult63 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet57, hTMLPageResponseSet59, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet61);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet64 = crawlerResult63.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet65 = crawlerResult63.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult66 = new com.soulgalore.crawler.core.CrawlerResult("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", crawlerURLSet33, hTMLPageResponseSet51, hTMLPageResponseSet65);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL70 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray71 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL70 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet72 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet72, crawlerURLArray71);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet74 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray75 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet76 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet76, hTMLPageResponseArray75);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult78 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet72, hTMLPageResponseSet74, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet76);
        java.lang.String str79 = crawlerResult78.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet80 = crawlerResult78.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet81 = crawlerResult78.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult82 = new com.soulgalore.crawler.core.CrawlerResult("HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth", crawlerURLSet15, hTMLPageResponseSet51, hTMLPageResponseSet81);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet83 = crawlerResult82.getVerifiedURLResponses();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet14);
        org.junit.Assert.assertNotNull(crawlerURLSet15);
        org.junit.Assert.assertNotNull(crawlerURLArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet33);
        org.junit.Assert.assertNotNull(crawlerURLArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet46);
        org.junit.Assert.assertNotNull(crawlerURLSet47);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet48);
        org.junit.Assert.assertNotNull(crawlerURLSet49);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet50);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet51);
        org.junit.Assert.assertNotNull(crawlerURLArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray60);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet64);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet65);
        org.junit.Assert.assertNotNull(crawlerURLArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + true + "'", boolean73 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "hi!" + "'", str79, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet80);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet81);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet83);
    }

    @Test
    public void test13022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13022");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setOnlyOnPath("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:52encoding:100 type:com.soulgalore.crawler.http.socket.timeout type:Unknown error");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test13023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13023");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.lang.String str5 = crawlerURL2.getHost();
        java.lang.String str6 = crawlerURL2.getHost();
        java.net.URI uRI7 = crawlerURL2.getUri();
        java.lang.String str8 = crawlerURL2.getUrl();
        boolean boolean9 = crawlerURL2.isWrongSyntax();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRI7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "com.soulgalore.crawler.auth" + "'", str8, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test13024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13024");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL15 = hTMLPageResponse12.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        java.lang.String str17 = hTMLPageResponse12.getResponseType();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = hTMLPageResponse12.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = hTMLPageResponse12.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = hTMLPageResponse12.getResponseHeaders();
        org.jsoup.nodes.Document document21 = hTMLPageResponse12.getBody();
        java.util.Map<java.lang.String, java.lang.String> strMap22 = hTMLPageResponse12.getResponseHeaders();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(crawlerURL15);
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNotNull(crawlerURL19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertNull(document21);
        org.junit.Assert.assertNull(strMap22);
    }

    @Test
    public void test13025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13025");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getUrl();
        boolean boolean15 = hTMLPageResponse12.equals((java.lang.Object) "CrawlerURL url:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        java.lang.String str17 = crawlerURL16.getHost();
        java.net.URI uRI18 = crawlerURL16.getUri();
        java.lang.String str19 = crawlerURL16.toString();
        java.lang.String str20 = crawlerURL16.getUrl();
        java.lang.String str21 = crawlerURL16.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.auth" + "'", str13, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNull(uRI18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.auth" + "'", str19, "CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.soulgalore.crawler.auth" + "'", str20, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.auth" + "'", str21, "com.soulgalore.crawler.auth");
    }

    @Test
    public void test13026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13026");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = crawlerConfiguration5.getRequestHeadersMap();
        java.lang.String str8 = crawlerConfiguration5.getNotOnPath();
        int int9 = crawlerConfiguration5.getMaxLevels();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray10 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet11 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet11, assetResponseArray10);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray13 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet14 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet14, assetResponseArray13);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult16 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet11, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet14);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet17 = assetsVerificationResult16.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet18 = assetsVerificationResult16.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet19 = assetsVerificationResult16.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet20 = assetsVerificationResult16.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray21 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet22, assetResponseArray21);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray24 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet25 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet25, assetResponseArray24);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult27 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet22, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet25);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet28 = assetsVerificationResult27.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet29 = assetsVerificationResult27.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray30 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet31 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31, assetResponseArray30);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray33 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet34 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet34, assetResponseArray33);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult36 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet34);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult37 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet29, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult38 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet20, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31);
        boolean boolean39 = crawlerConfiguration5.equals((java.lang.Object) assetResponseSet31);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray40 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet41, assetResponseArray40);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray43 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet44 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet44, assetResponseArray43);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult46 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet41, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet44);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray47 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet48 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet48, assetResponseArray47);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray50 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet51 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean52 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet51, assetResponseArray50);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult53 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet48, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet51);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet54 = assetsVerificationResult53.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult55 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet44, assetResponseSet54);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet56 = assetsVerificationResult55.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult57 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31, assetResponseSet56);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet58 = assetsVerificationResult57.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet59 = null;
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult60 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet58, assetResponseSet59);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(assetResponseArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(assetResponseArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(assetResponseSet17);
        org.junit.Assert.assertNotNull(assetResponseSet18);
        org.junit.Assert.assertNotNull(assetResponseSet19);
        org.junit.Assert.assertNotNull(assetResponseSet20);
        org.junit.Assert.assertNotNull(assetResponseArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(assetResponseArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(assetResponseSet28);
        org.junit.Assert.assertNotNull(assetResponseSet29);
        org.junit.Assert.assertNotNull(assetResponseArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(assetResponseArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(assetResponseArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(assetResponseArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(assetResponseArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(assetResponseArray50);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(assetResponseSet54);
        org.junit.Assert.assertNotNull(assetResponseSet56);
        org.junit.Assert.assertNotNull(assetResponseSet58);
    }

    @Test
    public void test13027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13027");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = crawlerConfiguration5.getRequestHeadersMap();
        java.lang.String str8 = crawlerConfiguration5.getNotOnPath();
        java.lang.String str9 = crawlerConfiguration5.getRequestHeaders();
        java.lang.String str10 = crawlerConfiguration5.getStartUrl();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13028");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder10.build();
        java.lang.String str16 = crawlerConfiguration15.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration15.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL7, (-1), strMap17, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 100, strMap17, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap30 = hTMLPageResponse29.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL33 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean34 = crawlerURL33.isWrongSyntax();
        java.lang.String str35 = crawlerURL33.getReferer();
        java.lang.String str36 = crawlerURL33.getHost();
        java.lang.String str37 = crawlerURL33.getUrl();
        boolean boolean38 = hTMLPageResponse29.equals((java.lang.Object) crawlerURL33);
        java.lang.String str39 = hTMLPageResponse29.getUrl();
        java.lang.String str40 = hTMLPageResponse29.getUrl();
        java.lang.String str42 = hTMLPageResponse29.getHeaderValue("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.lang.String str43 = hTMLPageResponse29.getUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = hTMLPageResponse29.getResponseHeaders();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "urls.txt" + "'", str35, "urls.txt");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.soulgalore.crawler.auth" + "'", str37, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.soulgalore.crawler.auth" + "'", str39, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "com.soulgalore.crawler.auth" + "'", str40, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "com.soulgalore.crawler.auth" + "'", str43, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(strMap44);
    }

    @Test
    public void test13029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13029");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder13.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = builder13.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder13.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder19.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder21.setOnlyOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder23.setVerifyUrls(false);
        boolean boolean26 = hTMLPageResponse12.equals((java.lang.Object) builder25);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder25.setOnlyOnPath("HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder25.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder25.setMaxLevels((int) ' ');
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder25.setRequestHeaders("CrawlerURL url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder36 = builder25.setNotOnPath("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test13030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13030");
        com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider((int) '#', (int) (short) 0, (int) (byte) 1, "", "AssetResponseCallable url:52");
        org.apache.http.client.HttpClient httpClient6 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient7 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient8 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient9 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient10 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient11 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient12 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient13 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient14 = httpClientProvider5.get();
        org.junit.Assert.assertNotNull(httpClient6);
        org.junit.Assert.assertNotNull(httpClient7);
        org.junit.Assert.assertNotNull(httpClient8);
        org.junit.Assert.assertNotNull(httpClient9);
        org.junit.Assert.assertNotNull(httpClient10);
        org.junit.Assert.assertNotNull(httpClient11);
        org.junit.Assert.assertNotNull(httpClient12);
        org.junit.Assert.assertNotNull(httpClient13);
        org.junit.Assert.assertNotNull(httpClient14);
    }

    @Test
    public void test13031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13031");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", "CrawlerURL url:CrawlerURL url:Response timed out");
    }

    @Test
    public void test13032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13032");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse19 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.proxy", "", (int) (short) -1, (long) 583);
        boolean boolean20 = crawlerURL14.equals((java.lang.Object) assetResponse19);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration25 = builder24.build();
        java.lang.String str26 = crawlerConfiguration25.getOnlyOnPath();
        boolean boolean27 = crawlerConfiguration25.isVerifyUrls();
        int int28 = crawlerConfiguration25.getMaxLevels();
        int int29 = crawlerConfiguration25.getMaxLevels();
        boolean boolean30 = crawlerConfiguration25.isVerifyUrls();
        boolean boolean31 = crawlerConfiguration25.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap32 = crawlerConfiguration25.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = crawlerConfiguration25.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse39 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL14, (int) (byte) 10, strMap33, "", "Malformed url", (long) (short) 10, "hi!", (long) 580);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder41 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder43 = builder41.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration44 = builder43.build();
        java.lang.String str45 = crawlerConfiguration44.getOnlyOnPath();
        boolean boolean46 = crawlerConfiguration44.isVerifyUrls();
        int int47 = crawlerConfiguration44.getMaxLevels();
        int int48 = crawlerConfiguration44.getMaxLevels();
        boolean boolean49 = crawlerConfiguration44.isVerifyUrls();
        boolean boolean50 = crawlerConfiguration44.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap51 = crawlerConfiguration44.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse57 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL14, (int) (byte) 10, strMap51, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", "urls.txt", (long) (short) -1, "", (-1L));
        java.lang.String str58 = hTMLPageResponse57.getEncoding();
        int int59 = hTMLPageResponse57.getResponseCode();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL60 = hTMLPageResponse57.getPageUrl();
        boolean boolean61 = crawlerURL60.isWrongSyntax();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(crawlerConfiguration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(strMap32);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(crawlerConfiguration44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "urls.txt" + "'", str58, "urls.txt");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 10 + "'", int59 == 10);
        org.junit.Assert.assertNotNull(crawlerURL60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + true + "'", boolean61 == true);
    }

    @Test
    public void test13033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13033");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder2.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder2.build();
        int int8 = crawlerConfiguration7.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil9 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean10 = crawlerConfiguration7.equals((java.lang.Object) headerUtil9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = headerUtil9.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil9.createHeadersFromString("CrawlerURL url:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = headerUtil9.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil9.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = headerUtil9.createHeadersFromString("AssetResponseCallable url:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = headerUtil9.createHeadersFromString("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = headerUtil9.createHeadersFromString("CrawlerURL url:AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable26 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Malformed url", assetFetcher1, strMap24, "urls.txt");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(headerUtil9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test13034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13034");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder10.build();
        java.lang.String str16 = crawlerConfiguration15.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration15.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL7, (-1), strMap17, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 100, strMap17, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap31 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse37 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (short) 100, strMap31, "-1", "1", (long) (byte) 10, "com.soulgalore.crawler.nrofhttpthreads", (long) (short) 1);
        int int38 = hTMLPageResponse37.getResponseCode();
        java.lang.String str39 = hTMLPageResponse37.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL40 = hTMLPageResponse37.getPageUrl();
        java.lang.String str41 = crawlerURL40.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder42 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder44 = builder42.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder46 = builder42.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder48 = builder42.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration49 = builder42.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder51 = builder42.setVerifyUrls(false);
        boolean boolean52 = crawlerURL40.equals((java.lang.Object) builder51);
        java.lang.String str53 = crawlerURL40.getUrl();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 100 + "'", int38 == 100);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "1" + "'", str39, "1");
        org.junit.Assert.assertNotNull(crawlerURL40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.auth" + "'", str41, "CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(builder46);
        org.junit.Assert.assertNotNull(builder48);
        org.junit.Assert.assertNotNull(crawlerConfiguration49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "com.soulgalore.crawler.auth" + "'", str53, "com.soulgalore.crawler.auth");
    }

    @Test
    public void test13035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13035");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI2 = crawlerURL1.getUri();
        java.lang.String str3 = crawlerURL1.getUrl();
        java.lang.String str4 = crawlerURL1.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder5.setNotOnPath("AssetResponseCallable url:errorassets.csv");
        boolean boolean12 = crawlerURL1.equals((java.lang.Object) builder11);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder11.setMaxLevels(1);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setOnlyOnPath("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:0 type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder16.setVerifyUrls(true);
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str3, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads" + "'", str4, "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test13036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13036");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder10.build();
        java.lang.String str12 = crawlerConfiguration11.getOnlyOnPath();
        int int13 = crawlerConfiguration11.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test13037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13037");
        com.soulgalore.crawler.util.AuthUtil authUtil0 = com.soulgalore.crawler.util.AuthUtil.getInstance();
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet2 = authUtil0.createAuthsFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<com.soulgalore.crawler.util.Auth> authSet4 = authUtil0.createAuthsFromString("CrawlerURL url:AssetResponseCallable url:CrawlerURL url:AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AssetResponseCallable url\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(authUtil0);
        org.junit.Assert.assertNotNull(authSet2);
    }

    @Test
    public void test13038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13038");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder6.build();
        int int8 = crawlerConfiguration7.getMaxLevels();
        int int9 = crawlerConfiguration7.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test13039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13039");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.lang.String str13 = crawlerResult12.getTheStartPoint();
        java.lang.String str14 = crawlerResult12.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet15 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL21 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray22 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL21 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet23 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet23, crawlerURLArray22);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet25 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray26 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet27 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet27, hTMLPageResponseArray26);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult29 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet23, hTMLPageResponseSet25, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet27);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult29.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet31 = crawlerResult29.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet32 = crawlerResult29.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet33 = crawlerResult29.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet34 = crawlerResult29.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet35 = crawlerResult29.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray40 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL39 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, crawlerURLArray40);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray44 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet45 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45, hTMLPageResponseArray44);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult47 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, hTMLPageResponseSet43, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45);
        java.lang.String str48 = crawlerResult47.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet49 = crawlerResult47.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = crawlerResult47.getNonWorkingUrls();
        java.lang.String str51 = crawlerResult47.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet52 = crawlerResult47.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL56 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray57 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL56 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet58 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet58, crawlerURLArray57);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet60 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray61 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet62 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet62, hTMLPageResponseArray61);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult64 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet58, hTMLPageResponseSet60, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet62);
        java.lang.String str65 = crawlerResult64.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet66 = crawlerResult64.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet67 = crawlerResult64.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult68 = new com.soulgalore.crawler.core.CrawlerResult("CrawlerURL url:urls.txt", crawlerURLSet35, hTMLPageResponseSet52, hTMLPageResponseSet67);
        java.lang.String str69 = crawlerResult68.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet70 = crawlerResult68.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet71 = crawlerResult68.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet72 = crawlerResult68.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet73 = crawlerResult68.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet74 = crawlerResult68.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet75 = crawlerResult68.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet76 = crawlerResult68.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL80 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray81 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL80 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet82 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet82, crawlerURLArray81);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet84 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray85 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet86 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean87 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet86, hTMLPageResponseArray85);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult88 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet82, hTMLPageResponseSet84, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet86);
        java.lang.String str89 = crawlerResult88.getTheStartPoint();
        java.lang.String str90 = crawlerResult88.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet91 = crawlerResult88.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet92 = crawlerResult88.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet93 = crawlerResult88.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet94 = crawlerResult88.getNonWorkingUrls();
        java.lang.String str95 = crawlerResult88.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet96 = crawlerResult88.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet97 = crawlerResult88.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult98 = new com.soulgalore.crawler.core.CrawlerResult("AssetResponseCallable url:CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", crawlerURLSet16, hTMLPageResponseSet76, hTMLPageResponseSet97);
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi!" + "'", str13, "hi!");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "hi!" + "'", str14, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(crawlerURLArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertNotNull(crawlerURLSet31);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet32);
        org.junit.Assert.assertNotNull(crawlerURLSet33);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet34);
        org.junit.Assert.assertNotNull(crawlerURLSet35);
        org.junit.Assert.assertNotNull(crawlerURLArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet49);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet52);
        org.junit.Assert.assertNotNull(crawlerURLArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "hi!" + "'", str65, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet66);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet67);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "CrawlerURL url:urls.txt" + "'", str69, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(crawlerURLSet70);
        org.junit.Assert.assertNotNull(crawlerURLSet71);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet72);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet73);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet74);
        org.junit.Assert.assertNotNull(crawlerURLSet75);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet76);
        org.junit.Assert.assertNotNull(crawlerURLArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + true + "'", boolean83 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray85);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "hi!" + "'", str89, "hi!");
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "hi!" + "'", str90, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet91);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet92);
        org.junit.Assert.assertNotNull(crawlerURLSet93);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet94);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "hi!" + "'", str95, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet96);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet97);
    }

    @Test
    public void test13040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13040");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url", "AssetResponseCallable url:AssetResponseCallable url:Unknown error", (int) (byte) -1, 97L);
        int int5 = assetResponse4.getResponseCode();
        long long6 = assetResponse4.getFetchTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 97L + "'", long6 == 97L);
    }

    @Test
    public void test13041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13041");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration9 = builder8.build();
        java.lang.String str10 = crawlerConfiguration9.getOnlyOnPath();
        java.lang.String str11 = crawlerConfiguration9.getNotOnPath();
        boolean boolean12 = crawlerConfiguration9.isVerifyUrls();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(crawlerConfiguration9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "errorurls.txt" + "'", str11, "errorurls.txt");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13042");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        org.jsoup.nodes.Document document15 = hTMLPageResponse12.getBody();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray16 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet17 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet17, assetResponseArray16);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray19 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet20 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet20, assetResponseArray19);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult22 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet17, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet20);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet23 = assetsVerificationResult22.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet24 = assetsVerificationResult22.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray25 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet26 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet26, assetResponseArray25);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray28 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet29 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet29, assetResponseArray28);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult31 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet26, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet29);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult32 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet24, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet26);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet33 = assetsVerificationResult32.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet34 = assetsVerificationResult32.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet35 = assetsVerificationResult32.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet36 = assetsVerificationResult32.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet37 = assetsVerificationResult32.getWorkingAssets();
        boolean boolean38 = hTMLPageResponse12.equals((java.lang.Object) assetResponseSet37);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray39 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet40 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet40, assetResponseArray39);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray42 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet43 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet43, assetResponseArray42);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult45 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet40, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet43);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet46 = assetsVerificationResult45.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet47 = assetsVerificationResult45.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet48 = assetsVerificationResult45.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult49 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet37, assetResponseSet48);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNull(document15);
        org.junit.Assert.assertNotNull(assetResponseArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(assetResponseArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(assetResponseSet23);
        org.junit.Assert.assertNotNull(assetResponseSet24);
        org.junit.Assert.assertNotNull(assetResponseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(assetResponseArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(assetResponseSet33);
        org.junit.Assert.assertNotNull(assetResponseSet34);
        org.junit.Assert.assertNotNull(assetResponseSet35);
        org.junit.Assert.assertNotNull(assetResponseSet36);
        org.junit.Assert.assertNotNull(assetResponseSet37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(assetResponseArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(assetResponseArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(assetResponseSet46);
        org.junit.Assert.assertNotNull(assetResponseSet47);
        org.junit.Assert.assertNotNull(assetResponseSet48);
    }

    @Test
    public void test13043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13043");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse13 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean14 = assetResponse4.equals((java.lang.Object) 100L);
        java.lang.String str15 = assetResponse4.getReferer();
        java.lang.String str16 = assetResponse4.getReferer();
        long long17 = assetResponse4.getFetchTime();
        int int18 = assetResponse4.getResponseCode();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse23 = new com.soulgalore.crawler.core.assets.AssetResponse("", "Wrong content type", (int) (short) 1, 0L);
        java.lang.String str24 = assetResponse23.getUrl();
        boolean boolean25 = assetResponse4.equals((java.lang.Object) assetResponse23);
        int int26 = assetResponse4.getResponseCode();
        java.lang.String str27 = assetResponse4.getUrl();
        java.lang.String str28 = assetResponse4.getReferer();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL31 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean32 = crawlerURL31.isWrongSyntax();
        java.lang.String str33 = crawlerURL31.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse41 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL31, (int) 'a', strMap35, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        org.jsoup.nodes.Document document42 = hTMLPageResponse41.getBody();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder43 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder45 = builder43.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder47 = builder43.setMaxLevels((int) (short) 0);
        boolean boolean48 = hTMLPageResponse41.equals((java.lang.Object) builder43);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL49 = hTMLPageResponse41.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = hTMLPageResponse41.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL51 = hTMLPageResponse41.getPageUrl();
        boolean boolean52 = assetResponse4.equals((java.lang.Object) hTMLPageResponse41);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL53 = hTMLPageResponse41.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL54 = hTMLPageResponse41.getPageUrl();
        int int55 = hTMLPageResponse41.getResponseCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100" + "'", str28, "100");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "urls.txt" + "'", str33, "urls.txt");
        org.junit.Assert.assertNull(document42);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(crawlerURL49);
        org.junit.Assert.assertNull(strMap50);
        org.junit.Assert.assertNotNull(crawlerURL51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(crawlerURL53);
        org.junit.Assert.assertNotNull(crawlerURL54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 97 + "'", int55 == 97);
    }

    @Test
    public void test13044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13044");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI5 = crawlerURL4.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL9 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean10 = crawlerURL9.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder12.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration17 = builder12.build();
        java.lang.String str18 = crawlerConfiguration17.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = crawlerConfiguration17.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse25 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL9, (-1), strMap19, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse31 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL4, 100, strMap19, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.lang.String str32 = hTMLPageResponse31.getEncoding();
        java.lang.String str33 = hTMLPageResponse31.toString();
        int int34 = hTMLPageResponse31.getResponseCode();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL37 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean38 = crawlerURL37.isWrongSyntax();
        java.lang.String str39 = crawlerURL37.getReferer();
        java.lang.String str40 = crawlerURL37.getHost();
        java.lang.String str41 = crawlerURL37.getUrl();
        java.lang.String str42 = crawlerURL37.getHost();
        java.lang.String str43 = crawlerURL37.getReferer();
        com.soulgalore.crawler.util.HeaderUtil headerUtil45 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = headerUtil45.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap49 = headerUtil45.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap51 = headerUtil45.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse57 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL37, 582, strMap51, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:581encoding:AssetResponseCallable url:result.csv type:CrawlerURL url:CrawlerURL url:errorassets.csv", "urls.txt", (-1L), "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1", (long) 580);
        boolean boolean58 = hTMLPageResponse31.equals((java.lang.Object) "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.util.Map<java.lang.String, java.lang.String> strMap59 = hTMLPageResponse31.getResponseHeaders();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable61 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:Malformed url", assetFetcher1, strMap59, "CrawlerURL url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNull(uRI5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(crawlerConfiguration17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "Malformed url" + "'", str32, "Malformed url");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1" + "'", str33, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 100 + "'", int34 == 100);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "urls.txt" + "'", str39, "urls.txt");
        org.junit.Assert.assertNull(str40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "com.soulgalore.crawler.auth" + "'", str41, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(str42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "urls.txt" + "'", str43, "urls.txt");
        org.junit.Assert.assertNotNull(headerUtil45);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap51);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(strMap59);
    }

    @Test
    public void test13045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13045");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder6.build();
        int int12 = crawlerConfiguration11.getMaxLevels();
        int int13 = crawlerConfiguration11.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test13046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13046");
        com.soulgalore.crawler.util.StatusCode statusCode0 = com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_UNKNOWN;
        java.lang.String str1 = statusCode0.getFriendlyName();
        java.lang.String str2 = statusCode0.getFriendlyName();
        java.lang.String str3 = statusCode0.getFriendlyName();
        int int4 = statusCode0.getCode();
        java.lang.String str5 = statusCode0.getFriendlyName();
        org.junit.Assert.assertTrue("'" + statusCode0 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_UNKNOWN + "'", statusCode0.equals(com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_UNKNOWN));
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Unknown error" + "'", str1, "Unknown error");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Unknown error" + "'", str2, "Unknown error");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Unknown error" + "'", str3, "Unknown error");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 581 + "'", int4 == 581);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Unknown error" + "'", str5, "Unknown error");
    }

    @Test
    public void test13047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13047");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        boolean boolean22 = hTMLPageResponse12.equals((java.lang.Object) builder21);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder21.setOnlyOnPath("10");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration25 = builder24.build();
        java.lang.String str26 = crawlerConfiguration25.getOnlyOnPath();
        java.lang.String str27 = crawlerConfiguration25.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = crawlerConfiguration25.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = crawlerConfiguration25.getRequestHeadersMap();
        java.lang.String str30 = crawlerConfiguration25.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder31 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder33 = builder31.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder35 = builder31.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder37 = builder31.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder39 = builder37.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder41 = builder37.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration42 = builder41.build();
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration43 = builder41.build();
        boolean boolean44 = crawlerConfiguration43.isVerifyUrls();
        boolean boolean45 = crawlerConfiguration43.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = crawlerConfiguration43.getRequestHeadersMap();
        boolean boolean47 = crawlerConfiguration25.equals((java.lang.Object) crawlerConfiguration43);
        java.lang.String str48 = crawlerConfiguration25.getNotOnPath();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(crawlerConfiguration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "10" + "'", str26, "10");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "errorassets.csv" + "'", str30, "errorassets.csv");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(crawlerConfiguration42);
        org.junit.Assert.assertNotNull(crawlerConfiguration43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "errorassets.csv" + "'", str48, "errorassets.csv");
    }

    @Test
    public void test13048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13048");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain", "CrawlerURL url:Response timed out", 10, (long) (byte) 100);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray5 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet6, assetResponseArray5);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray8 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet9 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet9, assetResponseArray8);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult11 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet6, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet9);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet12 = assetsVerificationResult11.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet13 = assetsVerificationResult11.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet14 = assetsVerificationResult11.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet15 = assetsVerificationResult11.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet16 = assetsVerificationResult11.getWorkingAssets();
        boolean boolean17 = assetResponse4.equals((java.lang.Object) assetsVerificationResult11);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder18.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder18.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder24.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder24.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder28.setStartUrl("Response timed out");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder30.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder30.setOnlyOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder36 = builder34.setOnlyOnPath("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder38 = builder36.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration39 = builder38.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder41 = builder38.setOnlyOnPath("AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder43 = builder38.setMaxLevels(32);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder45 = builder43.setOnlyOnPath("35");
        boolean boolean46 = assetResponse4.equals((java.lang.Object) builder45);
        org.junit.Assert.assertNotNull(assetResponseArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(assetResponseArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assetResponseSet12);
        org.junit.Assert.assertNotNull(assetResponseSet13);
        org.junit.Assert.assertNotNull(assetResponseSet14);
        org.junit.Assert.assertNotNull(assetResponseSet15);
        org.junit.Assert.assertNotNull(assetResponseSet16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(crawlerConfiguration39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
    }

    @Test
    public void test13049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13049");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder4.build();
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration6 = builder4.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setRequestHeaders("CrawlerURL url:hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setRequestHeaders("AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder12.setNotOnPath("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:com.soulgalore.crawler.http.socket.timeout type:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder12.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder12.setVerifyUrls(true);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertNotNull(crawlerConfiguration6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test13050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13050");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration8 = builder7.build();
        java.lang.String str9 = crawlerConfiguration8.getStartUrl();
        int int10 = crawlerConfiguration8.getMaxLevels();
        int int11 = crawlerConfiguration8.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration8.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (short) 10, strMap12, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = hTMLPageResponse18.getResponseHeaders();
        java.lang.String str22 = hTMLPageResponse18.getHeaderValue("");
        int int23 = hTMLPageResponse18.getResponseCode();
        java.lang.String str24 = hTMLPageResponse18.getEncoding();
        java.lang.String str25 = hTMLPageResponse18.getResponseType();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(crawlerConfiguration8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 10 + "'", int23 == 10);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str24, "com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str25, "com.soulgalore.crawler.http.connection.timeout");
    }

    @Test
    public void test13051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13051");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setMaxLevels((int) (short) 10);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setNotOnPath("-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("AssetResponseCallable url:AssetResponseCallable url:Wrong content type");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder4.build();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
    }

    @Test
    public void test13052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13052");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.lang.String str4 = crawlerURL3.getReferer();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        int int11 = crawlerConfiguration10.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil12 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean13 = crawlerConfiguration10.equals((java.lang.Object) headerUtil12);
        java.util.Map<java.lang.String, java.lang.String> strMap15 = headerUtil12.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap17 = headerUtil12.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        boolean boolean18 = crawlerURL3.equals((java.lang.Object) headerUtil12);
        java.util.Map<java.lang.String, java.lang.String> strMap20 = headerUtil12.createHeadersFromString("AssetResponseCallable url:errorassets.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = headerUtil12.createHeadersFromString("CrawlerURL url:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable24 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:AssetResponseCallable url:errorassets.csv", assetFetcher1, strMap22, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse25 = assetResponseCallable24.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(headerUtil12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test13053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13053");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse13 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean14 = assetResponse4.equals((java.lang.Object) 100L);
        java.lang.String str15 = assetResponse4.getReferer();
        java.lang.String str16 = assetResponse4.getReferer();
        boolean boolean18 = assetResponse4.equals((java.lang.Object) "com.soulgalore.crawler.proxy");
        long long19 = assetResponse4.getFetchTime();
        long long20 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse25 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int26 = assetResponse25.getResponseCode();
        int int27 = assetResponse25.getResponseCode();
        long long28 = assetResponse25.getFetchTime();
        long long29 = assetResponse25.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse34 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean35 = assetResponse25.equals((java.lang.Object) 100L);
        java.lang.String str36 = assetResponse25.getReferer();
        java.lang.String str37 = assetResponse25.getReferer();
        long long38 = assetResponse25.getFetchTime();
        boolean boolean40 = assetResponse25.equals((java.lang.Object) (-1));
        java.lang.String str41 = assetResponse25.getUrl();
        java.lang.String str42 = assetResponse25.getUrl();
        boolean boolean43 = assetResponse4.equals((java.lang.Object) assetResponse25);
        long long44 = assetResponse25.getFetchTime();
        int int45 = assetResponse25.getResponseCode();
        java.lang.String str46 = assetResponse25.getUrl();
        java.lang.String str47 = assetResponse25.getReferer();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "100" + "'", str36, "100");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "100" + "'", str37, "100");
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 0L + "'", long38 == 0L);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "100" + "'", str47, "100");
    }

    @Test
    public void test13054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13054");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setNotOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setRequestHeaders("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder6.setOnlyOnPath("AssetResponseCallable url:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setMaxLevels((int) '#');
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder12.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
    }

    @Test
    public void test13055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13055");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean15 = hTMLPageResponse12.equals((java.lang.Object) builder14);
        long long16 = hTMLPageResponse12.getFetchTime();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder17.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration24 = builder17.build();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = crawlerConfiguration24.getRequestHeadersMap();
        boolean boolean26 = hTMLPageResponse12.equals((java.lang.Object) crawlerConfiguration24);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = hTMLPageResponse12.getPageUrl();
        boolean boolean28 = crawlerURL27.isWrongSyntax();
        java.lang.String str29 = crawlerURL27.getReferer();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.auth" + "'", str13, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(crawlerConfiguration24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(crawlerURL27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "urls.txt" + "'", str29, "urls.txt");
    }

    @Test
    public void test13056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13056");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder6.build();
        java.lang.String str8 = crawlerConfiguration7.getStartUrl();
        int int9 = crawlerConfiguration7.getMaxLevels();
        java.lang.String str10 = crawlerConfiguration7.getRequestHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray15 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL14 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet16, crawlerURLArray15);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet18 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray19 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet20 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet20, hTMLPageResponseArray19);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult22 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet16, hTMLPageResponseSet18, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet20);
        java.lang.String str23 = crawlerResult22.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet24 = crawlerResult22.getNonWorkingUrls();
        java.lang.String str25 = crawlerResult22.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet26 = crawlerResult22.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet27 = crawlerResult22.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet28 = crawlerResult22.getUrls();
        boolean boolean29 = crawlerConfiguration7.equals((java.lang.Object) crawlerResult22);
        java.lang.String str30 = crawlerResult22.getTheStartPoint();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(crawlerURLArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "hi!" + "'", str23, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "hi!" + "'", str25, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet26);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet27);
        org.junit.Assert.assertNotNull(crawlerURLSet28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
    }

    @Test
    public void test13057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13057");
        com.soulgalore.crawler.util.HeaderUtil headerUtil0 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = headerUtil0.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:Unknown error");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = headerUtil0.createHeadersFromString("CrawlerURL url:CrawlerURL url:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil0.createHeadersFromString("AssetResponseCallable url:97");
        org.junit.Assert.assertNotNull(headerUtil0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test13058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13058");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet15 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray20 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL19 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, crawlerURLArray20);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet23 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray24 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet25 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25, hTMLPageResponseArray24);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult27 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, hTMLPageResponseSet23, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet28 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet29 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = crawlerResult27.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL35 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray36 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL35 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet37 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet37, crawlerURLArray36);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet39 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray40 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet41, hTMLPageResponseArray40);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult43 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet37, hTMLPageResponseSet39, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet41);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet44 = crawlerResult43.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet45 = crawlerResult43.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet46 = crawlerResult43.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet47 = crawlerResult43.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet48 = crawlerResult43.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet49 = crawlerResult43.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult50 = new com.soulgalore.crawler.core.CrawlerResult("Malformed url", crawlerURLSet15, hTMLPageResponseSet31, hTMLPageResponseSet49);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet51 = crawlerResult50.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet52 = crawlerResult50.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet53 = crawlerResult50.getUrls();
        java.lang.String str54 = crawlerResult50.getTheStartPoint();
        java.lang.String str55 = crawlerResult50.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet56 = crawlerResult50.getUrls();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(crawlerURLSet15);
        org.junit.Assert.assertNotNull(crawlerURLArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet28);
        org.junit.Assert.assertNotNull(crawlerURLSet29);
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet31);
        org.junit.Assert.assertNotNull(crawlerURLArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet44);
        org.junit.Assert.assertNotNull(crawlerURLSet45);
        org.junit.Assert.assertNotNull(crawlerURLSet46);
        org.junit.Assert.assertNotNull(crawlerURLSet47);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet48);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet49);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet51);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet52);
        org.junit.Assert.assertNotNull(crawlerURLSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "Malformed url" + "'", str54, "Malformed url");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "Malformed url" + "'", str55, "Malformed url");
        org.junit.Assert.assertNotNull(crawlerURLSet56);
    }

    @Test
    public void test13059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13059");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray18 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL17 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet19 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet19, crawlerURLArray18);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet21 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray22 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet23 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet23, hTMLPageResponseArray22);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult25 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet19, hTMLPageResponseSet21, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet23);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL29 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray30 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL29 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet31 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet31, crawlerURLArray30);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet33 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray34 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet35 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean36 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet35, hTMLPageResponseArray34);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult37 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet31, hTMLPageResponseSet33, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet35);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet38 = crawlerResult37.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet39 = crawlerResult37.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult40 = new com.soulgalore.crawler.core.CrawlerResult("Wrong content type", crawlerURLSet13, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet23, hTMLPageResponseSet39);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet41 = crawlerResult40.getNonWorkingUrls();
        java.lang.String str42 = crawlerResult40.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = crawlerResult40.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet44 = crawlerResult40.getNonWorkingUrls();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray34);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet38);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet39);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Wrong content type" + "'", str42, "Wrong content type");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet43);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet44);
    }

    @Test
    public void test13060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13060");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder2.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder2.build();
        java.lang.String str8 = crawlerConfiguration7.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder9.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration12 = builder11.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder11.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setMaxLevels((int) '4');
        boolean boolean17 = crawlerConfiguration7.equals((java.lang.Object) builder16);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder16.setOnlyOnPath("com.soulgalore.crawler.proxy");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder19.setRequestHeaders("AssetResponseCallable url:errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder19.setRequestHeaders("CrawlerURL url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration24 = builder23.build();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = crawlerConfiguration24.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = crawlerConfiguration24.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable28 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt", assetFetcher1, strMap26, "Redirected to new domain");
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(crawlerConfiguration12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(crawlerConfiguration24);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertNotNull(strMap26);
    }

    @Test
    public void test13061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13061");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setStartUrl("com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration13 = builder12.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder12.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration16 = builder15.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder15.setMaxLevels((int) (short) 10);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setOnlyOnPath("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:errorassets.csv");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(crawlerConfiguration13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(crawlerConfiguration16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test13062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13062");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder2.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder2.build();
        int int8 = crawlerConfiguration7.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil9 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean10 = crawlerConfiguration7.equals((java.lang.Object) headerUtil9);
        java.util.Map<java.lang.String, java.lang.String> strMap12 = headerUtil9.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil9.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = headerUtil9.createHeadersFromString("AssetResponseCallable url:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil9.createHeadersFromString("AssetResponseCallable url:Unknown error");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable20 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", assetFetcher1, strMap18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.lang.String str21 = assetResponseCallable20.toString();
        java.lang.String str22 = assetResponseCallable20.toString();
        java.lang.String str23 = assetResponseCallable20.toString();
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(headerUtil9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str21, "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str22, "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str23, "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
    }

    @Test
    public void test13063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13063");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setOnlyOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setOnlyOnPath("CrawlerURL url:CrawlerURL url:Response timed out");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
    }

    @Test
    public void test13064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13064");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI2 = crawlerURL1.getUri();
        java.lang.String str3 = crawlerURL1.getUrl();
        java.lang.String str4 = crawlerURL1.getHost();
        java.lang.String str5 = crawlerURL1.getUrl();
        java.lang.String str6 = crawlerURL1.getHost();
        boolean boolean7 = crawlerURL1.isWrongSyntax();
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher9 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL12 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI13 = crawlerURL12.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean18 = crawlerURL17.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder20.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder20.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration25 = builder20.build();
        java.lang.String str26 = crawlerConfiguration25.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = crawlerConfiguration25.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse33 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, (-1), strMap27, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse39 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL12, 100, strMap27, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap40 = hTMLPageResponse39.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL43 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean44 = crawlerURL43.isWrongSyntax();
        java.lang.String str45 = crawlerURL43.getReferer();
        java.lang.String str46 = crawlerURL43.getHost();
        java.lang.String str47 = crawlerURL43.getUrl();
        boolean boolean48 = hTMLPageResponse39.equals((java.lang.Object) crawlerURL43);
        java.lang.String str49 = hTMLPageResponse39.getUrl();
        java.lang.String str50 = hTMLPageResponse39.getUrl();
        org.jsoup.nodes.Document document51 = hTMLPageResponse39.getBody();
        java.util.Map<java.lang.String, java.lang.String> strMap52 = hTMLPageResponse39.getResponseHeaders();
        org.jsoup.nodes.Document document53 = hTMLPageResponse39.getBody();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder54 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder56 = builder54.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration57 = builder56.build();
        java.lang.String str58 = crawlerConfiguration57.getStartUrl();
        java.lang.String str59 = crawlerConfiguration57.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap60 = crawlerConfiguration57.getRequestHeadersMap();
        boolean boolean61 = hTMLPageResponse39.equals((java.lang.Object) strMap60);
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable63 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("", assetFetcher9, strMap60, "CrawlerURL url:urls.txt");
        boolean boolean64 = crawlerURL1.equals((java.lang.Object) assetFetcher9);
        java.lang.String str65 = crawlerURL1.getHost();
        java.lang.String str66 = crawlerURL1.toString();
        com.soulgalore.crawler.util.StatusCode statusCode67 = com.soulgalore.crawler.util.StatusCode.SC_WRONG_CONTENT_TYPE;
        java.lang.String str68 = statusCode67.getFriendlyName();
        java.lang.String str69 = statusCode67.getFriendlyName();
        int int70 = statusCode67.getCode();
        int int71 = statusCode67.getCode();
        int int72 = statusCode67.getCode();
        int int73 = statusCode67.getCode();
        int int74 = statusCode67.getCode();
        java.lang.String str75 = statusCode67.getFriendlyName();
        int int76 = statusCode67.getCode();
        boolean boolean77 = crawlerURL1.equals((java.lang.Object) statusCode67);
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str3, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str5, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(uRI13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(crawlerConfiguration25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "urls.txt" + "'", str45, "urls.txt");
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "com.soulgalore.crawler.auth" + "'", str47, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "com.soulgalore.crawler.auth" + "'", str49, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "com.soulgalore.crawler.auth" + "'", str50, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(document51);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertNotNull(builder54);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(crawlerConfiguration57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertNotNull(strMap60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads" + "'", str66, "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertTrue("'" + statusCode67 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_WRONG_CONTENT_TYPE + "'", statusCode67.equals(com.soulgalore.crawler.util.StatusCode.SC_WRONG_CONTENT_TYPE));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "Wrong content type" + "'", str68, "Wrong content type");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "Wrong content type" + "'", str69, "Wrong content type");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 583 + "'", int70 == 583);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 583 + "'", int71 == 583);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 583 + "'", int72 == 583);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 583 + "'", int73 == 583);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 583 + "'", int74 == 583);
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "Wrong content type" + "'", str75, "Wrong content type");
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 583 + "'", int76 == 583);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test13065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13065");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:Wrong content type");
        java.lang.String str2 = crawlerURL1.getReferer();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test13066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13066");
        com.soulgalore.crawler.util.StatusCode statusCode0 = com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_TIMEOUT;
        int int1 = statusCode0.getCode();
        int int2 = statusCode0.getCode();
        java.lang.String str3 = statusCode0.getFriendlyName();
        java.lang.String str4 = statusCode0.getFriendlyName();
        java.lang.String str5 = statusCode0.getFriendlyName();
        int int6 = statusCode0.getCode();
        java.lang.String str7 = statusCode0.getFriendlyName();
        int int8 = statusCode0.getCode();
        int int9 = statusCode0.getCode();
        int int10 = statusCode0.getCode();
        int int11 = statusCode0.getCode();
        java.lang.String str12 = statusCode0.getFriendlyName();
        org.junit.Assert.assertTrue("'" + statusCode0 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_TIMEOUT + "'", statusCode0.equals(com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_TIMEOUT));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 580 + "'", int1 == 580);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 580 + "'", int2 == 580);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Response timed out" + "'", str3, "Response timed out");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Response timed out" + "'", str4, "Response timed out");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Response timed out" + "'", str5, "Response timed out");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Response timed out" + "'", str7, "Response timed out");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 580 + "'", int8 == 580);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 580 + "'", int9 == 580);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 580 + "'", int10 == 580);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 580 + "'", int11 == 580);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Response timed out" + "'", str12, "Response timed out");
    }

    @Test
    public void test13067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13067");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("CrawlerURL url:Response timed out", "errorurls.txt", (int) (byte) 0, (long) 0);
        int int5 = assetResponse4.getResponseCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test13068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13068");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI23 = crawlerURL22.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean28 = crawlerURL27.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder30.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder30.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration35 = builder30.build();
        java.lang.String str36 = crawlerConfiguration35.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = crawlerConfiguration35.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse43 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL27, (-1), strMap37, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse49 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, 100, strMap37, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse55 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (byte) 10, strMap37, "100", "errorassets.csv", (long) (byte) 100, "", (long) (short) 100);
        java.net.URI uRI56 = crawlerURL2.getUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(uRI23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(crawlerConfiguration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNull(uRI56);
    }

    @Test
    public void test13069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13069");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("Response timed out", "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse8 = new com.soulgalore.crawler.core.assets.AssetResponse("hi!", "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (-1), (long) (short) 10);
        java.lang.String str9 = assetResponse8.getReferer();
        boolean boolean10 = crawlerURL2.equals((java.lang.Object) assetResponse8);
        int int11 = assetResponse8.getResponseCode();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str9, "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test13070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13070");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = hTMLPageResponse12.getPageUrl();
        java.lang.String str18 = crawlerURL17.getUrl();
        java.lang.String str19 = crawlerURL17.getUrl();
        java.lang.String str20 = crawlerURL17.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL24 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean25 = crawlerURL24.isWrongSyntax();
        java.lang.String str26 = crawlerURL24.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse34 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL24, (int) 'a', strMap28, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str35 = crawlerURL24.getUrl();
        com.soulgalore.crawler.util.HeaderUtil headerUtil37 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = headerUtil37.createHeadersFromString("");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse45 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL24, (int) (short) 0, strMap39, "com.soulgalore.crawler.http.socket.timeout", "Malformed url", (long) '4', "Unknown error", (long) (byte) 100);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse51 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, 100, strMap39, "AssetResponseCallable url:Malformed url", "", (-1L), "Redirected to new domain", 0L);
        java.lang.String str52 = crawlerURL17.toString();
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher55 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder56 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder58 = builder56.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration59 = builder58.build();
        java.lang.String str60 = crawlerConfiguration59.getStartUrl();
        int int61 = crawlerConfiguration59.getMaxLevels();
        java.lang.String str62 = crawlerConfiguration59.getNotOnPath();
        java.lang.String str63 = crawlerConfiguration59.getStartUrl();
        java.lang.String str64 = crawlerConfiguration59.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap65 = crawlerConfiguration59.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable67 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1", assetFetcher55, strMap65, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse73 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, (int) (byte) 100, strMap65, "AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url", "HTMLPageResponseurl:Wrong content typeresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads type:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url", 100L, "AssetResponseCallable url:10", (long) '4');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(crawlerURL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.soulgalore.crawler.auth" + "'", str18, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.soulgalore.crawler.auth" + "'", str19, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.soulgalore.crawler.auth" + "'", str20, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "urls.txt" + "'", str26, "urls.txt");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "com.soulgalore.crawler.auth" + "'", str35, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(headerUtil37);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.auth" + "'", str52, "CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(crawlerConfiguration59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertNull(str63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertNotNull(strMap65);
    }

    @Test
    public void test13071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13071");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray4 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL3 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet5 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet5, crawlerURLArray4);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet7 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray8 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet9 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet9, hTMLPageResponseArray8);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult11 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet5, hTMLPageResponseSet7, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet9);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet12 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult11.getUrls();
        java.lang.String str15 = crawlerResult11.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet17 = crawlerResult11.getUrls();
        org.junit.Assert.assertNotNull(crawlerURLArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet12);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(crawlerURLSet17);
    }

    @Test
    public void test13072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13072");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder10.build();
        java.lang.String str16 = crawlerConfiguration15.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration15.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL7, (-1), strMap17, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 100, strMap17, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher32 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder33 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder35 = builder33.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder37 = builder33.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder39 = builder33.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration40 = builder33.build();
        java.util.Map<java.lang.String, java.lang.String> strMap41 = crawlerConfiguration40.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable43 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:hi!", assetFetcher32, strMap41, "com.soulgalore.crawler.proxy");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse49 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 580, strMap41, "CrawlerURL url:urls.txt", "97", (long) (byte) -1, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 0);
        boolean boolean50 = crawlerURL2.isWrongSyntax();
        java.lang.String str51 = crawlerURL2.getHost();
        java.lang.String str52 = crawlerURL2.getReferer();
        java.lang.String str53 = crawlerURL2.getHost();
        boolean boolean54 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL58 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI59 = crawlerURL58.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder61 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder63 = builder61.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration64 = builder63.build();
        java.lang.String str65 = crawlerConfiguration64.getStartUrl();
        int int66 = crawlerConfiguration64.getMaxLevels();
        int int67 = crawlerConfiguration64.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap68 = crawlerConfiguration64.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse74 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL58, (int) (short) 10, strMap68, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        int int75 = hTMLPageResponse74.getResponseCode();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder76 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder78 = builder76.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder80 = builder76.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration81 = builder76.build();
        java.lang.String str82 = crawlerConfiguration81.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap83 = crawlerConfiguration81.getRequestHeadersMap();
        boolean boolean84 = crawlerConfiguration81.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap85 = crawlerConfiguration81.getRequestHeadersMap();
        boolean boolean86 = hTMLPageResponse74.equals((java.lang.Object) crawlerConfiguration81);
        int int87 = hTMLPageResponse74.getResponseCode();
        java.util.Map<java.lang.String, java.lang.String> strMap88 = hTMLPageResponse74.getResponseHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap89 = hTMLPageResponse74.getResponseHeaders();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse95 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 10, strMap89, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:308encoding:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:32encoding:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url type:com.soulgalore.crawler.http.connection.timeout", "", (long) 'a', "32", 32L);
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(crawlerConfiguration40);
        org.junit.Assert.assertNotNull(strMap41);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "urls.txt" + "'", str52, "urls.txt");
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(uRI59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(crawlerConfiguration64);
        org.junit.Assert.assertNull(str65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 1 + "'", int66 == 1);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(strMap68);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 10 + "'", int75 == 10);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(crawlerConfiguration81);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "" + "'", str82, "");
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(strMap85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 10 + "'", int87 == 10);
        org.junit.Assert.assertNotNull(strMap88);
        org.junit.Assert.assertNotNull(strMap89);
    }

    @Test
    public void test13073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13073");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("100", "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.lang.String str3 = crawlerURL2.getReferer();
        java.lang.String str4 = crawlerURL2.toString();
        java.lang.String str5 = crawlerURL2.getHost();
        java.lang.String str6 = crawlerURL2.getHost();
        java.net.URI uRI7 = crawlerURL2.getUri();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1" + "'", str3, "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CrawlerURL url:100" + "'", str4, "CrawlerURL url:100");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRI7);
    }

    @Test
    public void test13074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13074");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.lang.String str7 = crawlerConfiguration5.getRequestHeaders();
        boolean boolean9 = crawlerConfiguration5.equals((java.lang.Object) 0.0d);
        boolean boolean10 = crawlerConfiguration5.isVerifyUrls();
        java.lang.String str11 = crawlerConfiguration5.getStartUrl();
        java.lang.String str12 = crawlerConfiguration5.getStartUrl();
        int int13 = crawlerConfiguration5.getMaxLevels();
        java.lang.String str14 = crawlerConfiguration5.getOnlyOnPath();
        int int15 = crawlerConfiguration5.getMaxLevels();
        boolean boolean16 = crawlerConfiguration5.isVerifyUrls();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test13075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13075");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher3 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL6 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean7 = crawlerURL6.isWrongSyntax();
        java.lang.String str8 = crawlerURL6.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse16 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL6, (int) 'a', strMap10, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str17 = hTMLPageResponse16.getEncoding();
        java.lang.String str18 = hTMLPageResponse16.getResponseType();
        java.lang.String str19 = hTMLPageResponse16.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = hTMLPageResponse16.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL24 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "com.soulgalore.crawler.auth");
        java.lang.String str25 = crawlerURL24.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration30 = builder29.build();
        java.lang.String str31 = crawlerConfiguration30.getOnlyOnPath();
        boolean boolean32 = crawlerConfiguration30.isVerifyUrls();
        int int33 = crawlerConfiguration30.getMaxLevels();
        int int34 = crawlerConfiguration30.getMaxLevels();
        boolean boolean35 = crawlerConfiguration30.isVerifyUrls();
        boolean boolean36 = crawlerConfiguration30.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = crawlerConfiguration30.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse43 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL24, 100, strMap37, "Unknown error", "com.soulgalore.crawler.http.socket.timeout", (long) 10, "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads", 0L);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse49 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL20, (int) '4', strMap37, "97", "100", (long) (byte) 1, "com.soulgalore.crawler.http.socket.timeout", (long) (byte) -1);
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable51 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:10", assetFetcher3, strMap37, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable53 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Malformed url", assetFetcher1, strMap37, "AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.lang.String str54 = assetResponseCallable53.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse55 = assetResponseCallable53.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "urls.txt" + "'", str8, "urls.txt");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str17, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "com.soulgalore.crawler.auth" + "'", str19, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURL20);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "CrawlerURL url:urls.txt" + "'", str25, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(crawlerConfiguration30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1 + "'", int34 == 1);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "AssetResponseCallable url:Malformed url" + "'", str54, "AssetResponseCallable url:Malformed url");
    }

    @Test
    public void test13076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13076");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:urls.txt type:", "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1", (int) (byte) 100, 0L);
    }

    @Test
    public void test13077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13077");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("0", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads type:Wrong content type");
        java.lang.String str3 = crawlerURL2.getReferer();
        java.lang.String str4 = crawlerURL2.getReferer();
        boolean boolean5 = crawlerURL2.isWrongSyntax();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads type:Wrong content type" + "'", str3, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads type:Wrong content type");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads type:Wrong content type" + "'", str4, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads type:Wrong content type");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test13078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13078");
        com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider((int) '4', (int) '4', (int) (short) 10, "", "AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
    }

    @Test
    public void test13079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13079");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:hi!responseCode:52encoding:urls.txt type:CrawlerURL url:com.soulgalore.crawler.auth", "AssetResponseCallable url:");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test13080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13080");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        boolean boolean22 = hTMLPageResponse12.equals((java.lang.Object) builder21);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder21.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder21.setMaxLevels((int) (short) 10);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration27 = builder21.build();
        java.lang.String str28 = crawlerConfiguration27.getStartUrl();
        java.lang.String str29 = crawlerConfiguration27.getOnlyOnPath();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(crawlerConfiguration27);
        org.junit.Assert.assertNull(str28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test13081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13081");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = crawlerConfiguration5.getRequestHeadersMap();
        java.lang.String str8 = crawlerConfiguration5.getStartUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder9.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration12 = builder11.build();
        java.lang.String str13 = crawlerConfiguration12.getStartUrl();
        boolean boolean14 = crawlerConfiguration12.isVerifyUrls();
        java.lang.String str15 = crawlerConfiguration12.getOnlyOnPath();
        boolean boolean16 = crawlerConfiguration5.equals((java.lang.Object) str15);
        java.lang.String str17 = crawlerConfiguration5.getStartUrl();
        boolean boolean18 = crawlerConfiguration5.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = crawlerConfiguration5.getRequestHeadersMap();
        int int20 = crawlerConfiguration5.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(crawlerConfiguration12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test13082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13082");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setStartUrl("Response timed out");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setStartUrl("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder16.setStartUrl("10");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder20.setStartUrl("CrawlerURL url:urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setRequestHeaders("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder24.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder24.setMaxLevels((int) 'a');
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
    }

    @Test
    public void test13083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13083");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        boolean boolean22 = hTMLPageResponse12.equals((java.lang.Object) builder21);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder21.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder24.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder26.setNotOnPath("CrawlerURL url:100");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder26.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder26.setRequestHeaders("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration33 = builder26.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder35 = builder26.setStartUrl("32");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration36 = builder35.build();
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration37 = builder35.build();
        java.lang.String str38 = crawlerConfiguration37.getRequestHeaders();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(crawlerConfiguration33);
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(crawlerConfiguration36);
        org.junit.Assert.assertNotNull(crawlerConfiguration37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads" + "'", str38, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads");
    }

    @Test
    public void test13084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13084");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        long long6 = assetResponse4.getFetchTime();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        java.lang.String str9 = assetResponse4.getUrl();
        long long10 = assetResponse4.getFetchTime();
        java.lang.String str11 = assetResponse4.getUrl();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test13085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13085");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.lang.String str5 = crawlerURL2.getReferer();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder7.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder9.build();
        java.lang.String str11 = crawlerConfiguration10.getStartUrl();
        int int12 = crawlerConfiguration10.getMaxLevels();
        int int13 = crawlerConfiguration10.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse20 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (byte) -1, strMap14, "100", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) (short) -1, "com.soulgalore.crawler.nrofhttpthreads", 0L);
        java.lang.String str21 = crawlerURL2.getUrl();
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher24 = null;
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher26 = null;
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher28 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil29 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = headerUtil29.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable33 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher28, strMap31, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable35 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("com.soulgalore.crawler.auth", assetFetcher26, strMap31, "urls.txt");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable37 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:10", assetFetcher24, strMap31, "errorurls.txt");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse43 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (byte) 1, strMap31, "HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (long) 10, "Malformed url", (long) 10);
        org.jsoup.nodes.Document document44 = hTMLPageResponse43.getBody();
        java.lang.String str45 = hTMLPageResponse43.getResponseType();
        org.jsoup.nodes.Document document46 = hTMLPageResponse43.getBody();
        int int47 = hTMLPageResponse43.getResponseCode();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "urls.txt" + "'", str5, "urls.txt");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.auth" + "'", str21, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(headerUtil29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Malformed url" + "'", str45, "Malformed url");
        org.junit.Assert.assertNull(document46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
    }

    @Test
    public void test13086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13086");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI2 = crawlerURL1.getUri();
        java.lang.String str3 = crawlerURL1.getUrl();
        java.lang.String str4 = crawlerURL1.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder6.build();
        java.lang.String str12 = crawlerConfiguration11.getRequestHeaders();
        java.lang.String str13 = crawlerConfiguration11.getRequestHeaders();
        boolean boolean15 = crawlerConfiguration11.equals((java.lang.Object) 0.0d);
        boolean boolean16 = crawlerConfiguration11.isVerifyUrls();
        java.lang.String str17 = crawlerConfiguration11.getStartUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = crawlerConfiguration11.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse24 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL1, 0, strMap18, "10", "Unknown error", (long) (short) -1, "AssetResponseCallable url:Malformed url", (long) 97);
        java.lang.String str25 = hTMLPageResponse24.toString();
        java.lang.String str26 = hTMLPageResponse24.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL29 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean30 = crawlerURL29.isWrongSyntax();
        java.lang.String str31 = crawlerURL29.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse39 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL29, (int) 'a', strMap33, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str40 = hTMLPageResponse39.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL41 = hTMLPageResponse39.getPageUrl();
        long long42 = hTMLPageResponse39.getFetchTime();
        java.lang.String str43 = hTMLPageResponse39.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL46 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI47 = crawlerURL46.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder49 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder51 = builder49.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration52 = builder51.build();
        java.lang.String str53 = crawlerConfiguration52.getStartUrl();
        int int54 = crawlerConfiguration52.getMaxLevels();
        int int55 = crawlerConfiguration52.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap56 = crawlerConfiguration52.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse62 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL46, (int) (short) 10, strMap56, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        boolean boolean63 = hTMLPageResponse39.equals((java.lang.Object) hTMLPageResponse62);
        int int64 = hTMLPageResponse39.getResponseCode();
        boolean boolean65 = hTMLPageResponse24.equals((java.lang.Object) hTMLPageResponse39);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL66 = hTMLPageResponse39.getPageUrl();
        java.lang.String str67 = crawlerURL66.getUrl();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str3, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads" + "'", str4, "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url" + "'", str25, "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str26, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "urls.txt" + "'", str31, "urls.txt");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str40, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 100L + "'", long42 == 100L);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "com.soulgalore.crawler.auth" + "'", str43, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(uRI47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(crawlerConfiguration52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 1 + "'", int55 == 1);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 97 + "'", int64 == 97);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(crawlerURL66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "com.soulgalore.crawler.auth" + "'", str67, "com.soulgalore.crawler.auth");
    }

    @Test
    public void test13087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13087");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration8 = builder7.build();
        java.lang.String str9 = crawlerConfiguration8.getStartUrl();
        int int10 = crawlerConfiguration8.getMaxLevels();
        int int11 = crawlerConfiguration8.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration8.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (short) 10, strMap12, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        java.lang.String str20 = hTMLPageResponse18.getEncoding();
        java.lang.String str21 = hTMLPageResponse18.getResponseType();
        java.lang.String str22 = hTMLPageResponse18.toString();
        java.lang.String str23 = hTMLPageResponse18.toString();
        java.lang.String str24 = hTMLPageResponse18.getUrl();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(crawlerConfiguration8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str20, "com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str21, "com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout" + "'", str22, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout" + "'", str23, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "com.soulgalore.crawler.auth" + "'", str24, "com.soulgalore.crawler.auth");
    }

    @Test
    public void test13088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13088");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder6.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder6.setOnlyOnPath("Wrong content type");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder6.setNotOnPath("CrawlerURL url:hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = builder11.setRequestHeaders("AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder13.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = builder13.setMaxLevels(1);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder13.setOnlyOnPath("AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
    }

    @Test
    public void test13089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13089");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean5 = crawlerURL4.isWrongSyntax();
        java.lang.String str6 = crawlerURL4.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse14 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL4, (int) 'a', strMap8, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str15 = hTMLPageResponse14.getEncoding();
        java.lang.String str16 = hTMLPageResponse14.getResponseType();
        java.lang.String str17 = hTMLPageResponse14.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL18 = hTMLPageResponse14.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "com.soulgalore.crawler.auth");
        java.lang.String str23 = crawlerURL22.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder25.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration28 = builder27.build();
        java.lang.String str29 = crawlerConfiguration28.getOnlyOnPath();
        boolean boolean30 = crawlerConfiguration28.isVerifyUrls();
        int int31 = crawlerConfiguration28.getMaxLevels();
        int int32 = crawlerConfiguration28.getMaxLevels();
        boolean boolean33 = crawlerConfiguration28.isVerifyUrls();
        boolean boolean34 = crawlerConfiguration28.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = crawlerConfiguration28.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse41 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, 100, strMap35, "Unknown error", "com.soulgalore.crawler.http.socket.timeout", (long) 10, "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads", 0L);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse47 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL18, (int) '4', strMap35, "97", "100", (long) (byte) 1, "com.soulgalore.crawler.http.socket.timeout", (long) (byte) -1);
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable49 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("HTMLPageResponseurl:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:responseCode:1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:urls.txt type:com.soulgalore.crawler.http.connection.timeout type:AssetResponseCallable url:urls.txt", assetFetcher1, strMap35, "AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse50 = assetResponseCallable49.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "urls.txt" + "'", str6, "urls.txt");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.soulgalore.crawler.auth" + "'", str17, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURL18);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CrawlerURL url:urls.txt" + "'", str23, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(crawlerConfiguration28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strMap35);
    }

    @Test
    public void test13090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13090");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setOnlyOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setRequestHeaders("CrawlerURL url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setNotOnPath("100");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration17 = builder16.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder16.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder19.setNotOnPath("CrawlerURL url:");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(crawlerConfiguration17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
    }

    @Test
    public void test13091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13091");
        com.soulgalore.crawler.util.HeaderUtil headerUtil0 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = headerUtil0.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil0.createHeadersFromString("CrawlerURL url:-1");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1responseCode:10encoding:result.csv type:97");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil0.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(headerUtil0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
    }

    @Test
    public void test13092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13092");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet15 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet17 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet18 = crawlerResult12.getNonWorkingUrls();
        java.lang.String str19 = crawlerResult12.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet20 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet21 = crawlerResult12.getUrls();
        java.lang.String str22 = crawlerResult12.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet23 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray28 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL27 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet29 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet29, crawlerURLArray28);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray32 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet33 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet33, hTMLPageResponseArray32);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult35 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet29, hTMLPageResponseSet31, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet33);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet36 = crawlerResult35.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet37 = crawlerResult35.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet38 = crawlerResult35.getUrls();
        java.lang.String str39 = crawlerResult35.getTheStartPoint();
        java.lang.String str40 = crawlerResult35.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet41 = crawlerResult35.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet42 = crawlerResult35.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = crawlerResult35.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet44 = null;
        com.soulgalore.crawler.core.CrawlerResult crawlerResult45 = new com.soulgalore.crawler.core.CrawlerResult("AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout", crawlerURLSet23, hTMLPageResponseSet43, hTMLPageResponseSet44);
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(crawlerURLSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet17);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "hi!" + "'", str19, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet20);
        org.junit.Assert.assertNotNull(crawlerURLSet21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "hi!" + "'", str22, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet23);
        org.junit.Assert.assertNotNull(crawlerURLArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet36);
        org.junit.Assert.assertNotNull(crawlerURLSet37);
        org.junit.Assert.assertNotNull(crawlerURLSet38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet41);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet42);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet43);
    }

    @Test
    public void test13093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13093");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        boolean boolean6 = crawlerConfiguration3.equals((java.lang.Object) true);
        java.lang.String str7 = crawlerConfiguration3.getRequestHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL10 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean11 = crawlerURL10.isWrongSyntax();
        java.lang.String str12 = crawlerURL10.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse20 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL10, (int) 'a', strMap14, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder21.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder21.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder21.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder31 = builder29.setOnlyOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder33 = builder31.setVerifyUrls(false);
        boolean boolean34 = hTMLPageResponse20.equals((java.lang.Object) builder33);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder36 = builder33.setOnlyOnPath("HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder38 = builder33.setVerifyUrls(true);
        boolean boolean39 = crawlerConfiguration3.equals((java.lang.Object) true);
        boolean boolean40 = crawlerConfiguration3.isVerifyUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL43 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean44 = crawlerURL43.isWrongSyntax();
        java.lang.String str45 = crawlerURL43.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse53 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL43, (int) 'a', strMap47, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str54 = hTMLPageResponse53.getEncoding();
        long long55 = hTMLPageResponse53.getFetchTime();
        java.lang.String str56 = hTMLPageResponse53.getEncoding();
        java.lang.String str57 = hTMLPageResponse53.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder58 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder60 = builder58.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration61 = builder60.build();
        java.lang.String str62 = crawlerConfiguration61.getOnlyOnPath();
        boolean boolean63 = crawlerConfiguration61.isVerifyUrls();
        int int64 = crawlerConfiguration61.getMaxLevels();
        int int65 = crawlerConfiguration61.getMaxLevels();
        boolean boolean66 = hTMLPageResponse53.equals((java.lang.Object) int65);
        org.jsoup.nodes.Document document67 = hTMLPageResponse53.getBody();
        boolean boolean68 = crawlerConfiguration3.equals((java.lang.Object) document67);
        boolean boolean69 = crawlerConfiguration3.isVerifyUrls();
        java.lang.String str70 = crawlerConfiguration3.getOnlyOnPath();
        java.lang.String str71 = crawlerConfiguration3.getNotOnPath();
        boolean boolean72 = crawlerConfiguration3.isVerifyUrls();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "urls.txt" + "'", str12, "urls.txt");
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "urls.txt" + "'", str45, "urls.txt");
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str54, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 100L + "'", long55 == 100L);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str56, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "com.soulgalore.crawler.auth" + "'", str57, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertNotNull(crawlerConfiguration61);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "" + "'", str62, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + true + "'", boolean63 == true);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 1 + "'", int64 == 1);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNull(document67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
    }

    @Test
    public void test13094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13094");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration8 = builder7.build();
        java.lang.String str9 = crawlerConfiguration8.getStartUrl();
        int int10 = crawlerConfiguration8.getMaxLevels();
        int int11 = crawlerConfiguration8.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration8.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (short) 10, strMap12, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = hTMLPageResponse18.getResponseHeaders();
        java.lang.String str22 = hTMLPageResponse18.getHeaderValue("");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = hTMLPageResponse18.getResponseHeaders();
        java.lang.String str24 = hTMLPageResponse18.getEncoding();
        java.lang.String str26 = hTMLPageResponse18.getHeaderValue("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration30 = builder29.build();
        java.lang.String str31 = crawlerConfiguration30.getStartUrl();
        int int32 = crawlerConfiguration30.getMaxLevels();
        java.lang.String str33 = crawlerConfiguration30.getOnlyOnPath();
        java.lang.String str34 = crawlerConfiguration30.getOnlyOnPath();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder35 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder37 = builder35.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration38 = builder37.build();
        java.lang.String str39 = crawlerConfiguration38.getStartUrl();
        boolean boolean41 = crawlerConfiguration38.equals((java.lang.Object) true);
        java.lang.String str42 = crawlerConfiguration38.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL45 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean46 = crawlerURL45.isWrongSyntax();
        java.lang.String str47 = crawlerURL45.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse55 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL45, (int) 'a', strMap49, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str56 = hTMLPageResponse55.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL57 = hTMLPageResponse55.getPageUrl();
        boolean boolean58 = crawlerConfiguration38.equals((java.lang.Object) crawlerURL57);
        java.lang.String str59 = crawlerConfiguration38.getOnlyOnPath();
        boolean boolean60 = crawlerConfiguration30.equals((java.lang.Object) crawlerConfiguration38);
        boolean boolean61 = hTMLPageResponse18.equals((java.lang.Object) crawlerConfiguration38);
        java.lang.String str62 = crawlerConfiguration38.getStartUrl();
        java.lang.String str63 = crawlerConfiguration38.getOnlyOnPath();
        java.lang.String str64 = crawlerConfiguration38.getStartUrl();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(crawlerConfiguration8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str24, "com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(crawlerConfiguration30);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertNotNull(builder35);
        org.junit.Assert.assertNotNull(builder37);
        org.junit.Assert.assertNotNull(crawlerConfiguration38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "urls.txt" + "'", str47, "urls.txt");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str56, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "" + "'", str59, "");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNull(str62);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNull(str64);
    }

    @Test
    public void test13095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13095");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str16 = hTMLPageResponse12.getResponseType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test13096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13096");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getOnlyOnPath();
        boolean boolean5 = crawlerConfiguration3.isVerifyUrls();
        int int6 = crawlerConfiguration3.getMaxLevels();
        int int7 = crawlerConfiguration3.getMaxLevels();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL10 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean11 = crawlerURL10.isWrongSyntax();
        java.lang.String str12 = crawlerURL10.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse20 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL10, (int) 'a', strMap14, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str21 = hTMLPageResponse20.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean23 = hTMLPageResponse20.equals((java.lang.Object) builder22);
        boolean boolean24 = crawlerConfiguration3.equals((java.lang.Object) builder22);
        java.lang.String str25 = crawlerConfiguration3.getStartUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = crawlerConfiguration3.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = crawlerConfiguration3.getRequestHeadersMap();
        boolean boolean28 = crawlerConfiguration3.isVerifyUrls();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "urls.txt" + "'", str12, "urls.txt");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.auth" + "'", str21, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertNotNull(strMap27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test13097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13097");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getOnlyOnPath();
        boolean boolean5 = crawlerConfiguration3.isVerifyUrls();
        int int6 = crawlerConfiguration3.getMaxLevels();
        int int7 = crawlerConfiguration3.getMaxLevels();
        boolean boolean8 = crawlerConfiguration3.isVerifyUrls();
        boolean boolean9 = crawlerConfiguration3.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = crawlerConfiguration3.getRequestHeadersMap();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL12 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        boolean boolean13 = crawlerConfiguration3.equals((java.lang.Object) crawlerURL12);
        java.lang.String str14 = crawlerConfiguration3.getOnlyOnPath();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean18 = crawlerURL17.isWrongSyntax();
        java.lang.String str19 = crawlerURL17.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse27 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, (int) 'a', strMap21, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str28 = hTMLPageResponse27.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = hTMLPageResponse27.getResponseHeaders();
        java.lang.String str30 = hTMLPageResponse27.getEncoding();
        java.lang.String str31 = hTMLPageResponse27.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL32 = hTMLPageResponse27.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL33 = hTMLPageResponse27.getPageUrl();
        int int34 = hTMLPageResponse27.getResponseCode();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL35 = hTMLPageResponse27.getPageUrl();
        java.lang.String str36 = crawlerURL35.getReferer();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL40 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "Response timed out");
        com.soulgalore.crawler.util.HeaderUtil headerUtil42 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap44 = headerUtil42.createHeadersFromString("");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse50 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL40, (int) '4', strMap44, "com.soulgalore.crawler.http.socket.timeout", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 580, "com.soulgalore.crawler.auth", (long) (short) 1);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse56 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL35, (int) (byte) 1, strMap44, "AssetResponseCallable url:Malformed url", "urls.txt", (long) (byte) 10, "com.soulgalore.crawler.http.connection.timeout", (long) 97);
        java.lang.String str57 = crawlerURL35.getUrl();
        java.net.URI uRI58 = crawlerURL35.getUri();
        java.lang.String str59 = crawlerURL35.getHost();
        java.lang.String str60 = crawlerURL35.getReferer();
        java.net.URI uRI61 = crawlerURL35.getUri();
        com.soulgalore.crawler.util.HeaderUtil headerUtil63 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap65 = headerUtil63.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse71 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL35, 581, strMap65, "Wrong content type", "AssetResponseCallable url:result.csv", (long) (byte) 10, "CrawlerURL url:CrawlerURL url:errorassets.csv", (long) 1);
        boolean boolean72 = crawlerURL35.isWrongSyntax();
        java.lang.String str73 = crawlerURL35.getReferer();
        boolean boolean74 = crawlerConfiguration3.equals((java.lang.Object) crawlerURL35);
        java.net.URI uRI75 = crawlerURL35.getUri();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "urls.txt" + "'", str19, "urls.txt");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str28, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str30, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str31, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(crawlerURL32);
        org.junit.Assert.assertNotNull(crawlerURL33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 97 + "'", int34 == 97);
        org.junit.Assert.assertNotNull(crawlerURL35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "urls.txt" + "'", str36, "urls.txt");
        org.junit.Assert.assertNotNull(headerUtil42);
        org.junit.Assert.assertNotNull(strMap44);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "com.soulgalore.crawler.auth" + "'", str57, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(uRI58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "urls.txt" + "'", str60, "urls.txt");
        org.junit.Assert.assertNull(uRI61);
        org.junit.Assert.assertNotNull(headerUtil63);
        org.junit.Assert.assertNotNull(strMap65);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "urls.txt" + "'", str73, "urls.txt");
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertNull(uRI75);
    }

    @Test
    public void test13098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13098");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("52");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder4.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
    }

    @Test
    public void test13099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13099");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setRequestHeaders("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder8.setNotOnPath("CrawlerURL url:com.soulgalore.crawler.proxy");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder8.setStartUrl("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:32encoding:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder8.setNotOnPath("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setRequestHeaders("CrawlerURL url:CrawlerURL url:CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
    }

    @Test
    public void test13100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13100");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("HTMLPageResponseurl:AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1responseCode:100encoding:AssetResponseCallable url:com.soulgalore.crawler.nrofhttpthreads type:", "CrawlerURL url:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth", 0, 97L);
    }

    @Test
    public void test13101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13101");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        long long20 = hTMLPageResponse18.getFetchTime();
        long long21 = hTMLPageResponse18.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL24 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI25 = crawlerURL24.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL29 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean30 = crawlerURL29.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder32.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder36 = builder32.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration37 = builder32.build();
        java.lang.String str38 = crawlerConfiguration37.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = crawlerConfiguration37.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse45 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL29, (-1), strMap39, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse51 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL24, 100, strMap39, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        boolean boolean52 = hTMLPageResponse18.equals((java.lang.Object) 100);
        org.jsoup.nodes.Document document53 = hTMLPageResponse18.getBody();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL54 = hTMLPageResponse18.getPageUrl();
        java.lang.String str56 = hTMLPageResponse18.getHeaderValue("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder57 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder59 = builder57.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder61 = builder57.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder63 = builder61.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder65 = builder63.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder67 = builder63.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder69 = builder67.setRequestHeaders("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        boolean boolean70 = hTMLPageResponse18.equals((java.lang.Object) builder67);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder72 = builder67.setMaxLevels((int) (byte) 1);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder74 = builder67.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder76 = builder74.setMaxLevels(52);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder78 = builder76.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder80 = builder76.setRequestHeaders("CrawlerURL url:CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 580L + "'", long20 == 580L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 580L + "'", long21 == 580L);
        org.junit.Assert.assertNull(uRI25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(crawlerConfiguration37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertNotNull(crawlerURL54);
        org.junit.Assert.assertNull(str56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(builder72);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
    }

    @Test
    public void test13102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13102");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("10");
        java.lang.String str2 = crawlerURL1.getUrl();
        boolean boolean3 = crawlerURL1.isWrongSyntax();
        java.net.URI uRI4 = crawlerURL1.getUri();
        java.lang.String str5 = crawlerURL1.getReferer();
        java.lang.String str6 = crawlerURL1.getUrl();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "10" + "'", str2, "10");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(uRI4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "10" + "'", str6, "10");
    }

    @Test
    public void test13103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13103");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder0.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder0.setOnlyOnPath("com.soulgalore.crawler.http.socket.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder0.setStartUrl("CrawlerURL url:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = builder11.setStartUrl("97");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder13.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = builder15.setNotOnPath("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setRequestHeaders("AssetResponseCallable url:errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder19.setMaxLevels((int) (byte) 10);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder19.setNotOnPath("AssetResponseCallable url:CrawlerURL url:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder19.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder19.setRequestHeaders("AssetResponseCallable url:hi!");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test13104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13104");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder4.setOnlyOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder4.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder4.build();
        java.lang.String str16 = crawlerConfiguration15.getOnlyOnPath();
        java.lang.String str17 = crawlerConfiguration15.getNotOnPath();
        java.lang.String str18 = crawlerConfiguration15.getStartUrl();
        java.lang.String str19 = crawlerConfiguration15.getStartUrl();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "errorassets.csv" + "'", str16, "errorassets.csv");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain" + "'", str18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain" + "'", str19, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
    }

    @Test
    public void test13105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13105");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
    }

    @Test
    public void test13106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13106");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setOnlyOnPath("-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setStartUrl("Redirected to new domain");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setRequestHeaders("");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test13107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13107");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = crawlerConfiguration5.getRequestHeadersMap();
        boolean boolean8 = crawlerConfiguration5.isVerifyUrls();
        java.lang.String str9 = crawlerConfiguration5.getStartUrl();
        boolean boolean10 = crawlerConfiguration5.isVerifyUrls();
        com.soulgalore.crawler.util.StatusCode statusCode11 = com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_TIMEOUT;
        int int12 = statusCode11.getCode();
        int int13 = statusCode11.getCode();
        java.lang.String str14 = statusCode11.getFriendlyName();
        java.lang.String str15 = statusCode11.getFriendlyName();
        java.lang.String str16 = statusCode11.getFriendlyName();
        boolean boolean17 = crawlerConfiguration5.equals((java.lang.Object) str16);
        java.lang.String str18 = crawlerConfiguration5.getNotOnPath();
        java.lang.String str19 = crawlerConfiguration5.getOnlyOnPath();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + statusCode11 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_TIMEOUT + "'", statusCode11.equals(com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_TIMEOUT));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 580 + "'", int12 == 580);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 580 + "'", int13 == 580);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Response timed out" + "'", str14, "Response timed out");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Response timed out" + "'", str15, "Response timed out");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Response timed out" + "'", str16, "Response timed out");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13108");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder10.build();
        java.lang.String str16 = crawlerConfiguration15.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration15.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL7, (-1), strMap17, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 100, strMap17, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap30 = hTMLPageResponse29.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL33 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean34 = crawlerURL33.isWrongSyntax();
        java.lang.String str35 = crawlerURL33.getReferer();
        java.lang.String str36 = crawlerURL33.getHost();
        java.lang.String str37 = crawlerURL33.getUrl();
        boolean boolean38 = hTMLPageResponse29.equals((java.lang.Object) crawlerURL33);
        java.lang.String str39 = hTMLPageResponse29.getUrl();
        java.lang.String str40 = hTMLPageResponse29.getUrl();
        java.lang.String str41 = hTMLPageResponse29.getResponseType();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL42 = hTMLPageResponse29.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL43 = hTMLPageResponse29.getPageUrl();
        java.lang.String str45 = hTMLPageResponse29.getHeaderValue("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:CrawlerURL url:1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
        long long46 = hTMLPageResponse29.getFetchTime();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "urls.txt" + "'", str35, "urls.txt");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.soulgalore.crawler.auth" + "'", str37, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.soulgalore.crawler.auth" + "'", str39, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "com.soulgalore.crawler.auth" + "'", str40, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "-1" + "'", str41, "-1");
        org.junit.Assert.assertNotNull(crawlerURL42);
        org.junit.Assert.assertNotNull(crawlerURL43);
        org.junit.Assert.assertNull(str45);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + (-1L) + "'", long46 == (-1L));
    }

    @Test
    public void test13109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13109");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        org.jsoup.nodes.Document document13 = hTMLPageResponse12.getBody();
        org.jsoup.nodes.Document document14 = hTMLPageResponse12.getBody();
        com.soulgalore.crawler.util.StatusCode statusCode15 = com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI;
        boolean boolean16 = hTMLPageResponse12.equals((java.lang.Object) statusCode15);
        java.util.Map<java.lang.String, java.lang.String> strMap17 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str18 = hTMLPageResponse12.toString();
        long long19 = hTMLPageResponse12.getFetchTime();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = hTMLPageResponse12.getResponseHeaders();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + statusCode15 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI + "'", statusCode15.equals(com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(strMap20);
    }

    @Test
    public void test13110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13110");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1", "52");
        java.lang.String str3 = crawlerURL2.getUrl();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1" + "'", str3, "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
    }

    @Test
    public void test13111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13111");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "Wrong content type", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        long long6 = assetResponse4.getFetchTime();
        long long7 = assetResponse4.getFetchTime();
        java.lang.String str8 = assetResponse4.getUrl();
        long long9 = assetResponse4.getFetchTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
    }

    @Test
    public void test13112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13112");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        int int5 = crawlerConfiguration3.getMaxLevels();
        java.lang.String str6 = crawlerConfiguration3.getNotOnPath();
        boolean boolean8 = crawlerConfiguration3.equals((java.lang.Object) "Malformed url");
        java.lang.String str9 = crawlerConfiguration3.getNotOnPath();
        boolean boolean10 = crawlerConfiguration3.isVerifyUrls();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse15 = new com.soulgalore.crawler.core.assets.AssetResponse("", "CrawlerURL url:1", (int) (short) 0, (long) (byte) 10);
        long long16 = assetResponse15.getFetchTime();
        boolean boolean17 = crawlerConfiguration3.equals((java.lang.Object) assetResponse15);
        int int18 = assetResponse15.getResponseCode();
        java.lang.String str19 = assetResponse15.getUrl();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test13113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13113");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:com.soulgalore.crawler.auth", "com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher5 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL8 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI9 = crawlerURL8.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = builder11.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration14 = builder13.build();
        java.lang.String str15 = crawlerConfiguration14.getStartUrl();
        int int16 = crawlerConfiguration14.getMaxLevels();
        int int17 = crawlerConfiguration14.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = crawlerConfiguration14.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse24 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL8, (int) (short) 10, strMap18, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable26 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("100", assetFetcher5, strMap18, "errorassets.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse32 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (byte) 0, strMap18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout", "CrawlerURL url:result.csv", (long) (short) 10, "-1", (long) 97);
        java.lang.String str33 = hTMLPageResponse32.toString();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = hTMLPageResponse32.getResponseHeaders();
        long long35 = hTMLPageResponse32.getFetchTime();
        org.junit.Assert.assertNull(uRI9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(crawlerConfiguration14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1" + "'", str33, "HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 97L + "'", long35 == 97L);
    }

    @Test
    public void test13114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13114");
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray0 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet1 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, assetResponseArray0);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray3 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet4 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4, assetResponseArray3);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult6 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet7 = assetsVerificationResult6.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet8 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet9 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet10 = assetsVerificationResult6.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray11 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet12 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet12, assetResponseArray11);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray14 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet15 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet15, assetResponseArray14);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult17 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet12, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet15);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray18 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet19 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet19, assetResponseArray18);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray21 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet22, assetResponseArray21);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult24 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet19, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet22);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet25 = assetsVerificationResult24.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult26 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet15, assetResponseSet25);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet27 = assetsVerificationResult26.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet28 = assetsVerificationResult26.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet29 = assetsVerificationResult26.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet30 = assetsVerificationResult26.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet31 = assetsVerificationResult26.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult32 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet10, assetResponseSet31);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet33 = assetsVerificationResult32.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet34 = assetsVerificationResult32.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray35 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet36 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet36, assetResponseArray35);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray38 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet39 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet39, assetResponseArray38);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult41 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet36, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet39);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet42 = assetsVerificationResult41.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet43 = assetsVerificationResult41.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet44 = assetsVerificationResult41.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet45 = null;
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray46 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet47 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet47, assetResponseArray46);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray49 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet50 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet50, assetResponseArray49);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult52 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet47, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet50);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet53 = assetsVerificationResult52.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray54 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet55 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean56 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet55, assetResponseArray54);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray57 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet58 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean59 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet58, assetResponseArray57);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult60 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet55, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet58);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult61 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet53, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet58);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult62 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet45, assetResponseSet53);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult63 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet44, assetResponseSet53);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet64 = assetsVerificationResult63.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet65 = assetsVerificationResult63.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet66 = assetsVerificationResult63.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet67 = assetsVerificationResult63.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult68 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet34, assetResponseSet67);
        org.junit.Assert.assertNotNull(assetResponseArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assetResponseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assetResponseSet7);
        org.junit.Assert.assertNotNull(assetResponseSet8);
        org.junit.Assert.assertNotNull(assetResponseSet9);
        org.junit.Assert.assertNotNull(assetResponseSet10);
        org.junit.Assert.assertNotNull(assetResponseArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(assetResponseArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(assetResponseArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(assetResponseArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(assetResponseSet25);
        org.junit.Assert.assertNotNull(assetResponseSet27);
        org.junit.Assert.assertNotNull(assetResponseSet28);
        org.junit.Assert.assertNotNull(assetResponseSet29);
        org.junit.Assert.assertNotNull(assetResponseSet30);
        org.junit.Assert.assertNotNull(assetResponseSet31);
        org.junit.Assert.assertNotNull(assetResponseSet33);
        org.junit.Assert.assertNotNull(assetResponseSet34);
        org.junit.Assert.assertNotNull(assetResponseArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(assetResponseArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(assetResponseSet42);
        org.junit.Assert.assertNotNull(assetResponseSet43);
        org.junit.Assert.assertNotNull(assetResponseSet44);
        org.junit.Assert.assertNotNull(assetResponseArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(assetResponseArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(assetResponseSet53);
        org.junit.Assert.assertNotNull(assetResponseArray54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(assetResponseArray57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(assetResponseSet64);
        org.junit.Assert.assertNotNull(assetResponseSet65);
        org.junit.Assert.assertNotNull(assetResponseSet66);
        org.junit.Assert.assertNotNull(assetResponseSet67);
    }

    @Test
    public void test13115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13115");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:32encoding:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:0 type:", (int) (short) 1, (long) (short) 1);
        int int5 = assetResponse4.getResponseCode();
        long long6 = assetResponse4.getFetchTime();
        long long7 = assetResponse4.getFetchTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1L + "'", long6 == 1L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 1L + "'", long7 == 1L);
    }

    @Test
    public void test13116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13116");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        java.lang.String str20 = hTMLPageResponse18.getResponseType();
        java.lang.String str22 = hTMLPageResponse18.getHeaderValue("urls.txt");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL23 = hTMLPageResponse18.getPageUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder24.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder26.setMaxLevels((int) '4');
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder28.setMaxLevels(583);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder28.setOnlyOnPath("Unknown error");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration33 = builder32.build();
        java.lang.String str34 = crawlerConfiguration33.getStartUrl();
        java.lang.String str35 = crawlerConfiguration33.getStartUrl();
        boolean boolean36 = hTMLPageResponse18.equals((java.lang.Object) str35);
        long long37 = hTMLPageResponse18.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL38 = hTMLPageResponse18.getPageUrl();
        java.net.URI uRI39 = crawlerURL38.getUri();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.soulgalore.crawler.auth" + "'", str20, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(crawlerURL23);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(crawlerConfiguration33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 580L + "'", long37 == 580L);
        org.junit.Assert.assertNotNull(crawlerURL38);
        org.junit.Assert.assertNull(uRI39);
    }

    @Test
    public void test13117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13117");
        com.soulgalore.crawler.util.HeaderUtil headerUtil0 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap2 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap4 = headerUtil0.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap6 = headerUtil0.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap8 = headerUtil0.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil0.createHeadersFromString("CrawlerURL url:hi!");
        java.lang.Class<?> wildcardClass11 = headerUtil0.getClass();
        org.junit.Assert.assertNotNull(headerUtil0);
        org.junit.Assert.assertNotNull(strMap2);
        org.junit.Assert.assertNotNull(strMap4);
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test13118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13118");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        long long19 = hTMLPageResponse18.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean23 = crawlerURL22.isWrongSyntax();
        java.lang.String str24 = crawlerURL22.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse32 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, (int) 'a', strMap26, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str33 = hTMLPageResponse32.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean35 = hTMLPageResponse32.equals((java.lang.Object) builder34);
        long long36 = hTMLPageResponse32.getFetchTime();
        boolean boolean37 = hTMLPageResponse18.equals((java.lang.Object) hTMLPageResponse32);
        long long38 = hTMLPageResponse32.getFetchTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 580L + "'", long19 == 580L);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "urls.txt" + "'", str24, "urls.txt");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "com.soulgalore.crawler.auth" + "'", str33, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 100L + "'", long36 == 100L);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 100L + "'", long38 == 100L);
    }

    @Test
    public void test13119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13119");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:CrawlerURL url:urls.txtresponseCode:97encoding:CrawlerURL url:com.soulgalore.crawler.proxy type:", "");
    }

    @Test
    public void test13120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13120");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.toString();
        java.lang.String str14 = hTMLPageResponse12.getResponseType();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        long long17 = hTMLPageResponse12.getFetchTime();
        long long18 = hTMLPageResponse12.getFetchTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str13, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test13121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13121");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        boolean boolean15 = crawlerURL14.isWrongSyntax();
        java.net.URI uRI16 = crawlerURL14.getUri();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse21 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int22 = assetResponse21.getResponseCode();
        int int23 = assetResponse21.getResponseCode();
        long long24 = assetResponse21.getFetchTime();
        long long25 = assetResponse21.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse30 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean31 = assetResponse21.equals((java.lang.Object) 100L);
        java.lang.String str32 = assetResponse21.getReferer();
        long long33 = assetResponse21.getFetchTime();
        java.lang.String str34 = assetResponse21.getReferer();
        long long35 = assetResponse21.getFetchTime();
        java.lang.String str36 = assetResponse21.getUrl();
        boolean boolean37 = crawlerURL14.equals((java.lang.Object) assetResponse21);
        java.lang.String str38 = assetResponse21.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNull(uRI16);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "100" + "'", str32, "100");
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "100" + "'", str34, "100");
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test13122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13122");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.lang.String str2 = crawlerURL1.getReferer();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder3 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = builder3.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder3.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration8 = builder3.build();
        int int9 = crawlerConfiguration8.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil10 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean11 = crawlerConfiguration8.equals((java.lang.Object) headerUtil10);
        java.util.Map<java.lang.String, java.lang.String> strMap13 = headerUtil10.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap15 = headerUtil10.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        boolean boolean16 = crawlerURL1.equals((java.lang.Object) headerUtil10);
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil10.createHeadersFromString("CrawlerURL url:1");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = headerUtil10.createHeadersFromString("CrawlerURL url:35");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = headerUtil10.createHeadersFromString("CrawlerURL url:Redirected to new domain");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = headerUtil10.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(crawlerConfiguration8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(headerUtil10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertNotNull(strMap15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test13123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13123");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        int int5 = crawlerConfiguration3.getMaxLevels();
        int int6 = crawlerConfiguration3.getMaxLevels();
        java.lang.String str7 = crawlerConfiguration3.getNotOnPath();
        int int8 = crawlerConfiguration3.getMaxLevels();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder9.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = builder9.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration14 = builder9.build();
        int int15 = crawlerConfiguration14.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil16 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean17 = crawlerConfiguration14.equals((java.lang.Object) headerUtil16);
        java.util.Map<java.lang.String, java.lang.String> strMap19 = headerUtil16.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap21 = headerUtil16.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.util.Map<java.lang.String, java.lang.String> strMap23 = headerUtil16.createHeadersFromString("AssetResponseCallable url:result.csv");
        boolean boolean24 = crawlerConfiguration3.equals((java.lang.Object) strMap23);
        java.lang.String str25 = crawlerConfiguration3.getRequestHeaders();
        java.lang.String str26 = crawlerConfiguration3.getStartUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL28 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI29 = crawlerURL28.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL32 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean33 = crawlerURL32.isWrongSyntax();
        java.lang.String str34 = crawlerURL32.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap36 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse42 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL32, (int) 'a', strMap36, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str43 = hTMLPageResponse42.getUrl();
        boolean boolean44 = crawlerURL28.equals((java.lang.Object) str43);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher47 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil48 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = headerUtil48.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable52 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher47, strMap50, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse58 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL28, (int) (short) 100, strMap50, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        org.jsoup.nodes.Document document59 = hTMLPageResponse58.getBody();
        long long60 = hTMLPageResponse58.getFetchTime();
        boolean boolean61 = crawlerConfiguration3.equals((java.lang.Object) long60);
        boolean boolean62 = crawlerConfiguration3.isVerifyUrls();
        int int63 = crawlerConfiguration3.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(crawlerConfiguration14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(headerUtil16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strMap19);
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertNotNull(strMap23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNull(uRI29);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "urls.txt" + "'", str34, "urls.txt");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "com.soulgalore.crawler.auth" + "'", str43, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(headerUtil48);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNull(document59);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 100L + "'", long60 == 100L);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 1 + "'", int63 == 1);
    }

    @Test
    public void test13124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13124");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse6 = new com.soulgalore.crawler.core.assets.AssetResponse("Unknown error", "CrawlerURL url:urls.txt", 583, (long) 10);
        com.soulgalore.crawler.util.StatusCode statusCode7 = com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI;
        java.lang.String str8 = statusCode7.getFriendlyName();
        boolean boolean9 = assetResponse6.equals((java.lang.Object) statusCode7);
        boolean boolean10 = crawlerURL1.equals((java.lang.Object) statusCode7);
        java.lang.String str11 = crawlerURL1.getHost();
        boolean boolean12 = crawlerURL1.isWrongSyntax();
        org.junit.Assert.assertTrue("'" + statusCode7 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI + "'", statusCode7.equals(com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI));
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Malformed url" + "'", str8, "Malformed url");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test13125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13125");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        long long14 = hTMLPageResponse12.getFetchTime();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration20 = builder19.build();
        java.lang.String str21 = crawlerConfiguration20.getOnlyOnPath();
        boolean boolean22 = crawlerConfiguration20.isVerifyUrls();
        int int23 = crawlerConfiguration20.getMaxLevels();
        int int24 = crawlerConfiguration20.getMaxLevels();
        boolean boolean25 = hTMLPageResponse12.equals((java.lang.Object) int24);
        org.jsoup.nodes.Document document26 = hTMLPageResponse12.getBody();
        long long27 = hTMLPageResponse12.getFetchTime();
        org.jsoup.nodes.Document document28 = hTMLPageResponse12.getBody();
        long long29 = hTMLPageResponse12.getFetchTime();
        java.lang.String str30 = hTMLPageResponse12.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.soulgalore.crawler.auth" + "'", str16, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(crawlerConfiguration20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(document26);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 100L + "'", long27 == 100L);
        org.junit.Assert.assertNull(document28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 100L + "'", long29 == 100L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str30, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
    }

    @Test
    public void test13126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13126");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setOnlyOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder0.setRequestHeaders("AssetResponseCallable url:AssetResponseCallable url:97");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder0.setOnlyOnPath("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder0.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = builder0.setNotOnPath("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertNotNull(builder13);
    }

    @Test
    public void test13127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13127");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL6 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI7 = crawlerURL6.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL10 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean11 = crawlerURL10.isWrongSyntax();
        java.lang.String str12 = crawlerURL10.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse20 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL10, (int) 'a', strMap14, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str21 = hTMLPageResponse20.getUrl();
        boolean boolean22 = crawlerURL6.equals((java.lang.Object) str21);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher25 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil26 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = headerUtil26.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable30 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher25, strMap28, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse36 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL6, (int) (short) 100, strMap28, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse42 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL3, (int) (short) -1, strMap28, "com.soulgalore.crawler.http.socket.timeout", "errorurls.txt", (long) 100, "result.csv", (long) (short) 0);
        org.jsoup.nodes.Document document43 = hTMLPageResponse42.getBody();
        int int44 = hTMLPageResponse42.getResponseCode();
        java.lang.String str46 = hTMLPageResponse42.getHeaderValue("AssetResponseCallable url:com.soulgalore.crawler.auth");
        int int47 = hTMLPageResponse42.getResponseCode();
        long long48 = hTMLPageResponse42.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL49 = hTMLPageResponse42.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = hTMLPageResponse42.getResponseHeaders();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable52 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:0encoding:Wrong content type type:com.soulgalore.crawler.http.connection.timeout", assetFetcher1, strMap50, "AssetResponseCallable url:com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(uRI7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "urls.txt" + "'", str12, "urls.txt");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.auth" + "'", str21, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerUtil26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNull(document43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + (-1) + "'", int44 == (-1));
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(crawlerURL49);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test13128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13128");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder4.build();
        java.lang.String str8 = crawlerConfiguration7.getNotOnPath();
        java.lang.String str9 = crawlerConfiguration7.getStartUrl();
        java.lang.String str10 = crawlerConfiguration7.getStartUrl();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test13129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13129");
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray0 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet1 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, assetResponseArray0);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray3 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet4 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4, assetResponseArray3);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult6 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet7 = assetsVerificationResult6.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray8 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet9 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet9, assetResponseArray8);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray11 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet12 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet12, assetResponseArray11);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult14 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet9, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet12);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult15 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet7, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet12);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet16 = assetsVerificationResult15.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet17 = assetsVerificationResult15.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray18 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet19 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet19, assetResponseArray18);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray21 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet22, assetResponseArray21);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult24 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet19, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet22);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet25 = assetsVerificationResult24.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult26 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet17, assetResponseSet25);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet27 = assetsVerificationResult26.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet28 = assetsVerificationResult26.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray29 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet30 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet30, assetResponseArray29);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray32 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet33 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet33, assetResponseArray32);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult35 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet30, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet33);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet36 = assetsVerificationResult35.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet37 = assetsVerificationResult35.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet38 = assetsVerificationResult35.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet39 = assetsVerificationResult35.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray40 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet41, assetResponseArray40);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray43 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet44 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet44, assetResponseArray43);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult46 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet41, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet44);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet47 = assetsVerificationResult46.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult48 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet39, assetResponseSet47);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet49 = assetsVerificationResult48.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet50 = assetsVerificationResult48.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet51 = assetsVerificationResult48.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult52 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet28, assetResponseSet51);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray53 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet54 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean55 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet54, assetResponseArray53);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray56 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet57 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean58 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet57, assetResponseArray56);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult59 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet54, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet57);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet60 = assetsVerificationResult59.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet61 = assetsVerificationResult59.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet62 = assetsVerificationResult59.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet63 = assetsVerificationResult59.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray64 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet65 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean66 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet65, assetResponseArray64);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray67 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet68 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean69 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet68, assetResponseArray67);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult70 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet65, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet68);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet71 = assetsVerificationResult70.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet72 = assetsVerificationResult70.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray73 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet74 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet74, assetResponseArray73);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray76 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet77 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet77, assetResponseArray76);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult79 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet74, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet77);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult80 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet72, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet74);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray81 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet82 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean83 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet82, assetResponseArray81);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray84 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet85 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean86 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet85, assetResponseArray84);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult87 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet82, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet85);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet88 = assetsVerificationResult87.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult89 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet72, assetResponseSet88);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet90 = assetsVerificationResult89.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet91 = assetsVerificationResult89.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet92 = assetsVerificationResult89.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult93 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet63, assetResponseSet92);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult94 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet28, assetResponseSet92);
        org.junit.Assert.assertNotNull(assetResponseArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assetResponseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assetResponseSet7);
        org.junit.Assert.assertNotNull(assetResponseArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(assetResponseArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(assetResponseSet16);
        org.junit.Assert.assertNotNull(assetResponseSet17);
        org.junit.Assert.assertNotNull(assetResponseArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(assetResponseArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(assetResponseSet25);
        org.junit.Assert.assertNotNull(assetResponseSet27);
        org.junit.Assert.assertNotNull(assetResponseSet28);
        org.junit.Assert.assertNotNull(assetResponseArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(assetResponseArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(assetResponseSet36);
        org.junit.Assert.assertNotNull(assetResponseSet37);
        org.junit.Assert.assertNotNull(assetResponseSet38);
        org.junit.Assert.assertNotNull(assetResponseSet39);
        org.junit.Assert.assertNotNull(assetResponseArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(assetResponseArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(assetResponseSet47);
        org.junit.Assert.assertNotNull(assetResponseSet49);
        org.junit.Assert.assertNotNull(assetResponseSet50);
        org.junit.Assert.assertNotNull(assetResponseSet51);
        org.junit.Assert.assertNotNull(assetResponseArray53);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(assetResponseArray56);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(assetResponseSet60);
        org.junit.Assert.assertNotNull(assetResponseSet61);
        org.junit.Assert.assertNotNull(assetResponseSet62);
        org.junit.Assert.assertNotNull(assetResponseSet63);
        org.junit.Assert.assertNotNull(assetResponseArray64);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(assetResponseArray67);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(assetResponseSet71);
        org.junit.Assert.assertNotNull(assetResponseSet72);
        org.junit.Assert.assertNotNull(assetResponseArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(assetResponseArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(assetResponseArray81);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(assetResponseArray84);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(assetResponseSet88);
        org.junit.Assert.assertNotNull(assetResponseSet90);
        org.junit.Assert.assertNotNull(assetResponseSet91);
        org.junit.Assert.assertNotNull(assetResponseSet92);
    }

    @Test
    public void test13130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13130");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder10.build();
        java.lang.String str16 = crawlerConfiguration15.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration15.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL7, (-1), strMap17, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 100, strMap17, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap30 = hTMLPageResponse29.getResponseHeaders();
        org.jsoup.nodes.Document document31 = hTMLPageResponse29.getBody();
        org.jsoup.nodes.Document document32 = hTMLPageResponse29.getBody();
        java.lang.String str33 = hTMLPageResponse29.toString();
        java.lang.String str34 = hTMLPageResponse29.getResponseType();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL35 = hTMLPageResponse29.getPageUrl();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNull(document32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1" + "'", str33, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "-1" + "'", str34, "-1");
        org.junit.Assert.assertNotNull(crawlerURL35);
    }

    @Test
    public void test13131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13131");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.lang.String str5 = crawlerURL2.getHost();
        java.lang.String str6 = crawlerURL2.getUrl();
        java.lang.String str7 = crawlerURL2.getHost();
        boolean boolean8 = crawlerURL2.isWrongSyntax();
        java.lang.String str9 = crawlerURL2.getReferer();
        java.net.URI uRI10 = crawlerURL2.getUri();
        java.lang.String str11 = crawlerURL2.getHost();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "com.soulgalore.crawler.auth" + "'", str6, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "urls.txt" + "'", str9, "urls.txt");
        org.junit.Assert.assertNull(uRI10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13132");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        long long6 = assetResponse4.getFetchTime();
        int int7 = assetResponse4.getResponseCode();
        long long8 = assetResponse4.getFetchTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 0L + "'", long6 == 0L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test13133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13133");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = crawlerConfiguration5.getRequestHeadersMap();
        java.lang.String str8 = crawlerConfiguration5.getNotOnPath();
        boolean boolean9 = crawlerConfiguration5.isVerifyUrls();
        boolean boolean10 = crawlerConfiguration5.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = crawlerConfiguration5.getRequestHeadersMap();
        int int12 = crawlerConfiguration5.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test13134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13134");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = hTMLPageResponse12.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        org.jsoup.nodes.Document document17 = hTMLPageResponse12.getBody();
        java.lang.String str18 = hTMLPageResponse12.getResponseType();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = hTMLPageResponse12.getPageUrl();
        java.lang.String str20 = hTMLPageResponse12.getUrl();
        java.lang.String str21 = hTMLPageResponse12.getResponseType();
        org.jsoup.nodes.Document document22 = hTMLPageResponse12.getBody();
        long long23 = hTMLPageResponse12.getFetchTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertNull(document17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(crawlerURL19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.soulgalore.crawler.auth" + "'", str20, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNull(document22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
    }

    @Test
    public void test13135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13135");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        java.lang.String str20 = hTMLPageResponse18.getHeaderValue("CrawlerURL url:hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder21.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder21.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder25.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setNotOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder31 = builder27.setMaxLevels((int) (byte) -1);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration32 = builder31.build();
        boolean boolean33 = hTMLPageResponse18.equals((java.lang.Object) builder31);
        long long34 = hTMLPageResponse18.getFetchTime();
        java.lang.String str35 = hTMLPageResponse18.getUrl();
        java.lang.String str36 = hTMLPageResponse18.getResponseType();
        org.jsoup.nodes.Document document37 = hTMLPageResponse18.getBody();
        java.lang.String str39 = hTMLPageResponse18.getHeaderValue("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:com.soulgalore.crawler.http.socket.timeout type:Malformed url");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(crawlerConfiguration32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 580L + "'", long34 == 580L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "com.soulgalore.crawler.auth" + "'", str35, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "com.soulgalore.crawler.auth" + "'", str36, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(document37);
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test13136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13136");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI23 = crawlerURL22.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean28 = crawlerURL27.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder30.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder30.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration35 = builder30.build();
        java.lang.String str36 = crawlerConfiguration35.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = crawlerConfiguration35.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse43 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL27, (-1), strMap37, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse49 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, 100, strMap37, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse55 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (byte) 10, strMap37, "100", "errorassets.csv", (long) (byte) 100, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = hTMLPageResponse55.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder57 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder59 = builder57.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration60 = builder59.build();
        java.lang.String str61 = crawlerConfiguration60.getStartUrl();
        boolean boolean62 = crawlerConfiguration60.isVerifyUrls();
        java.lang.String str63 = crawlerConfiguration60.getNotOnPath();
        java.lang.String str64 = crawlerConfiguration60.getRequestHeaders();
        boolean boolean65 = hTMLPageResponse55.equals((java.lang.Object) crawlerConfiguration60);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL67 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:Unknown error");
        boolean boolean68 = crawlerConfiguration60.equals((java.lang.Object) "AssetResponseCallable url:Unknown error");
        java.util.Map<java.lang.String, java.lang.String> strMap69 = crawlerConfiguration60.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap70 = crawlerConfiguration60.getRequestHeadersMap();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(uRI23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(crawlerConfiguration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(crawlerConfiguration60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "" + "'", str64, "");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strMap69);
        org.junit.Assert.assertNotNull(strMap70);
    }

    @Test
    public void test13137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13137");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.proxy", "", (int) (short) -1, (long) 583);
        java.lang.String str5 = assetResponse4.getReferer();
        long long6 = assetResponse4.getFetchTime();
        int int7 = assetResponse4.getResponseCode();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 583L + "'", long6 == 583L);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test13138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13138");
        com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider((int) (byte) 10, 100, (int) (byte) -1, "", "CrawlerURL url:CrawlerURL url:CrawlerURL url:errorassets.csv");
        org.apache.http.client.HttpClient httpClient6 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient7 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient8 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient9 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient10 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient11 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient12 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient13 = httpClientProvider5.get();
        org.apache.http.client.HttpClient httpClient14 = httpClientProvider5.get();
        org.junit.Assert.assertNotNull(httpClient6);
        org.junit.Assert.assertNotNull(httpClient7);
        org.junit.Assert.assertNotNull(httpClient8);
        org.junit.Assert.assertNotNull(httpClient9);
        org.junit.Assert.assertNotNull(httpClient10);
        org.junit.Assert.assertNotNull(httpClient11);
        org.junit.Assert.assertNotNull(httpClient12);
        org.junit.Assert.assertNotNull(httpClient13);
        org.junit.Assert.assertNotNull(httpClient14);
    }

    @Test
    public void test13139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13139");
        com.soulgalore.crawler.util.AuthUtil authUtil0 = com.soulgalore.crawler.util.AuthUtil.getInstance();
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet2 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet4 = authUtil0.createAuthsFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<com.soulgalore.crawler.util.Auth> authSet6 = authUtil0.createAuthsFromString("com.soulgalore.crawler.http.socket.timeout");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:com.soulgalore.crawler.http.socket.timeout");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(authUtil0);
        org.junit.Assert.assertNotNull(authSet2);
        org.junit.Assert.assertNotNull(authSet4);
    }

    @Test
    public void test13140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13140");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder7.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder9.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder9.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setMaxLevels((int) '4');
        boolean boolean15 = crawlerConfiguration5.equals((java.lang.Object) builder14);
        boolean boolean16 = crawlerConfiguration5.isVerifyUrls();
        java.lang.String str17 = crawlerConfiguration5.getStartUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean21 = crawlerURL20.isWrongSyntax();
        java.lang.String str22 = crawlerURL20.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap24 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse30 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL20, (int) 'a', strMap24, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str31 = hTMLPageResponse30.getEncoding();
        java.lang.String str32 = hTMLPageResponse30.getResponseType();
        java.lang.String str33 = hTMLPageResponse30.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL34 = hTMLPageResponse30.getPageUrl();
        java.net.URI uRI35 = crawlerURL34.getUri();
        java.net.URI uRI36 = crawlerURL34.getUri();
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher39 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder40 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder42 = builder40.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder44 = builder40.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration45 = builder40.build();
        int int46 = crawlerConfiguration45.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil47 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean48 = crawlerConfiguration45.equals((java.lang.Object) headerUtil47);
        java.util.Map<java.lang.String, java.lang.String> strMap50 = headerUtil47.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap52 = headerUtil47.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable54 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads", assetFetcher39, strMap52, "Unknown error");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse60 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL34, (int) (byte) -1, strMap52, "AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", "1", (long) 0, "com.soulgalore.crawler.http.connection.timeout", (long) 10);
        java.lang.String str61 = hTMLPageResponse60.getUrl();
        boolean boolean63 = hTMLPageResponse60.equals((java.lang.Object) "AssetResponseCallable url:Unknown error");
        org.jsoup.nodes.Document document64 = hTMLPageResponse60.getBody();
        boolean boolean65 = crawlerConfiguration5.equals((java.lang.Object) document64);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "urls.txt" + "'", str22, "urls.txt");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str31, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "com.soulgalore.crawler.auth" + "'", str33, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURL34);
        org.junit.Assert.assertNull(uRI35);
        org.junit.Assert.assertNull(uRI36);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(builder44);
        org.junit.Assert.assertNotNull(crawlerConfiguration45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(headerUtil47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertNotNull(strMap52);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "com.soulgalore.crawler.auth" + "'", str61, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(document64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test13141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13141");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet15 = crawlerResult12.getUrls();
        java.lang.String str16 = crawlerResult12.getTheStartPoint();
        java.lang.String str17 = crawlerResult12.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet18 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray23 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL22 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet24 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, crawlerURLArray23);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray27 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet28 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28, hTMLPageResponseArray27);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult30 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, hTMLPageResponseSet26, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet31 = crawlerResult30.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet32 = crawlerResult30.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet33 = crawlerResult30.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet34 = crawlerResult30.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet35 = crawlerResult30.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray40 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL39 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, crawlerURLArray40);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray44 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet45 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45, hTMLPageResponseArray44);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult47 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, hTMLPageResponseSet43, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45);
        java.lang.String str48 = crawlerResult47.getTheStartPoint();
        java.lang.String str49 = crawlerResult47.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = crawlerResult47.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet51 = crawlerResult47.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet52 = crawlerResult47.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult53 = new com.soulgalore.crawler.core.CrawlerResult("CrawlerURL url:urls.txt", crawlerURLSet18, hTMLPageResponseSet35, hTMLPageResponseSet52);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet54 = crawlerResult53.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet55 = crawlerResult53.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet56 = crawlerResult53.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet57 = crawlerResult53.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet58 = crawlerResult53.getVerifiedURLResponses();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(crawlerURLSet15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "hi!" + "'", str16, "hi!");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet18);
        org.junit.Assert.assertNotNull(crawlerURLArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet31);
        org.junit.Assert.assertNotNull(crawlerURLSet32);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet33);
        org.junit.Assert.assertNotNull(crawlerURLSet34);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet35);
        org.junit.Assert.assertNotNull(crawlerURLArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "hi!" + "'", str49, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet50);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet51);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet52);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet54);
        org.junit.Assert.assertNotNull(crawlerURLSet55);
        org.junit.Assert.assertNotNull(crawlerURLSet56);
        org.junit.Assert.assertNotNull(crawlerURLSet57);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet58);
    }

    @Test
    public void test13142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13142");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:1encoding:CrawlerURL url:1 type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth");
        java.net.URI uRI3 = crawlerURL2.getUri();
        org.junit.Assert.assertNull(uRI3);
    }

    @Test
    public void test13143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13143");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet15 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet17 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet18 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray23 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL22 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet24 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, crawlerURLArray23);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray27 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet28 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28, hTMLPageResponseArray27);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult30 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, hTMLPageResponseSet26, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28);
        java.lang.String str31 = crawlerResult30.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet32 = crawlerResult30.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet33 = crawlerResult30.getNonWorkingUrls();
        java.lang.String str34 = crawlerResult30.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet35 = crawlerResult30.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray40 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL39 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, crawlerURLArray40);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray44 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet45 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45, hTMLPageResponseArray44);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult47 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, hTMLPageResponseSet43, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45);
        java.lang.String str48 = crawlerResult47.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet49 = crawlerResult47.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = crawlerResult47.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult51 = new com.soulgalore.crawler.core.CrawlerResult("CrawlerURL url:urls.txt", crawlerURLSet18, hTMLPageResponseSet35, hTMLPageResponseSet50);
        java.lang.String str52 = crawlerResult51.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet53 = crawlerResult51.getUrls();
        java.lang.String str54 = crawlerResult51.getTheStartPoint();
        java.lang.String str55 = crawlerResult51.getTheStartPoint();
        java.lang.String str56 = crawlerResult51.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet57 = crawlerResult51.getNonWorkingUrls();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet17);
        org.junit.Assert.assertNotNull(crawlerURLSet18);
        org.junit.Assert.assertNotNull(crawlerURLArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet32);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!" + "'", str34, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet35);
        org.junit.Assert.assertNotNull(crawlerURLArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "hi!" + "'", str48, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet49);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "CrawlerURL url:urls.txt" + "'", str52, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(crawlerURLSet53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "CrawlerURL url:urls.txt" + "'", str54, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "CrawlerURL url:urls.txt" + "'", str55, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "CrawlerURL url:urls.txt" + "'", str56, "CrawlerURL url:urls.txt");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet57);
    }

    @Test
    public void test13144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13144");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        java.lang.String str15 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder16.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder20.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setOnlyOnPath("com.soulgalore.crawler.auth");
        boolean boolean25 = hTMLPageResponse12.equals((java.lang.Object) builder22);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder22.setOnlyOnPath("CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder31 = builder29.setNotOnPath("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration32 = builder31.build();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str15, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(crawlerConfiguration32);
    }

    @Test
    public void test13145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13145");
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray0 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet1 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, assetResponseArray0);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray3 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet4 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4, assetResponseArray3);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult6 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet7 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet8 = assetsVerificationResult6.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray9 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10, assetResponseArray9);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray12 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet13 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13, assetResponseArray12);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult15 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet16 = assetsVerificationResult15.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet17 = assetsVerificationResult15.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet18 = assetsVerificationResult15.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult19 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, assetResponseSet18);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray20 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet21, assetResponseArray20);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray23 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet24 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet24, assetResponseArray23);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult26 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet21, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet24);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray27 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet28 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet28, assetResponseArray27);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray30 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet31 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31, assetResponseArray30);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult33 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet28, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet34 = assetsVerificationResult33.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult35 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet24, assetResponseSet34);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray36 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet37 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet37, assetResponseArray36);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray39 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet40 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet40, assetResponseArray39);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult42 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet37, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet40);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet43 = assetsVerificationResult42.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult44 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet34, assetResponseSet43);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet45 = assetsVerificationResult44.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet46 = assetsVerificationResult44.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult47 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, assetResponseSet46);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet48 = null;
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult49 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet46, assetResponseSet48);
        org.junit.Assert.assertNotNull(assetResponseArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assetResponseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assetResponseSet7);
        org.junit.Assert.assertNotNull(assetResponseSet8);
        org.junit.Assert.assertNotNull(assetResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(assetResponseArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assetResponseSet16);
        org.junit.Assert.assertNotNull(assetResponseSet17);
        org.junit.Assert.assertNotNull(assetResponseSet18);
        org.junit.Assert.assertNotNull(assetResponseArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(assetResponseArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(assetResponseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(assetResponseArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(assetResponseSet34);
        org.junit.Assert.assertNotNull(assetResponseArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(assetResponseArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(assetResponseSet43);
        org.junit.Assert.assertNotNull(assetResponseSet45);
        org.junit.Assert.assertNotNull(assetResponseSet46);
    }

    @Test
    public void test13146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13146");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        java.lang.String str5 = crawlerConfiguration3.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = crawlerConfiguration3.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = crawlerConfiguration3.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = crawlerConfiguration3.getRequestHeadersMap();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL11 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean12 = crawlerURL11.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder14.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration19 = builder14.build();
        java.lang.String str20 = crawlerConfiguration19.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = crawlerConfiguration19.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse27 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL11, (-1), strMap21, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        int int28 = hTMLPageResponse27.getResponseCode();
        int int29 = hTMLPageResponse27.getResponseCode();
        boolean boolean30 = crawlerConfiguration3.equals((java.lang.Object) hTMLPageResponse27);
        org.jsoup.nodes.Document document31 = hTMLPageResponse27.getBody();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL32 = hTMLPageResponse27.getPageUrl();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(crawlerConfiguration19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + (-1) + "'", int29 == (-1));
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNull(document31);
        org.junit.Assert.assertNotNull(crawlerURL32);
    }

    @Test
    public void test13147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13147");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("hi!", "AssetResponseCallable url:CrawlerURL url:CrawlerURL url:1");
    }

    @Test
    public void test13148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13148");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder10.build();
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration12 = builder10.build();
        boolean boolean13 = crawlerConfiguration12.isVerifyUrls();
        boolean boolean14 = crawlerConfiguration12.isVerifyUrls();
        java.lang.String str15 = crawlerConfiguration12.getRequestHeaders();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse20 = new com.soulgalore.crawler.core.assets.AssetResponse("AssetResponseCallable url:AssetResponseCallable url:Unknown error", "CrawlerURL url:hi!", 580, (long) 583);
        boolean boolean21 = crawlerConfiguration12.equals((java.lang.Object) 580);
        int int22 = crawlerConfiguration12.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertNotNull(crawlerConfiguration12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test13149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13149");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        long long20 = hTMLPageResponse18.getFetchTime();
        long long21 = hTMLPageResponse18.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = hTMLPageResponse18.getPageUrl();
        java.lang.String str24 = hTMLPageResponse18.getHeaderValue("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:");
        long long25 = hTMLPageResponse18.getFetchTime();
        java.lang.String str26 = hTMLPageResponse18.getResponseType();
        int int27 = hTMLPageResponse18.getResponseCode();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL30 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean31 = crawlerURL30.isWrongSyntax();
        java.lang.String str32 = crawlerURL30.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse40 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL30, (int) 'a', strMap34, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder41 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder43 = builder41.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder45 = builder41.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder47 = builder41.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder49 = builder47.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder51 = builder49.setOnlyOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder53 = builder51.setVerifyUrls(false);
        boolean boolean54 = hTMLPageResponse40.equals((java.lang.Object) builder53);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder56 = builder53.setOnlyOnPath("HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder58 = builder53.setOnlyOnPath("Wrong content type");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder60 = builder53.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:32encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:AssetResponseCallable url:-1");
        boolean boolean61 = hTMLPageResponse18.equals((java.lang.Object) "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:32encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:AssetResponseCallable url:-1");
        java.lang.String str62 = hTMLPageResponse18.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 580L + "'", long20 == 580L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 580L + "'", long21 == 580L);
        org.junit.Assert.assertNotNull(crawlerURL22);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 580L + "'", long25 == 580L);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "com.soulgalore.crawler.auth" + "'", str26, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "urls.txt" + "'", str32, "urls.txt");
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(builder43);
        org.junit.Assert.assertNotNull(builder45);
        org.junit.Assert.assertNotNull(builder47);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(builder56);
        org.junit.Assert.assertNotNull(builder58);
        org.junit.Assert.assertNotNull(builder60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "com.soulgalore.crawler.auth" + "'", str62, "com.soulgalore.crawler.auth");
    }

    @Test
    public void test13150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13150");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        int int6 = crawlerConfiguration5.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil7 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean8 = crawlerConfiguration5.equals((java.lang.Object) headerUtil7);
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil7.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = headerUtil7.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil7.createHeadersFromString("AssetResponseCallable url:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = headerUtil7.createHeadersFromString("AssetResponseCallable url:HTMLPageResponseurl:hi!responseCode:-1encoding:errorurls.txt type:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil7.createHeadersFromString("CrawlerURL url:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = headerUtil7.createHeadersFromString("HTMLPageResponseurl:hi!responseCode:-1encoding:errorurls.txt type:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = headerUtil7.createHeadersFromString("HTMLPageResponseurl:result.csvresponseCode:-1encoding:AssetResponseCallable url:Wrong content type type:CrawlerURL url:errorassets.csv");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(headerUtil7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test13151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13151");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.lang.String str14 = hTMLPageResponse12.getResponseType();
        java.lang.String str15 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        java.net.URI uRI17 = crawlerURL16.getUri();
        java.net.URI uRI18 = crawlerURL16.getUri();
        java.net.URI uRI19 = crawlerURL16.getUri();
        java.lang.String str20 = crawlerURL16.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL23 = new com.soulgalore.crawler.core.CrawlerURL("result.csv", "Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder24.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder24.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder28.setVerifyUrls(false);
        java.lang.Class<?> wildcardClass31 = builder28.getClass();
        boolean boolean32 = crawlerURL23.equals((java.lang.Object) wildcardClass31);
        java.lang.String str33 = crawlerURL23.getReferer();
        java.lang.String str34 = crawlerURL23.toString();
        com.soulgalore.crawler.util.HeaderUtil headerUtil36 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = headerUtil36.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap40 = headerUtil36.createHeadersFromString("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse46 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL23, 582, strMap40, "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1", (long) (short) 1, "0", (long) 10);
        org.jsoup.nodes.Document document47 = hTMLPageResponse46.getBody();
        java.lang.String str48 = hTMLPageResponse46.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder49 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder51 = builder49.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder53 = builder49.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder55 = builder53.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder57 = builder53.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder59 = builder53.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder61 = builder53.setOnlyOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder63 = builder61.setOnlyOnPath("Unknown error");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder65 = builder61.setOnlyOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder67 = builder65.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder69 = builder65.setNotOnPath("AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder71 = builder69.setOnlyOnPath("CrawlerURL url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder73 = builder69.setStartUrl("CrawlerURL url:AssetResponseCallable url:100");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration74 = builder69.build();
        boolean boolean75 = hTMLPageResponse46.equals((java.lang.Object) crawlerConfiguration74);
        boolean boolean76 = crawlerURL16.equals((java.lang.Object) crawlerConfiguration74);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.auth" + "'", str15, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertNull(uRI17);
        org.junit.Assert.assertNull(uRI18);
        org.junit.Assert.assertNull(uRI19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.auth" + "'", str20, "CrawlerURL url:com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(wildcardClass31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Malformed url" + "'", str33, "Malformed url");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "CrawlerURL url:result.csv" + "'", str34, "CrawlerURL url:result.csv");
        org.junit.Assert.assertNotNull(headerUtil36);
        org.junit.Assert.assertNotNull(strMap38);
        org.junit.Assert.assertNotNull(strMap40);
        org.junit.Assert.assertNull(document47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "result.csv" + "'", str48, "result.csv");
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(builder57);
        org.junit.Assert.assertNotNull(builder59);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(builder67);
        org.junit.Assert.assertNotNull(builder69);
        org.junit.Assert.assertNotNull(builder71);
        org.junit.Assert.assertNotNull(builder73);
        org.junit.Assert.assertNotNull(crawlerConfiguration74);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
    }

    @Test
    public void test13152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13152");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        java.lang.String str5 = assetResponse4.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder6.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration13 = builder6.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder6.setRequestHeaders("");
        boolean boolean16 = assetResponse4.equals((java.lang.Object) builder6);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder6.setNotOnPath("CrawlerURL url:urls.txt");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(crawlerConfiguration13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test13153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13153");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray4 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL3 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet5 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet5, crawlerURLArray4);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet7 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray8 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet9 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet9, hTMLPageResponseArray8);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult11 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet5, hTMLPageResponseSet7, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet9);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet12 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet15 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult11.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet17 = crawlerResult11.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet18 = crawlerResult11.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet19 = crawlerResult11.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet20 = crawlerResult11.getUrls();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet21 = crawlerResult11.getVerifiedURLResponses();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(crawlerURLArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet12);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(crawlerURLSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet17);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet18);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet19);
        org.junit.Assert.assertNotNull(crawlerURLSet20);
    }

    @Test
    public void test13154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13154");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:result.csv", "35");
        java.net.URI uRI3 = crawlerURL2.getUri();
        boolean boolean4 = crawlerURL2.isWrongSyntax();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test13155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13155");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider(100, 1, 580, "com.soulgalore.crawler.nrofhttpthreads", "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:com.soulgalore.crawler.nrofhttpthreads");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13156");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder4.setOnlyOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setStartUrl("Wrong content type");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder12.setNotOnPath("35");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setMaxLevels((int) '#');
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration19 = builder18.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder18.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder18.setNotOnPath("HTMLPageResponseurl:hi!responseCode:-1encoding:errorurls.txt type:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder18.setStartUrl("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder25.setOnlyOnPath("HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.nrofhttpthreadsresponseCode:32encoding:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:582encoding:hi! type:AssetResponseCallable url:result.csv type:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(crawlerConfiguration19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
    }

    @Test
    public void test13157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13157");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider(580, 52, 582, "AssetResponseCallable url:CrawlerURL url:-1", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:581encoding:AssetResponseCallable url:result.csv type:CrawlerURL url:CrawlerURL url:errorassets.csv");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:AssetResponseCallable url:CrawlerURL url:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13158");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        java.lang.String str5 = crawlerConfiguration3.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = crawlerConfiguration3.getRequestHeadersMap();
        java.lang.String str7 = crawlerConfiguration3.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL10 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean11 = crawlerURL10.isWrongSyntax();
        java.lang.String str12 = crawlerURL10.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse20 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL10, (int) 'a', strMap14, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str21 = hTMLPageResponse20.toString();
        int int22 = hTMLPageResponse20.getResponseCode();
        boolean boolean23 = crawlerConfiguration3.equals((java.lang.Object) hTMLPageResponse20);
        java.lang.String str24 = crawlerConfiguration3.getStartUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL26 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI27 = crawlerURL26.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL30 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean31 = crawlerURL30.isWrongSyntax();
        java.lang.String str32 = crawlerURL30.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse40 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL30, (int) 'a', strMap34, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str41 = hTMLPageResponse40.getUrl();
        boolean boolean42 = crawlerURL26.equals((java.lang.Object) str41);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher45 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil46 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap48 = headerUtil46.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable50 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher45, strMap48, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse56 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL26, (int) (short) 100, strMap48, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        org.jsoup.nodes.Document document57 = hTMLPageResponse56.getBody();
        java.lang.String str59 = hTMLPageResponse56.getHeaderValue("CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        int int60 = hTMLPageResponse56.getResponseCode();
        java.util.Map<java.lang.String, java.lang.String> strMap61 = hTMLPageResponse56.getResponseHeaders();
        int int62 = hTMLPageResponse56.getResponseCode();
        org.jsoup.nodes.Document document63 = hTMLPageResponse56.getBody();
        boolean boolean64 = crawlerConfiguration3.equals((java.lang.Object) document63);
        java.lang.String str65 = crawlerConfiguration3.getNotOnPath();
        boolean boolean66 = crawlerConfiguration3.isVerifyUrls();
        java.lang.String str67 = crawlerConfiguration3.getRequestHeaders();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strMap6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "urls.txt" + "'", str12, "urls.txt");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str21, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 97 + "'", int22 == 97);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNull(uRI27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "urls.txt" + "'", str32, "urls.txt");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "com.soulgalore.crawler.auth" + "'", str41, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(headerUtil46);
        org.junit.Assert.assertNotNull(strMap48);
        org.junit.Assert.assertNull(document57);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 100 + "'", int60 == 100);
        org.junit.Assert.assertNotNull(strMap61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 100 + "'", int62 == 100);
        org.junit.Assert.assertNull(document63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "" + "'", str65, "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
    }

    @Test
    public void test13159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13159");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        int int5 = crawlerConfiguration3.getMaxLevels();
        java.lang.String str6 = crawlerConfiguration3.getRequestHeaders();
        boolean boolean7 = crawlerConfiguration3.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = crawlerConfiguration3.getRequestHeadersMap();
        java.lang.String str9 = crawlerConfiguration3.getStartUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = crawlerConfiguration3.getRequestHeadersMap();
        int int11 = crawlerConfiguration3.getMaxLevels();
        int int12 = crawlerConfiguration3.getMaxLevels();
        boolean boolean13 = crawlerConfiguration3.isVerifyUrls();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test13160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13160");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        boolean boolean22 = hTMLPageResponse12.equals((java.lang.Object) builder21);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder21.setOnlyOnPath("10");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration25 = builder24.build();
        java.lang.String str26 = crawlerConfiguration25.getStartUrl();
        int int27 = crawlerConfiguration25.getMaxLevels();
        java.lang.String str28 = crawlerConfiguration25.getStartUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(crawlerConfiguration25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNull(str28);
    }

    @Test
    public void test13161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13161");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getOnlyOnPath();
        boolean boolean5 = crawlerConfiguration3.isVerifyUrls();
        int int6 = crawlerConfiguration3.getMaxLevels();
        int int7 = crawlerConfiguration3.getMaxLevels();
        boolean boolean8 = crawlerConfiguration3.isVerifyUrls();
        java.lang.String str9 = crawlerConfiguration3.getNotOnPath();
        java.lang.String str10 = crawlerConfiguration3.getOnlyOnPath();
        java.lang.String str11 = crawlerConfiguration3.getStartUrl();
        java.lang.String str12 = crawlerConfiguration3.getStartUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap13 = crawlerConfiguration3.getRequestHeadersMap();
        int int14 = crawlerConfiguration3.getMaxLevels();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertNotNull(strMap13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test13162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13162");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider(582, 582, (-1), "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:", "CrawlerURL url:CrawlerURL url:com.soulgalore.crawler.auth");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HTMLPageResponseurl\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13163");
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray0 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet1 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, assetResponseArray0);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray3 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet4 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4, assetResponseArray3);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult6 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet7 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet8 = assetsVerificationResult6.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray9 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10, assetResponseArray9);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray12 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet13 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13, assetResponseArray12);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult15 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult16 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray17 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet18 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet18, assetResponseArray17);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray20 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet21, assetResponseArray20);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult23 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet18, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet21);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet24 = assetsVerificationResult23.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult25 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, assetResponseSet24);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray26 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet27 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet27, assetResponseArray26);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray29 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet30 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet30, assetResponseArray29);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult32 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet27, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet30);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet33 = assetsVerificationResult32.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult34 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, assetResponseSet33);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray35 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet36 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet36, assetResponseArray35);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray38 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet39 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet39, assetResponseArray38);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult41 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet36, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet39);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet42 = assetsVerificationResult41.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet43 = assetsVerificationResult41.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet44 = assetsVerificationResult41.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet45 = assetsVerificationResult41.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray46 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet47 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet47, assetResponseArray46);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray49 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet50 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean51 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet50, assetResponseArray49);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult52 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet47, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet50);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet53 = assetsVerificationResult52.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult54 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet45, assetResponseSet53);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet55 = assetsVerificationResult54.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult56 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, assetResponseSet55);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet57 = assetsVerificationResult56.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray58 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet59 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet59, assetResponseArray58);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray61 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet62 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean63 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet62, assetResponseArray61);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult64 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet59, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet62);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult65 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet57, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet62);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet66 = assetsVerificationResult65.getWorkingAssets();
        org.junit.Assert.assertNotNull(assetResponseArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assetResponseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assetResponseSet7);
        org.junit.Assert.assertNotNull(assetResponseSet8);
        org.junit.Assert.assertNotNull(assetResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(assetResponseArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assetResponseArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(assetResponseArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(assetResponseSet24);
        org.junit.Assert.assertNotNull(assetResponseArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(assetResponseArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(assetResponseSet33);
        org.junit.Assert.assertNotNull(assetResponseArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(assetResponseArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(assetResponseSet42);
        org.junit.Assert.assertNotNull(assetResponseSet43);
        org.junit.Assert.assertNotNull(assetResponseSet44);
        org.junit.Assert.assertNotNull(assetResponseSet45);
        org.junit.Assert.assertNotNull(assetResponseArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(assetResponseArray49);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(assetResponseSet53);
        org.junit.Assert.assertNotNull(assetResponseSet55);
        org.junit.Assert.assertNotNull(assetResponseSet57);
        org.junit.Assert.assertNotNull(assetResponseArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(assetResponseArray61);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(assetResponseSet66);
    }

    @Test
    public void test13164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13164");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder4.build();
        java.lang.String str6 = crawlerConfiguration5.getOnlyOnPath();
        boolean boolean7 = crawlerConfiguration5.isVerifyUrls();
        int int8 = crawlerConfiguration5.getMaxLevels();
        int int9 = crawlerConfiguration5.getMaxLevels();
        boolean boolean10 = crawlerConfiguration5.isVerifyUrls();
        boolean boolean11 = crawlerConfiguration5.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration5.getRequestHeadersMap();
        java.lang.String str13 = crawlerConfiguration5.getStartUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = crawlerConfiguration5.getRequestHeadersMap();
        int int15 = crawlerConfiguration5.getMaxLevels();
        java.lang.String str16 = crawlerConfiguration5.getStartUrl();
        boolean boolean17 = crawlerConfiguration5.isVerifyUrls();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = crawlerConfiguration5.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable20 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", assetFetcher1, strMap18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse21 = assetResponseCallable20.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strMap18);
    }

    @Test
    public void test13165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13165");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse13 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean14 = assetResponse4.equals((java.lang.Object) 100L);
        java.lang.String str15 = assetResponse4.getReferer();
        java.lang.String str16 = assetResponse4.getReferer();
        long long17 = assetResponse4.getFetchTime();
        boolean boolean19 = assetResponse4.equals((java.lang.Object) (-1));
        long long20 = assetResponse4.getFetchTime();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
    }

    @Test
    public void test13166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13166");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth", "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:52encoding:AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads type:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
    }

    @Test
    public void test13167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13167");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse13 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean14 = assetResponse4.equals((java.lang.Object) 100L);
        java.lang.String str15 = assetResponse4.getReferer();
        java.lang.String str16 = assetResponse4.getReferer();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder17.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder23.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder23.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setStartUrl("Response timed out");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder31 = builder29.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder33 = builder29.setVerifyUrls(false);
        boolean boolean34 = assetResponse4.equals((java.lang.Object) builder29);
        java.lang.String str35 = assetResponse4.getReferer();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL37 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI38 = crawlerURL37.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL41 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean42 = crawlerURL41.isWrongSyntax();
        java.lang.String str43 = crawlerURL41.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse51 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL41, (int) 'a', strMap45, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str52 = hTMLPageResponse51.getUrl();
        boolean boolean53 = crawlerURL37.equals((java.lang.Object) str52);
        boolean boolean54 = crawlerURL37.isWrongSyntax();
        java.lang.String str55 = crawlerURL37.getHost();
        boolean boolean56 = assetResponse4.equals((java.lang.Object) str55);
        int int57 = assetResponse4.getResponseCode();
        java.lang.String str58 = assetResponse4.getReferer();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(builder33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "100" + "'", str35, "100");
        org.junit.Assert.assertNull(uRI38);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "urls.txt" + "'", str43, "urls.txt");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "com.soulgalore.crawler.auth" + "'", str52, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 1 + "'", int57 == 1);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "100" + "'", str58, "100");
    }

    @Test
    public void test13168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13168");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        org.jsoup.nodes.Document document13 = hTMLPageResponse12.getBody();
        org.jsoup.nodes.Document document14 = hTMLPageResponse12.getBody();
        com.soulgalore.crawler.util.StatusCode statusCode15 = com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI;
        boolean boolean16 = hTMLPageResponse12.equals((java.lang.Object) statusCode15);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean20 = crawlerURL19.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = builder22.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration27 = builder22.build();
        java.lang.String str28 = crawlerConfiguration27.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap29 = crawlerConfiguration27.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse35 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL19, (-1), strMap29, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        int int36 = hTMLPageResponse35.getResponseCode();
        long long37 = hTMLPageResponse35.getFetchTime();
        long long38 = hTMLPageResponse35.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL41 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI42 = crawlerURL41.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL46 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean47 = crawlerURL46.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder49 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder51 = builder49.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder53 = builder49.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration54 = builder49.build();
        java.lang.String str55 = crawlerConfiguration54.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap56 = crawlerConfiguration54.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse62 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL46, (-1), strMap56, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse68 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL41, 100, strMap56, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        boolean boolean69 = hTMLPageResponse35.equals((java.lang.Object) 100);
        org.jsoup.nodes.Document document70 = hTMLPageResponse35.getBody();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL71 = hTMLPageResponse35.getPageUrl();
        java.lang.String str73 = hTMLPageResponse35.getHeaderValue("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder74 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder76 = builder74.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder78 = builder74.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder80 = builder78.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder82 = builder80.setOnlyOnPath("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder84 = builder80.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder86 = builder84.setRequestHeaders("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout");
        boolean boolean87 = hTMLPageResponse35.equals((java.lang.Object) builder84);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder89 = builder84.setMaxLevels((int) (byte) 1);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder91 = builder84.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder93 = builder91.setMaxLevels(52);
        boolean boolean94 = hTMLPageResponse12.equals((java.lang.Object) builder91);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder96 = builder91.setVerifyUrls(true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertNull(document13);
        org.junit.Assert.assertNull(document14);
        org.junit.Assert.assertTrue("'" + statusCode15 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI + "'", statusCode15.equals(com.soulgalore.crawler.util.StatusCode.SC_MALFORMED_URI));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(crawlerConfiguration27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(strMap29);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + (-1) + "'", int36 == (-1));
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 580L + "'", long37 == 580L);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 580L + "'", long38 == 580L);
        org.junit.Assert.assertNull(uRI42);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(crawlerConfiguration54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "" + "'", str55, "");
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNull(document70);
        org.junit.Assert.assertNotNull(crawlerURL71);
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(builder74);
        org.junit.Assert.assertNotNull(builder76);
        org.junit.Assert.assertNotNull(builder78);
        org.junit.Assert.assertNotNull(builder80);
        org.junit.Assert.assertNotNull(builder82);
        org.junit.Assert.assertNotNull(builder84);
        org.junit.Assert.assertNotNull(builder86);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
        org.junit.Assert.assertNotNull(builder89);
        org.junit.Assert.assertNotNull(builder91);
        org.junit.Assert.assertNotNull(builder93);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertNotNull(builder96);
    }

    @Test
    public void test13169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13169");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setStartUrl("com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder0.setNotOnPath("AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setStartUrl("CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setOnlyOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration13 = builder8.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder8.setMaxLevels((int) (short) 100);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = builder8.setRequestHeaders("AssetResponseCallable url:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(crawlerConfiguration13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
    }

    @Test
    public void test13170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13170");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder4.setOnlyOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder4.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder4.setOnlyOnPath("AssetResponseCallable url:AssetResponseCallable url:errorassets.csv");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
    }

    @Test
    public void test13171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13171");
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray0 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet1 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, assetResponseArray0);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray3 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet4 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4, assetResponseArray3);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult6 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet1, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet4);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet7 = assetsVerificationResult6.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet8 = assetsVerificationResult6.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray9 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10, assetResponseArray9);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray12 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet13 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13, assetResponseArray12);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult15 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult16 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet10);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray17 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet18 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet18, assetResponseArray17);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray20 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet21, assetResponseArray20);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult23 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet18, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet21);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet24 = assetsVerificationResult23.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult25 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet8, assetResponseSet24);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet26 = assetsVerificationResult25.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray27 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet28 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet28, assetResponseArray27);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray30 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet31 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31, assetResponseArray30);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult33 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet28, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet31);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet34 = assetsVerificationResult33.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet35 = assetsVerificationResult33.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray36 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet37 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet37, assetResponseArray36);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray39 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet40 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet40, assetResponseArray39);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult42 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet37, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet40);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult43 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet35, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet37);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray44 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet45 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet45, assetResponseArray44);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray47 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet48 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet48, assetResponseArray47);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult50 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet45, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet48);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet51 = assetsVerificationResult50.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult52 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet35, assetResponseSet51);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet53 = assetsVerificationResult52.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet54 = assetsVerificationResult52.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray55 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet56 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet56, assetResponseArray55);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray58 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet59 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet59, assetResponseArray58);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult61 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet56, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet59);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet62 = assetsVerificationResult61.getWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray63 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet64 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean65 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet64, assetResponseArray63);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray66 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet67 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet67, assetResponseArray66);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult69 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet64, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet67);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult70 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet62, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet67);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet71 = assetsVerificationResult70.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet72 = assetsVerificationResult70.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray73 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet74 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet74, assetResponseArray73);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray76 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet77 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet77, assetResponseArray76);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult79 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet74, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet77);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet80 = assetsVerificationResult79.getNonWorkingAssets();
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult81 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet72, assetResponseSet80);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult82 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet54, assetResponseSet72);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult83 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult(assetResponseSet26, assetResponseSet72);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet84 = assetsVerificationResult83.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet85 = assetsVerificationResult83.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet86 = assetsVerificationResult83.getWorkingAssets();
        org.junit.Assert.assertNotNull(assetResponseArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(assetResponseArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(assetResponseSet7);
        org.junit.Assert.assertNotNull(assetResponseSet8);
        org.junit.Assert.assertNotNull(assetResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(assetResponseArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assetResponseArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(assetResponseArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(assetResponseSet24);
        org.junit.Assert.assertNotNull(assetResponseSet26);
        org.junit.Assert.assertNotNull(assetResponseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(assetResponseArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(assetResponseSet34);
        org.junit.Assert.assertNotNull(assetResponseSet35);
        org.junit.Assert.assertNotNull(assetResponseArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(assetResponseArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(assetResponseArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(assetResponseArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(assetResponseSet51);
        org.junit.Assert.assertNotNull(assetResponseSet53);
        org.junit.Assert.assertNotNull(assetResponseSet54);
        org.junit.Assert.assertNotNull(assetResponseArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(assetResponseArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(assetResponseSet62);
        org.junit.Assert.assertNotNull(assetResponseArray63);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(assetResponseArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(assetResponseSet71);
        org.junit.Assert.assertNotNull(assetResponseSet72);
        org.junit.Assert.assertNotNull(assetResponseArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(assetResponseArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(assetResponseSet80);
        org.junit.Assert.assertNotNull(assetResponseSet84);
        org.junit.Assert.assertNotNull(assetResponseSet85);
        org.junit.Assert.assertNotNull(assetResponseSet86);
    }

    @Test
    public void test13172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13172");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI2 = crawlerURL1.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL5 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean6 = crawlerURL5.isWrongSyntax();
        java.lang.String str7 = crawlerURL5.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse15 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL5, (int) 'a', strMap9, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str16 = hTMLPageResponse15.getUrl();
        boolean boolean17 = crawlerURL1.equals((java.lang.Object) str16);
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse22 = new com.soulgalore.crawler.core.assets.AssetResponse("", "errorurls.txt", 97, (-1L));
        java.lang.String str23 = assetResponse22.getReferer();
        int int24 = assetResponse22.getResponseCode();
        boolean boolean25 = crawlerURL1.equals((java.lang.Object) int24);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL29 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI30 = crawlerURL29.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder32.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration35 = builder34.build();
        java.lang.String str36 = crawlerConfiguration35.getStartUrl();
        int int37 = crawlerConfiguration35.getMaxLevels();
        int int38 = crawlerConfiguration35.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = crawlerConfiguration35.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse45 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL29, (int) (short) 10, strMap39, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        int int46 = hTMLPageResponse45.getResponseCode();
        java.util.Map<java.lang.String, java.lang.String> strMap47 = hTMLPageResponse45.getResponseHeaders();
        java.lang.String str49 = hTMLPageResponse45.getHeaderValue("");
        java.util.Map<java.lang.String, java.lang.String> strMap50 = hTMLPageResponse45.getResponseHeaders();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse56 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL1, 100, strMap50, "52", "HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth", (long) (short) 0, "", (long) 582);
        java.lang.String str57 = hTMLPageResponse56.toString();
        java.lang.String str58 = hTMLPageResponse56.toString();
        int int59 = hTMLPageResponse56.getResponseCode();
        long long60 = hTMLPageResponse56.getFetchTime();
        java.lang.String str61 = hTMLPageResponse56.getEncoding();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "urls.txt" + "'", str7, "urls.txt");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.soulgalore.crawler.auth" + "'", str16, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "errorurls.txt" + "'", str23, "errorurls.txt");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 97 + "'", int24 == 97);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(uRI30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(crawlerConfiguration35);
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1 + "'", int38 == 1);
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 10 + "'", int46 == 10);
        org.junit.Assert.assertNotNull(strMap47);
        org.junit.Assert.assertNull(str49);
        org.junit.Assert.assertNotNull(strMap50);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:" + "'", str57, "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:" + "'", str58, "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 100 + "'", int59 == 100);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 582L + "'", long60 == 582L);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth" + "'", str61, "HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
    }

    @Test
    public void test13173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13173");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = hTMLPageResponse12.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap15 = hTMLPageResponse12.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = hTMLPageResponse12.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap18 = hTMLPageResponse12.getResponseHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap19 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str20 = hTMLPageResponse12.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNotNull(crawlerURL14);
        org.junit.Assert.assertNull(strMap15);
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertNotNull(crawlerURL17);
        org.junit.Assert.assertNull(strMap18);
        org.junit.Assert.assertNull(strMap19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str20, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
    }

    @Test
    public void test13174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13174");
        com.soulgalore.crawler.util.StatusCode statusCode0 = com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_UNKNOWN;
        int int1 = statusCode0.getCode();
        int int2 = statusCode0.getCode();
        int int3 = statusCode0.getCode();
        java.lang.String str4 = statusCode0.getFriendlyName();
        java.lang.String str5 = statusCode0.getFriendlyName();
        int int6 = statusCode0.getCode();
        int int7 = statusCode0.getCode();
        int int8 = statusCode0.getCode();
        org.junit.Assert.assertTrue("'" + statusCode0 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_UNKNOWN + "'", statusCode0.equals(com.soulgalore.crawler.util.StatusCode.SC_SERVER_RESPONSE_UNKNOWN));
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 581 + "'", int1 == 581);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 581 + "'", int2 == 581);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 581 + "'", int3 == 581);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Unknown error" + "'", str4, "Unknown error");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Unknown error" + "'", str5, "Unknown error");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 581 + "'", int6 == 581);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 581 + "'", int7 == 581);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 581 + "'", int8 == 581);
    }

    @Test
    public void test13175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13175");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.nrofhttpthreads", "AssetResponseCallable url:AssetResponseCallable url:32", (-1), (long) (byte) -1);
        java.lang.String str5 = assetResponse4.getReferer();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:32" + "'", str5, "AssetResponseCallable url:AssetResponseCallable url:32");
    }

    @Test
    public void test13176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13176");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider((int) '4', (int) (byte) 0, 0, "CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url", "AssetResponseCallable url:errorurls.txt");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"AssetResponseCallable url\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13177");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("", "com.soulgalore.crawler.http.socket.timeout");
        java.lang.String str3 = crawlerURL2.getUrl();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse8 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        long long9 = assetResponse8.getFetchTime();
        java.lang.String str10 = assetResponse8.getUrl();
        boolean boolean11 = crawlerURL2.equals((java.lang.Object) str10);
        java.lang.String str12 = crawlerURL2.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL15 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI16 = crawlerURL15.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean20 = crawlerURL19.isWrongSyntax();
        java.lang.String str21 = crawlerURL19.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap23 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL19, (int) 'a', strMap23, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str30 = hTMLPageResponse29.getUrl();
        boolean boolean31 = crawlerURL15.equals((java.lang.Object) str30);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL34 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher37 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder38 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder40 = builder38.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder42 = builder38.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration43 = builder38.build();
        java.lang.String str44 = crawlerConfiguration43.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = crawlerConfiguration43.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable47 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Redirected to new domain", assetFetcher37, strMap45, "com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse53 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL34, (int) (byte) 10, strMap45, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", "CrawlerURL url:com.soulgalore.crawler.auth", (long) 0, "100", (-1L));
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse59 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL15, (int) 'a', strMap45, "", "52", (long) (byte) 0, "CrawlerURL url:com.soulgalore.crawler.auth", (long) 10);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder61 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder63 = builder61.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder65 = builder61.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration66 = builder61.build();
        int int67 = crawlerConfiguration66.getMaxLevels();
        com.soulgalore.crawler.util.HeaderUtil headerUtil68 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        boolean boolean69 = crawlerConfiguration66.equals((java.lang.Object) headerUtil68);
        java.util.Map<java.lang.String, java.lang.String> strMap71 = headerUtil68.createHeadersFromString("AssetResponseCallable url:Malformed url");
        java.util.Map<java.lang.String, java.lang.String> strMap73 = headerUtil68.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.util.Map<java.lang.String, java.lang.String> strMap75 = headerUtil68.createHeadersFromString("AssetResponseCallable url:result.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap77 = headerUtil68.createHeadersFromString("AssetResponseCallable url:Unknown error");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse83 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL15, (int) '4', strMap77, "HTMLPageResponseurl:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1responseCode:10encoding:AssetResponseCallable url:0 type:AssetResponseCallable url:com.soulgalore.crawler.auth", "HTMLPageResponseurl:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1responseCode:10encoding:hi! type:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", 1L, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:308encoding:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:32encoding:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url type:com.soulgalore.crawler.http.connection.timeout", (long) (short) 0);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse89 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 52, strMap77, "CrawlerURL url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt", "AssetResponseCallable url:", (long) 'a', "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:0 type:", (long) (byte) 10);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "CrawlerURL url:" + "'", str12, "CrawlerURL url:");
        org.junit.Assert.assertNull(uRI16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "urls.txt" + "'", str21, "urls.txt");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "com.soulgalore.crawler.auth" + "'", str30, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(builder38);
        org.junit.Assert.assertNotNull(builder40);
        org.junit.Assert.assertNotNull(builder42);
        org.junit.Assert.assertNotNull(crawlerConfiguration43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(builder61);
        org.junit.Assert.assertNotNull(builder63);
        org.junit.Assert.assertNotNull(builder65);
        org.junit.Assert.assertNotNull(crawlerConfiguration66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(headerUtil68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNotNull(strMap73);
        org.junit.Assert.assertNotNull(strMap75);
        org.junit.Assert.assertNotNull(strMap77);
    }

    @Test
    public void test13178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13178");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL15 = hTMLPageResponse12.getPageUrl();
        org.jsoup.nodes.Document document16 = hTMLPageResponse12.getBody();
        java.lang.String str17 = hTMLPageResponse12.getUrl();
        java.lang.String str18 = hTMLPageResponse12.toString();
        long long19 = hTMLPageResponse12.getFetchTime();
        org.jsoup.nodes.Document document20 = hTMLPageResponse12.getBody();
        java.lang.String str21 = hTMLPageResponse12.getResponseType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(crawlerURL15);
        org.junit.Assert.assertNull(document16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.soulgalore.crawler.auth" + "'", str17, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 100L + "'", long19 == 100L);
        org.junit.Assert.assertNull(document20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test13179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13179");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider((int) '#', (int) (short) 1, 52, "AssetResponseCallable url:Wrong content type", "AssetResponseCallable url:com.soulgalore.crawler.auth");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:AssetResponseCallable url:Wrong content type");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13180");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean15 = hTMLPageResponse12.equals((java.lang.Object) builder14);
        long long16 = hTMLPageResponse12.getFetchTime();
        java.lang.String str17 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL18 = hTMLPageResponse12.getPageUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder19.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder19.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder19.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder25.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setVerifyUrls(false);
        boolean boolean30 = crawlerURL18.equals((java.lang.Object) builder29);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration31 = builder29.build();
        java.lang.String str32 = crawlerConfiguration31.getStartUrl();
        java.lang.String str33 = crawlerConfiguration31.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap34 = crawlerConfiguration31.getRequestHeadersMap();
        java.lang.String str35 = crawlerConfiguration31.getNotOnPath();
        java.lang.String str36 = crawlerConfiguration31.getRequestHeaders();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.auth" + "'", str13, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str17, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(crawlerURL18);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(crawlerConfiguration31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertNotNull(strMap34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "urls.txt" + "'", str35, "urls.txt");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test13181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13181");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setOnlyOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder0.setRequestHeaders("AssetResponseCallable url:AssetResponseCallable url:97");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder0.setOnlyOnPath("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder0.build();
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration12 = builder0.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder13.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = builder13.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration18 = builder13.build();
        java.lang.String str19 = crawlerConfiguration18.getRequestHeaders();
        java.lang.String str20 = crawlerConfiguration18.getRequestHeaders();
        java.lang.String str21 = crawlerConfiguration18.getNotOnPath();
        java.lang.String str22 = crawlerConfiguration18.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL24 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads");
        boolean boolean25 = crawlerConfiguration18.equals((java.lang.Object) "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads");
        java.lang.String str26 = crawlerConfiguration18.getOnlyOnPath();
        boolean boolean27 = crawlerConfiguration12.equals((java.lang.Object) crawlerConfiguration18);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertNotNull(crawlerConfiguration12);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(crawlerConfiguration18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test13182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13182");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration4 = builder2.build();
        java.util.Map<java.lang.String, java.lang.String> strMap5 = crawlerConfiguration4.getRequestHeadersMap();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNotNull(crawlerConfiguration4);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test13183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13183");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        long long20 = hTMLPageResponse18.getFetchTime();
        long long21 = hTMLPageResponse18.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL24 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI25 = crawlerURL24.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL29 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean30 = crawlerURL29.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder32.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder36 = builder32.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration37 = builder32.build();
        java.lang.String str38 = crawlerConfiguration37.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap39 = crawlerConfiguration37.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse45 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL29, (-1), strMap39, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse51 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL24, 100, strMap39, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        boolean boolean52 = hTMLPageResponse18.equals((java.lang.Object) 100);
        org.jsoup.nodes.Document document53 = hTMLPageResponse18.getBody();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL54 = hTMLPageResponse18.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL55 = hTMLPageResponse18.getPageUrl();
        java.lang.String str56 = hTMLPageResponse18.getUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = hTMLPageResponse18.getResponseHeaders();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 580L + "'", long20 == 580L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 580L + "'", long21 == 580L);
        org.junit.Assert.assertNull(uRI25);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(builder36);
        org.junit.Assert.assertNotNull(crawlerConfiguration37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(strMap39);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(document53);
        org.junit.Assert.assertNotNull(crawlerURL54);
        org.junit.Assert.assertNotNull(crawlerURL55);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "com.soulgalore.crawler.auth" + "'", str56, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(strMap57);
    }

    @Test
    public void test13184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13184");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider(100, (int) '#', (int) ' ', "CrawlerURL url:HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1", "AssetResponseCallable url:CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HTMLPageResponseurl\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13185");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        boolean boolean2 = crawlerURL1.isWrongSyntax();
        java.lang.String str3 = crawlerURL1.getReferer();
        java.net.URI uRI4 = crawlerURL1.getUri();
        com.soulgalore.crawler.util.StatusCode statusCode5 = com.soulgalore.crawler.util.StatusCode.SC_WRONG_CONTENT_TYPE;
        int int6 = statusCode5.getCode();
        java.lang.String str7 = statusCode5.getFriendlyName();
        java.lang.String str8 = statusCode5.getFriendlyName();
        int int9 = statusCode5.getCode();
        java.lang.String str10 = statusCode5.getFriendlyName();
        int int11 = statusCode5.getCode();
        int int12 = statusCode5.getCode();
        java.lang.String str13 = statusCode5.getFriendlyName();
        java.lang.String str14 = statusCode5.getFriendlyName();
        int int15 = statusCode5.getCode();
        int int16 = statusCode5.getCode();
        boolean boolean17 = crawlerURL1.equals((java.lang.Object) int16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(uRI4);
        org.junit.Assert.assertTrue("'" + statusCode5 + "' != '" + com.soulgalore.crawler.util.StatusCode.SC_WRONG_CONTENT_TYPE + "'", statusCode5.equals(com.soulgalore.crawler.util.StatusCode.SC_WRONG_CONTENT_TYPE));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 583 + "'", int6 == 583);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Wrong content type" + "'", str7, "Wrong content type");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Wrong content type" + "'", str8, "Wrong content type");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 583 + "'", int9 == 583);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Wrong content type" + "'", str10, "Wrong content type");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 583 + "'", int11 == 583);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 583 + "'", int12 == 583);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Wrong content type" + "'", str13, "Wrong content type");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Wrong content type" + "'", str14, "Wrong content type");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 583 + "'", int15 == 583);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 583 + "'", int16 == 583);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test13186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13186");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI2 = crawlerURL1.getUri();
        java.lang.String str3 = crawlerURL1.getUrl();
        java.lang.String str4 = crawlerURL1.toString();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder5.setNotOnPath("AssetResponseCallable url:errorassets.csv");
        boolean boolean12 = crawlerURL1.equals((java.lang.Object) builder11);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder11.setMaxLevels(1);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setOnlyOnPath("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:0 type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder14.setStartUrl("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder14.setStartUrl("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder14.setNotOnPath("CrawlerURL url:CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder22.setStartUrl("CrawlerURL url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str3, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads" + "'", str4, "CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test13187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13187");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        long long14 = hTMLPageResponse12.getFetchTime();
        long long15 = hTMLPageResponse12.getFetchTime();
        java.lang.String str16 = hTMLPageResponse12.getResponseType();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = hTMLPageResponse12.getResponseHeaders();
        long long18 = hTMLPageResponse12.getFetchTime();
        org.jsoup.nodes.Document document19 = hTMLPageResponse12.getBody();
        java.lang.String str20 = hTMLPageResponse12.getResponseType();
        java.lang.String str21 = hTMLPageResponse12.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNull(strMap17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNull(document19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str21, "com.soulgalore.crawler.http.socket.timeout");
    }

    @Test
    public void test13188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13188");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet15 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray21 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL20 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, crawlerURLArray21);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet24 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray25 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26, hTMLPageResponseArray25);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult28 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, hTMLPageResponseSet24, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26);
        java.lang.String str29 = crawlerResult28.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult28.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = crawlerResult28.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL35 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean36 = crawlerURL35.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean40 = crawlerURL39.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL43 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI44 = crawlerURL43.getUri();
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray45 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL35, crawlerURL39, crawlerURL43 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet46 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet46, crawlerURLArray45);
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray48 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet49 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet49, hTMLPageResponseArray48);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL54 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray55 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL54 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet56 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet56, crawlerURLArray55);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet58 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray59 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet60 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet60, hTMLPageResponseArray59);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult62 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet56, hTMLPageResponseSet58, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet60);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult63 = new com.soulgalore.crawler.core.CrawlerResult("com.soulgalore.crawler.auth", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet46, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet49, hTMLPageResponseSet58);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet64 = crawlerResult63.getVerifiedURLResponses();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult65 = new com.soulgalore.crawler.core.CrawlerResult("errorurls.txt", crawlerURLSet16, hTMLPageResponseSet31, hTMLPageResponseSet64);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet66 = crawlerResult65.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet67 = crawlerResult65.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet68 = crawlerResult65.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet69 = crawlerResult65.getNonWorkingUrls();
        java.lang.String str70 = crawlerResult65.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet71 = crawlerResult65.getUrls();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(crawlerURLArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(uRI44);
        org.junit.Assert.assertNotNull(crawlerURLArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet64);
        org.junit.Assert.assertNotNull(crawlerURLSet66);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet67);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet68);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet69);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "errorurls.txt" + "'", str70, "errorurls.txt");
        org.junit.Assert.assertNotNull(crawlerURLSet71);
    }

    @Test
    public void test13189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13189");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = builder5.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration10 = builder5.build();
        java.lang.String str11 = crawlerConfiguration10.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration10.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (-1), strMap12, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI23 = crawlerURL22.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean28 = crawlerURL27.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder30.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder34 = builder30.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration35 = builder30.build();
        java.lang.String str36 = crawlerConfiguration35.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap37 = crawlerConfiguration35.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse43 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL27, (-1), strMap37, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse49 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, 100, strMap37, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse55 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (byte) 10, strMap37, "100", "errorassets.csv", (long) (byte) 100, "", (long) (short) 100);
        java.util.Map<java.lang.String, java.lang.String> strMap56 = hTMLPageResponse55.getResponseHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = hTMLPageResponse55.getResponseHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap58 = hTMLPageResponse55.getResponseHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap59 = hTMLPageResponse55.getResponseHeaders();
        java.lang.String str60 = hTMLPageResponse55.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(crawlerConfiguration10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNull(uRI23);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(crawlerConfiguration35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertNotNull(strMap37);
        org.junit.Assert.assertNotNull(strMap56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertNotNull(strMap58);
        org.junit.Assert.assertNotNull(strMap59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:" + "'", str60, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:");
    }

    @Test
    public void test13190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13190");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "Response timed out");
        com.soulgalore.crawler.util.HeaderUtil headerUtil5 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap7 = headerUtil5.createHeadersFromString("");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse13 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL3, (int) '4', strMap7, "com.soulgalore.crawler.http.socket.timeout", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 580, "com.soulgalore.crawler.auth", (long) (short) 1);
        java.lang.String str15 = hTMLPageResponse13.getHeaderValue("errorurls.txt");
        java.lang.String str16 = hTMLPageResponse13.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray21 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL20 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, crawlerURLArray21);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet24 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray25 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26, hTMLPageResponseArray25);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult28 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, hTMLPageResponseSet24, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26);
        java.lang.String str29 = crawlerResult28.getTheStartPoint();
        java.lang.String str30 = crawlerResult28.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = crawlerResult28.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet32 = crawlerResult28.getNonWorkingUrls();
        boolean boolean33 = hTMLPageResponse13.equals((java.lang.Object) crawlerResult28);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet34 = crawlerResult28.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet35 = crawlerResult28.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet36 = crawlerResult28.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet37 = crawlerResult28.getUrls();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder39 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder41 = builder39.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration42 = builder41.build();
        java.lang.String str43 = crawlerConfiguration42.getStartUrl();
        java.lang.String str44 = crawlerConfiguration42.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap45 = crawlerConfiguration42.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap46 = crawlerConfiguration42.getRequestHeadersMap();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL50 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray51 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL50 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet52 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet52, crawlerURLArray51);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet54 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray55 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet56 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet56, hTMLPageResponseArray55);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult58 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet52, hTMLPageResponseSet54, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet56);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet59 = crawlerResult58.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet60 = crawlerResult58.getUrls();
        boolean boolean61 = crawlerConfiguration42.equals((java.lang.Object) crawlerURLSet60);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL65 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray66 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL65 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet67 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean68 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet67, crawlerURLArray66);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet69 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray70 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet71 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean72 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet71, hTMLPageResponseArray70);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult73 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet67, hTMLPageResponseSet69, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet71);
        java.lang.String str74 = crawlerResult73.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet75 = crawlerResult73.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet76 = crawlerResult73.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet77 = crawlerResult73.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet78 = crawlerResult73.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL82 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray83 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL82 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet84 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet84, crawlerURLArray83);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet86 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray87 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet88 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean89 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet88, hTMLPageResponseArray87);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult90 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet84, hTMLPageResponseSet86, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet88);
        java.lang.String str91 = crawlerResult90.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet92 = crawlerResult90.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult93 = new com.soulgalore.crawler.core.CrawlerResult("97", crawlerURLSet60, hTMLPageResponseSet78, hTMLPageResponseSet92);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet94 = null;
        com.soulgalore.crawler.core.CrawlerResult crawlerResult95 = new com.soulgalore.crawler.core.CrawlerResult("35", crawlerURLSet37, hTMLPageResponseSet78, hTMLPageResponseSet94);
        org.junit.Assert.assertNotNull(headerUtil5);
        org.junit.Assert.assertNotNull(strMap7);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "urls.txt" + "'", str16, "urls.txt");
        org.junit.Assert.assertNotNull(crawlerURLArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "hi!" + "'", str30, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet31);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet34);
        org.junit.Assert.assertNotNull(crawlerURLSet35);
        org.junit.Assert.assertNotNull(crawlerURLSet36);
        org.junit.Assert.assertNotNull(crawlerURLSet37);
        org.junit.Assert.assertNotNull(builder39);
        org.junit.Assert.assertNotNull(builder41);
        org.junit.Assert.assertNotNull(crawlerConfiguration42);
        org.junit.Assert.assertNull(str43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(strMap45);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertNotNull(crawlerURLArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet59);
        org.junit.Assert.assertNotNull(crawlerURLSet60);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray66);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "hi!" + "'", str74, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet75);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet76);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet77);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet78);
        org.junit.Assert.assertNotNull(crawlerURLArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray87);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "hi!" + "'", str91, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet92);
    }

    @Test
    public void test13191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13191");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        long long17 = hTMLPageResponse12.getFetchTime();
        java.lang.String str18 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = hTMLPageResponse12.getPageUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap20 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str21 = hTMLPageResponse12.getEncoding();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.soulgalore.crawler.auth" + "'", str18, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURL19);
        org.junit.Assert.assertNull(strMap20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str21, "com.soulgalore.crawler.http.socket.timeout");
    }

    @Test
    public void test13192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13192");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder2.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder2.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration7 = builder2.build();
        java.lang.String str8 = crawlerConfiguration7.getNotOnPath();
        java.lang.String str9 = crawlerConfiguration7.getRequestHeaders();
        java.lang.String str10 = crawlerConfiguration7.getOnlyOnPath();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse15 = new com.soulgalore.crawler.core.assets.AssetResponse("Response timed out", "0", 580, (long) (byte) -1);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL21 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI22 = crawlerURL21.getUri();
        java.lang.String str23 = crawlerURL21.getReferer();
        java.lang.String str24 = crawlerURL21.getReferer();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder26 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder26.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration29 = builder28.build();
        java.lang.String str30 = crawlerConfiguration29.getStartUrl();
        int int31 = crawlerConfiguration29.getMaxLevels();
        int int32 = crawlerConfiguration29.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap33 = crawlerConfiguration29.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse39 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL21, (int) (byte) -1, strMap33, "100", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) (short) -1, "com.soulgalore.crawler.nrofhttpthreads", 0L);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse45 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, 580, strMap33, "10", "HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth", 580L, "0", (long) 0);
        boolean boolean46 = assetResponse15.equals((java.lang.Object) 0);
        java.lang.String str47 = assetResponse15.getUrl();
        boolean boolean48 = crawlerConfiguration7.equals((java.lang.Object) assetResponse15);
        java.util.Map<java.lang.String, java.lang.String> strMap49 = crawlerConfiguration7.getRequestHeadersMap();
        java.util.Map<java.lang.String, java.lang.String> strMap50 = crawlerConfiguration7.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable52 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:Redirected to new domain", assetFetcher1, strMap50, "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse53 = assetResponseCallable52.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(crawlerConfiguration7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNull(uRI22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "urls.txt" + "'", str23, "urls.txt");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "urls.txt" + "'", str24, "urls.txt");
        org.junit.Assert.assertNotNull(builder26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(crawlerConfiguration29);
        org.junit.Assert.assertNull(str30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(strMap33);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "Response timed out" + "'", str47, "Response timed out");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap50);
    }

    @Test
    public void test13193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13193");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.lang.String str2 = crawlerURL1.getReferer();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        java.lang.String str5 = crawlerURL4.getUrl();
        java.lang.String str6 = crawlerURL4.toString();
        java.lang.String str7 = crawlerURL4.toString();
        boolean boolean8 = crawlerURL1.equals((java.lang.Object) crawlerURL4);
        java.lang.String str9 = crawlerURL1.getReferer();
        java.lang.String str10 = crawlerURL1.getHost();
        java.lang.String str11 = crawlerURL1.getHost();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "CrawlerURL url:hi!" + "'", str6, "CrawlerURL url:hi!");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "CrawlerURL url:hi!" + "'", str7, "CrawlerURL url:hi!");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(str11);
    }

    @Test
    public void test13194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13194");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher3 = null;
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration11 = builder4.build();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration11.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable14 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("com.soulgalore.crawler.auth", assetFetcher3, strMap12, "AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable16 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:97", assetFetcher1, strMap12, "Malformed url");
        java.lang.String str17 = assetResponseCallable16.toString();
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.core.assets.AssetResponse assetResponse18 = assetResponseCallable16.call();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(crawlerConfiguration11);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:97" + "'", str17, "AssetResponseCallable url:AssetResponseCallable url:97");
    }

    @Test
    public void test13195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13195");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL15 = hTMLPageResponse12.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        java.net.URI uRI17 = crawlerURL16.getUri();
        java.lang.String str18 = crawlerURL16.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertNotNull(crawlerURL15);
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertNull(uRI17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "CrawlerURL url:com.soulgalore.crawler.auth" + "'", str18, "CrawlerURL url:com.soulgalore.crawler.auth");
    }

    @Test
    public void test13196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13196");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:52encoding:100 type:com.soulgalore.crawler.http.socket.timeout", 580, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 580 + "'", int5 == 580);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 580 + "'", int6 == 580);
    }

    @Test
    public void test13197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13197");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout", "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:582encoding:hi! type:AssetResponseCallable url:result.csv");
        java.lang.String str3 = crawlerURL2.getUrl();
        java.lang.String str4 = crawlerURL2.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout" + "'", str3, "CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CrawlerURL url:CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout" + "'", str4, "CrawlerURL url:CrawlerURL url:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
    }

    @Test
    public void test13198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13198");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("errorassets.csv");
        java.lang.String str2 = crawlerURL1.getHost();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL6 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean7 = crawlerURL6.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL10 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean11 = crawlerURL10.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL14 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI15 = crawlerURL14.getUri();
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray16 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL6, crawlerURL10, crawlerURL14 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet17 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet17, crawlerURLArray16);
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray19 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet20 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet20, hTMLPageResponseArray19);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL25 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray26 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL25 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet27 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet27, crawlerURLArray26);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet29 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray30 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet31, hTMLPageResponseArray30);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult33 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet27, hTMLPageResponseSet29, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet31);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult34 = new com.soulgalore.crawler.core.CrawlerResult("com.soulgalore.crawler.auth", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet17, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet20, hTMLPageResponseSet29);
        boolean boolean35 = crawlerURL1.equals((java.lang.Object) "com.soulgalore.crawler.auth");
        java.net.URI uRI36 = crawlerURL1.getUri();
        java.net.URI uRI37 = crawlerURL1.getUri();
        java.lang.String str38 = crawlerURL1.getHost();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNull(uRI15);
        org.junit.Assert.assertNotNull(crawlerURLArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(uRI36);
        org.junit.Assert.assertNull(uRI37);
        org.junit.Assert.assertNull(str38);
    }

    @Test
    public void test13199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13199");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder0.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setStartUrl("Response timed out");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setStartUrl("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setStartUrl("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration21 = builder18.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder18.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder23.setRequestHeaders("AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration26 = builder23.build();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder28 = builder23.setStartUrl("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder30 = builder28.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder32 = builder28.setVerifyUrls(false);
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(crawlerConfiguration21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(crawlerConfiguration26);
        org.junit.Assert.assertNotNull(builder28);
        org.junit.Assert.assertNotNull(builder30);
        org.junit.Assert.assertNotNull(builder32);
    }

    @Test
    public void test13200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13200");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI2 = crawlerURL1.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL5 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean6 = crawlerURL5.isWrongSyntax();
        java.lang.String str7 = crawlerURL5.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap9 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse15 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL5, (int) 'a', strMap9, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str16 = hTMLPageResponse15.getUrl();
        boolean boolean17 = crawlerURL1.equals((java.lang.Object) str16);
        boolean boolean18 = crawlerURL1.isWrongSyntax();
        java.lang.String str19 = crawlerURL1.getHost();
        java.lang.String str20 = crawlerURL1.getReferer();
        boolean boolean21 = crawlerURL1.isWrongSyntax();
        boolean boolean22 = crawlerURL1.isWrongSyntax();
        org.junit.Assert.assertNull(uRI2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "urls.txt" + "'", str7, "urls.txt");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.soulgalore.crawler.auth" + "'", str16, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test13201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13201");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.lang.String str5 = crawlerURL2.getHost();
        java.lang.String str6 = crawlerURL2.getHost();
        java.net.URI uRI7 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder9 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder11 = builder9.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration12 = builder11.build();
        java.lang.String str13 = crawlerConfiguration12.getStartUrl();
        int int14 = crawlerConfiguration12.getMaxLevels();
        int int15 = crawlerConfiguration12.getMaxLevels();
        java.lang.String str16 = crawlerConfiguration12.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration12.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) '4', strMap17, "com.soulgalore.crawler.http.socket.timeout", "Response timed out", (long) '#', "Malformed url", 1L);
        int int24 = hTMLPageResponse23.getResponseCode();
        java.util.Map<java.lang.String, java.lang.String> strMap25 = hTMLPageResponse23.getResponseHeaders();
        long long26 = hTMLPageResponse23.getFetchTime();
        java.lang.String str27 = hTMLPageResponse23.getResponseType();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNull(uRI7);
        org.junit.Assert.assertNotNull(builder9);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(crawlerConfiguration12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(strMap25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 1L + "'", long26 == 1L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Malformed url" + "'", str27, "Malformed url");
    }

    @Test
    public void test13202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13202");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder10.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration15 = builder10.build();
        java.lang.String str16 = crawlerConfiguration15.getRequestHeaders();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = crawlerConfiguration15.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL7, (-1), strMap17, "errorurls.txt", "errorurls.txt", (long) 580, "com.soulgalore.crawler.auth", (long) 580);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse29 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 100, strMap17, "com.soulgalore.crawler.http.connection.timeout", "Malformed url", (long) 580, "-1", (-1L));
        java.util.Map<java.lang.String, java.lang.String> strMap30 = hTMLPageResponse29.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL33 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean34 = crawlerURL33.isWrongSyntax();
        java.lang.String str35 = crawlerURL33.getReferer();
        java.lang.String str36 = crawlerURL33.getHost();
        java.lang.String str37 = crawlerURL33.getUrl();
        boolean boolean38 = hTMLPageResponse29.equals((java.lang.Object) crawlerURL33);
        java.lang.String str39 = hTMLPageResponse29.getUrl();
        java.lang.String str40 = hTMLPageResponse29.getUrl();
        org.jsoup.nodes.Document document41 = hTMLPageResponse29.getBody();
        java.lang.String str42 = hTMLPageResponse29.getEncoding();
        java.lang.String str43 = hTMLPageResponse29.getResponseType();
        org.jsoup.nodes.Document document44 = hTMLPageResponse29.getBody();
        java.lang.String str45 = hTMLPageResponse29.getEncoding();
        java.lang.String str46 = hTMLPageResponse29.toString();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(crawlerConfiguration15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(strMap17);
        org.junit.Assert.assertNotNull(strMap30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "urls.txt" + "'", str35, "urls.txt");
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "com.soulgalore.crawler.auth" + "'", str37, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "com.soulgalore.crawler.auth" + "'", str39, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "com.soulgalore.crawler.auth" + "'", str40, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(document41);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Malformed url" + "'", str42, "Malformed url");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "-1" + "'", str43, "-1");
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "Malformed url" + "'", str45, "Malformed url");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1" + "'", str46, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
    }

    @Test
    public void test13203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13203");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Malformed url", "AssetResponseCallable url:AssetResponseCallable url:Unknown error", (int) (byte) -1, 97L);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL6 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL9 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI10 = crawlerURL9.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL13 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean14 = crawlerURL13.isWrongSyntax();
        java.lang.String str15 = crawlerURL13.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap17 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse23 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL13, (int) 'a', strMap17, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str24 = hTMLPageResponse23.getUrl();
        boolean boolean25 = crawlerURL9.equals((java.lang.Object) str24);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher28 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil29 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = headerUtil29.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable33 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher28, strMap31, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse39 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL9, (int) (short) 100, strMap31, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse45 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL6, (int) (short) -1, strMap31, "com.soulgalore.crawler.http.socket.timeout", "errorurls.txt", (long) 100, "result.csv", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap46 = hTMLPageResponse45.getResponseHeaders();
        long long47 = hTMLPageResponse45.getFetchTime();
        java.lang.String str48 = hTMLPageResponse45.getResponseType();
        boolean boolean49 = assetResponse4.equals((java.lang.Object) hTMLPageResponse45);
        java.lang.String str51 = hTMLPageResponse45.getHeaderValue("AssetResponseCallable url:97");
        long long52 = hTMLPageResponse45.getFetchTime();
        org.junit.Assert.assertNull(uRI10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "urls.txt" + "'", str15, "urls.txt");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "com.soulgalore.crawler.auth" + "'", str24, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(headerUtil29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertNotNull(strMap46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "result.csv" + "'", str48, "result.csv");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
    }

    @Test
    public void test13204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13204");
        com.soulgalore.crawler.util.AuthUtil authUtil0 = com.soulgalore.crawler.util.AuthUtil.getInstance();
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet2 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet4 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet6 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet8 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet10 = authUtil0.createAuthsFromString("");
        java.util.Set<com.soulgalore.crawler.util.Auth> authSet12 = authUtil0.createAuthsFromString("");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Set<com.soulgalore.crawler.util.Auth> authSet14 = authUtil0.createAuthsFromString("AssetResponseCallable url:CrawlerURL url:-1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:AssetResponseCallable url:CrawlerURL url:-1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(authUtil0);
        org.junit.Assert.assertNotNull(authSet2);
        org.junit.Assert.assertNotNull(authSet4);
        org.junit.Assert.assertNotNull(authSet6);
        org.junit.Assert.assertNotNull(authSet8);
        org.junit.Assert.assertNotNull(authSet10);
        org.junit.Assert.assertNotNull(authSet12);
    }

    @Test
    public void test13205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13205");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider((int) (byte) 10, 582, (int) (byte) -1, "AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:32encoding:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:Unknown error type:AssetResponseCallable url:Malformed url type:com.soulgalore.crawler.http.connection.timeout", "AssetResponseCallable url:AssetResponseCallable url:Wrong content type");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"HTMLPageResponseurl\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13206");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL1 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        java.lang.String str2 = crawlerURL1.toString();
        boolean boolean3 = crawlerURL1.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setStartUrl("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setMaxLevels((int) (short) -1);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder6.setOnlyOnPath("AssetResponseCallable url:100");
        boolean boolean13 = crawlerURL1.equals((java.lang.Object) builder6);
        java.lang.String str14 = crawlerURL1.getReferer();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "CrawlerURL url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str2, "CrawlerURL url:AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test13207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13207");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.lang.String str16 = hTMLPageResponse12.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = hTMLPageResponse12.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL18 = hTMLPageResponse12.getPageUrl();
        int int19 = hTMLPageResponse12.getResponseCode();
        java.lang.String str20 = hTMLPageResponse12.getEncoding();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL23 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean24 = crawlerURL23.isWrongSyntax();
        java.lang.String str25 = crawlerURL23.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap27 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse33 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL23, (int) 'a', strMap27, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str34 = hTMLPageResponse33.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder35 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean36 = hTMLPageResponse33.equals((java.lang.Object) builder35);
        com.soulgalore.crawler.guice.ExecutorServiceProvider executorServiceProvider38 = new com.soulgalore.crawler.guice.ExecutorServiceProvider((int) (byte) 100);
        java.util.concurrent.ExecutorService executorService39 = executorServiceProvider38.get();
        java.util.concurrent.ExecutorService executorService40 = executorServiceProvider38.get();
        boolean boolean41 = hTMLPageResponse33.equals((java.lang.Object) executorService40);
        boolean boolean42 = hTMLPageResponse12.equals((java.lang.Object) boolean41);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL46 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray47 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL46 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet48 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet48, crawlerURLArray47);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray51 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet52 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet52, hTMLPageResponseArray51);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult54 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet48, hTMLPageResponseSet50, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet52);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet55 = crawlerResult54.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet56 = crawlerResult54.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet57 = crawlerResult54.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet58 = crawlerResult54.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet59 = crawlerResult54.getUrls();
        boolean boolean60 = hTMLPageResponse12.equals((java.lang.Object) crawlerURLSet59);
        long long61 = hTMLPageResponse12.getFetchTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str16, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(crawlerURL17);
        org.junit.Assert.assertNotNull(crawlerURL18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 97 + "'", int19 == 97);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str20, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "urls.txt" + "'", str25, "urls.txt");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "com.soulgalore.crawler.auth" + "'", str34, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(executorService39);
        org.junit.Assert.assertNotNull(executorService40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet55);
        org.junit.Assert.assertNotNull(crawlerURLSet56);
        org.junit.Assert.assertNotNull(crawlerURLSet57);
        org.junit.Assert.assertNotNull(crawlerURLSet58);
        org.junit.Assert.assertNotNull(crawlerURLSet59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 100L + "'", long61 == 100L);
    }

    @Test
    public void test13208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13208");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI3 = crawlerURL2.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder5 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder7 = builder5.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration8 = builder7.build();
        java.lang.String str9 = crawlerConfiguration8.getStartUrl();
        int int10 = crawlerConfiguration8.getMaxLevels();
        int int11 = crawlerConfiguration8.getMaxLevels();
        java.util.Map<java.lang.String, java.lang.String> strMap12 = crawlerConfiguration8.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse18 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) (short) 10, strMap12, "1", "com.soulgalore.crawler.http.connection.timeout", 10L, "com.soulgalore.crawler.http.connection.timeout", (long) 580);
        int int19 = hTMLPageResponse18.getResponseCode();
        long long20 = hTMLPageResponse18.getFetchTime();
        int int21 = hTMLPageResponse18.getResponseCode();
        java.lang.String str22 = hTMLPageResponse18.getResponseType();
        java.lang.String str23 = hTMLPageResponse18.getEncoding();
        org.junit.Assert.assertNull(uRI3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(crawlerConfiguration8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 580L + "'", long20 == 580L);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str22, "com.soulgalore.crawler.http.connection.timeout");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "com.soulgalore.crawler.http.connection.timeout" + "'", str23, "com.soulgalore.crawler.http.connection.timeout");
    }

    @Test
    public void test13209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13209");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.lang.String str7 = crawlerConfiguration5.getRequestHeaders();
        java.lang.String str8 = crawlerConfiguration5.getStartUrl();
        boolean boolean9 = crawlerConfiguration5.isVerifyUrls();
        int int10 = crawlerConfiguration5.getMaxLevels();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL12 = new com.soulgalore.crawler.core.CrawlerURL("errorassets.csv");
        boolean boolean13 = crawlerConfiguration5.equals((java.lang.Object) crawlerURL12);
        java.lang.String str14 = crawlerConfiguration5.getNotOnPath();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean18 = crawlerURL17.isWrongSyntax();
        java.lang.String str19 = crawlerURL17.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse27 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, (int) 'a', strMap21, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str28 = hTMLPageResponse27.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean30 = hTMLPageResponse27.equals((java.lang.Object) builder29);
        long long31 = hTMLPageResponse27.getFetchTime();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL34 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean35 = crawlerURL34.isWrongSyntax();
        java.lang.String str36 = crawlerURL34.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap38 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse44 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL34, (int) 'a', strMap38, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str45 = hTMLPageResponse44.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder46 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean47 = hTMLPageResponse44.equals((java.lang.Object) builder46);
        long long48 = hTMLPageResponse44.getFetchTime();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder49 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder51 = builder49.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder53 = builder49.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder55 = builder49.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration56 = builder49.build();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = crawlerConfiguration56.getRequestHeadersMap();
        boolean boolean58 = hTMLPageResponse44.equals((java.lang.Object) crawlerConfiguration56);
        boolean boolean59 = hTMLPageResponse27.equals((java.lang.Object) boolean58);
        java.lang.String str60 = hTMLPageResponse27.toString();
        boolean boolean61 = crawlerConfiguration5.equals((java.lang.Object) hTMLPageResponse27);
        int int62 = hTMLPageResponse27.getResponseCode();
        java.lang.String str63 = hTMLPageResponse27.getResponseType();
        java.lang.Class<?> wildcardClass64 = hTMLPageResponse27.getClass();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "urls.txt" + "'", str19, "urls.txt");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "com.soulgalore.crawler.auth" + "'", str28, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "urls.txt" + "'", str36, "urls.txt");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "com.soulgalore.crawler.auth" + "'", str45, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 100L + "'", long48 == 100L);
        org.junit.Assert.assertNotNull(builder49);
        org.junit.Assert.assertNotNull(builder51);
        org.junit.Assert.assertNotNull(builder53);
        org.junit.Assert.assertNotNull(builder55);
        org.junit.Assert.assertNotNull(crawlerConfiguration56);
        org.junit.Assert.assertNotNull(strMap57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str60, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 97 + "'", int62 == 97);
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "" + "'", str63, "");
        org.junit.Assert.assertNotNull(wildcardClass64);
    }

    @Test
    public void test13210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13210");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet15 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray20 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL19 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, crawlerURLArray20);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet23 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray24 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet25 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25, hTMLPageResponseArray24);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult27 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, hTMLPageResponseSet23, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet28 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet29 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult27.getUrls();
        java.lang.String str31 = crawlerResult27.getTheStartPoint();
        java.lang.String str32 = crawlerResult27.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet33 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet34 = crawlerResult27.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray40 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL39 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet41 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, crawlerURLArray40);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet43 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray44 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet45 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean46 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45, hTMLPageResponseArray44);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult47 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet41, hTMLPageResponseSet43, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet45);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet48 = crawlerResult47.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet49 = crawlerResult47.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet50 = crawlerResult47.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet51 = crawlerResult47.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet52 = crawlerResult47.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet53 = crawlerResult47.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL57 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray58 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL57 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet59 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean60 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet59, crawlerURLArray58);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet61 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray62 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet63 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet63, hTMLPageResponseArray62);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult65 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet59, hTMLPageResponseSet61, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet63);
        java.lang.String str66 = crawlerResult65.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet67 = crawlerResult65.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet68 = crawlerResult65.getNonWorkingUrls();
        java.lang.String str69 = crawlerResult65.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet70 = crawlerResult65.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL74 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray75 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL74 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet76 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet76, crawlerURLArray75);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet78 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray79 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet80 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet80, hTMLPageResponseArray79);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult82 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet76, hTMLPageResponseSet78, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet80);
        java.lang.String str83 = crawlerResult82.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet84 = crawlerResult82.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet85 = crawlerResult82.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult86 = new com.soulgalore.crawler.core.CrawlerResult("CrawlerURL url:urls.txt", crawlerURLSet53, hTMLPageResponseSet70, hTMLPageResponseSet85);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult87 = new com.soulgalore.crawler.core.CrawlerResult("32", crawlerURLSet15, hTMLPageResponseSet34, hTMLPageResponseSet70);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet88 = crawlerResult87.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet89 = crawlerResult87.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet90 = crawlerResult87.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet91 = crawlerResult87.getUrls();
        java.lang.String str92 = crawlerResult87.getTheStartPoint();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(crawlerURLSet15);
        org.junit.Assert.assertNotNull(crawlerURLArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet28);
        org.junit.Assert.assertNotNull(crawlerURLSet29);
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "hi!" + "'", str31, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet33);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet34);
        org.junit.Assert.assertNotNull(crawlerURLArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray44);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet48);
        org.junit.Assert.assertNotNull(crawlerURLSet49);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet50);
        org.junit.Assert.assertNotNull(crawlerURLSet51);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet52);
        org.junit.Assert.assertNotNull(crawlerURLSet53);
        org.junit.Assert.assertNotNull(crawlerURLArray58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "hi!" + "'", str66, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet67);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet68);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "hi!" + "'", str69, "hi!");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet70);
        org.junit.Assert.assertNotNull(crawlerURLArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "hi!" + "'", str83, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet84);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet85);
        org.junit.Assert.assertNotNull(crawlerURLSet88);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet89);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet90);
        org.junit.Assert.assertNotNull(crawlerURLSet91);
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "32" + "'", str92, "32");
    }

    @Test
    public void test13211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13211");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean5 = crawlerURL4.isWrongSyntax();
        java.lang.String str6 = crawlerURL4.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse14 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL4, (int) 'a', strMap8, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str15 = hTMLPageResponse14.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = hTMLPageResponse14.getResponseHeaders();
        java.lang.String str17 = hTMLPageResponse14.getEncoding();
        java.lang.String str18 = hTMLPageResponse14.toString();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = hTMLPageResponse14.getPageUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = hTMLPageResponse14.getPageUrl();
        int int21 = hTMLPageResponse14.getResponseCode();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = hTMLPageResponse14.getPageUrl();
        java.lang.String str23 = crawlerURL22.getReferer();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = new com.soulgalore.crawler.core.CrawlerURL("urls.txt", "Response timed out");
        com.soulgalore.crawler.util.HeaderUtil headerUtil29 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap31 = headerUtil29.createHeadersFromString("");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse37 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL27, (int) '4', strMap31, "com.soulgalore.crawler.http.socket.timeout", "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:", (long) 580, "com.soulgalore.crawler.auth", (long) (short) 1);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse43 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, (int) (byte) 1, strMap31, "AssetResponseCallable url:Malformed url", "urls.txt", (long) (byte) 10, "com.soulgalore.crawler.http.connection.timeout", (long) 97);
        java.lang.String str44 = crawlerURL22.getUrl();
        java.net.URI uRI45 = crawlerURL22.getUri();
        java.lang.String str46 = crawlerURL22.getHost();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL49 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI50 = crawlerURL49.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL53 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean54 = crawlerURL53.isWrongSyntax();
        java.lang.String str55 = crawlerURL53.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap57 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse63 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL53, (int) 'a', strMap57, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str64 = hTMLPageResponse63.getUrl();
        boolean boolean65 = crawlerURL49.equals((java.lang.Object) str64);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher68 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil69 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap71 = headerUtil69.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable73 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher68, strMap71, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse79 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL49, (int) (short) 100, strMap71, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        org.jsoup.nodes.Document document80 = hTMLPageResponse79.getBody();
        java.lang.String str82 = hTMLPageResponse79.getHeaderValue("CrawlerURL url:com.soulgalore.crawler.nrofhttpthreads");
        java.util.Map<java.lang.String, java.lang.String> strMap83 = hTMLPageResponse79.getResponseHeaders();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse89 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, 0, strMap83, "com.soulgalore.crawler.proxy", "errorurls.txt", (long) (-1), "Wrong content type", (long) 97);
        java.lang.String str91 = hTMLPageResponse89.getHeaderValue("AssetResponseCallable url:CrawlerURL url:10");
        java.util.Map<java.lang.String, java.lang.String> strMap92 = hTMLPageResponse89.getResponseHeaders();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable94 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:CrawlerURL url:hi!", assetFetcher1, strMap92, "CrawlerURL url:urls.txt");
        java.lang.String str95 = assetResponseCallable94.toString();
        java.lang.Class<?> wildcardClass96 = assetResponseCallable94.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "urls.txt" + "'", str6, "urls.txt");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str17, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str18, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(crawlerURL19);
        org.junit.Assert.assertNotNull(crawlerURL20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 97 + "'", int21 == 97);
        org.junit.Assert.assertNotNull(crawlerURL22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "urls.txt" + "'", str23, "urls.txt");
        org.junit.Assert.assertNotNull(headerUtil29);
        org.junit.Assert.assertNotNull(strMap31);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "com.soulgalore.crawler.auth" + "'", str44, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNull(uRI45);
        org.junit.Assert.assertNull(str46);
        org.junit.Assert.assertNull(uRI50);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "urls.txt" + "'", str55, "urls.txt");
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "com.soulgalore.crawler.auth" + "'", str64, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(headerUtil69);
        org.junit.Assert.assertNotNull(strMap71);
        org.junit.Assert.assertNull(document80);
        org.junit.Assert.assertNull(str82);
        org.junit.Assert.assertNotNull(strMap83);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNotNull(strMap92);
        org.junit.Assert.assertEquals("'" + str95 + "' != '" + "AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:hi!" + "'", str95, "AssetResponseCallable url:AssetResponseCallable url:CrawlerURL url:hi!");
        org.junit.Assert.assertNotNull(wildcardClass96);
    }

    @Test
    public void test13212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13212");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getOnlyOnPath();
        boolean boolean5 = crawlerConfiguration3.isVerifyUrls();
        int int6 = crawlerConfiguration3.getMaxLevels();
        java.lang.String str7 = crawlerConfiguration3.getNotOnPath();
        java.lang.String str8 = crawlerConfiguration3.getRequestHeaders();
        java.lang.String str9 = crawlerConfiguration3.getStartUrl();
        java.lang.String str10 = crawlerConfiguration3.getNotOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap11 = crawlerConfiguration3.getRequestHeadersMap();
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray12 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet13 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13, assetResponseArray12);
        com.soulgalore.crawler.core.assets.AssetResponse[] assetResponseArray15 = new com.soulgalore.crawler.core.assets.AssetResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet16 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.assets.AssetResponse>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet16, assetResponseArray15);
        com.soulgalore.crawler.core.assets.AssetsVerificationResult assetsVerificationResult18 = new com.soulgalore.crawler.core.assets.AssetsVerificationResult((java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet13, (java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse>) assetResponseSet16);
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet19 = assetsVerificationResult18.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet20 = assetsVerificationResult18.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet21 = assetsVerificationResult18.getNonWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet22 = assetsVerificationResult18.getWorkingAssets();
        java.util.Set<com.soulgalore.crawler.core.assets.AssetResponse> assetResponseSet23 = assetsVerificationResult18.getNonWorkingAssets();
        boolean boolean24 = crawlerConfiguration3.equals((java.lang.Object) assetsVerificationResult18);
        java.lang.String str25 = crawlerConfiguration3.getStartUrl();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = crawlerConfiguration3.getRequestHeadersMap();
        java.lang.String str27 = crawlerConfiguration3.getOnlyOnPath();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(strMap11);
        org.junit.Assert.assertNotNull(assetResponseArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(assetResponseArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(assetResponseSet19);
        org.junit.Assert.assertNotNull(assetResponseSet20);
        org.junit.Assert.assertNotNull(assetResponseSet21);
        org.junit.Assert.assertNotNull(assetResponseSet22);
        org.junit.Assert.assertNotNull(assetResponseSet23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNotNull(strMap26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test13213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13213");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("AssetResponseCallable url:AssetResponseCallable url:Unknown error", "");
        com.soulgalore.crawler.util.HeaderUtil headerUtil6 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap8 = headerUtil6.createHeadersFromString("");
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil6.createHeadersFromString("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        java.util.Map<java.lang.String, java.lang.String> strMap12 = headerUtil6.createHeadersFromString("CrawlerURL url:10");
        java.util.Map<java.lang.String, java.lang.String> strMap14 = headerUtil6.createHeadersFromString("AssetResponseCallable url:errorassets.csv");
        java.util.Map<java.lang.String, java.lang.String> strMap16 = headerUtil6.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth");
        java.util.Map<java.lang.String, java.lang.String> strMap18 = headerUtil6.createHeadersFromString("CrawlerURL url:Response timed out");
        java.util.Map<java.lang.String, java.lang.String> strMap20 = headerUtil6.createHeadersFromString("CrawlerURL url:100");
        java.util.Map<java.lang.String, java.lang.String> strMap22 = headerUtil6.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt");
        java.util.Map<java.lang.String, java.lang.String> strMap24 = headerUtil6.createHeadersFromString("AssetResponseCallable url:AssetResponseCallable url:AssetResponseCallable url:Unknown error");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse30 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL4, 582, strMap24, "AssetResponseCallable url:CrawlerURL url:-1", "AssetResponseCallable url:100", 52L, "AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth", (long) 52);
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable32 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:1 type:com.soulgalore.crawler.http.connection.timeout", assetFetcher1, strMap24, "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertNotNull(headerUtil6);
        org.junit.Assert.assertNotNull(strMap8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap12);
        org.junit.Assert.assertNotNull(strMap14);
        org.junit.Assert.assertNotNull(strMap16);
        org.junit.Assert.assertNotNull(strMap18);
        org.junit.Assert.assertNotNull(strMap20);
        org.junit.Assert.assertNotNull(strMap22);
        org.junit.Assert.assertNotNull(strMap24);
    }

    @Test
    public void test13214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13214");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse13 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean14 = assetResponse4.equals((java.lang.Object) 100L);
        java.lang.String str15 = assetResponse4.getReferer();
        java.lang.String str16 = assetResponse4.getReferer();
        boolean boolean18 = assetResponse4.equals((java.lang.Object) "com.soulgalore.crawler.proxy");
        int int19 = assetResponse4.getResponseCode();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean23 = crawlerURL22.isWrongSyntax();
        java.lang.String str24 = crawlerURL22.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap26 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse32 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL22, (int) 'a', strMap26, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        int int33 = hTMLPageResponse32.getResponseCode();
        java.lang.String str34 = hTMLPageResponse32.getResponseType();
        java.lang.String str35 = hTMLPageResponse32.toString();
        java.lang.String str36 = hTMLPageResponse32.getUrl();
        java.lang.String str37 = hTMLPageResponse32.toString();
        boolean boolean38 = assetResponse4.equals((java.lang.Object) hTMLPageResponse32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str40 = hTMLPageResponse32.getHeaderValue("HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:0encoding:AssetResponseCallable url:Unknown error type:AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "urls.txt" + "'", str24, "urls.txt");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 97 + "'", int33 == 97);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str35, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "com.soulgalore.crawler.auth" + "'", str36, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:" + "'", str37, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test13215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13215");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setStartUrl("-1");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setRequestHeaders("AssetResponseCallable url:CrawlerURL url:10");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder8.setNotOnPath("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth type:");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder8.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setStartUrl("Unknown error");
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test13216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13216");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = new com.soulgalore.crawler.core.CrawlerConfiguration.Builder();
        boolean boolean15 = hTMLPageResponse12.equals((java.lang.Object) builder14);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL16 = hTMLPageResponse12.getPageUrl();
        boolean boolean17 = crawlerURL16.isWrongSyntax();
        java.lang.String str18 = crawlerURL16.getUrl();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.auth" + "'", str13, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(crawlerURL16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "com.soulgalore.crawler.auth" + "'", str18, "com.soulgalore.crawler.auth");
    }

    @Test
    public void test13217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13217");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher3 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL6 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean7 = crawlerURL6.isWrongSyntax();
        java.lang.String str8 = crawlerURL6.getReferer();
        java.lang.String str9 = crawlerURL6.getHost();
        java.lang.String str10 = crawlerURL6.getHost();
        java.net.URI uRI11 = crawlerURL6.getUri();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder13 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder15 = builder13.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration16 = builder15.build();
        java.lang.String str17 = crawlerConfiguration16.getStartUrl();
        int int18 = crawlerConfiguration16.getMaxLevels();
        int int19 = crawlerConfiguration16.getMaxLevels();
        java.lang.String str20 = crawlerConfiguration16.getOnlyOnPath();
        java.util.Map<java.lang.String, java.lang.String> strMap21 = crawlerConfiguration16.getRequestHeadersMap();
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse27 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL6, (int) '4', strMap21, "com.soulgalore.crawler.http.socket.timeout", "Response timed out", (long) '#', "Malformed url", 1L);
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable29 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("AssetResponseCallable url:AssetResponseCallable url:97", assetFetcher3, strMap21, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable31 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("CrawlerURL url:1", assetFetcher1, strMap21, "");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "urls.txt" + "'", str8, "urls.txt");
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNull(uRI11);
        org.junit.Assert.assertNotNull(builder13);
        org.junit.Assert.assertNotNull(builder15);
        org.junit.Assert.assertNotNull(crawlerConfiguration16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strMap21);
    }

    @Test
    public void test13218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13218");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("CrawlerURL url:errorassets.csv", "AssetResponseCallable url:errorassets.csv");
        java.lang.String str3 = crawlerURL2.getReferer();
        java.lang.String str4 = crawlerURL2.toString();
        java.lang.Object obj5 = null;
        boolean boolean6 = crawlerURL2.equals(obj5);
        com.soulgalore.crawler.util.HeaderUtil headerUtil8 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap10 = headerUtil8.createHeadersFromString("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse16 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, 52, strMap10, "CrawlerURL url:CrawlerURL url:Wrong content type", "HTMLPageResponseurl:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1responseCode:10encoding:result.csv type:97", (long) 10, "AssetResponseCallable url:HTMLPageResponseurl:result.csvresponseCode:-1encoding:AssetResponseCallable url:Wrong content type type:CrawlerURL url:errorassets.csv", (long) (-1));
        java.util.Map<java.lang.String, java.lang.String> strMap17 = hTMLPageResponse16.getResponseHeaders();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "AssetResponseCallable url:errorassets.csv" + "'", str3, "AssetResponseCallable url:errorassets.csv");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "CrawlerURL url:CrawlerURL url:errorassets.csv" + "'", str4, "CrawlerURL url:CrawlerURL url:errorassets.csv");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(headerUtil8);
        org.junit.Assert.assertNotNull(strMap10);
        org.junit.Assert.assertNotNull(strMap17);
    }

    @Test
    public void test13219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13219");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:-1encoding:errorurls.txt type:com.soulgalore.crawler.auth", "Redirected to new domain", 35, (long) (-1));
        int int5 = assetResponse4.getResponseCode();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
    }

    @Test
    public void test13220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13220");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration3 = builder2.build();
        java.lang.String str4 = crawlerConfiguration3.getStartUrl();
        boolean boolean5 = crawlerConfiguration3.isVerifyUrls();
        java.lang.String str6 = crawlerConfiguration3.getOnlyOnPath();
        java.lang.String str7 = crawlerConfiguration3.getRequestHeaders();
        int int8 = crawlerConfiguration3.getMaxLevels();
        java.lang.String str9 = crawlerConfiguration3.getStartUrl();
        java.lang.String str10 = crawlerConfiguration3.getNotOnPath();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(crawlerConfiguration3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test13221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13221");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet13 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL19 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray20 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL19 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet21 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, crawlerURLArray20);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet23 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray24 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet25 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25, hTMLPageResponseArray24);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult27 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet21, hTMLPageResponseSet23, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet25);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet28 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet29 = crawlerResult27.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult27.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL34 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray35 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL34 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet36 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet36, crawlerURLArray35);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet38 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray39 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet40 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean41 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet40, hTMLPageResponseArray39);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult42 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet36, hTMLPageResponseSet38, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet40);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet43 = crawlerResult42.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet44 = crawlerResult42.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet45 = crawlerResult42.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet46 = crawlerResult42.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL50 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray51 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL50 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet52 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean53 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet52, crawlerURLArray51);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet54 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray55 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet56 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet56, hTMLPageResponseArray55);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult58 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet52, hTMLPageResponseSet54, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet56);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet59 = crawlerResult58.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet60 = crawlerResult58.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet61 = crawlerResult58.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet62 = crawlerResult58.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet63 = crawlerResult58.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet64 = crawlerResult58.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult65 = new com.soulgalore.crawler.core.CrawlerResult("Malformed url", crawlerURLSet30, hTMLPageResponseSet46, hTMLPageResponseSet64);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet66 = crawlerResult65.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet67 = crawlerResult65.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet68 = crawlerResult65.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet69 = crawlerResult65.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet70 = crawlerResult65.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL74 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray75 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL74 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet76 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean77 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet76, crawlerURLArray75);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet78 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray79 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet80 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet80, hTMLPageResponseArray79);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult82 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet76, hTMLPageResponseSet78, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet80);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet83 = crawlerResult82.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet84 = crawlerResult82.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet85 = crawlerResult82.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet86 = crawlerResult82.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet87 = crawlerResult82.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet88 = crawlerResult82.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet89 = crawlerResult82.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet90 = crawlerResult82.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult91 = new com.soulgalore.crawler.core.CrawlerResult("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:com.soulgalore.crawler.http.connection.timeout type:com.soulgalore.crawler.http.connection.timeout", crawlerURLSet14, hTMLPageResponseSet70, hTMLPageResponseSet90);
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(crawlerURLArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet28);
        org.junit.Assert.assertNotNull(crawlerURLSet29);
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertNotNull(crawlerURLArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray39);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet43);
        org.junit.Assert.assertNotNull(crawlerURLSet44);
        org.junit.Assert.assertNotNull(crawlerURLSet45);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet46);
        org.junit.Assert.assertNotNull(crawlerURLArray51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet59);
        org.junit.Assert.assertNotNull(crawlerURLSet60);
        org.junit.Assert.assertNotNull(crawlerURLSet61);
        org.junit.Assert.assertNotNull(crawlerURLSet62);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet63);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet64);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet66);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet67);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet68);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet69);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet70);
        org.junit.Assert.assertNotNull(crawlerURLArray75);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + true + "'", boolean77 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet83);
        org.junit.Assert.assertNotNull(crawlerURLSet84);
        org.junit.Assert.assertNotNull(crawlerURLSet85);
        org.junit.Assert.assertNotNull(crawlerURLSet86);
        org.junit.Assert.assertNotNull(crawlerURLSet87);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet88);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet89);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet90);
    }

    @Test
    public void test13222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13222");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str13 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str15 = hTMLPageResponse12.getEncoding();
        java.util.Map<java.lang.String, java.lang.String> strMap16 = hTMLPageResponse12.getResponseHeaders();
        java.lang.String str17 = hTMLPageResponse12.getEncoding();
        long long18 = hTMLPageResponse12.getFetchTime();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str13, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str15, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertNull(strMap16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "com.soulgalore.crawler.http.socket.timeout" + "'", str17, "com.soulgalore.crawler.http.socket.timeout");
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
    }

    @Test
    public void test13223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13223");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider(97, (int) (byte) 100, 1, "AssetResponseCallable url:errorassets.csv", "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:97encoding:52 type:CrawlerURL url:com.soulgalore.crawler.auth");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Auth configuration is configured wrongly:AssetResponseCallable url:errorassets.csv");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13224");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain", "");
        java.lang.String str3 = crawlerURL2.getUrl();
        boolean boolean4 = crawlerURL2.isWrongSyntax();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain" + "'", str3, "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding: type:Redirected to new domain");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test13225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13225");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        java.lang.String str5 = assetResponse4.getUrl();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder6.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder6.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder10.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setNotOnPath("");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder14.setRequestHeaders("AssetResponseCallable url:Malformed url");
        boolean boolean17 = assetResponse4.equals((java.lang.Object) "AssetResponseCallable url:Malformed url");
        long long18 = assetResponse4.getFetchTime();
        java.lang.String str19 = assetResponse4.getReferer();
        java.lang.String str20 = assetResponse4.getUrl();
        java.lang.String str21 = assetResponse4.getUrl();
        java.lang.String str22 = assetResponse4.getUrl();
        java.lang.String str23 = assetResponse4.getReferer();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "100" + "'", str19, "100");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "100" + "'", str23, "100");
    }

    @Test
    public void test13226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13226");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int5 = assetResponse4.getResponseCode();
        int int6 = assetResponse4.getResponseCode();
        long long7 = assetResponse4.getFetchTime();
        long long8 = assetResponse4.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse13 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean14 = assetResponse4.equals((java.lang.Object) 100L);
        java.lang.String str15 = assetResponse4.getReferer();
        java.lang.String str16 = assetResponse4.getReferer();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder17 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder19 = builder17.setNotOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder21 = builder17.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder23 = builder17.setNotOnPath("urls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder25 = builder23.setStartUrl("com.soulgalore.crawler.http.connection.timeout");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder27 = builder23.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder29 = builder27.setStartUrl("Response timed out");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder31 = builder29.setVerifyUrls(false);
        boolean boolean32 = assetResponse4.equals((java.lang.Object) false);
        java.lang.String str33 = assetResponse4.getUrl();
        long long34 = assetResponse4.getFetchTime();
        java.lang.String str35 = assetResponse4.getReferer();
        java.lang.String str36 = assetResponse4.getUrl();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse41 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse46 = new com.soulgalore.crawler.core.assets.AssetResponse("", "100", (int) (short) 1, 0L);
        int int47 = assetResponse46.getResponseCode();
        int int48 = assetResponse46.getResponseCode();
        long long49 = assetResponse46.getFetchTime();
        long long50 = assetResponse46.getFetchTime();
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse55 = new com.soulgalore.crawler.core.assets.AssetResponse("com.soulgalore.crawler.auth", "com.soulgalore.crawler.http.socket.timeout", (int) (byte) 0, 100L);
        boolean boolean56 = assetResponse46.equals((java.lang.Object) 100L);
        java.lang.String str57 = assetResponse46.getReferer();
        java.lang.String str58 = assetResponse46.getReferer();
        boolean boolean60 = assetResponse46.equals((java.lang.Object) "com.soulgalore.crawler.proxy");
        boolean boolean61 = assetResponse41.equals((java.lang.Object) boolean60);
        long long62 = assetResponse41.getFetchTime();
        long long63 = assetResponse41.getFetchTime();
        long long64 = assetResponse41.getFetchTime();
        boolean boolean65 = assetResponse4.equals((java.lang.Object) assetResponse41);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "100" + "'", str15, "100");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "100" + "'", str16, "100");
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(builder19);
        org.junit.Assert.assertNotNull(builder21);
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder25);
        org.junit.Assert.assertNotNull(builder27);
        org.junit.Assert.assertNotNull(builder29);
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "100" + "'", str35, "100");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 0L + "'", long50 == 0L);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "100" + "'", str57, "100");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "100" + "'", str58, "100");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 0L + "'", long62 == 0L);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 0L + "'", long64 == 0L);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
    }

    @Test
    public void test13227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13227");
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher1 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL6 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI7 = crawlerURL6.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL10 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean11 = crawlerURL10.isWrongSyntax();
        java.lang.String str12 = crawlerURL10.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap14 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse20 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL10, (int) 'a', strMap14, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str21 = hTMLPageResponse20.getUrl();
        boolean boolean22 = crawlerURL6.equals((java.lang.Object) str21);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher25 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil26 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap28 = headerUtil26.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable30 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher25, strMap28, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse36 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL6, (int) (short) 100, strMap28, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse42 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL3, (int) (short) -1, strMap28, "com.soulgalore.crawler.http.socket.timeout", "errorurls.txt", (long) 100, "result.csv", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap43 = hTMLPageResponse42.getResponseHeaders();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL46 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI47 = crawlerURL46.getUri();
        java.net.URI uRI48 = crawlerURL46.getUri();
        java.net.URI uRI49 = crawlerURL46.getUri();
        java.net.URI uRI50 = crawlerURL46.getUri();
        boolean boolean51 = crawlerURL46.isWrongSyntax();
        java.lang.String str52 = crawlerURL46.getUrl();
        boolean boolean53 = hTMLPageResponse42.equals((java.lang.Object) str52);
        java.util.Map<java.lang.String, java.lang.String> strMap54 = hTMLPageResponse42.getResponseHeaders();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable56 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1", assetFetcher1, strMap54, "HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:97encoding:52 type:CrawlerURL url:com.soulgalore.crawler.auth");
        java.lang.String str57 = assetResponseCallable56.toString();
        org.junit.Assert.assertNull(uRI7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "urls.txt" + "'", str12, "urls.txt");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "com.soulgalore.crawler.auth" + "'", str21, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(headerUtil26);
        org.junit.Assert.assertNotNull(strMap28);
        org.junit.Assert.assertNotNull(strMap43);
        org.junit.Assert.assertNull(uRI47);
        org.junit.Assert.assertNull(uRI48);
        org.junit.Assert.assertNull(uRI49);
        org.junit.Assert.assertNull(uRI50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "com.soulgalore.crawler.auth" + "'", str52, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(strMap54);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "AssetResponseCallable url:HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1" + "'", str57, "AssetResponseCallable url:HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1");
    }

    @Test
    public void test13228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13228");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL2 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean3 = crawlerURL2.isWrongSyntax();
        java.lang.String str4 = crawlerURL2.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap6 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse12 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL2, (int) 'a', strMap6, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        int int13 = hTMLPageResponse12.getResponseCode();
        int int14 = hTMLPageResponse12.getResponseCode();
        java.lang.String str15 = hTMLPageResponse12.getUrl();
        java.lang.String str16 = hTMLPageResponse12.getUrl();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL17 = hTMLPageResponse12.getPageUrl();
        java.lang.String str18 = crawlerURL17.getReferer();
        boolean boolean19 = crawlerURL17.isWrongSyntax();
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher22 = null;
        com.soulgalore.crawler.core.CrawlerURL crawlerURL24 = new com.soulgalore.crawler.core.CrawlerURL("hi!");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL27 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI28 = crawlerURL27.getUri();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL31 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean32 = crawlerURL31.isWrongSyntax();
        java.lang.String str33 = crawlerURL31.getReferer();
        java.util.Map<java.lang.String, java.lang.String> strMap35 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse41 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL31, (int) 'a', strMap35, "", "com.soulgalore.crawler.http.socket.timeout", 1L, "", 100L);
        java.lang.String str42 = hTMLPageResponse41.getUrl();
        boolean boolean43 = crawlerURL27.equals((java.lang.Object) str42);
        com.soulgalore.crawler.core.assets.AssetFetcher assetFetcher46 = null;
        com.soulgalore.crawler.util.HeaderUtil headerUtil47 = com.soulgalore.crawler.util.HeaderUtil.getInstance();
        java.util.Map<java.lang.String, java.lang.String> strMap49 = headerUtil47.createHeadersFromString("");
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable51 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("Unknown error", assetFetcher46, strMap49, "AssetResponseCallable url:result.csv");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse57 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL27, (int) (short) 100, strMap49, "errorurls.txt", "Unknown error", (long) 582, "errorurls.txt", (long) (short) 100);
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse63 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL24, (int) (short) -1, strMap49, "com.soulgalore.crawler.http.socket.timeout", "errorurls.txt", (long) 100, "result.csv", (long) (short) 0);
        java.util.Map<java.lang.String, java.lang.String> strMap64 = hTMLPageResponse63.getResponseHeaders();
        com.soulgalore.crawler.core.assets.AssetResponseCallable assetResponseCallable66 = new com.soulgalore.crawler.core.assets.AssetResponseCallable("com.soulgalore.crawler.nrofhttpthreads", assetFetcher22, strMap64, "HTMLPageResponseurl:urls.txtresponseCode:52encoding:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type: type:com.soulgalore.crawler.auth");
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse72 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL17, (int) (byte) 10, strMap64, "HTMLPageResponseurl:result.csvresponseCode:-1encoding:AssetResponseCallable url:Wrong content type type:CrawlerURL url:errorassets.csv", "HTMLPageResponseurl:CrawlerURL url:com.soulgalore.crawler.authresponseCode:0encoding:CrawlerURL url:result.csv type:-1", (long) 581, "35", 0L);
        java.lang.String str73 = hTMLPageResponse72.getResponseType();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL75 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.nrofhttpthreads");
        java.net.URI uRI76 = crawlerURL75.getUri();
        java.util.Map<java.lang.String, java.lang.String> strMap78 = null;
        com.soulgalore.crawler.core.HTMLPageResponse hTMLPageResponse84 = new com.soulgalore.crawler.core.HTMLPageResponse(crawlerURL75, (int) ' ', strMap78, "AssetResponseCallable url:com.soulgalore.crawler.http.connection.timeout", "hi!", (long) (short) 10, "97", (long) (short) 10);
        int int85 = hTMLPageResponse84.getResponseCode();
        java.lang.String str86 = hTMLPageResponse84.getUrl();
        boolean boolean87 = hTMLPageResponse72.equals((java.lang.Object) hTMLPageResponse84);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str89 = hTMLPageResponse84.getHeaderValue("HTMLPageResponseurl:CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:Malformed url type:-1responseCode:10encoding:AssetResponseCallable url:0 type:AssetResponseCallable url:com.soulgalore.crawler.auth");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "urls.txt" + "'", str4, "urls.txt");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 97 + "'", int13 == 97);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 97 + "'", int14 == 97);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "com.soulgalore.crawler.auth" + "'", str15, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "com.soulgalore.crawler.auth" + "'", str16, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURL17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "urls.txt" + "'", str18, "urls.txt");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(uRI28);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "urls.txt" + "'", str33, "urls.txt");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "com.soulgalore.crawler.auth" + "'", str42, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(headerUtil47);
        org.junit.Assert.assertNotNull(strMap49);
        org.junit.Assert.assertNotNull(strMap64);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "35" + "'", str73, "35");
        org.junit.Assert.assertNull(uRI76);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 32 + "'", int85 == 32);
        org.junit.Assert.assertEquals("'" + str86 + "' != '" + "com.soulgalore.crawler.nrofhttpthreads" + "'", str86, "com.soulgalore.crawler.nrofhttpthreads");
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + false + "'", boolean87 == false);
    }

    @Test
    public void test13229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13229");
        com.soulgalore.crawler.core.assets.AssetResponse assetResponse4 = new com.soulgalore.crawler.core.assets.AssetResponse("CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:", "97", 583, (long) ' ');
        java.lang.String str5 = assetResponse4.getUrl();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:" + "'", str5, "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:10encoding:errorassets.csv type:");
    }

    @Test
    public void test13230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13230");
        // The following exception was thrown during execution in test generation
        try {
            com.soulgalore.crawler.guice.HttpClientProvider httpClientProvider5 = new com.soulgalore.crawler.guice.HttpClientProvider(52, 10, (int) '4', "HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:100encoding:1 type:com.soulgalore.crawler.nrofhttpthreads", "CrawlerURL url:HTMLPageResponseurl:com.soulgalore.crawler.nrofhttpthreadsresponseCode:100encoding:Unknown error type:errorurls.txt");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"com.soulgalore.crawler.authresponseCode\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test13231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13231");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL3 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean4 = crawlerURL3.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL7 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean8 = crawlerURL7.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL11 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI12 = crawlerURL11.getUri();
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray13 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL3, crawlerURL7, crawlerURL11 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet14, crawlerURLArray13);
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray16 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet17 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet17, hTMLPageResponseArray16);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL22 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray23 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL22 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet24 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, crawlerURLArray23);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray27 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet28 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28, hTMLPageResponseArray27);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult30 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet24, hTMLPageResponseSet26, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet28);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult31 = new com.soulgalore.crawler.core.CrawlerResult("com.soulgalore.crawler.auth", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet14, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet17, hTMLPageResponseSet26);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet32 = crawlerResult31.getUrls();
        java.lang.String str33 = crawlerResult31.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet34 = crawlerResult31.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet35 = crawlerResult31.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet36 = crawlerResult31.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet37 = crawlerResult31.getUrls();
        java.lang.String str38 = crawlerResult31.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet39 = crawlerResult31.getUrls();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(uRI12);
        org.junit.Assert.assertNotNull(crawlerURLArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "com.soulgalore.crawler.auth" + "'", str33, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(hTMLPageResponseSet34);
        org.junit.Assert.assertNotNull(crawlerURLSet35);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet36);
        org.junit.Assert.assertNotNull(crawlerURLSet37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "com.soulgalore.crawler.auth" + "'", str38, "com.soulgalore.crawler.auth");
        org.junit.Assert.assertNotNull(crawlerURLSet39);
    }

    @Test
    public void test13232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13232");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels((int) (short) 0);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder6 = builder4.setNotOnPath("errorurls.txt");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder8 = builder4.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder10 = builder4.setNotOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder12 = builder4.setOnlyOnPath("errorassets.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder14 = builder12.setOnlyOnPath("Unknown error");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder16 = builder12.setOnlyOnPath("hi!");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder18 = builder16.setMaxLevels(580);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder20 = builder18.setStartUrl("CrawlerURL url:result.csv");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder22 = builder18.setVerifyUrls(false);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder24 = builder18.setRequestHeaders("AssetResponseCallable url:HTMLPageResponseurl:com.soulgalore.crawler.authresponseCode:97encoding:com.soulgalore.crawler.http.socket.timeout type:");
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration25 = builder24.build();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(builder14);
        org.junit.Assert.assertNotNull(builder16);
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(builder20);
        org.junit.Assert.assertNotNull(builder22);
        org.junit.Assert.assertNotNull(builder24);
        org.junit.Assert.assertNotNull(crawlerConfiguration25);
    }

    @Test
    public void test13233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13233");
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder0 = com.soulgalore.crawler.core.CrawlerConfiguration.builder();
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder2 = builder0.setVerifyUrls(true);
        com.soulgalore.crawler.core.CrawlerConfiguration.Builder builder4 = builder0.setMaxLevels(0);
        com.soulgalore.crawler.core.CrawlerConfiguration crawlerConfiguration5 = builder0.build();
        java.lang.String str6 = crawlerConfiguration5.getRequestHeaders();
        java.lang.String str7 = crawlerConfiguration5.getRequestHeaders();
        boolean boolean9 = crawlerConfiguration5.equals((java.lang.Object) 0.0d);
        java.lang.String str10 = crawlerConfiguration5.getStartUrl();
        boolean boolean11 = crawlerConfiguration5.isVerifyUrls();
        java.lang.String str12 = crawlerConfiguration5.getOnlyOnPath();
        org.junit.Assert.assertNotNull(builder0);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(crawlerConfiguration5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
    }

    @Test
    public void test13234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest26.test13234");
        com.soulgalore.crawler.core.CrawlerURL crawlerURL4 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray5 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL4 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet6 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, crawlerURLArray5);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet8 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray9 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet10 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10, hTMLPageResponseArray9);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult12 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet6, hTMLPageResponseSet8, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet10);
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet13 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet14 = crawlerResult12.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet15 = crawlerResult12.getNonWorkingUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet16 = crawlerResult12.getUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL20 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray21 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL20 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet22 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, crawlerURLArray21);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet24 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray25 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet26 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26, hTMLPageResponseArray25);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult28 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet22, hTMLPageResponseSet24, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet26);
        java.lang.String str29 = crawlerResult28.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet30 = crawlerResult28.getUrls();
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet31 = crawlerResult28.getNonWorkingUrls();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL35 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean36 = crawlerURL35.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL39 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        boolean boolean40 = crawlerURL39.isWrongSyntax();
        com.soulgalore.crawler.core.CrawlerURL crawlerURL43 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        java.net.URI uRI44 = crawlerURL43.getUri();
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray45 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL35, crawlerURL39, crawlerURL43 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet46 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet46, crawlerURLArray45);
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray48 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet49 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet49, hTMLPageResponseArray48);
        com.soulgalore.crawler.core.CrawlerURL crawlerURL54 = new com.soulgalore.crawler.core.CrawlerURL("com.soulgalore.crawler.auth", "urls.txt");
        com.soulgalore.crawler.core.CrawlerURL[] crawlerURLArray55 = new com.soulgalore.crawler.core.CrawlerURL[] { crawlerURL54 };
        java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet56 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.CrawlerURL>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet56, crawlerURLArray55);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet58 = null;
        com.soulgalore.crawler.core.HTMLPageResponse[] hTMLPageResponseArray59 = new com.soulgalore.crawler.core.HTMLPageResponse[] {};
        java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet60 = new java.util.LinkedHashSet<com.soulgalore.crawler.core.HTMLPageResponse>();
        boolean boolean61 = java.util.Collections.addAll((java.util.Collection<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet60, hTMLPageResponseArray59);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult62 = new com.soulgalore.crawler.core.CrawlerResult("hi!", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet56, hTMLPageResponseSet58, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet60);
        com.soulgalore.crawler.core.CrawlerResult crawlerResult63 = new com.soulgalore.crawler.core.CrawlerResult("com.soulgalore.crawler.auth", (java.util.Set<com.soulgalore.crawler.core.CrawlerURL>) crawlerURLSet46, (java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse>) hTMLPageResponseSet49, hTMLPageResponseSet58);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet64 = crawlerResult63.getVerifiedURLResponses();
        com.soulgalore.crawler.core.CrawlerResult crawlerResult65 = new com.soulgalore.crawler.core.CrawlerResult("errorurls.txt", crawlerURLSet16, hTMLPageResponseSet31, hTMLPageResponseSet64);
        java.util.Set<com.soulgalore.crawler.core.HTMLPageResponse> hTMLPageResponseSet66 = crawlerResult65.getVerifiedURLResponses();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet67 = crawlerResult65.getUrls();
        java.lang.String str68 = crawlerResult65.getTheStartPoint();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet69 = crawlerResult65.getUrls();
        java.util.Set<com.soulgalore.crawler.core.CrawlerURL> crawlerURLSet70 = crawlerResult65.getUrls();
        java.lang.String str71 = crawlerResult65.getTheStartPoint();
        org.junit.Assert.assertNotNull(crawlerURLArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(crawlerURLSet13);
        org.junit.Assert.assertNotNull(crawlerURLSet14);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet15);
        org.junit.Assert.assertNotNull(crawlerURLSet16);
        org.junit.Assert.assertNotNull(crawlerURLArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "hi!" + "'", str29, "hi!");
        org.junit.Assert.assertNotNull(crawlerURLSet30);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet31);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(uRI44);
        org.junit.Assert.assertNotNull(crawlerURLArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(crawlerURLArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(hTMLPageResponseArray59);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet64);
        org.junit.Assert.assertNotNull(hTMLPageResponseSet66);
        org.junit.Assert.assertNotNull(crawlerURLSet67);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "errorurls.txt" + "'", str68, "errorurls.txt");
        org.junit.Assert.assertNotNull(crawlerURLSet69);
        org.junit.Assert.assertNotNull(crawlerURLSet70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "errorurls.txt" + "'", str71, "errorurls.txt");
    }
}

