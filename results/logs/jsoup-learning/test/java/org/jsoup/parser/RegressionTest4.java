package org.jsoup.parser;

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
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        java.lang.String str5 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst((java.lang.Character) '\uffff');
        boolean boolean8 = tokenQueue1.matchesWhitespace();
        boolean boolean9 = tokenQueue1.matchesWord();
        java.lang.String str10 = tokenQueue1.consumeTagName();
        char char11 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + char11 + "' != '" + '\uffff' + "'", char11 == '\uffff');
    }

    @Test
    public void test2002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2002");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream4 = parseErrorList3.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList3.iterator();
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList3);
        org.jsoup.parser.Token.Tag tag8 = tokeniser7.tagPending;
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype12 = doctype11.asDoctype();
        java.lang.String str13 = doctype11.tokenType();
        tokeniser7.emit((org.jsoup.parser.Token) doctype11);
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        xmlTreeBuilder0.currentToken = tag16;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        boolean boolean25 = htmlTreeBuilder18.framesetOk();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document28);
        xmlTreeBuilder0.doc = document28;
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream35 = parseErrorList34.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList34.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor37 = parseErrorList34.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList39 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int40 = parseErrorList39.getMaxSize();
        boolean boolean41 = parseErrorList34.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        xmlTreeBuilder0.initialiseParse("hi!#", "0: []", parseErrorList39);
        boolean boolean43 = parseErrorList39.isEmpty();
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorStream4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(parseErrorStream35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorItor37);
        org.junit.Assert.assertNotNull(parseErrorList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
    }

    @Test
    public void test2003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2003");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader2 = new org.jsoup.parser.CharacterReader("StartTag");
        int int4 = characterReader2.nextIndexOf((java.lang.CharSequence) "[]");
        boolean boolean5 = characterReader2.matchesDigit();
        java.lang.String str6 = characterReader2.toString();
        xmlTreeBuilder0.reader = characterReader2;
        java.lang.String str8 = characterReader2.consumeLetterThenDigitSequence();
        boolean boolean9 = characterReader2.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test2004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2004");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag3 = startTag0.asStartTag();
        org.jsoup.parser.Token.Tag tag5 = startTag3.name("");
        startTag3.selfClosing = false;
        org.jsoup.nodes.Attributes attributes8 = startTag3.getAttributes();
        org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean11 = tokenQueue10.isEmpty();
        java.lang.String str13 = tokenQueue10.consumeToIgnoreCase("<hi!>");
        java.lang.String str14 = tokenQueue10.consumeTagName();
        boolean boolean15 = tokenQueue10.matchesWord();
        boolean boolean17 = tokenQueue10.matchesCS("StartTag");
        org.jsoup.parser.TokenQueue tokenQueue19 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str21 = tokenQueue19.chompTo("Doctype");
        java.lang.String str22 = tokenQueue19.consumeWord();
        boolean boolean23 = tokenQueue19.matchesStartTag();
        org.jsoup.parser.Token.EndTag endTag24 = new org.jsoup.parser.Token.EndTag();
        char[] charArray27 = new char[] { '#', '#' };
        endTag24.appendAttributeValue(charArray27);
        boolean boolean29 = tokenQueue19.matchesAny(charArray27);
        boolean boolean30 = tokenQueue10.matchesAny(charArray27);
        startTag3.appendAttributeValue(charArray27);
        org.junit.Assert.assertNotNull(startTag3);
        org.junit.Assert.assertNotNull(tag5);
        org.junit.Assert.assertNotNull(attributes8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EndTag" + "'", str13, "EndTag");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "EndTag" + "'", str21, "EndTag");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(charArray27);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray27), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray27), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray27), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test2005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2005");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str3 = tokenQueue1.chompTo("Doctype");
        java.lang.String str4 = tokenQueue1.consumeWord();
        tokenQueue1.advance();
        boolean boolean6 = tokenQueue1.isEmpty();
        boolean boolean7 = tokenQueue1.matchesWord();
        java.lang.String str8 = tokenQueue1.remainder();
        java.lang.String str9 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str10 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str12 = tokenQueue1.chompToIgnoreCase("St");
        java.lang.String str13 = tokenQueue1.consumeAttributeKey();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test2006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2006");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        boolean boolean2 = startTag1.isCharacter();
        org.jsoup.parser.Token.Doctype doctype3 = new org.jsoup.parser.Token.Doctype();
        java.lang.StringBuilder stringBuilder4 = doctype3.systemIdentifier;
        org.jsoup.parser.Token.TokenType tokenType5 = doctype3.type;
        startTag1.type = tokenType5;
        boolean boolean7 = startTag1.isComment();
        startTag1.appendTagName("35: hi!#");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType5 + "' != '" + org.jsoup.parser.Token.TokenType.Doctype + "'", tokenType5.equals(org.jsoup.parser.Token.TokenType.Doctype));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2007");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeValue("");
        org.jsoup.nodes.Attributes attributes5 = null;
        startTag0.attributes = attributes5;
        boolean boolean7 = startTag0.isDoctype();
        java.lang.String str8 = startTag0.tokenType();
        java.lang.String str9 = startTag0.tagName;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test2008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2008");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream4 = parseErrorList3.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList3.iterator();
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList3);
        xmlTreeBuilder0.tokeniser = tokeniser7;
        org.jsoup.parser.CharacterReader characterReader9 = null;
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream12 = parseErrorList11.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor13 = parseErrorList11.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor14 = parseErrorList11.iterator();
        org.jsoup.parser.Tokeniser tokeniser15 = new org.jsoup.parser.Tokeniser(characterReader9, parseErrorList11);
        org.jsoup.parser.Token.Tag tag16 = tokeniser15.tagPending;
        org.jsoup.parser.Token.Tag tag18 = tokeniser15.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype19 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype20 = doctype19.asDoctype();
        java.lang.String str21 = doctype19.tokenType();
        tokeniser15.emit((org.jsoup.parser.Token) doctype19);
        org.jsoup.parser.ITokeniserState iTokeniserState23 = tokeniser15.getState();
        org.jsoup.parser.TokeniserState tokeniserState24 = org.jsoup.parser.TokeniserState.Rawtext;
        tokeniser15.eofError((org.jsoup.parser.ITokeniserState) tokeniserState24);
        tokeniser7.transition((org.jsoup.parser.ITokeniserState) tokeniserState24);
        org.jsoup.parser.Token.Tag tag28 = tokeniser7.createTagPending(true);
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("Doctype");
        org.jsoup.parser.Token.Tag tag32 = startTag30.name("hi!#");
        startTag30.tagName = "<!---->";
        tokeniser7.tagPending = startTag30;
        org.jsoup.parser.ITokeniserState iTokeniserState36 = tokeniser7.getState();
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        java.lang.String str38 = doctype37.getSystemIdentifier();
        boolean boolean39 = doctype37.forceQuirks;
        boolean boolean40 = doctype37.isCharacter();
        tokeniser7.doctypePending = doctype37;
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorStream4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(parseErrorStream12);
        org.junit.Assert.assertNotNull(parseErrorItor13);
        org.junit.Assert.assertNotNull(parseErrorItor14);
        org.junit.Assert.assertNull(tag16);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(doctype20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Doctype" + "'", str21, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState23);
        org.junit.Assert.assertNotNull(tokeniserState24);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(tag32);
        org.junit.Assert.assertNotNull(iTokeniserState36);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test2009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2009");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.selfClosing = false;
    }

    @Test
    public void test2010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2010");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str3 = tokenQueue1.chompTo("Doctype");
        char char4 = tokenQueue1.peek();
        java.lang.String str5 = tokenQueue1.toString();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertTrue("'" + char4 + "' != '" + '\000' + "'", char4 == '\000');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test2011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2011");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        java.lang.String str5 = tokenQueue1.consumeTagName();
        boolean boolean6 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.consumeWord();
        boolean boolean8 = tokenQueue1.consumeWhitespace();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2012");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor17 = parseErrorList16.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList16.iterator();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder0.parse("StartTag", "[100: ]", parseErrorList16);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getActiveFormattingElement("-1: []");
        org.jsoup.nodes.Element element23 = htmlTreeBuilder0.insert("Comment");
        htmlTreeBuilder0.popStackToBefore("[100: ]");
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parseErrorItor17);
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element23);
    }

    @Test
    public void test2013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2013");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        startTag11.appendTagName('#');
        tokeniser6.tagPending = startTag11;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser6.transition((org.jsoup.parser.ITokeniserState) tokeniserState16);
        tokeniser6.emit('#');
        tokeniser6.createTempBuffer();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test2014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2014");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        boolean boolean1 = endTag0.selfClosing;
        endTag0.appendAttributeValue("Doctype");
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag("hi!");
        boolean boolean6 = startTag5.isCharacter();
        startTag5.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes10 = startTag9.getAttributes();
        startTag5.attributes = attributes10;
        endTag0.attributes = attributes10;
        java.lang.String str13 = endTag0.tokenType();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(attributes10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "EndTag" + "'", str13, "EndTag");
    }

    @Test
    public void test2015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2015");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.generateImpliedEndTags("hi!#");
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token token10 = htmlTreeBuilder0.currentToken;
        htmlTreeBuilder0.framesetOk(true);
        boolean boolean13 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        endTag15.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int22 = parseErrorList21.getMaxSize();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder17.parse("0: Doctype", "hi!", parseErrorList21);
        boolean boolean24 = htmlTreeBuilderState14.process((org.jsoup.parser.Token) endTag15, htmlTreeBuilder17);
        org.jsoup.nodes.FormElement formElement25 = htmlTreeBuilder17.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int31 = parseErrorList30.getMaxSize();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder26.parse("0: Doctype", "hi!", parseErrorList30);
        boolean boolean33 = htmlTreeBuilder26.framesetOk();
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser36 = parser34.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document39 = parser34.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document42 = parser34.parseInput("<hi!>", "[]");
        htmlTreeBuilder26.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document42);
        boolean boolean44 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream53 = parseErrorList52.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor54 = parseErrorList52.iterator();
        boolean boolean55 = parseErrorList50.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52);
        xmlTreeBuilder45.initialiseParse("<!---->", "hi!", parseErrorList50);
        org.jsoup.parser.ParseErrorList parseErrorList60 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder45.parse("", "[]", parseErrorList60);
        boolean boolean62 = htmlTreeBuilder26.isInActiveFormattingElements((org.jsoup.nodes.Element) document61);
        boolean boolean63 = htmlTreeBuilder17.isInActiveFormattingElements((org.jsoup.nodes.Element) document61);
        htmlTreeBuilder0.doc = document61;
        htmlTreeBuilder0.resetInsertionMode();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(formElement25);
        org.junit.Assert.assertNotNull(parseErrorList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertNotNull(parseErrorStream53);
        org.junit.Assert.assertNotNull(parseErrorItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseErrorList60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
    }

    @Test
    public void test2016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2016");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes2 = endTag0.attributes;
        boolean boolean3 = endTag0.isStartTag();
        java.lang.String str4 = endTag0.tagName;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test2017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2017");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str4 = tokenQueue1.consumeWord();
        char char5 = tokenQueue1.peek();
        boolean boolean7 = tokenQueue1.matchChomp("a");
        java.lang.String str8 = tokenQueue1.toString();
        java.lang.String str9 = tokenQueue1.remainder();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + char5 + "' != '" + '\000' + "'", char5 == '\000');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test2018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2018");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("-1: []");
    }

    @Test
    public void test2019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2019");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream4 = parseErrorList3.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList3.iterator();
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList3);
        org.jsoup.parser.Token.Tag tag8 = tokeniser7.tagPending;
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype12 = doctype11.asDoctype();
        java.lang.String str13 = doctype11.tokenType();
        tokeniser7.emit((org.jsoup.parser.Token) doctype11);
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        xmlTreeBuilder0.currentToken = tag16;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        boolean boolean25 = htmlTreeBuilder18.framesetOk();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document28);
        xmlTreeBuilder0.doc = document28;
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream35 = parseErrorList34.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList34.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor37 = parseErrorList34.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList39 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int40 = parseErrorList39.getMaxSize();
        boolean boolean41 = parseErrorList34.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        xmlTreeBuilder0.initialiseParse("hi!#", "0: []", parseErrorList39);
        org.jsoup.parser.TokeniserState tokeniserState43 = org.jsoup.parser.TokeniserState.ScriptDataEscaped;
        boolean boolean44 = parseErrorList39.remove((java.lang.Object) tokeniserState43);
        org.jsoup.parser.Tokeniser tokeniser45 = null;
        org.jsoup.parser.CharacterReader characterReader47 = new org.jsoup.parser.CharacterReader("StartTag");
        java.lang.String str48 = characterReader47.consumeToEnd();
        int int50 = characterReader47.nextIndexOf('a');
        java.lang.String str51 = characterReader47.consumeDigitSequence();
        boolean boolean53 = characterReader47.matchesIgnoreCase("0: []");
        characterReader47.mark();
        int int55 = characterReader47.pos();
        char char56 = characterReader47.current();
        // The following exception was thrown during execution in test generation
        try {
            tokeniserState43.read(tokeniser45, characterReader47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorStream4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(parseErrorStream35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorItor37);
        org.junit.Assert.assertNotNull(parseErrorList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(tokeniserState43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "StartTag" + "'", str48, "StartTag");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 8 + "'", int55 == 8);
        org.junit.Assert.assertTrue("'" + char56 + "' != '" + '\uffff' + "'", char56 == '\uffff');
    }

    @Test
    public void test2020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2020");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream4 = parseErrorList3.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList3.iterator();
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList3);
        org.jsoup.parser.Token.Tag tag8 = tokeniser7.tagPending;
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype12 = doctype11.asDoctype();
        java.lang.String str13 = doctype11.tokenType();
        tokeniser7.emit((org.jsoup.parser.Token) doctype11);
        org.jsoup.parser.Token.Tag tag16 = tokeniser7.createTagPending(true);
        xmlTreeBuilder0.currentToken = tag16;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        boolean boolean25 = htmlTreeBuilder18.framesetOk();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document28);
        xmlTreeBuilder0.doc = document28;
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream35 = parseErrorList34.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList34.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor37 = parseErrorList34.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList39 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int40 = parseErrorList39.getMaxSize();
        boolean boolean41 = parseErrorList34.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        xmlTreeBuilder0.initialiseParse("hi!#", "0: []", parseErrorList39);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder43.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream53 = parseErrorList52.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor54 = parseErrorList52.iterator();
        boolean boolean55 = parseErrorList50.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52);
        xmlTreeBuilder45.initialiseParse("<!---->", "hi!", parseErrorList50);
        xmlTreeBuilder43.errors = parseErrorList50;
        org.jsoup.parser.ParseErrorList parseErrorList61 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream62 = parseErrorList61.stream();
        xmlTreeBuilder43.initialiseParse("a", "[]", parseErrorList61);
        org.jsoup.parser.ParseError parseError66 = new org.jsoup.parser.ParseError((int) '\000', "Comment");
        boolean boolean67 = parseErrorList61.add(parseError66);
        boolean boolean68 = parseErrorList39.add(parseError66);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorStream4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(doctype12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Doctype" + "'", str13, "Doctype");
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(parseErrorStream35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorItor37);
        org.junit.Assert.assertNotNull(parseErrorList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertNotNull(parseErrorStream53);
        org.junit.Assert.assertNotNull(parseErrorItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseErrorList61);
        org.junit.Assert.assertNotNull(parseErrorStream62);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + true + "'", boolean68 == true);
    }

    @Test
    public void test2021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2021");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser1 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState6 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int12 = parseErrorList11.getMaxSize();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder7.parse("0: Doctype", "hi!", parseErrorList11);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int19 = parseErrorList18.getMaxSize();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder14.parse("0: Doctype", "hi!", parseErrorList18);
        boolean boolean21 = htmlTreeBuilder14.framesetOk();
        org.jsoup.nodes.Document document24 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder14.setHeadElement((org.jsoup.nodes.Element) document24);
        org.jsoup.nodes.Element element26 = htmlTreeBuilder14.pop();
        htmlTreeBuilder7.pushActiveFormattingElements(element26);
        boolean boolean28 = htmlTreeBuilder0.isInActiveFormattingElements(element26);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState29 = org.jsoup.parser.HtmlTreeBuilderState.InColumnGroup;
        htmlTreeBuilder0.transition(htmlTreeBuilderState29);
        htmlTreeBuilder0.markInsertionMode();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.nodes.Element element33 = htmlTreeBuilder0.insert("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: String must not be empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(htmlTreeBuilderState6);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState29);
    }

    @Test
    public void test2022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2022");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.Token.Comment comment12 = new org.jsoup.parser.Token.Comment();
        java.lang.String str13 = comment12.toString();
        boolean boolean14 = comment12.isCharacter();
        htmlTreeBuilder0.insert(comment12);
        htmlTreeBuilder0.popStackToClose("0: []");
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.tagName = "hi!";
        endTag18.tagName = "[]";
        htmlTreeBuilder0.currentToken = endTag18;
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "<!---->" + "'", str13, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test2023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2023");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader1.advance();
        characterReader1.advance();
        boolean boolean5 = characterReader1.containsIgnoreCase("tartTag");
        boolean boolean7 = characterReader1.matchConsumeIgnoreCase("StartTaga");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2024");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int8 = parseErrorList7.getMaxSize();
        boolean boolean9 = parseErrorList2.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList7);
        org.jsoup.parser.Token.Doctype doctype11 = new org.jsoup.parser.Token.Doctype();
        boolean boolean12 = doctype11.isCharacter();
        java.lang.String str13 = doctype11.getSystemIdentifier();
        tokeniser10.doctypePending = doctype11;
        java.lang.String str15 = doctype11.getPublicIdentifier();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2025");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str5 = tokenQueue1.consumeToIgnoreCase("StartTag");
        java.lang.String str7 = tokenQueue1.consumeToIgnoreCase("<[100: ]>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "EndTag" + "'", str5, "EndTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2026");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        java.lang.StringBuilder stringBuilder10 = tokeniser6.dataBuffer;
        org.jsoup.parser.Token.EndTag endTag11 = new org.jsoup.parser.Token.EndTag();
        char[] charArray14 = new char[] { '#', '#' };
        endTag11.appendAttributeValue(charArray14);
        tokeniser6.emit(charArray14);
        org.jsoup.parser.ITokeniserState iTokeniserState17 = tokeniser6.getState();
        org.jsoup.parser.Token.Comment comment18 = tokeniser6.commentPending;
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(stringBuilder10);
        org.junit.Assert.assertNotNull(charArray14);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray14), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray14), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray14), "[#, #]");
        org.junit.Assert.assertNotNull(iTokeniserState17);
        org.junit.Assert.assertNull(comment18);
    }

    @Test
    public void test2027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2027");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream19 = parseErrorList18.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor20 = parseErrorList18.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor21 = parseErrorList18.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        boolean boolean25 = parseErrorList18.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23);
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList23);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList23.iterator();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder0.parse("[]", "Doctype", parseErrorList23);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream34 = parseErrorList33.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor35 = parseErrorList33.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList33.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList38 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int39 = parseErrorList38.getMaxSize();
        boolean boolean40 = parseErrorList33.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList38);
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream44 = parseErrorList43.stream();
        boolean boolean45 = parseErrorList43.canAddError();
        boolean boolean46 = parseErrorList38.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList43);
        org.jsoup.nodes.Document document47 = htmlTreeBuilder0.parse("hi!", "<!---->", parseErrorList43);
        java.util.List<org.jsoup.parser.Token.Character> characterList48 = htmlTreeBuilder0.getPendingTableCharacters();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorStream19);
        org.junit.Assert.assertNotNull(parseErrorItor20);
        org.junit.Assert.assertNotNull(parseErrorItor21);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertNotNull(parseErrorStream34);
        org.junit.Assert.assertNotNull(parseErrorItor35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertNotNull(parseErrorStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(characterList48);
    }

    @Test
    public void test2028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2028");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder3.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList12.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor14 = parseErrorList12.iterator();
        boolean boolean15 = parseErrorList10.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList12);
        xmlTreeBuilder5.initialiseParse("<!---->", "hi!", parseErrorList10);
        xmlTreeBuilder3.errors = parseErrorList10;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList18 = xmlTreeBuilder3.stack;
        org.jsoup.parser.Parser parser19 = parser2.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder3);
        org.jsoup.nodes.Document document22 = parser19.parseInput("hi!", "[]");
        org.jsoup.parser.TreeBuilder treeBuilder23 = parser19.getTreeBuilder();
        org.jsoup.nodes.Document document26 = treeBuilder23.parse("hi!", "artTag");
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList27 = treeBuilder23.stack;
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertNotNull(parseErrorItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(elementList18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(treeBuilder23);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertNotNull(elementList27);
    }

    @Test
    public void test2029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2029");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray9 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList10 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList10, characterArray9);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList10);
        boolean boolean13 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.nodes.Element element16 = htmlTreeBuilder0.getFromStack("-1: []");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag18 = new org.jsoup.parser.Token.EndTag();
        endTag18.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int25 = parseErrorList24.getMaxSize();
        org.jsoup.nodes.Document document26 = htmlTreeBuilder20.parse("0: Doctype", "hi!", parseErrorList24);
        boolean boolean27 = htmlTreeBuilderState17.process((org.jsoup.parser.Token) endTag18, htmlTreeBuilder20);
        org.jsoup.nodes.FormElement formElement28 = htmlTreeBuilder20.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int34 = parseErrorList33.getMaxSize();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder29.parse("0: Doctype", "hi!", parseErrorList33);
        boolean boolean36 = htmlTreeBuilder29.framesetOk();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser39 = parser37.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document42 = parser37.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document45 = parser37.parseInput("<hi!>", "[]");
        htmlTreeBuilder29.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document45);
        boolean boolean47 = htmlTreeBuilder29.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder48 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList53 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList55 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream56 = parseErrorList55.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor57 = parseErrorList55.iterator();
        boolean boolean58 = parseErrorList53.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList55);
        xmlTreeBuilder48.initialiseParse("<!---->", "hi!", parseErrorList53);
        org.jsoup.parser.ParseErrorList parseErrorList63 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document64 = xmlTreeBuilder48.parse("", "[]", parseErrorList63);
        boolean boolean65 = htmlTreeBuilder29.isInActiveFormattingElements((org.jsoup.nodes.Element) document64);
        boolean boolean66 = htmlTreeBuilder20.isInActiveFormattingElements((org.jsoup.nodes.Element) document64);
        java.util.List<org.jsoup.parser.Token.Character> characterList67 = htmlTreeBuilder20.getPendingTableCharacters();
        org.jsoup.nodes.Element element68 = htmlTreeBuilder20.getHeadElement();
        htmlTreeBuilder0.insertInFosterParent((org.jsoup.nodes.Node) element68);
        boolean boolean71 = htmlTreeBuilder0.inSelectScope("tartTag");
        org.jsoup.parser.Parser parser72 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(characterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(element16);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState17);
        org.junit.Assert.assertNotNull(parseErrorList24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(document26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull(formElement28);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parseErrorList55);
        org.junit.Assert.assertNotNull(parseErrorStream56);
        org.junit.Assert.assertNotNull(parseErrorItor57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNotNull(parseErrorList63);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(characterList67);
        org.junit.Assert.assertNotNull(element68);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
    }

    @Test
    public void test2030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2030");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        boolean boolean2 = startTag1.isCharacter();
        startTag1.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes6 = startTag5.getAttributes();
        startTag1.attributes = attributes6;
        org.jsoup.parser.Token.Tag tag9 = startTag1.name(" EndTag");
        boolean boolean10 = tag9.isEOF();
        tag9.appendAttributeName("EOF");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2031");
        org.jsoup.parser.TreeBuilder treeBuilder0 = null;
        org.jsoup.parser.Parser parser1 = new org.jsoup.parser.Parser(treeBuilder0);
        org.jsoup.parser.TreeBuilder treeBuilder2 = null;
        org.jsoup.parser.Parser parser3 = parser1.setTreeBuilder(treeBuilder2);
        org.jsoup.parser.Parser parser5 = parser1.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.TreeBuilder treeBuilder6 = parser5.getTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState7 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Doctype");
        org.jsoup.parser.Token.Tag tag11 = startTag9.name("hi!#");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int17 = parseErrorList16.getMaxSize();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder12.parse("0: Doctype", "hi!", parseErrorList16);
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream23 = parseErrorList22.stream();
        boolean boolean24 = parseErrorList22.canAddError();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder12.parse("EndTag", "hi!#", parseErrorList22);
        java.lang.String[] strArray33 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean34 = htmlTreeBuilder12.inScope("hi!#", strArray33);
        htmlTreeBuilder12.clearStackToTableContext();
        boolean boolean36 = htmlTreeBuilderState7.process((org.jsoup.parser.Token) startTag9, htmlTreeBuilder12);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList41 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int42 = parseErrorList41.getMaxSize();
        org.jsoup.nodes.Document document43 = htmlTreeBuilder37.parse("0: Doctype", "hi!", parseErrorList41);
        boolean boolean44 = htmlTreeBuilder37.framesetOk();
        org.jsoup.nodes.Document document47 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder37.setHeadElement((org.jsoup.nodes.Element) document47);
        htmlTreeBuilder12.doc = document47;
        org.jsoup.parser.Parser parser50 = parser5.setTreeBuilder((org.jsoup.parser.TreeBuilder) htmlTreeBuilder12);
        org.jsoup.nodes.Element element51 = htmlTreeBuilder12.currentElement();
        org.junit.Assert.assertNotNull(parser3);
        org.junit.Assert.assertNotNull(parser5);
        org.junit.Assert.assertNull(treeBuilder6);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState7);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorStream23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(strArray33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(parseErrorList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(parser50);
        org.junit.Assert.assertNotNull(element51);
    }

    @Test
    public void test2032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2032");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.ParseErrorList parseErrorList18 = htmlTreeBuilder0.errors;
        parseErrorList18.ensureCapacity((int) (short) 10);
        java.lang.Object[] objArray21 = parseErrorList18.toArray();
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream22 = parseErrorList18.parallelStream();
        boolean boolean23 = parseErrorList18.canAddError();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(objArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray21), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray21), "[]");
        org.junit.Assert.assertNotNull(parseErrorStream22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test2033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2033");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        java.lang.String str14 = comment13.toString();
        java.lang.StringBuilder stringBuilder15 = comment13.data;
        boolean boolean16 = comment13.isEndTag();
        java.lang.String str17 = comment13.toString();
        tokeniser6.commentPending = comment13;
        org.jsoup.parser.Token.Comment comment19 = new org.jsoup.parser.Token.Comment();
        java.lang.String str20 = comment19.toString();
        comment19.bogus = true;
        java.lang.StringBuilder stringBuilder23 = comment19.data;
        tokeniser6.dataBuffer = stringBuilder23;
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "<!---->" + "'", str20, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
    }

    @Test
    public void test2034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2034");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isData();
        boolean boolean3 = tag1.isFormListed();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder4 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document5 = xmlTreeBuilder4.doc;
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int10 = parseErrorList9.getMaxSize();
        org.jsoup.parser.ParseError[] parseErrorArray11 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList12 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList12, parseErrorArray11);
        org.jsoup.parser.ParseError[] parseErrorArray14 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList15 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15, parseErrorArray14);
        boolean boolean17 = parseErrorList12.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList15);
        org.jsoup.parser.ParseError[] parseErrorArray18 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList19 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19, parseErrorArray18);
        boolean boolean21 = parseErrorList15.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19);
        parseErrorList19.clear();
        boolean boolean23 = parseErrorList9.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList19);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList9.iterator();
        org.jsoup.nodes.Document document25 = xmlTreeBuilder4.parse("<hi!>", "0: []", parseErrorList9);
        int int26 = parseErrorList9.getMaxSize();
        boolean boolean27 = tag1.equals((java.lang.Object) int26);
        java.lang.String str28 = tag1.getName();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(document5);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(parseErrorArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parseErrorArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parseErrorArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "hi!" + "'", str28, "hi!");
    }

    @Test
    public void test2035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2035");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int19 = parseErrorList18.getMaxSize();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder14.parse("0: Doctype", "hi!", parseErrorList18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("Doctype", "<hi!>");
        htmlTreeBuilder14.maybeSetBaseUri((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int33 = parseErrorList32.getMaxSize();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder28.parse("0: Doctype", "hi!", parseErrorList32);
        boolean boolean35 = htmlTreeBuilderState25.process((org.jsoup.parser.Token) endTag26, htmlTreeBuilder28);
        htmlTreeBuilder14.error(htmlTreeBuilderState25);
        htmlTreeBuilder0.transition(htmlTreeBuilderState25);
        org.jsoup.nodes.Document document38 = htmlTreeBuilder0.getDocument();
        org.jsoup.nodes.Document document41 = org.jsoup.parser.Parser.parseBodyFragment("100: ", "<Doctype>");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document41);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(document41);
    }

    @Test
    public void test2036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2036");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype11 = doctype10.asDoctype();
        java.lang.String str12 = doctype10.tokenType();
        tokeniser6.emit((org.jsoup.parser.Token) doctype10);
        java.lang.String str14 = doctype10.getPublicIdentifier();
        boolean boolean15 = doctype10.forceQuirks;
        boolean boolean16 = doctype10.isComment();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2037");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Tag tag12 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Comment comment13 = tokeniser6.commentPending;
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNull(comment13);
    }

    @Test
    public void test2038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2038");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int19 = parseErrorList18.getMaxSize();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder14.parse("0: Doctype", "hi!", parseErrorList18);
        org.jsoup.nodes.Document document23 = org.jsoup.parser.Parser.parseBodyFragment("Doctype", "<hi!>");
        htmlTreeBuilder14.maybeSetBaseUri((org.jsoup.nodes.Element) document23);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag26 = new org.jsoup.parser.Token.EndTag();
        endTag26.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder28 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList32 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int33 = parseErrorList32.getMaxSize();
        org.jsoup.nodes.Document document34 = htmlTreeBuilder28.parse("0: Doctype", "hi!", parseErrorList32);
        boolean boolean35 = htmlTreeBuilderState25.process((org.jsoup.parser.Token) endTag26, htmlTreeBuilder28);
        htmlTreeBuilder14.error(htmlTreeBuilderState25);
        htmlTreeBuilder0.transition(htmlTreeBuilderState25);
        org.jsoup.nodes.Document document38 = htmlTreeBuilder0.getDocument();
        boolean boolean39 = htmlTreeBuilder0.isFosterInserts();
        java.lang.String str40 = htmlTreeBuilder0.baseUri;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState41 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        htmlTreeBuilder0.transition(htmlTreeBuilderState41);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertNotNull(htmlTreeBuilderState41);
    }

    @Test
    public void test2039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2039");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        boolean boolean11 = tokeniser6.currentNodeInHtmlNS();
        tokeniser6.createDoctypePending();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2040");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        startTag11.appendTagName('#');
        tokeniser6.tagPending = startTag11;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser6.transition((org.jsoup.parser.ITokeniserState) tokeniserState16);
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        boolean boolean19 = doctype18.isCharacter();
        tokeniser6.doctypePending = doctype18;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype22 = new org.jsoup.parser.Token.Doctype();
        boolean boolean23 = doctype22.isCharacter();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = null;
        boolean boolean25 = htmlTreeBuilderState21.process((org.jsoup.parser.Token) doctype22, htmlTreeBuilder24);
        java.lang.StringBuilder stringBuilder26 = doctype22.name;
        tokeniser6.dataBuffer = stringBuilder26;
        org.jsoup.parser.Token.EndTag endTag28 = new org.jsoup.parser.Token.EndTag();
        char[] charArray31 = new char[] { '#', '#' };
        endTag28.appendAttributeValue(charArray31);
        endTag28.appendAttributeValue(' ');
        char[] charArray36 = new char[] { '4' };
        endTag28.appendAttributeValue(charArray36);
        tokeniser6.emit(charArray36);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token token39 = tokeniser6.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(stringBuilder26);
        org.junit.Assert.assertEquals(stringBuilder26.toString(), "");
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[#, #]");
        org.junit.Assert.assertNotNull(charArray36);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray36), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray36), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray36), "[4]");
    }

    @Test
    public void test2041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2041");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser1 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        org.jsoup.parser.ParseErrorList parseErrorList2 = htmlTreeBuilder0.errors;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState3 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag4 = new org.jsoup.parser.Token.EndTag();
        endTag4.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int11 = parseErrorList10.getMaxSize();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder6.parse("0: Doctype", "hi!", parseErrorList10);
        boolean boolean13 = htmlTreeBuilderState3.process((org.jsoup.parser.Token) endTag4, htmlTreeBuilder6);
        org.jsoup.nodes.FormElement formElement14 = htmlTreeBuilder6.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder15 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList19 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int20 = parseErrorList19.getMaxSize();
        org.jsoup.nodes.Document document21 = htmlTreeBuilder15.parse("0: Doctype", "hi!", parseErrorList19);
        boolean boolean22 = htmlTreeBuilder15.framesetOk();
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document28 = parser23.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document31 = parser23.parseInput("<hi!>", "[]");
        htmlTreeBuilder15.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document31);
        boolean boolean33 = htmlTreeBuilder15.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList41 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream42 = parseErrorList41.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor43 = parseErrorList41.iterator();
        boolean boolean44 = parseErrorList39.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList41);
        xmlTreeBuilder34.initialiseParse("<!---->", "hi!", parseErrorList39);
        org.jsoup.parser.ParseErrorList parseErrorList49 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document50 = xmlTreeBuilder34.parse("", "[]", parseErrorList49);
        boolean boolean51 = htmlTreeBuilder15.isInActiveFormattingElements((org.jsoup.nodes.Element) document50);
        boolean boolean52 = htmlTreeBuilder6.isInActiveFormattingElements((org.jsoup.nodes.Element) document50);
        java.util.List<org.jsoup.parser.Token.Character> characterList53 = htmlTreeBuilder6.getPendingTableCharacters();
        org.jsoup.nodes.Element element54 = htmlTreeBuilder6.getHeadElement();
        htmlTreeBuilder0.pushActiveFormattingElements(element54);
        boolean boolean56 = htmlTreeBuilder0.isFragmentParsing();
        org.junit.Assert.assertNull(parseErrorList2);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState3);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNull(formElement14);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(document21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parseErrorList41);
        org.junit.Assert.assertNotNull(parseErrorStream42);
        org.junit.Assert.assertNotNull(parseErrorItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(characterList53);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2042");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<Doctype>");
    }

    @Test
    public void test2043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2043");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.CharacterReader characterReader14 = null;
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList16.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList16.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor19 = parseErrorList16.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int22 = parseErrorList21.getMaxSize();
        boolean boolean23 = parseErrorList16.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList21);
        org.jsoup.parser.Tokeniser tokeniser24 = new org.jsoup.parser.Tokeniser(characterReader14, parseErrorList21);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor25 = parseErrorList21.iterator();
        htmlTreeBuilder0.initialiseParse("hi!", "hi!#", parseErrorList21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState27 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parseErrorStream17);
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertNotNull(parseErrorItor19);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseErrorItor25);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState27);
    }

    @Test
    public void test2044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2044");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.Parser parser1 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        boolean boolean2 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.nodes.Element element5 = htmlTreeBuilder0.getHeadElement();
        org.jsoup.parser.Parser parser6 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        boolean boolean7 = parser6.isTrackErrors();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(element5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2045");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("\uffff");
        endTag1.tagName = "ndTag";
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Character character4 = endTag1.asCharacter();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.parser.Token$EndTag cannot be cast to org.jsoup.parser.Token$Character");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test2046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2046");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean2 = characterReader1.matchesLetter();
        java.lang.String str3 = characterReader1.consumeToEnd();
        boolean boolean5 = characterReader1.containsIgnoreCase("<hi!>");
        java.lang.String str7 = characterReader1.consumeTo('E');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "StartTag" + "'", str3, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2047");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype11 = doctype10.asDoctype();
        java.lang.String str12 = doctype10.tokenType();
        tokeniser6.emit((org.jsoup.parser.Token) doctype10);
        org.jsoup.parser.ITokeniserState iTokeniserState14 = tokeniser6.getState();
        org.jsoup.parser.Token.Comment comment15 = new org.jsoup.parser.Token.Comment();
        java.lang.String str16 = comment15.toString();
        java.lang.StringBuilder stringBuilder17 = comment15.data;
        boolean boolean18 = comment15.isEndTag();
        boolean boolean19 = comment15.isComment();
        tokeniser6.commentPending = comment15;
        java.lang.StringBuilder stringBuilder21 = tokeniser6.dataBuffer;
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "<!---->" + "'", str16, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder17);
        org.junit.Assert.assertEquals(stringBuilder17.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNull(stringBuilder21);
    }

    @Test
    public void test2048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2048");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream4 = parseErrorList3.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList3.iterator();
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList3);
        xmlTreeBuilder0.tokeniser = tokeniser7;
        org.jsoup.parser.Tokeniser tokeniser9 = xmlTreeBuilder0.tokeniser;
        org.jsoup.parser.ITokeniserState iTokeniserState10 = tokeniser9.getState();
        org.jsoup.parser.Token.Comment comment11 = new org.jsoup.parser.Token.Comment();
        java.lang.String str12 = comment11.toString();
        boolean boolean13 = comment11.isCharacter();
        boolean boolean14 = comment11.bogus;
        tokeniser9.commentPending = comment11;
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream19 = parseErrorList18.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor20 = parseErrorList18.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor21 = parseErrorList18.iterator();
        org.jsoup.parser.Tokeniser tokeniser22 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList18);
        org.jsoup.parser.Token.Tag tag23 = tokeniser22.tagPending;
        java.lang.StringBuilder stringBuilder24 = null;
        tokeniser22.dataBuffer = stringBuilder24;
        org.jsoup.parser.Token.Tag tag27 = tokeniser22.createTagPending(false);
        org.jsoup.parser.Token.Comment comment28 = new org.jsoup.parser.Token.Comment();
        java.lang.String str29 = comment28.toString();
        java.lang.StringBuilder stringBuilder30 = comment28.data;
        boolean boolean31 = comment28.isEndTag();
        java.lang.String str32 = comment28.toString();
        java.lang.StringBuilder stringBuilder33 = comment28.data;
        tokeniser22.commentPending = comment28;
        tokeniser9.commentPending = comment28;
        org.jsoup.parser.CharacterReader characterReader36 = null;
        org.jsoup.parser.ParseErrorList parseErrorList38 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream39 = parseErrorList38.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor40 = parseErrorList38.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor41 = parseErrorList38.iterator();
        org.jsoup.parser.Tokeniser tokeniser42 = new org.jsoup.parser.Tokeniser(characterReader36, parseErrorList38);
        org.jsoup.parser.Token.Tag tag43 = tokeniser42.tagPending;
        org.jsoup.parser.Token.Tag tag45 = tokeniser42.createTagPending(true);
        java.lang.StringBuilder stringBuilder46 = tokeniser42.dataBuffer;
        org.jsoup.parser.Token.EndTag endTag47 = new org.jsoup.parser.Token.EndTag();
        char[] charArray50 = new char[] { '#', '#' };
        endTag47.appendAttributeValue(charArray50);
        tokeniser42.emit(charArray50);
        org.jsoup.parser.ITokeniserState iTokeniserState53 = tokeniser42.getState();
        org.jsoup.parser.ITokeniserState iTokeniserState54 = tokeniser42.getState();
        tokeniser9.transition(iTokeniserState54);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorStream4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNotNull(tokeniser9);
        org.junit.Assert.assertNotNull(iTokeniserState10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "<!---->" + "'", str12, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorStream19);
        org.junit.Assert.assertNotNull(parseErrorItor20);
        org.junit.Assert.assertNotNull(parseErrorItor21);
        org.junit.Assert.assertNull(tag23);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "<!---->" + "'", str29, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder30);
        org.junit.Assert.assertEquals(stringBuilder30.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "<!---->" + "'", str32, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder33);
        org.junit.Assert.assertEquals(stringBuilder33.toString(), "");
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertNotNull(parseErrorStream39);
        org.junit.Assert.assertNotNull(parseErrorItor40);
        org.junit.Assert.assertNotNull(parseErrorItor41);
        org.junit.Assert.assertNull(tag43);
        org.junit.Assert.assertNotNull(tag45);
        org.junit.Assert.assertNull(stringBuilder46);
        org.junit.Assert.assertNotNull(charArray50);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray50), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray50), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray50), "[#, #]");
        org.junit.Assert.assertNotNull(iTokeniserState53);
        org.junit.Assert.assertNotNull(iTokeniserState54);
    }

    @Test
    public void test2049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2049");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.parser.Token.StartTag startTag13 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType14 = startTag13.type;
        startTag13.appendTagName('#');
        boolean boolean17 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag13);
        org.jsoup.parser.CharacterReader characterReader19 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader19.advance();
        boolean boolean22 = characterReader19.matchConsume("<hi!>");
        htmlTreeBuilder0.reader = characterReader19;
        boolean boolean25 = characterReader19.matchConsume("[100: ]");
        characterReader19.unconsume();
        org.jsoup.parser.TokenQueue tokenQueue28 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean29 = tokenQueue28.isEmpty();
        char[] charArray31 = new char[] { '4' };
        boolean boolean32 = tokenQueue28.matchesAny(charArray31);
        java.lang.String str33 = characterReader19.consumeToAny(charArray31);
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser36 = parser34.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document38 = xmlTreeBuilder37.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder39 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList46 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream47 = parseErrorList46.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor48 = parseErrorList46.iterator();
        boolean boolean49 = parseErrorList44.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList46);
        xmlTreeBuilder39.initialiseParse("<!---->", "hi!", parseErrorList44);
        xmlTreeBuilder37.errors = parseErrorList44;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList52 = xmlTreeBuilder37.stack;
        org.jsoup.parser.Parser parser53 = parser36.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder37);
        org.jsoup.parser.ParseErrorList parseErrorList55 = org.jsoup.parser.ParseErrorList.tracking(0);
        xmlTreeBuilder37.errors = parseErrorList55;
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor57 = parseErrorList55.iterator();
        org.jsoup.parser.Tokeniser tokeniser58 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList55);
        char char59 = characterReader19.consume();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertTrue("'" + tokenType14 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType14.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(charArray31);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray31), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray31), "[4]");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "StartTag" + "'", str33, "StartTag");
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNull(document38);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertNotNull(parseErrorStream47);
        org.junit.Assert.assertNotNull(parseErrorItor48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNull(elementList52);
        org.junit.Assert.assertNotNull(parser53);
        org.junit.Assert.assertNotNull(parseErrorList55);
        org.junit.Assert.assertNotNull(parseErrorItor57);
        org.junit.Assert.assertTrue("'" + char59 + "' != '" + '\uffff' + "'", char59 == '\uffff');
    }

    @Test
    public void test2050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2050");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("S");
        java.lang.String str4 = tokenQueue1.chompBalanced('S', '4');
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2051");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder3.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList12.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor14 = parseErrorList12.iterator();
        boolean boolean15 = parseErrorList10.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList12);
        xmlTreeBuilder5.initialiseParse("<!---->", "hi!", parseErrorList10);
        xmlTreeBuilder3.errors = parseErrorList10;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList18 = xmlTreeBuilder3.stack;
        org.jsoup.parser.Parser parser19 = parser2.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder3);
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        xmlTreeBuilder3.errors = parseErrorList21;
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream27 = parseErrorList26.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList26.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor29 = parseErrorList26.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList31 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int32 = parseErrorList31.getMaxSize();
        boolean boolean33 = parseErrorList26.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList31);
        xmlTreeBuilder3.initialiseParse("<!---->", "", parseErrorList26);
        int int35 = parseErrorList26.size();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState36 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag37 = new org.jsoup.parser.Token.EndTag();
        endTag37.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder39 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int44 = parseErrorList43.getMaxSize();
        org.jsoup.nodes.Document document45 = htmlTreeBuilder39.parse("0: Doctype", "hi!", parseErrorList43);
        boolean boolean46 = htmlTreeBuilderState36.process((org.jsoup.parser.Token) endTag37, htmlTreeBuilder39);
        org.jsoup.nodes.FormElement formElement47 = htmlTreeBuilder39.getFormElement();
        org.jsoup.parser.CharacterReader characterReader49 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean51 = characterReader49.matches('\000');
        java.lang.String str52 = characterReader49.consumeHexSequence();
        char char53 = characterReader49.current();
        htmlTreeBuilder39.reader = characterReader49;
        org.jsoup.nodes.Element element55 = htmlTreeBuilder39.currentElement();
        boolean boolean56 = parseErrorList26.remove((java.lang.Object) element55);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertNotNull(parseErrorItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(elementList18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parseErrorStream27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertNotNull(parseErrorItor29);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState36);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNull(formElement47);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + char53 + "' != '" + 'S' + "'", char53 == 'S');
        org.junit.Assert.assertNotNull(element55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
    }

    @Test
    public void test2052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2052");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype1 = new org.jsoup.parser.Token.Doctype();
        boolean boolean2 = doctype1.isCharacter();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = null;
        boolean boolean4 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) doctype1, htmlTreeBuilder3);
        java.lang.StringBuilder stringBuilder5 = doctype1.name;
        org.jsoup.parser.Token.StartTag startTag7 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType8 = startTag7.type;
        doctype1.type = tokenType8;
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType8 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType8.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2053");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.pop();
        htmlTreeBuilder0.baseUri = "0: Doctype";
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
    }

    @Test
    public void test2054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2054");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.parser.Tag tag3 = tag1.setSelfClosing();
        boolean boolean4 = tag1.isEmpty();
        boolean boolean5 = tag1.formatAsBlock();
        boolean boolean6 = tag1.isInline();
        org.jsoup.parser.Tag tag7 = tag1.setSelfClosing();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(tag7);
    }

    @Test
    public void test2055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2055");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str3 = tokenQueue1.chompTo("Doctype");
        java.lang.String str4 = tokenQueue1.consumeWord();
        tokenQueue1.advance();
        java.lang.String str6 = tokenQueue1.consumeCssIdentifier();
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        boolean boolean9 = tokenQueue1.matchesCS("St");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2056");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        boolean boolean19 = htmlTreeBuilder0.inScope(strArray18);
        htmlTreeBuilder0.framesetOk(false);
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.nodes.Element element23 = htmlTreeBuilder0.currentElement();
        htmlTreeBuilder0.resetInsertionMode();
        java.util.List<org.jsoup.parser.Token.Character> characterList25 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.Character character27 = new org.jsoup.parser.Token.Character("100: ");
        java.lang.String str28 = character27.toString();
        htmlTreeBuilder0.insert(character27);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(characterList25);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "100: " + "'", str28, "100: ");
    }

    @Test
    public void test2057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2057");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        org.jsoup.nodes.Document document9 = org.jsoup.parser.Parser.parseBodyFragment("Doctype", "<hi!>");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document9);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState11 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag12 = new org.jsoup.parser.Token.EndTag();
        endTag12.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder14 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int19 = parseErrorList18.getMaxSize();
        org.jsoup.nodes.Document document20 = htmlTreeBuilder14.parse("0: Doctype", "hi!", parseErrorList18);
        boolean boolean21 = htmlTreeBuilderState11.process((org.jsoup.parser.Token) endTag12, htmlTreeBuilder14);
        htmlTreeBuilder0.error(htmlTreeBuilderState11);
        org.jsoup.parser.CharacterReader characterReader23 = null;
        org.jsoup.parser.ParseErrorList parseErrorList25 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream26 = parseErrorList25.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList25.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList25.iterator();
        org.jsoup.parser.Tokeniser tokeniser29 = new org.jsoup.parser.Tokeniser(characterReader23, parseErrorList25);
        org.jsoup.parser.Token.Tag tag30 = tokeniser29.tagPending;
        tokeniser29.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag34 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType35 = startTag34.type;
        startTag34.appendTagName('#');
        tokeniser29.tagPending = startTag34;
        org.jsoup.parser.TokeniserState tokeniserState39 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser29.transition((org.jsoup.parser.ITokeniserState) tokeniserState39);
        org.jsoup.parser.Token.Doctype doctype41 = new org.jsoup.parser.Token.Doctype();
        boolean boolean42 = doctype41.isCharacter();
        tokeniser29.doctypePending = doctype41;
        boolean boolean44 = doctype41.isEndTag();
        java.lang.StringBuilder stringBuilder45 = doctype41.publicIdentifier;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder46 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int51 = parseErrorList50.getMaxSize();
        org.jsoup.nodes.Document document52 = htmlTreeBuilder46.parse("0: Doctype", "hi!", parseErrorList50);
        htmlTreeBuilder46.newPendingTableCharacters();
        boolean boolean55 = htmlTreeBuilder46.inTableScope("");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState56 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        endTag57.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList63 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int64 = parseErrorList63.getMaxSize();
        org.jsoup.nodes.Document document65 = htmlTreeBuilder59.parse("0: Doctype", "hi!", parseErrorList63);
        boolean boolean66 = htmlTreeBuilderState56.process((org.jsoup.parser.Token) endTag57, htmlTreeBuilder59);
        htmlTreeBuilder59.clearStackToTableContext();
        htmlTreeBuilder59.generateImpliedEndTags("hi!#");
        java.util.List<org.jsoup.parser.Token.Character> characterList70 = htmlTreeBuilder59.getPendingTableCharacters();
        htmlTreeBuilder46.setPendingTableCharacters(characterList70);
        boolean boolean72 = htmlTreeBuilderState11.process((org.jsoup.parser.Token) doctype41, htmlTreeBuilder46);
        java.lang.String str73 = doctype41.getPublicIdentifier();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState11);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(document20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(parseErrorList25);
        org.junit.Assert.assertNotNull(parseErrorStream26);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertNull(tag30);
        org.junit.Assert.assertTrue("'" + tokenType35 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType35.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tokeniserState39);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(stringBuilder45);
        org.junit.Assert.assertEquals(stringBuilder45.toString(), "");
        org.junit.Assert.assertNotNull(parseErrorList50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 0 + "'", int51 == 0);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState56);
        org.junit.Assert.assertNotNull(parseErrorList63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + true + "'", boolean66 == true);
        org.junit.Assert.assertNotNull(characterList70);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
    }

    @Test
    public void test2058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2058");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        boolean boolean25 = htmlTreeBuilder18.framesetOk();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document28);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document32);
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document32);
        org.jsoup.parser.CharacterReader characterReader35 = htmlTreeBuilder0.reader;
        java.lang.String str37 = characterReader35.consumeTo('\ufffd');
        boolean boolean39 = characterReader35.matches("");
        java.lang.String str40 = characterReader35.consumeLetterSequence();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(characterReader35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
    }

    @Test
    public void test2059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2059");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.asStartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag4.name("");
        startTag4.selfClosing = false;
        org.jsoup.nodes.Attributes attributes9 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("0: []", attributes9);
        org.jsoup.parser.Token.TokenType tokenType11 = startTag10.type;
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
    }

    @Test
    public void test2060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2060");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        endTag0.tagName = "hi!";
        endTag0.selfClosing = false;
        endTag0.appendTagName("[]");
        org.jsoup.nodes.Attributes attributes7 = endTag0.attributes;
        endTag0.appendAttributeName('h');
        org.junit.Assert.assertNull(attributes7);
    }

    @Test
    public void test2061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2061");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\uffff');
        java.lang.String str5 = characterReader1.consumeTo("<Doctype>");
        characterReader1.rewindToMark();
        int int8 = characterReader1.nextIndexOf('\000');
        boolean boolean9 = characterReader1.isEmpty();
        int int10 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test2062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2062");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "[]");
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.consumeLetterSequence();
        characterReader1.mark();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
    }

    @Test
    public void test2063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2063");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        htmlTreeBuilder18.resetInsertionMode();
        org.jsoup.nodes.Element element26 = htmlTreeBuilder18.currentElement();
        htmlTreeBuilder0.setHeadElement(element26);
        boolean boolean29 = htmlTreeBuilder0.inScope("</hi![]>");
        org.jsoup.nodes.Element element31 = htmlTreeBuilder0.getActiveFormattingElement("<Doctype>");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder32 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int37 = parseErrorList36.getMaxSize();
        org.jsoup.nodes.Document document38 = htmlTreeBuilder32.parse("0: Doctype", "hi!", parseErrorList36);
        htmlTreeBuilder32.generateImpliedEndTags("hi!#");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder43.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream53 = parseErrorList52.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor54 = parseErrorList52.iterator();
        boolean boolean55 = parseErrorList50.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52);
        xmlTreeBuilder45.initialiseParse("<!---->", "hi!", parseErrorList50);
        xmlTreeBuilder43.errors = parseErrorList50;
        org.jsoup.nodes.Document document58 = htmlTreeBuilder32.parse("EndTag", "a", parseErrorList50);
        boolean boolean59 = htmlTreeBuilder0.isSpecial((org.jsoup.nodes.Element) document58);
        org.jsoup.nodes.Element element60 = htmlTreeBuilder0.currentElement();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(element26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(element31);
        org.junit.Assert.assertNotNull(parseErrorList36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertNotNull(parseErrorStream53);
        org.junit.Assert.assertNotNull(parseErrorItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(element60);
    }

    @Test
    public void test2064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2064");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList14 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean18 = characterReader16.matches("[100: ]");
        htmlTreeBuilder0.reader = characterReader16;
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader22.advance();
        characterReader22.advance();
        java.lang.String str26 = characterReader22.consumeTo('E');
        htmlTreeBuilder0.reader = characterReader22;
        org.jsoup.nodes.Element element28 = htmlTreeBuilder0.getHeadElement();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(characterList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "artTag" + "'", str26, "artTag");
        org.junit.Assert.assertNotNull(element28);
    }

    @Test
    public void test2065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2065");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList14 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("Doctype");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        boolean boolean18 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag16, htmlTreeBuilderState17);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState19 = htmlTreeBuilder0.state();
        org.jsoup.parser.CharacterReader characterReader20 = htmlTreeBuilder0.reader;
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(characterList14);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState19);
        org.junit.Assert.assertNotNull(characterReader20);
    }

    @Test
    public void test2066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2066");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        int int3 = characterReader1.nextIndexOf((java.lang.CharSequence) "[]");
        boolean boolean4 = characterReader1.matchesDigit();
        java.lang.String str5 = characterReader1.toString();
        boolean boolean7 = characterReader1.matchesIgnoreCase("[100: ]");
        java.lang.String str8 = characterReader1.consumeHexSequence();
        java.lang.String str9 = characterReader1.consumeAsString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "S" + "'", str9, "S");
    }

    @Test
    public void test2067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2067");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype11 = doctype10.asDoctype();
        java.lang.String str12 = doctype10.tokenType();
        tokeniser6.emit((org.jsoup.parser.Token) doctype10);
        org.jsoup.parser.Token.Tag tag15 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.newAttribute();
        tokeniser6.tagPending = endTag16;
        org.jsoup.parser.TokeniserState tokeniserState19 = org.jsoup.parser.TokeniserState.ScriptDataEscapedEndTagName;
        tokeniser6.eofError((org.jsoup.parser.ITokeniserState) tokeniserState19);
        tokeniser6.createTempBuffer();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState19);
    }

    @Test
    public void test2068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2068");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.String str6 = tokenQueue1.consumeTo("StartTag");
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) 'S');
        java.lang.String str11 = tokenQueue1.consumeToIgnoreCase("hi");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " EndTag" + "'", str6, " EndTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "S" + "'", str11, "S");
    }

    @Test
    public void test2069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2069");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype11 = doctype10.asDoctype();
        java.lang.String str12 = doctype10.tokenType();
        tokeniser6.emit((org.jsoup.parser.Token) doctype10);
        org.jsoup.parser.Token.Tag tag15 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.EndTag endTag16 = new org.jsoup.parser.Token.EndTag();
        endTag16.newAttribute();
        tokeniser6.tagPending = endTag16;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream22 = parseErrorList21.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList21.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList21.iterator();
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList21);
        org.jsoup.parser.Token.Tag tag26 = tokeniser25.tagPending;
        tokeniser25.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag30 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType31 = startTag30.type;
        startTag30.appendTagName('#');
        tokeniser25.tagPending = startTag30;
        org.jsoup.parser.TokeniserState tokeniserState35 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser25.transition((org.jsoup.parser.ITokeniserState) tokeniserState35);
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        boolean boolean38 = doctype37.isCharacter();
        tokeniser25.doctypePending = doctype37;
        org.jsoup.parser.Token.Doctype doctype40 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype41 = doctype40.asDoctype();
        java.lang.StringBuilder stringBuilder42 = doctype41.name;
        tokeniser25.dataBuffer = stringBuilder42;
        tokeniser25.emitDoctypePending();
        org.jsoup.parser.TokeniserState tokeniserState45 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        tokeniser25.eofError((org.jsoup.parser.ITokeniserState) tokeniserState45);
        tokeniser6.transition((org.jsoup.parser.ITokeniserState) tokeniserState45);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream51 = parseErrorList50.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor52 = parseErrorList50.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor53 = parseErrorList50.iterator();
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader48, parseErrorList50);
        org.jsoup.parser.Token.Tag tag55 = tokeniser54.tagPending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser54.createTagPending(true);
        java.lang.StringBuilder stringBuilder58 = tokeniser54.dataBuffer;
        org.jsoup.parser.Token.EndTag endTag59 = new org.jsoup.parser.Token.EndTag();
        char[] charArray62 = new char[] { '#', '#' };
        endTag59.appendAttributeValue(charArray62);
        tokeniser54.emit(charArray62);
        org.jsoup.parser.Token.StartTag startTag66 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType67 = startTag66.type;
        java.lang.String str68 = startTag66.toString();
        tokeniser54.tagPending = startTag66;
        org.jsoup.parser.CharacterReader characterReader71 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean73 = characterReader71.matches('\000');
        characterReader71.mark();
        boolean boolean76 = characterReader71.containsIgnoreCase("a");
        java.lang.String str77 = characterReader71.toString();
        java.lang.String str78 = characterReader71.consumeToEnd();
        boolean boolean79 = characterReader71.matchesLetter();
        tokeniserState45.read(tokeniser54, characterReader71);
        int int82 = characterReader71.nextIndexOf('S');
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorStream22);
        org.junit.Assert.assertNotNull(parseErrorItor23);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertTrue("'" + tokenType31 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType31.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tokeniserState35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(doctype41);
        org.junit.Assert.assertNotNull(stringBuilder42);
        org.junit.Assert.assertEquals(stringBuilder42.toString(), "");
        org.junit.Assert.assertNotNull(tokeniserState45);
        org.junit.Assert.assertNotNull(parseErrorList50);
        org.junit.Assert.assertNotNull(parseErrorStream51);
        org.junit.Assert.assertNotNull(parseErrorItor52);
        org.junit.Assert.assertNotNull(parseErrorItor53);
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNull(stringBuilder58);
        org.junit.Assert.assertNotNull(charArray62);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray62), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray62), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray62), "[#, #]");
        org.junit.Assert.assertTrue("'" + tokenType67 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType67.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "<hi!>" + "'", str68, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "StartTag" + "'", str77, "StartTag");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "StartTag" + "'", str78, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + (-1) + "'", int82 == (-1));
    }

    @Test
    public void test2070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2070");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        java.lang.String str5 = tokenQueue1.consumeTagName();
        boolean boolean6 = tokenQueue1.matchesWord();
        java.lang.String str8 = tokenQueue1.consumeTo("[]");
        boolean boolean10 = tokenQueue1.matches("hi!#");
        boolean boolean11 = tokenQueue1.matchesWord();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.String str14 = tokenQueue1.consumeTagName();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2071");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        startTag11.appendTagName('#');
        tokeniser6.tagPending = startTag11;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType18 = startTag17.type;
        java.lang.String str19 = startTag17.toString();
        tokeniser6.emit((org.jsoup.parser.Token) startTag17);
        java.lang.String str21 = startTag17.name();
        startTag17.newAttribute();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
    }

    @Test
    public void test2072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2072");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\000');
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        java.lang.String str7 = characterReader1.consumeTo('#');
        boolean boolean8 = characterReader1.matchesLetter();
        int int9 = characterReader1.pos();
        char char10 = characterReader1.current();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
        org.junit.Assert.assertTrue("'" + char10 + "' != '" + '\uffff' + "'", char10 == '\uffff');
    }

    @Test
    public void test2073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2073");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.parser.Tag tag3 = tag1.setSelfClosing();
        boolean boolean4 = tag3.preserveWhitespace();
        boolean boolean5 = tag3.isFormSubmittable();
        boolean boolean6 = tag3.isFormListed();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2074");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList14 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("Doctype");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState17 = org.jsoup.parser.HtmlTreeBuilderState.AfterBody;
        boolean boolean18 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag16, htmlTreeBuilderState17);
        org.jsoup.parser.MiniSoupTokeniserState miniSoupTokeniserState19 = org.jsoup.parser.MiniSoupTokeniserState.TagOpen;
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream23 = parseErrorList22.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList22.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor25 = parseErrorList22.iterator();
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList22);
        org.jsoup.parser.Token.Tag tag27 = tokeniser26.tagPending;
        java.lang.StringBuilder stringBuilder28 = null;
        tokeniser26.dataBuffer = stringBuilder28;
        org.jsoup.parser.Token.EndTag endTag30 = new org.jsoup.parser.Token.EndTag();
        char[] charArray33 = new char[] { '#', '#' };
        endTag30.appendAttributeValue(charArray33);
        tokeniser26.emit(charArray33);
        org.jsoup.parser.Token.Comment comment36 = tokeniser26.commentPending;
        org.jsoup.parser.CharacterReader characterReader38 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean39 = characterReader38.matchesLetter();
        miniSoupTokeniserState19.read(tokeniser26, characterReader38);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream44 = parseErrorList43.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor45 = parseErrorList43.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor46 = parseErrorList43.iterator();
        org.jsoup.parser.Tokeniser tokeniser47 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList43);
        org.jsoup.parser.Token.Tag tag48 = tokeniser47.tagPending;
        org.jsoup.parser.Token.Tag tag50 = tokeniser47.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype51 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype52 = doctype51.asDoctype();
        java.lang.String str53 = doctype51.tokenType();
        tokeniser47.emit((org.jsoup.parser.Token) doctype51);
        org.jsoup.parser.ITokeniserState iTokeniserState55 = tokeniser47.getState();
        org.jsoup.parser.Token.Comment comment56 = new org.jsoup.parser.Token.Comment();
        java.lang.String str57 = comment56.toString();
        java.lang.StringBuilder stringBuilder58 = comment56.data;
        boolean boolean59 = comment56.isEndTag();
        boolean boolean60 = comment56.isComment();
        tokeniser47.commentPending = comment56;
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean65 = characterReader63.matches('\000');
        characterReader63.mark();
        boolean boolean67 = characterReader63.isEmpty();
        java.lang.String str68 = characterReader63.consumeToEnd();
        miniSoupTokeniserState19.read(tokeniser47, characterReader63);
        org.jsoup.parser.CharacterReader characterReader70 = null;
        org.jsoup.parser.ParseErrorList parseErrorList72 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream73 = parseErrorList72.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor74 = parseErrorList72.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor75 = parseErrorList72.iterator();
        org.jsoup.parser.Tokeniser tokeniser76 = new org.jsoup.parser.Tokeniser(characterReader70, parseErrorList72);
        org.jsoup.parser.Token.Tag tag77 = tokeniser76.tagPending;
        tokeniser76.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag81 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType82 = startTag81.type;
        startTag81.appendTagName('#');
        tokeniser76.tagPending = startTag81;
        tokeniser76.acknowledgeSelfClosingFlag();
        org.jsoup.parser.CharacterReader characterReader88 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean90 = characterReader88.matches('\uffff');
        miniSoupTokeniserState19.read(tokeniser76, characterReader88);
        characterReader88.advance();
        htmlTreeBuilder0.reader = characterReader88;
        boolean boolean95 = characterReader88.matches('\uffff');
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(characterList14);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(miniSoupTokeniserState19);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorStream23);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNotNull(parseErrorItor25);
        org.junit.Assert.assertNull(tag27);
        org.junit.Assert.assertNotNull(charArray33);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray33), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray33), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray33), "[#, #]");
        org.junit.Assert.assertNull(comment36);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertNotNull(parseErrorStream44);
        org.junit.Assert.assertNotNull(parseErrorItor45);
        org.junit.Assert.assertNotNull(parseErrorItor46);
        org.junit.Assert.assertNull(tag48);
        org.junit.Assert.assertNotNull(tag50);
        org.junit.Assert.assertNotNull(doctype52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "Doctype" + "'", str53, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState55);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder58);
        org.junit.Assert.assertEquals(stringBuilder58.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + true + "'", boolean60 == true);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "StartTag" + "'", str68, "StartTag");
        org.junit.Assert.assertNotNull(parseErrorList72);
        org.junit.Assert.assertNotNull(parseErrorStream73);
        org.junit.Assert.assertNotNull(parseErrorItor74);
        org.junit.Assert.assertNotNull(parseErrorItor75);
        org.junit.Assert.assertNull(tag77);
        org.junit.Assert.assertTrue("'" + tokenType82 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType82.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
    }

    @Test
    public void test2075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2075");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        boolean boolean19 = htmlTreeBuilder0.inScope(strArray18);
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean22 = htmlTreeBuilder0.inScope("StartTag");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendAttributeValue("hi!");
        org.jsoup.parser.Token.Tag tag27 = startTag23.name("hi!#");
        boolean boolean28 = startTag23.isStartTag();
        startTag23.appendTagName('a');
        org.jsoup.nodes.Element element31 = htmlTreeBuilder0.insertEmpty(startTag23);
        java.lang.String str32 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder0.parse("\uffff", "<!---->");
        org.jsoup.nodes.Document document39 = org.jsoup.parser.Parser.parse("hi!", "<!---->");
        java.util.List<org.jsoup.nodes.Node> nodeList41 = org.jsoup.parser.Parser.parseFragment("<Doctype>", (org.jsoup.nodes.Element) document39, "0: []");
        htmlTreeBuilder0.insert((org.jsoup.nodes.Element) document39);
        htmlTreeBuilder0.framesetOk(true);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(nodeList41);
    }

    @Test
    public void test2076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2076");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        char[] charArray3 = new char[] { '#', '#' };
        endTag0.appendAttributeValue(charArray3);
        endTag0.finaliseTag();
        endTag0.appendTagName('\uffff');
        java.lang.String str8 = endTag0.toString();
        org.junit.Assert.assertNotNull(charArray3);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray3), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray3), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray3), "[#, #]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\uffff>" + "'", str8, "\uffff>");
    }

    @Test
    public void test2077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2077");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream11 = parseErrorList10.stream();
        boolean boolean12 = parseErrorList10.canAddError();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.parse("EndTag", "hi!#", parseErrorList10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState14);
        org.jsoup.nodes.Document document16 = htmlTreeBuilder0.doc;
        boolean boolean18 = htmlTreeBuilder0.inTableScope("<!---->");
        org.jsoup.nodes.Element element20 = htmlTreeBuilder0.getActiveFormattingElement("");
        org.jsoup.parser.Tokeniser tokeniser21 = htmlTreeBuilder0.tokeniser;
        tokeniser21.createDoctypePending();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parseErrorStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(element20);
        org.junit.Assert.assertNotNull(tokeniser21);
    }

    @Test
    public void test2078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2078");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        boolean boolean6 = parseErrorList1.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator7 = parseErrorList1.spliterator();
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList9.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor11 = parseErrorList9.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor12 = parseErrorList9.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList14 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int15 = parseErrorList14.getMaxSize();
        boolean boolean16 = parseErrorList9.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList14);
        org.jsoup.parser.TokeniserState tokeniserState17 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        int int18 = parseErrorList9.lastIndexOf((java.lang.Object) tokeniserState17);
        org.jsoup.parser.ParseErrorList parseErrorList20 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream21 = parseErrorList20.stream();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor22 = parseErrorList20.listIterator();
        parseErrorList20.clear();
        int int24 = parseErrorList9.indexOf((java.lang.Object) parseErrorList20);
        parseErrorList20.trimToSize();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder26 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader27 = null;
        org.jsoup.parser.ParseErrorList parseErrorList29 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream30 = parseErrorList29.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor31 = parseErrorList29.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor32 = parseErrorList29.iterator();
        org.jsoup.parser.Tokeniser tokeniser33 = new org.jsoup.parser.Tokeniser(characterReader27, parseErrorList29);
        org.jsoup.parser.Token.Tag tag34 = tokeniser33.tagPending;
        org.jsoup.parser.Token.Tag tag36 = tokeniser33.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype37 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype38 = doctype37.asDoctype();
        java.lang.String str39 = doctype37.tokenType();
        tokeniser33.emit((org.jsoup.parser.Token) doctype37);
        org.jsoup.parser.Token.Tag tag42 = tokeniser33.createTagPending(true);
        xmlTreeBuilder26.currentToken = tag42;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int49 = parseErrorList48.getMaxSize();
        org.jsoup.nodes.Document document50 = htmlTreeBuilder44.parse("0: Doctype", "hi!", parseErrorList48);
        boolean boolean51 = htmlTreeBuilder44.framesetOk();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder44.setHeadElement((org.jsoup.nodes.Element) document54);
        xmlTreeBuilder26.doc = document54;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder59 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document60 = xmlTreeBuilder59.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList66 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList68 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream69 = parseErrorList68.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor70 = parseErrorList68.iterator();
        boolean boolean71 = parseErrorList66.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList68);
        xmlTreeBuilder61.initialiseParse("<!---->", "hi!", parseErrorList66);
        xmlTreeBuilder59.errors = parseErrorList66;
        org.jsoup.parser.ParseErrorList parseErrorList77 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream78 = parseErrorList77.stream();
        xmlTreeBuilder59.initialiseParse("a", "[]", parseErrorList77);
        org.jsoup.parser.CharacterReader characterReader80 = null;
        org.jsoup.parser.ParseErrorList parseErrorList82 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream83 = parseErrorList82.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor84 = parseErrorList82.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor85 = parseErrorList82.iterator();
        org.jsoup.parser.Tokeniser tokeniser86 = new org.jsoup.parser.Tokeniser(characterReader80, parseErrorList82);
        org.jsoup.parser.Token.Tag tag87 = tokeniser86.tagPending;
        tokeniser86.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype90 = tokeniser86.doctypePending;
        tokeniser86.createCommentPending();
        org.jsoup.parser.Token.Comment comment92 = tokeniser86.commentPending;
        boolean boolean93 = parseErrorList77.remove((java.lang.Object) tokeniser86);
        org.jsoup.nodes.Document document94 = xmlTreeBuilder26.parse("<!---->", "[]", parseErrorList77);
        boolean boolean95 = parseErrorList20.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList77);
        boolean boolean96 = parseErrorList1.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList77);
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseErrorSpliterator7);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(parseErrorItor11);
        org.junit.Assert.assertNotNull(parseErrorItor12);
        org.junit.Assert.assertNotNull(parseErrorList14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(tokeniserState17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(parseErrorList20);
        org.junit.Assert.assertNotNull(parseErrorStream21);
        org.junit.Assert.assertNotNull(parseErrorItor22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(parseErrorList29);
        org.junit.Assert.assertNotNull(parseErrorStream30);
        org.junit.Assert.assertNotNull(parseErrorItor31);
        org.junit.Assert.assertNotNull(parseErrorItor32);
        org.junit.Assert.assertNull(tag34);
        org.junit.Assert.assertNotNull(tag36);
        org.junit.Assert.assertNotNull(doctype38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "Doctype" + "'", str39, "Doctype");
        org.junit.Assert.assertNotNull(tag42);
        org.junit.Assert.assertNotNull(parseErrorList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNull(document60);
        org.junit.Assert.assertNotNull(parseErrorList68);
        org.junit.Assert.assertNotNull(parseErrorStream69);
        org.junit.Assert.assertNotNull(parseErrorItor70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(parseErrorList77);
        org.junit.Assert.assertNotNull(parseErrorStream78);
        org.junit.Assert.assertNotNull(parseErrorList82);
        org.junit.Assert.assertNotNull(parseErrorStream83);
        org.junit.Assert.assertNotNull(parseErrorItor84);
        org.junit.Assert.assertNotNull(parseErrorItor85);
        org.junit.Assert.assertNull(tag87);
        org.junit.Assert.assertNull(doctype90);
        org.junit.Assert.assertNotNull(comment92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertNotNull(document94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + false + "'", boolean95 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
    }

    @Test
    public void test2079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2079");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream27 = parseErrorList26.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList26.iterator();
        boolean boolean29 = parseErrorList24.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        xmlTreeBuilder19.initialiseParse("<!---->", "hi!", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder19.parse("", "[]", parseErrorList34);
        boolean boolean36 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document35);
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean39 = tokenQueue38.isEmpty();
        boolean boolean40 = tokenQueue38.consumeWhitespace();
        java.lang.String str41 = tokenQueue38.consumeWord();
        boolean boolean42 = tokenQueue38.matchesWhitespace();
        java.lang.String[] strArray47 = new java.lang.String[] { "0: []", "StartTag", "EndTag", "" };
        java.lang.String str48 = tokenQueue38.consumeToAny(strArray47);
        boolean boolean49 = htmlTreeBuilder0.inScope(strArray47);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("", "<hi!>");
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document52);
        htmlTreeBuilder0.setFosterInserts(false);
        boolean boolean56 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.nodes.Element element57 = htmlTreeBuilder0.pop();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parseErrorStream27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EndTag" + "'", str41, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertNotNull(element57);
    }

    @Test
    public void test2080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2080");
        org.jsoup.parser.TokeniserState tokeniserState0 = org.jsoup.parser.TokeniserState.Rawtext;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder1 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document2 = xmlTreeBuilder1.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream11 = parseErrorList10.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor12 = parseErrorList10.iterator();
        boolean boolean13 = parseErrorList8.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10);
        xmlTreeBuilder3.initialiseParse("<!---->", "hi!", parseErrorList8);
        xmlTreeBuilder1.errors = parseErrorList8;
        org.jsoup.parser.ParseErrorList parseErrorList19 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream20 = parseErrorList19.stream();
        xmlTreeBuilder1.initialiseParse("a", "[]", parseErrorList19);
        org.jsoup.parser.CharacterReader characterReader22 = null;
        org.jsoup.parser.ParseErrorList parseErrorList24 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream25 = parseErrorList24.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor26 = parseErrorList24.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList24.iterator();
        org.jsoup.parser.Tokeniser tokeniser28 = new org.jsoup.parser.Tokeniser(characterReader22, parseErrorList24);
        org.jsoup.parser.Token.Tag tag29 = tokeniser28.tagPending;
        tokeniser28.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype32 = tokeniser28.doctypePending;
        tokeniser28.createCommentPending();
        org.jsoup.parser.Token.Comment comment34 = tokeniser28.commentPending;
        boolean boolean35 = parseErrorList19.remove((java.lang.Object) tokeniser28);
        org.jsoup.parser.CharacterReader characterReader37 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean39 = characterReader37.matches('\uffff');
        boolean boolean41 = characterReader37.containsIgnoreCase("0: []");
        tokeniserState0.read(tokeniser28, characterReader37);
        java.lang.String str43 = characterReader37.toString();
        org.junit.Assert.assertNotNull(tokeniserState0);
        org.junit.Assert.assertNull(document2);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parseErrorStream11);
        org.junit.Assert.assertNotNull(parseErrorItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parseErrorStream20);
        org.junit.Assert.assertNotNull(parseErrorList24);
        org.junit.Assert.assertNotNull(parseErrorStream25);
        org.junit.Assert.assertNotNull(parseErrorItor26);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNull(tag29);
        org.junit.Assert.assertNull(doctype32);
        org.junit.Assert.assertNotNull(comment34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test2081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2081");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder3 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document4 = xmlTreeBuilder3.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList12.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor14 = parseErrorList12.iterator();
        boolean boolean15 = parseErrorList10.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList12);
        xmlTreeBuilder5.initialiseParse("<!---->", "hi!", parseErrorList10);
        xmlTreeBuilder3.errors = parseErrorList10;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList18 = xmlTreeBuilder3.stack;
        org.jsoup.parser.Parser parser19 = parser2.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder3);
        org.jsoup.parser.ParseError[] parseErrorArray22 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList23 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean24 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23, parseErrorArray22);
        org.jsoup.parser.ParseError[] parseErrorArray25 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList26 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26, parseErrorArray25);
        boolean boolean28 = parseErrorList23.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        org.jsoup.parser.ParseError[] parseErrorArray29 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList30 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList30, parseErrorArray29);
        boolean boolean32 = parseErrorList26.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList30);
        parseErrorList30.clear();
        boolean boolean34 = parseErrorList30.isEmpty();
        org.jsoup.parser.Token.Doctype doctype35 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype36 = doctype35.asDoctype();
        boolean boolean37 = doctype35.isEOF();
        boolean boolean38 = doctype35.isForceQuirks();
        boolean boolean39 = doctype35.isEndTag();
        boolean boolean40 = parseErrorList30.remove((java.lang.Object) boolean39);
        org.jsoup.parser.CharacterReader characterReader41 = null;
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream44 = parseErrorList43.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor45 = parseErrorList43.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor46 = parseErrorList43.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList48 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int49 = parseErrorList48.getMaxSize();
        boolean boolean50 = parseErrorList43.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList48);
        org.jsoup.parser.Tokeniser tokeniser51 = new org.jsoup.parser.Tokeniser(characterReader41, parseErrorList48);
        org.jsoup.parser.ParseErrorList parseErrorList53 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream54 = parseErrorList53.stream();
        boolean boolean55 = parseErrorList53.canAddError();
        boolean boolean56 = parseErrorList48.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList53);
        boolean boolean57 = parseErrorList30.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList48);
        java.util.List<org.jsoup.nodes.Node> nodeList58 = xmlTreeBuilder3.parseFragment("0: []", " EndTag", parseErrorList48);
        org.jsoup.parser.Token.StartTag startTag60 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType61 = startTag60.type;
        java.lang.String str62 = startTag60.toString();
        boolean boolean63 = startTag60.isEOF();
        org.jsoup.nodes.Element element64 = xmlTreeBuilder3.insert(startTag60);
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNull(document4);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertNotNull(parseErrorItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(elementList18);
        org.junit.Assert.assertNotNull(parser19);
        org.junit.Assert.assertNotNull(parseErrorArray22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseErrorArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseErrorArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(doctype36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertNotNull(parseErrorStream44);
        org.junit.Assert.assertNotNull(parseErrorItor45);
        org.junit.Assert.assertNotNull(parseErrorItor46);
        org.junit.Assert.assertNotNull(parseErrorList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(parseErrorStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertNotNull(nodeList58);
        org.junit.Assert.assertTrue("'" + tokenType61 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType61.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "<hi!>" + "'", str62, "<hi!>");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(element64);
    }

    @Test
    public void test2082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2082");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.parser.Tag tag3 = tag1.setSelfClosing();
        boolean boolean4 = tag1.isSelfClosing();
        java.lang.String str5 = tag1.toString();
        org.jsoup.parser.Tag tag6 = tag1.setSelfClosing();
        boolean boolean7 = tag1.formatAsBlock();
        boolean boolean8 = tag1.isBlock();
        boolean boolean9 = tag1.isBlock();
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        char[] charArray13 = new char[] { '#', '#' };
        endTag10.appendAttributeValue(charArray13);
        endTag10.finaliseTag();
        boolean boolean16 = endTag10.isSelfClosing();
        org.jsoup.parser.Token.TokenType tokenType17 = endTag10.type;
        boolean boolean18 = tag1.equals((java.lang.Object) tokenType17);
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + tokenType17 + "' != '" + org.jsoup.parser.Token.TokenType.EndTag + "'", tokenType17.equals(org.jsoup.parser.Token.TokenType.EndTag));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2083");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        org.jsoup.parser.ParseError[] parseErrorArray7 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList8 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList8, parseErrorArray7);
        org.jsoup.parser.ParseError[] parseErrorArray10 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList11 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11, parseErrorArray10);
        boolean boolean13 = parseErrorList8.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        java.lang.Object[] objArray14 = parseErrorList8.toArray();
        parseErrorList8.clear();
        org.jsoup.parser.ParseError[] parseErrorArray16 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList17 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17, parseErrorArray16);
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        boolean boolean22 = parseErrorList17.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20);
        java.lang.Object[] objArray23 = parseErrorList17.toArray();
        parseErrorList17.clear();
        org.jsoup.parser.ParseError[] parseErrorArray25 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList26 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26, parseErrorArray25);
        boolean boolean28 = parseErrorList17.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        boolean boolean29 = parseErrorList8.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        java.lang.Object[] objArray30 = parseErrorList26.toArray();
        boolean boolean31 = parseErrorList4.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        java.lang.String str32 = parseErrorList4.toString();
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator33 = parseErrorList4.spliterator();
        java.lang.String str34 = parseErrorList4.toString();
        org.jsoup.parser.ParseError[] parseErrorArray35 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList36 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList36, parseErrorArray35);
        org.jsoup.parser.ParseError[] parseErrorArray38 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList39 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39, parseErrorArray38);
        boolean boolean41 = parseErrorList36.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        org.jsoup.parser.ParseError[] parseErrorArray42 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList43 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList43, parseErrorArray42);
        boolean boolean45 = parseErrorList39.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList43);
        parseErrorList43.clear();
        boolean boolean47 = parseErrorList43.isEmpty();
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype49 = doctype48.asDoctype();
        boolean boolean50 = doctype48.isEOF();
        boolean boolean51 = doctype48.isForceQuirks();
        boolean boolean52 = doctype48.isEndTag();
        boolean boolean53 = parseErrorList43.remove((java.lang.Object) boolean52);
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream57 = parseErrorList56.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor58 = parseErrorList56.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor59 = parseErrorList56.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList61 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int62 = parseErrorList61.getMaxSize();
        boolean boolean63 = parseErrorList56.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList61);
        org.jsoup.parser.Tokeniser tokeniser64 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList61);
        org.jsoup.parser.ParseErrorList parseErrorList66 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream67 = parseErrorList66.stream();
        boolean boolean68 = parseErrorList66.canAddError();
        boolean boolean69 = parseErrorList61.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList66);
        boolean boolean70 = parseErrorList43.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList61);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor71 = parseErrorList61.listIterator();
        boolean boolean72 = parseErrorList4.remove((java.lang.Object) parseErrorList61);
        parseErrorList4.clear();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(objArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray14), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray14), "[]");
        org.junit.Assert.assertNotNull(parseErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(parseErrorArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "[]" + "'", str32, "[]");
        org.junit.Assert.assertNotNull(parseErrorSpliterator33);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "[]" + "'", str34, "[]");
        org.junit.Assert.assertNotNull(parseErrorArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parseErrorArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(parseErrorArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertNotNull(doctype49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertNotNull(parseErrorStream57);
        org.junit.Assert.assertNotNull(parseErrorItor58);
        org.junit.Assert.assertNotNull(parseErrorItor59);
        org.junit.Assert.assertNotNull(parseErrorList61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(parseErrorList66);
        org.junit.Assert.assertNotNull(parseErrorStream67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(parseErrorItor71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
    }

    @Test
    public void test2084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2084");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.ParseErrorList parseErrorList18 = htmlTreeBuilder0.errors;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError20 = parseErrorList18.remove((int) '\uffff');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 65535, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(parseErrorList18);
    }

    @Test
    public void test2085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2085");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int8 = parseErrorList7.getMaxSize();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder3.parse("0: Doctype", "hi!", parseErrorList7);
        boolean boolean10 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag1, htmlTreeBuilder3);
        org.jsoup.nodes.FormElement formElement11 = htmlTreeBuilder3.getFormElement();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder12 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int17 = parseErrorList16.getMaxSize();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder12.parse("0: Doctype", "hi!", parseErrorList16);
        boolean boolean19 = htmlTreeBuilder12.framesetOk();
        org.jsoup.parser.Parser parser20 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser22 = parser20.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document25 = parser20.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document28 = parser20.parseInput("<hi!>", "[]");
        htmlTreeBuilder12.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document28);
        boolean boolean30 = htmlTreeBuilder12.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder31 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList36 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList38 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream39 = parseErrorList38.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor40 = parseErrorList38.iterator();
        boolean boolean41 = parseErrorList36.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList38);
        xmlTreeBuilder31.initialiseParse("<!---->", "hi!", parseErrorList36);
        org.jsoup.parser.ParseErrorList parseErrorList46 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document47 = xmlTreeBuilder31.parse("", "[]", parseErrorList46);
        boolean boolean48 = htmlTreeBuilder12.isInActiveFormattingElements((org.jsoup.nodes.Element) document47);
        boolean boolean49 = htmlTreeBuilder3.isInActiveFormattingElements((org.jsoup.nodes.Element) document47);
        htmlTreeBuilder3.clearStackToTableRowContext();
        htmlTreeBuilder3.newPendingTableCharacters();
        org.jsoup.parser.Tokeniser tokeniser52 = htmlTreeBuilder3.tokeniser;
        org.jsoup.parser.ITokeniserState iTokeniserState53 = tokeniser52.getState();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNull(formElement11);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parser20);
        org.junit.Assert.assertNotNull(parser22);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertNotNull(parseErrorStream39);
        org.junit.Assert.assertNotNull(parseErrorItor40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(tokeniser52);
        org.junit.Assert.assertNotNull(iTokeniserState53);
    }

    @Test
    public void test2086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2086");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser6.dataBuffer = stringBuilder8;
        org.jsoup.parser.Token.Tag tag11 = tokeniser6.createTagPending(false);
        // The following exception was thrown during execution in test generation
        try {
            char[] charArray14 = tokeniser6.consumeCharacterReference((java.lang.Character) 'h', true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag11);
    }

    @Test
    public void test2087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2087");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int22 = parseErrorList21.getMaxSize();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder17.parse("0: Doctype", "hi!", parseErrorList21);
        org.jsoup.parser.ParseErrorList parseErrorList27 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream28 = parseErrorList27.stream();
        boolean boolean29 = parseErrorList27.canAddError();
        org.jsoup.nodes.Document document30 = htmlTreeBuilder17.parse("EndTag", "hi!#", parseErrorList27);
        java.lang.String[] strArray38 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean39 = htmlTreeBuilder17.inScope("hi!#", strArray38);
        boolean boolean40 = htmlTreeBuilder0.inScope("hi!#", strArray38);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int46 = parseErrorList45.getMaxSize();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder41.parse("0: Doctype", "hi!", parseErrorList45);
        boolean boolean48 = htmlTreeBuilder41.framesetOk();
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser51 = parser49.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document54 = parser49.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document57 = parser49.parseInput("<hi!>", "[]");
        htmlTreeBuilder41.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document57);
        boolean boolean59 = htmlTreeBuilder41.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder60 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList65 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList67 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream68 = parseErrorList67.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor69 = parseErrorList67.iterator();
        boolean boolean70 = parseErrorList65.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList67);
        xmlTreeBuilder60.initialiseParse("<!---->", "hi!", parseErrorList65);
        org.jsoup.parser.ParseErrorList parseErrorList75 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document76 = xmlTreeBuilder60.parse("", "[]", parseErrorList75);
        boolean boolean77 = htmlTreeBuilder41.isInActiveFormattingElements((org.jsoup.nodes.Element) document76);
        org.jsoup.parser.TokenQueue tokenQueue79 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean80 = tokenQueue79.isEmpty();
        boolean boolean81 = tokenQueue79.consumeWhitespace();
        java.lang.String str82 = tokenQueue79.consumeWord();
        boolean boolean83 = tokenQueue79.matchesWhitespace();
        java.lang.String[] strArray88 = new java.lang.String[] { "0: []", "StartTag", "EndTag", "" };
        java.lang.String str89 = tokenQueue79.consumeToAny(strArray88);
        boolean boolean90 = htmlTreeBuilder41.inScope(strArray88);
        org.jsoup.nodes.Document document93 = org.jsoup.parser.Parser.parse("", "<hi!>");
        htmlTreeBuilder41.pushActiveFormattingElements((org.jsoup.nodes.Element) document93);
        htmlTreeBuilder0.doc = document93;
        java.util.List<org.jsoup.parser.Token.Character> characterList96 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.Token token97 = htmlTreeBuilder0.currentToken;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState98 = htmlTreeBuilder0.state();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertNotNull(parseErrorList27);
        org.junit.Assert.assertNotNull(parseErrorStream28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseErrorList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(parseErrorList67);
        org.junit.Assert.assertNotNull(parseErrorStream68);
        org.junit.Assert.assertNotNull(parseErrorItor69);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + false + "'", boolean70 == false);
        org.junit.Assert.assertNotNull(parseErrorList75);
        org.junit.Assert.assertNotNull(document76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertEquals("'" + str82 + "' != '" + "EndTag" + "'", str82, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertNotNull(strArray88);
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "" + "'", str89, "");
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + false + "'", boolean90 == false);
        org.junit.Assert.assertNotNull(document93);
        org.junit.Assert.assertNotNull(characterList96);
        org.junit.Assert.assertNotNull(token97);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState98);
    }

    @Test
    public void test2088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2088");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream11 = parseErrorList10.stream();
        boolean boolean12 = parseErrorList10.canAddError();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.parse("EndTag", "hi!#", parseErrorList10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = htmlTreeBuilder0.originalState();
        boolean boolean16 = htmlTreeBuilder0.inSelectScope("</hi!#>");
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parseErrorStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNull(htmlTreeBuilderState14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2089");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader1.advance();
        characterReader1.advance();
        java.lang.String str5 = characterReader1.consumeTo("\ufffd>");
        int int7 = characterReader1.nextIndexOf('S');
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "artTag" + "'", str5, "artTag");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test2090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2090");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str3 = tokenQueue1.chompTo("Doctype");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        char char6 = tokenQueue1.peek();
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        char char8 = tokenQueue1.peek();
        boolean boolean9 = tokenQueue1.matchesWord();
        tokenQueue1.addFirst((java.lang.Character) '\uffff');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test2091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2091");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType2 = startTag1.type;
        startTag1.appendTagName('#');
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder5 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader6 = null;
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream9 = parseErrorList8.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor10 = parseErrorList8.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor11 = parseErrorList8.iterator();
        org.jsoup.parser.Tokeniser tokeniser12 = new org.jsoup.parser.Tokeniser(characterReader6, parseErrorList8);
        org.jsoup.parser.Token.Tag tag13 = tokeniser12.tagPending;
        org.jsoup.parser.Token.Tag tag15 = tokeniser12.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype16 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype17 = doctype16.asDoctype();
        java.lang.String str18 = doctype16.tokenType();
        tokeniser12.emit((org.jsoup.parser.Token) doctype16);
        org.jsoup.parser.Token.Tag tag21 = tokeniser12.createTagPending(true);
        xmlTreeBuilder5.currentToken = tag21;
        org.jsoup.nodes.Attributes attributes23 = tag21.attributes;
        startTag1.attributes = attributes23;
        org.jsoup.parser.TokenQueue tokenQueue26 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean27 = tokenQueue26.isEmpty();
        java.lang.String str29 = tokenQueue26.consumeToIgnoreCase("<hi!>");
        java.lang.String str30 = tokenQueue26.consumeTagName();
        boolean boolean31 = tokenQueue26.matchesWord();
        boolean boolean33 = tokenQueue26.matchesCS("StartTag");
        tokenQueue26.addFirst((java.lang.Character) 'a');
        java.lang.String str37 = tokenQueue26.consumeTo("");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder38 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document39 = xmlTreeBuilder38.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder40 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList47 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream48 = parseErrorList47.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor49 = parseErrorList47.iterator();
        boolean boolean50 = parseErrorList45.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList47);
        xmlTreeBuilder40.initialiseParse("<!---->", "hi!", parseErrorList45);
        xmlTreeBuilder38.errors = parseErrorList45;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList53 = xmlTreeBuilder38.stack;
        org.jsoup.parser.CharacterReader characterReader54 = null;
        org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream57 = parseErrorList56.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor58 = parseErrorList56.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor59 = parseErrorList56.iterator();
        org.jsoup.parser.Tokeniser tokeniser60 = new org.jsoup.parser.Tokeniser(characterReader54, parseErrorList56);
        org.jsoup.parser.Token.Tag tag61 = tokeniser60.tagPending;
        org.jsoup.parser.Token.Tag tag63 = tokeniser60.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype64 = tokeniser60.doctypePending;
        xmlTreeBuilder38.tokeniser = tokeniser60;
        org.jsoup.parser.CharacterReader characterReader66 = null;
        org.jsoup.parser.ParseErrorList parseErrorList68 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream69 = parseErrorList68.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor70 = parseErrorList68.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor71 = parseErrorList68.iterator();
        org.jsoup.parser.Tokeniser tokeniser72 = new org.jsoup.parser.Tokeniser(characterReader66, parseErrorList68);
        tokeniser72.createTempBuffer();
        xmlTreeBuilder38.tokeniser = tokeniser72;
        org.jsoup.parser.TokenQueue tokenQueue76 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean77 = tokenQueue76.matchesStartTag();
        char[] charArray84 = new char[] { ' ', '4', '\000', ' ', '\uffff', 'a' };
        boolean boolean85 = tokenQueue76.matchesAny(charArray84);
        tokeniser72.emit(charArray84);
        boolean boolean87 = tokenQueue26.matchesAny(charArray84);
        startTag1.appendAttributeValue(charArray84);
        org.junit.Assert.assertTrue("'" + tokenType2 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType2.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertNotNull(parseErrorStream9);
        org.junit.Assert.assertNotNull(parseErrorItor10);
        org.junit.Assert.assertNotNull(parseErrorItor11);
        org.junit.Assert.assertNull(tag13);
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(doctype17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "Doctype" + "'", str18, "Doctype");
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(attributes23);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "EndTag" + "'", str29, "EndTag");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNull(document39);
        org.junit.Assert.assertNotNull(parseErrorList47);
        org.junit.Assert.assertNotNull(parseErrorStream48);
        org.junit.Assert.assertNotNull(parseErrorItor49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNull(elementList53);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertNotNull(parseErrorStream57);
        org.junit.Assert.assertNotNull(parseErrorItor58);
        org.junit.Assert.assertNotNull(parseErrorItor59);
        org.junit.Assert.assertNull(tag61);
        org.junit.Assert.assertNotNull(tag63);
        org.junit.Assert.assertNull(doctype64);
        org.junit.Assert.assertNotNull(parseErrorList68);
        org.junit.Assert.assertNotNull(parseErrorStream69);
        org.junit.Assert.assertNotNull(parseErrorItor70);
        org.junit.Assert.assertNotNull(parseErrorItor71);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(charArray84);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray84), " 4\000\uffffa");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray84), " 4\000\uffffa");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray84), "[ , 4, \000\uffff, a]");
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean87 + "' != '" + true + "'", boolean87 == true);
    }

    @Test
    public void test2092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2092");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\uffff');
        java.lang.String str5 = characterReader1.consumeTo("<Doctype>");
        characterReader1.rewindToMark();
        java.lang.String str8 = characterReader1.consumeTo('E');
        int int9 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "StartTag" + "'", str5, "StartTag");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "StartTag" + "'", str8, "StartTag");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test2093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2093");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList1.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.iterator();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder4 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList8 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int9 = parseErrorList8.getMaxSize();
        org.jsoup.nodes.Document document10 = htmlTreeBuilder4.parse("0: Doctype", "hi!", parseErrorList8);
        htmlTreeBuilder4.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray13 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList14 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList14, characterArray13);
        htmlTreeBuilder4.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList14);
        boolean boolean17 = htmlTreeBuilder4.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState20 = org.jsoup.parser.HtmlTreeBuilderState.InRow;
        boolean boolean21 = htmlTreeBuilder4.process((org.jsoup.parser.Token) startTag19, htmlTreeBuilderState20);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState22 = htmlTreeBuilder4.state();
        int int23 = parseErrorList1.indexOf((java.lang.Object) htmlTreeBuilder4);
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertNotNull(parseErrorList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(characterArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test2094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2094");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream19 = parseErrorList18.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor20 = parseErrorList18.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor21 = parseErrorList18.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        boolean boolean25 = parseErrorList18.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23);
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList23);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList23.iterator();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder0.parse("[]", "Doctype", parseErrorList23);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream34 = parseErrorList33.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor35 = parseErrorList33.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList33.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList38 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int39 = parseErrorList38.getMaxSize();
        boolean boolean40 = parseErrorList33.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList38);
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream44 = parseErrorList43.stream();
        boolean boolean45 = parseErrorList43.canAddError();
        boolean boolean46 = parseErrorList38.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList43);
        org.jsoup.nodes.Document document47 = htmlTreeBuilder0.parse("hi!", "<!---->", parseErrorList43);
        org.jsoup.parser.Tokeniser tokeniser48 = htmlTreeBuilder0.tokeniser;
        java.lang.StringBuilder stringBuilder49 = tokeniser48.dataBuffer;
        org.jsoup.parser.Token.Doctype doctype50 = tokeniser48.doctypePending;
        org.jsoup.parser.Token.Tag tag52 = tokeniser48.createTagPending(true);
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.Doctype doctype53 = tag52.asDoctype();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.parser.Token$StartTag cannot be cast to org.jsoup.parser.Token$Doctype");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorStream19);
        org.junit.Assert.assertNotNull(parseErrorItor20);
        org.junit.Assert.assertNotNull(parseErrorItor21);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertNotNull(parseErrorStream34);
        org.junit.Assert.assertNotNull(parseErrorItor35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertNotNull(parseErrorStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(tokeniser48);
        org.junit.Assert.assertNull(stringBuilder49);
        org.junit.Assert.assertNull(doctype50);
        org.junit.Assert.assertNotNull(tag52);
    }

    @Test
    public void test2095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2095");
        org.jsoup.parser.Token.StartTag startTag0 = new org.jsoup.parser.Token.StartTag();
        startTag0.appendAttributeValue("hi!");
        startTag0.appendAttributeValue("");
        org.jsoup.nodes.Attributes attributes5 = null;
        startTag0.attributes = attributes5;
        boolean boolean7 = startTag0.isDoctype();
        startTag0.selfClosing = false;
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2096");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        char char3 = tokenQueue1.peek();
        boolean boolean5 = tokenQueue1.matches("hi!#");
        boolean boolean7 = tokenQueue1.matchChomp("Doctype");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + char3 + "' != '" + 'E' + "'", char3 == 'E');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test2097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2097");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("t");
        java.lang.String str2 = characterReader1.consumeLetterThenDigitSequence();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "t" + "'", str2, "t");
    }

    @Test
    public void test2098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2098");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean8 = htmlTreeBuilder0.inListItemScope("100: ");
        boolean boolean9 = htmlTreeBuilder0.isFosterInserts();
        htmlTreeBuilder0.framesetOk(false);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState12 = htmlTreeBuilder0.state();
        org.jsoup.parser.Token.StartTag startTag14 = new org.jsoup.parser.Token.StartTag();
        startTag14.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag17 = startTag14.asStartTag();
        org.jsoup.parser.Token.Tag tag19 = startTag17.name("");
        org.jsoup.parser.Token.StartTag startTag20 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes21 = startTag20.getAttributes();
        tag19.attributes = attributes21;
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag("-1: []", attributes21);
        startTag23.appendTagName('E');
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder26 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int31 = parseErrorList30.getMaxSize();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder26.parse("0: Doctype", "hi!", parseErrorList30);
        boolean boolean33 = htmlTreeBuilder26.framesetOk();
        org.jsoup.parser.Parser parser34 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser36 = parser34.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document39 = parser34.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document42 = parser34.parseInput("<hi!>", "[]");
        htmlTreeBuilder26.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document42);
        boolean boolean44 = htmlTreeBuilder26.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream53 = parseErrorList52.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor54 = parseErrorList52.iterator();
        boolean boolean55 = parseErrorList50.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52);
        xmlTreeBuilder45.initialiseParse("<!---->", "hi!", parseErrorList50);
        org.jsoup.parser.ParseErrorList parseErrorList60 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder45.parse("", "[]", parseErrorList60);
        boolean boolean62 = htmlTreeBuilder26.isInActiveFormattingElements((org.jsoup.nodes.Element) document61);
        org.jsoup.parser.TokenQueue tokenQueue64 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean65 = tokenQueue64.isEmpty();
        boolean boolean66 = tokenQueue64.consumeWhitespace();
        java.lang.String str67 = tokenQueue64.consumeWord();
        boolean boolean68 = tokenQueue64.matchesWhitespace();
        java.lang.String[] strArray73 = new java.lang.String[] { "0: []", "StartTag", "EndTag", "" };
        java.lang.String str74 = tokenQueue64.consumeToAny(strArray73);
        boolean boolean75 = htmlTreeBuilder26.inScope(strArray73);
        org.jsoup.parser.ParseErrorList parseErrorList79 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream80 = parseErrorList79.stream();
        org.jsoup.parser.MiniSoupTokeniserState miniSoupTokeniserState81 = org.jsoup.parser.MiniSoupTokeniserState.Data;
        org.jsoup.parser.MiniSoupTokeniserState miniSoupTokeniserState82 = org.jsoup.parser.MiniSoupTokeniserState.Data;
        org.jsoup.parser.MiniSoupTokeniserState[] miniSoupTokeniserStateArray83 = new org.jsoup.parser.MiniSoupTokeniserState[] { miniSoupTokeniserState81, miniSoupTokeniserState82 };
        org.jsoup.parser.MiniSoupTokeniserState[] miniSoupTokeniserStateArray84 = parseErrorList79.toArray(miniSoupTokeniserStateArray83);
        org.jsoup.nodes.Document document85 = htmlTreeBuilder26.parse("0: []", "Doctype", parseErrorList79);
        boolean boolean86 = htmlTreeBuilderState12.process((org.jsoup.parser.Token) startTag23, htmlTreeBuilder26);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState12);
        org.junit.Assert.assertNotNull(startTag17);
        org.junit.Assert.assertNotNull(tag19);
        org.junit.Assert.assertNotNull(attributes21);
        org.junit.Assert.assertNotNull(parseErrorList30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(parser36);
        org.junit.Assert.assertNotNull(document39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertNotNull(parseErrorStream53);
        org.junit.Assert.assertNotNull(parseErrorItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseErrorList60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "EndTag" + "'", str67, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertEquals("'" + str74 + "' != '" + "" + "'", str74, "");
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertNotNull(parseErrorList79);
        org.junit.Assert.assertNotNull(parseErrorStream80);
        org.junit.Assert.assertNotNull(miniSoupTokeniserState81);
        org.junit.Assert.assertNotNull(miniSoupTokeniserState82);
        org.junit.Assert.assertNotNull(miniSoupTokeniserStateArray83);
        org.junit.Assert.assertNotNull(miniSoupTokeniserStateArray84);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + true + "'", boolean86 == true);
    }

    @Test
    public void test2099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2099");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("\uffff>");
    }

    @Test
    public void test2100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2100");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        boolean boolean1 = doctype0.isCharacter();
        boolean boolean2 = doctype0.isEndTag();
        boolean boolean3 = doctype0.isCharacter();
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        org.jsoup.parser.Token.StartTag startTag6 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag6.appendTagName("hi!");
        startTag6.appendAttributeName('4');
        org.jsoup.parser.Token.TokenType tokenType11 = startTag6.type;
        doctype0.type = tokenType11;
        java.lang.StringBuilder stringBuilder13 = doctype0.publicIdentifier;
        java.lang.String str14 = doctype0.getName();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType11 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType11.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test2101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2101");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag();
        endTag1.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder3 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int8 = parseErrorList7.getMaxSize();
        org.jsoup.nodes.Document document9 = htmlTreeBuilder3.parse("0: Doctype", "hi!", parseErrorList7);
        boolean boolean10 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) endTag1, htmlTreeBuilder3);
        htmlTreeBuilder3.clearStackToTableContext();
        htmlTreeBuilder3.generateImpliedEndTags("hi!#");
        java.util.List<org.jsoup.parser.Token.Character> characterList14 = htmlTreeBuilder3.getPendingTableCharacters();
        boolean boolean16 = htmlTreeBuilder3.inSelectScope("hi!#");
        org.jsoup.parser.CharacterReader characterReader17 = null;
        org.jsoup.parser.ParseErrorList parseErrorList19 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream20 = parseErrorList19.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor21 = parseErrorList19.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor22 = parseErrorList19.iterator();
        org.jsoup.parser.Tokeniser tokeniser23 = new org.jsoup.parser.Tokeniser(characterReader17, parseErrorList19);
        org.jsoup.parser.Token.Tag tag24 = tokeniser23.tagPending;
        tokeniser23.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag28 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType29 = startTag28.type;
        startTag28.appendTagName('#');
        tokeniser23.tagPending = startTag28;
        java.lang.String str33 = startTag28.tagName;
        java.lang.String str34 = startTag28.tagName;
        org.jsoup.nodes.Element element35 = htmlTreeBuilder3.insert(startTag28);
        org.jsoup.parser.TokenQueue tokenQueue37 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str39 = tokenQueue37.chompTo("Doctype");
        java.lang.String str40 = tokenQueue37.consumeWord();
        boolean boolean41 = tokenQueue37.matchesStartTag();
        org.jsoup.parser.Token.EndTag endTag42 = new org.jsoup.parser.Token.EndTag();
        char[] charArray45 = new char[] { '#', '#' };
        endTag42.appendAttributeValue(charArray45);
        boolean boolean47 = tokenQueue37.matchesAny(charArray45);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int53 = parseErrorList52.getMaxSize();
        org.jsoup.nodes.Document document54 = htmlTreeBuilder48.parse("0: Doctype", "hi!", parseErrorList52);
        boolean boolean55 = htmlTreeBuilder48.framesetOk();
        org.jsoup.parser.Parser parser56 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser58 = parser56.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document61 = parser56.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document64 = parser56.parseInput("<hi!>", "[]");
        htmlTreeBuilder48.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document64);
        java.lang.String[] strArray66 = new java.lang.String[] {};
        boolean boolean67 = htmlTreeBuilder48.inScope(strArray66);
        boolean boolean68 = tokenQueue37.matchesAny(strArray66);
        htmlTreeBuilder3.popStackToClose(strArray66);
        org.jsoup.nodes.Document document72 = htmlTreeBuilder3.parse("ndTag", "<hi!hi!>");
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(document9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(characterList14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parseErrorStream20);
        org.junit.Assert.assertNotNull(parseErrorItor21);
        org.junit.Assert.assertNotNull(parseErrorItor22);
        org.junit.Assert.assertNull(tag24);
        org.junit.Assert.assertTrue("'" + tokenType29 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType29.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi!#" + "'", str33, "hi!#");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi!#" + "'", str34, "hi!#");
        org.junit.Assert.assertNotNull(element35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "EndTag" + "'", str39, "EndTag");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(charArray45);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray45), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray45), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray45), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parser56);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNotNull(document64);
        org.junit.Assert.assertNotNull(strArray66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(document72);
    }

    @Test
    public void test2102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2102");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.Parser parser19 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        org.jsoup.parser.CharacterReader characterReader20 = null;
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream23 = parseErrorList22.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList22.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor25 = parseErrorList22.iterator();
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader20, parseErrorList22);
        org.jsoup.parser.Token.Tag tag27 = tokeniser26.tagPending;
        tokeniser26.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag31 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType32 = startTag31.type;
        startTag31.appendTagName('#');
        tokeniser26.tagPending = startTag31;
        org.jsoup.parser.Token.StartTag startTag37 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType38 = startTag37.type;
        java.lang.String str39 = startTag37.toString();
        tokeniser26.emit((org.jsoup.parser.Token) startTag37);
        org.jsoup.nodes.FormElement formElement42 = htmlTreeBuilder0.insertForm(startTag37, true);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder43 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList47 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int48 = parseErrorList47.getMaxSize();
        org.jsoup.nodes.Document document49 = htmlTreeBuilder43.parse("0: Doctype", "hi!", parseErrorList47);
        org.jsoup.parser.ParseErrorList parseErrorList53 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream54 = parseErrorList53.stream();
        boolean boolean55 = parseErrorList53.canAddError();
        org.jsoup.nodes.Document document56 = htmlTreeBuilder43.parse("EndTag", "hi!#", parseErrorList53);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState57 = htmlTreeBuilder43.originalState();
        org.jsoup.nodes.Element element58 = htmlTreeBuilder43.pop();
        org.jsoup.nodes.Element element59 = null;
        boolean boolean60 = htmlTreeBuilder43.onStack(element59);
        htmlTreeBuilder43.generateImpliedEndTags(" EndTag");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader65 = new org.jsoup.parser.CharacterReader("StartTag");
        int int67 = characterReader65.nextIndexOf((java.lang.CharSequence) "[]");
        boolean boolean68 = characterReader65.matchesDigit();
        java.lang.String str69 = characterReader65.toString();
        xmlTreeBuilder63.reader = characterReader65;
        org.jsoup.parser.ParseErrorList parseErrorList74 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int75 = parseErrorList74.getMaxSize();
        org.jsoup.parser.ParseError[] parseErrorArray76 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList77 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean78 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList77, parseErrorArray76);
        org.jsoup.parser.ParseError[] parseErrorArray79 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList80 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList80, parseErrorArray79);
        boolean boolean82 = parseErrorList77.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList80);
        org.jsoup.parser.ParseError[] parseErrorArray83 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList84 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList84, parseErrorArray83);
        boolean boolean86 = parseErrorList80.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList84);
        parseErrorList84.clear();
        boolean boolean88 = parseErrorList74.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList84);
        xmlTreeBuilder63.initialiseParse("<Doctype>", "a", parseErrorList74);
        org.jsoup.parser.Token.Character character91 = new org.jsoup.parser.Token.Character("100: ");
        xmlTreeBuilder63.insert(character91);
        htmlTreeBuilder43.insert(character91);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState94 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        boolean boolean95 = htmlTreeBuilder0.process((org.jsoup.parser.Token) character91, htmlTreeBuilderState94);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertNotNull(parseErrorStream23);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNotNull(parseErrorItor25);
        org.junit.Assert.assertNull(tag27);
        org.junit.Assert.assertTrue("'" + tokenType32 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType32.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType38 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType38.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "<hi!>" + "'", str39, "<hi!>");
        org.junit.Assert.assertNotNull(formElement42);
        org.junit.Assert.assertNotNull(parseErrorList47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(parseErrorStream54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNull(htmlTreeBuilderState57);
        org.junit.Assert.assertNotNull(element58);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + (-1) + "'", int67 == (-1));
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "StartTag" + "'", str69, "StartTag");
        org.junit.Assert.assertNotNull(parseErrorList74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
        org.junit.Assert.assertNotNull(parseErrorArray76);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(parseErrorArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(parseErrorArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState94);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test2103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2103");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        tokenQueue1.addFirst((java.lang.Character) '\000');
        java.lang.String str5 = tokenQueue1.chompTo("hi!#<hi!#>");
        java.lang.String str6 = tokenQueue1.remainder();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\000EndTag" + "'", str5, "\000EndTag");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2104");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        java.lang.StringBuilder stringBuilder10 = tokeniser6.dataBuffer;
        tokeniser6.emitTagPending();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNull(stringBuilder10);
    }

    @Test
    public void test2105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2105");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList1.stream();
        boolean boolean3 = parseErrorList1.canAddError();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int12 = parseErrorList11.getMaxSize();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder7.parse("0: Doctype", "hi!", parseErrorList11);
        boolean boolean14 = htmlTreeBuilderState4.process((org.jsoup.parser.Token) endTag5, htmlTreeBuilder7);
        htmlTreeBuilder7.baseUri = "</hi![]>";
        boolean boolean17 = parseErrorList1.equals((java.lang.Object) htmlTreeBuilder7);
        org.jsoup.nodes.Document document18 = htmlTreeBuilder7.getDocument();
        org.jsoup.nodes.Element element19 = htmlTreeBuilder7.currentElement();
        org.jsoup.parser.ParseErrorList parseErrorList24 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream27 = parseErrorList26.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList26.iterator();
        boolean boolean29 = parseErrorList24.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        parseErrorList26.ensureCapacity((int) (short) 1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder32 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document33 = xmlTreeBuilder32.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder34 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList41 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream42 = parseErrorList41.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor43 = parseErrorList41.iterator();
        boolean boolean44 = parseErrorList39.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList41);
        xmlTreeBuilder34.initialiseParse("<!---->", "hi!", parseErrorList39);
        xmlTreeBuilder32.errors = parseErrorList39;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList47 = xmlTreeBuilder32.stack;
        boolean boolean48 = parseErrorList26.equals((java.lang.Object) elementList47);
        boolean boolean49 = parseErrorList26.canAddError();
        org.jsoup.nodes.Document document50 = htmlTreeBuilder7.parse("ndTag", "</hi![]>", parseErrorList26);
        java.util.List<org.jsoup.parser.Token.Character> characterList51 = htmlTreeBuilder7.getPendingTableCharacters();
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(element19);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parseErrorStream27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(document33);
        org.junit.Assert.assertNotNull(parseErrorList41);
        org.junit.Assert.assertNotNull(parseErrorStream42);
        org.junit.Assert.assertNotNull(parseErrorItor43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNull(elementList47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertNotNull(characterList51);
    }

    @Test
    public void test2106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2106");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\000');
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        java.lang.String str6 = characterReader1.consumeToEnd();
        java.lang.String str7 = characterReader1.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test2107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2107");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        org.jsoup.parser.Token.StartTag startTag19 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes20 = startTag19.getAttributes();
        org.jsoup.parser.Token.StartTag startTag21 = new org.jsoup.parser.Token.StartTag("<!---->", attributes20);
        org.jsoup.nodes.Element element22 = htmlTreeBuilder0.insert(startTag21);
        org.jsoup.nodes.Element element23 = htmlTreeBuilder0.currentElement();
        org.jsoup.parser.Parser parser24 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document27 = parser24.parseInput("", "hi!");
        org.jsoup.nodes.Document document30 = parser24.parseInput("S", "a");
        boolean boolean31 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document30);
        org.jsoup.parser.ParseError[] parseErrorArray32 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList33 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33, parseErrorArray32);
        org.jsoup.parser.ParseError[] parseErrorArray35 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList36 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList36, parseErrorArray35);
        boolean boolean38 = parseErrorList33.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList36);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor39 = parseErrorList36.listIterator();
        int int40 = parseErrorList36.size();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder41 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList45 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int46 = parseErrorList45.getMaxSize();
        org.jsoup.nodes.Document document47 = htmlTreeBuilder41.parse("0: Doctype", "hi!", parseErrorList45);
        htmlTreeBuilder41.newPendingTableCharacters();
        boolean boolean49 = parseErrorList36.equals((java.lang.Object) htmlTreeBuilder41);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder52 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList59 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream60 = parseErrorList59.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor61 = parseErrorList59.iterator();
        boolean boolean62 = parseErrorList57.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList59);
        xmlTreeBuilder52.initialiseParse("<!---->", "hi!", parseErrorList57);
        int int64 = parseErrorList57.size();
        org.jsoup.nodes.Document document65 = htmlTreeBuilder41.parse("10: ", " EndTag", parseErrorList57);
        boolean boolean66 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document65);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(attributes20);
        org.junit.Assert.assertNotNull(element22);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(parser24);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseErrorArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parseErrorArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseErrorItor39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(parseErrorList45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertNotNull(parseErrorStream60);
        org.junit.Assert.assertNotNull(parseErrorItor61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
    }

    @Test
    public void test2108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2108");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        boolean boolean6 = parseErrorList1.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList4.listIterator();
        int int9 = parseErrorList4.lastIndexOf((java.lang.Object) 1.0d);
        org.jsoup.parser.Token.EndTag endTag13 = new org.jsoup.parser.Token.EndTag();
        char[] charArray16 = new char[] { '#', '#' };
        endTag13.appendAttributeValue(charArray16);
        endTag13.finaliseTag();
        boolean boolean19 = endTag13.isSelfClosing();
        org.jsoup.parser.Tag tag21 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean22 = tag21.isFormListed();
        org.jsoup.parser.Tag tag23 = tag21.setSelfClosing();
        boolean boolean24 = tag21.isKnownTag();
        java.lang.Object[] objArray26 = new java.lang.Object[] { boolean19, tag21, "Doctype" };
        org.jsoup.parser.ParseError parseError27 = new org.jsoup.parser.ParseError((int) (short) 0, "[]", objArray26);
        parseErrorList4.add(0, parseError27);
        parseErrorList4.trimToSize();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseErrorItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(charArray16);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray16), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray16), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray16), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(objArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray26), "[false, hi!, Doctype]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray26), "[false, hi!, Doctype]");
    }

    @Test
    public void test2109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2109");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList5 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream8 = parseErrorList7.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList7.iterator();
        boolean boolean10 = parseErrorList5.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        xmlTreeBuilder0.initialiseParse("<!---->", "hi!", parseErrorList5);
        int int12 = parseErrorList5.size();
        parseErrorList5.clear();
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parseErrorStream8);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test2110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2110");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(2);
        org.junit.Assert.assertNotNull(parseErrorList1);
    }

    @Test
    public void test2111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2111");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList14 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean18 = characterReader16.matches("[100: ]");
        htmlTreeBuilder0.reader = characterReader16;
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.jsoup.parser.CharacterReader characterReader22 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader22.advance();
        characterReader22.advance();
        java.lang.String str26 = characterReader22.consumeTo('E');
        htmlTreeBuilder0.reader = characterReader22;
        java.lang.String str28 = characterReader22.toString();
        java.lang.String str30 = characterReader22.consumeTo('a');
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(characterList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "artTag" + "'", str26, "artTag");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test2112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2112");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList((int) '4', 1);
    }

    @Test
    public void test2113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2113");
        org.jsoup.parser.ParseErrorList parseErrorList2 = new org.jsoup.parser.ParseErrorList(10, (int) '#');
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        org.jsoup.parser.ParseError[] parseErrorArray6 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList7 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7, parseErrorArray6);
        boolean boolean9 = parseErrorList4.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        org.jsoup.parser.ParseError[] parseErrorArray10 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList11 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11, parseErrorArray10);
        boolean boolean13 = parseErrorList7.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList11);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream14 = parseErrorList7.stream();
        boolean boolean15 = parseErrorList2.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        org.jsoup.parser.ParseError[] parseErrorArray16 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList17 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList17, parseErrorArray16);
        org.jsoup.parser.ParseError[] parseErrorArray19 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList20 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20, parseErrorArray19);
        boolean boolean22 = parseErrorList17.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList20);
        java.lang.Object[] objArray23 = parseErrorList17.toArray();
        parseErrorList17.clear();
        org.jsoup.parser.ParseError[] parseErrorArray25 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList26 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26, parseErrorArray25);
        boolean boolean28 = parseErrorList17.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream29 = parseErrorList26.parallelStream();
        java.lang.Object[] objArray30 = parseErrorList26.toArray();
        org.jsoup.parser.ParseError parseError33 = new org.jsoup.parser.ParseError((int) (byte) 100, "");
        boolean boolean34 = parseErrorList26.add(parseError33);
        boolean boolean35 = parseErrorList2.add(parseError33);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator36 = parseErrorList2.spliterator();
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseErrorArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseErrorArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parseErrorStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(parseErrorArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(objArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray23), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray23), "[]");
        org.junit.Assert.assertNotNull(parseErrorArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(parseErrorStream29);
        org.junit.Assert.assertNotNull(objArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray30), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray30), "[]");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(parseErrorSpliterator36);
    }

    @Test
    public void test2114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2114");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\000');
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        java.lang.String str6 = characterReader1.consumeToEnd();
        boolean boolean8 = characterReader1.matchesIgnoreCase("hi!");
        int int9 = characterReader1.pos();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "StartTag" + "'", str6, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test2115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2115");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = null;
        htmlTreeBuilder18.transition(htmlTreeBuilderState25);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int34 = parseErrorList33.getMaxSize();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder29.parse("0: Doctype", "hi!", parseErrorList33);
        htmlTreeBuilder29.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray38 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList39 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList39, characterArray38);
        htmlTreeBuilder29.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList39);
        boolean boolean42 = htmlTreeBuilder29.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("[100: ]");
        org.jsoup.nodes.FormElement formElement46 = htmlTreeBuilder29.insertForm(startTag44, true);
        htmlTreeBuilder29.baseUri = "[]";
        org.jsoup.parser.CharacterReader characterReader51 = null;
        org.jsoup.parser.ParseErrorList parseErrorList53 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream54 = parseErrorList53.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor55 = parseErrorList53.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor56 = parseErrorList53.iterator();
        org.jsoup.parser.Tokeniser tokeniser57 = new org.jsoup.parser.Tokeniser(characterReader51, parseErrorList53);
        htmlTreeBuilder29.initialiseParse("St", "<Doctype>", parseErrorList53);
        org.jsoup.nodes.Document document59 = htmlTreeBuilder18.parse("\uffff", "<hi!#>", parseErrorList53);
        java.lang.Object[] objArray60 = parseErrorList53.toArray();
        org.jsoup.nodes.Document document61 = htmlTreeBuilder0.parse("\ufffd>", "0: Doctype", parseErrorList53);
        org.jsoup.parser.CharacterReader characterReader63 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean65 = characterReader63.matches('\000');
        characterReader63.mark();
        boolean boolean67 = characterReader63.isEmpty();
        java.lang.String str68 = characterReader63.consumeToEnd();
        htmlTreeBuilder0.reader = characterReader63;
        htmlTreeBuilder0.clearStackToTableContext();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(characterArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(formElement46);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(parseErrorStream54);
        org.junit.Assert.assertNotNull(parseErrorItor55);
        org.junit.Assert.assertNotNull(parseErrorItor56);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(objArray60);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray60), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray60), "[]");
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "StartTag" + "'", str68, "StartTag");
    }

    @Test
    public void test2116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2116");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState0 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("Doctype");
        org.jsoup.parser.Token.Tag tag4 = startTag2.name("hi!#");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder5 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int10 = parseErrorList9.getMaxSize();
        org.jsoup.nodes.Document document11 = htmlTreeBuilder5.parse("0: Doctype", "hi!", parseErrorList9);
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream16 = parseErrorList15.stream();
        boolean boolean17 = parseErrorList15.canAddError();
        org.jsoup.nodes.Document document18 = htmlTreeBuilder5.parse("EndTag", "hi!#", parseErrorList15);
        java.lang.String[] strArray26 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean27 = htmlTreeBuilder5.inScope("hi!#", strArray26);
        htmlTreeBuilder5.clearStackToTableContext();
        boolean boolean29 = htmlTreeBuilderState0.process((org.jsoup.parser.Token) startTag2, htmlTreeBuilder5);
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser34 = parser32.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder35.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList44 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream45 = parseErrorList44.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor46 = parseErrorList44.iterator();
        boolean boolean47 = parseErrorList42.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList44);
        xmlTreeBuilder37.initialiseParse("<!---->", "hi!", parseErrorList42);
        xmlTreeBuilder35.errors = parseErrorList42;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList50 = xmlTreeBuilder35.stack;
        org.jsoup.parser.Parser parser51 = parser34.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder35);
        org.jsoup.parser.ParseErrorList parseErrorList53 = org.jsoup.parser.ParseErrorList.tracking(0);
        xmlTreeBuilder35.errors = parseErrorList53;
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor55 = parseErrorList53.iterator();
        org.jsoup.nodes.Document document56 = htmlTreeBuilder5.parse("<hi!#>", "-1: []", parseErrorList53);
        java.lang.Object[] objArray57 = parseErrorList53.toArray();
        org.junit.Assert.assertNotNull(htmlTreeBuilderState0);
        org.junit.Assert.assertNotNull(tag4);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(document11);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseErrorStream16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(strArray26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parseErrorStream45);
        org.junit.Assert.assertNotNull(parseErrorItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(elementList50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(parseErrorItor55);
        org.junit.Assert.assertNotNull(document56);
        org.junit.Assert.assertNotNull(objArray57);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray57), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray57), "[]");
    }

    @Test
    public void test2117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2117");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        boolean boolean19 = htmlTreeBuilder0.inScope(strArray18);
        htmlTreeBuilder0.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int26 = parseErrorList25.getMaxSize();
        org.jsoup.nodes.Document document27 = htmlTreeBuilder21.parse("0: Doctype", "hi!", parseErrorList25);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document27);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int34 = parseErrorList33.getMaxSize();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder29.parse("0: Doctype", "hi!", parseErrorList33);
        htmlTreeBuilder29.resetInsertionMode();
        org.jsoup.nodes.Element element37 = htmlTreeBuilder29.currentElement();
        boolean boolean39 = htmlTreeBuilder29.inButtonScope("-1: []");
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState40 = htmlTreeBuilder29.state();
        htmlTreeBuilder0.error(htmlTreeBuilderState40);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder42 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList46 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int47 = parseErrorList46.getMaxSize();
        org.jsoup.nodes.Document document48 = htmlTreeBuilder42.parse("0: Doctype", "hi!", parseErrorList46);
        htmlTreeBuilder42.generateImpliedEndTags("hi!#");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder53 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document54 = xmlTreeBuilder53.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder55 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList60 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList62 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream63 = parseErrorList62.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor64 = parseErrorList62.iterator();
        boolean boolean65 = parseErrorList60.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList62);
        xmlTreeBuilder55.initialiseParse("<!---->", "hi!", parseErrorList60);
        xmlTreeBuilder53.errors = parseErrorList60;
        org.jsoup.nodes.Document document68 = htmlTreeBuilder42.parse("EndTag", "a", parseErrorList60);
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document68);
        htmlTreeBuilder0.setFosterInserts(true);
        org.jsoup.nodes.Element element73 = htmlTreeBuilder0.insert("\ufffd>");
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseErrorList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(element37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState40);
        org.junit.Assert.assertNotNull(parseErrorList46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 0 + "'", int47 == 0);
        org.junit.Assert.assertNotNull(document48);
        org.junit.Assert.assertNull(document54);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parseErrorStream63);
        org.junit.Assert.assertNotNull(parseErrorItor64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertNotNull(document68);
        org.junit.Assert.assertNotNull(element73);
    }

    @Test
    public void test2118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2118");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.parser.Tag tag3 = tag1.setSelfClosing();
        boolean boolean4 = tag1.isKnownTag();
        boolean boolean5 = tag1.isFormSubmittable();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test2119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2119");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document1 = xmlTreeBuilder0.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder2 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList7 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList9.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor11 = parseErrorList9.iterator();
        boolean boolean12 = parseErrorList7.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList9);
        xmlTreeBuilder2.initialiseParse("<!---->", "hi!", parseErrorList7);
        xmlTreeBuilder0.errors = parseErrorList7;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList15 = xmlTreeBuilder0.stack;
        org.jsoup.parser.ParseErrorList parseErrorList19 = org.jsoup.parser.ParseErrorList.tracking((int) '\000');
        org.jsoup.parser.ParseError[] parseErrorArray20 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList21 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList21, parseErrorArray20);
        org.jsoup.parser.ParseError[] parseErrorArray23 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList24 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean25 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList24, parseErrorArray23);
        boolean boolean26 = parseErrorList21.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList24);
        java.lang.Object[] objArray27 = parseErrorList21.toArray();
        parseErrorList21.clear();
        org.jsoup.parser.ParseError[] parseErrorArray29 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList30 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean31 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList30, parseErrorArray29);
        org.jsoup.parser.ParseError[] parseErrorArray32 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList33 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33, parseErrorArray32);
        boolean boolean35 = parseErrorList30.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList33);
        java.lang.Object[] objArray36 = parseErrorList30.toArray();
        parseErrorList30.clear();
        org.jsoup.parser.ParseError[] parseErrorArray38 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList39 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39, parseErrorArray38);
        boolean boolean41 = parseErrorList30.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        boolean boolean42 = parseErrorList21.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        java.lang.Object[] objArray43 = parseErrorList39.toArray();
        boolean boolean44 = parseErrorList19.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        xmlTreeBuilder0.initialiseParse("artTag", "[100: ]", parseErrorList19);
        org.junit.Assert.assertNull(document1);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(parseErrorItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(elementList15);
        org.junit.Assert.assertNotNull(parseErrorList19);
        org.junit.Assert.assertNotNull(parseErrorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(parseErrorArray23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(objArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray27), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray27), "[]");
        org.junit.Assert.assertNotNull(parseErrorArray29);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parseErrorArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(objArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray36), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray36), "[]");
        org.junit.Assert.assertNotNull(parseErrorArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(objArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray43), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray43), "[]");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
    }

    @Test
    public void test2120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2120");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        boolean boolean6 = parseErrorList1.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        org.jsoup.parser.TreeBuilder treeBuilder7 = null;
        org.jsoup.parser.Parser parser8 = new org.jsoup.parser.Parser(treeBuilder7);
        org.jsoup.parser.TreeBuilder treeBuilder9 = null;
        org.jsoup.parser.Parser parser10 = parser8.setTreeBuilder(treeBuilder9);
        org.jsoup.parser.Parser parser12 = parser8.setTrackErrors((int) (byte) 10);
        org.jsoup.parser.TreeBuilder treeBuilder13 = parser12.getTreeBuilder();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = org.jsoup.parser.HtmlTreeBuilderState.InCell;
        org.jsoup.parser.Token.StartTag startTag16 = new org.jsoup.parser.Token.StartTag("Doctype");
        org.jsoup.parser.Token.Tag tag18 = startTag16.name("hi!#");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder19.parse("0: Doctype", "hi!", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList29 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream30 = parseErrorList29.stream();
        boolean boolean31 = parseErrorList29.canAddError();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder19.parse("EndTag", "hi!#", parseErrorList29);
        java.lang.String[] strArray40 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean41 = htmlTreeBuilder19.inScope("hi!#", strArray40);
        htmlTreeBuilder19.clearStackToTableContext();
        boolean boolean43 = htmlTreeBuilderState14.process((org.jsoup.parser.Token) startTag16, htmlTreeBuilder19);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder44 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int49 = parseErrorList48.getMaxSize();
        org.jsoup.nodes.Document document50 = htmlTreeBuilder44.parse("0: Doctype", "hi!", parseErrorList48);
        boolean boolean51 = htmlTreeBuilder44.framesetOk();
        org.jsoup.nodes.Document document54 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder44.setHeadElement((org.jsoup.nodes.Element) document54);
        htmlTreeBuilder19.doc = document54;
        org.jsoup.parser.Parser parser57 = parser12.setTreeBuilder((org.jsoup.parser.TreeBuilder) htmlTreeBuilder19);
        org.jsoup.parser.Parser parser58 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser60 = parser58.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder61 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document62 = xmlTreeBuilder61.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder63 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList68 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList70 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream71 = parseErrorList70.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor72 = parseErrorList70.iterator();
        boolean boolean73 = parseErrorList68.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList70);
        xmlTreeBuilder63.initialiseParse("<!---->", "hi!", parseErrorList68);
        xmlTreeBuilder61.errors = parseErrorList68;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList76 = xmlTreeBuilder61.stack;
        org.jsoup.parser.Parser parser77 = parser60.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder61);
        org.jsoup.nodes.Document document80 = parser77.parseInput("hi!", "[]");
        org.jsoup.parser.Parser[] parserArray81 = new org.jsoup.parser.Parser[] { parser12, parser77 };
        org.jsoup.parser.Parser[] parserArray82 = parseErrorList4.toArray(parserArray81);
        java.lang.Object obj83 = parseErrorList4.clone();
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNull(treeBuilder13);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState14);
        org.junit.Assert.assertNotNull(tag18);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseErrorList29);
        org.junit.Assert.assertNotNull(parseErrorStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(parseErrorList48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(document50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(parser57);
        org.junit.Assert.assertNotNull(parser58);
        org.junit.Assert.assertNotNull(parser60);
        org.junit.Assert.assertNull(document62);
        org.junit.Assert.assertNotNull(parseErrorList70);
        org.junit.Assert.assertNotNull(parseErrorStream71);
        org.junit.Assert.assertNotNull(parseErrorItor72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNull(elementList76);
        org.junit.Assert.assertNotNull(parser77);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertNotNull(parserArray81);
        org.junit.Assert.assertNotNull(parserArray82);
        org.junit.Assert.assertNotNull(obj83);
        org.junit.Assert.assertEquals(obj83.toString(), "[]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj83), "[]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj83), "[]");
    }

    @Test
    public void test2121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2121");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        tokenQueue1.addFirst((java.lang.Character) ' ');
        java.lang.String str6 = tokenQueue1.consumeTo("StartTag");
        java.lang.String str7 = tokenQueue1.consumeCssIdentifier();
        tokenQueue1.addFirst((java.lang.Character) 'S');
        java.lang.String str11 = tokenQueue1.chompTo("\uffff>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + " EndTag" + "'", str6, " EndTag");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "S" + "'", str11, "S");
    }

    @Test
    public void test2122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2122");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray9 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList10 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList10, characterArray9);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList10);
        boolean boolean13 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("[100: ]");
        org.jsoup.nodes.FormElement formElement17 = htmlTreeBuilder0.insertForm(startTag15, true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState18 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        htmlTreeBuilder0.error(htmlTreeBuilderState18);
        org.jsoup.nodes.Document document22 = htmlTreeBuilder0.parse("0: Doctype", "0: []");
        org.jsoup.parser.Parser parser23 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser25 = parser23.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document28 = parser23.parseInput("Doctype", "[]");
        boolean boolean29 = htmlTreeBuilder0.removeFromStack((org.jsoup.nodes.Element) document28);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(characterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(formElement17);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState18);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parser23);
        org.junit.Assert.assertNotNull(parser25);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test2123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2123");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Document document14 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document14);
        htmlTreeBuilder0.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int23 = parseErrorList22.getMaxSize();
        org.jsoup.nodes.Document document24 = htmlTreeBuilder18.parse("0: Doctype", "hi!", parseErrorList22);
        boolean boolean25 = htmlTreeBuilder18.framesetOk();
        org.jsoup.nodes.Document document28 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document28);
        org.jsoup.nodes.Document document32 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder18.setHeadElement((org.jsoup.nodes.Element) document32);
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document32);
        org.jsoup.parser.CharacterReader characterReader35 = htmlTreeBuilder0.reader;
        java.lang.String str37 = characterReader35.consumeTo('\ufffd');
        int int39 = characterReader35.nextIndexOf((java.lang.CharSequence) "[100: ]");
        int int40 = characterReader35.pos();
        boolean boolean41 = characterReader35.matchesLetter();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(parseErrorList22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(document24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(characterReader35);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-1) + "'", int39 == (-1));
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 10 + "'", int40 == 10);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
    }

    @Test
    public void test2124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2124");
        org.jsoup.parser.Token.Comment comment0 = new org.jsoup.parser.Token.Comment();
        java.lang.String str1 = comment0.toString();
        boolean boolean2 = comment0.isCharacter();
        comment0.bogus = false;
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.Token.StartTag startTag5 = comment0.asStartTag();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.jsoup.parser.Token$Comment cannot be cast to org.jsoup.parser.Token$StartTag");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "<!---->" + "'", str1, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test2125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2125");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        java.lang.String str5 = tokenQueue1.consumeTagName();
        java.lang.String str6 = tokenQueue1.consumeElementSelector();
        tokenQueue1.addFirst("<hi!#>");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test2126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2126");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        htmlTreeBuilder0.markInsertionMode();
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.MiniSoupTokeniserState miniSoupTokeniserState4 = org.jsoup.parser.MiniSoupTokeniserState.TagOpen;
        org.jsoup.parser.CharacterReader characterReader5 = null;
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream8 = parseErrorList7.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor9 = parseErrorList7.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor10 = parseErrorList7.iterator();
        org.jsoup.parser.Tokeniser tokeniser11 = new org.jsoup.parser.Tokeniser(characterReader5, parseErrorList7);
        org.jsoup.parser.Token.Tag tag12 = tokeniser11.tagPending;
        java.lang.StringBuilder stringBuilder13 = null;
        tokeniser11.dataBuffer = stringBuilder13;
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        char[] charArray18 = new char[] { '#', '#' };
        endTag15.appendAttributeValue(charArray18);
        tokeniser11.emit(charArray18);
        org.jsoup.parser.Token.Comment comment21 = tokeniser11.commentPending;
        org.jsoup.parser.CharacterReader characterReader23 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean24 = characterReader23.matchesLetter();
        miniSoupTokeniserState4.read(tokeniser11, characterReader23);
        htmlTreeBuilder0.tokeniser = tokeniser11;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder27 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader28 = null;
        org.jsoup.parser.ParseErrorList parseErrorList30 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream31 = parseErrorList30.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor32 = parseErrorList30.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor33 = parseErrorList30.iterator();
        org.jsoup.parser.Tokeniser tokeniser34 = new org.jsoup.parser.Tokeniser(characterReader28, parseErrorList30);
        org.jsoup.parser.Token.Tag tag35 = tokeniser34.tagPending;
        org.jsoup.parser.Token.Tag tag37 = tokeniser34.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype38 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype39 = doctype38.asDoctype();
        java.lang.String str40 = doctype38.tokenType();
        tokeniser34.emit((org.jsoup.parser.Token) doctype38);
        org.jsoup.parser.Token.Tag tag43 = tokeniser34.createTagPending(true);
        xmlTreeBuilder27.currentToken = tag43;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder45 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int50 = parseErrorList49.getMaxSize();
        org.jsoup.nodes.Document document51 = htmlTreeBuilder45.parse("0: Doctype", "hi!", parseErrorList49);
        boolean boolean52 = htmlTreeBuilder45.framesetOk();
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder45.setHeadElement((org.jsoup.nodes.Element) document55);
        xmlTreeBuilder27.doc = document55;
        org.jsoup.parser.ParseErrorList parseErrorList61 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream62 = parseErrorList61.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor63 = parseErrorList61.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor64 = parseErrorList61.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList66 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int67 = parseErrorList66.getMaxSize();
        boolean boolean68 = parseErrorList61.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList66);
        xmlTreeBuilder27.initialiseParse("hi!#", "0: []", parseErrorList66);
        org.jsoup.parser.Token.Comment comment70 = new org.jsoup.parser.Token.Comment();
        java.lang.String str71 = comment70.getData();
        xmlTreeBuilder27.insert(comment70);
        java.lang.StringBuilder stringBuilder73 = comment70.data;
        tokeniser11.emit((org.jsoup.parser.Token) comment70);
        java.lang.String str75 = comment70.toString();
        org.junit.Assert.assertNotNull(miniSoupTokeniserState4);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertNotNull(parseErrorStream8);
        org.junit.Assert.assertNotNull(parseErrorItor9);
        org.junit.Assert.assertNotNull(parseErrorItor10);
        org.junit.Assert.assertNull(tag12);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #]");
        org.junit.Assert.assertNull(comment21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(parseErrorList30);
        org.junit.Assert.assertNotNull(parseErrorStream31);
        org.junit.Assert.assertNotNull(parseErrorItor32);
        org.junit.Assert.assertNotNull(parseErrorItor33);
        org.junit.Assert.assertNull(tag35);
        org.junit.Assert.assertNotNull(tag37);
        org.junit.Assert.assertNotNull(doctype39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Doctype" + "'", str40, "Doctype");
        org.junit.Assert.assertNotNull(tag43);
        org.junit.Assert.assertNotNull(parseErrorList49);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 0 + "'", int50 == 0);
        org.junit.Assert.assertNotNull(document51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(parseErrorList61);
        org.junit.Assert.assertNotNull(parseErrorStream62);
        org.junit.Assert.assertNotNull(parseErrorItor63);
        org.junit.Assert.assertNotNull(parseErrorItor64);
        org.junit.Assert.assertNotNull(parseErrorList66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "" + "'", str71, "");
        org.junit.Assert.assertNotNull(stringBuilder73);
        org.junit.Assert.assertEquals(stringBuilder73.toString(), "");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "<!---->" + "'", str75, "<!---->");
    }

    @Test
    public void test2127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2127");
        org.jsoup.parser.Parser parser0 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser2 = parser0.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document5 = parser0.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document8 = parser0.parseInput("<hi!>", "[]");
        java.util.List<org.jsoup.parser.ParseError> parseErrorList9 = parser0.getErrors();
        org.jsoup.parser.TreeBuilder treeBuilder10 = parser0.getTreeBuilder();
        org.junit.Assert.assertNotNull(parser0);
        org.junit.Assert.assertNotNull(parser2);
        org.junit.Assert.assertNotNull(document5);
        org.junit.Assert.assertNotNull(document8);
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertNotNull(treeBuilder10);
    }

    @Test
    public void test2128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2128");
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder0 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token token1 = xmlTreeBuilder0.currentToken;
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream5 = parseErrorList4.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList4.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList4.iterator();
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader2, parseErrorList4);
        org.jsoup.parser.Token.Tag tag9 = tokeniser8.tagPending;
        org.jsoup.parser.Token.Tag tag11 = tokeniser8.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype12 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype13 = doctype12.asDoctype();
        java.lang.String str14 = doctype12.tokenType();
        tokeniser8.emit((org.jsoup.parser.Token) doctype12);
        org.jsoup.parser.Token.Tag tag17 = tokeniser8.createTagPending(true);
        xmlTreeBuilder0.tokeniser = tokeniser8;
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream22 = parseErrorList21.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList21.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList21.iterator();
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList21);
        org.jsoup.parser.Token.Tag tag26 = tokeniser25.tagPending;
        java.lang.StringBuilder stringBuilder27 = null;
        tokeniser25.dataBuffer = stringBuilder27;
        org.jsoup.parser.Token.Tag tag30 = tokeniser25.createTagPending(false);
        org.jsoup.parser.Token.Tag tag32 = tag30.name("hi!#");
        tokeniser8.tagPending = tag30;
        // The following exception was thrown during execution in test generation
        try {
            tokeniser8.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: There is an unread token pending!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(token1);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertNotNull(parseErrorStream5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNotNull(parseErrorItor7);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNotNull(tag11);
        org.junit.Assert.assertNotNull(doctype13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Doctype" + "'", str14, "Doctype");
        org.junit.Assert.assertNotNull(tag17);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorStream22);
        org.junit.Assert.assertNotNull(parseErrorItor23);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(tag30);
        org.junit.Assert.assertNotNull(tag32);
    }

    @Test
    public void test2129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2129");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype11 = doctype10.asDoctype();
        java.lang.String str12 = doctype10.tokenType();
        tokeniser6.emit((org.jsoup.parser.Token) doctype10);
        java.lang.StringBuilder stringBuilder14 = doctype10.publicIdentifier;
        java.lang.String str15 = doctype10.getSystemIdentifier();
        boolean boolean16 = doctype10.forceQuirks;
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertNotNull(stringBuilder14);
        org.junit.Assert.assertEquals(stringBuilder14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test2130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2130");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        boolean boolean2 = startTag1.isCharacter();
        org.jsoup.parser.Token.TokenType tokenType3 = startTag1.type;
        java.lang.String str4 = startTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "hi!" + "'", str4, "hi!");
    }

    @Test
    public void test2131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2131");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        java.lang.StringBuilder stringBuilder8 = null;
        tokeniser6.dataBuffer = stringBuilder8;
        org.jsoup.parser.Token.EndTag endTag10 = new org.jsoup.parser.Token.EndTag();
        char[] charArray13 = new char[] { '#', '#' };
        endTag10.appendAttributeValue(charArray13);
        tokeniser6.emit(charArray13);
        org.jsoup.parser.Token.Comment comment16 = tokeniser6.commentPending;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int22 = parseErrorList21.getMaxSize();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder17.parse("0: Doctype", "hi!", parseErrorList21);
        boolean boolean24 = htmlTreeBuilder17.framesetOk();
        org.jsoup.nodes.Document document27 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder17.setHeadElement((org.jsoup.nodes.Element) document27);
        org.jsoup.parser.Token.Comment comment29 = new org.jsoup.parser.Token.Comment();
        java.lang.String str30 = comment29.toString();
        boolean boolean31 = comment29.isCharacter();
        htmlTreeBuilder17.insert(comment29);
        boolean boolean33 = comment29.isStartTag();
        java.lang.StringBuilder stringBuilder34 = comment29.data;
        tokeniser6.emit((org.jsoup.parser.Token) comment29);
        boolean boolean36 = tokeniser6.currentNodeInHtmlNS();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(charArray13);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray13), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray13), "[#, #]");
        org.junit.Assert.assertNull(comment16);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "<!---->" + "'", str30, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(stringBuilder34);
        org.junit.Assert.assertEquals(stringBuilder34.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test2132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2132");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.parser.Tag tag3 = tag1.setSelfClosing();
        boolean boolean4 = tag1.isSelfClosing();
        java.lang.String str5 = tag1.toString();
        org.jsoup.parser.Tag tag6 = tag1.setSelfClosing();
        boolean boolean7 = tag1.formatAsBlock();
        boolean boolean8 = tag1.isBlock();
        boolean boolean9 = tag1.isBlock();
        boolean boolean10 = tag1.isData();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test2133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2133");
        org.jsoup.parser.Token.StartTag startTag2 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType3 = startTag2.type;
        startTag2.appendTagName('#');
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder6 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.CharacterReader characterReader7 = null;
        org.jsoup.parser.ParseErrorList parseErrorList9 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream10 = parseErrorList9.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor11 = parseErrorList9.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor12 = parseErrorList9.iterator();
        org.jsoup.parser.Tokeniser tokeniser13 = new org.jsoup.parser.Tokeniser(characterReader7, parseErrorList9);
        org.jsoup.parser.Token.Tag tag14 = tokeniser13.tagPending;
        org.jsoup.parser.Token.Tag tag16 = tokeniser13.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype17 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype18 = doctype17.asDoctype();
        java.lang.String str19 = doctype17.tokenType();
        tokeniser13.emit((org.jsoup.parser.Token) doctype17);
        org.jsoup.parser.Token.Tag tag22 = tokeniser13.createTagPending(true);
        xmlTreeBuilder6.currentToken = tag22;
        org.jsoup.nodes.Attributes attributes24 = tag22.attributes;
        startTag2.attributes = attributes24;
        org.jsoup.parser.Token.StartTag startTag26 = new org.jsoup.parser.Token.StartTag("65533: <hi!#>", attributes24);
        startTag26.appendAttributeName("0: Doctype");
        org.junit.Assert.assertTrue("'" + tokenType3 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType3.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(parseErrorList9);
        org.junit.Assert.assertNotNull(parseErrorStream10);
        org.junit.Assert.assertNotNull(parseErrorItor11);
        org.junit.Assert.assertNotNull(parseErrorItor12);
        org.junit.Assert.assertNull(tag14);
        org.junit.Assert.assertNotNull(tag16);
        org.junit.Assert.assertNotNull(doctype18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Doctype" + "'", str19, "Doctype");
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(attributes24);
    }

    @Test
    public void test2134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2134");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("</hi![]>");
        boolean boolean2 = tag1.preserveWhitespace();
        boolean boolean3 = tag1.isKnownTag();
        boolean boolean4 = tag1.preserveWhitespace();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test2135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2135");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        java.lang.String[] strArray18 = new java.lang.String[] {};
        boolean boolean19 = htmlTreeBuilder0.inScope(strArray18);
        htmlTreeBuilder0.markInsertionMode();
        boolean boolean22 = htmlTreeBuilder0.inScope("StartTag");
        org.jsoup.parser.Token.StartTag startTag23 = new org.jsoup.parser.Token.StartTag();
        startTag23.appendAttributeValue("hi!");
        org.jsoup.parser.Token.Tag tag27 = startTag23.name("hi!#");
        boolean boolean28 = startTag23.isStartTag();
        startTag23.appendTagName('a');
        org.jsoup.nodes.Element element31 = htmlTreeBuilder0.insertEmpty(startTag23);
        java.lang.String str32 = htmlTreeBuilder0.getBaseUri();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder0.parse("\uffff", "<!---->");
        htmlTreeBuilder0.insertMarkerToFormattingElements();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(tag27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(element31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "hi!" + "'", str32, "hi!");
        org.junit.Assert.assertNotNull(document35);
    }

    @Test
    public void test2136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2136");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList1.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList1.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int7 = parseErrorList6.getMaxSize();
        boolean boolean8 = parseErrorList1.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList6);
        org.jsoup.parser.ParseError[] parseErrorArray9 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList10 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10, parseErrorArray9);
        org.jsoup.parser.ParseError[] parseErrorArray12 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList13 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList13, parseErrorArray12);
        boolean boolean15 = parseErrorList10.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList13);
        boolean boolean16 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10);
        org.jsoup.parser.ParseError[] parseErrorArray17 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList18 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList18, parseErrorArray17);
        org.jsoup.parser.ParseError[] parseErrorArray20 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList21 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList21, parseErrorArray20);
        boolean boolean23 = parseErrorList18.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList21);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList21.listIterator();
        parseErrorList21.trimToSize();
        boolean boolean26 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList21);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int32 = parseErrorList31.getMaxSize();
        org.jsoup.nodes.Document document33 = htmlTreeBuilder27.parse("0: Doctype", "hi!", parseErrorList31);
        htmlTreeBuilder27.resetInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList39 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int40 = parseErrorList39.getMaxSize();
        org.jsoup.nodes.Document document41 = htmlTreeBuilder35.parse("0: Doctype", "hi!", parseErrorList39);
        boolean boolean42 = htmlTreeBuilder35.framesetOk();
        org.jsoup.nodes.Document document45 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder35.setHeadElement((org.jsoup.nodes.Element) document45);
        org.jsoup.nodes.Document document49 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder35.setHeadElement((org.jsoup.nodes.Element) document49);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder52 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList56 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int57 = parseErrorList56.getMaxSize();
        org.jsoup.nodes.Document document58 = htmlTreeBuilder52.parse("0: Doctype", "hi!", parseErrorList56);
        org.jsoup.parser.ParseErrorList parseErrorList62 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream63 = parseErrorList62.stream();
        boolean boolean64 = parseErrorList62.canAddError();
        org.jsoup.nodes.Document document65 = htmlTreeBuilder52.parse("EndTag", "hi!#", parseErrorList62);
        java.lang.String[] strArray73 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean74 = htmlTreeBuilder52.inScope("hi!#", strArray73);
        boolean boolean75 = htmlTreeBuilder35.inScope("hi!#", strArray73);
        htmlTreeBuilder27.popStackToClose(strArray73);
        int int77 = parseErrorList21.indexOf((java.lang.Object) htmlTreeBuilder27);
        int int78 = parseErrorList21.size();
        parseErrorList21.clear();
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parseErrorArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(parseErrorArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseErrorArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parseErrorList39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 0 + "'", int40 == 0);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(document49);
        org.junit.Assert.assertNotNull(parseErrorList56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(parseErrorList62);
        org.junit.Assert.assertNotNull(parseErrorStream63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertNotNull(strArray73);
        org.junit.Assert.assertTrue("'" + boolean74 + "' != '" + false + "'", boolean74 == false);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + (-1) + "'", int77 == (-1));
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + 0 + "'", int78 == 0);
    }

    @Test
    public void test2137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2137");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        java.lang.String str14 = comment13.toString();
        java.lang.StringBuilder stringBuilder15 = comment13.data;
        boolean boolean16 = comment13.isEndTag();
        java.lang.String str17 = comment13.toString();
        tokeniser6.commentPending = comment13;
        org.jsoup.parser.ITokeniserState iTokeniserState19 = tokeniser6.getState();
        org.jsoup.parser.Token.Tag tag21 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Tag tag22 = tokeniser6.tagPending;
        tokeniser6.emit("Doctype");
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(iTokeniserState19);
        org.junit.Assert.assertNotNull(tag21);
        org.junit.Assert.assertNotNull(tag22);
    }

    @Test
    public void test2138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2138");
        org.jsoup.parser.MiniSoupTokeniserState miniSoupTokeniserState0 = org.jsoup.parser.MiniSoupTokeniserState.EndTagOpen;
        org.jsoup.parser.CharacterReader characterReader1 = null;
        org.jsoup.parser.ParseErrorList parseErrorList3 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream4 = parseErrorList3.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList3.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList3.iterator();
        org.jsoup.parser.Tokeniser tokeniser7 = new org.jsoup.parser.Tokeniser(characterReader1, parseErrorList3);
        org.jsoup.parser.Token.Tag tag8 = tokeniser7.tagPending;
        org.jsoup.parser.Token.Tag tag10 = tokeniser7.createTagPending(true);
        tokeniser7.createTempBuffer();
        tokeniser7.emitTagPending();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int18 = parseErrorList17.getMaxSize();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder13.parse("0: Doctype", "hi!", parseErrorList17);
        boolean boolean20 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder13.error(htmlTreeBuilderState21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = null;
        htmlTreeBuilder13.transition(htmlTreeBuilderState23);
        htmlTreeBuilder13.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList27 = htmlTreeBuilder13.getPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader29 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean31 = characterReader29.matches("[100: ]");
        htmlTreeBuilder13.reader = characterReader29;
        htmlTreeBuilder13.insertMarkerToFormattingElements();
        org.jsoup.parser.CharacterReader characterReader35 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader35.advance();
        characterReader35.advance();
        java.lang.String str39 = characterReader35.consumeTo('E');
        htmlTreeBuilder13.reader = characterReader35;
        miniSoupTokeniserState0.read(tokeniser7, characterReader35);
        org.jsoup.parser.TokeniserState tokeniserState42 = org.jsoup.parser.TokeniserState.AfterAttributeValue_quoted;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document44 = xmlTreeBuilder43.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder45 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList50 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream53 = parseErrorList52.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor54 = parseErrorList52.iterator();
        boolean boolean55 = parseErrorList50.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList52);
        xmlTreeBuilder45.initialiseParse("<!---->", "hi!", parseErrorList50);
        xmlTreeBuilder43.errors = parseErrorList50;
        org.jsoup.parser.ParseErrorList parseErrorList61 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream62 = parseErrorList61.stream();
        xmlTreeBuilder43.initialiseParse("a", "[]", parseErrorList61);
        org.jsoup.parser.CharacterReader characterReader64 = null;
        org.jsoup.parser.ParseErrorList parseErrorList66 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream67 = parseErrorList66.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor68 = parseErrorList66.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor69 = parseErrorList66.iterator();
        org.jsoup.parser.Tokeniser tokeniser70 = new org.jsoup.parser.Tokeniser(characterReader64, parseErrorList66);
        org.jsoup.parser.Token.Tag tag71 = tokeniser70.tagPending;
        tokeniser70.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype74 = tokeniser70.doctypePending;
        tokeniser70.createCommentPending();
        org.jsoup.parser.Token.Comment comment76 = tokeniser70.commentPending;
        boolean boolean77 = parseErrorList61.remove((java.lang.Object) tokeniser70);
        org.jsoup.parser.ITokeniserState iTokeniserState78 = tokeniser70.getState();
        boolean boolean79 = tokeniser70.isAppropriateEndTagToken();
        org.jsoup.parser.CharacterReader characterReader81 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean83 = characterReader81.matches('\000');
        characterReader81.mark();
        boolean boolean85 = characterReader81.isEmpty();
        java.lang.String str87 = characterReader81.consumeTo('#');
        boolean boolean88 = characterReader81.matchesLetter();
        tokeniserState42.read(tokeniser70, characterReader81);
        org.jsoup.parser.CharacterReader characterReader90 = null;
        // The following exception was thrown during execution in test generation
        try {
            miniSoupTokeniserState0.read(tokeniser70, characterReader90);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(miniSoupTokeniserState0);
        org.junit.Assert.assertNotNull(parseErrorList3);
        org.junit.Assert.assertNotNull(parseErrorStream4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNull(tag8);
        org.junit.Assert.assertNotNull(tag10);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNotNull(characterList27);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "artTag" + "'", str39, "artTag");
        org.junit.Assert.assertNotNull(tokeniserState42);
        org.junit.Assert.assertNull(document44);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertNotNull(parseErrorStream53);
        org.junit.Assert.assertNotNull(parseErrorItor54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(parseErrorList61);
        org.junit.Assert.assertNotNull(parseErrorStream62);
        org.junit.Assert.assertNotNull(parseErrorList66);
        org.junit.Assert.assertNotNull(parseErrorStream67);
        org.junit.Assert.assertNotNull(parseErrorItor68);
        org.junit.Assert.assertNotNull(parseErrorItor69);
        org.junit.Assert.assertNull(tag71);
        org.junit.Assert.assertNull(doctype74);
        org.junit.Assert.assertNotNull(comment76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertNotNull(iTokeniserState78);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + false + "'", boolean79 == false);
        org.junit.Assert.assertTrue("'" + boolean83 + "' != '" + false + "'", boolean83 == false);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "StartTag" + "'", str87, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
    }

    @Test
    public void test2139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2139");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        startTag11.appendTagName('#');
        tokeniser6.tagPending = startTag11;
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser6.transition((org.jsoup.parser.ITokeniserState) tokeniserState16);
        org.jsoup.parser.Token.Doctype doctype18 = new org.jsoup.parser.Token.Doctype();
        boolean boolean19 = doctype18.isCharacter();
        tokeniser6.doctypePending = doctype18;
        org.jsoup.parser.Token.Comment comment21 = new org.jsoup.parser.Token.Comment();
        java.lang.String str22 = comment21.toString();
        java.lang.StringBuilder stringBuilder23 = comment21.data;
        tokeniser6.commentPending = comment21;
        org.jsoup.parser.Token.TokenType tokenType25 = comment21.type;
        java.lang.String str26 = comment21.getData();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tokeniserState16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "<!---->" + "'", str22, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder23);
        org.junit.Assert.assertEquals(stringBuilder23.toString(), "");
        org.junit.Assert.assertTrue("'" + tokenType25 + "' != '" + org.jsoup.parser.Token.TokenType.Comment + "'", tokenType25.equals(org.jsoup.parser.Token.TokenType.Comment));
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
    }

    @Test
    public void test2140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2140");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.resetInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int13 = parseErrorList12.getMaxSize();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder8.parse("0: Doctype", "hi!", parseErrorList12);
        boolean boolean15 = htmlTreeBuilder8.framesetOk();
        org.jsoup.nodes.Document document18 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document18);
        org.jsoup.nodes.Document document22 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder8.setHeadElement((org.jsoup.nodes.Element) document22);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder25 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList29 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int30 = parseErrorList29.getMaxSize();
        org.jsoup.nodes.Document document31 = htmlTreeBuilder25.parse("0: Doctype", "hi!", parseErrorList29);
        org.jsoup.parser.ParseErrorList parseErrorList35 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream36 = parseErrorList35.stream();
        boolean boolean37 = parseErrorList35.canAddError();
        org.jsoup.nodes.Document document38 = htmlTreeBuilder25.parse("EndTag", "hi!#", parseErrorList35);
        java.lang.String[] strArray46 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean47 = htmlTreeBuilder25.inScope("hi!#", strArray46);
        boolean boolean48 = htmlTreeBuilder8.inScope("hi!#", strArray46);
        htmlTreeBuilder0.popStackToClose(strArray46);
        org.jsoup.parser.ParseErrorList parseErrorList50 = htmlTreeBuilder0.errors;
        org.jsoup.parser.ParseErrorList parseErrorList54 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream55 = parseErrorList54.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor56 = parseErrorList54.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor57 = parseErrorList54.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList59 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int60 = parseErrorList59.getMaxSize();
        boolean boolean61 = parseErrorList54.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList59);
        org.jsoup.parser.ParseError[] parseErrorArray62 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList63 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList63, parseErrorArray62);
        org.jsoup.parser.ParseError[] parseErrorArray65 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList66 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList66, parseErrorArray65);
        boolean boolean68 = parseErrorList63.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList66);
        boolean boolean69 = parseErrorList54.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList63);
        int int70 = parseErrorList54.size();
        org.jsoup.parser.ParseError[] parseErrorArray71 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList72 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean73 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList72, parseErrorArray71);
        org.jsoup.parser.ParseError[] parseErrorArray74 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList75 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList75, parseErrorArray74);
        boolean boolean77 = parseErrorList72.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList75);
        int int78 = parseErrorList54.lastIndexOf((java.lang.Object) parseErrorList72);
        org.jsoup.nodes.Document document79 = htmlTreeBuilder0.parse("EOF", "", parseErrorList54);
        boolean boolean81 = htmlTreeBuilder0.inSelectScope("StartTaga");
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(document18);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertNotNull(parseErrorList29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(parseErrorList35);
        org.junit.Assert.assertNotNull(parseErrorStream36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document38);
        org.junit.Assert.assertNotNull(strArray46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(parseErrorList50);
        org.junit.Assert.assertNotNull(parseErrorList54);
        org.junit.Assert.assertNotNull(parseErrorStream55);
        org.junit.Assert.assertNotNull(parseErrorItor56);
        org.junit.Assert.assertNotNull(parseErrorItor57);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 0 + "'", int60 == 0);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertNotNull(parseErrorArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(parseErrorArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(parseErrorArray71);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(parseErrorArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
        org.junit.Assert.assertTrue("'" + int78 + "' != '" + (-1) + "'", int78 == (-1));
        org.junit.Assert.assertNotNull(document79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test2141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2141");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str3 = tokenQueue1.chompTo("Doctype");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        tokenQueue1.addFirst((java.lang.Character) 'a');
        tokenQueue1.addFirst("StartTag");
        java.lang.String str11 = tokenQueue1.consumeToIgnoreCase("a");
        java.lang.String str13 = tokenQueue1.chompToIgnoreCase("t");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "St" + "'", str11, "St");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ar" + "'", str13, "ar");
    }

    @Test
    public void test2142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2142");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Comment comment13 = new org.jsoup.parser.Token.Comment();
        java.lang.String str14 = comment13.toString();
        java.lang.StringBuilder stringBuilder15 = comment13.data;
        boolean boolean16 = comment13.isEndTag();
        java.lang.String str17 = comment13.toString();
        tokeniser6.commentPending = comment13;
        tokeniser6.createCommentPending();
        org.jsoup.parser.ITokeniserState iTokeniserState20 = tokeniser6.getState();
        tokeniser6.emitCommentPending();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "<!---->" + "'", str14, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder15);
        org.junit.Assert.assertEquals(stringBuilder15.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "<!---->" + "'", str17, "<!---->");
        org.junit.Assert.assertNotNull(iTokeniserState20);
    }

    @Test
    public void test2143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2143");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList7 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int8 = parseErrorList7.getMaxSize();
        boolean boolean9 = parseErrorList2.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList7);
        org.jsoup.parser.Tokeniser tokeniser10 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList7);
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList12.stream();
        boolean boolean14 = parseErrorList12.canAddError();
        boolean boolean15 = parseErrorList7.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList12);
        boolean boolean16 = parseErrorList7.canAddError();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList22 = new org.jsoup.parser.ParseErrorList(0, (int) (byte) 0);
        htmlTreeBuilder17.initialiseParse("<hi!>", "hi!#", parseErrorList22);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList22.listIterator();
        boolean boolean25 = parseErrorList7.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList22);
        org.jsoup.parser.ParseErrorList parseErrorList27 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream28 = parseErrorList27.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor29 = parseErrorList27.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor30 = parseErrorList27.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList32 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int33 = parseErrorList32.getMaxSize();
        boolean boolean34 = parseErrorList27.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList32);
        org.jsoup.parser.ParseError[] parseErrorArray35 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList36 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList36, parseErrorArray35);
        org.jsoup.parser.ParseError[] parseErrorArray38 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList39 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39, parseErrorArray38);
        boolean boolean41 = parseErrorList36.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList39);
        boolean boolean42 = parseErrorList27.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList36);
        boolean boolean43 = parseErrorList27.canAddError();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder44 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList49 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList51 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream52 = parseErrorList51.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor53 = parseErrorList51.iterator();
        boolean boolean54 = parseErrorList49.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList51);
        xmlTreeBuilder44.initialiseParse("<!---->", "hi!", parseErrorList49);
        org.jsoup.parser.ParseErrorList parseErrorList59 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document60 = xmlTreeBuilder44.parse("", "[]", parseErrorList59);
        org.jsoup.nodes.Document document61 = xmlTreeBuilder44.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder62 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.Token token63 = xmlTreeBuilder62.currentToken;
        org.jsoup.parser.Parser parser65 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser67 = parser65.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document70 = parser65.parseInput("Doctype", "[]");
        java.util.List<org.jsoup.nodes.Node> nodeList72 = org.jsoup.parser.Parser.parseFragment("", (org.jsoup.nodes.Element) document70, "<hi!>");
        org.jsoup.nodes.Element[] elementArray73 = new org.jsoup.nodes.Element[] { document70 };
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList74 = new org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element>();
        boolean boolean75 = java.util.Collections.addAll((java.util.Collection<org.jsoup.nodes.Element>) elementList74, elementArray73);
        xmlTreeBuilder62.stack = elementList74;
        org.jsoup.parser.Token.Character character78 = new org.jsoup.parser.Token.Character("-1: []");
        xmlTreeBuilder62.insert(character78);
        xmlTreeBuilder44.insert(character78);
        org.jsoup.parser.Token.Comment comment81 = new org.jsoup.parser.Token.Comment();
        xmlTreeBuilder44.insert(comment81);
        int int83 = parseErrorList27.indexOf((java.lang.Object) comment81);
        boolean boolean84 = parseErrorList7.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList27);
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNotNull(parseErrorList7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseErrorList27);
        org.junit.Assert.assertNotNull(parseErrorStream28);
        org.junit.Assert.assertNotNull(parseErrorItor29);
        org.junit.Assert.assertNotNull(parseErrorItor30);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 0 + "'", int33 == 0);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(parseErrorArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parseErrorArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(parseErrorList51);
        org.junit.Assert.assertNotNull(parseErrorStream52);
        org.junit.Assert.assertNotNull(parseErrorItor53);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertNotNull(parseErrorList59);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(document61);
        org.junit.Assert.assertNull(token63);
        org.junit.Assert.assertNotNull(parser65);
        org.junit.Assert.assertNotNull(parser67);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(nodeList72);
        org.junit.Assert.assertNotNull(elementArray73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + true + "'", boolean75 == true);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + (-1) + "'", int83 == (-1));
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
    }

    @Test
    public void test2144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2144");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("[]");
        boolean boolean3 = characterReader1.matchConsume("[100: ]");
        java.lang.String str4 = characterReader1.consumeHexSequence();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test2145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2145");
        java.util.List<org.jsoup.nodes.Node> nodeList2 = org.jsoup.parser.Parser.parseXmlFragment("10: ", "hi");
        org.junit.Assert.assertNotNull(nodeList2);
    }

    @Test
    public void test2146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2146");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream19 = parseErrorList18.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor20 = parseErrorList18.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor21 = parseErrorList18.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        boolean boolean25 = parseErrorList18.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23);
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList23);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList23.iterator();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder0.parse("[]", "Doctype", parseErrorList23);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream29 = parseErrorList23.parallelStream();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorStream19);
        org.junit.Assert.assertNotNull(parseErrorItor20);
        org.junit.Assert.assertNotNull(parseErrorItor21);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorStream29);
    }

    @Test
    public void test2147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2147");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        org.jsoup.nodes.Element element12 = htmlTreeBuilder0.pop();
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean15 = tokenQueue14.isEmpty();
        java.lang.String str17 = tokenQueue14.consumeToIgnoreCase("<hi!>");
        java.lang.String str18 = tokenQueue14.consumeTagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder19.parse("0: Doctype", "hi!", parseErrorList23);
        org.jsoup.parser.ParseErrorList parseErrorList29 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream30 = parseErrorList29.stream();
        boolean boolean31 = parseErrorList29.canAddError();
        org.jsoup.nodes.Document document32 = htmlTreeBuilder19.parse("EndTag", "hi!#", parseErrorList29);
        java.lang.String[] strArray40 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean41 = htmlTreeBuilder19.inScope("hi!#", strArray40);
        java.lang.String str42 = tokenQueue14.consumeToAny(strArray40);
        htmlTreeBuilder0.popStackToClose(strArray40);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(element12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EndTag" + "'", str17, "EndTag");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertNotNull(parseErrorList29);
        org.junit.Assert.assertNotNull(parseErrorStream30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(strArray40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test2148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2148");
        org.jsoup.parser.Token.Doctype doctype0 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype1 = doctype0.asDoctype();
        boolean boolean2 = doctype0.isEOF();
        java.lang.StringBuilder stringBuilder3 = doctype0.name;
        java.lang.StringBuilder stringBuilder4 = doctype0.publicIdentifier;
        java.lang.StringBuilder stringBuilder5 = doctype0.name;
        boolean boolean6 = doctype0.forceQuirks;
        org.junit.Assert.assertNotNull(doctype1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(stringBuilder3);
        org.junit.Assert.assertEquals(stringBuilder3.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder4);
        org.junit.Assert.assertEquals(stringBuilder4.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder5);
        org.junit.Assert.assertEquals(stringBuilder5.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test2149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2149");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor17 = parseErrorList16.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList16.iterator();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder0.parse("StartTag", "[100: ]", parseErrorList16);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getActiveFormattingElement("-1: []");
        org.jsoup.nodes.Element element23 = htmlTreeBuilder0.insert("Comment");
        htmlTreeBuilder0.baseUri = "<Doctype>";
        org.jsoup.parser.Tokeniser tokeniser26 = htmlTreeBuilder0.tokeniser;
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parseErrorItor17);
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(tokeniser26);
    }

    @Test
    public void test2150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2150");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        org.jsoup.nodes.Element element13 = htmlTreeBuilder0.getActiveFormattingElement("hi!#");
        org.jsoup.nodes.Document document14 = htmlTreeBuilder0.doc;
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNull(element13);
        org.junit.Assert.assertNotNull(document14);
    }

    @Test
    public void test2151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2151");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream11 = parseErrorList10.stream();
        boolean boolean12 = parseErrorList10.canAddError();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.parse("EndTag", "hi!#", parseErrorList10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int22 = parseErrorList21.getMaxSize();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder17.parse("0: Doctype", "hi!", parseErrorList21);
        boolean boolean24 = htmlTreeBuilder17.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder17.error(htmlTreeBuilderState25);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int32 = parseErrorList31.getMaxSize();
        org.jsoup.nodes.Document document33 = htmlTreeBuilder27.parse("0: Doctype", "hi!", parseErrorList31);
        org.jsoup.parser.ParseErrorList parseErrorList37 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream38 = parseErrorList37.stream();
        boolean boolean39 = parseErrorList37.canAddError();
        org.jsoup.nodes.Document document40 = htmlTreeBuilder27.parse("EndTag", "hi!#", parseErrorList37);
        java.lang.String[] strArray48 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean49 = htmlTreeBuilder27.inScope("hi!#", strArray48);
        boolean boolean50 = htmlTreeBuilder17.inScope(strArray48);
        boolean boolean51 = htmlTreeBuilder0.inScope("t", strArray48);
        org.jsoup.parser.Token.StartTag startTag53 = new org.jsoup.parser.Token.StartTag("10: ");
        htmlTreeBuilder0.currentToken = startTag53;
        htmlTreeBuilder0.generateImpliedEndTags("</hi![]>");
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parseErrorStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parseErrorList37);
        org.junit.Assert.assertNotNull(parseErrorStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2152");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        boolean boolean6 = parseErrorList1.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        java.lang.Object[] objArray7 = parseErrorList1.toArray();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder8 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int13 = parseErrorList12.getMaxSize();
        org.jsoup.nodes.Document document14 = htmlTreeBuilder8.parse("0: Doctype", "hi!", parseErrorList12);
        htmlTreeBuilder8.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray17 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList18 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList18, characterArray17);
        htmlTreeBuilder8.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList18);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder21 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int26 = parseErrorList25.getMaxSize();
        org.jsoup.nodes.Document document27 = htmlTreeBuilder21.parse("0: Doctype", "hi!", parseErrorList25);
        boolean boolean28 = htmlTreeBuilder21.framesetOk();
        org.jsoup.nodes.Document document31 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder21.setHeadElement((org.jsoup.nodes.Element) document31);
        org.jsoup.nodes.Element element33 = htmlTreeBuilder21.pop();
        htmlTreeBuilder8.push(element33);
        org.jsoup.parser.Token token35 = htmlTreeBuilder8.currentToken;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder36 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList40 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int41 = parseErrorList40.getMaxSize();
        org.jsoup.nodes.Document document42 = htmlTreeBuilder36.parse("0: Doctype", "hi!", parseErrorList40);
        htmlTreeBuilder36.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray45 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList46 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean47 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList46, characterArray45);
        htmlTreeBuilder36.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList46);
        boolean boolean49 = htmlTreeBuilder36.isFosterInserts();
        htmlTreeBuilder36.generateImpliedEndTags();
        org.jsoup.parser.ParseErrorList parseErrorList51 = htmlTreeBuilder36.errors;
        htmlTreeBuilder8.errors = parseErrorList51;
        boolean boolean53 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList51);
        org.jsoup.parser.Token.EndTag endTag57 = new org.jsoup.parser.Token.EndTag();
        char[] charArray60 = new char[] { '#', '#' };
        endTag57.appendAttributeValue(charArray60);
        endTag57.finaliseTag();
        boolean boolean63 = endTag57.isSelfClosing();
        org.jsoup.parser.Tag tag65 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean66 = tag65.isFormListed();
        org.jsoup.parser.Tag tag67 = tag65.setSelfClosing();
        boolean boolean68 = tag65.isKnownTag();
        java.lang.Object[] objArray70 = new java.lang.Object[] { boolean63, tag65, "Doctype" };
        org.jsoup.parser.ParseError parseError71 = new org.jsoup.parser.ParseError((int) (short) 0, "[]", objArray70);
        int int72 = parseError71.getPosition();
        // The following exception was thrown during execution in test generation
        try {
            org.jsoup.parser.ParseError parseError73 = parseErrorList1.set((int) '#', parseError71);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Index: 35, Size: 0");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(objArray7);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray7), "[]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray7), "[]");
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(document14);
        org.junit.Assert.assertNotNull(characterArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(parseErrorList25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(document27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(document31);
        org.junit.Assert.assertNotNull(element33);
        org.junit.Assert.assertNotNull(token35);
        org.junit.Assert.assertNotNull(parseErrorList40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(characterArray45);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(parseErrorList51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(charArray60);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray60), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray60), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray60), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(tag65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(tag67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(objArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.deepToString(objArray70), "[false, hi!, Doctype]");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(objArray70), "[false, hi!, Doctype]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
    }

    @Test
    public void test2153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2153");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        // The following exception was thrown during execution in test generation
        try {
            tokeniser6.emitDoctypePending();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
    }

    @Test
    public void test2154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2154");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int18 = parseErrorList17.getMaxSize();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder13.parse("0: Doctype", "hi!", parseErrorList17);
        boolean boolean20 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder13.error(htmlTreeBuilderState21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = null;
        htmlTreeBuilder13.transition(htmlTreeBuilderState23);
        htmlTreeBuilder13.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList27 = htmlTreeBuilder13.getPendingTableCharacters();
        htmlTreeBuilder0.setPendingTableCharacters(characterList27);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int34 = parseErrorList33.getMaxSize();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder29.parse("0: Doctype", "hi!", parseErrorList33);
        htmlTreeBuilder29.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray38 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList39 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList39, characterArray38);
        htmlTreeBuilder29.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList39);
        boolean boolean42 = htmlTreeBuilder29.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag44 = new org.jsoup.parser.Token.StartTag("[100: ]");
        org.jsoup.nodes.FormElement formElement46 = htmlTreeBuilder29.insertForm(startTag44, true);
        htmlTreeBuilder29.baseUri = "[]";
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState49 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        htmlTreeBuilder29.error(htmlTreeBuilderState49);
        htmlTreeBuilder0.error(htmlTreeBuilderState49);
        org.jsoup.parser.ParseErrorList parseErrorList52 = htmlTreeBuilder0.errors;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState53 = htmlTreeBuilder0.originalState();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder54 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList58 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int59 = parseErrorList58.getMaxSize();
        org.jsoup.nodes.Document document60 = htmlTreeBuilder54.parse("0: Doctype", "hi!", parseErrorList58);
        org.jsoup.parser.ParseErrorList parseErrorList64 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream65 = parseErrorList64.stream();
        boolean boolean66 = parseErrorList64.canAddError();
        org.jsoup.nodes.Document document67 = htmlTreeBuilder54.parse("EndTag", "hi!#", parseErrorList64);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState68 = null;
        htmlTreeBuilder54.transition(htmlTreeBuilderState68);
        org.jsoup.nodes.Document document70 = htmlTreeBuilder54.doc;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder71 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList75 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int76 = parseErrorList75.getMaxSize();
        org.jsoup.nodes.Document document77 = htmlTreeBuilder71.parse("0: Doctype", "hi!", parseErrorList75);
        boolean boolean78 = htmlTreeBuilder71.framesetOk();
        org.jsoup.nodes.Document document81 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder71.setHeadElement((org.jsoup.nodes.Element) document81);
        org.jsoup.nodes.Document document85 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder71.setHeadElement((org.jsoup.nodes.Element) document85);
        htmlTreeBuilder71.clearStackToTableRowContext();
        java.util.List<org.jsoup.parser.Token.Character> characterList88 = htmlTreeBuilder71.getPendingTableCharacters();
        htmlTreeBuilder54.setPendingTableCharacters(characterList88);
        htmlTreeBuilder0.setPendingTableCharacters(characterList88);
        htmlTreeBuilder0.clearStackToTableRowContext();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNotNull(characterList27);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(characterArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(formElement46);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState49);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertNull(htmlTreeBuilderState53);
        org.junit.Assert.assertNotNull(parseErrorList58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 0 + "'", int59 == 0);
        org.junit.Assert.assertNotNull(document60);
        org.junit.Assert.assertNotNull(parseErrorList64);
        org.junit.Assert.assertNotNull(parseErrorStream65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(document67);
        org.junit.Assert.assertNotNull(document70);
        org.junit.Assert.assertNotNull(parseErrorList75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertNotNull(document81);
        org.junit.Assert.assertNotNull(document85);
        org.junit.Assert.assertNotNull(characterList88);
    }

    @Test
    public void test2155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2155");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        java.lang.String str5 = tokenQueue1.consumeTagName();
        boolean boolean6 = tokenQueue1.matchesWord();
        boolean boolean8 = tokenQueue1.matchesCS("StartTag");
        org.jsoup.parser.TokenQueue tokenQueue10 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str12 = tokenQueue10.chompTo("Doctype");
        java.lang.String str13 = tokenQueue10.consumeWord();
        boolean boolean14 = tokenQueue10.matchesStartTag();
        org.jsoup.parser.Token.EndTag endTag15 = new org.jsoup.parser.Token.EndTag();
        char[] charArray18 = new char[] { '#', '#' };
        endTag15.appendAttributeValue(charArray18);
        boolean boolean20 = tokenQueue10.matchesAny(charArray18);
        boolean boolean21 = tokenQueue1.matchesAny(charArray18);
        java.lang.String str23 = tokenQueue1.chompToIgnoreCase("0: []");
        char char24 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "EndTag" + "'", str12, "EndTag");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(charArray18);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray18), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray18), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray18), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + char24 + "' != '" + '\000' + "'", char24 == '\000');
    }

    @Test
    public void test2156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2156");
        org.jsoup.parser.ParseError[] parseErrorArray0 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList1 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList1, parseErrorArray0);
        org.jsoup.parser.ParseError[] parseErrorArray3 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList4 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean5 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4, parseErrorArray3);
        boolean boolean6 = parseErrorList1.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList4);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList4.listIterator();
        int int9 = parseErrorList4.lastIndexOf((java.lang.Object) 1.0d);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor10 = parseErrorList4.iterator();
        boolean boolean11 = parseErrorList4.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<org.jsoup.parser.ParseError> parseErrorList14 = parseErrorList4.subList(100, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: toIndex = 8");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(parseErrorArray3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(parseErrorItor7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(parseErrorItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test2157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2157");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        tokeniser6.createCommentPending();
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser6.doctypePending;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState13 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype14 = new org.jsoup.parser.Token.Doctype();
        boolean boolean15 = doctype14.isCharacter();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder16 = null;
        boolean boolean17 = htmlTreeBuilderState13.process((org.jsoup.parser.Token) doctype14, htmlTreeBuilder16);
        tokeniser6.doctypePending = doctype14;
        java.lang.String str19 = doctype14.getSystemIdentifier();
        java.lang.String str20 = doctype14.getName();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test2158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2158");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        java.lang.String str7 = tokenQueue1.chompToIgnoreCase("<0: Doctype>");
        boolean boolean8 = tokenQueue1.matchesStartTag();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test2159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2159");
        org.jsoup.parser.Tag tag1 = org.jsoup.parser.Tag.valueOf("hi!");
        boolean boolean2 = tag1.isFormListed();
        org.jsoup.parser.Tag tag3 = tag1.setSelfClosing();
        boolean boolean4 = tag3.preserveWhitespace();
        java.lang.Object obj5 = null;
        boolean boolean6 = tag3.equals(obj5);
        boolean boolean7 = tag3.preserveWhitespace();
        boolean boolean8 = tag3.isSelfClosing();
        boolean boolean9 = tag3.canContainBlock();
        boolean boolean10 = tag3.isInline();
        boolean boolean11 = tag3.isEmpty();
        org.junit.Assert.assertNotNull(tag1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(tag3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test2160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2160");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        org.jsoup.parser.CharacterReader characterReader16 = null;
        org.jsoup.parser.ParseErrorList parseErrorList18 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream19 = parseErrorList18.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor20 = parseErrorList18.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor21 = parseErrorList18.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        boolean boolean25 = parseErrorList18.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23);
        org.jsoup.parser.Tokeniser tokeniser26 = new org.jsoup.parser.Tokeniser(characterReader16, parseErrorList23);
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList23.iterator();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder0.parse("[]", "Doctype", parseErrorList23);
        org.jsoup.parser.CharacterReader characterReader31 = null;
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream34 = parseErrorList33.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor35 = parseErrorList33.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList33.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList38 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int39 = parseErrorList38.getMaxSize();
        boolean boolean40 = parseErrorList33.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList38);
        org.jsoup.parser.Tokeniser tokeniser41 = new org.jsoup.parser.Tokeniser(characterReader31, parseErrorList38);
        org.jsoup.parser.ParseErrorList parseErrorList43 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream44 = parseErrorList43.stream();
        boolean boolean45 = parseErrorList43.canAddError();
        boolean boolean46 = parseErrorList38.removeAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList43);
        org.jsoup.nodes.Document document47 = htmlTreeBuilder0.parse("hi!", "<!---->", parseErrorList43);
        org.jsoup.parser.Tokeniser tokeniser48 = htmlTreeBuilder0.tokeniser;
        org.jsoup.parser.Parser parser49 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser51 = parser49.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document54 = parser49.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document57 = parser49.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document57);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder59 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList63 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int64 = parseErrorList63.getMaxSize();
        org.jsoup.nodes.Document document65 = htmlTreeBuilder59.parse("0: Doctype", "hi!", parseErrorList63);
        boolean boolean66 = htmlTreeBuilder59.framesetOk();
        org.jsoup.nodes.Document document69 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder59.setHeadElement((org.jsoup.nodes.Element) document69);
        org.jsoup.nodes.Document document73 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder59.setHeadElement((org.jsoup.nodes.Element) document73);
        boolean boolean75 = htmlTreeBuilder0.onStack((org.jsoup.nodes.Element) document73);
        boolean boolean76 = htmlTreeBuilder0.framesetOk();
        java.lang.String str77 = htmlTreeBuilder0.getBaseUri();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parseErrorList18);
        org.junit.Assert.assertNotNull(parseErrorStream19);
        org.junit.Assert.assertNotNull(parseErrorItor20);
        org.junit.Assert.assertNotNull(parseErrorItor21);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertNotNull(parseErrorStream34);
        org.junit.Assert.assertNotNull(parseErrorItor35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorList38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(parseErrorList43);
        org.junit.Assert.assertNotNull(parseErrorStream44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(document47);
        org.junit.Assert.assertNotNull(tokeniser48);
        org.junit.Assert.assertNotNull(parser49);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertNotNull(document57);
        org.junit.Assert.assertNotNull(parseErrorList63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 0 + "'", int64 == 0);
        org.junit.Assert.assertNotNull(document65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(document69);
        org.junit.Assert.assertNotNull(document73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertEquals("'" + str77 + "' != '" + "<!---->" + "'", str77, "<!---->");
    }

    @Test
    public void test2161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2161");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        org.jsoup.parser.Parser parser12 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.nodes.Document document15 = parser12.parseInput("", "hi!");
        htmlTreeBuilder0.maybeSetBaseUri((org.jsoup.nodes.Element) document15);
        org.jsoup.parser.Token token17 = null;
        htmlTreeBuilder0.currentToken = token17;
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder19 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int24 = parseErrorList23.getMaxSize();
        org.jsoup.nodes.Document document25 = htmlTreeBuilder19.parse("0: Doctype", "hi!", parseErrorList23);
        boolean boolean26 = htmlTreeBuilder19.framesetOk();
        org.jsoup.parser.Parser parser27 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser29 = parser27.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document32 = parser27.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document35 = parser27.parseInput("<hi!>", "[]");
        htmlTreeBuilder19.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document35);
        java.lang.String[] strArray37 = new java.lang.String[] {};
        boolean boolean38 = htmlTreeBuilder19.inScope(strArray37);
        htmlTreeBuilder19.markInsertionMode();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder40 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList44 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int45 = parseErrorList44.getMaxSize();
        org.jsoup.nodes.Document document46 = htmlTreeBuilder40.parse("0: Doctype", "hi!", parseErrorList44);
        htmlTreeBuilder19.setHeadElement((org.jsoup.nodes.Element) document46);
        org.jsoup.parser.CharacterReader characterReader48 = null;
        org.jsoup.parser.ParseErrorList parseErrorList50 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream51 = parseErrorList50.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor52 = parseErrorList50.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor53 = parseErrorList50.iterator();
        org.jsoup.parser.Tokeniser tokeniser54 = new org.jsoup.parser.Tokeniser(characterReader48, parseErrorList50);
        org.jsoup.parser.Token.Tag tag55 = tokeniser54.tagPending;
        org.jsoup.parser.Token.Tag tag57 = tokeniser54.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype58 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype59 = doctype58.asDoctype();
        java.lang.String str60 = doctype58.tokenType();
        tokeniser54.emit((org.jsoup.parser.Token) doctype58);
        org.jsoup.parser.ITokeniserState iTokeniserState62 = tokeniser54.getState();
        org.jsoup.parser.Token.Comment comment63 = new org.jsoup.parser.Token.Comment();
        java.lang.String str64 = comment63.toString();
        java.lang.StringBuilder stringBuilder65 = comment63.data;
        boolean boolean66 = comment63.isEndTag();
        boolean boolean67 = comment63.isComment();
        tokeniser54.commentPending = comment63;
        htmlTreeBuilder19.insert(comment63);
        java.lang.String str70 = comment63.getData();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder71 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList75 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int76 = parseErrorList75.getMaxSize();
        org.jsoup.nodes.Document document77 = htmlTreeBuilder71.parse("0: Doctype", "hi!", parseErrorList75);
        htmlTreeBuilder71.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray80 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList81 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean82 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList81, characterArray80);
        htmlTreeBuilder71.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList81);
        boolean boolean84 = htmlTreeBuilder71.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag86 = new org.jsoup.parser.Token.StartTag("[100: ]");
        org.jsoup.nodes.FormElement formElement88 = htmlTreeBuilder71.insertForm(startTag86, true);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState89 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        htmlTreeBuilder71.error(htmlTreeBuilderState89);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean91 = htmlTreeBuilder0.process((org.jsoup.parser.Token) comment63, htmlTreeBuilderState89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(parser12);
        org.junit.Assert.assertNotNull(document15);
        org.junit.Assert.assertNotNull(parseErrorList23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertNotNull(document25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(parser27);
        org.junit.Assert.assertNotNull(parser29);
        org.junit.Assert.assertNotNull(document32);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertNotNull(strArray37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(document46);
        org.junit.Assert.assertNotNull(parseErrorList50);
        org.junit.Assert.assertNotNull(parseErrorStream51);
        org.junit.Assert.assertNotNull(parseErrorItor52);
        org.junit.Assert.assertNotNull(parseErrorItor53);
        org.junit.Assert.assertNull(tag55);
        org.junit.Assert.assertNotNull(tag57);
        org.junit.Assert.assertNotNull(doctype59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "Doctype" + "'", str60, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState62);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "<!---->" + "'", str64, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder65);
        org.junit.Assert.assertEquals(stringBuilder65.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "" + "'", str70, "");
        org.junit.Assert.assertNotNull(parseErrorList75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 0 + "'", int76 == 0);
        org.junit.Assert.assertNotNull(document77);
        org.junit.Assert.assertNotNull(characterArray80);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(formElement88);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState89);
    }

    @Test
    public void test2162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2162");
        java.lang.String str2 = org.jsoup.parser.Parser.unescapeEntities("hi", true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "hi" + "'", str2, "hi");
    }

    @Test
    public void test2163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2163");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader1.advance();
        characterReader1.advance();
        org.jsoup.parser.CharacterReader characterReader5 = new org.jsoup.parser.CharacterReader("StartTag");
        int int7 = characterReader5.nextIndexOf((java.lang.CharSequence) "[]");
        org.jsoup.parser.Token.StartTag startTag9 = new org.jsoup.parser.Token.StartTag("Doctype");
        boolean boolean10 = startTag9.isDoctype();
        org.jsoup.parser.CharacterReader characterReader11 = null;
        org.jsoup.parser.ParseErrorList parseErrorList13 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream14 = parseErrorList13.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor15 = parseErrorList13.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor16 = parseErrorList13.iterator();
        org.jsoup.parser.Tokeniser tokeniser17 = new org.jsoup.parser.Tokeniser(characterReader11, parseErrorList13);
        org.jsoup.parser.Token.Tag tag18 = tokeniser17.tagPending;
        tokeniser17.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag22 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType23 = startTag22.type;
        startTag22.appendTagName('#');
        tokeniser17.tagPending = startTag22;
        org.jsoup.parser.TokeniserState tokeniserState27 = org.jsoup.parser.TokeniserState.CommentEnd;
        tokeniser17.transition((org.jsoup.parser.ITokeniserState) tokeniserState27);
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        boolean boolean30 = doctype29.isCharacter();
        tokeniser17.doctypePending = doctype29;
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState32 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.Doctype doctype33 = new org.jsoup.parser.Token.Doctype();
        boolean boolean34 = doctype33.isCharacter();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder35 = null;
        boolean boolean36 = htmlTreeBuilderState32.process((org.jsoup.parser.Token) doctype33, htmlTreeBuilder35);
        java.lang.StringBuilder stringBuilder37 = doctype33.name;
        tokeniser17.dataBuffer = stringBuilder37;
        org.jsoup.parser.Token.EndTag endTag39 = new org.jsoup.parser.Token.EndTag();
        char[] charArray42 = new char[] { '#', '#' };
        endTag39.appendAttributeValue(charArray42);
        endTag39.appendAttributeValue(' ');
        char[] charArray47 = new char[] { '4' };
        endTag39.appendAttributeValue(charArray47);
        tokeniser17.emit(charArray47);
        startTag9.appendAttributeValue(charArray47);
        java.lang.String str51 = characterReader5.consumeToAny(charArray47);
        java.lang.String str52 = characterReader1.consumeToAny(charArray47);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(parseErrorList13);
        org.junit.Assert.assertNotNull(parseErrorStream14);
        org.junit.Assert.assertNotNull(parseErrorItor15);
        org.junit.Assert.assertNotNull(parseErrorItor16);
        org.junit.Assert.assertNull(tag18);
        org.junit.Assert.assertTrue("'" + tokenType23 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType23.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertNotNull(tokeniserState27);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(stringBuilder37);
        org.junit.Assert.assertEquals(stringBuilder37.toString(), "");
        org.junit.Assert.assertNotNull(charArray42);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray42), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray42), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray42), "[#, #]");
        org.junit.Assert.assertNotNull(charArray47);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray47), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray47), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray47), "[4]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "StartTag" + "'", str51, "StartTag");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "artTag" + "'", str52, "artTag");
    }

    @Test
    public void test2164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2164");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("hi!");
        char char2 = tokenQueue1.peek();
        tokenQueue1.addFirst("EOF");
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + 'h' + "'", char2 == 'h');
    }

    @Test
    public void test2165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2165");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.nodes.Document document10 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder0.setHeadElement((org.jsoup.nodes.Element) document10);
        htmlTreeBuilder0.newPendingTableCharacters();
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor17 = parseErrorList16.listIterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList16.iterator();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder0.parse("StartTag", "[100: ]", parseErrorList16);
        org.jsoup.nodes.Element element21 = htmlTreeBuilder0.getActiveFormattingElement("-1: []");
        org.jsoup.nodes.Element element23 = htmlTreeBuilder0.insert("Comment");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int29 = parseErrorList28.getMaxSize();
        org.jsoup.nodes.Document document30 = htmlTreeBuilder24.parse("0: Doctype", "hi!", parseErrorList28);
        boolean boolean31 = htmlTreeBuilder24.framesetOk();
        org.jsoup.nodes.Document document34 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder24.setHeadElement((org.jsoup.nodes.Element) document34);
        htmlTreeBuilder24.generateImpliedEndTags();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder37 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList41 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int42 = parseErrorList41.getMaxSize();
        org.jsoup.nodes.Document document43 = htmlTreeBuilder37.parse("0: Doctype", "hi!", parseErrorList41);
        boolean boolean44 = htmlTreeBuilder37.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState45 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder37.error(htmlTreeBuilderState45);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState47 = null;
        htmlTreeBuilder37.transition(htmlTreeBuilderState47);
        htmlTreeBuilder37.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList51 = htmlTreeBuilder37.getPendingTableCharacters();
        htmlTreeBuilder24.setPendingTableCharacters(characterList51);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder53 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList57 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int58 = parseErrorList57.getMaxSize();
        org.jsoup.nodes.Document document59 = htmlTreeBuilder53.parse("0: Doctype", "hi!", parseErrorList57);
        htmlTreeBuilder53.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray62 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList63 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean64 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList63, characterArray62);
        htmlTreeBuilder53.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList63);
        boolean boolean66 = htmlTreeBuilder53.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag68 = new org.jsoup.parser.Token.StartTag("[100: ]");
        org.jsoup.nodes.FormElement formElement70 = htmlTreeBuilder53.insertForm(startTag68, true);
        htmlTreeBuilder53.baseUri = "[]";
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState73 = org.jsoup.parser.HtmlTreeBuilderState.InTableText;
        htmlTreeBuilder53.error(htmlTreeBuilderState73);
        htmlTreeBuilder24.error(htmlTreeBuilderState73);
        htmlTreeBuilder0.error(htmlTreeBuilderState73);
        org.jsoup.parser.ParseErrorList parseErrorList77 = htmlTreeBuilder0.errors;
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator78 = parseErrorList77.spliterator();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(document10);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parseErrorItor17);
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNull(element21);
        org.junit.Assert.assertNotNull(element23);
        org.junit.Assert.assertNotNull(parseErrorList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(document34);
        org.junit.Assert.assertNotNull(parseErrorList41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(document43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState45);
        org.junit.Assert.assertNotNull(characterList51);
        org.junit.Assert.assertNotNull(parseErrorList57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertNotNull(characterArray62);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(formElement70);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState73);
        org.junit.Assert.assertNotNull(parseErrorList77);
        org.junit.Assert.assertNotNull(parseErrorSpliterator78);
    }

    @Test
    public void test2166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2166");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState8 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder0.error(htmlTreeBuilderState8);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState10 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState10);
        htmlTreeBuilder0.popStackToClose("hi!");
        java.util.List<org.jsoup.parser.Token.Character> characterList14 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.parser.CharacterReader characterReader16 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean18 = characterReader16.matches("[100: ]");
        htmlTreeBuilder0.reader = characterReader16;
        characterReader16.unconsume();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = characterReader16.matches("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState8);
        org.junit.Assert.assertNotNull(characterList14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2167");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream27 = parseErrorList26.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList26.iterator();
        boolean boolean29 = parseErrorList24.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        xmlTreeBuilder19.initialiseParse("<!---->", "hi!", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder19.parse("", "[]", parseErrorList34);
        boolean boolean36 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document35);
        boolean boolean37 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.CharacterReader characterReader38 = null;
        org.jsoup.parser.ParseErrorList parseErrorList40 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream41 = parseErrorList40.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor42 = parseErrorList40.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor43 = parseErrorList40.iterator();
        org.jsoup.parser.Tokeniser tokeniser44 = new org.jsoup.parser.Tokeniser(characterReader38, parseErrorList40);
        org.jsoup.parser.Token.Tag tag45 = tokeniser44.tagPending;
        org.jsoup.parser.Token.Tag tag47 = tokeniser44.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype48 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype49 = doctype48.asDoctype();
        java.lang.String str50 = doctype48.tokenType();
        tokeniser44.emit((org.jsoup.parser.Token) doctype48);
        org.jsoup.parser.ITokeniserState iTokeniserState52 = tokeniser44.getState();
        org.jsoup.parser.Token token53 = tokeniser44.read();
        htmlTreeBuilder0.tokeniser = tokeniser44;
        htmlTreeBuilder0.clearStackToTableBodyContext();
        java.lang.String str56 = htmlTreeBuilder0.getBaseUri();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parseErrorStream27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(parseErrorList40);
        org.junit.Assert.assertNotNull(parseErrorStream41);
        org.junit.Assert.assertNotNull(parseErrorItor42);
        org.junit.Assert.assertNotNull(parseErrorItor43);
        org.junit.Assert.assertNull(tag45);
        org.junit.Assert.assertNotNull(tag47);
        org.junit.Assert.assertNotNull(doctype49);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Doctype" + "'", str50, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState52);
        org.junit.Assert.assertNotNull(token53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "hi!" + "'", str56, "hi!");
    }

    @Test
    public void test2168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2168");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        java.lang.String str4 = tokenQueue1.consumeToIgnoreCase("<hi!>");
        java.lang.String str5 = tokenQueue1.consumeTagName();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int11 = parseErrorList10.getMaxSize();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder6.parse("0: Doctype", "hi!", parseErrorList10);
        org.jsoup.parser.ParseErrorList parseErrorList16 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream17 = parseErrorList16.stream();
        boolean boolean18 = parseErrorList16.canAddError();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder6.parse("EndTag", "hi!#", parseErrorList16);
        java.lang.String[] strArray27 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean28 = htmlTreeBuilder6.inScope("hi!#", strArray27);
        java.lang.String str29 = tokenQueue1.consumeToAny(strArray27);
        java.lang.String str31 = tokenQueue1.consumeToIgnoreCase("artTag");
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.xmlParser();
        org.jsoup.parser.Parser parser34 = parser32.setTrackErrors((int) (byte) -1);
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder35 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.nodes.Document document36 = xmlTreeBuilder35.doc;
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder37 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList42 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList44 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream45 = parseErrorList44.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor46 = parseErrorList44.iterator();
        boolean boolean47 = parseErrorList42.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList44);
        xmlTreeBuilder37.initialiseParse("<!---->", "hi!", parseErrorList42);
        xmlTreeBuilder35.errors = parseErrorList42;
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList50 = xmlTreeBuilder35.stack;
        org.jsoup.parser.Parser parser51 = parser34.setTreeBuilder((org.jsoup.parser.TreeBuilder) xmlTreeBuilder35);
        org.jsoup.parser.ParseErrorList parseErrorList53 = org.jsoup.parser.ParseErrorList.tracking(0);
        xmlTreeBuilder35.errors = parseErrorList53;
        org.jsoup.parser.Token.StartTag startTag55 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes56 = startTag55.getAttributes();
        xmlTreeBuilder35.currentToken = startTag55;
        org.jsoup.parser.Token.EndTag endTag58 = new org.jsoup.parser.Token.EndTag();
        char[] charArray61 = new char[] { '#', '#' };
        endTag58.appendAttributeValue(charArray61);
        endTag58.appendAttributeValue(' ');
        char[] charArray66 = new char[] { '4' };
        endTag58.appendAttributeValue(charArray66);
        startTag55.appendAttributeValue(charArray66);
        boolean boolean69 = tokenQueue1.matchesAny(charArray66);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertNotNull(parseErrorList16);
        org.junit.Assert.assertNotNull(parseErrorStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(strArray27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNull(document36);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parseErrorStream45);
        org.junit.Assert.assertNotNull(parseErrorItor46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(elementList50);
        org.junit.Assert.assertNotNull(parser51);
        org.junit.Assert.assertNotNull(parseErrorList53);
        org.junit.Assert.assertNotNull(attributes56);
        org.junit.Assert.assertNotNull(charArray61);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray61), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray61), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray61), "[#, #]");
        org.junit.Assert.assertNotNull(charArray66);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray66), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray66), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray66), "[4]");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }

    @Test
    public void test2169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2169");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.StartTag startTag11 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType12 = startTag11.type;
        startTag11.appendTagName('#');
        tokeniser6.tagPending = startTag11;
        org.jsoup.parser.Token.StartTag startTag17 = new org.jsoup.parser.Token.StartTag("hi!");
        org.jsoup.parser.Token.TokenType tokenType18 = startTag17.type;
        java.lang.String str19 = startTag17.toString();
        tokeniser6.emit((org.jsoup.parser.Token) startTag17);
        java.lang.String str21 = startTag17.name();
        boolean boolean22 = startTag17.isEOF();
        org.jsoup.parser.Token.StartTag startTag23 = startTag17.asStartTag();
        org.jsoup.parser.CharacterReader characterReader25 = new org.jsoup.parser.CharacterReader("StartTag");
        characterReader25.advance();
        characterReader25.mark();
        characterReader25.rewindToMark();
        java.lang.String str29 = characterReader25.consumeHexSequence();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder30 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int35 = parseErrorList34.getMaxSize();
        org.jsoup.nodes.Document document36 = htmlTreeBuilder30.parse("0: Doctype", "hi!", parseErrorList34);
        boolean boolean37 = htmlTreeBuilder30.framesetOk();
        org.jsoup.nodes.Document document40 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder30.setHeadElement((org.jsoup.nodes.Element) document40);
        org.jsoup.nodes.Document document44 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder30.setHeadElement((org.jsoup.nodes.Element) document44);
        htmlTreeBuilder30.setFosterInserts(false);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder48 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList52 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int53 = parseErrorList52.getMaxSize();
        org.jsoup.nodes.Document document54 = htmlTreeBuilder48.parse("0: Doctype", "hi!", parseErrorList52);
        boolean boolean55 = htmlTreeBuilder48.framesetOk();
        org.jsoup.nodes.Document document58 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("", "");
        htmlTreeBuilder48.setHeadElement((org.jsoup.nodes.Element) document58);
        org.jsoup.nodes.Document document62 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder48.setHeadElement((org.jsoup.nodes.Element) document62);
        htmlTreeBuilder30.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document62);
        org.jsoup.parser.CharacterReader characterReader65 = htmlTreeBuilder30.reader;
        org.jsoup.parser.TokenQueue tokenQueue67 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean68 = tokenQueue67.isEmpty();
        boolean boolean69 = tokenQueue67.consumeWhitespace();
        java.lang.String str70 = tokenQueue67.consumeWord();
        char char71 = tokenQueue67.peek();
        org.jsoup.parser.CharacterReader characterReader72 = null;
        org.jsoup.parser.ParseErrorList parseErrorList74 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream75 = parseErrorList74.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor76 = parseErrorList74.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor77 = parseErrorList74.iterator();
        org.jsoup.parser.Tokeniser tokeniser78 = new org.jsoup.parser.Tokeniser(characterReader72, parseErrorList74);
        org.jsoup.parser.Token.Tag tag79 = tokeniser78.tagPending;
        org.jsoup.parser.Token.Tag tag81 = tokeniser78.createTagPending(true);
        java.lang.StringBuilder stringBuilder82 = tokeniser78.dataBuffer;
        org.jsoup.parser.Token.EndTag endTag83 = new org.jsoup.parser.Token.EndTag();
        char[] charArray86 = new char[] { '#', '#' };
        endTag83.appendAttributeValue(charArray86);
        tokeniser78.emit(charArray86);
        boolean boolean89 = tokenQueue67.matchesAny(charArray86);
        java.lang.String str90 = characterReader65.consumeToAny(charArray86);
        java.lang.String str91 = characterReader25.consumeToAny(charArray86);
        startTag23.appendAttributeValue(charArray86);
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertTrue("'" + tokenType12 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType12.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertTrue("'" + tokenType18 + "' != '" + org.jsoup.parser.Token.TokenType.StartTag + "'", tokenType18.equals(org.jsoup.parser.Token.TokenType.StartTag));
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "<hi!>" + "'", str19, "<hi!>");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi!" + "'", str21, "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(startTag23);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(document36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(document44);
        org.junit.Assert.assertNotNull(parseErrorList52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(document54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNotNull(document58);
        org.junit.Assert.assertNotNull(document62);
        org.junit.Assert.assertNotNull(characterReader65);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "EndTag" + "'", str70, "EndTag");
        org.junit.Assert.assertTrue("'" + char71 + "' != '" + '\000' + "'", char71 == '\000');
        org.junit.Assert.assertNotNull(parseErrorList74);
        org.junit.Assert.assertNotNull(parseErrorStream75);
        org.junit.Assert.assertNotNull(parseErrorItor76);
        org.junit.Assert.assertNotNull(parseErrorItor77);
        org.junit.Assert.assertNull(tag79);
        org.junit.Assert.assertNotNull(tag81);
        org.junit.Assert.assertNull(stringBuilder82);
        org.junit.Assert.assertNotNull(charArray86);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray86), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray86), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray86), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + false + "'", boolean89 == false);
        org.junit.Assert.assertEquals("'" + str90 + "' != '" + "" + "'", str90, "");
        org.junit.Assert.assertEquals("'" + str91 + "' != '" + "tartTag" + "'", str91, "tartTag");
    }

    @Test
    public void test2170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2170");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str3 = tokenQueue1.chompTo("Doctype");
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        char char6 = tokenQueue1.peek();
        java.lang.String str7 = tokenQueue1.consumeElementSelector();
        char char8 = tokenQueue1.peek();
        tokenQueue1.addFirst((java.lang.Character) 'E');
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "EndTag" + "'", str3, "EndTag");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + char6 + "' != '" + '\000' + "'", char6 == '\000');
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\000' + "'", char8 == '\000');
    }

    @Test
    public void test2171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2171");
        org.jsoup.parser.ParseError parseError2 = new org.jsoup.parser.ParseError((-1), "S");
    }

    @Test
    public void test2172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2172");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("<!---->");
        char char2 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + char2 + "' != '" + '<' + "'", char2 == '<');
    }

    @Test
    public void test2173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2173");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\uffff');
        boolean boolean5 = characterReader1.containsIgnoreCase("0: []");
        boolean boolean6 = characterReader1.matchesDigit();
        characterReader1.rewindToMark();
        org.jsoup.parser.Token.Comment comment8 = new org.jsoup.parser.Token.Comment();
        java.lang.String str9 = comment8.toString();
        java.lang.StringBuilder stringBuilder10 = comment8.data;
        comment8.bogus = true;
        java.lang.StringBuilder stringBuilder13 = comment8.data;
        // The following exception was thrown during execution in test generation
        try {
            int int14 = characterReader1.nextIndexOf((java.lang.CharSequence) stringBuilder13);
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: String index out of range: 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "<!---->" + "'", str9, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder10);
        org.junit.Assert.assertEquals(stringBuilder10.toString(), "");
        org.junit.Assert.assertNotNull(stringBuilder13);
        org.junit.Assert.assertEquals(stringBuilder13.toString(), "");
    }

    @Test
    public void test2174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2174");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        boolean boolean7 = tokeniser6.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream12 = parseErrorList11.stream();
        boolean boolean13 = parseErrorList11.canAddError();
        org.jsoup.parser.ParseError parseError16 = new org.jsoup.parser.ParseError((int) (byte) 100, "");
        java.lang.String str17 = parseError16.getErrorMessage();
        boolean boolean18 = parseErrorList11.add(parseError16);
        org.jsoup.parser.CharacterReader characterReader19 = null;
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream22 = parseErrorList21.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor23 = parseErrorList21.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor24 = parseErrorList21.iterator();
        org.jsoup.parser.Tokeniser tokeniser25 = new org.jsoup.parser.Tokeniser(characterReader19, parseErrorList21);
        org.jsoup.parser.Token.Tag tag26 = tokeniser25.tagPending;
        org.jsoup.parser.Token.Tag tag28 = tokeniser25.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype29 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype30 = doctype29.asDoctype();
        java.lang.String str31 = doctype29.tokenType();
        tokeniser25.emit((org.jsoup.parser.Token) doctype29);
        org.jsoup.parser.ITokeniserState iTokeniserState33 = tokeniser25.getState();
        org.jsoup.parser.Token.Comment comment34 = new org.jsoup.parser.Token.Comment();
        java.lang.String str35 = comment34.toString();
        java.lang.StringBuilder stringBuilder36 = comment34.data;
        boolean boolean37 = comment34.isEndTag();
        boolean boolean38 = comment34.isComment();
        tokeniser25.commentPending = comment34;
        int int40 = parseErrorList11.lastIndexOf((java.lang.Object) comment34);
        tokeniser6.commentPending = comment34;
        boolean boolean42 = comment34.bogus;
        comment34.bogus = false;
        java.lang.String str45 = comment34.toString();
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertNotNull(parseErrorStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertNotNull(parseErrorStream22);
        org.junit.Assert.assertNotNull(parseErrorItor23);
        org.junit.Assert.assertNotNull(parseErrorItor24);
        org.junit.Assert.assertNull(tag26);
        org.junit.Assert.assertNotNull(tag28);
        org.junit.Assert.assertNotNull(doctype30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Doctype" + "'", str31, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "<!---->" + "'", str35, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder36);
        org.junit.Assert.assertEquals(stringBuilder36.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "<!---->" + "'", str45, "<!---->");
    }

    @Test
    public void test2175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2175");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream11 = parseErrorList10.stream();
        boolean boolean12 = parseErrorList10.canAddError();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder0.parse("EndTag", "hi!#", parseErrorList10);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState14 = null;
        htmlTreeBuilder0.transition(htmlTreeBuilderState14);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder17 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList21 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int22 = parseErrorList21.getMaxSize();
        org.jsoup.nodes.Document document23 = htmlTreeBuilder17.parse("0: Doctype", "hi!", parseErrorList21);
        boolean boolean24 = htmlTreeBuilder17.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState25 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder17.error(htmlTreeBuilderState25);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder27 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList31 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int32 = parseErrorList31.getMaxSize();
        org.jsoup.nodes.Document document33 = htmlTreeBuilder27.parse("0: Doctype", "hi!", parseErrorList31);
        org.jsoup.parser.ParseErrorList parseErrorList37 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream38 = parseErrorList37.stream();
        boolean boolean39 = parseErrorList37.canAddError();
        org.jsoup.nodes.Document document40 = htmlTreeBuilder27.parse("EndTag", "hi!#", parseErrorList37);
        java.lang.String[] strArray48 = new java.lang.String[] { "EndTag", "", "Doctype", "0: Doctype", "EndTag", "[]" };
        boolean boolean49 = htmlTreeBuilder27.inScope("hi!#", strArray48);
        boolean boolean50 = htmlTreeBuilder17.inScope(strArray48);
        boolean boolean51 = htmlTreeBuilder0.inScope("t", strArray48);
        htmlTreeBuilder0.baseUri = "hi!#<hi!#>";
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertNotNull(parseErrorStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(parseErrorList21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(document23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState25);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 0 + "'", int32 == 0);
        org.junit.Assert.assertNotNull(document33);
        org.junit.Assert.assertNotNull(parseErrorList37);
        org.junit.Assert.assertNotNull(parseErrorStream38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertNotNull(strArray48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test2176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2176");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList1.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList1.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int7 = parseErrorList6.getMaxSize();
        boolean boolean8 = parseErrorList1.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList6);
        org.jsoup.parser.TokeniserState tokeniserState9 = org.jsoup.parser.TokeniserState.AttributeValue_singleQuoted;
        int int10 = parseErrorList1.lastIndexOf((java.lang.Object) tokeniserState9);
        org.jsoup.parser.ParseErrorList parseErrorList12 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream13 = parseErrorList12.stream();
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor14 = parseErrorList12.listIterator();
        parseErrorList12.clear();
        int int16 = parseErrorList1.indexOf((java.lang.Object) parseErrorList12);
        int int17 = parseErrorList12.size();
        boolean boolean18 = parseErrorList12.canAddError();
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(tokeniserState9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(parseErrorList12);
        org.junit.Assert.assertNotNull(parseErrorStream13);
        org.junit.Assert.assertNotNull(parseErrorItor14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test2177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2177");
        org.jsoup.parser.Token.EndTag endTag1 = new org.jsoup.parser.Token.EndTag("<hi!>");
        org.jsoup.parser.CharacterReader characterReader2 = null;
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream5 = parseErrorList4.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor6 = parseErrorList4.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor7 = parseErrorList4.iterator();
        org.jsoup.parser.Tokeniser tokeniser8 = new org.jsoup.parser.Tokeniser(characterReader2, parseErrorList4);
        org.jsoup.parser.Token.Tag tag9 = tokeniser8.tagPending;
        tokeniser8.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype12 = tokeniser8.doctypePending;
        tokeniser8.createCommentPending();
        org.jsoup.parser.Token.Comment comment14 = tokeniser8.commentPending;
        org.jsoup.parser.TokenQueue tokenQueue16 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean17 = tokenQueue16.isEmpty();
        char[] charArray19 = new char[] { '4' };
        boolean boolean20 = tokenQueue16.matchesAny(charArray19);
        tokeniser8.emit(charArray19);
        endTag1.appendAttributeValue(charArray19);
        endTag1.appendTagName("\000EndTag");
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertNotNull(parseErrorStream5);
        org.junit.Assert.assertNotNull(parseErrorItor6);
        org.junit.Assert.assertNotNull(parseErrorItor7);
        org.junit.Assert.assertNull(tag9);
        org.junit.Assert.assertNull(doctype12);
        org.junit.Assert.assertNotNull(comment14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(charArray19);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray19), "4");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray19), "[4]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test2178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2178");
        org.jsoup.parser.Token.EndTag endTag0 = new org.jsoup.parser.Token.EndTag();
        java.lang.String str1 = endTag0.tagName;
        org.jsoup.nodes.Attributes attributes2 = endTag0.attributes;
        boolean boolean3 = endTag0.isStartTag();
        endTag0.appendTagName('a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(attributes2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test2179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2179");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.isEmpty();
        boolean boolean3 = tokenQueue1.consumeWhitespace();
        java.lang.String str4 = tokenQueue1.consumeWord();
        boolean boolean5 = tokenQueue1.matchesWhitespace();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder6 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList10 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int11 = parseErrorList10.getMaxSize();
        org.jsoup.nodes.Document document12 = htmlTreeBuilder6.parse("0: Doctype", "hi!", parseErrorList10);
        boolean boolean13 = htmlTreeBuilder6.framesetOk();
        org.jsoup.parser.Parser parser14 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser16 = parser14.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document19 = parser14.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document22 = parser14.parseInput("<hi!>", "[]");
        htmlTreeBuilder6.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document22);
        boolean boolean24 = htmlTreeBuilder6.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder25 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList30 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList32 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream33 = parseErrorList32.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor34 = parseErrorList32.iterator();
        boolean boolean35 = parseErrorList30.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList32);
        xmlTreeBuilder25.initialiseParse("<!---->", "hi!", parseErrorList30);
        org.jsoup.parser.ParseErrorList parseErrorList40 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document41 = xmlTreeBuilder25.parse("", "[]", parseErrorList40);
        boolean boolean42 = htmlTreeBuilder6.isInActiveFormattingElements((org.jsoup.nodes.Element) document41);
        org.jsoup.parser.TokenQueue tokenQueue44 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean45 = tokenQueue44.isEmpty();
        boolean boolean46 = tokenQueue44.consumeWhitespace();
        java.lang.String str47 = tokenQueue44.consumeWord();
        boolean boolean48 = tokenQueue44.matchesWhitespace();
        java.lang.String[] strArray53 = new java.lang.String[] { "0: []", "StartTag", "EndTag", "" };
        java.lang.String str54 = tokenQueue44.consumeToAny(strArray53);
        boolean boolean55 = htmlTreeBuilder6.inScope(strArray53);
        java.lang.String str56 = tokenQueue1.consumeToAny(strArray53);
        char char57 = tokenQueue1.peek();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "EndTag" + "'", str4, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(parseErrorList10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(document12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(parser14);
        org.junit.Assert.assertNotNull(parser16);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertNotNull(document22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(parseErrorList32);
        org.junit.Assert.assertNotNull(parseErrorStream33);
        org.junit.Assert.assertNotNull(parseErrorItor34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(parseErrorList40);
        org.junit.Assert.assertNotNull(document41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "EndTag" + "'", str47, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(strArray53);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "" + "'", str56, "");
        org.junit.Assert.assertTrue("'" + char57 + "' != '" + '\000' + "'", char57 == '\000');
    }

    @Test
    public void test2180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2180");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        org.jsoup.parser.Token.Tag tag9 = tokeniser6.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype10 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype11 = doctype10.asDoctype();
        java.lang.String str12 = doctype10.tokenType();
        tokeniser6.emit((org.jsoup.parser.Token) doctype10);
        org.jsoup.parser.Token.Tag tag15 = tokeniser6.createTagPending(true);
        org.jsoup.parser.TokeniserState tokeniserState16 = org.jsoup.parser.TokeniserState.AttributeValue_doubleQuoted;
        tokeniser6.error((org.jsoup.parser.ITokeniserState) tokeniserState16);
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNotNull(tag9);
        org.junit.Assert.assertNotNull(doctype11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Doctype" + "'", str12, "Doctype");
        org.junit.Assert.assertNotNull(tag15);
        org.junit.Assert.assertNotNull(tokeniserState16);
    }

    @Test
    public void test2181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2181");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream27 = parseErrorList26.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList26.iterator();
        boolean boolean29 = parseErrorList24.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        xmlTreeBuilder19.initialiseParse("<!---->", "hi!", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder19.parse("", "[]", parseErrorList34);
        boolean boolean36 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document35);
        org.jsoup.nodes.Element element38 = htmlTreeBuilder0.insert("<!---->");
        org.jsoup.parser.Token.StartTag startTag40 = new org.jsoup.parser.Token.StartTag("hi!");
        startTag40.appendTagName("hi!");
        startTag40.appendAttributeName('4');
        boolean boolean45 = htmlTreeBuilder0.process((org.jsoup.parser.Token) startTag40);
        org.jsoup.parser.Parser parser46 = new org.jsoup.parser.Parser((org.jsoup.parser.TreeBuilder) htmlTreeBuilder0);
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parseErrorStream27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(element38);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test2182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2182");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag("hi!");
        boolean boolean2 = startTag1.isCharacter();
        startTag1.selfClosing = false;
        org.jsoup.parser.Token.StartTag startTag5 = new org.jsoup.parser.Token.StartTag();
        org.jsoup.nodes.Attributes attributes6 = startTag5.getAttributes();
        startTag1.attributes = attributes6;
        java.lang.String str8 = startTag1.tagName;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(attributes6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test2183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2183");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList1.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor3 = parseErrorList1.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList1.iterator();
        org.jsoup.parser.ParseErrorList parseErrorList6 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int7 = parseErrorList6.getMaxSize();
        boolean boolean8 = parseErrorList1.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList6);
        org.jsoup.parser.ParseError[] parseErrorArray9 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList10 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10, parseErrorArray9);
        org.jsoup.parser.ParseError[] parseErrorArray12 = new org.jsoup.parser.ParseError[] {};
        java.util.ArrayList<org.jsoup.parser.ParseError> parseErrorList13 = new java.util.ArrayList<org.jsoup.parser.ParseError>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList13, parseErrorArray12);
        boolean boolean15 = parseErrorList10.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList13);
        boolean boolean16 = parseErrorList1.containsAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList10);
        java.util.Spliterator<org.jsoup.parser.ParseError> parseErrorSpliterator17 = parseErrorList1.spliterator();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder18 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList23 = new org.jsoup.parser.ParseErrorList(0, (int) (byte) 0);
        htmlTreeBuilder18.initialiseParse("<hi!>", "hi!#", parseErrorList23);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor25 = parseErrorList23.listIterator();
        boolean boolean26 = parseErrorList23.canAddError();
        boolean boolean27 = parseErrorList1.retainAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList23);
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertNotNull(parseErrorItor3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorList6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(parseErrorArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parseErrorArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(parseErrorSpliterator17);
        org.junit.Assert.assertNotNull(parseErrorItor25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test2184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2184");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray9 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList10 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList10, characterArray9);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList10);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder13 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList17 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int18 = parseErrorList17.getMaxSize();
        org.jsoup.nodes.Document document19 = htmlTreeBuilder13.parse("0: Doctype", "hi!", parseErrorList17);
        boolean boolean20 = htmlTreeBuilder13.framesetOk();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState21 = org.jsoup.parser.HtmlTreeBuilderState.InSelectInTable;
        htmlTreeBuilder13.error(htmlTreeBuilderState21);
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState23 = null;
        htmlTreeBuilder13.transition(htmlTreeBuilderState23);
        htmlTreeBuilder13.popStackToClose("hi!");
        org.jsoup.nodes.FormElement formElement27 = htmlTreeBuilder13.getFormElement();
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList28 = htmlTreeBuilder13.getStack();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder29 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList33 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int34 = parseErrorList33.getMaxSize();
        org.jsoup.nodes.Document document35 = htmlTreeBuilder29.parse("0: Doctype", "hi!", parseErrorList33);
        boolean boolean36 = htmlTreeBuilder29.framesetOk();
        org.jsoup.parser.Parser parser37 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser39 = parser37.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document42 = parser37.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document45 = parser37.parseInput("<hi!>", "[]");
        htmlTreeBuilder29.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document45);
        java.lang.String[] strArray47 = new java.lang.String[] {};
        boolean boolean48 = htmlTreeBuilder29.inScope(strArray47);
        htmlTreeBuilder29.markInsertionMode();
        boolean boolean51 = htmlTreeBuilder29.inScope("StartTag");
        htmlTreeBuilder29.markInsertionMode();
        org.jsoup.nodes.Document document55 = org.jsoup.parser.Parser.parseBodyFragmentRelaxed("hi!", "");
        htmlTreeBuilder29.setHeadElement((org.jsoup.nodes.Element) document55);
        htmlTreeBuilder13.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document55);
        htmlTreeBuilder0.push((org.jsoup.nodes.Element) document55);
        java.util.List<org.jsoup.parser.Token.Character> characterList59 = htmlTreeBuilder0.getPendingTableCharacters();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(characterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(parseErrorList17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(document19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState21);
        org.junit.Assert.assertNull(formElement27);
        org.junit.Assert.assertNotNull(elementList28);
        org.junit.Assert.assertNotNull(parseErrorList33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(parser37);
        org.junit.Assert.assertNotNull(parser39);
        org.junit.Assert.assertNotNull(document42);
        org.junit.Assert.assertNotNull(document45);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(document55);
        org.junit.Assert.assertNotNull(characterList59);
    }

    @Test
    public void test2185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2185");
        org.jsoup.parser.Token.Character character1 = new org.jsoup.parser.Token.Character("");
        java.lang.String str2 = character1.getData();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test2186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2186");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.generateImpliedEndTags("hi!#");
        htmlTreeBuilder0.generateImpliedEndTags();
        org.jsoup.parser.Token token10 = htmlTreeBuilder0.currentToken;
        htmlTreeBuilder0.framesetOk(true);
        org.jsoup.parser.TokenQueue tokenQueue14 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean15 = tokenQueue14.isEmpty();
        java.lang.String str17 = tokenQueue14.consumeToIgnoreCase("<hi!>");
        java.lang.String str18 = tokenQueue14.consumeTagName();
        boolean boolean20 = tokenQueue14.matchesCS("<hi!#>");
        tokenQueue14.addFirst("S");
        java.lang.String str23 = tokenQueue14.remainder();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder24 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList28 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int29 = parseErrorList28.getMaxSize();
        org.jsoup.nodes.Document document30 = htmlTreeBuilder24.parse("0: Doctype", "hi!", parseErrorList28);
        boolean boolean31 = htmlTreeBuilder24.framesetOk();
        org.jsoup.parser.Parser parser32 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser34 = parser32.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document37 = parser32.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document40 = parser32.parseInput("<hi!>", "[]");
        htmlTreeBuilder24.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document40);
        boolean boolean42 = htmlTreeBuilder24.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder43 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList48 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList50 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream51 = parseErrorList50.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor52 = parseErrorList50.iterator();
        boolean boolean53 = parseErrorList48.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList50);
        xmlTreeBuilder43.initialiseParse("<!---->", "hi!", parseErrorList48);
        org.jsoup.parser.ParseErrorList parseErrorList58 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document59 = xmlTreeBuilder43.parse("", "[]", parseErrorList58);
        boolean boolean60 = htmlTreeBuilder24.isInActiveFormattingElements((org.jsoup.nodes.Element) document59);
        boolean boolean61 = htmlTreeBuilder24.isFosterInserts();
        org.jsoup.parser.TokenQueue tokenQueue63 = new org.jsoup.parser.TokenQueue("EndTag");
        java.lang.String str65 = tokenQueue63.chompTo("Doctype");
        java.lang.String str66 = tokenQueue63.consumeWord();
        boolean boolean67 = tokenQueue63.matchesStartTag();
        org.jsoup.parser.Token.EndTag endTag68 = new org.jsoup.parser.Token.EndTag();
        char[] charArray71 = new char[] { '#', '#' };
        endTag68.appendAttributeValue(charArray71);
        boolean boolean73 = tokenQueue63.matchesAny(charArray71);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder74 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList78 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int79 = parseErrorList78.getMaxSize();
        org.jsoup.nodes.Document document80 = htmlTreeBuilder74.parse("0: Doctype", "hi!", parseErrorList78);
        boolean boolean81 = htmlTreeBuilder74.framesetOk();
        org.jsoup.parser.Parser parser82 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser84 = parser82.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document87 = parser82.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document90 = parser82.parseInput("<hi!>", "[]");
        htmlTreeBuilder74.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document90);
        java.lang.String[] strArray92 = new java.lang.String[] {};
        boolean boolean93 = htmlTreeBuilder74.inScope(strArray92);
        boolean boolean94 = tokenQueue63.matchesAny(strArray92);
        htmlTreeBuilder24.popStackToClose(strArray92);
        boolean boolean96 = tokenQueue14.matchesAny(strArray92);
        boolean boolean97 = htmlTreeBuilder0.inScope(strArray92);
        java.util.List<org.jsoup.parser.Token.Character> characterList98 = htmlTreeBuilder0.getPendingTableCharacters();
        org.jsoup.helper.DescendableLinkedList<org.jsoup.nodes.Element> elementList99 = htmlTreeBuilder0.getStack();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(token10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "EndTag" + "'", str17, "EndTag");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "S" + "'", str23, "S");
        org.junit.Assert.assertNotNull(parseErrorList28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(document30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(parser32);
        org.junit.Assert.assertNotNull(parser34);
        org.junit.Assert.assertNotNull(document37);
        org.junit.Assert.assertNotNull(document40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parseErrorList50);
        org.junit.Assert.assertNotNull(parseErrorStream51);
        org.junit.Assert.assertNotNull(parseErrorItor52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(parseErrorList58);
        org.junit.Assert.assertNotNull(document59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + boolean61 + "' != '" + false + "'", boolean61 == false);
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "EndTag" + "'", str65, "EndTag");
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "" + "'", str66, "");
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(charArray71);
        org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray71), "##");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray71), "##");
        org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray71), "[#, #]");
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(parseErrorList78);
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 0 + "'", int79 == 0);
        org.junit.Assert.assertNotNull(document80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(parser82);
        org.junit.Assert.assertNotNull(parser84);
        org.junit.Assert.assertNotNull(document87);
        org.junit.Assert.assertNotNull(document90);
        org.junit.Assert.assertNotNull(strArray92);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + false + "'", boolean93 == false);
        org.junit.Assert.assertTrue("'" + boolean94 + "' != '" + false + "'", boolean94 == false);
        org.junit.Assert.assertTrue("'" + boolean96 + "' != '" + false + "'", boolean96 == false);
        org.junit.Assert.assertTrue("'" + boolean97 + "' != '" + false + "'", boolean97 == false);
        org.junit.Assert.assertNotNull(characterList98);
        org.junit.Assert.assertNotNull(elementList99);
    }

    @Test
    public void test2187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2187");
        org.jsoup.parser.CharacterReader characterReader0 = null;
        org.jsoup.parser.ParseErrorList parseErrorList2 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream3 = parseErrorList2.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor4 = parseErrorList2.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor5 = parseErrorList2.iterator();
        org.jsoup.parser.Tokeniser tokeniser6 = new org.jsoup.parser.Tokeniser(characterReader0, parseErrorList2);
        org.jsoup.parser.Token.Tag tag7 = tokeniser6.tagPending;
        tokeniser6.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype10 = tokeniser6.doctypePending;
        org.jsoup.parser.Token.Tag tag12 = tokeniser6.createTagPending(true);
        org.jsoup.parser.CharacterReader characterReader13 = null;
        org.jsoup.parser.ParseErrorList parseErrorList15 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream16 = parseErrorList15.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor17 = parseErrorList15.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor18 = parseErrorList15.iterator();
        org.jsoup.parser.Tokeniser tokeniser19 = new org.jsoup.parser.Tokeniser(characterReader13, parseErrorList15);
        boolean boolean20 = tokeniser19.isAppropriateEndTagToken();
        org.jsoup.parser.Token.Tag tag22 = tokeniser19.createTagPending(true);
        org.jsoup.parser.ParseErrorList parseErrorList24 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream25 = parseErrorList24.stream();
        boolean boolean26 = parseErrorList24.canAddError();
        org.jsoup.parser.ParseError parseError29 = new org.jsoup.parser.ParseError((int) (byte) 100, "");
        java.lang.String str30 = parseError29.getErrorMessage();
        boolean boolean31 = parseErrorList24.add(parseError29);
        org.jsoup.parser.CharacterReader characterReader32 = null;
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream35 = parseErrorList34.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor36 = parseErrorList34.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor37 = parseErrorList34.iterator();
        org.jsoup.parser.Tokeniser tokeniser38 = new org.jsoup.parser.Tokeniser(characterReader32, parseErrorList34);
        org.jsoup.parser.Token.Tag tag39 = tokeniser38.tagPending;
        org.jsoup.parser.Token.Tag tag41 = tokeniser38.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype42 = new org.jsoup.parser.Token.Doctype();
        org.jsoup.parser.Token.Doctype doctype43 = doctype42.asDoctype();
        java.lang.String str44 = doctype42.tokenType();
        tokeniser38.emit((org.jsoup.parser.Token) doctype42);
        org.jsoup.parser.ITokeniserState iTokeniserState46 = tokeniser38.getState();
        org.jsoup.parser.Token.Comment comment47 = new org.jsoup.parser.Token.Comment();
        java.lang.String str48 = comment47.toString();
        java.lang.StringBuilder stringBuilder49 = comment47.data;
        boolean boolean50 = comment47.isEndTag();
        boolean boolean51 = comment47.isComment();
        tokeniser38.commentPending = comment47;
        int int53 = parseErrorList24.lastIndexOf((java.lang.Object) comment47);
        tokeniser19.commentPending = comment47;
        comment47.bogus = true;
        java.lang.String str57 = comment47.toString();
        comment47.bogus = true;
        tokeniser6.commentPending = comment47;
        java.lang.String str61 = comment47.toString();
        boolean boolean62 = comment47.bogus;
        org.junit.Assert.assertNotNull(parseErrorList2);
        org.junit.Assert.assertNotNull(parseErrorStream3);
        org.junit.Assert.assertNotNull(parseErrorItor4);
        org.junit.Assert.assertNotNull(parseErrorItor5);
        org.junit.Assert.assertNull(tag7);
        org.junit.Assert.assertNull(doctype10);
        org.junit.Assert.assertNotNull(tag12);
        org.junit.Assert.assertNotNull(parseErrorList15);
        org.junit.Assert.assertNotNull(parseErrorStream16);
        org.junit.Assert.assertNotNull(parseErrorItor17);
        org.junit.Assert.assertNotNull(parseErrorItor18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(tag22);
        org.junit.Assert.assertNotNull(parseErrorList24);
        org.junit.Assert.assertNotNull(parseErrorStream25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(parseErrorStream35);
        org.junit.Assert.assertNotNull(parseErrorItor36);
        org.junit.Assert.assertNotNull(parseErrorItor37);
        org.junit.Assert.assertNull(tag39);
        org.junit.Assert.assertNotNull(tag41);
        org.junit.Assert.assertNotNull(doctype43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Doctype" + "'", str44, "Doctype");
        org.junit.Assert.assertNotNull(iTokeniserState46);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "<!---->" + "'", str48, "<!---->");
        org.junit.Assert.assertNotNull(stringBuilder49);
        org.junit.Assert.assertEquals(stringBuilder49.toString(), "");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + (-1) + "'", int53 == (-1));
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "<!---->" + "'", str57, "<!---->");
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "<!---->" + "'", str61, "<!---->");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + true + "'", boolean62 == true);
    }

    @Test
    public void test2188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2188");
        org.jsoup.parser.CharacterReader characterReader1 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean3 = characterReader1.matches('\000');
        characterReader1.mark();
        boolean boolean5 = characterReader1.isEmpty();
        boolean boolean6 = characterReader1.matchesLetter();
        java.lang.String str7 = characterReader1.consumeLetterThenDigitSequence();
        char char8 = characterReader1.consume();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "StartTag" + "'", str7, "StartTag");
        org.junit.Assert.assertTrue("'" + char8 + "' != '" + '\uffff' + "'", char8 == '\uffff');
    }

    @Test
    public void test2189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2189");
        org.jsoup.parser.Token.StartTag startTag1 = new org.jsoup.parser.Token.StartTag();
        startTag1.appendAttributeValue("hi!");
        org.jsoup.parser.Token.StartTag startTag4 = startTag1.asStartTag();
        org.jsoup.parser.Token.Tag tag6 = startTag4.name("");
        startTag4.selfClosing = false;
        org.jsoup.nodes.Attributes attributes9 = startTag4.getAttributes();
        org.jsoup.parser.Token.StartTag startTag10 = new org.jsoup.parser.Token.StartTag("0: []", attributes9);
        org.jsoup.nodes.Attributes attributes11 = startTag10.getAttributes();
        startTag10.tagName = "S";
        java.lang.String str14 = startTag10.tagName;
        org.junit.Assert.assertNotNull(startTag4);
        org.junit.Assert.assertNotNull(tag6);
        org.junit.Assert.assertNotNull(attributes9);
        org.junit.Assert.assertNotNull(attributes11);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "S" + "'", str14, "S");
    }

    @Test
    public void test2190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2190");
        org.jsoup.parser.TokenQueue tokenQueue1 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean2 = tokenQueue1.matchesStartTag();
        char[] charArray9 = new char[] { ' ', '4', '\000', ' ', '\uffff', 'a' };
        boolean boolean10 = tokenQueue1.matchesAny(charArray9);
        boolean boolean11 = tokenQueue1.consumeWhitespace();
        tokenQueue1.advance();
        java.lang.String str14 = tokenQueue1.consumeToIgnoreCase("[100: ]");
        java.lang.String str15 = tokenQueue1.consumeTagName();
        tokenQueue1.addFirst("tartTag");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(charArray9);
// flaky:         org.junit.Assert.assertEquals(java.lang.String.copyValueOf(charArray9), " 4\000\uffffa");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(charArray9), " 4\000\uffffa");
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(charArray9), "[ , 4, \000\uffff, a]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ndTag" + "'", str14, "ndTag");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test2191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2191");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        boolean boolean7 = htmlTreeBuilder0.framesetOk();
        org.jsoup.parser.Parser parser8 = org.jsoup.parser.Parser.htmlParser();
        org.jsoup.parser.Parser parser10 = parser8.setTrackErrors((int) (byte) 100);
        org.jsoup.nodes.Document document13 = parser8.parseInput("Doctype", "[]");
        org.jsoup.nodes.Document document16 = parser8.parseInput("<hi!>", "[]");
        htmlTreeBuilder0.removeFromActiveFormattingElements((org.jsoup.nodes.Element) document16);
        boolean boolean18 = htmlTreeBuilder0.isFragmentParsing();
        org.jsoup.parser.XmlTreeBuilder xmlTreeBuilder19 = new org.jsoup.parser.XmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList24 = new org.jsoup.parser.ParseErrorList((int) (byte) 100, (int) (byte) 10);
        org.jsoup.parser.ParseErrorList parseErrorList26 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream27 = parseErrorList26.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor28 = parseErrorList26.iterator();
        boolean boolean29 = parseErrorList24.addAll((java.util.Collection<org.jsoup.parser.ParseError>) parseErrorList26);
        xmlTreeBuilder19.initialiseParse("<!---->", "hi!", parseErrorList24);
        org.jsoup.parser.ParseErrorList parseErrorList34 = org.jsoup.parser.ParseErrorList.tracking(0);
        org.jsoup.nodes.Document document35 = xmlTreeBuilder19.parse("", "[]", parseErrorList34);
        boolean boolean36 = htmlTreeBuilder0.isInActiveFormattingElements((org.jsoup.nodes.Element) document35);
        org.jsoup.parser.TokenQueue tokenQueue38 = new org.jsoup.parser.TokenQueue("EndTag");
        boolean boolean39 = tokenQueue38.isEmpty();
        boolean boolean40 = tokenQueue38.consumeWhitespace();
        java.lang.String str41 = tokenQueue38.consumeWord();
        boolean boolean42 = tokenQueue38.matchesWhitespace();
        java.lang.String[] strArray47 = new java.lang.String[] { "0: []", "StartTag", "EndTag", "" };
        java.lang.String str48 = tokenQueue38.consumeToAny(strArray47);
        boolean boolean49 = htmlTreeBuilder0.inScope(strArray47);
        org.jsoup.nodes.Document document52 = org.jsoup.parser.Parser.parse("", "<hi!>");
        htmlTreeBuilder0.pushActiveFormattingElements((org.jsoup.nodes.Element) document52);
        org.jsoup.nodes.Element element54 = htmlTreeBuilder0.pop();
        htmlTreeBuilder0.clearStackToTableBodyContext();
        org.jsoup.nodes.Element element57 = htmlTreeBuilder0.getFromStack("0: []");
        htmlTreeBuilder0.clearStackToTableBodyContext();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(parser8);
        org.junit.Assert.assertNotNull(parser10);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertNotNull(document16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(parseErrorList26);
        org.junit.Assert.assertNotNull(parseErrorStream27);
        org.junit.Assert.assertNotNull(parseErrorItor28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(parseErrorList34);
        org.junit.Assert.assertNotNull(document35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "EndTag" + "'", str41, "EndTag");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(strArray47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(document52);
        org.junit.Assert.assertNotNull(element54);
        org.junit.Assert.assertNull(element57);
    }

    @Test
    public void test2192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2192");
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder0 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList4 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int5 = parseErrorList4.getMaxSize();
        org.jsoup.nodes.Document document6 = htmlTreeBuilder0.parse("0: Doctype", "hi!", parseErrorList4);
        htmlTreeBuilder0.generateImpliedEndTags("hi!#");
        org.jsoup.parser.Token.Character[] characterArray9 = new org.jsoup.parser.Token.Character[] {};
        java.util.ArrayList<org.jsoup.parser.Token.Character> characterList10 = new java.util.ArrayList<org.jsoup.parser.Token.Character>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<org.jsoup.parser.Token.Character>) characterList10, characterArray9);
        htmlTreeBuilder0.setPendingTableCharacters((java.util.List<org.jsoup.parser.Token.Character>) characterList10);
        boolean boolean13 = htmlTreeBuilder0.isFosterInserts();
        org.jsoup.parser.Token.StartTag startTag15 = new org.jsoup.parser.Token.StartTag("[100: ]");
        org.jsoup.nodes.FormElement formElement17 = htmlTreeBuilder0.insertForm(startTag15, true);
        htmlTreeBuilder0.baseUri = "[]";
        htmlTreeBuilder0.newPendingTableCharacters();
        htmlTreeBuilder0.clearFormattingElementsToLastMarker();
        org.junit.Assert.assertNotNull(parseErrorList4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(document6);
        org.junit.Assert.assertNotNull(characterArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(formElement17);
    }

    @Test
    public void test2193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest4.test2193");
        org.jsoup.parser.ParseErrorList parseErrorList1 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream2 = parseErrorList1.stream();
        boolean boolean3 = parseErrorList1.canAddError();
        org.jsoup.parser.HtmlTreeBuilderState htmlTreeBuilderState4 = org.jsoup.parser.HtmlTreeBuilderState.Text;
        org.jsoup.parser.Token.EndTag endTag5 = new org.jsoup.parser.Token.EndTag();
        endTag5.newAttribute();
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder7 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList11 = org.jsoup.parser.ParseErrorList.tracking(0);
        int int12 = parseErrorList11.getMaxSize();
        org.jsoup.nodes.Document document13 = htmlTreeBuilder7.parse("0: Doctype", "hi!", parseErrorList11);
        boolean boolean14 = htmlTreeBuilderState4.process((org.jsoup.parser.Token) endTag5, htmlTreeBuilder7);
        htmlTreeBuilder7.baseUri = "</hi![]>";
        boolean boolean17 = parseErrorList1.equals((java.lang.Object) htmlTreeBuilder7);
        org.jsoup.parser.HtmlTreeBuilder htmlTreeBuilder20 = new org.jsoup.parser.HtmlTreeBuilder();
        org.jsoup.parser.ParseErrorList parseErrorList25 = new org.jsoup.parser.ParseErrorList(0, (int) (byte) 0);
        htmlTreeBuilder20.initialiseParse("<hi!>", "hi!#", parseErrorList25);
        java.util.ListIterator<org.jsoup.parser.ParseError> parseErrorItor27 = parseErrorList25.listIterator();
        org.jsoup.nodes.Document document28 = htmlTreeBuilder7.parse("[100: ]", "-1: []", parseErrorList25);
        org.jsoup.parser.CharacterReader characterReader29 = null;
        org.jsoup.parser.ParseErrorList parseErrorList31 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream32 = parseErrorList31.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor33 = parseErrorList31.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor34 = parseErrorList31.iterator();
        org.jsoup.parser.Tokeniser tokeniser35 = new org.jsoup.parser.Tokeniser(characterReader29, parseErrorList31);
        org.jsoup.parser.Token.Tag tag36 = tokeniser35.tagPending;
        tokeniser35.emit("hi!");
        org.jsoup.parser.Token.Doctype doctype39 = tokeniser35.doctypePending;
        org.jsoup.parser.TokeniserState tokeniserState40 = org.jsoup.parser.TokeniserState.ScriptDataDoubleEscapedDashDash;
        tokeniser35.eofError((org.jsoup.parser.ITokeniserState) tokeniserState40);
        org.jsoup.parser.CharacterReader characterReader42 = null;
        org.jsoup.parser.ParseErrorList parseErrorList44 = org.jsoup.parser.ParseErrorList.tracking(0);
        java.util.stream.Stream<org.jsoup.parser.ParseError> parseErrorStream45 = parseErrorList44.stream();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor46 = parseErrorList44.iterator();
        java.util.Iterator<org.jsoup.parser.ParseError> parseErrorItor47 = parseErrorList44.iterator();
        org.jsoup.parser.Tokeniser tokeniser48 = new org.jsoup.parser.Tokeniser(characterReader42, parseErrorList44);
        org.jsoup.parser.Token.Tag tag49 = tokeniser48.tagPending;
        org.jsoup.parser.Token.Tag tag51 = tokeniser48.createTagPending(true);
        org.jsoup.parser.Token.Doctype doctype52 = new org.jsoup.parser.Token.Doctype();
        boolean boolean53 = doctype52.isCharacter();
        boolean boolean54 = doctype52.isEndTag();
        boolean boolean55 = doctype52.isCharacter();
        tokeniser48.emit((org.jsoup.parser.Token) doctype52);
        org.jsoup.parser.Token.Doctype doctype57 = tokeniser48.doctypePending;
        org.jsoup.parser.Token token58 = tokeniser48.read();
        org.jsoup.parser.CharacterReader characterReader60 = new org.jsoup.parser.CharacterReader("StartTag");
        boolean boolean62 = characterReader60.matches('\uffff');
        boolean boolean64 = characterReader60.containsIgnoreCase("0: []");
        boolean boolean65 = characterReader60.matchesDigit();
        java.lang.String str66 = characterReader60.consumeToEnd();
        characterReader60.mark();
        tokeniserState40.read(tokeniser48, characterReader60);
        boolean boolean69 = parseErrorList25.remove((java.lang.Object) characterReader60);
        org.junit.Assert.assertNotNull(parseErrorList1);
        org.junit.Assert.assertNotNull(parseErrorStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(htmlTreeBuilderState4);
        org.junit.Assert.assertNotNull(parseErrorList11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(document13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(parseErrorItor27);
        org.junit.Assert.assertNotNull(document28);
        org.junit.Assert.assertNotNull(parseErrorList31);
        org.junit.Assert.assertNotNull(parseErrorStream32);
        org.junit.Assert.assertNotNull(parseErrorItor33);
        org.junit.Assert.assertNotNull(parseErrorItor34);
        org.junit.Assert.assertNull(tag36);
        org.junit.Assert.assertNull(doctype39);
        org.junit.Assert.assertNotNull(tokeniserState40);
        org.junit.Assert.assertNotNull(parseErrorList44);
        org.junit.Assert.assertNotNull(parseErrorStream45);
        org.junit.Assert.assertNotNull(parseErrorItor46);
        org.junit.Assert.assertNotNull(parseErrorItor47);
        org.junit.Assert.assertNull(tag49);
        org.junit.Assert.assertNotNull(tag51);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertNull(doctype57);
        org.junit.Assert.assertNotNull(token58);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
        org.junit.Assert.assertEquals("'" + str66 + "' != '" + "StartTag" + "'", str66, "StartTag");
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
    }
}
