package pignlproc;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("hi !\n");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.setStoreLocation("\"http://.wikipedia.org/wiki/ \"\n", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        sentencesWithLink0.setPigLogger(pigLogger2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = sentencesWithLink0.getReporter();
        org.junit.Assert.assertNull(funcSpecList1);
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNull(pigLogger5);
        org.junit.Assert.assertNull(pigLogger6);
        org.junit.Assert.assertNull(pigProgressable7);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = concatTextBag1.getPigLogger();
        org.junit.Assert.assertNull(pigLogger2);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("\"http://http://http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22 .wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521\"");
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http://http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n.wikipedia.org/wiki/%22%22");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.pig.Expression expression4 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression4);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("hi!");
        org.apache.pig.data.Tuple tuple2 = null;
        java.lang.Boolean boolean3 = noLoopInPath1.exec(tuple2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        noLoopInPath1.setReporter(pigProgressable4);
        org.junit.Assert.assertEquals("'" + boolean3 + "' != '" + true + "'", boolean3, true);
    }

    @Test
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        java.lang.String str5 = annotation4.label;
        int int6 = annotation4.end;
        java.lang.String str7 = annotation4.value;
        java.lang.String str8 = annotation4.value;
        java.lang.String str9 = annotation4.value;
        java.lang.String str10 = annotation4.label;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "title" + "'", str5, "title");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "hi!" + "'", str7, "hi!");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "title" + "'", str10, "title");
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("hi !", "opennlp/en-sent.bin", "wikiobject");
        org.apache.pig.Expression expression4 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression4);
        org.apache.pig.Expression expression6 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression6);
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader8, pigSplit9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = uriUriNTriplesLoader3.getSchema("http : // \" hi ! \" . wikipedia . org / wiki / % 22 hi % 21 _ % 22", job12);
        org.apache.pig.Expression expression14 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression14);
        org.apache.hadoop.mapreduce.Job job17 = null;
        java.lang.String[] strArray18 = uriUriNTriplesLoader3.getPartitionKeys("\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\"\"", job17);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n.wikipedia.org/wiki/%22%22");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser0.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser0.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser14.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList16 = annotatingMarkupParser14.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel18 = annotatingMarkupParser14.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel20 = annotatingMarkupParser14.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser14.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList23 = annotatingMarkupParser22.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList24 = annotatingMarkupParser22.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList25 = annotatingMarkupParser22.getParagraphAnnotations();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser22.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList27 = annotatingMarkupParser22.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser28 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList29 = annotatingMarkupParser28.getHeaderAnnotations();
        java.util.List<java.lang.String> strList30 = annotatingMarkupParser28.getParagraphs();
        java.lang.Appendable appendable31 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable32 = annotatingMarkupParser28.new CountingAppendable(appendable31);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable33 = annotatingMarkupParser22.new CountingAppendable((java.lang.Appendable) countingAppendable32);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser34 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser34.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList36 = annotatingMarkupParser34.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel38 = annotatingMarkupParser34.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel40 = annotatingMarkupParser34.makeWikiModel("hi!\n");
        annotatingMarkupParser0.nodesToText(annotationList21, (java.lang.Appendable) countingAppendable33, (info.bliki.wiki.model.IWikiModel) wikiModel40);
        java.util.List<java.lang.String> strList42 = annotatingMarkupParser0.getParagraphs();
        java.util.List<java.lang.String> strList43 = annotatingMarkupParser0.getParagraphs();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(annotationList16);
        org.junit.Assert.assertNotNull(wikiModel18);
        org.junit.Assert.assertNotNull(wikiModel20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(annotationList24);
        org.junit.Assert.assertNotNull(annotationList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(annotationList27);
        org.junit.Assert.assertNotNull(annotationList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(annotationList36);
        org.junit.Assert.assertNotNull(wikiModel38);
        org.junit.Assert.assertNotNull(wikiModel40);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        pignlproc.evaluation.NoLoopInPath noLoopInPath0 = new pignlproc.evaluation.NoLoopInPath();
        noLoopInPath0.progress();
        pignlproc.evaluation.NoLoopInPath noLoopInPath2 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText3 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        safeTsvText3.setPigLogger(pigLogger4);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText6 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = mergeAsOpenNLPAnnotatedText6.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = checkAbstract8.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = mergeAsOpenNLPAnnotatedText6.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = safeTsvText3.outputSchema(schema11);
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = noLoopInPath2.outputSchema(schema11);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag14 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = aggregateTextBag14.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = noLoopInPath2.outputSchema(schema23);
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum29 = null;
        checkAbstract27.warn("http://.wikipedia.org/wiki/hi%21", enum29);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        checkAbstract27.setPigLogger(pigLogger31);
        checkAbstract27.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText34 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        safeTsvText34.setPigLogger(pigLogger35);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText37 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable38 = mergeAsOpenNLPAnnotatedText37.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract39 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = checkAbstract39.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = mergeAsOpenNLPAnnotatedText37.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = safeTsvText34.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = checkAbstract27.outputSchema(schema43);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = noLoopInPath2.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = noLoopInPath0.outputSchema(schema44);
        boolean boolean47 = noLoopInPath0.isAsynchronous();
        org.apache.pig.data.Tuple tuple48 = null;
        java.lang.Boolean boolean49 = noLoopInPath0.exec(tuple48);
        noLoopInPath0.progress();
        org.junit.Assert.assertNull(pigProgressable7);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(pigProgressable38);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + boolean49 + "' != '" + true + "'", boolean49, true);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser0.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser0.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser("\"http://.wikipedia.org/wiki/hi%21\"\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser7.getHeaders();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser11.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel17 = annotatingMarkupParser11.makeWikiModel("opennlp / en - sent . bin");
        info.bliki.wiki.model.WikiModel wikiModel19 = annotatingMarkupParser11.makeWikiModel("\"hi!\"");
        java.util.List<pignlproc.markup.Annotation> annotationList20 = annotatingMarkupParser11.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser23 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser23.getHeaders();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser23.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList26 = annotatingMarkupParser23.getHeaderAnnotations();
        java.lang.String str27 = annotatingMarkupParser23.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser28 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList29 = annotatingMarkupParser28.getHeaders();
        java.util.List<java.lang.String> strList30 = annotatingMarkupParser28.getHeaders();
        java.lang.Appendable appendable31 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable32 = annotatingMarkupParser28.new CountingAppendable(appendable31);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable33 = annotatingMarkupParser23.new CountingAppendable((java.lang.Appendable) countingAppendable32);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser34 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser34.getHeaders();
        java.util.List<java.lang.String> strList36 = annotatingMarkupParser34.getHeaders();
        java.lang.Appendable appendable37 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable38 = annotatingMarkupParser34.new CountingAppendable(appendable37);
        countingAppendable38.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable41 = annotatingMarkupParser23.new CountingAppendable((java.lang.Appendable) countingAppendable38);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable42 = annotatingMarkupParser22.new CountingAppendable((java.lang.Appendable) countingAppendable41);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser43 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList44 = annotatingMarkupParser43.getHeaders();
        java.util.List<java.lang.String> strList45 = annotatingMarkupParser43.getHeaders();
        java.lang.String str47 = annotatingMarkupParser43.parse("\"title\"");
        info.bliki.wiki.model.WikiModel wikiModel49 = annotatingMarkupParser43.makeWikiModel("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"");
        info.bliki.wiki.model.WikiModel wikiModel51 = annotatingMarkupParser43.makeWikiModel("http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href");
        annotatingMarkupParser7.nodesToText(annotationList20, (java.lang.Appendable) countingAppendable41, (info.bliki.wiki.model.IWikiModel) wikiModel51);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable53 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable41);
        int int54 = countingAppendable41.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable55 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable41);
        info.bliki.wiki.model.WikiModel wikiModel57 = annotatingMarkupParser0.makeWikiModel("\"hi! \"\n");
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wikiModel17);
        org.junit.Assert.assertNotNull(wikiModel19);
        org.junit.Assert.assertNotNull(annotationList20);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(annotationList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"title\"\n" + "'", str47, "\"title\"\n");
        org.junit.Assert.assertNotNull(wikiModel49);
        org.junit.Assert.assertNotNull(wikiModel51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(wikiModel57);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract3 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum5 = null;
        checkAbstract3.warn("http://.wikipedia.org/wiki/hi%21", enum5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        checkAbstract3.setPigLogger(pigLogger7);
        checkAbstract3.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract3.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = concatTextBag2.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = sentencesWithLink0.outputSchema(schema21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger23 = null;
        sentencesWithLink0.setPigLogger(pigLogger23);
        java.lang.reflect.Type type25 = sentencesWithLink0.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList26 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger27 = sentencesWithLink0.getPigLogger();
        org.apache.commons.logging.Log log28 = sentencesWithLink0.getLogger();
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(funcSpecList26);
        org.junit.Assert.assertNull(pigLogger27);
        org.junit.Assert.assertNotNull(log28);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) 'a');
        pignlproc.evaluation.AggregateTextBag aggregateTextBag3 = new pignlproc.evaluation.AggregateTextBag((int) '4');
        java.lang.reflect.Type type4 = aggregateTextBag3.getReturnType();
        boolean boolean5 = aggregateTextBag3.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath6 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText7 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = null;
        safeTsvText7.setPigLogger(pigLogger8);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText10 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = mergeAsOpenNLPAnnotatedText10.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract12 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = checkAbstract12.outputSchema(schema13);
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = mergeAsOpenNLPAnnotatedText10.outputSchema(schema13);
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = safeTsvText7.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = noLoopInPath6.outputSchema(schema15);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = noLoopInPath6.getPigLogger();
        java.lang.reflect.Type type19 = noLoopInPath6.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath20 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText21 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger22 = null;
        safeTsvText21.setPigLogger(pigLogger22);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText24 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable25 = mergeAsOpenNLPAnnotatedText24.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract26 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = checkAbstract26.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = mergeAsOpenNLPAnnotatedText24.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = safeTsvText21.outputSchema(schema29);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = noLoopInPath20.outputSchema(schema29);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag32 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText33 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger34 = null;
        safeTsvText33.setPigLogger(pigLogger34);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText36 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable37 = mergeAsOpenNLPAnnotatedText36.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract38 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = checkAbstract38.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = mergeAsOpenNLPAnnotatedText36.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = safeTsvText33.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = aggregateTextBag32.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = noLoopInPath20.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = noLoopInPath6.outputSchema(schema44);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable46 = noLoopInPath6.getReporter();
        pignlproc.evaluation.AggregateTextBag aggregateTextBag49 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText50 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray52 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList53 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList53, spanArray52);
        java.lang.String str55 = mergeAsOpenNLPAnnotatedText50.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList53);
        pignlproc.evaluation.ConcatTextBag concatTextBag57 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract58 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum60 = null;
        checkAbstract58.warn("http://.wikipedia.org/wiki/hi%21", enum60);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger62 = null;
        checkAbstract58.setPigLogger(pigLogger62);
        checkAbstract58.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText65 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger66 = null;
        safeTsvText65.setPigLogger(pigLogger66);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText68 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable69 = mergeAsOpenNLPAnnotatedText68.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract70 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = checkAbstract70.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = mergeAsOpenNLPAnnotatedText68.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = safeTsvText65.outputSchema(schema73);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = checkAbstract58.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = concatTextBag57.outputSchema(schema75);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = mergeAsOpenNLPAnnotatedText50.outputSchema(schema75);
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = aggregateTextBag49.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema79 = noLoopInPath6.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema80 = aggregateTextBag3.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema81 = aggregateTextBag1.outputSchema(schema80);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(pigLogger18);
        org.junit.Assert.assertNotNull(type19);
        org.junit.Assert.assertNull(pigProgressable25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(pigProgressable37);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(pigProgressable46);
        org.junit.Assert.assertNotNull(spanArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "href" + "'", str55, "href");
        org.junit.Assert.assertNull(pigProgressable69);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema81);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("http://\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\".wikipedia.org/wiki/%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22\n", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\".wikipedia.org/wiki/%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = checkAbstract0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        checkAbstract0.setReporter(pigProgressable5);
        boolean boolean7 = checkAbstract0.isAsynchronous();
        org.apache.pig.data.Tuple tuple8 = null;
        java.lang.Boolean boolean9 = checkAbstract0.exec(tuple8);
        checkAbstract0.progress();
        org.apache.pig.data.Tuple tuple11 = null;
        java.lang.Boolean boolean12 = checkAbstract0.exec(tuple11);
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertEquals("'" + boolean12 + "' != '" + false + "'", boolean12, false);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((-1), false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        aggregateTextBag2.setReporter(pigProgressable3);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText5 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray7 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList8 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList8, spanArray7);
        java.lang.String str10 = mergeAsOpenNLPAnnotatedText5.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList8);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList11 = mergeAsOpenNLPAnnotatedText5.getArgToFuncMapping();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText12 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray14 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList15 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList15, spanArray14);
        java.lang.String str17 = mergeAsOpenNLPAnnotatedText12.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList15);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = null;
        mergeAsOpenNLPAnnotatedText12.setPigLogger(pigLogger18);
        boolean boolean20 = mergeAsOpenNLPAnnotatedText12.isAsynchronous();
        pignlproc.evaluation.CheckAbstract checkAbstract21 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum23 = null;
        checkAbstract21.warn("http://.wikipedia.org/wiki/hi%21", enum23);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable25 = null;
        checkAbstract21.setReporter(pigProgressable25);
        java.lang.reflect.Type type27 = checkAbstract21.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath28 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText29 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger30 = null;
        safeTsvText29.setPigLogger(pigLogger30);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText32 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable33 = mergeAsOpenNLPAnnotatedText32.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract34 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = checkAbstract34.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = mergeAsOpenNLPAnnotatedText32.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = safeTsvText29.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = noLoopInPath28.outputSchema(schema37);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag40 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText41 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger42 = null;
        safeTsvText41.setPigLogger(pigLogger42);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText44 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable45 = mergeAsOpenNLPAnnotatedText44.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract46 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract46.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = mergeAsOpenNLPAnnotatedText44.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = safeTsvText41.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = aggregateTextBag40.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = noLoopInPath28.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = checkAbstract21.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = mergeAsOpenNLPAnnotatedText12.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = mergeAsOpenNLPAnnotatedText5.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = aggregateTextBag2.outputSchema(schema49);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger57 = null;
        aggregateTextBag2.setPigLogger(pigLogger57);
        org.junit.Assert.assertNotNull(spanArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi !" + "'", str10, "hi !");
        org.junit.Assert.assertNull(funcSpecList11);
        org.junit.Assert.assertNotNull(spanArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi !" + "'", str17, "hi !");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNull(pigProgressable33);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(pigProgressable45);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        pignlproc.evaluation.CheckAbstract checkAbstract7 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum9 = null;
        checkAbstract7.warn("http://.wikipedia.org/wiki/hi%21", enum9);
        java.lang.Enum enum12 = null;
        checkAbstract7.warn("hi !", enum12);
        pignlproc.evaluation.NoLoopInPath noLoopInPath14 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = noLoopInPath14.outputSchema(schema23);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag26 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText27 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = null;
        safeTsvText27.setPigLogger(pigLogger28);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText30 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = mergeAsOpenNLPAnnotatedText30.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract32 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract32.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = mergeAsOpenNLPAnnotatedText30.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = safeTsvText27.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag26.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = noLoopInPath14.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = checkAbstract7.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = sentencesWithLink0.outputSchema(schema38);
        sentencesWithLink0.progress();
        java.lang.Enum enum43 = null;
        sentencesWithLink0.warn("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", enum43);
        boolean boolean45 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger46 = sentencesWithLink0.getPigLogger();
        sentencesWithLink0.progress();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(pigProgressable31);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(pigLogger46);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\" \"");
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        sentencesWithLink0.finish();
        boolean boolean4 = sentencesWithLink0.isAsynchronous();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        org.apache.pig.data.Tuple tuple6 = null;
        java.lang.Boolean boolean7 = checkAbstract0.exec(tuple6);
        java.lang.Enum enum9 = null;
        checkAbstract0.warn("\"hi! \"", enum9);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://.wikipedia.org/wiki/hi%21");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader3 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = parsingWikipediaLoader3.getStatistics("hi!", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = parsingWikipediaLoader3.getSchema("\"hi!\"", job8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = parsingWikipediaLoader3.getSchema("\"hi!\"\n", job11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceSchema resourceSchema15 = parsingWikipediaLoader3.getSchema("http://.wikipedia.org/wiki/hi%21\n", job14);
        uriStringLiteralNTriplesStorer1.checkSchema(resourceSchema15);
        org.apache.pig.data.Tuple tuple17 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(resourceSchema9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNotNull(resourceSchema15);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = null;
        sentencesWithLink0.setReporter(pigProgressable6);
        sentencesWithLink0.finish();
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNull(pigProgressable5);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        sentencesWithLink0.finish();
        java.lang.Enum enum4 = null;
        sentencesWithLink0.warn("titlehref", enum4);
        sentencesWithLink0.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        sentencesWithLink0.setPigLogger(pigLogger7);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = sentencesWithLink0.getPigLogger();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNull(pigLogger9);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        parsingWikipediaLoader1.setUDFContextSignature("hi !");
        org.apache.pig.Expression expression4 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = parsingWikipediaLoader1.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", job7);
        org.apache.hadoop.mapreduce.RecordReader recordReader9 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit10 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader9, pigSplit10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceStatistics resourceStatistics14 = parsingWikipediaLoader1.getStatistics("http://http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22", job13);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink15 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        sentencesWithLink15.setPigLogger(pigLogger16);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable18 = sentencesWithLink15.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = null;
        sentencesWithLink15.setReporter(pigProgressable19);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable21 = sentencesWithLink15.getReporter();
        java.lang.Enum enum23 = null;
        sentencesWithLink15.warn("http://\"title\".wikipedia.org/wiki/%22hi%21%22", enum23);
        java.lang.reflect.Type type25 = sentencesWithLink15.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable26 = sentencesWithLink15.getReporter();
        java.lang.Enum enum28 = null;
        sentencesWithLink15.warn("\"title\"\n\n", enum28);
        org.apache.commons.logging.Log log30 = sentencesWithLink15.getLogger();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList31 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) parsingWikipediaLoader1, (java.lang.Object) sentencesWithLink15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.storage.ParsingWikipediaLoader cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNull(resourceStatistics14);
        org.junit.Assert.assertNull(pigProgressable18);
        org.junit.Assert.assertNull(pigProgressable21);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(pigProgressable26);
        org.junit.Assert.assertNotNull(log30);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) '4');
        java.lang.reflect.Type type2 = aggregateTextBag1.getReturnType();
        boolean boolean3 = aggregateTextBag1.isAsynchronous();
        pignlproc.evaluation.ConcatTextBag concatTextBag5 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum8 = null;
        checkAbstract6.warn("http://.wikipedia.org/wiki/hi%21", enum8);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger10 = null;
        checkAbstract6.setPigLogger(pigLogger10);
        checkAbstract6.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText13 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        safeTsvText13.setPigLogger(pigLogger14);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText16.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract18.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText13.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = checkAbstract6.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = concatTextBag5.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = aggregateTextBag1.outputSchema(schema23);
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract((int) (byte) 10);
        pignlproc.evaluation.SafeTsvText safeTsvText28 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger29 = null;
        safeTsvText28.setPigLogger(pigLogger29);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText31 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable32 = mergeAsOpenNLPAnnotatedText31.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract33 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = checkAbstract33.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = mergeAsOpenNLPAnnotatedText31.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = safeTsvText28.outputSchema(schema36);
        safeTsvText28.finish();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink39 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList40 = sentencesWithLink39.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger41 = null;
        sentencesWithLink39.setPigLogger(pigLogger41);
        java.lang.reflect.Type type43 = sentencesWithLink39.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable44 = sentencesWithLink39.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable45 = sentencesWithLink39.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger46 = null;
        sentencesWithLink39.setPigLogger(pigLogger46);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser48 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList49 = annotatingMarkupParser48.getHeaders();
        java.util.List<java.lang.String> strList50 = annotatingMarkupParser48.getHeaders();
        java.lang.String str52 = annotatingMarkupParser48.parse("\"title\"");
        pignlproc.evaluation.ConcatTextBag concatTextBag54 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract55 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum57 = null;
        checkAbstract55.warn("http://.wikipedia.org/wiki/hi%21", enum57);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger59 = null;
        checkAbstract55.setPigLogger(pigLogger59);
        checkAbstract55.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText62 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger63 = null;
        safeTsvText62.setPigLogger(pigLogger63);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText65 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable66 = mergeAsOpenNLPAnnotatedText65.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract67 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = checkAbstract67.outputSchema(schema68);
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = mergeAsOpenNLPAnnotatedText65.outputSchema(schema68);
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = safeTsvText62.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = checkAbstract55.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = concatTextBag54.outputSchema(schema72);
        java.util.List<opennlp.tools.util.Span> spanList74 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) pigLogger46, (java.lang.Object) "\"title\"", (java.lang.Object) schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = safeTsvText28.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = checkAbstract27.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = aggregateTextBag1.outputSchema(schema72);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList78 = aggregateTextBag1.getArgToFuncMapping();
        org.junit.Assert.assertNotNull(type2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(pigProgressable32);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(funcSpecList40);
        org.junit.Assert.assertNotNull(type43);
        org.junit.Assert.assertNull(pigProgressable44);
        org.junit.Assert.assertNull(pigProgressable45);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "\"title\"\n" + "'", str52, "\"title\"\n");
        org.junit.Assert.assertNull(pigProgressable66);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(spanList74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNull(funcSpecList78);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = parsingWikipediaLoader1.getSchema("\"\"\"hi !  href\"\"\"", job5);
        org.junit.Assert.assertNotNull(resourceSchema6);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.data.Tuple tuple1 = null;
        java.lang.Boolean boolean2 = checkAbstract0.exec(tuple1);
        java.lang.reflect.Type type3 = checkAbstract0.getReturnType();
        java.lang.reflect.Type type4 = checkAbstract0.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        checkAbstract0.setReporter(pigProgressable5);
        boolean boolean7 = checkAbstract0.isAsynchronous();
        org.junit.Assert.assertEquals("'" + boolean2 + "' != '" + false + "'", boolean2, false);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) ' ', (int) '4', "http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href\n", "\" http : // hi ! . wikipedia . org / wiki / http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 % 0 A . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 \"");
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22href", true);
        boolean boolean3 = concatTextBag2.isAsynchronous();
        org.apache.pig.data.Tuple tuple4 = null;
        java.lang.String str5 = concatTextBag2.exec(tuple4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("href");
        pignlproc.evaluation.NoLoopInPath noLoopInPath3 = new pignlproc.evaluation.NoLoopInPath("wikiobject");
        boolean boolean4 = noLoopInPath3.isAsynchronous();
        pignlproc.evaluation.ConcatTextBag concatTextBag6 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        org.apache.pig.data.Tuple tuple7 = null;
        java.lang.String str8 = concatTextBag6.exec(tuple7);
        pignlproc.evaluation.NoLoopInPath noLoopInPath9 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = noLoopInPath9.outputSchema(schema18);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag21 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText22 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger23 = null;
        safeTsvText22.setPigLogger(pigLogger23);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText25 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable26 = mergeAsOpenNLPAnnotatedText25.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = checkAbstract27.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = mergeAsOpenNLPAnnotatedText25.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = safeTsvText22.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = aggregateTextBag21.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = noLoopInPath9.outputSchema(schema30);
        pignlproc.evaluation.CheckAbstract checkAbstract34 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum36 = null;
        checkAbstract34.warn("http://.wikipedia.org/wiki/hi%21", enum36);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger38 = null;
        checkAbstract34.setPigLogger(pigLogger38);
        checkAbstract34.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText41 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger42 = null;
        safeTsvText41.setPigLogger(pigLogger42);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText44 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable45 = mergeAsOpenNLPAnnotatedText44.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract46 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract46.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = mergeAsOpenNLPAnnotatedText44.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = safeTsvText41.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = checkAbstract34.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = noLoopInPath9.outputSchema(schema51);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = concatTextBag6.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = noLoopInPath3.outputSchema(schema53);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = noLoopInPath1.outputSchema(schema53);
        org.apache.commons.logging.Log log56 = noLoopInPath1.getLogger();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(pigProgressable26);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(pigProgressable45);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(log56);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        java.lang.String str3 = annotatingMarkupParser1.parse("\"http://.wikipedia.org/wiki/hi%21\"\n");
        java.lang.String str5 = annotatingMarkupParser1.parse("title\n");
        java.lang.String str7 = annotatingMarkupParser1.parse("http : // \"\"\" hi ! \"\" \" . wikipedia . org / wiki /");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"http://.wikipedia.org/wiki/hi%21\"\n\n" + "'", str3, "\"http://.wikipedia.org/wiki/hi%21\"\n\n");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "title\n\n" + "'", str5, "title\n\n");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "http : // \"\"\" hi ! \"\" \" . wikipedia . org / wiki /\n" + "'", str7, "http : // \"\"\" hi ! \"\" \" . wikipedia . org / wiki /\n");
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract2 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum4 = null;
        checkAbstract2.warn("http://.wikipedia.org/wiki/hi%21", enum4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = null;
        checkAbstract2.setPigLogger(pigLogger6);
        checkAbstract2.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText9 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger10 = null;
        safeTsvText9.setPigLogger(pigLogger10);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText12 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable13 = mergeAsOpenNLPAnnotatedText12.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract14 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = checkAbstract14.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = mergeAsOpenNLPAnnotatedText12.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = safeTsvText9.outputSchema(schema17);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = checkAbstract2.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = concatTextBag1.outputSchema(schema19);
        org.apache.pig.data.Tuple tuple21 = null;
        java.lang.String str22 = concatTextBag1.exec(tuple21);
        java.lang.reflect.Type type23 = concatTextBag1.getReturnType();
        concatTextBag1.finish();
        org.junit.Assert.assertNull(pigProgressable13);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(type23);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser3 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser3.getHeaders();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser3.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList6 = annotatingMarkupParser3.getHeaderAnnotations();
        pignlproc.markup.Annotation annotation11 = new pignlproc.markup.Annotation(10, 10, "title", "hi !");
        pignlproc.markup.Annotation annotation16 = new pignlproc.markup.Annotation((int) (byte) 1, (-1), "wikiobject", "href");
        pignlproc.markup.Annotation annotation21 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation26 = new pignlproc.markup.Annotation(10, 10, "title", "hi !");
        pignlproc.markup.Annotation annotation31 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        java.lang.String str32 = annotation31.label;
        java.lang.String str33 = annotation31.label;
        pignlproc.markup.Annotation annotation38 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        java.lang.String str39 = annotation38.label;
        java.lang.String str40 = annotation38.label;
        java.lang.String str41 = annotation38.value;
        pignlproc.markup.Annotation[] annotationArray42 = new pignlproc.markup.Annotation[] { annotation11, annotation16, annotation21, annotation26, annotation31, annotation38 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList43 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList43, annotationArray42);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser45 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList46 = annotatingMarkupParser45.getHeaders();
        java.util.List<java.lang.String> strList47 = annotatingMarkupParser45.getHeaders();
        java.lang.Appendable appendable48 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable49 = annotatingMarkupParser45.new CountingAppendable(appendable48);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser50 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList51 = annotatingMarkupParser50.getHeaderAnnotations();
        java.lang.String str52 = annotatingMarkupParser50.getRedirect();
        pignlproc.markup.Annotation annotation57 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation62 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int63 = annotation62.end;
        int int64 = annotation62.begin;
        pignlproc.markup.Annotation[] annotationArray65 = new pignlproc.markup.Annotation[] { annotation57, annotation62 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList66 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList66, annotationArray65);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser68 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList69 = annotatingMarkupParser68.getHeaders();
        java.util.List<java.lang.String> strList70 = annotatingMarkupParser68.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList71 = annotatingMarkupParser68.getHeaderAnnotations();
        java.lang.String str72 = annotatingMarkupParser68.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser73 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList74 = annotatingMarkupParser73.getHeaders();
        java.util.List<java.lang.String> strList75 = annotatingMarkupParser73.getHeaders();
        java.lang.Appendable appendable76 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable77 = annotatingMarkupParser73.new CountingAppendable(appendable76);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable78 = annotatingMarkupParser68.new CountingAppendable((java.lang.Appendable) countingAppendable77);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser79 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList80 = annotatingMarkupParser79.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel82 = annotatingMarkupParser79.makeWikiModel("title");
        annotatingMarkupParser50.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList66, (java.lang.Appendable) countingAppendable77, (info.bliki.wiki.model.IWikiModel) wikiModel82);
        annotatingMarkupParser3.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList43, appendable48, (info.bliki.wiki.model.IWikiModel) wikiModel82);
        java.util.List<pignlproc.markup.Annotation> annotationList85 = annotatingMarkupParser3.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser86 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList87 = annotatingMarkupParser86.getHeaders();
        java.util.List<java.lang.String> strList88 = annotatingMarkupParser86.getHeaders();
        java.lang.Appendable appendable89 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable90 = annotatingMarkupParser86.new CountingAppendable(appendable89);
        int int91 = countingAppendable90.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable92 = annotatingMarkupParser3.new CountingAppendable((java.lang.Appendable) countingAppendable90);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable93 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable92);
        info.bliki.wiki.model.WikiModel wikiModel95 = annotatingMarkupParser0.makeWikiModel("hi!\n\n");
        java.lang.String str97 = annotatingMarkupParser0.parse("http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href");
        java.util.List<java.lang.String> strList98 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList99 = annotatingMarkupParser0.getHeaderAnnotations();
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(annotationList6);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "title" + "'", str32, "title");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "title" + "'", str33, "title");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "title" + "'", str39, "title");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "title" + "'", str40, "title");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(annotationArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(annotationList51);
        org.junit.Assert.assertNull(str52);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 52 + "'", int64 == 52);
        org.junit.Assert.assertNotNull(annotationArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(annotationList71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(annotationList80);
        org.junit.Assert.assertNotNull(wikiModel82);
        org.junit.Assert.assertNotNull(annotationList85);
        org.junit.Assert.assertNotNull(strList87);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 0 + "'", int91 == 0);
        org.junit.Assert.assertNotNull(wikiModel95);
        org.junit.Assert.assertEquals("'" + str97 + "' != '" + "http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href\n" + "'", str97, "http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href\n");
        org.junit.Assert.assertNotNull(strList98);
        org.junit.Assert.assertNotNull(annotationList99);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        noLoopInPath1.setPigLogger(pigLogger2);
        boolean boolean4 = noLoopInPath1.isAsynchronous();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("\"\"\"title\"\"href\"");
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract3 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum5 = null;
        checkAbstract3.warn("http://.wikipedia.org/wiki/hi%21", enum5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        checkAbstract3.setPigLogger(pigLogger7);
        checkAbstract3.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract3.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = concatTextBag2.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = sentencesWithLink0.outputSchema(schema21);
        boolean boolean23 = sentencesWithLink0.isAsynchronous();
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter3 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter3);
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer6 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader8 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceStatistics resourceStatistics11 = parsingWikipediaLoader8.getStatistics("hi!", job10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceSchema resourceSchema14 = parsingWikipediaLoader8.getSchema("hi!", job13);
        uriStringLiteralNTriplesStorer6.checkSchema(resourceSchema14);
        uriStringLiteralNTriplesStorer1.checkSchema(resourceSchema14);
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader20 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job22 = null;
        org.apache.pig.ResourceSchema resourceSchema23 = uriUriNTriplesLoader20.getSchema("", job22);
        org.apache.pig.Expression expression24 = null;
        uriUriNTriplesLoader20.setPartitionFilter(expression24);
        org.apache.hadoop.mapreduce.Job job27 = null;
        org.apache.pig.ResourceSchema resourceSchema28 = uriUriNTriplesLoader20.getSchema("", job27);
        uriStringLiteralNTriplesStorer1.checkSchema(resourceSchema28);
        org.apache.hadoop.mapreduce.RecordWriter recordWriter30 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter30);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat32 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.junit.Assert.assertNotNull(outputFormat2);
        org.junit.Assert.assertNull(resourceStatistics11);
        org.junit.Assert.assertNotNull(resourceSchema14);
        org.junit.Assert.assertNotNull(resourceSchema23);
        org.junit.Assert.assertNotNull(resourceSchema28);
        org.junit.Assert.assertNotNull(outputFormat32);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = checkAbstract0.getReporter();
        checkAbstract0.progress();
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = checkAbstract0.exec(tuple5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = checkAbstract0.getPigLogger();
        java.lang.reflect.Type type8 = checkAbstract0.getReturnType();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        java.lang.String str6 = annotatingMarkupParser0.getRedirect();
        info.bliki.wiki.model.WikiModel wikiModel8 = annotatingMarkupParser0.makeWikiModel("\"opennlp / en - sent . bin\"");
        java.lang.String str10 = annotatingMarkupParser0.parse("http://\"title\"\n.wikipedia.org/wiki/");
        info.bliki.wiki.model.WikiModel wikiModel12 = annotatingMarkupParser0.makeWikiModel("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
        java.util.List<pignlproc.markup.Annotation> annotationList13 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser14.getHeaders();
        java.util.List<java.lang.String> strList16 = annotatingMarkupParser14.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser14.getHeaderAnnotations();
        java.lang.String str18 = annotatingMarkupParser14.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser19.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser19.getHeaders();
        java.lang.Appendable appendable22 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser19.new CountingAppendable(appendable22);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser14.new CountingAppendable((java.lang.Appendable) countingAppendable23);
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser14.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel27 = annotatingMarkupParser14.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser28 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList29 = annotatingMarkupParser28.getHeaders();
        java.util.List<java.lang.String> strList30 = annotatingMarkupParser28.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList31 = annotatingMarkupParser28.getHeaderAnnotations();
        java.lang.String str32 = annotatingMarkupParser28.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser33 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList34 = annotatingMarkupParser33.getHeaders();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser33.getHeaders();
        java.lang.Appendable appendable36 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable37 = annotatingMarkupParser33.new CountingAppendable(appendable36);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable38 = annotatingMarkupParser28.new CountingAppendable((java.lang.Appendable) countingAppendable37);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser39 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList40 = annotatingMarkupParser39.getHeaders();
        java.util.List<java.lang.String> strList41 = annotatingMarkupParser39.getHeaders();
        java.lang.Appendable appendable42 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable43 = annotatingMarkupParser39.new CountingAppendable(appendable42);
        countingAppendable43.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable46 = annotatingMarkupParser28.new CountingAppendable((java.lang.Appendable) countingAppendable43);
        countingAppendable46.currentPosition = (byte) -1;
        countingAppendable46.currentPosition = 100;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable51 = annotatingMarkupParser14.new CountingAppendable((java.lang.Appendable) countingAppendable46);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser52 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList53 = annotatingMarkupParser52.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList54 = annotatingMarkupParser52.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel56 = annotatingMarkupParser52.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel58 = annotatingMarkupParser52.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList59 = annotatingMarkupParser52.getParagraphAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList60 = annotatingMarkupParser52.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel62 = annotatingMarkupParser52.makeWikiModel("");
        annotatingMarkupParser0.nodesToText(annotationList13, (java.lang.Appendable) countingAppendable46, (info.bliki.wiki.model.IWikiModel) wikiModel62);
        int int64 = countingAppendable46.currentPosition;
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wikiModel8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "http://\"title\"\n.wikipedia.org/wiki/\n" + "'", str10, "http://\"title\"\n.wikipedia.org/wiki/\n");
        org.junit.Assert.assertNotNull(wikiModel12);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(wikiModel27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(annotationList31);
        org.junit.Assert.assertNull(str32);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(annotationList54);
        org.junit.Assert.assertNotNull(wikiModel56);
        org.junit.Assert.assertNotNull(wikiModel58);
        org.junit.Assert.assertNotNull(annotationList59);
        org.junit.Assert.assertNotNull(annotationList60);
        org.junit.Assert.assertNotNull(wikiModel62);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 100 + "'", int64 == 100);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("wikiobject", job6);
        parsingWikipediaLoader1.setUDFContextSignature("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22");
        org.apache.hadoop.mapreduce.InputFormat inputFormat10 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job12 = null;
        java.lang.String[] strArray13 = parsingWikipediaLoader1.getPartitionKeys("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/%22%22%22_http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22%22%22", job12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        org.apache.pig.ResourceSchema resourceSchema16 = parsingWikipediaLoader1.getSchema("\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"", job15);
        org.apache.hadoop.mapreduce.Job job18 = null;
        org.apache.pig.ResourceStatistics resourceStatistics19 = parsingWikipediaLoader1.getStatistics("\"http://\"\"http : // \"\"\"\" opennlp / en - sent . bin \"\"\"\" . wikipedia . org / wiki / href\"\".wikipedia.org/wiki/http%3A%2F%2F%22title%22%0A.wikipedia.org%2Fwiki%2F%0A\"", job18);
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(inputFormat10);
        org.junit.Assert.assertNull(strArray13);
        org.junit.Assert.assertNotNull(resourceSchema16);
        org.junit.Assert.assertNull(resourceStatistics19);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22href");
        pignlproc.evaluation.CheckAbstract checkAbstract2 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema3 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema4 = checkAbstract2.outputSchema(schema3);
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = checkAbstract2.exec(tuple5);
        java.lang.Enum enum8 = null;
        checkAbstract2.warn("href", enum8);
        org.apache.pig.data.Tuple tuple10 = null;
        java.lang.Boolean boolean11 = checkAbstract2.exec(tuple10);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList12 = checkAbstract2.getArgToFuncMapping();
        checkAbstract2.progress();
        checkAbstract2.progress();
        checkAbstract2.finish();
        pignlproc.evaluation.NoLoopInPath noLoopInPath16 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText17 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = null;
        safeTsvText17.setPigLogger(pigLogger18);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText20 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable21 = mergeAsOpenNLPAnnotatedText20.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract22 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = checkAbstract22.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = mergeAsOpenNLPAnnotatedText20.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = safeTsvText17.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = noLoopInPath16.outputSchema(schema25);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink28 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath29 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText30 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        safeTsvText30.setPigLogger(pigLogger31);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText33 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable34 = mergeAsOpenNLPAnnotatedText33.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract35 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = checkAbstract35.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = mergeAsOpenNLPAnnotatedText33.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = safeTsvText30.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = noLoopInPath29.outputSchema(schema38);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag41 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText42 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger43 = null;
        safeTsvText42.setPigLogger(pigLogger43);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText45 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable46 = mergeAsOpenNLPAnnotatedText45.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract47 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = checkAbstract47.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = mergeAsOpenNLPAnnotatedText45.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = safeTsvText42.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = aggregateTextBag41.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = noLoopInPath29.outputSchema(schema50);
        pignlproc.evaluation.CheckAbstract checkAbstract54 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum56 = null;
        checkAbstract54.warn("http://.wikipedia.org/wiki/hi%21", enum56);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger58 = null;
        checkAbstract54.setPigLogger(pigLogger58);
        checkAbstract54.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText61 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger62 = null;
        safeTsvText61.setPigLogger(pigLogger62);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText64 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable65 = mergeAsOpenNLPAnnotatedText64.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract66 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = checkAbstract66.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = mergeAsOpenNLPAnnotatedText64.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = safeTsvText61.outputSchema(schema69);
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = checkAbstract54.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = noLoopInPath29.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = sentencesWithLink28.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = noLoopInPath16.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = checkAbstract2.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = noLoopInPath1.outputSchema(schema74);
        java.lang.Enum enum78 = null;
        noLoopInPath1.warn("http://http://\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"  \".wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22.wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2Fhttp%3A%2F%2F%22%22title%22%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_hi_%2521_._wikipedia_._org_%252F_wiki_%252F_opennlp___%2525_2_F___en___-___sent___.___bin", enum78);
        org.apache.pig.data.Tuple tuple80 = null;
        java.lang.Boolean boolean81 = noLoopInPath1.exec(tuple80);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertEquals("'" + boolean11 + "' != '" + false + "'", boolean11, false);
        org.junit.Assert.assertNull(funcSpecList12);
        org.junit.Assert.assertNull(pigProgressable21);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(pigProgressable34);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(pigProgressable46);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(pigProgressable65);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertEquals("'" + boolean81 + "' != '" + true + "'", boolean81, true);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        checkAbstract0.setPigLogger(pigLogger4);
        checkAbstract0.progress();
        org.apache.commons.logging.Log log7 = checkAbstract0.getLogger();
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n.wikipedia.org/wiki/%22hi%21%22");
        uriUriNTriplesStorer1.setStoreFuncUDFContextSignature("http://\"opennlp/en-sent.bin\"\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhref%0A.wikipedia.org%2Fwiki%2F%2522%2522");
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        java.lang.String str6 = annotatingMarkupParser0.getRedirect();
        info.bliki.wiki.model.WikiModel wikiModel8 = annotatingMarkupParser0.makeWikiModel("\"opennlp/en-sent.bin\"");
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser0.getParagraphAnnotations();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(wikiModel8);
        org.junit.Assert.assertNotNull(annotationList9);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        aggregateTextBag1.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        aggregateTextBag1.setReporter(pigProgressable3);
        org.apache.commons.logging.Log log5 = aggregateTextBag1.getLogger();
        org.apache.pig.data.Tuple tuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = aggregateTextBag1.exec(tuple6);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in AggregateTextBag");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(log5);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        java.lang.reflect.Type type6 = checkAbstract0.getReturnType();
        boolean boolean7 = checkAbstract0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = checkAbstract0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        checkAbstract0.setPigLogger(pigLogger9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = checkAbstract0.getReporter();
        java.lang.Enum enum13 = null;
        checkAbstract0.warn("hi !\n", enum13);
        java.lang.Enum enum16 = null;
        checkAbstract0.warn("\"title\"", enum16);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable18 = null;
        checkAbstract0.setReporter(pigProgressable18);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList20 = checkAbstract0.getArgToFuncMapping();
        pignlproc.evaluation.SafeTsvText safeTsvText21 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger22 = null;
        safeTsvText21.setPigLogger(pigLogger22);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText24 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable25 = mergeAsOpenNLPAnnotatedText24.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract26 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = checkAbstract26.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = mergeAsOpenNLPAnnotatedText24.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = safeTsvText21.outputSchema(schema29);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = checkAbstract0.outputSchema(schema29);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNull(funcSpecList20);
        org.junit.Assert.assertNull(pigProgressable25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = parsingWikipediaLoader1.getSchema("opennlp/en-sent.bin", job7);
        org.apache.pig.LoadCaster loadCaster9 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceStatistics resourceStatistics12 = parsingWikipediaLoader1.getStatistics("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", job11);
        org.apache.pig.Expression expression13 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression13);
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNotNull(loadCaster9);
        org.junit.Assert.assertNull(resourceStatistics12);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("", "hi !\n\n", "http://\"\"\"hi!\"\" \".wikipedia.org/wiki/");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriStringLiteralNTriplesStorer3.getOutputFormat();
        uriStringLiteralNTriplesStorer3.setStoreFuncUDFContextSignature("");
        org.apache.hadoop.mapreduce.Job job8 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer3.cleanupOnFailure("", job8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Can not create a Path from an empty string");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        java.lang.Enum enum6 = null;
        checkAbstract0.warn("href", enum6);
        org.apache.pig.data.Tuple tuple8 = null;
        java.lang.Boolean boolean9 = checkAbstract0.exec(tuple8);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList10 = checkAbstract0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        checkAbstract0.setPigLogger(pigLogger11);
        org.apache.commons.logging.Log log13 = checkAbstract0.getLogger();
        checkAbstract0.finish();
        checkAbstract0.progress();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNull(funcSpecList10);
        org.junit.Assert.assertNotNull(log13);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("wikiobject");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        concatTextBag1.setPigLogger(pigLogger2);
        org.apache.pig.data.Tuple tuple4 = null;
        java.lang.String str5 = concatTextBag1.exec(tuple4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = null;
        concatTextBag1.setReporter(pigProgressable6);
        concatTextBag1.finish();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / % 22 title % 22");
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract3 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum5 = null;
        checkAbstract3.warn("http://.wikipedia.org/wiki/hi%21", enum5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        checkAbstract3.setPigLogger(pigLogger7);
        checkAbstract3.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract3.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = concatTextBag2.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = sentencesWithLink0.outputSchema(schema21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger23 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum25 = null;
        sentencesWithLink0.warn("title", enum25);
        java.lang.reflect.Type type27 = sentencesWithLink0.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger29 = null;
        sentencesWithLink0.setPigLogger(pigLogger29);
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(pigLogger23);
        org.junit.Assert.assertNotNull(type27);
        org.junit.Assert.assertNull(pigLogger28);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("opennlp/en-sent.bin", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("\"title\"\n", job6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceStatistics resourceStatistics10 = parsingWikipediaLoader1.getStatistics("", job9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("http://http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22\n", job12);
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNull(resourceStatistics10);
        org.junit.Assert.assertNotNull(resourceSchema13);
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        java.lang.String[] strArray5 = uriStringLiteralNTriplesLoader2.getPartitionKeys("href", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriStringLiteralNTriplesLoader2.getSchema("hi !", job7);
        org.apache.pig.LoadCaster loadCaster9 = uriStringLiteralNTriplesLoader2.getLoadCaster();
        org.apache.hadoop.mapreduce.InputFormat inputFormat10 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNotNull(loadCaster9);
        org.junit.Assert.assertNotNull(inputFormat10);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag5 = sentencesWithLink0.exec(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(funcSpecList3);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (short) 100, (int) (byte) 0, "\" http : // . wikipedia . org / wiki / hi % 21 \"", "\n");
        int int5 = annotation4.end;
        int int6 = annotation4.end;
        java.lang.String str7 = annotation4.value;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "\n" + "'", str7, "\n");
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser6.getHeaders();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser6.getHeaders();
        java.lang.Appendable appendable9 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser6.new CountingAppendable(appendable9);
        java.lang.String str12 = annotatingMarkupParser6.parse("\"hi!\"\n");
        java.lang.Appendable appendable13 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser6.new CountingAppendable(appendable13);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable17 = countingAppendable15.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\"hi!\"\n\n" + "'", str12, "\"hi!\"\n\n");
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        java.lang.reflect.Type type7 = sentencesWithLink0.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = sentencesWithLink0.getArgToFuncMapping();
        sentencesWithLink0.progress();
        boolean boolean10 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = sentencesWithLink0.getPigLogger();
        pignlproc.evaluation.CheckAbstract checkAbstract13 = new pignlproc.evaluation.CheckAbstract((int) '#');
        org.apache.pig.data.Tuple tuple14 = null;
        java.lang.Boolean boolean15 = checkAbstract13.exec(tuple14);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag17 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 0);
        pignlproc.evaluation.ConcatTextBag concatTextBag20 = new pignlproc.evaluation.ConcatTextBag("http://\"title\".wikipedia.org/wiki/%22hi%21%22", true);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink21 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList22 = sentencesWithLink21.getArgToFuncMapping();
        pignlproc.evaluation.CheckAbstract checkAbstract23 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum25 = null;
        checkAbstract23.warn("http://.wikipedia.org/wiki/hi%21", enum25);
        java.lang.Enum enum28 = null;
        checkAbstract23.warn("hi !", enum28);
        pignlproc.evaluation.NoLoopInPath noLoopInPath30 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText31 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger32 = null;
        safeTsvText31.setPigLogger(pigLogger32);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText34 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable35 = mergeAsOpenNLPAnnotatedText34.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract36 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = checkAbstract36.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = mergeAsOpenNLPAnnotatedText34.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = safeTsvText31.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = noLoopInPath30.outputSchema(schema39);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag42 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText43 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger44 = null;
        safeTsvText43.setPigLogger(pigLogger44);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText46 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable47 = mergeAsOpenNLPAnnotatedText46.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract48 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = checkAbstract48.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = mergeAsOpenNLPAnnotatedText46.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = safeTsvText43.outputSchema(schema51);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = aggregateTextBag42.outputSchema(schema51);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = noLoopInPath30.outputSchema(schema51);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = checkAbstract23.outputSchema(schema54);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = sentencesWithLink21.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = concatTextBag20.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = aggregateTextBag17.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = checkAbstract13.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = sentencesWithLink0.outputSchema(schema55);
        java.lang.Enum enum62 = null;
        sentencesWithLink0.warn("\" http : // hi ! . wikipedia . org / wiki / http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 % 0 A . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 \"", enum62);
        java.lang.reflect.Type type64 = sentencesWithLink0.getReturnType();
        sentencesWithLink0.finish();
        sentencesWithLink0.progress();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pigLogger11);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNull(funcSpecList22);
        org.junit.Assert.assertNull(pigProgressable35);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(pigProgressable47);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(type64);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://hi!\n.wikipedia.org/wiki/%22_title_%22\n");
        concatTextBag1.finish();
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("\" http : // . wikipedia . org / wiki / hi % 21 \"");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriUriNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.RecordWriter recordWriter4 = null;
        uriUriNTriplesStorer1.prepareToWrite(recordWriter4);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader0 = new pignlproc.storage.ParsingWikipediaLoader();
        org.apache.pig.LoadCaster loadCaster1 = parsingWikipediaLoader0.getLoadCaster();
        org.apache.hadoop.mapreduce.RecordReader recordReader2 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit3 = null;
        parsingWikipediaLoader0.prepareToRead(recordReader2, pigSplit3);
        org.apache.hadoop.mapreduce.InputFormat inputFormat5 = parsingWikipediaLoader0.getInputFormat();
        org.junit.Assert.assertNotNull(loadCaster1);
        org.junit.Assert.assertNotNull(inputFormat5);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = checkAbstract0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = checkAbstract0.getPigLogger();
        boolean boolean6 = checkAbstract0.isAsynchronous();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract0.outputSchema(schema7);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList9 = checkAbstract0.getArgToFuncMapping();
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertNull(pigLogger5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNull(funcSpecList9);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.RecordReader recordReader9 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit10 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader9, pigSplit10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceSchema resourceSchema14 = uriUriNTriplesLoader3.getSchema("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22href\"", job13);
        uriUriNTriplesLoader3.setUDFContextSignature("");
        org.apache.hadoop.mapreduce.Job job18 = null;
        org.apache.pig.ResourceSchema resourceSchema19 = uriUriNTriplesLoader3.getSchema("\"opennlp / en - sent . bin\"\n", job18);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(resourceSchema14);
        org.junit.Assert.assertNotNull(resourceSchema19);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser2 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser2.getHeaders();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser2.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser2.getHeaderAnnotations();
        java.lang.String str6 = annotatingMarkupParser2.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.lang.Appendable appendable10 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable11 = annotatingMarkupParser7.new CountingAppendable(appendable10);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable12 = annotatingMarkupParser2.new CountingAppendable((java.lang.Appendable) countingAppendable11);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser13 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser13.getHeaders();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser13.getHeaders();
        java.lang.Appendable appendable16 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable17 = annotatingMarkupParser13.new CountingAppendable(appendable16);
        countingAppendable17.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable20 = annotatingMarkupParser2.new CountingAppendable((java.lang.Appendable) countingAppendable17);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable20);
        countingAppendable21.currentPosition = ' ';
        int int24 = countingAppendable21.currentPosition;
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 32 + "'", int24 == 32);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("hi!\n");
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader5, pigSplit6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.pig.Expression expression11 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceStatistics resourceStatistics15 = parsingWikipediaLoader1.getStatistics("\"hi!\"\n\n", job14);
        org.apache.hadoop.mapreduce.Job job17 = null;
        org.apache.pig.ResourceSchema resourceSchema18 = parsingWikipediaLoader1.getSchema("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", job17);
        org.apache.hadoop.mapreduce.Job job20 = null;
        org.apache.pig.ResourceSchema resourceSchema21 = parsingWikipediaLoader1.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job20);
        org.apache.pig.LoadCaster loadCaster22 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.InputFormat inputFormat23 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job25 = null;
        org.apache.pig.ResourceSchema resourceSchema26 = parsingWikipediaLoader1.getSchema("\"http : // \"\" opennlp / en - sent . bin \"\" . wikipedia . org / wiki / href\"\n", job25);
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(resourceStatistics15);
        org.junit.Assert.assertNotNull(resourceSchema18);
        org.junit.Assert.assertNotNull(resourceSchema21);
        org.junit.Assert.assertNotNull(loadCaster22);
        org.junit.Assert.assertNotNull(inputFormat23);
        org.junit.Assert.assertNotNull(resourceSchema26);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        sentencesWithLink0.setReporter(pigProgressable4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = sentencesWithLink0.getReporter();
        sentencesWithLink0.progress();
        java.lang.reflect.Type type8 = sentencesWithLink0.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        sentencesWithLink0.setPigLogger(pigLogger9);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("http : // \" hi ! \" . wikipedia . org / wiki / % 22 hi % 21 _ % 22");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"http : // \" hi ! \" . wikipedia . org / wiki / % 22 hi % 21 _ % 22\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21href");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        pignlproc.evaluation.NoLoopInPath noLoopInPath0 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText1 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        safeTsvText1.setPigLogger(pigLogger2);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText4 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = mergeAsOpenNLPAnnotatedText4.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = mergeAsOpenNLPAnnotatedText4.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = safeTsvText1.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = noLoopInPath0.outputSchema(schema9);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag12 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText13 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        safeTsvText13.setPigLogger(pigLogger14);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText16.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract18.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText13.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = aggregateTextBag12.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = noLoopInPath0.outputSchema(schema21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger25 = null;
        noLoopInPath0.setPigLogger(pigLogger25);
        org.apache.pig.data.Tuple tuple27 = null;
        java.lang.Boolean boolean28 = noLoopInPath0.exec(tuple27);
        noLoopInPath0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger30 = noLoopInPath0.getPigLogger();
        org.apache.commons.logging.Log log31 = noLoopInPath0.getLogger();
        noLoopInPath0.finish();
        noLoopInPath0.finish();
        noLoopInPath0.progress();
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + boolean28 + "' != '" + true + "'", boolean28, true);
        org.junit.Assert.assertNull(pigLogger30);
        org.junit.Assert.assertNotNull(log31);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        java.lang.reflect.Type type7 = sentencesWithLink0.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = null;
        sentencesWithLink0.setReporter(pigProgressable8);
        sentencesWithLink0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = sentencesWithLink0.getPigLogger();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(pigLogger11);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        java.lang.reflect.Type type4 = sentencesWithLink0.getReturnType();
        sentencesWithLink0.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = sentencesWithLink0.getReporter();
        java.lang.reflect.Type type7 = sentencesWithLink0.getReturnType();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = null;
        sentencesWithLink0.setReporter(pigProgressable8);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList10 = sentencesWithLink0.getArgToFuncMapping();
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(funcSpecList10);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("http://http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/%22opennlp_%2F_en_-_sent_._bin%22%0A.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22%22%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22%22_%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi%2521.wikipedia.org%252Fwiki%252F%252522http%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%252522%25250A%2522%2522%2522.wikipedia.org%2Fwiki%2Fwikiobject", "http://\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/http_%3A_%2F%2F_hi_%21_._wikipedia_._org_%2F_wiki_%2F_opennlp___%25_2_F___en___-___sent___.___bin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/http_%3A_%2F%2F_hi_%21_._wikipedia_._org_%2F_wiki_%2F_opennlp___%25_2_F___en___-___sent___.___bin.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2F%2522opennlp_%252F_en_-_sent_._bin%2522%250A.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252Fhttp%253A%252F%252F%2522%2522%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%2522_%2522.wikipedia.org%252Fwiki%252F%252522%252522%252522http%25253A%25252F%25252Fhi%252521.wikipedia.org%25252Fwiki%25252F%25252522http%2525253A%2525252F%2525252F.wikipedia.org%2525252Fwiki%2525252Fhi%2525252521%25252522%2525250A%252522%252522%252522.wikipedia.org%252Fwiki%252Fwikiobject" + "'", str2, "http://http://\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/http_%3A_%2F%2F_hi_%21_._wikipedia_._org_%2F_wiki_%2F_opennlp___%25_2_F___en___-___sent___.___bin.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2F%2522opennlp_%252F_en_-_sent_._bin%2522%250A.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252Fhttp%253A%252F%252F%2522%2522%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%2522_%2522.wikipedia.org%252Fwiki%252F%252522%252522%252522http%25253A%25252F%25252Fhi%252521.wikipedia.org%25252Fwiki%25252F%25252522http%2525253A%2525252F%2525252F.wikipedia.org%2525252Fwiki%2525252Fhi%2525252521%25252522%2525250A%252522%252522%252522.wikipedia.org%252Fwiki%252Fwikiobject");
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n\n");
        pignlproc.evaluation.ConcatTextBag concatTextBag3 = new pignlproc.evaluation.ConcatTextBag("http://hi!\n.wikipedia.org/wiki/%22_title_%22");
        java.lang.Enum enum5 = null;
        concatTextBag3.warn("http://.wikipedia.org/wiki/hi%21", enum5);
        java.lang.Enum enum8 = null;
        concatTextBag3.warn("hi !\n\n", enum8);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser10 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser10.getHeaders();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser10.getHeaders();
        java.lang.String str14 = annotatingMarkupParser10.parse("\"title\"");
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser10.getParagraphs();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList20 = annotatingMarkupParser18.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser18.getParagraphAnnotations();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser18.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList23 = annotatingMarkupParser18.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser24 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList25 = annotatingMarkupParser24.getHeaderAnnotations();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser24.getParagraphs();
        java.lang.Appendable appendable27 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser24.new CountingAppendable(appendable27);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser18.new CountingAppendable((java.lang.Appendable) countingAppendable28);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable30 = annotatingMarkupParser17.new CountingAppendable((java.lang.Appendable) countingAppendable29);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable31 = annotatingMarkupParser10.new CountingAppendable((java.lang.Appendable) countingAppendable30);
        java.lang.String str33 = annotatingMarkupParser10.parse("hi !\n\nhref");
        boolean boolean34 = annotatingMarkupParser10.noLinks();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser10.getParagraphs();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList36 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n\n", (java.lang.Object) concatTextBag3, (java.lang.Object) annotatingMarkupParser10);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: java.lang.String cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\"title\"\n" + "'", str14, "\"title\"\n");
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(annotationList20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList23);
        org.junit.Assert.assertNotNull(annotationList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi !\nhref\n" + "'", str33, "hi !\nhref\n");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList35);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"http://.wikipedia.org/wiki/hi%21\"");
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceStatistics resourceStatistics9 = uriUriNTriplesLoader3.getStatistics("opennlp/en-sent.bin", job8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriUriNTriplesLoader3.getSchema("http://\"title\".wikipedia.org/wiki/%22hi%21%22", job11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceSchema resourceSchema15 = uriUriNTriplesLoader3.getSchema("wikiobject", job14);
        org.apache.pig.Expression expression16 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression16);
        org.apache.hadoop.mapreduce.Job job19 = null;
        org.apache.pig.ResourceSchema resourceSchema20 = uriUriNTriplesLoader3.getSchema("http://http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22\n", job19);
        org.apache.hadoop.mapreduce.Job job22 = null;
        org.apache.pig.ResourceSchema resourceSchema23 = uriUriNTriplesLoader3.getSchema("\"\"\"hi !  href\"\"\"", job22);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNull(resourceStatistics9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNotNull(resourceSchema15);
        org.junit.Assert.assertNotNull(resourceSchema20);
        org.junit.Assert.assertNotNull(resourceSchema23);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation(10, 0, "hi!\n\n", "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/%22opennlp_%2F_en_-_sent_._bin%22%0A\n");
        java.lang.String str5 = annotation4.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/%22opennlp_%2F_en_-_sent_._bin%22%0A\n" + "'", str5, "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/%22opennlp_%2F_en_-_sent_._bin%22%0A\n");
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation(35, (int) '#', "http://\"http://.wikipedia.org/wiki/hi%21\"\n\n.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%0A", "\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\" \"");
        java.lang.String str5 = annotation4.label;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://\"http://.wikipedia.org/wiki/hi%21\"\n\n.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%0A" + "'", str5, "http://\"http://.wikipedia.org/wiki/hi%21\"\n\n.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%0A");
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser2 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser2.getHeaders();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser2.getHeaders();
        java.lang.Appendable appendable5 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable6 = annotatingMarkupParser2.new CountingAppendable(appendable5);
        java.lang.String str8 = annotatingMarkupParser2.parse("");
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser2.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser10 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList11 = annotatingMarkupParser10.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser10.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList14 = annotatingMarkupParser10.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList15 = annotatingMarkupParser10.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser16 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser16.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList20 = annotatingMarkupParser18.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser18.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList23 = annotatingMarkupParser22.getHeaders();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser22.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList25 = annotatingMarkupParser22.getHeaderAnnotations();
        java.lang.String str26 = annotatingMarkupParser22.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser27 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList28 = annotatingMarkupParser27.getHeaders();
        java.util.List<java.lang.String> strList29 = annotatingMarkupParser27.getHeaders();
        java.lang.Appendable appendable30 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable31 = annotatingMarkupParser27.new CountingAppendable(appendable30);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable32 = annotatingMarkupParser22.new CountingAppendable((java.lang.Appendable) countingAppendable31);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser33 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList34 = annotatingMarkupParser33.getHeaderAnnotations();
        java.lang.String str35 = annotatingMarkupParser33.getRedirect();
        pignlproc.markup.Annotation annotation40 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation45 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int46 = annotation45.end;
        int int47 = annotation45.begin;
        pignlproc.markup.Annotation[] annotationArray48 = new pignlproc.markup.Annotation[] { annotation40, annotation45 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList49 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean50 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList49, annotationArray48);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser51 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList52 = annotatingMarkupParser51.getHeaders();
        java.util.List<java.lang.String> strList53 = annotatingMarkupParser51.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList54 = annotatingMarkupParser51.getHeaderAnnotations();
        java.lang.String str55 = annotatingMarkupParser51.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser56 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList57 = annotatingMarkupParser56.getHeaders();
        java.util.List<java.lang.String> strList58 = annotatingMarkupParser56.getHeaders();
        java.lang.Appendable appendable59 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable60 = annotatingMarkupParser56.new CountingAppendable(appendable59);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable61 = annotatingMarkupParser51.new CountingAppendable((java.lang.Appendable) countingAppendable60);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser62 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList63 = annotatingMarkupParser62.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel65 = annotatingMarkupParser62.makeWikiModel("title");
        annotatingMarkupParser33.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList49, (java.lang.Appendable) countingAppendable60, (info.bliki.wiki.model.IWikiModel) wikiModel65);
        annotatingMarkupParser16.nodesToText(annotationList21, (java.lang.Appendable) countingAppendable32, (info.bliki.wiki.model.IWikiModel) wikiModel65);
        countingAppendable32.currentPosition = ' ';
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser70 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList71 = annotatingMarkupParser70.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel73 = annotatingMarkupParser70.makeWikiModel("title");
        annotatingMarkupParser2.nodesToText(annotationList15, (java.lang.Appendable) countingAppendable32, (info.bliki.wiki.model.IWikiModel) wikiModel73);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable75 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable32);
        int int76 = countingAppendable32.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable78 = countingAppendable32.append('#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(annotationList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNotNull(annotationList14);
        org.junit.Assert.assertNotNull(annotationList15);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(annotationList20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(annotationList25);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(annotationList34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 52 + "'", int47 == 52);
        org.junit.Assert.assertNotNull(annotationArray48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(annotationList54);
        org.junit.Assert.assertNull(str55);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(annotationList63);
        org.junit.Assert.assertNotNull(wikiModel65);
        org.junit.Assert.assertNotNull(annotationList71);
        org.junit.Assert.assertNotNull(wikiModel73);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 32 + "'", int76 == 32);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("");
        pignlproc.evaluation.NoLoopInPath noLoopInPath3 = new pignlproc.evaluation.NoLoopInPath("\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"");
        java.lang.reflect.Type type4 = noLoopInPath3.getReturnType();
        pignlproc.evaluation.ConcatTextBag concatTextBag6 = new pignlproc.evaluation.ConcatTextBag("\" title \"");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = concatTextBag6.getReporter();
        pignlproc.evaluation.NoLoopInPath noLoopInPath8 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText9 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger10 = null;
        safeTsvText9.setPigLogger(pigLogger10);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText12 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable13 = mergeAsOpenNLPAnnotatedText12.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract14 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = checkAbstract14.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = mergeAsOpenNLPAnnotatedText12.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = safeTsvText9.outputSchema(schema17);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = noLoopInPath8.outputSchema(schema17);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag22 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
        pignlproc.evaluation.NoLoopInPath noLoopInPath23 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText24 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger25 = null;
        safeTsvText24.setPigLogger(pigLogger25);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText27 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable28 = mergeAsOpenNLPAnnotatedText27.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract29 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = checkAbstract29.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = mergeAsOpenNLPAnnotatedText27.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = safeTsvText24.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = noLoopInPath23.outputSchema(schema32);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag35 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText36 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger37 = null;
        safeTsvText36.setPigLogger(pigLogger37);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText39 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable40 = mergeAsOpenNLPAnnotatedText39.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract41 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = checkAbstract41.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = mergeAsOpenNLPAnnotatedText39.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = safeTsvText36.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = aggregateTextBag35.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = noLoopInPath23.outputSchema(schema44);
        pignlproc.evaluation.CheckAbstract checkAbstract48 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum50 = null;
        checkAbstract48.warn("http://.wikipedia.org/wiki/hi%21", enum50);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger52 = null;
        checkAbstract48.setPigLogger(pigLogger52);
        checkAbstract48.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText55 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger56 = null;
        safeTsvText55.setPigLogger(pigLogger56);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText58 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable59 = mergeAsOpenNLPAnnotatedText58.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract60 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = checkAbstract60.outputSchema(schema61);
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = mergeAsOpenNLPAnnotatedText58.outputSchema(schema61);
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = safeTsvText55.outputSchema(schema63);
        org.apache.pig.impl.logicalLayer.schema.Schema schema65 = checkAbstract48.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema66 = noLoopInPath23.outputSchema(schema65);
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = aggregateTextBag22.outputSchema(schema65);
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = noLoopInPath8.outputSchema(schema65);
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = concatTextBag6.outputSchema(schema68);
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = noLoopInPath3.outputSchema(schema69);
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = noLoopInPath1.outputSchema(schema70);
        noLoopInPath1.finish();
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNull(pigProgressable7);
        org.junit.Assert.assertNull(pigProgressable13);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNull(pigProgressable28);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNull(pigProgressable40);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNull(pigProgressable59);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        org.apache.pig.data.Tuple tuple2 = null;
        java.lang.String str3 = concatTextBag1.exec(tuple2);
        pignlproc.evaluation.NoLoopInPath noLoopInPath4 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText5 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = null;
        safeTsvText5.setPigLogger(pigLogger6);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText8 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable9 = mergeAsOpenNLPAnnotatedText8.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract10 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = checkAbstract10.outputSchema(schema11);
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = mergeAsOpenNLPAnnotatedText8.outputSchema(schema11);
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = safeTsvText5.outputSchema(schema13);
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = noLoopInPath4.outputSchema(schema13);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag16 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText17 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = null;
        safeTsvText17.setPigLogger(pigLogger18);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText20 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable21 = mergeAsOpenNLPAnnotatedText20.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract22 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = checkAbstract22.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = mergeAsOpenNLPAnnotatedText20.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = safeTsvText17.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = aggregateTextBag16.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = noLoopInPath4.outputSchema(schema25);
        pignlproc.evaluation.CheckAbstract checkAbstract29 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum31 = null;
        checkAbstract29.warn("http://.wikipedia.org/wiki/hi%21", enum31);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger33 = null;
        checkAbstract29.setPigLogger(pigLogger33);
        checkAbstract29.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText36 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger37 = null;
        safeTsvText36.setPigLogger(pigLogger37);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText39 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable40 = mergeAsOpenNLPAnnotatedText39.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract41 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = checkAbstract41.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = mergeAsOpenNLPAnnotatedText39.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = safeTsvText36.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = checkAbstract29.outputSchema(schema45);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = noLoopInPath4.outputSchema(schema46);
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = concatTextBag1.outputSchema(schema47);
        concatTextBag1.progress();
        org.apache.pig.data.Tuple tuple50 = null;
        java.lang.String str51 = concatTextBag1.exec(tuple50);
        concatTextBag1.progress();
        pignlproc.evaluation.CheckAbstract checkAbstract53 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = checkAbstract53.outputSchema(schema54);
        checkAbstract53.finish();
        java.lang.Enum enum58 = null;
        checkAbstract53.warn("href", enum58);
        pignlproc.evaluation.CheckAbstract checkAbstract60 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum62 = null;
        checkAbstract60.warn("http://.wikipedia.org/wiki/hi%21", enum62);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable64 = null;
        checkAbstract60.setReporter(pigProgressable64);
        java.lang.reflect.Type type66 = checkAbstract60.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath67 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText68 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger69 = null;
        safeTsvText68.setPigLogger(pigLogger69);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText71 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable72 = mergeAsOpenNLPAnnotatedText71.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract73 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = checkAbstract73.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = mergeAsOpenNLPAnnotatedText71.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = safeTsvText68.outputSchema(schema76);
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = noLoopInPath67.outputSchema(schema76);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag79 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText80 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger81 = null;
        safeTsvText80.setPigLogger(pigLogger81);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText83 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable84 = mergeAsOpenNLPAnnotatedText83.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract85 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema86 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema87 = checkAbstract85.outputSchema(schema86);
        org.apache.pig.impl.logicalLayer.schema.Schema schema88 = mergeAsOpenNLPAnnotatedText83.outputSchema(schema86);
        org.apache.pig.impl.logicalLayer.schema.Schema schema89 = safeTsvText80.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema90 = aggregateTextBag79.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema91 = noLoopInPath67.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema92 = checkAbstract60.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema93 = checkAbstract53.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema94 = concatTextBag1.outputSchema(schema93);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList95 = concatTextBag1.getArgToFuncMapping();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(pigProgressable9);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNull(pigProgressable21);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(pigProgressable40);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(type66);
        org.junit.Assert.assertNull(pigProgressable72);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNull(pigProgressable84);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema88);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema91);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema93);
        org.junit.Assert.assertNotNull(schema94);
        org.junit.Assert.assertNull(funcSpecList95);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("", "http://\"title\"\n.wikipedia.org/wiki/\n", "http://http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22");
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("\"\"\" opennlp / en - sent . bin \"\" \"", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = parsingWikipediaLoader1.getSchema("hi!", job4);
        parsingWikipediaLoader1.setUDFContextSignature("hi !\n\nhref");
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceStatistics resourceStatistics10 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521\n", job9);
        org.apache.pig.LoadCaster loadCaster11 = parsingWikipediaLoader1.getLoadCaster();
        org.junit.Assert.assertNotNull(loadCaster2);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(resourceStatistics10);
        org.junit.Assert.assertNotNull(loadCaster11);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText7 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray9 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList10 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList10, spanArray9);
        java.lang.String str12 = mergeAsOpenNLPAnnotatedText7.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList10);
        java.lang.String str13 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList10);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = mergeAsOpenNLPAnnotatedText0.getPigLogger();
        mergeAsOpenNLPAnnotatedText0.progress();
        mergeAsOpenNLPAnnotatedText0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText0.getReporter();
        java.lang.reflect.Type type18 = mergeAsOpenNLPAnnotatedText0.getReturnType();
        org.apache.pig.data.Tuple tuple19 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = mergeAsOpenNLPAnnotatedText0.exec(tuple19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertNotNull(spanArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "href" + "'", str12, "href");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi !" + "'", str13, "hi !");
        org.junit.Assert.assertNull(pigLogger14);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(type18);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser1.makeWikiModel("hi !\n\n");
        info.bliki.wiki.model.WikiModel wikiModel5 = annotatingMarkupParser1.makeWikiModel("http : // hi ! . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin\n");
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNotNull(wikiModel5);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        java.lang.String str3 = annotatingMarkupParser1.parse("\"http://.wikipedia.org/wiki/hi%21\"\n");
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser1.getWikiLinkAnnotations();
        java.lang.String str6 = annotatingMarkupParser1.parse("\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n");
        java.lang.String str7 = annotatingMarkupParser1.getRedirect();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\"http://.wikipedia.org/wiki/hi%21\"\n\n" + "'", str3, "\"http://.wikipedia.org/wiki/hi%21\"\n\n");
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n\n" + "'", str6, "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n\n");
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        java.lang.reflect.Type type7 = sentencesWithLink0.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = sentencesWithLink0.getArgToFuncMapping();
        sentencesWithLink0.progress();
        boolean boolean10 = sentencesWithLink0.isAsynchronous();
        java.lang.reflect.Type type11 = sentencesWithLink0.getReturnType();
        java.lang.reflect.Type type12 = sentencesWithLink0.getReturnType();
        sentencesWithLink0.progress();
        sentencesWithLink0.progress();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("\"opennlp / en - sent . bin\"\n", "\" http : // . wikipedia . org / wiki / hi % 21 \"", "http://.wikipedia.org/wiki/%22_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22");
        uriUriNTriplesStorer3.setStoreFuncUDFContextSignature("http://http://.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org/wiki/http%3A%2F%2F%22hi%21%22%0A.wikipedia.org%2Fwiki%2F%2522hi%2521_%2522");
        org.apache.pig.data.Tuple tuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.putNext(tuple6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.RecordReader recordReader6 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit7 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader6, pigSplit7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceSchema resourceSchema11 = uriStringLiteralNTriplesLoader2.getSchema("hi !", job10);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(resourceSchema11);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText7 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray9 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList10 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList10, spanArray9);
        java.lang.String str12 = mergeAsOpenNLPAnnotatedText7.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList10);
        java.lang.String str13 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList10);
        pignlproc.evaluation.SafeTsvText safeTsvText14 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type15 = safeTsvText14.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract16 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = checkAbstract16.outputSchema(schema17);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText14.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema18);
        boolean boolean21 = mergeAsOpenNLPAnnotatedText0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList22 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable23 = mergeAsOpenNLPAnnotatedText0.getReporter();
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertNotNull(spanArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "href" + "'", str12, "href");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "hi !" + "'", str13, "hi !");
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(funcSpecList22);
        org.junit.Assert.assertNull(pigProgressable23);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser1.makeWikiModel("hi !\n\n");
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser1.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser1.getWikiLinkAnnotations();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser1.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser1.getWikiLinkAnnotations();
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(annotationList7);
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/%22%22%22_http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22%22%22");
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        java.lang.String str6 = annotatingMarkupParser0.parse("");
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser0.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser8.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel11 = annotatingMarkupParser8.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList12 = annotatingMarkupParser8.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList13 = annotatingMarkupParser8.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList15 = annotatingMarkupParser14.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser16 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList17 = annotatingMarkupParser16.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser16.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList19 = annotatingMarkupParser16.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser20 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser20.getHeaders();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser20.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList23 = annotatingMarkupParser20.getHeaderAnnotations();
        java.lang.String str24 = annotatingMarkupParser20.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser25.getHeaders();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser25.getHeaders();
        java.lang.Appendable appendable28 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser25.new CountingAppendable(appendable28);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable30 = annotatingMarkupParser20.new CountingAppendable((java.lang.Appendable) countingAppendable29);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser31 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList32 = annotatingMarkupParser31.getHeaderAnnotations();
        java.lang.String str33 = annotatingMarkupParser31.getRedirect();
        pignlproc.markup.Annotation annotation38 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation43 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int44 = annotation43.end;
        int int45 = annotation43.begin;
        pignlproc.markup.Annotation[] annotationArray46 = new pignlproc.markup.Annotation[] { annotation38, annotation43 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList47 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean48 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList47, annotationArray46);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser49 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList50 = annotatingMarkupParser49.getHeaders();
        java.util.List<java.lang.String> strList51 = annotatingMarkupParser49.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList52 = annotatingMarkupParser49.getHeaderAnnotations();
        java.lang.String str53 = annotatingMarkupParser49.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser54 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList55 = annotatingMarkupParser54.getHeaders();
        java.util.List<java.lang.String> strList56 = annotatingMarkupParser54.getHeaders();
        java.lang.Appendable appendable57 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable58 = annotatingMarkupParser54.new CountingAppendable(appendable57);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable59 = annotatingMarkupParser49.new CountingAppendable((java.lang.Appendable) countingAppendable58);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser60 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList61 = annotatingMarkupParser60.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel63 = annotatingMarkupParser60.makeWikiModel("title");
        annotatingMarkupParser31.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList47, (java.lang.Appendable) countingAppendable58, (info.bliki.wiki.model.IWikiModel) wikiModel63);
        annotatingMarkupParser14.nodesToText(annotationList19, (java.lang.Appendable) countingAppendable30, (info.bliki.wiki.model.IWikiModel) wikiModel63);
        countingAppendable30.currentPosition = ' ';
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser68 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList69 = annotatingMarkupParser68.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel71 = annotatingMarkupParser68.makeWikiModel("title");
        annotatingMarkupParser0.nodesToText(annotationList13, (java.lang.Appendable) countingAppendable30, (info.bliki.wiki.model.IWikiModel) wikiModel71);
        java.util.List<pignlproc.markup.Annotation> annotationList73 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList74 = annotatingMarkupParser0.getHeaderAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel76 = annotatingMarkupParser0.makeWikiModel("\"\"\" http : // hi ! . wikipedia . org / wiki / http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 % 0 A . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 \"\"\" href");
        java.util.List<pignlproc.markup.Annotation> annotationList77 = annotatingMarkupParser0.getParagraphAnnotations();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(wikiModel11);
        org.junit.Assert.assertNotNull(annotationList12);
        org.junit.Assert.assertNotNull(annotationList13);
        org.junit.Assert.assertNotNull(annotationList15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNotNull(annotationList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(annotationList32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 52 + "'", int45 == 52);
        org.junit.Assert.assertNotNull(annotationArray46);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(annotationList52);
        org.junit.Assert.assertNull(str53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(annotationList61);
        org.junit.Assert.assertNotNull(wikiModel63);
        org.junit.Assert.assertNotNull(annotationList69);
        org.junit.Assert.assertNotNull(wikiModel71);
        org.junit.Assert.assertNotNull(annotationList73);
        org.junit.Assert.assertNotNull(annotationList74);
        org.junit.Assert.assertNotNull(wikiModel76);
        org.junit.Assert.assertNotNull(annotationList77);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = safeTsvText0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        safeTsvText0.setReporter(pigProgressable5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = null;
        safeTsvText0.setReporter(pigProgressable7);
        boolean boolean9 = safeTsvText0.isAsynchronous();
        java.lang.Enum enum11 = null;
        safeTsvText0.warn("\"title\"\n", enum11);
        pignlproc.evaluation.ConcatTextBag concatTextBag14 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum17 = null;
        checkAbstract15.warn("http://.wikipedia.org/wiki/hi%21", enum17);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger19 = null;
        checkAbstract15.setPigLogger(pigLogger19);
        checkAbstract15.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText22 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger23 = null;
        safeTsvText22.setPigLogger(pigLogger23);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText25 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable26 = mergeAsOpenNLPAnnotatedText25.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = checkAbstract27.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = mergeAsOpenNLPAnnotatedText25.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = safeTsvText22.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = checkAbstract15.outputSchema(schema31);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = concatTextBag14.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = safeTsvText0.outputSchema(schema32);
        pignlproc.evaluation.CheckAbstract checkAbstract36 = new pignlproc.evaluation.CheckAbstract((int) 'a');
        pignlproc.evaluation.SafeTsvText safeTsvText37 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger38 = null;
        safeTsvText37.setPigLogger(pigLogger38);
        org.apache.commons.logging.Log log40 = safeTsvText37.getLogger();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList41 = safeTsvText37.getArgToFuncMapping();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink42 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList43 = sentencesWithLink42.getArgToFuncMapping();
        pignlproc.evaluation.CheckAbstract checkAbstract44 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum46 = null;
        checkAbstract44.warn("http://.wikipedia.org/wiki/hi%21", enum46);
        java.lang.Enum enum49 = null;
        checkAbstract44.warn("hi !", enum49);
        pignlproc.evaluation.NoLoopInPath noLoopInPath51 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText52 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger53 = null;
        safeTsvText52.setPigLogger(pigLogger53);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText55 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable56 = mergeAsOpenNLPAnnotatedText55.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract57 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = checkAbstract57.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = mergeAsOpenNLPAnnotatedText55.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = safeTsvText52.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = noLoopInPath51.outputSchema(schema60);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag63 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText64 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger65 = null;
        safeTsvText64.setPigLogger(pigLogger65);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText67 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable68 = mergeAsOpenNLPAnnotatedText67.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract69 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = checkAbstract69.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = mergeAsOpenNLPAnnotatedText67.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = safeTsvText64.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = aggregateTextBag63.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = noLoopInPath51.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = checkAbstract44.outputSchema(schema75);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = sentencesWithLink42.outputSchema(schema76);
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = safeTsvText37.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema79 = checkAbstract36.outputSchema(schema77);
        org.apache.pig.impl.logicalLayer.schema.Schema schema80 = safeTsvText0.outputSchema(schema79);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger81 = safeTsvText0.getPigLogger();
        org.apache.pig.data.Tuple tuple82 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str83 = safeTsvText0.exec(tuple82);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(pigProgressable26);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(log40);
        org.junit.Assert.assertNull(funcSpecList41);
        org.junit.Assert.assertNull(funcSpecList43);
        org.junit.Assert.assertNull(pigProgressable56);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNull(pigProgressable68);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNull(pigLogger81);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList3);
        pignlproc.evaluation.ConcatTextBag concatTextBag7 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum10 = null;
        checkAbstract8.warn("http://.wikipedia.org/wiki/hi%21", enum10);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger12 = null;
        checkAbstract8.setPigLogger(pigLogger12);
        checkAbstract8.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = checkAbstract8.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = concatTextBag7.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema25);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText29 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray31 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList32 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList32, spanArray31);
        java.lang.String str34 = mergeAsOpenNLPAnnotatedText29.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList32);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        mergeAsOpenNLPAnnotatedText29.setPigLogger(pigLogger35);
        boolean boolean37 = mergeAsOpenNLPAnnotatedText29.isAsynchronous();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText39 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray41 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList42 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList42, spanArray41);
        java.lang.String str44 = mergeAsOpenNLPAnnotatedText39.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList42);
        java.lang.String str45 = mergeAsOpenNLPAnnotatedText29.merge("opennlp/en-sent.bin", (java.util.List<opennlp.tools.util.Span>) spanList42);
        java.lang.String str46 = mergeAsOpenNLPAnnotatedText0.merge("\"title\"", (java.util.List<opennlp.tools.util.Span>) spanList42);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger47 = null;
        mergeAsOpenNLPAnnotatedText0.setPigLogger(pigLogger47);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText50 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray52 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList53 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean54 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList53, spanArray52);
        java.lang.String str55 = mergeAsOpenNLPAnnotatedText50.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList53);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList56 = mergeAsOpenNLPAnnotatedText50.getArgToFuncMapping();
        boolean boolean57 = mergeAsOpenNLPAnnotatedText50.isAsynchronous();
        java.lang.reflect.Type type58 = mergeAsOpenNLPAnnotatedText50.getReturnType();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText61 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText63 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray65 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList66 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList66, spanArray65);
        java.lang.String str68 = mergeAsOpenNLPAnnotatedText63.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList66);
        java.lang.String str69 = mergeAsOpenNLPAnnotatedText61.merge("http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", (java.util.List<opennlp.tools.util.Span>) spanList66);
        java.lang.String str70 = mergeAsOpenNLPAnnotatedText50.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList66);
        java.lang.String str71 = mergeAsOpenNLPAnnotatedText0.merge("opennlp/en-sent.bin", (java.util.List<opennlp.tools.util.Span>) spanList66);
        org.apache.commons.logging.Log log72 = mergeAsOpenNLPAnnotatedText0.getLogger();
        org.apache.commons.logging.Log log73 = mergeAsOpenNLPAnnotatedText0.getLogger();
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "href" + "'", str5, "href");
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(spanArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "hi !" + "'", str34, "hi !");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(spanArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "href" + "'", str44, "href");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "opennlp / en - sent . bin" + "'", str45, "opennlp / en - sent . bin");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "\" title \"" + "'", str46, "\" title \"");
        org.junit.Assert.assertNotNull(spanArray52);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + false + "'", boolean54 == false);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "hi !" + "'", str55, "hi !");
        org.junit.Assert.assertNull(funcSpecList56);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(type58);
        org.junit.Assert.assertNotNull(spanArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "href" + "'", str68, "href");
        org.junit.Assert.assertEquals("'" + str69 + "' != '" + "http : // hi ! . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin" + "'", str69, "http : // hi ! . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin");
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "hi !" + "'", str70, "hi !");
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "opennlp / en - sent . bin" + "'", str71, "opennlp / en - sent . bin");
        org.junit.Assert.assertNotNull(log72);
        org.junit.Assert.assertNotNull(log73);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("\"\"\" http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 \"\"\"", "\"\"\"title\"\" \"hrefhref", "\"\"\"\"\"\"\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22href\"\"\"\"\"\"\"");
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = checkAbstract0.getReporter();
        checkAbstract0.progress();
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = checkAbstract0.exec(tuple5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = checkAbstract0.getPigLogger();
        boolean boolean8 = checkAbstract0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable9 = checkAbstract0.getReporter();
        java.lang.Enum enum11 = null;
        checkAbstract0.warn("\"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\" \"\"\"", enum11);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pigProgressable9);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract(52);
        pignlproc.evaluation.ConcatTextBag concatTextBag3 = new pignlproc.evaluation.ConcatTextBag("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"href");
        boolean boolean4 = concatTextBag3.isAsynchronous();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink5 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = sentencesWithLink5.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        sentencesWithLink5.setPigLogger(pigLogger7);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable9 = null;
        sentencesWithLink5.setReporter(pigProgressable9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = sentencesWithLink5.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable12 = null;
        sentencesWithLink5.setReporter(pigProgressable12);
        boolean boolean14 = sentencesWithLink5.isAsynchronous();
        pignlproc.evaluation.AggregateTextBag aggregateTextBag16 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        aggregateTextBag16.progress();
        pignlproc.evaluation.ConcatTextBag concatTextBag19 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum22 = null;
        checkAbstract20.warn("http://.wikipedia.org/wiki/hi%21", enum22);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger24 = null;
        checkAbstract20.setPigLogger(pigLogger24);
        checkAbstract20.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText27 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = null;
        safeTsvText27.setPigLogger(pigLogger28);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText30 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = mergeAsOpenNLPAnnotatedText30.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract32 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract32.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = mergeAsOpenNLPAnnotatedText30.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = safeTsvText27.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = checkAbstract20.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = concatTextBag19.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = aggregateTextBag16.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = sentencesWithLink5.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = concatTextBag3.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = checkAbstract1.outputSchema(schema38);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(funcSpecList6);
        org.junit.Assert.assertNull(pigLogger11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(pigProgressable31);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        sentencesWithLink0.finish();
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag5 = sentencesWithLink0.exec(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"");
        org.apache.commons.logging.Log log2 = concatTextBag1.getLogger();
        org.junit.Assert.assertNotNull(log2);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("\"hi!\"\n\n", false);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.InputFormat inputFormat9 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriUriNTriplesLoader3.getSchema("wikiobject", job11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceSchema resourceSchema15 = uriUriNTriplesLoader3.getSchema("http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href", job14);
        org.apache.hadoop.mapreduce.RecordReader recordReader16 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit17 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader16, pigSplit17);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(inputFormat9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNotNull(resourceSchema15);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        countingAppendable4.currentPosition = (byte) -1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable10 = countingAppendable4.append((java.lang.CharSequence) "hi !", (int) (short) 10, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        pignlproc.evaluation.CheckAbstract checkAbstract2 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum4 = null;
        checkAbstract2.warn("http://.wikipedia.org/wiki/hi%21", enum4);
        java.lang.Enum enum7 = null;
        checkAbstract2.warn("hi !", enum7);
        pignlproc.evaluation.NoLoopInPath noLoopInPath9 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = noLoopInPath9.outputSchema(schema18);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag21 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText22 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger23 = null;
        safeTsvText22.setPigLogger(pigLogger23);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText25 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable26 = mergeAsOpenNLPAnnotatedText25.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = checkAbstract27.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = mergeAsOpenNLPAnnotatedText25.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = safeTsvText22.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = aggregateTextBag21.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = noLoopInPath9.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract2.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = sentencesWithLink0.outputSchema(schema34);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger36 = null;
        sentencesWithLink0.setPigLogger(pigLogger36);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger38 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger39 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger40 = null;
        sentencesWithLink0.setPigLogger(pigLogger40);
        java.lang.Enum enum43 = null;
        sentencesWithLink0.warn("\"http://hi! .wikipedia.org/wiki/%22_title_%22\"", enum43);
        org.junit.Assert.assertNull(funcSpecList1);
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(pigProgressable26);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(pigLogger38);
        org.junit.Assert.assertNull(pigLogger39);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        pignlproc.evaluation.NoLoopInPath noLoopInPath0 = new pignlproc.evaluation.NoLoopInPath();
        noLoopInPath0.progress();
        pignlproc.evaluation.NoLoopInPath noLoopInPath2 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText3 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = null;
        safeTsvText3.setPigLogger(pigLogger4);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText6 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = mergeAsOpenNLPAnnotatedText6.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = checkAbstract8.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = mergeAsOpenNLPAnnotatedText6.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = safeTsvText3.outputSchema(schema11);
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = noLoopInPath2.outputSchema(schema11);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag14 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = aggregateTextBag14.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = noLoopInPath2.outputSchema(schema23);
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum29 = null;
        checkAbstract27.warn("http://.wikipedia.org/wiki/hi%21", enum29);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        checkAbstract27.setPigLogger(pigLogger31);
        checkAbstract27.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText34 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        safeTsvText34.setPigLogger(pigLogger35);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText37 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable38 = mergeAsOpenNLPAnnotatedText37.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract39 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = checkAbstract39.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = mergeAsOpenNLPAnnotatedText37.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = safeTsvText34.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = checkAbstract27.outputSchema(schema43);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = noLoopInPath2.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = noLoopInPath0.outputSchema(schema44);
        boolean boolean47 = noLoopInPath0.isAsynchronous();
        pignlproc.evaluation.ConcatTextBag concatTextBag50 = new pignlproc.evaluation.ConcatTextBag("title", false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger51 = null;
        concatTextBag50.setPigLogger(pigLogger51);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText53 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable54 = mergeAsOpenNLPAnnotatedText53.getReporter();
        java.lang.Enum enum56 = null;
        mergeAsOpenNLPAnnotatedText53.warn("title", enum56);
        org.apache.commons.logging.Log log58 = mergeAsOpenNLPAnnotatedText53.getLogger();
        pignlproc.evaluation.SafeTsvText safeTsvText59 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type60 = safeTsvText59.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract61 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = checkAbstract61.outputSchema(schema62);
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = safeTsvText59.outputSchema(schema63);
        org.apache.pig.impl.logicalLayer.schema.Schema schema65 = mergeAsOpenNLPAnnotatedText53.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema66 = concatTextBag50.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = noLoopInPath0.outputSchema(schema66);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable68 = null;
        noLoopInPath0.setReporter(pigProgressable68);
        org.junit.Assert.assertNull(pigProgressable7);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(pigProgressable38);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNull(pigProgressable54);
        org.junit.Assert.assertNotNull(log58);
        org.junit.Assert.assertNotNull(type60);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema67);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        safeTsvText0.setPigLogger(pigLogger1);
        safeTsvText0.finish();
        java.lang.reflect.Type type4 = safeTsvText0.getReturnType();
        java.lang.reflect.Type type5 = safeTsvText0.getReturnType();
        org.apache.pig.data.Tuple tuple6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = safeTsvText0.exec(tuple6);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type4);
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.InputFormat inputFormat9 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriUriNTriplesLoader3.getSchema("wikiobject", job11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceStatistics resourceStatistics15 = uriUriNTriplesLoader3.getStatistics("opennlp / en - sent . bin", job14);
        org.apache.hadoop.mapreduce.RecordReader recordReader16 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit17 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader16, pigSplit17);
        org.apache.hadoop.mapreduce.Job job20 = null;
        org.apache.pig.ResourceSchema resourceSchema21 = uriUriNTriplesLoader3.getSchema("\"hi!\"", job20);
        org.apache.hadoop.mapreduce.Job job23 = null;
        org.apache.pig.ResourceSchema resourceSchema24 = uriUriNTriplesLoader3.getSchema("\"http://titlehref.wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2Fhttp%3A%2F%2F%22%22title%22%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_hi_%2521_._wikipedia_._org_%252F_wiki_%252F_opennlp___%2525_2_F___en___-___sent___.___bin\"", job23);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(inputFormat9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNull(resourceStatistics15);
        org.junit.Assert.assertNotNull(resourceSchema21);
        org.junit.Assert.assertNotNull(resourceSchema24);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str2 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.Annotation annotation7 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation12 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int13 = annotation12.end;
        int int14 = annotation12.begin;
        pignlproc.markup.Annotation[] annotationArray15 = new pignlproc.markup.Annotation[] { annotation7, annotation12 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList16 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList16, annotationArray15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser18.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser18.getHeaderAnnotations();
        java.lang.String str22 = annotatingMarkupParser18.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser23 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser23.getHeaders();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser23.getHeaders();
        java.lang.Appendable appendable26 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable27 = annotatingMarkupParser23.new CountingAppendable(appendable26);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser18.new CountingAppendable((java.lang.Appendable) countingAppendable27);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser29 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList30 = annotatingMarkupParser29.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel32 = annotatingMarkupParser29.makeWikiModel("title");
        annotatingMarkupParser0.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList16, (java.lang.Appendable) countingAppendable27, (info.bliki.wiki.model.IWikiModel) wikiModel32);
        java.util.List<pignlproc.markup.Annotation> annotationList34 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.lang.String str36 = annotatingMarkupParser0.parse("\"hi!\"");
        java.util.List<java.lang.String> strList37 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList38 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList39 = annotatingMarkupParser0.getHeaders();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser40 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList41 = annotatingMarkupParser40.getHeaders();
        java.util.List<java.lang.String> strList42 = annotatingMarkupParser40.getHeaders();
        java.util.List<java.lang.String> strList43 = annotatingMarkupParser40.getHeaders();
        java.util.List<java.lang.String> strList44 = annotatingMarkupParser40.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel46 = annotatingMarkupParser40.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser47 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList48 = annotatingMarkupParser47.getHeaders();
        java.util.List<java.lang.String> strList49 = annotatingMarkupParser47.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList50 = annotatingMarkupParser47.getHeaderAnnotations();
        java.lang.String str51 = annotatingMarkupParser47.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser52 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList53 = annotatingMarkupParser52.getHeaders();
        java.util.List<java.lang.String> strList54 = annotatingMarkupParser52.getHeaders();
        java.lang.Appendable appendable55 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable56 = annotatingMarkupParser52.new CountingAppendable(appendable55);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable57 = annotatingMarkupParser47.new CountingAppendable((java.lang.Appendable) countingAppendable56);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser58 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList59 = annotatingMarkupParser58.getHeaders();
        java.util.List<java.lang.String> strList60 = annotatingMarkupParser58.getHeaders();
        java.lang.Appendable appendable61 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable62 = annotatingMarkupParser58.new CountingAppendable(appendable61);
        countingAppendable62.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable65 = annotatingMarkupParser47.new CountingAppendable((java.lang.Appendable) countingAppendable62);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser66 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList67 = annotatingMarkupParser66.getHeaders();
        java.util.List<java.lang.String> strList68 = annotatingMarkupParser66.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList69 = annotatingMarkupParser66.getHeaderAnnotations();
        java.lang.String str70 = annotatingMarkupParser66.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser71 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList72 = annotatingMarkupParser71.getHeaders();
        java.util.List<java.lang.String> strList73 = annotatingMarkupParser71.getHeaders();
        java.lang.Appendable appendable74 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable75 = annotatingMarkupParser71.new CountingAppendable(appendable74);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable76 = annotatingMarkupParser66.new CountingAppendable((java.lang.Appendable) countingAppendable75);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable77 = annotatingMarkupParser47.new CountingAppendable((java.lang.Appendable) countingAppendable75);
        countingAppendable75.currentPosition = 0;
        countingAppendable75.currentPosition = (short) 1;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable82 = annotatingMarkupParser40.new CountingAppendable((java.lang.Appendable) countingAppendable75);
        int int83 = countingAppendable82.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable84 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable82);
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(annotationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(annotationList30);
        org.junit.Assert.assertNotNull(wikiModel32);
        org.junit.Assert.assertNotNull(annotationList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"hi!\"\n" + "'", str36, "\"hi!\"\n");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(annotationList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(wikiModel46);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(annotationList50);
        org.junit.Assert.assertNull(str51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList67);
        org.junit.Assert.assertNotNull(strList68);
        org.junit.Assert.assertNotNull(annotationList69);
        org.junit.Assert.assertNull(str70);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 0 + "'", int83 == 0);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("http://\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/http_%3A_%2F%2F_hi_%21_._wikipedia_._org_%2F_wiki_%2F_opennlp___%25_2_F___en___-___sent___.___bin", "http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\n", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceStatistics resourceStatistics9 = uriStringLiteralNTriplesLoader2.getStatistics("\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\"\"", job8);
        org.apache.hadoop.fs.Path path11 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = uriStringLiteralNTriplesLoader2.relativeToAbsolutePath("\"opennlp/en-sent.bin\"", path11);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"opennlp/en-sent.bin\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
        org.junit.Assert.assertNull(resourceStatistics9);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        sentencesWithLink0.setReporter(pigProgressable4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = sentencesWithLink0.getReporter();
        java.lang.Enum enum8 = null;
        sentencesWithLink0.warn("http://\"title\".wikipedia.org/wiki/%22hi%21%22", enum8);
        java.lang.reflect.Type type10 = sentencesWithLink0.getReturnType();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText11 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable12 = mergeAsOpenNLPAnnotatedText11.getReporter();
        java.lang.Enum enum14 = null;
        mergeAsOpenNLPAnnotatedText11.warn("title", enum14);
        org.apache.commons.logging.Log log16 = mergeAsOpenNLPAnnotatedText11.getLogger();
        pignlproc.evaluation.SafeTsvText safeTsvText17 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type18 = safeTsvText17.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract19 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = checkAbstract19.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText17.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText11.outputSchema(schema22);
        org.apache.commons.logging.Log log24 = mergeAsOpenNLPAnnotatedText11.getLogger();
        pignlproc.evaluation.CheckAbstract checkAbstract26 = new pignlproc.evaluation.CheckAbstract(10);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag29 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 1, false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable30 = null;
        aggregateTextBag29.setReporter(pigProgressable30);
        pignlproc.evaluation.ConcatTextBag concatTextBag33 = new pignlproc.evaluation.ConcatTextBag("opennlp/en-sent.bin");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable34 = concatTextBag33.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = concatTextBag33.getPigLogger();
        java.lang.Enum enum37 = null;
        concatTextBag33.warn("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", enum37);
        boolean boolean39 = concatTextBag33.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath40 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText41 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger42 = null;
        safeTsvText41.setPigLogger(pigLogger42);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText44 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable45 = mergeAsOpenNLPAnnotatedText44.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract46 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract46.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = mergeAsOpenNLPAnnotatedText44.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = safeTsvText41.outputSchema(schema49);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = noLoopInPath40.outputSchema(schema49);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag52 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText53 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger54 = null;
        safeTsvText53.setPigLogger(pigLogger54);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText56 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable57 = mergeAsOpenNLPAnnotatedText56.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract58 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = checkAbstract58.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = mergeAsOpenNLPAnnotatedText56.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = safeTsvText53.outputSchema(schema61);
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = aggregateTextBag52.outputSchema(schema61);
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = noLoopInPath40.outputSchema(schema61);
        pignlproc.evaluation.CheckAbstract checkAbstract65 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum67 = null;
        checkAbstract65.warn("http://.wikipedia.org/wiki/hi%21", enum67);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger69 = null;
        checkAbstract65.setPigLogger(pigLogger69);
        checkAbstract65.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText72 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger73 = null;
        safeTsvText72.setPigLogger(pigLogger73);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText75 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable76 = mergeAsOpenNLPAnnotatedText75.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract77 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema79 = checkAbstract77.outputSchema(schema78);
        org.apache.pig.impl.logicalLayer.schema.Schema schema80 = mergeAsOpenNLPAnnotatedText75.outputSchema(schema78);
        org.apache.pig.impl.logicalLayer.schema.Schema schema81 = safeTsvText72.outputSchema(schema80);
        org.apache.pig.impl.logicalLayer.schema.Schema schema82 = checkAbstract65.outputSchema(schema81);
        org.apache.pig.impl.logicalLayer.schema.Schema schema83 = noLoopInPath40.outputSchema(schema82);
        org.apache.pig.impl.logicalLayer.schema.Schema schema84 = concatTextBag33.outputSchema(schema83);
        org.apache.pig.impl.logicalLayer.schema.Schema schema85 = aggregateTextBag29.outputSchema(schema83);
        org.apache.pig.impl.logicalLayer.schema.Schema schema86 = checkAbstract26.outputSchema(schema85);
        org.apache.pig.impl.logicalLayer.schema.Schema schema87 = mergeAsOpenNLPAnnotatedText11.outputSchema(schema86);
        org.apache.pig.impl.logicalLayer.schema.Schema schema88 = sentencesWithLink0.outputSchema(schema87);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNotNull(type10);
        org.junit.Assert.assertNull(pigProgressable12);
        org.junit.Assert.assertNotNull(log16);
        org.junit.Assert.assertNotNull(type18);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(log24);
        org.junit.Assert.assertNull(pigProgressable34);
        org.junit.Assert.assertNull(pigLogger35);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(pigProgressable45);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNull(pigProgressable57);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNull(pigProgressable76);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema88);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22", true);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = concatTextBag2.getReporter();
        pignlproc.evaluation.NoLoopInPath noLoopInPath5 = new pignlproc.evaluation.NoLoopInPath("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22href");
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        org.apache.pig.data.Tuple tuple9 = null;
        java.lang.Boolean boolean10 = checkAbstract6.exec(tuple9);
        java.lang.Enum enum12 = null;
        checkAbstract6.warn("href", enum12);
        org.apache.pig.data.Tuple tuple14 = null;
        java.lang.Boolean boolean15 = checkAbstract6.exec(tuple14);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList16 = checkAbstract6.getArgToFuncMapping();
        checkAbstract6.progress();
        checkAbstract6.progress();
        checkAbstract6.finish();
        pignlproc.evaluation.NoLoopInPath noLoopInPath20 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText21 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger22 = null;
        safeTsvText21.setPigLogger(pigLogger22);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText24 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable25 = mergeAsOpenNLPAnnotatedText24.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract26 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = checkAbstract26.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = mergeAsOpenNLPAnnotatedText24.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = safeTsvText21.outputSchema(schema29);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = noLoopInPath20.outputSchema(schema29);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink32 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath33 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText34 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        safeTsvText34.setPigLogger(pigLogger35);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText37 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable38 = mergeAsOpenNLPAnnotatedText37.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract39 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = checkAbstract39.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = mergeAsOpenNLPAnnotatedText37.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = safeTsvText34.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = noLoopInPath33.outputSchema(schema42);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag45 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText46 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger47 = null;
        safeTsvText46.setPigLogger(pigLogger47);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText49 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable50 = mergeAsOpenNLPAnnotatedText49.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract51 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = checkAbstract51.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = mergeAsOpenNLPAnnotatedText49.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = safeTsvText46.outputSchema(schema54);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = aggregateTextBag45.outputSchema(schema54);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = noLoopInPath33.outputSchema(schema54);
        pignlproc.evaluation.CheckAbstract checkAbstract58 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum60 = null;
        checkAbstract58.warn("http://.wikipedia.org/wiki/hi%21", enum60);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger62 = null;
        checkAbstract58.setPigLogger(pigLogger62);
        checkAbstract58.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText65 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger66 = null;
        safeTsvText65.setPigLogger(pigLogger66);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText68 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable69 = mergeAsOpenNLPAnnotatedText68.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract70 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = checkAbstract70.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = mergeAsOpenNLPAnnotatedText68.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = safeTsvText65.outputSchema(schema73);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = checkAbstract58.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = noLoopInPath33.outputSchema(schema75);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = sentencesWithLink32.outputSchema(schema76);
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = noLoopInPath20.outputSchema(schema76);
        org.apache.pig.impl.logicalLayer.schema.Schema schema79 = checkAbstract6.outputSchema(schema78);
        org.apache.pig.impl.logicalLayer.schema.Schema schema80 = noLoopInPath5.outputSchema(schema78);
        org.apache.pig.impl.logicalLayer.schema.Schema schema81 = concatTextBag2.outputSchema(schema80);
        java.lang.Enum enum83 = null;
        concatTextBag2.warn("http://\"opennlp/en-sent.bin\"\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhref%0A.wikipedia.org%2Fwiki%2F%2522%2522", enum83);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertEquals("'" + boolean10 + "' != '" + false + "'", boolean10, false);
        org.junit.Assert.assertEquals("'" + boolean15 + "' != '" + false + "'", boolean15, false);
        org.junit.Assert.assertNull(funcSpecList16);
        org.junit.Assert.assertNull(pigProgressable25);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNull(pigProgressable38);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNull(pigProgressable50);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNull(pigProgressable69);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(schema79);
        org.junit.Assert.assertNotNull(schema80);
        org.junit.Assert.assertNotNull(schema81);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        sentencesWithLink0.setPigLogger(pigLogger2);
        sentencesWithLink0.progress();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = null;
        sentencesWithLink0.setReporter(pigProgressable6);
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (short) 10, 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", "hi !", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriUriNTriplesStorer3.getOutputFormat();
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader7 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceSchema resourceSchema10 = uriStringLiteralNTriplesLoader7.getSchema("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.hadoop.mapreduce.InputFormat inputFormat11 = uriStringLiteralNTriplesLoader7.getInputFormat();
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceSchema resourceSchema14 = uriStringLiteralNTriplesLoader7.getSchema("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", job13);
        org.apache.hadoop.mapreduce.Job job16 = null;
        org.apache.pig.ResourceSchema resourceSchema17 = uriStringLiteralNTriplesLoader7.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job16);
        org.apache.hadoop.mapreduce.Job job19 = null;
        org.apache.pig.ResourceSchema resourceSchema20 = uriStringLiteralNTriplesLoader7.getSchema("title\n\n", job19);
        org.apache.hadoop.mapreduce.Job job22 = null;
        org.apache.pig.ResourceSchema resourceSchema23 = uriStringLiteralNTriplesLoader7.getSchema("\"http://.wikipedia.org/wiki/hi%21\"\n\n", job22);
        uriUriNTriplesStorer3.checkSchema(resourceSchema23);
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader28 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job30 = null;
        org.apache.pig.ResourceSchema resourceSchema31 = uriUriNTriplesLoader28.getSchema("", job30);
        org.apache.hadoop.mapreduce.Job job33 = null;
        org.apache.pig.ResourceSchema resourceSchema34 = uriUriNTriplesLoader28.getSchema("http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522", job33);
        org.apache.hadoop.mapreduce.Job job36 = null;
        java.lang.String[] strArray37 = uriUriNTriplesLoader28.getPartitionKeys("", job36);
        org.apache.hadoop.mapreduce.Job job39 = null;
        org.apache.pig.ResourceSchema resourceSchema40 = uriUriNTriplesLoader28.getSchema("http://hi!\n.wikipedia.org/wiki/%22_title_%22", job39);
        uriUriNTriplesStorer3.checkSchema(resourceSchema40);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat42 = uriUriNTriplesStorer3.getOutputFormat();
        org.junit.Assert.assertNotNull(outputFormat4);
        org.junit.Assert.assertNotNull(resourceSchema10);
        org.junit.Assert.assertNotNull(inputFormat11);
        org.junit.Assert.assertNotNull(resourceSchema14);
        org.junit.Assert.assertNotNull(resourceSchema17);
        org.junit.Assert.assertNotNull(resourceSchema20);
        org.junit.Assert.assertNotNull(resourceSchema23);
        org.junit.Assert.assertNotNull(resourceSchema31);
        org.junit.Assert.assertNotNull(resourceSchema34);
        org.junit.Assert.assertNull(strArray37);
        org.junit.Assert.assertNotNull(resourceSchema40);
        org.junit.Assert.assertNotNull(outputFormat42);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        sentencesWithLink0.setPigLogger(pigLogger2);
        sentencesWithLink0.finish();
        org.junit.Assert.assertNull(funcSpecList1);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList1 = sentencesWithLink0.getArgToFuncMapping();
        pignlproc.evaluation.CheckAbstract checkAbstract2 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum4 = null;
        checkAbstract2.warn("http://.wikipedia.org/wiki/hi%21", enum4);
        java.lang.Enum enum7 = null;
        checkAbstract2.warn("hi !", enum7);
        pignlproc.evaluation.NoLoopInPath noLoopInPath9 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = noLoopInPath9.outputSchema(schema18);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag21 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText22 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger23 = null;
        safeTsvText22.setPigLogger(pigLogger23);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText25 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable26 = mergeAsOpenNLPAnnotatedText25.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = checkAbstract27.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = mergeAsOpenNLPAnnotatedText25.outputSchema(schema28);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = safeTsvText22.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = aggregateTextBag21.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = noLoopInPath9.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract2.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = sentencesWithLink0.outputSchema(schema34);
        java.lang.Enum enum37 = null;
        sentencesWithLink0.warn("http://\"title\"\n.wikipedia.org/wiki/\n", enum37);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger39 = sentencesWithLink0.getPigLogger();
        org.junit.Assert.assertNull(funcSpecList1);
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(pigProgressable26);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNull(pigLogger39);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/hi%21\n", "http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/http%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhrefwikiobject%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22wikiobject%22hi%21%22%0Awikiobject%0Awikiobjectopennlp%2Fen-sent.binwikiobjecthttp%3A%2F%2Fhi%21%0A.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._binwikiobjecthttp%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521wikiobjecthttp%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522wikiobject%22opennlp_%2F_en_-_sent_._bin%22wikiobject%22%22", "http://http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22\n");
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        sentencesWithLink0.setReporter(pigProgressable4);
        sentencesWithLink0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = null;
        sentencesWithLink0.setReporter(pigProgressable7);
        java.lang.reflect.Type type9 = sentencesWithLink0.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList10 = sentencesWithLink0.getArgToFuncMapping();
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNotNull(type9);
        org.junit.Assert.assertNull(funcSpecList10);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.pig.Expression expression5 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression5);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple7 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("\"opennlp / en - sent . bin\"\n", "\" http : // . wikipedia . org / wiki / hi % 21 \"", "http://.wikipedia.org/wiki/%22_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22");
        org.apache.pig.data.Tuple tuple4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.putNext(tuple4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"", "\"http://.wikipedia.org/wiki/hi%21\"", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22");
        org.apache.hadoop.mapreduce.RecordReader recordReader4 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit5 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader4, pigSplit5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        java.lang.String[] strArray9 = uriUriNTriplesLoader3.getPartitionKeys("http://http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n.wikipedia.org/wiki/%22%22", job8);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        java.lang.Enum enum6 = null;
        checkAbstract0.warn("href", enum6);
        checkAbstract0.finish();
        checkAbstract0.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable10 = null;
        checkAbstract0.setReporter(pigProgressable10);
        org.apache.pig.data.Tuple tuple12 = null;
        java.lang.Boolean boolean13 = checkAbstract0.exec(tuple12);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        checkAbstract0.setPigLogger(pigLogger14);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable16 = null;
        checkAbstract0.setReporter(pigProgressable16);
        checkAbstract0.progress();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://\" title \".wikipedia.org/wiki/", "hi!\n", "http://http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n.wikipedia.org/wiki/%22%22\n");
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("title", job4);
        org.apache.pig.Expression expression6 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression6);
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader8, pigSplit9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        java.lang.String[] strArray13 = uriStringLiteralNTriplesLoader2.getPartitionKeys("http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21", job12);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple14 = uriStringLiteralNTriplesLoader2.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(strArray13);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("\"\"\"title\"\" \"");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriUriNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.Job job4 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer1.cleanupOnFailure("http://http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n.wikipedia.org/wiki/%22%22", job4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\"title\"href", "http://hi!\n.wikipedia.org/wiki/%22_title_%22\n");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://hi!\n.wikipedia.org/wiki/%22_title_%22\n.wikipedia.org/wiki/%22title%22href" + "'", str2, "http://http://hi!\n.wikipedia.org/wiki/%22_title_%22\n.wikipedia.org/wiki/%22title%22href");
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = checkAbstract0.getReporter();
        checkAbstract0.progress();
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = checkAbstract0.exec(tuple5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = checkAbstract0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = checkAbstract0.getPigLogger();
        java.lang.Enum enum10 = null;
        checkAbstract0.warn("\"opennlp/en-sent.bin\"", enum10);
        org.apache.pig.data.Tuple tuple12 = null;
        java.lang.Boolean boolean13 = checkAbstract0.exec(tuple12);
        pignlproc.evaluation.NoLoopInPath noLoopInPath15 = new pignlproc.evaluation.NoLoopInPath("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22href");
        pignlproc.evaluation.CheckAbstract checkAbstract16 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = checkAbstract16.outputSchema(schema17);
        org.apache.pig.data.Tuple tuple19 = null;
        java.lang.Boolean boolean20 = checkAbstract16.exec(tuple19);
        java.lang.Enum enum22 = null;
        checkAbstract16.warn("href", enum22);
        org.apache.pig.data.Tuple tuple24 = null;
        java.lang.Boolean boolean25 = checkAbstract16.exec(tuple24);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList26 = checkAbstract16.getArgToFuncMapping();
        checkAbstract16.progress();
        checkAbstract16.progress();
        checkAbstract16.finish();
        pignlproc.evaluation.NoLoopInPath noLoopInPath30 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText31 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger32 = null;
        safeTsvText31.setPigLogger(pigLogger32);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText34 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable35 = mergeAsOpenNLPAnnotatedText34.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract36 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = checkAbstract36.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = mergeAsOpenNLPAnnotatedText34.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = safeTsvText31.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = noLoopInPath30.outputSchema(schema39);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink42 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath43 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText44 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger45 = null;
        safeTsvText44.setPigLogger(pigLogger45);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText47 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable48 = mergeAsOpenNLPAnnotatedText47.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract49 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = checkAbstract49.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = mergeAsOpenNLPAnnotatedText47.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = safeTsvText44.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = noLoopInPath43.outputSchema(schema52);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag55 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText56 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger57 = null;
        safeTsvText56.setPigLogger(pigLogger57);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText59 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable60 = mergeAsOpenNLPAnnotatedText59.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract61 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = checkAbstract61.outputSchema(schema62);
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = mergeAsOpenNLPAnnotatedText59.outputSchema(schema62);
        org.apache.pig.impl.logicalLayer.schema.Schema schema65 = safeTsvText56.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema66 = aggregateTextBag55.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = noLoopInPath43.outputSchema(schema64);
        pignlproc.evaluation.CheckAbstract checkAbstract68 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum70 = null;
        checkAbstract68.warn("http://.wikipedia.org/wiki/hi%21", enum70);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger72 = null;
        checkAbstract68.setPigLogger(pigLogger72);
        checkAbstract68.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText75 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger76 = null;
        safeTsvText75.setPigLogger(pigLogger76);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText78 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable79 = mergeAsOpenNLPAnnotatedText78.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract80 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema81 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema82 = checkAbstract80.outputSchema(schema81);
        org.apache.pig.impl.logicalLayer.schema.Schema schema83 = mergeAsOpenNLPAnnotatedText78.outputSchema(schema81);
        org.apache.pig.impl.logicalLayer.schema.Schema schema84 = safeTsvText75.outputSchema(schema83);
        org.apache.pig.impl.logicalLayer.schema.Schema schema85 = checkAbstract68.outputSchema(schema84);
        org.apache.pig.impl.logicalLayer.schema.Schema schema86 = noLoopInPath43.outputSchema(schema85);
        org.apache.pig.impl.logicalLayer.schema.Schema schema87 = sentencesWithLink42.outputSchema(schema86);
        org.apache.pig.impl.logicalLayer.schema.Schema schema88 = noLoopInPath30.outputSchema(schema86);
        org.apache.pig.impl.logicalLayer.schema.Schema schema89 = checkAbstract16.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema90 = noLoopInPath15.outputSchema(schema88);
        org.apache.pig.impl.logicalLayer.schema.Schema schema91 = checkAbstract0.outputSchema(schema88);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + false + "'", boolean6, false);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertNull(pigLogger8);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertEquals("'" + boolean20 + "' != '" + false + "'", boolean20, false);
        org.junit.Assert.assertEquals("'" + boolean25 + "' != '" + false + "'", boolean25, false);
        org.junit.Assert.assertNull(funcSpecList26);
        org.junit.Assert.assertNull(pigProgressable35);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(pigProgressable48);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNull(pigProgressable60);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNull(pigProgressable79);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema88);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema91);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract((int) '4');
        java.util.List<org.apache.pig.FuncSpec> funcSpecList2 = checkAbstract1.getArgToFuncMapping();
        pignlproc.evaluation.SafeTsvText safeTsvText3 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum5 = null;
        safeTsvText3.warn("http://.wikipedia.org/wiki/hi%21", enum5);
        pignlproc.evaluation.CheckAbstract checkAbstract7 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum9 = null;
        checkAbstract7.warn("http://.wikipedia.org/wiki/hi%21", enum9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        checkAbstract7.setPigLogger(pigLogger11);
        checkAbstract7.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText14 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger15 = null;
        safeTsvText14.setPigLogger(pigLogger15);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText17 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable18 = mergeAsOpenNLPAnnotatedText17.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract19 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = checkAbstract19.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = mergeAsOpenNLPAnnotatedText17.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = safeTsvText14.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = checkAbstract7.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = safeTsvText3.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = checkAbstract1.outputSchema(schema23);
        org.apache.commons.logging.Log log27 = checkAbstract1.getLogger();
        boolean boolean28 = checkAbstract1.isAsynchronous();
        org.junit.Assert.assertNull(funcSpecList2);
        org.junit.Assert.assertNull(pigProgressable18);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(log27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser6.getHeaders();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser8.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList10 = annotatingMarkupParser8.getWikiLinkAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList14 = annotatingMarkupParser11.getHeaderAnnotations();
        java.lang.String str15 = annotatingMarkupParser11.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser16 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList17 = annotatingMarkupParser16.getHeaders();
        java.util.List<java.lang.String> strList18 = annotatingMarkupParser16.getHeaders();
        java.lang.Appendable appendable19 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable20 = annotatingMarkupParser16.new CountingAppendable(appendable19);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser11.new CountingAppendable((java.lang.Appendable) countingAppendable20);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable22 = annotatingMarkupParser8.new CountingAppendable((java.lang.Appendable) countingAppendable21);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable21);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable23);
        int int25 = countingAppendable24.currentPosition;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable29 = countingAppendable24.append((java.lang.CharSequence) "\"\"\"\"\"\"\" http : // hi ! . wikipedia . org / wiki / http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 % 0 A . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 \"\"\"\"\"\" href\"", (int) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(annotationList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(annotationList14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.lang.String str1 = annotatingMarkupParser0.getRedirect();
        info.bliki.htmlcleaner.TagNode tagNode2 = null;
        info.bliki.wiki.model.ImageFormat imageFormat3 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser4 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser4.getHeaders();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser4.getHeaders();
        java.lang.String str8 = annotatingMarkupParser4.parse("\"title\"");
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser4.getParagraphs();
        java.lang.String str11 = annotatingMarkupParser4.parse("title");
        boolean boolean12 = annotatingMarkupParser4.noLinks();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser4.getHeaders();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser14.getHeaders();
        java.util.List<java.lang.String> strList16 = annotatingMarkupParser14.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser14.getHeaderAnnotations();
        java.lang.String str18 = annotatingMarkupParser14.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser19.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser19.getHeaders();
        java.lang.Appendable appendable22 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser19.new CountingAppendable(appendable22);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser14.new CountingAppendable((java.lang.Appendable) countingAppendable23);
        info.bliki.wiki.model.WikiModel wikiModel26 = annotatingMarkupParser14.makeWikiModel("\"hi!\"\n");
        java.util.List<pignlproc.markup.Annotation> annotationList27 = annotatingMarkupParser14.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser29 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser30 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList31 = annotatingMarkupParser30.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList32 = annotatingMarkupParser30.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList33 = annotatingMarkupParser30.getParagraphAnnotations();
        java.util.List<java.lang.String> strList34 = annotatingMarkupParser30.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList35 = annotatingMarkupParser30.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser36 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList37 = annotatingMarkupParser36.getHeaderAnnotations();
        java.util.List<java.lang.String> strList38 = annotatingMarkupParser36.getParagraphs();
        java.lang.Appendable appendable39 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable40 = annotatingMarkupParser36.new CountingAppendable(appendable39);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable41 = annotatingMarkupParser30.new CountingAppendable((java.lang.Appendable) countingAppendable40);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable42 = annotatingMarkupParser29.new CountingAppendable((java.lang.Appendable) countingAppendable40);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser43 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList44 = annotatingMarkupParser43.getHeaderAnnotations();
        java.util.List<java.lang.String> strList45 = annotatingMarkupParser43.getParagraphs();
        java.lang.Appendable appendable46 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable47 = annotatingMarkupParser43.new CountingAppendable(appendable46);
        int int48 = countingAppendable47.currentPosition;
        countingAppendable47.currentPosition = ' ';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable51 = annotatingMarkupParser29.new CountingAppendable((java.lang.Appendable) countingAppendable47);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser53 = new pignlproc.markup.AnnotatingMarkupParser("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
        info.bliki.wiki.model.WikiModel wikiModel55 = annotatingMarkupParser53.makeWikiModel("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n");
        annotatingMarkupParser4.nodesToText(annotationList27, (java.lang.Appendable) countingAppendable47, (info.bliki.wiki.model.IWikiModel) wikiModel55);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser57 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList58 = annotatingMarkupParser57.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList59 = annotatingMarkupParser57.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel61 = annotatingMarkupParser57.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel63 = annotatingMarkupParser57.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList64 = annotatingMarkupParser57.getParagraphAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel66 = annotatingMarkupParser57.makeWikiModel("\"http://.wikipedia.org/wiki/ \"");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode2, imageFormat3, (java.lang.Appendable) countingAppendable47, (info.bliki.wiki.model.IWikiModel) wikiModel66);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\"title\"\n" + "'", str8, "\"title\"\n");
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "title\n" + "'", str11, "title\n");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(wikiModel26);
        org.junit.Assert.assertNotNull(annotationList27);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(annotationList32);
        org.junit.Assert.assertNotNull(annotationList33);
        org.junit.Assert.assertNotNull(strList34);
        org.junit.Assert.assertNotNull(annotationList35);
        org.junit.Assert.assertNotNull(annotationList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(annotationList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 0 + "'", int48 == 0);
        org.junit.Assert.assertNotNull(wikiModel55);
        org.junit.Assert.assertNotNull(strList58);
        org.junit.Assert.assertNotNull(annotationList59);
        org.junit.Assert.assertNotNull(wikiModel61);
        org.junit.Assert.assertNotNull(wikiModel63);
        org.junit.Assert.assertNotNull(annotationList64);
        org.junit.Assert.assertNotNull(wikiModel66);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser0.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser0.makeWikiModel("opennlp / en - sent . bin");
        java.lang.String str15 = annotatingMarkupParser0.parse("hi !\n");
        info.bliki.wiki.model.WikiModel wikiModel17 = annotatingMarkupParser0.makeWikiModel("http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.lang.String str19 = annotatingMarkupParser0.getRedirect();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser0.getParagraphs();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi !\n\n" + "'", str15, "hi !\n\n");
        org.junit.Assert.assertNotNull(wikiModel17);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(strList20);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"http://\"\"opennlp / en - sent . bin\"\".wikipedia.org/wiki/href\"", "\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"", "\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\" \"");
    }

    @Test
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        java.lang.String[] strArray1 = new java.lang.String[] { "opennlp/en-sent.bin" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "");
        java.lang.String str7 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://.wikipedia.org/wiki/hi%21");
        java.lang.String str9 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "href");
        java.lang.String str11 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "hi!");
        java.lang.String str13 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "");
        java.lang.String str15 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "\" hi ! \"\n");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "opennlp/en-sent.bin" + "'", str5, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "opennlp/en-sent.bin" + "'", str7, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "opennlp/en-sent.bin" + "'", str9, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "opennlp/en-sent.bin" + "'", str11, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "opennlp/en-sent.bin" + "'", str13, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "opennlp/en-sent.bin" + "'", str15, "opennlp/en-sent.bin");
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag0 = new pignlproc.evaluation.AggregateTextBag();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        aggregateTextBag0.setPigLogger(pigLogger1);
        pignlproc.evaluation.ConcatTextBag concatTextBag4 = new pignlproc.evaluation.ConcatTextBag("http://hi!\n.wikipedia.org/wiki/%22_title_%22");
        java.lang.Enum enum6 = null;
        concatTextBag4.warn("http://.wikipedia.org/wiki/hi%21", enum6);
        java.lang.Enum enum9 = null;
        concatTextBag4.warn("hi !\n\n", enum9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        concatTextBag4.setPigLogger(pigLogger11);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag14 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        aggregateTextBag14.progress();
        pignlproc.evaluation.ConcatTextBag concatTextBag17 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum20 = null;
        checkAbstract18.warn("http://.wikipedia.org/wiki/hi%21", enum20);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger22 = null;
        checkAbstract18.setPigLogger(pigLogger22);
        checkAbstract18.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText25 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger26 = null;
        safeTsvText25.setPigLogger(pigLogger26);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText28 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable29 = mergeAsOpenNLPAnnotatedText28.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract30 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = checkAbstract30.outputSchema(schema31);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = mergeAsOpenNLPAnnotatedText28.outputSchema(schema31);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = safeTsvText25.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = checkAbstract18.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = concatTextBag17.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag14.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = concatTextBag4.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = aggregateTextBag0.outputSchema(schema37);
        org.junit.Assert.assertNull(pigProgressable29);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable(appendable8);
        countingAppendable10.currentPosition = (short) 1;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable14 = countingAppendable10.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        int int5 = annotation4.begin;
        java.lang.String str6 = annotation4.label;
        int int7 = annotation4.end;
        int int8 = annotation4.begin;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "title" + "'", str6, "title");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("hi!\n", "http://\"\"\"hi!\"\" \".wikipedia.org/wiki/");
        org.apache.pig.Expression expression3 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression3);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("\"hi!\"");
        org.apache.pig.data.Tuple tuple2 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mergeAsOpenNLPAnnotatedText1.exec(tuple2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        java.lang.String[] strArray1 = new java.lang.String[] { "opennlp/en-sent.bin" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "");
        java.lang.String str7 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://.wikipedia.org/wiki/hi%21");
        java.lang.String str9 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "opennlp/en-sent.bin" + "'", str5, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "opennlp/en-sent.bin" + "'", str7, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "opennlp/en-sent.bin" + "'", str9, "opennlp/en-sent.bin");
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract((int) (short) -1);
        checkAbstract1.progress();
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://\"title\"\n.wikipedia.org/wiki/\n");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("title");
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) '#', false);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText3 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray5 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList6 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList6, spanArray5);
        java.lang.String str8 = mergeAsOpenNLPAnnotatedText3.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList6);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList9 = mergeAsOpenNLPAnnotatedText3.getArgToFuncMapping();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText10 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray12 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList13 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean14 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList13, spanArray12);
        java.lang.String str15 = mergeAsOpenNLPAnnotatedText10.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList13);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        mergeAsOpenNLPAnnotatedText10.setPigLogger(pigLogger16);
        boolean boolean18 = mergeAsOpenNLPAnnotatedText10.isAsynchronous();
        pignlproc.evaluation.CheckAbstract checkAbstract19 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum21 = null;
        checkAbstract19.warn("http://.wikipedia.org/wiki/hi%21", enum21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable23 = null;
        checkAbstract19.setReporter(pigProgressable23);
        java.lang.reflect.Type type25 = checkAbstract19.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath26 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText27 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = null;
        safeTsvText27.setPigLogger(pigLogger28);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText30 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = mergeAsOpenNLPAnnotatedText30.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract32 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract32.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = mergeAsOpenNLPAnnotatedText30.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = safeTsvText27.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = noLoopInPath26.outputSchema(schema35);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag38 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText39 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger40 = null;
        safeTsvText39.setPigLogger(pigLogger40);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText42 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable43 = mergeAsOpenNLPAnnotatedText42.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract44 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = checkAbstract44.outputSchema(schema45);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = mergeAsOpenNLPAnnotatedText42.outputSchema(schema45);
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = safeTsvText39.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = aggregateTextBag38.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = noLoopInPath26.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = checkAbstract19.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = mergeAsOpenNLPAnnotatedText10.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = mergeAsOpenNLPAnnotatedText3.outputSchema(schema47);
        pignlproc.evaluation.CheckAbstract checkAbstract54 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum56 = null;
        checkAbstract54.warn("http://.wikipedia.org/wiki/hi%21", enum56);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger58 = null;
        checkAbstract54.setPigLogger(pigLogger58);
        checkAbstract54.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText61 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger62 = null;
        safeTsvText61.setPigLogger(pigLogger62);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText64 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable65 = mergeAsOpenNLPAnnotatedText64.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract66 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = checkAbstract66.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = mergeAsOpenNLPAnnotatedText64.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = safeTsvText61.outputSchema(schema69);
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = checkAbstract54.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = mergeAsOpenNLPAnnotatedText3.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = aggregateTextBag2.outputSchema(schema71);
        org.apache.commons.logging.Log log74 = aggregateTextBag2.getLogger();
        org.junit.Assert.assertNotNull(spanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi !" + "'", str8, "hi !");
        org.junit.Assert.assertNull(funcSpecList9);
        org.junit.Assert.assertNotNull(spanArray12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi !" + "'", str15, "hi !");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(type25);
        org.junit.Assert.assertNull(pigProgressable31);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNull(pigProgressable43);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(pigProgressable65);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(log74);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.String str4 = annotatingMarkupParser0.parse("\"title\"");
        java.lang.String str6 = annotatingMarkupParser0.parse("hi !");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser7.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel11 = annotatingMarkupParser7.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser7.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList14 = annotatingMarkupParser7.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser15 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList16 = annotatingMarkupParser15.getHeaderAnnotations();
        java.util.List<java.lang.String> strList17 = annotatingMarkupParser15.getParagraphs();
        java.lang.Appendable appendable18 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable19 = annotatingMarkupParser15.new CountingAppendable(appendable18);
        int int20 = countingAppendable19.currentPosition;
        countingAppendable19.currentPosition = ' ';
        int int23 = countingAppendable19.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser24 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser24.getHeaders();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser24.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList27 = annotatingMarkupParser24.getHeaderAnnotations();
        java.util.List<java.lang.String> strList28 = annotatingMarkupParser24.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel30 = annotatingMarkupParser24.makeWikiModel("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521");
        annotatingMarkupParser0.nodesToText(annotationList14, (java.lang.Appendable) countingAppendable19, (info.bliki.wiki.model.IWikiModel) wikiModel30);
        info.bliki.htmlcleaner.TagNode tagNode32 = null;
        info.bliki.wiki.model.ImageFormat imageFormat33 = null;
        java.lang.Appendable appendable34 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser36 = new pignlproc.markup.AnnotatingMarkupParser("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser37 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList38 = annotatingMarkupParser37.getHeaders();
        java.util.List<java.lang.String> strList39 = annotatingMarkupParser37.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList40 = annotatingMarkupParser37.getHeaderAnnotations();
        java.util.List<java.lang.String> strList41 = annotatingMarkupParser37.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel43 = annotatingMarkupParser37.makeWikiModel("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521");
        java.util.List<java.lang.String> strList44 = annotatingMarkupParser37.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList45 = annotatingMarkupParser37.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser47 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser48 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList49 = annotatingMarkupParser48.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList50 = annotatingMarkupParser48.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList51 = annotatingMarkupParser48.getParagraphAnnotations();
        java.util.List<java.lang.String> strList52 = annotatingMarkupParser48.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList53 = annotatingMarkupParser48.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser54 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList55 = annotatingMarkupParser54.getHeaderAnnotations();
        java.util.List<java.lang.String> strList56 = annotatingMarkupParser54.getParagraphs();
        java.lang.Appendable appendable57 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable58 = annotatingMarkupParser54.new CountingAppendable(appendable57);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable59 = annotatingMarkupParser48.new CountingAppendable((java.lang.Appendable) countingAppendable58);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable60 = annotatingMarkupParser47.new CountingAppendable((java.lang.Appendable) countingAppendable58);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser61 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList62 = annotatingMarkupParser61.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList63 = annotatingMarkupParser61.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel65 = annotatingMarkupParser61.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel67 = annotatingMarkupParser61.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList68 = annotatingMarkupParser61.getParagraphAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList69 = annotatingMarkupParser61.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel71 = annotatingMarkupParser61.makeWikiModel("");
        annotatingMarkupParser36.nodesToText(annotationList45, (java.lang.Appendable) countingAppendable58, (info.bliki.wiki.model.IWikiModel) wikiModel71);
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser0.imageNodeToText(tagNode32, imageFormat33, appendable34, (info.bliki.wiki.model.IWikiModel) wikiModel71);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"title\"\n" + "'", str4, "\"title\"\n");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi !\n" + "'", str6, "hi !\n");
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(wikiModel11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNotNull(annotationList14);
        org.junit.Assert.assertNotNull(annotationList16);
        org.junit.Assert.assertNotNull(strList17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 32 + "'", int23 == 32);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(annotationList27);
        org.junit.Assert.assertNotNull(strList28);
        org.junit.Assert.assertNotNull(wikiModel30);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(annotationList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(wikiModel43);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(annotationList45);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(annotationList50);
        org.junit.Assert.assertNotNull(annotationList51);
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertNotNull(annotationList53);
        org.junit.Assert.assertNotNull(annotationList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertNotNull(annotationList63);
        org.junit.Assert.assertNotNull(wikiModel65);
        org.junit.Assert.assertNotNull(wikiModel67);
        org.junit.Assert.assertNotNull(annotationList68);
        org.junit.Assert.assertNotNull(annotationList69);
        org.junit.Assert.assertNotNull(wikiModel71);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        java.lang.String[] strArray5 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21\n", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        java.lang.String[] strArray8 = parsingWikipediaLoader1.getPartitionKeys("http://wikiobject.wikipedia.org/wiki/opennlp%2Fen-sent.bin", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceSchema resourceSchema11 = parsingWikipediaLoader1.getSchema("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"", job10);
        org.apache.pig.LoadCaster loadCaster12 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.RecordReader recordReader13 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit14 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader13, pigSplit14);
        org.apache.hadoop.mapreduce.InputFormat inputFormat16 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job18 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("\"http://http://http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22 .wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521\"", job18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in scheme name at index 0: \"http://http:/http:/http:/.wikipedia.org/wiki/hi%2521%20.wikipedia.org/wiki/%2522title%2522%20.wikipedia.org/wiki/%2522hi%2521%2522.wikipedia.org/wiki/http%253A%252F%252Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521.wikipedia.org%252Fwiki%252Fhi_%252521%22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster2);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(resourceSchema11);
        org.junit.Assert.assertNotNull(loadCaster12);
        org.junit.Assert.assertNotNull(inputFormat16);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"");
        pignlproc.evaluation.NoLoopInPath noLoopInPath2 = new pignlproc.evaluation.NoLoopInPath();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = null;
        noLoopInPath2.setPigLogger(pigLogger3);
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = noLoopInPath2.exec(tuple5);
        org.apache.pig.data.Tuple tuple7 = null;
        java.lang.Boolean boolean8 = noLoopInPath2.exec(tuple7);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag10 = new pignlproc.evaluation.AggregateTextBag((int) '4');
        pignlproc.evaluation.ConcatTextBag concatTextBag12 = new pignlproc.evaluation.ConcatTextBag("\" title \"");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable13 = concatTextBag12.getReporter();
        pignlproc.evaluation.NoLoopInPath noLoopInPath14 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = noLoopInPath14.outputSchema(schema23);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag28 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
        pignlproc.evaluation.NoLoopInPath noLoopInPath29 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText30 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        safeTsvText30.setPigLogger(pigLogger31);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText33 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable34 = mergeAsOpenNLPAnnotatedText33.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract35 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = checkAbstract35.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = mergeAsOpenNLPAnnotatedText33.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = safeTsvText30.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = noLoopInPath29.outputSchema(schema38);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag41 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText42 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger43 = null;
        safeTsvText42.setPigLogger(pigLogger43);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText45 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable46 = mergeAsOpenNLPAnnotatedText45.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract47 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = checkAbstract47.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = mergeAsOpenNLPAnnotatedText45.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = safeTsvText42.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = aggregateTextBag41.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = noLoopInPath29.outputSchema(schema50);
        pignlproc.evaluation.CheckAbstract checkAbstract54 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum56 = null;
        checkAbstract54.warn("http://.wikipedia.org/wiki/hi%21", enum56);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger58 = null;
        checkAbstract54.setPigLogger(pigLogger58);
        checkAbstract54.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText61 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger62 = null;
        safeTsvText61.setPigLogger(pigLogger62);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText64 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable65 = mergeAsOpenNLPAnnotatedText64.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract66 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = checkAbstract66.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = mergeAsOpenNLPAnnotatedText64.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = safeTsvText61.outputSchema(schema69);
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = checkAbstract54.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = noLoopInPath29.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = aggregateTextBag28.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = noLoopInPath14.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = concatTextBag12.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = aggregateTextBag10.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = noLoopInPath2.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema78 = concatTextBag1.outputSchema(schema74);
        java.lang.reflect.Type type79 = concatTextBag1.getReturnType();
        boolean boolean80 = concatTextBag1.isAsynchronous();
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + true + "'", boolean8, true);
        org.junit.Assert.assertNull(pigProgressable13);
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(pigProgressable34);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(pigProgressable46);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(pigProgressable65);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNotNull(schema78);
        org.junit.Assert.assertNotNull(type79);
        org.junit.Assert.assertTrue("'" + boolean80 + "' != '" + false + "'", boolean80 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        java.lang.String str6 = annotatingMarkupParser0.parse("\"hi!\"\n");
        info.bliki.wiki.model.WikiModel wikiModel8 = annotatingMarkupParser0.makeWikiModel("\"hi !  href\"");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"\n\n" + "'", str6, "\"hi!\"\n\n");
        org.junit.Assert.assertNotNull(wikiModel8);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader5, pigSplit6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("\"\"", job12);
        org.apache.hadoop.mapreduce.InputFormat inputFormat14 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.InputFormat inputFormat15 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.InputFormat inputFormat16 = parsingWikipediaLoader1.getInputFormat();
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNotNull(inputFormat14);
        org.junit.Assert.assertNotNull(inputFormat15);
        org.junit.Assert.assertNotNull(inputFormat16);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getParagraphs();
        java.lang.Appendable appendable3 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable4 = annotatingMarkupParser0.new CountingAppendable(appendable3);
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList6 = annotatingMarkupParser0.getWikiLinkAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.lang.String str11 = annotatingMarkupParser7.parse("\"title\"");
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser7.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList13 = annotatingMarkupParser7.getWikiLinkAnnotations();
        java.lang.String str14 = annotatingMarkupParser7.getRedirect();
        java.lang.String str15 = annotatingMarkupParser7.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser16 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser16.getHeaderAnnotations();
        java.util.List<java.lang.String> strList18 = annotatingMarkupParser16.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList19 = annotatingMarkupParser16.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser20 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser20.getHeaders();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser20.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList23 = annotatingMarkupParser20.getHeaderAnnotations();
        java.lang.String str24 = annotatingMarkupParser20.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser25.getHeaders();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser25.getHeaders();
        java.lang.Appendable appendable28 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser25.new CountingAppendable(appendable28);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable30 = annotatingMarkupParser20.new CountingAppendable((java.lang.Appendable) countingAppendable29);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser31 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList32 = annotatingMarkupParser31.getHeaders();
        java.util.List<java.lang.String> strList33 = annotatingMarkupParser31.getHeaders();
        java.lang.Appendable appendable34 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable35 = annotatingMarkupParser31.new CountingAppendable(appendable34);
        countingAppendable35.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable38 = annotatingMarkupParser20.new CountingAppendable((java.lang.Appendable) countingAppendable35);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser40 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        info.bliki.wiki.model.WikiModel wikiModel42 = annotatingMarkupParser40.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        annotatingMarkupParser7.nodesToText(annotationList19, (java.lang.Appendable) countingAppendable35, (info.bliki.wiki.model.IWikiModel) wikiModel42);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser44 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList45 = annotatingMarkupParser44.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList46 = annotatingMarkupParser44.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList47 = annotatingMarkupParser44.getParagraphAnnotations();
        java.util.List<java.lang.String> strList48 = annotatingMarkupParser44.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList49 = annotatingMarkupParser44.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser50 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList51 = annotatingMarkupParser50.getHeaders();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser52 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList53 = annotatingMarkupParser52.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList54 = annotatingMarkupParser52.getWikiLinkAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser55 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList56 = annotatingMarkupParser55.getHeaders();
        java.util.List<java.lang.String> strList57 = annotatingMarkupParser55.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList58 = annotatingMarkupParser55.getHeaderAnnotations();
        java.lang.String str59 = annotatingMarkupParser55.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser60 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList61 = annotatingMarkupParser60.getHeaders();
        java.util.List<java.lang.String> strList62 = annotatingMarkupParser60.getHeaders();
        java.lang.Appendable appendable63 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable64 = annotatingMarkupParser60.new CountingAppendable(appendable63);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable65 = annotatingMarkupParser55.new CountingAppendable((java.lang.Appendable) countingAppendable64);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable66 = annotatingMarkupParser52.new CountingAppendable((java.lang.Appendable) countingAppendable65);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable67 = annotatingMarkupParser50.new CountingAppendable((java.lang.Appendable) countingAppendable65);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable68 = annotatingMarkupParser44.new CountingAppendable((java.lang.Appendable) countingAppendable67);
        int int69 = countingAppendable68.currentPosition;
        int int70 = countingAppendable68.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser71 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList72 = annotatingMarkupParser71.getHeaders();
        java.util.List<java.lang.String> strList73 = annotatingMarkupParser71.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList74 = annotatingMarkupParser71.getHeaderAnnotations();
        java.lang.String str75 = annotatingMarkupParser71.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser76 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList77 = annotatingMarkupParser76.getHeaders();
        java.util.List<java.lang.String> strList78 = annotatingMarkupParser76.getHeaders();
        java.lang.Appendable appendable79 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable80 = annotatingMarkupParser76.new CountingAppendable(appendable79);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable81 = annotatingMarkupParser71.new CountingAppendable((java.lang.Appendable) countingAppendable80);
        info.bliki.wiki.model.WikiModel wikiModel83 = annotatingMarkupParser71.makeWikiModel("\"hi!\"\n");
        java.util.List<pignlproc.markup.Annotation> annotationList84 = annotatingMarkupParser71.getParagraphAnnotations();
        boolean boolean85 = annotatingMarkupParser71.noLinks();
        info.bliki.wiki.model.WikiModel wikiModel87 = annotatingMarkupParser71.makeWikiModel("");
        annotatingMarkupParser0.nodesToText(annotationList19, (java.lang.Appendable) countingAppendable68, (info.bliki.wiki.model.IWikiModel) wikiModel87);
        countingAppendable68.currentPosition = 97;
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(annotationList6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\"title\"\n" + "'", str11, "\"title\"\n");
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(annotationList13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(annotationList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(strList33);
        org.junit.Assert.assertNotNull(wikiModel42);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertNotNull(annotationList46);
        org.junit.Assert.assertNotNull(annotationList47);
        org.junit.Assert.assertNotNull(strList48);
        org.junit.Assert.assertNotNull(annotationList49);
        org.junit.Assert.assertNotNull(strList51);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(annotationList54);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(annotationList58);
        org.junit.Assert.assertNull(str59);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList62);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 0 + "'", int70 == 0);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(annotationList74);
        org.junit.Assert.assertNull(str75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(wikiModel83);
        org.junit.Assert.assertNotNull(annotationList84);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + true + "'", boolean85 == true);
        org.junit.Assert.assertNotNull(wikiModel87);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("wikiobject", job6);
        parsingWikipediaLoader1.setUDFContextSignature("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22");
        org.apache.hadoop.mapreduce.InputFormat inputFormat10 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("hi !", job12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        org.apache.pig.ResourceStatistics resourceStatistics16 = parsingWikipediaLoader1.getStatistics("hi !\n", job15);
        org.apache.hadoop.mapreduce.Job job18 = null;
        org.apache.pig.ResourceStatistics resourceStatistics19 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/hi%21\n", job18);
        org.apache.hadoop.mapreduce.Job job21 = null;
        java.lang.String[] strArray22 = parsingWikipediaLoader1.getPartitionKeys("\"http://http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522.wikipedia.org/wiki/%22_hi_%21_%22\"", job21);
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(inputFormat10);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNull(resourceStatistics16);
        org.junit.Assert.assertNull(resourceStatistics19);
        org.junit.Assert.assertNull(strArray22);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) 'a', 52, "\"http://\"\" title \"\".wikipedia.org/wiki/\"", "http://\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\"\"\"\"\" \"\"\"\"\"\"\".wikipedia.org/wiki/http%3A%2F%2F%22title%22%0A.wikipedia.org%2Fwiki%2F");
        java.lang.String str5 = annotation4.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\"\"\"\"\" \"\"\"\"\"\"\".wikipedia.org/wiki/http%3A%2F%2F%22title%22%0A.wikipedia.org%2Fwiki%2F" + "'", str5, "http://\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\"\"\"\"\" \"\"\"\"\"\"\".wikipedia.org/wiki/http%3A%2F%2F%22title%22%0A.wikipedia.org%2Fwiki%2F");
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        pignlproc.evaluation.CheckAbstract checkAbstract7 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum9 = null;
        checkAbstract7.warn("http://.wikipedia.org/wiki/hi%21", enum9);
        java.lang.Enum enum12 = null;
        checkAbstract7.warn("hi !", enum12);
        pignlproc.evaluation.NoLoopInPath noLoopInPath14 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = noLoopInPath14.outputSchema(schema23);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag26 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText27 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = null;
        safeTsvText27.setPigLogger(pigLogger28);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText30 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = mergeAsOpenNLPAnnotatedText30.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract32 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract32.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = mergeAsOpenNLPAnnotatedText30.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = safeTsvText27.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag26.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = noLoopInPath14.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = checkAbstract7.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = sentencesWithLink0.outputSchema(schema38);
        sentencesWithLink0.progress();
        java.lang.Enum enum43 = null;
        sentencesWithLink0.warn("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", enum43);
        org.apache.pig.data.Tuple tuple45 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag46 = sentencesWithLink0.exec(tuple45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(pigProgressable31);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("http://\"http://.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/%22%22%22http%3A%2F%2Fhi_%21_.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%250A.wikipedia.org%252Fwiki%252F%252522title%252522%22%22%22", "\"\"\"opennlp / en - sent . bin\"\" \"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"\"\"opennlp / en - sent . bin\"\" \".wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522" + "'", str2, "http://\"\"\"opennlp / en - sent . bin\"\" \".wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522");
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser0.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser0.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser("\"http://.wikipedia.org/wiki/hi%21\"\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser7.getHeaders();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser11.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel17 = annotatingMarkupParser11.makeWikiModel("opennlp / en - sent . bin");
        info.bliki.wiki.model.WikiModel wikiModel19 = annotatingMarkupParser11.makeWikiModel("\"hi!\"");
        java.util.List<pignlproc.markup.Annotation> annotationList20 = annotatingMarkupParser11.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser23 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser23.getHeaders();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser23.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList26 = annotatingMarkupParser23.getHeaderAnnotations();
        java.lang.String str27 = annotatingMarkupParser23.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser28 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList29 = annotatingMarkupParser28.getHeaders();
        java.util.List<java.lang.String> strList30 = annotatingMarkupParser28.getHeaders();
        java.lang.Appendable appendable31 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable32 = annotatingMarkupParser28.new CountingAppendable(appendable31);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable33 = annotatingMarkupParser23.new CountingAppendable((java.lang.Appendable) countingAppendable32);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser34 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser34.getHeaders();
        java.util.List<java.lang.String> strList36 = annotatingMarkupParser34.getHeaders();
        java.lang.Appendable appendable37 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable38 = annotatingMarkupParser34.new CountingAppendable(appendable37);
        countingAppendable38.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable41 = annotatingMarkupParser23.new CountingAppendable((java.lang.Appendable) countingAppendable38);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable42 = annotatingMarkupParser22.new CountingAppendable((java.lang.Appendable) countingAppendable41);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser43 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList44 = annotatingMarkupParser43.getHeaders();
        java.util.List<java.lang.String> strList45 = annotatingMarkupParser43.getHeaders();
        java.lang.String str47 = annotatingMarkupParser43.parse("\"title\"");
        info.bliki.wiki.model.WikiModel wikiModel49 = annotatingMarkupParser43.makeWikiModel("\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"");
        info.bliki.wiki.model.WikiModel wikiModel51 = annotatingMarkupParser43.makeWikiModel("http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href");
        annotatingMarkupParser7.nodesToText(annotationList20, (java.lang.Appendable) countingAppendable41, (info.bliki.wiki.model.IWikiModel) wikiModel51);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable53 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable41);
        int int54 = countingAppendable41.currentPosition;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable55 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable59 = countingAppendable41.append((java.lang.CharSequence) "\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\n", (int) (short) 1, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(wikiModel17);
        org.junit.Assert.assertNotNull(wikiModel19);
        org.junit.Assert.assertNotNull(annotationList20);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(annotationList26);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(strList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertNotNull(strList45);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "\"title\"\n" + "'", str47, "\"title\"\n");
        org.junit.Assert.assertNotNull(wikiModel49);
        org.junit.Assert.assertNotNull(wikiModel51);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("\"hi!\"\n", "");
        org.apache.hadoop.mapreduce.InputFormat inputFormat3 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.pig.Expression expression4 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression4);
        org.apache.pig.LoadCaster loadCaster6 = uriStringLiteralNTriplesLoader2.getLoadCaster();
        org.junit.Assert.assertNotNull(inputFormat3);
        org.junit.Assert.assertNotNull(loadCaster6);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        java.lang.reflect.Type type7 = sentencesWithLink0.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = sentencesWithLink0.getArgToFuncMapping();
        sentencesWithLink0.progress();
        boolean boolean10 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable12 = null;
        sentencesWithLink0.setReporter(pigProgressable12);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList14 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable15 = null;
        sentencesWithLink0.setReporter(pigProgressable15);
        java.lang.Enum enum18 = null;
        sentencesWithLink0.warn("http://\"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\" \"\"\".wikipedia.org/wiki/href", enum18);
        java.lang.reflect.Type type20 = sentencesWithLink0.getReturnType();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNull(pigLogger11);
        org.junit.Assert.assertNull(funcSpecList14);
        org.junit.Assert.assertNotNull(type20);
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) 'a', (int) (byte) 0, "http://\"title\".wikipedia.org/wiki/%22hi%21%22", "\"title\"\n");
        java.lang.String str5 = annotation4.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\"title\"\n" + "'", str5, "\"title\"\n");
    }

    @Test
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://http://http : // \" hi ! \" . wikipedia . org / wiki / % 22 hi % 21 _ % 22.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%0A.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_http_%253A_%252F%252F_._wikipedia_._org_%252F_wiki_%252F_hi_%2525_21_._wikipedia_._org_%252F_wiki_%252F_hi_%2525_21");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("http://http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522.wikipedia.org/wiki/%22_hi_%21_%22\n\n");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        java.lang.String[] strArray3 = uriUriNTriplesLoader0.getPartitionKeys("title", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader0.getSchema("http://.wikipedia.org/wiki/hi%21", job5);
        org.apache.hadoop.mapreduce.RecordReader recordReader7 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit8 = null;
        uriUriNTriplesLoader0.prepareToRead(recordReader7, pigSplit8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        java.lang.String[] strArray12 = uriUriNTriplesLoader0.getPartitionKeys("", job11);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple13 = uriUriNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNull(strArray12);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("http://\"opennlp / en - sent . bin\"\n.wikipedia.org/wiki/%22titlehref%22");
        pignlproc.evaluation.CheckAbstract checkAbstract3 = new pignlproc.evaluation.CheckAbstract((int) (byte) 1);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag6 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 1, false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = null;
        aggregateTextBag6.setReporter(pigProgressable7);
        pignlproc.evaluation.ConcatTextBag concatTextBag10 = new pignlproc.evaluation.ConcatTextBag("opennlp/en-sent.bin");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = concatTextBag10.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger12 = concatTextBag10.getPigLogger();
        java.lang.Enum enum14 = null;
        concatTextBag10.warn("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", enum14);
        boolean boolean16 = concatTextBag10.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath17 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText18 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger19 = null;
        safeTsvText18.setPigLogger(pigLogger19);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText21 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable22 = mergeAsOpenNLPAnnotatedText21.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract23 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = checkAbstract23.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = mergeAsOpenNLPAnnotatedText21.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = safeTsvText18.outputSchema(schema26);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = noLoopInPath17.outputSchema(schema26);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag29 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText30 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        safeTsvText30.setPigLogger(pigLogger31);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText33 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable34 = mergeAsOpenNLPAnnotatedText33.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract35 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = checkAbstract35.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = mergeAsOpenNLPAnnotatedText33.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = safeTsvText30.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = aggregateTextBag29.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = noLoopInPath17.outputSchema(schema38);
        pignlproc.evaluation.CheckAbstract checkAbstract42 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum44 = null;
        checkAbstract42.warn("http://.wikipedia.org/wiki/hi%21", enum44);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger46 = null;
        checkAbstract42.setPigLogger(pigLogger46);
        checkAbstract42.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText49 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger50 = null;
        safeTsvText49.setPigLogger(pigLogger50);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText52 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable53 = mergeAsOpenNLPAnnotatedText52.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract54 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = checkAbstract54.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = mergeAsOpenNLPAnnotatedText52.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = safeTsvText49.outputSchema(schema57);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = checkAbstract42.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = noLoopInPath17.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = concatTextBag10.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = aggregateTextBag6.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = checkAbstract3.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = mergeAsOpenNLPAnnotatedText1.outputSchema(schema60);
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNull(pigLogger12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(pigProgressable22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNull(pigProgressable34);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNull(pigProgressable53);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("\"\"\" hi ! \"\" \"", "\"\"\"http://hi!.wikipedia.org/wiki/%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22%0A\"\"\"", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.cleanupOnFailure("http://\"\"\"title\"\" \"hrefhref.wikipedia.org/wiki/%22title%22href", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("", "titlehref");
        org.apache.pig.LoadCaster loadCaster3 = uriStringLiteralNTriplesLoader2.getLoadCaster();
        org.junit.Assert.assertNotNull(loadCaster3);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceStatistics resourceStatistics10 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", job9);
        org.apache.pig.Expression expression11 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceStatistics resourceStatistics15 = parsingWikipediaLoader1.getStatistics("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21href", job14);
        org.apache.hadoop.mapreduce.Job job17 = null;
        java.lang.String[] strArray18 = parsingWikipediaLoader1.getPartitionKeys("http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21", job17);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple19 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNull(resourceStatistics10);
        org.junit.Assert.assertNull(resourceStatistics15);
        org.junit.Assert.assertNull(strArray18);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"\"\"hi!\"\" \"", "\"http://.wikipedia.org/wiki/hi%21\"\n", "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = uriUriNTriplesLoader3.getStatistics("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22", job5);
        org.junit.Assert.assertNull(resourceStatistics6);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi _ % 21.wikipedia.org/wiki/%22%22%22%22%22%22%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22%22%22%22_%22%22%22", "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n\n", "http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n.wikipedia.org/wiki/%22hi%21%22");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("http://http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522.wikipedia.org/wiki/%22_hi_%21_%22\n\n", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        safeTsvText0.setPigLogger(pigLogger1);
        safeTsvText0.finish();
        pignlproc.evaluation.CheckAbstract checkAbstract4 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema5 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema6 = checkAbstract4.outputSchema(schema5);
        org.apache.pig.data.Tuple tuple7 = null;
        java.lang.Boolean boolean8 = checkAbstract4.exec(tuple7);
        java.lang.Enum enum10 = null;
        checkAbstract4.warn("href", enum10);
        checkAbstract4.finish();
        pignlproc.evaluation.SafeTsvText safeTsvText13 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        safeTsvText13.setPigLogger(pigLogger14);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText16.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract18.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText13.outputSchema(schema21);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText23 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray25 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList26 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean27 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList26, spanArray25);
        java.lang.String str28 = mergeAsOpenNLPAnnotatedText23.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList26);
        pignlproc.evaluation.ConcatTextBag concatTextBag30 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract31 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum33 = null;
        checkAbstract31.warn("http://.wikipedia.org/wiki/hi%21", enum33);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        checkAbstract31.setPigLogger(pigLogger35);
        checkAbstract31.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText38 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger39 = null;
        safeTsvText38.setPigLogger(pigLogger39);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText41 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable42 = mergeAsOpenNLPAnnotatedText41.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract43 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = checkAbstract43.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = mergeAsOpenNLPAnnotatedText41.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = safeTsvText38.outputSchema(schema46);
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract31.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = concatTextBag30.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = mergeAsOpenNLPAnnotatedText23.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = safeTsvText13.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = checkAbstract4.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = safeTsvText0.outputSchema(schema48);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList54 = safeTsvText0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger55 = null;
        safeTsvText0.setPigLogger(pigLogger55);
        org.junit.Assert.assertNotNull(schema6);
        org.junit.Assert.assertEquals("'" + boolean8 + "' != '" + false + "'", boolean8, false);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(spanArray25);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "href" + "'", str28, "href");
        org.junit.Assert.assertNull(pigProgressable42);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNull(funcSpecList54);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://hi !\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522", "http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href", "\"\"\"http://.wikipedia.org/wiki/hi%21\"\"  \"");
        org.apache.pig.LoadCaster loadCaster4 = uriUriNTriplesLoader3.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job6 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesLoader3.setLocation("\"\"\"opennlp / en - sent . bin\"\"\"", job6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster4);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("hi !");
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader8, pigSplit9);
        org.apache.hadoop.mapreduce.RecordReader recordReader11 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit12 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader11, pigSplit12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        org.apache.pig.ResourceSchema resourceSchema16 = parsingWikipediaLoader1.getSchema("http://.wikipedia.org/wiki/%22_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22", job15);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple17 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(resourceSchema16);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("\"hi! \"", job6);
        org.apache.pig.LoadCaster loadCaster8 = uriUriNTriplesLoader3.getLoadCaster();
        uriUriNTriplesLoader3.setUDFContextSignature("");
        org.apache.pig.LoadCaster loadCaster11 = uriUriNTriplesLoader3.getLoadCaster();
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
        org.junit.Assert.assertNotNull(loadCaster8);
        org.junit.Assert.assertNotNull(loadCaster11);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader5, pigSplit6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        java.lang.String[] strArray10 = parsingWikipediaLoader1.getPartitionKeys("http://.wikipedia.org/wiki/hi%21", job9);
        org.apache.pig.Expression expression11 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceStatistics resourceStatistics15 = parsingWikipediaLoader1.getStatistics("\"hi!\"\n\n", job14);
        org.apache.hadoop.mapreduce.Job job17 = null;
        org.apache.pig.ResourceSchema resourceSchema18 = parsingWikipediaLoader1.getSchema("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", job17);
        org.apache.hadoop.mapreduce.RecordReader recordReader19 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit20 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader19, pigSplit20);
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNull(strArray10);
        org.junit.Assert.assertNull(resourceStatistics15);
        org.junit.Assert.assertNotNull(resourceSchema18);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        java.lang.reflect.Type type6 = checkAbstract0.getReturnType();
        boolean boolean7 = checkAbstract0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = checkAbstract0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        checkAbstract0.setPigLogger(pigLogger9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = checkAbstract0.getReporter();
        java.lang.Enum enum13 = null;
        checkAbstract0.warn("hi !\n", enum13);
        checkAbstract0.progress();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray18 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList19 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList19, spanArray18);
        java.lang.String str21 = mergeAsOpenNLPAnnotatedText16.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList19);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList22 = mergeAsOpenNLPAnnotatedText16.getArgToFuncMapping();
        org.apache.commons.logging.Log log23 = mergeAsOpenNLPAnnotatedText16.getLogger();
        pignlproc.evaluation.CheckAbstract checkAbstract24 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum26 = null;
        checkAbstract24.warn("http://.wikipedia.org/wiki/hi%21", enum26);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable28 = null;
        checkAbstract24.setReporter(pigProgressable28);
        java.lang.reflect.Type type30 = checkAbstract24.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath31 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText32 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger33 = null;
        safeTsvText32.setPigLogger(pigLogger33);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText35 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable36 = mergeAsOpenNLPAnnotatedText35.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract37 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = checkAbstract37.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = mergeAsOpenNLPAnnotatedText35.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = safeTsvText32.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = noLoopInPath31.outputSchema(schema40);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag43 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText44 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger45 = null;
        safeTsvText44.setPigLogger(pigLogger45);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText47 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable48 = mergeAsOpenNLPAnnotatedText47.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract49 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = checkAbstract49.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = mergeAsOpenNLPAnnotatedText47.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = safeTsvText44.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = aggregateTextBag43.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = noLoopInPath31.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = checkAbstract24.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = checkAbstract0.outputSchema(schema56);
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNotNull(spanArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "hi !" + "'", str21, "hi !");
        org.junit.Assert.assertNull(funcSpecList22);
        org.junit.Assert.assertNotNull(log23);
        org.junit.Assert.assertNotNull(type30);
        org.junit.Assert.assertNull(pigProgressable36);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(pigProgressable48);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = null;
        mergeAsOpenNLPAnnotatedText0.setPigLogger(pigLogger6);
        boolean boolean8 = mergeAsOpenNLPAnnotatedText0.isAsynchronous();
        pignlproc.evaluation.CheckAbstract checkAbstract9 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum11 = null;
        checkAbstract9.warn("http://.wikipedia.org/wiki/hi%21", enum11);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable13 = null;
        checkAbstract9.setReporter(pigProgressable13);
        java.lang.reflect.Type type15 = checkAbstract9.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath16 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText17 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = null;
        safeTsvText17.setPigLogger(pigLogger18);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText20 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable21 = mergeAsOpenNLPAnnotatedText20.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract22 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = checkAbstract22.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = mergeAsOpenNLPAnnotatedText20.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = safeTsvText17.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = noLoopInPath16.outputSchema(schema25);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag28 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText29 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger30 = null;
        safeTsvText29.setPigLogger(pigLogger30);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText32 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable33 = mergeAsOpenNLPAnnotatedText32.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract34 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = checkAbstract34.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = mergeAsOpenNLPAnnotatedText32.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = safeTsvText29.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = aggregateTextBag28.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = noLoopInPath16.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = checkAbstract9.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema37);
        org.apache.commons.logging.Log log43 = mergeAsOpenNLPAnnotatedText0.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger44 = null;
        mergeAsOpenNLPAnnotatedText0.setPigLogger(pigLogger44);
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi !" + "'", str5, "hi !");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(type15);
        org.junit.Assert.assertNull(pigProgressable21);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(pigProgressable33);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(log43);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"\"\"hi!\"\" \"", "\"http://.wikipedia.org/wiki/hi%21\"\n", "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.InputFormat inputFormat5 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job7 = null;
        java.lang.String[] strArray8 = uriUriNTriplesLoader3.getPartitionKeys("http://\"http://.wikipedia.org/wiki/hi%21\"\n\n.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%0A", job7);
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNotNull(inputFormat5);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.lang.Appendable appendable14 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser11.new CountingAppendable(appendable14);
        countingAppendable15.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable18 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser19.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser19.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList22 = annotatingMarkupParser19.getHeaderAnnotations();
        java.lang.String str23 = annotatingMarkupParser19.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser24 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser24.getHeaders();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser24.getHeaders();
        java.lang.Appendable appendable27 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser24.new CountingAppendable(appendable27);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser19.new CountingAppendable((java.lang.Appendable) countingAppendable28);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable30 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable28);
        java.lang.String str31 = annotatingMarkupParser0.getRedirect();
        boolean boolean32 = annotatingMarkupParser0.noLinks();
        java.util.List<java.lang.String> strList33 = annotatingMarkupParser0.getParagraphs();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNull(str31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(strList33);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (byte) -1, 52, "\"hi!\"", "hi!");
        int int5 = annotation4.end;
        java.lang.String str6 = annotation4.label;
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52 + "'", int5 == 52);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\"hi!\"" + "'", str6, "\"hi!\"");
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        checkAbstract0.finish();
        java.lang.Enum enum5 = null;
        checkAbstract0.warn("href", enum5);
        java.lang.Enum enum8 = null;
        checkAbstract0.warn("hi!\n\n", enum8);
        checkAbstract0.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = checkAbstract0.getReporter();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertNull(pigProgressable11);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"  \".wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22", "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21", "http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22");
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22href", "http://hi!\n.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin");
        org.apache.hadoop.mapreduce.RecordReader recordReader3 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit4 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader3, pigSplit4);
        org.apache.pig.Expression expression6 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceSchema resourceSchema10 = uriStringLiteralNTriplesLoader2.getSchema("\"\"\"\"\"\"\"opennlp / en - sent . bin\"\"\"\"\"\"\"", job9);
        org.junit.Assert.assertNotNull(resourceSchema10);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        pignlproc.evaluation.NoLoopInPath noLoopInPath7 = new pignlproc.evaluation.NoLoopInPath("wikiobject");
        boolean boolean8 = noLoopInPath7.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath9 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        safeTsvText10.setPigLogger(pigLogger11);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = mergeAsOpenNLPAnnotatedText13.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract15 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = checkAbstract15.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = mergeAsOpenNLPAnnotatedText13.outputSchema(schema16);
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = safeTsvText10.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = noLoopInPath9.outputSchema(schema18);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink21 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath22 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText23 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger24 = null;
        safeTsvText23.setPigLogger(pigLogger24);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText26 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable27 = mergeAsOpenNLPAnnotatedText26.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract28 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = checkAbstract28.outputSchema(schema29);
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = mergeAsOpenNLPAnnotatedText26.outputSchema(schema29);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = safeTsvText23.outputSchema(schema31);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = noLoopInPath22.outputSchema(schema31);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag34 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText35 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger36 = null;
        safeTsvText35.setPigLogger(pigLogger36);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText38 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable39 = mergeAsOpenNLPAnnotatedText38.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract40 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = checkAbstract40.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = mergeAsOpenNLPAnnotatedText38.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = safeTsvText35.outputSchema(schema43);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = aggregateTextBag34.outputSchema(schema43);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = noLoopInPath22.outputSchema(schema43);
        pignlproc.evaluation.CheckAbstract checkAbstract47 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum49 = null;
        checkAbstract47.warn("http://.wikipedia.org/wiki/hi%21", enum49);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger51 = null;
        checkAbstract47.setPigLogger(pigLogger51);
        checkAbstract47.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText54 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger55 = null;
        safeTsvText54.setPigLogger(pigLogger55);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText57 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable58 = mergeAsOpenNLPAnnotatedText57.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract59 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = checkAbstract59.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = mergeAsOpenNLPAnnotatedText57.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = safeTsvText54.outputSchema(schema62);
        org.apache.pig.impl.logicalLayer.schema.Schema schema64 = checkAbstract47.outputSchema(schema63);
        org.apache.pig.impl.logicalLayer.schema.Schema schema65 = noLoopInPath22.outputSchema(schema64);
        org.apache.pig.impl.logicalLayer.schema.Schema schema66 = sentencesWithLink21.outputSchema(schema65);
        org.apache.pig.impl.logicalLayer.schema.Schema schema67 = noLoopInPath9.outputSchema(schema65);
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = noLoopInPath7.outputSchema(schema67);
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = checkAbstract0.outputSchema(schema67);
        checkAbstract0.finish();
        java.lang.reflect.Type type71 = checkAbstract0.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNull(pigProgressable27);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNull(pigProgressable39);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNull(pigProgressable58);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNotNull(schema64);
        org.junit.Assert.assertNotNull(schema65);
        org.junit.Assert.assertNotNull(schema66);
        org.junit.Assert.assertNotNull(schema67);
        org.junit.Assert.assertNotNull(schema68);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(type71);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("http://hi!\n.wikipedia.org/wiki/%22_title_%22", "hi !\n\n");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://\"\"\"\"\"\"\"\"\"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\"\"\"\"\" \"\"\"\"\"\"\".wikipedia.org/wiki/http%3A%2F%2F%22title%22%0A.wikipedia.org%2Fwiki%2F", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("\"\"\"hi ! \"\"\"", job7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema5);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("hi!", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("hi!", job6);
        parsingWikipediaLoader1.setUDFContextSignature("title");
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceStatistics resourceStatistics12 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/hi%21", job11);
        org.apache.hadoop.mapreduce.RecordReader recordReader13 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit14 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader13, pigSplit14);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple16 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
        org.junit.Assert.assertNotNull(resourceSchema7);
        org.junit.Assert.assertNull(resourceStatistics12);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", "http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22");
        org.apache.hadoop.mapreduce.Job job4 = null;
        java.lang.String[] strArray5 = uriStringLiteralNTriplesLoader2.getPartitionKeys("http://\"title\"\n.wikipedia.org/wiki/", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriStringLiteralNTriplesLoader2.getSchema("\"opennlp/en-sent.bin\"", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesLoader2.setLocation("\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n\n", job10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in scheme name at index 0: \"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%2521%22%22%22%22%20%22%22%22%0A%0A");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(resourceSchema8);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("wikiobject", job6);
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader8, pigSplit9);
        parsingWikipediaLoader1.setUDFContextSignature("\"\"\n");
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str2 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.Annotation annotation7 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation12 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int13 = annotation12.end;
        int int14 = annotation12.begin;
        pignlproc.markup.Annotation[] annotationArray15 = new pignlproc.markup.Annotation[] { annotation7, annotation12 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList16 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList16, annotationArray15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser18.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser18.getHeaderAnnotations();
        java.lang.String str22 = annotatingMarkupParser18.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser23 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser23.getHeaders();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser23.getHeaders();
        java.lang.Appendable appendable26 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable27 = annotatingMarkupParser23.new CountingAppendable(appendable26);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser18.new CountingAppendable((java.lang.Appendable) countingAppendable27);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser29 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList30 = annotatingMarkupParser29.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel32 = annotatingMarkupParser29.makeWikiModel("title");
        annotatingMarkupParser0.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList16, (java.lang.Appendable) countingAppendable27, (info.bliki.wiki.model.IWikiModel) wikiModel32);
        java.util.List<pignlproc.markup.Annotation> annotationList34 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.lang.String str36 = annotatingMarkupParser0.parse("\"hi!\"");
        java.util.List<java.lang.String> strList37 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList38 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList39 = annotatingMarkupParser0.getParagraphAnnotations();
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(annotationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(annotationList30);
        org.junit.Assert.assertNotNull(wikiModel32);
        org.junit.Assert.assertNotNull(annotationList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"hi!\"\n" + "'", str36, "\"hi!\"\n");
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(annotationList38);
        org.junit.Assert.assertNotNull(annotationList39);
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.lang.String str4 = annotatingMarkupParser0.parse("\"title\"");
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList6 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.lang.String str7 = annotatingMarkupParser0.getRedirect();
        java.lang.String str8 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser9 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList10 = annotatingMarkupParser9.getHeaderAnnotations();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser9.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList12 = annotatingMarkupParser9.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser13 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser13.getHeaders();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser13.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList16 = annotatingMarkupParser13.getHeaderAnnotations();
        java.lang.String str17 = annotatingMarkupParser13.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser18.getHeaders();
        java.lang.Appendable appendable21 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable22 = annotatingMarkupParser18.new CountingAppendable(appendable21);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser13.new CountingAppendable((java.lang.Appendable) countingAppendable22);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser24 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser24.getHeaders();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser24.getHeaders();
        java.lang.Appendable appendable27 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser24.new CountingAppendable(appendable27);
        countingAppendable28.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable31 = annotatingMarkupParser13.new CountingAppendable((java.lang.Appendable) countingAppendable28);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser33 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        info.bliki.wiki.model.WikiModel wikiModel35 = annotatingMarkupParser33.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        annotatingMarkupParser0.nodesToText(annotationList12, (java.lang.Appendable) countingAppendable28, (info.bliki.wiki.model.IWikiModel) wikiModel35);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink37 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger38 = null;
        sentencesWithLink37.setPigLogger(pigLogger38);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList40 = sentencesWithLink37.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger41 = sentencesWithLink37.getPigLogger();
        boolean boolean42 = sentencesWithLink37.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger43 = sentencesWithLink37.getPigLogger();
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<opennlp.tools.util.Span> spanList44 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) countingAppendable28, (java.lang.Object) sentencesWithLink37);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: pignlproc.markup.AnnotatingMarkupParser$CountingAppendable cannot be cast to java.lang.Integer");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\"title\"\n" + "'", str4, "\"title\"\n");
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(annotationList6);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(annotationList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(annotationList12);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(annotationList16);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(wikiModel35);
        org.junit.Assert.assertNull(funcSpecList40);
        org.junit.Assert.assertNull(pigLogger41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(pigLogger43);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        java.lang.String[] strArray8 = uriStringLiteralNTriplesLoader2.getPartitionKeys("wikiobject", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceSchema resourceSchema11 = uriStringLiteralNTriplesLoader2.getSchema("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/%22%22%22_http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22%22%22", job10);
        uriStringLiteralNTriplesLoader2.setUDFContextSignature("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n.wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22");
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(strArray8);
        org.junit.Assert.assertNotNull(resourceSchema11);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"hi!\"\n\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser3 = new pignlproc.markup.AnnotatingMarkupParser("hi!");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser4 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser4.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList6 = annotatingMarkupParser4.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser4.getParagraphAnnotations();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser4.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser4.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser10 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList11 = annotatingMarkupParser10.getHeaderAnnotations();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser10.getParagraphs();
        java.lang.Appendable appendable13 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser10.new CountingAppendable(appendable13);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser4.new CountingAppendable((java.lang.Appendable) countingAppendable14);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser3.new CountingAppendable((java.lang.Appendable) countingAppendable14);
        java.lang.Appendable appendable17 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable18 = annotatingMarkupParser3.new CountingAppendable(appendable17);
        countingAppendable18.currentPosition = 10;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable23 = countingAppendable21.append('a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(annotationList6);
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(annotationList11);
        org.junit.Assert.assertNotNull(strList12);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag0 = new pignlproc.evaluation.AggregateTextBag();
        org.apache.commons.logging.Log log1 = aggregateTextBag0.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable2 = aggregateTextBag0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        aggregateTextBag0.setReporter(pigProgressable3);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag5 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText6 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = null;
        safeTsvText6.setPigLogger(pigLogger7);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText9 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable10 = mergeAsOpenNLPAnnotatedText9.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract11 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = checkAbstract11.outputSchema(schema12);
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = mergeAsOpenNLPAnnotatedText9.outputSchema(schema12);
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = safeTsvText6.outputSchema(schema14);
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = aggregateTextBag5.outputSchema(schema14);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = aggregateTextBag0.outputSchema(schema16);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = aggregateTextBag0.getPigLogger();
        org.junit.Assert.assertNotNull(log1);
        org.junit.Assert.assertNull(pigProgressable2);
        org.junit.Assert.assertNull(pigProgressable10);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(pigLogger18);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
        pignlproc.evaluation.NoLoopInPath noLoopInPath0 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText1 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        safeTsvText1.setPigLogger(pigLogger2);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText4 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = mergeAsOpenNLPAnnotatedText4.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = mergeAsOpenNLPAnnotatedText4.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = safeTsvText1.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = noLoopInPath0.outputSchema(schema9);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag12 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText13 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        safeTsvText13.setPigLogger(pigLogger14);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText16.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract18.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText13.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = aggregateTextBag12.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = noLoopInPath0.outputSchema(schema21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger25 = null;
        noLoopInPath0.setPigLogger(pigLogger25);
        org.apache.pig.data.Tuple tuple27 = null;
        java.lang.Boolean boolean28 = noLoopInPath0.exec(tuple27);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable29 = null;
        noLoopInPath0.setReporter(pigProgressable29);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = noLoopInPath0.getReporter();
        org.apache.commons.logging.Log log32 = noLoopInPath0.getLogger();
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + boolean28 + "' != '" + true + "'", boolean28, true);
        org.junit.Assert.assertNull(pigProgressable31);
        org.junit.Assert.assertNotNull(log32);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        java.lang.reflect.Type type5 = sentencesWithLink0.getReturnType();
        pignlproc.evaluation.ConcatTextBag concatTextBag8 = new pignlproc.evaluation.ConcatTextBag("title", false);
        concatTextBag8.finish();
        pignlproc.evaluation.SafeTsvText safeTsvText10 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum12 = null;
        safeTsvText10.warn("http://.wikipedia.org/wiki/hi%21", enum12);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = safeTsvText10.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable15 = null;
        safeTsvText10.setReporter(pigProgressable15);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = null;
        safeTsvText10.setReporter(pigProgressable17);
        boolean boolean19 = safeTsvText10.isAsynchronous();
        java.lang.Enum enum21 = null;
        safeTsvText10.warn("\"title\"\n", enum21);
        pignlproc.evaluation.ConcatTextBag concatTextBag24 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract25 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum27 = null;
        checkAbstract25.warn("http://.wikipedia.org/wiki/hi%21", enum27);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger29 = null;
        checkAbstract25.setPigLogger(pigLogger29);
        checkAbstract25.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText32 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger33 = null;
        safeTsvText32.setPigLogger(pigLogger33);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText35 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable36 = mergeAsOpenNLPAnnotatedText35.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract37 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = checkAbstract37.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = mergeAsOpenNLPAnnotatedText35.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = safeTsvText32.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = checkAbstract25.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = concatTextBag24.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = safeTsvText10.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = concatTextBag8.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = sentencesWithLink0.outputSchema(schema42);
        org.apache.pig.data.Tuple tuple47 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag48 = sentencesWithLink0.exec(tuple47);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type5);
        org.junit.Assert.assertNull(pigProgressable14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(pigProgressable36);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http://\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\".wikipedia.org/wiki/%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22\n", "http://http://hi!\n.wikipedia.org/wiki/%22_title_%22\n.wikipedia.org/wiki/%22title%22href", "\"\"\"opennlp / en - sent . bin\"\"\"");
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("http : // hi ! . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin");
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract("\"\"\"hi!\"\" \"\n\n");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException; message: For input string: \"\"\"\"hi!\"\" \"??\"");
        } catch (java.lang.NumberFormatException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n.wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521", true);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText2 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = null;
        safeTsvText2.setPigLogger(pigLogger3);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText5 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = mergeAsOpenNLPAnnotatedText5.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract7 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = checkAbstract7.outputSchema(schema8);
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = mergeAsOpenNLPAnnotatedText5.outputSchema(schema8);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = safeTsvText2.outputSchema(schema10);
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = noLoopInPath1.outputSchema(schema10);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag13 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText14 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger15 = null;
        safeTsvText14.setPigLogger(pigLogger15);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText17 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable18 = mergeAsOpenNLPAnnotatedText17.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract19 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = checkAbstract19.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = mergeAsOpenNLPAnnotatedText17.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = safeTsvText14.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = aggregateTextBag13.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = noLoopInPath1.outputSchema(schema22);
        pignlproc.evaluation.CheckAbstract checkAbstract26 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum28 = null;
        checkAbstract26.warn("http://.wikipedia.org/wiki/hi%21", enum28);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger30 = null;
        checkAbstract26.setPigLogger(pigLogger30);
        checkAbstract26.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText33 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger34 = null;
        safeTsvText33.setPigLogger(pigLogger34);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText36 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable37 = mergeAsOpenNLPAnnotatedText36.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract38 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = checkAbstract38.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = mergeAsOpenNLPAnnotatedText36.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = safeTsvText33.outputSchema(schema41);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = checkAbstract26.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = noLoopInPath1.outputSchema(schema43);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = sentencesWithLink0.outputSchema(schema44);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable46 = sentencesWithLink0.getReporter();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList47 = sentencesWithLink0.getArgToFuncMapping();
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNull(pigProgressable18);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(pigProgressable37);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNull(pigProgressable46);
        org.junit.Assert.assertNull(funcSpecList47);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("http://\"http : // \"\" opennlp / en - sent . bin \"\" . wikipedia . org / wiki / href\".wikipedia.org/wiki/http%3A%2F%2F%22title%22%0A.wikipedia.org%2Fwiki%2F%0A");
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", true);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.String str4 = concatTextBag2.exec(tuple3);
        java.lang.reflect.Type type5 = concatTextBag2.getReturnType();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(type5);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http://\"title\"\n.wikipedia.org/wiki/");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.junit.Assert.assertNotNull(loadCaster2);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\"hi! \"", "http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21.wikipedia.org/wiki/%22hi%21_%22" + "'", str2, "http://http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21.wikipedia.org/wiki/%22hi%21_%22");
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http : // hi ! . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin\n");
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.RecordReader recordReader2 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit3 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader2, pigSplit3);
        org.apache.hadoop.mapreduce.InputFormat inputFormat5 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceStatistics resourceStatistics8 = parsingWikipediaLoader1.getStatistics("", job7);
        org.apache.pig.LoadCaster loadCaster9 = parsingWikipediaLoader1.getLoadCaster();
        org.junit.Assert.assertNotNull(inputFormat5);
        org.junit.Assert.assertNull(resourceStatistics8);
        org.junit.Assert.assertNotNull(loadCaster9);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("\"\"\"http : // http : // hi ! . wikipedia . org / wiki / % 22 _ title _ % 22 . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"\"\"\"http : // http : // hi ! . wikipedia . org / wiki / % 22 _ title _ % 22 . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin\"\"\"\"\"\"\"" + "'", str1, "\"\"\"\"\"\"\"http : // http : // hi ! . wikipedia . org / wiki / % 22 _ title _ % 22 . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin\"\"\"\"\"\"\"");
    }

    @Test
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        java.lang.String str1 = pignlproc.evaluation.SafeTsvText.escape("\"\"\"\"\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"\"\"\"\"\"");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"" + "'", str1, "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag1 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 0);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable2 = null;
        aggregateTextBag1.setReporter(pigProgressable2);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("\"\"\"\"\"\"\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22href\"\"\"\"\"\"\"", "\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"");
        org.apache.hadoop.mapreduce.RecordReader recordReader3 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit4 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader3, pigSplit4);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("http://.wikipedia.org/wiki/hi%21\n");
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceStatistics resourceStatistics10 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", job9);
        org.apache.pig.Expression expression11 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceStatistics resourceStatistics15 = parsingWikipediaLoader1.getStatistics("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21href", job14);
        org.apache.hadoop.mapreduce.InputFormat inputFormat16 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job18 = null;
        org.apache.pig.ResourceSchema resourceSchema19 = parsingWikipediaLoader1.getSchema("http://\"title\"\n.wikipedia.org/wiki/\n", job18);
        org.apache.hadoop.mapreduce.RecordReader recordReader20 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit21 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader20, pigSplit21);
        org.apache.hadoop.mapreduce.Job job24 = null;
        org.apache.pig.ResourceStatistics resourceStatistics25 = parsingWikipediaLoader1.getStatistics("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22hrefhref", job24);
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNull(resourceStatistics10);
        org.junit.Assert.assertNull(resourceStatistics15);
        org.junit.Assert.assertNotNull(inputFormat16);
        org.junit.Assert.assertNotNull(resourceSchema19);
        org.junit.Assert.assertNull(resourceStatistics25);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str2 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.Annotation annotation7 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation12 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int13 = annotation12.end;
        int int14 = annotation12.begin;
        pignlproc.markup.Annotation[] annotationArray15 = new pignlproc.markup.Annotation[] { annotation7, annotation12 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList16 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList16, annotationArray15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser18.getHeaders();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser18.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser18.getHeaderAnnotations();
        java.lang.String str22 = annotatingMarkupParser18.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser23 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList24 = annotatingMarkupParser23.getHeaders();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser23.getHeaders();
        java.lang.Appendable appendable26 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable27 = annotatingMarkupParser23.new CountingAppendable(appendable26);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser18.new CountingAppendable((java.lang.Appendable) countingAppendable27);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser29 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList30 = annotatingMarkupParser29.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel32 = annotatingMarkupParser29.makeWikiModel("title");
        annotatingMarkupParser0.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList16, (java.lang.Appendable) countingAppendable27, (info.bliki.wiki.model.IWikiModel) wikiModel32);
        java.util.List<pignlproc.markup.Annotation> annotationList34 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.lang.String str36 = annotatingMarkupParser0.parse("\"hi!\"");
        java.lang.String str38 = annotatingMarkupParser0.parse("\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\n");
        java.lang.String str39 = annotatingMarkupParser0.getRedirect();
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 52 + "'", int14 == 52);
        org.junit.Assert.assertNotNull(annotationArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(strList24);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(annotationList30);
        org.junit.Assert.assertNotNull(wikiModel32);
        org.junit.Assert.assertNotNull(annotationList34);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\"hi!\"\n" + "'", str36, "\"hi!\"\n");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\n\n" + "'", str38, "\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\n\n");
        org.junit.Assert.assertNull(str39);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        sentencesWithLink0.setReporter(pigProgressable5);
        java.lang.reflect.Type type7 = sentencesWithLink0.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = sentencesWithLink0.getArgToFuncMapping();
        sentencesWithLink0.progress();
        boolean boolean10 = sentencesWithLink0.isAsynchronous();
        java.lang.reflect.Type type11 = sentencesWithLink0.getReturnType();
        java.lang.reflect.Type type12 = sentencesWithLink0.getReturnType();
        java.lang.Enum enum14 = null;
        sentencesWithLink0.warn("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22href\"", enum14);
        org.apache.pig.data.Tuple tuple16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.DataBag dataBag17 = sentencesWithLink0.exec(tuple16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(type11);
        org.junit.Assert.assertNotNull(type12);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        java.lang.Enum enum6 = null;
        checkAbstract0.warn("href", enum6);
        checkAbstract0.finish();
        checkAbstract0.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable10 = null;
        checkAbstract0.setReporter(pigProgressable10);
        org.apache.pig.data.Tuple tuple12 = null;
        java.lang.Boolean boolean13 = checkAbstract0.exec(tuple12);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        checkAbstract0.setPigLogger(pigLogger14);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable16 = null;
        checkAbstract0.setReporter(pigProgressable16);
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum20 = null;
        checkAbstract18.warn("http://.wikipedia.org/wiki/hi%21", enum20);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable22 = checkAbstract18.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable23 = null;
        checkAbstract18.setReporter(pigProgressable23);
        boolean boolean25 = checkAbstract18.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger26 = checkAbstract18.getPigLogger();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink27 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = null;
        sentencesWithLink27.setPigLogger(pigLogger28);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList30 = sentencesWithLink27.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = sentencesWithLink27.getPigLogger();
        boolean boolean32 = sentencesWithLink27.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList33 = sentencesWithLink27.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable34 = null;
        sentencesWithLink27.setReporter(pigProgressable34);
        java.lang.reflect.Type type36 = sentencesWithLink27.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList37 = sentencesWithLink27.getArgToFuncMapping();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink38 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger39 = null;
        sentencesWithLink38.setPigLogger(pigLogger39);
        sentencesWithLink38.finish();
        pignlproc.evaluation.SafeTsvText safeTsvText42 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum44 = null;
        safeTsvText42.warn("http://.wikipedia.org/wiki/hi%21", enum44);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable46 = safeTsvText42.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable47 = null;
        safeTsvText42.setReporter(pigProgressable47);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable49 = null;
        safeTsvText42.setReporter(pigProgressable49);
        boolean boolean51 = safeTsvText42.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath52 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText53 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger54 = null;
        safeTsvText53.setPigLogger(pigLogger54);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText56 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable57 = mergeAsOpenNLPAnnotatedText56.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract58 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = checkAbstract58.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = mergeAsOpenNLPAnnotatedText56.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = safeTsvText53.outputSchema(schema61);
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = noLoopInPath52.outputSchema(schema61);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger64 = noLoopInPath52.getPigLogger();
        java.lang.reflect.Type type65 = noLoopInPath52.getReturnType();
        pignlproc.evaluation.NoLoopInPath noLoopInPath66 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText67 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger68 = null;
        safeTsvText67.setPigLogger(pigLogger68);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText70 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable71 = mergeAsOpenNLPAnnotatedText70.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract72 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = checkAbstract72.outputSchema(schema73);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = mergeAsOpenNLPAnnotatedText70.outputSchema(schema73);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = safeTsvText67.outputSchema(schema75);
        org.apache.pig.impl.logicalLayer.schema.Schema schema77 = noLoopInPath66.outputSchema(schema75);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag78 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText79 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger80 = null;
        safeTsvText79.setPigLogger(pigLogger80);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText82 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable83 = mergeAsOpenNLPAnnotatedText82.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract84 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema85 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema86 = checkAbstract84.outputSchema(schema85);
        org.apache.pig.impl.logicalLayer.schema.Schema schema87 = mergeAsOpenNLPAnnotatedText82.outputSchema(schema85);
        org.apache.pig.impl.logicalLayer.schema.Schema schema88 = safeTsvText79.outputSchema(schema87);
        org.apache.pig.impl.logicalLayer.schema.Schema schema89 = aggregateTextBag78.outputSchema(schema87);
        org.apache.pig.impl.logicalLayer.schema.Schema schema90 = noLoopInPath66.outputSchema(schema87);
        org.apache.pig.impl.logicalLayer.schema.Schema schema91 = noLoopInPath52.outputSchema(schema90);
        org.apache.pig.impl.logicalLayer.schema.Schema schema92 = safeTsvText42.outputSchema(schema91);
        org.apache.pig.impl.logicalLayer.schema.Schema schema93 = sentencesWithLink38.outputSchema(schema92);
        org.apache.pig.impl.logicalLayer.schema.Schema schema94 = sentencesWithLink27.outputSchema(schema92);
        org.apache.pig.impl.logicalLayer.schema.Schema schema95 = checkAbstract18.outputSchema(schema94);
        org.apache.pig.impl.logicalLayer.schema.Schema schema96 = checkAbstract0.outputSchema(schema94);
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean13 + "' != '" + false + "'", boolean13, false);
        org.junit.Assert.assertNull(pigProgressable22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(pigLogger26);
        org.junit.Assert.assertNull(funcSpecList30);
        org.junit.Assert.assertNull(pigLogger31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(funcSpecList33);
        org.junit.Assert.assertNotNull(type36);
        org.junit.Assert.assertNull(funcSpecList37);
        org.junit.Assert.assertNull(pigProgressable46);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNull(pigProgressable57);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNull(pigLogger64);
        org.junit.Assert.assertNotNull(type65);
        org.junit.Assert.assertNull(pigProgressable71);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertNotNull(schema77);
        org.junit.Assert.assertNull(pigProgressable83);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
        org.junit.Assert.assertNotNull(schema88);
        org.junit.Assert.assertNotNull(schema89);
        org.junit.Assert.assertNotNull(schema90);
        org.junit.Assert.assertNotNull(schema91);
        org.junit.Assert.assertNotNull(schema92);
        org.junit.Assert.assertNotNull(schema93);
        org.junit.Assert.assertNotNull(schema94);
        org.junit.Assert.assertNotNull(schema95);
        org.junit.Assert.assertNotNull(schema96);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("");
        uriUriNTriplesStorer1.setStoreFuncUDFContextSignature("\"http : // http : // hi ! . wikipedia . org / wiki / % 22 _ title _ % 22 . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin\"");
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser0.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser0.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser14.getHeaders();
        java.util.List<java.lang.String> strList16 = annotatingMarkupParser14.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList17 = annotatingMarkupParser14.getHeaderAnnotations();
        java.lang.String str18 = annotatingMarkupParser14.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser19.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser19.getHeaders();
        java.lang.Appendable appendable22 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable23 = annotatingMarkupParser19.new CountingAppendable(appendable22);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser14.new CountingAppendable((java.lang.Appendable) countingAppendable23);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser25.getHeaders();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser25.getHeaders();
        java.lang.Appendable appendable28 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser25.new CountingAppendable(appendable28);
        countingAppendable29.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable32 = annotatingMarkupParser14.new CountingAppendable((java.lang.Appendable) countingAppendable29);
        countingAppendable32.currentPosition = (byte) -1;
        countingAppendable32.currentPosition = 100;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable37 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable32);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable39 = countingAppendable37.append('4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList16);
        org.junit.Assert.assertNotNull(annotationList17);
        org.junit.Assert.assertNull(str18);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("\"\"\"title\"\"href\"", "\"hi !  href\"");
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21href");
        boolean boolean2 = concatTextBag1.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = concatTextBag1.getPigLogger();
        pignlproc.evaluation.AggregateTextBag aggregateTextBag6 = new pignlproc.evaluation.AggregateTextBag((int) '4', true);
        java.lang.reflect.Type type7 = aggregateTextBag6.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum10 = null;
        checkAbstract8.warn("http://.wikipedia.org/wiki/hi%21", enum10);
        java.lang.Enum enum13 = null;
        checkAbstract8.warn("hi !", enum13);
        pignlproc.evaluation.NoLoopInPath noLoopInPath15 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText16 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger17 = null;
        safeTsvText16.setPigLogger(pigLogger17);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText19 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable20 = mergeAsOpenNLPAnnotatedText19.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract21 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = checkAbstract21.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = mergeAsOpenNLPAnnotatedText19.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = safeTsvText16.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = noLoopInPath15.outputSchema(schema24);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag27 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText28 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger29 = null;
        safeTsvText28.setPigLogger(pigLogger29);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText31 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable32 = mergeAsOpenNLPAnnotatedText31.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract33 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = checkAbstract33.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = mergeAsOpenNLPAnnotatedText31.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = safeTsvText28.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = aggregateTextBag27.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = noLoopInPath15.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = checkAbstract8.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = aggregateTextBag6.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = concatTextBag1.outputSchema(schema41);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(pigLogger3);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertNull(pigProgressable20);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(pigProgressable32);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("\"hi!\"\n", false);
        java.lang.reflect.Type type3 = concatTextBag2.getReturnType();
        org.junit.Assert.assertNotNull(type3);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.lang.Appendable appendable14 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser11.new CountingAppendable(appendable14);
        countingAppendable15.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable18 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable15);
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser0.getParagraphs();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser20 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser20.getHeaders();
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser20.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList23 = annotatingMarkupParser20.getHeaderAnnotations();
        java.lang.String str24 = annotatingMarkupParser20.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser25.getHeaders();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser25.getHeaders();
        java.lang.Appendable appendable28 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser25.new CountingAppendable(appendable28);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable30 = annotatingMarkupParser20.new CountingAppendable((java.lang.Appendable) countingAppendable29);
        java.util.List<java.lang.String> strList31 = annotatingMarkupParser20.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel33 = annotatingMarkupParser20.makeWikiModel("opennlp / en - sent . bin");
        java.lang.String str35 = annotatingMarkupParser20.parse("hi !\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser36 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList37 = annotatingMarkupParser36.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser38 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList39 = annotatingMarkupParser38.getHeaders();
        java.util.List<java.lang.String> strList40 = annotatingMarkupParser38.getHeaders();
        java.util.List<java.lang.String> strList41 = annotatingMarkupParser38.getHeaders();
        java.util.List<java.lang.String> strList42 = annotatingMarkupParser38.getHeaders();
        java.util.List<java.lang.String> strList43 = annotatingMarkupParser38.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList44 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser45 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList46 = annotatingMarkupParser45.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList47 = annotatingMarkupParser45.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList48 = annotatingMarkupParser45.getParagraphAnnotations();
        java.util.List<java.lang.String> strList49 = annotatingMarkupParser45.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList50 = annotatingMarkupParser45.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser51 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList52 = annotatingMarkupParser51.getHeaderAnnotations();
        java.util.List<java.lang.String> strList53 = annotatingMarkupParser51.getParagraphs();
        java.lang.Appendable appendable54 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable55 = annotatingMarkupParser51.new CountingAppendable(appendable54);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable56 = annotatingMarkupParser45.new CountingAppendable((java.lang.Appendable) countingAppendable55);
        countingAppendable55.currentPosition = 35;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser59 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList60 = annotatingMarkupParser59.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel62 = annotatingMarkupParser59.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList63 = annotatingMarkupParser59.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList64 = annotatingMarkupParser59.getParagraphAnnotations();
        boolean boolean65 = annotatingMarkupParser59.noLinks();
        info.bliki.wiki.model.WikiModel wikiModel67 = annotatingMarkupParser59.makeWikiModel("\" title \"");
        annotatingMarkupParser38.nodesToText(annotationList44, (java.lang.Appendable) countingAppendable55, (info.bliki.wiki.model.IWikiModel) wikiModel67);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser69 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList70 = annotatingMarkupParser69.getHeaders();
        java.util.List<java.lang.String> strList71 = annotatingMarkupParser69.getHeaders();
        java.util.List<java.lang.String> strList72 = annotatingMarkupParser69.getHeaders();
        java.util.List<java.lang.String> strList73 = annotatingMarkupParser69.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel75 = annotatingMarkupParser69.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser76 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList77 = annotatingMarkupParser76.getHeaders();
        java.util.List<java.lang.String> strList78 = annotatingMarkupParser76.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList79 = annotatingMarkupParser76.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser80 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList81 = annotatingMarkupParser80.getHeaders();
        java.util.List<java.lang.String> strList82 = annotatingMarkupParser80.getHeaders();
        java.lang.Appendable appendable83 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable84 = annotatingMarkupParser80.new CountingAppendable(appendable83);
        countingAppendable84.currentPosition = (byte) -1;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser87 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList88 = annotatingMarkupParser87.getHeaders();
        java.util.List<java.lang.String> strList89 = annotatingMarkupParser87.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList90 = annotatingMarkupParser87.getHeaderAnnotations();
        java.lang.String str91 = annotatingMarkupParser87.getRedirect();
        java.util.List<java.lang.String> strList92 = annotatingMarkupParser87.getParagraphs();
        java.util.List<java.lang.String> strList93 = annotatingMarkupParser87.getParagraphs();
        info.bliki.wiki.model.WikiModel wikiModel95 = annotatingMarkupParser87.makeWikiModel("hi!");
        annotatingMarkupParser69.nodesToText(annotationList79, (java.lang.Appendable) countingAppendable84, (info.bliki.wiki.model.IWikiModel) wikiModel95);
        annotatingMarkupParser20.nodesToText(annotationList37, (java.lang.Appendable) countingAppendable55, (info.bliki.wiki.model.IWikiModel) wikiModel95);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable98 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable55);
        java.util.List<pignlproc.markup.Annotation> annotationList99 = annotatingMarkupParser0.getWikiLinkAnnotations();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(annotationList23);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(wikiModel33);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "hi !\n\n" + "'", str35, "hi !\n\n");
        org.junit.Assert.assertNotNull(annotationList37);
        org.junit.Assert.assertNotNull(strList39);
        org.junit.Assert.assertNotNull(strList40);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList43);
        org.junit.Assert.assertNotNull(strList46);
        org.junit.Assert.assertNotNull(annotationList47);
        org.junit.Assert.assertNotNull(annotationList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(annotationList50);
        org.junit.Assert.assertNotNull(annotationList52);
        org.junit.Assert.assertNotNull(strList53);
        org.junit.Assert.assertNotNull(annotationList60);
        org.junit.Assert.assertNotNull(wikiModel62);
        org.junit.Assert.assertNotNull(annotationList63);
        org.junit.Assert.assertNotNull(annotationList64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(wikiModel67);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(strList71);
        org.junit.Assert.assertNotNull(strList72);
        org.junit.Assert.assertNotNull(strList73);
        org.junit.Assert.assertNotNull(wikiModel75);
        org.junit.Assert.assertNotNull(strList77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(annotationList79);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(strList82);
        org.junit.Assert.assertNotNull(strList88);
        org.junit.Assert.assertNotNull(strList89);
        org.junit.Assert.assertNotNull(annotationList90);
        org.junit.Assert.assertNull(str91);
        org.junit.Assert.assertNotNull(strList92);
        org.junit.Assert.assertNotNull(strList93);
        org.junit.Assert.assertNotNull(wikiModel95);
        org.junit.Assert.assertNotNull(annotationList99);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        java.lang.Enum enum6 = null;
        checkAbstract0.warn("href", enum6);
        org.apache.pig.data.Tuple tuple8 = null;
        java.lang.Boolean boolean9 = checkAbstract0.exec(tuple8);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList10 = checkAbstract0.getArgToFuncMapping();
        org.apache.commons.logging.Log log11 = checkAbstract0.getLogger();
        java.lang.Enum enum13 = null;
        checkAbstract0.warn("http://\" http : // . wikipedia . org / wiki / hi % 21 \".wikipedia.org/wiki/opennlp%2Fen-sent.bin", enum13);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable15 = null;
        checkAbstract0.setReporter(pigProgressable15);
        java.lang.reflect.Type type17 = checkAbstract0.getReturnType();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + false + "'", boolean9, false);
        org.junit.Assert.assertNull(funcSpecList10);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertNotNull(type17);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.data.Tuple tuple1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = mergeAsOpenNLPAnnotatedText0.exec(tuple1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("http://wikiobject.wikipedia.org/wiki/opennlp%2Fen-sent.bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser3 = new pignlproc.markup.AnnotatingMarkupParser("");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser4 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser4.getHeaders();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser4.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList7 = annotatingMarkupParser4.getHeaderAnnotations();
        java.lang.String str8 = annotatingMarkupParser4.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser9 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList10 = annotatingMarkupParser9.getHeaders();
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser9.getHeaders();
        java.lang.Appendable appendable12 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable13 = annotatingMarkupParser9.new CountingAppendable(appendable12);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable14 = annotatingMarkupParser4.new CountingAppendable((java.lang.Appendable) countingAppendable13);
        info.bliki.wiki.model.WikiModel wikiModel16 = annotatingMarkupParser4.makeWikiModel("\"hi!\"\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser18 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser19 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList20 = annotatingMarkupParser19.getHeaders();
        java.util.List<java.lang.String> strList21 = annotatingMarkupParser19.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList22 = annotatingMarkupParser19.getHeaderAnnotations();
        java.lang.String str23 = annotatingMarkupParser19.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser24 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList25 = annotatingMarkupParser24.getHeaders();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser24.getHeaders();
        java.lang.Appendable appendable27 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable28 = annotatingMarkupParser24.new CountingAppendable(appendable27);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable29 = annotatingMarkupParser19.new CountingAppendable((java.lang.Appendable) countingAppendable28);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser30 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList31 = annotatingMarkupParser30.getHeaders();
        java.util.List<java.lang.String> strList32 = annotatingMarkupParser30.getHeaders();
        java.lang.Appendable appendable33 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable34 = annotatingMarkupParser30.new CountingAppendable(appendable33);
        countingAppendable34.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable37 = annotatingMarkupParser19.new CountingAppendable((java.lang.Appendable) countingAppendable34);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable38 = annotatingMarkupParser18.new CountingAppendable((java.lang.Appendable) countingAppendable37);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable39 = annotatingMarkupParser4.new CountingAppendable((java.lang.Appendable) countingAppendable37);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable40 = annotatingMarkupParser3.new CountingAppendable((java.lang.Appendable) countingAppendable39);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable41 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable40);
        info.bliki.htmlcleaner.TagNode tagNode42 = null;
        info.bliki.wiki.model.ImageFormat imageFormat43 = null;
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser45 = new pignlproc.markup.AnnotatingMarkupParser("opennlp/en-sent.bin");
        info.bliki.wiki.model.WikiModel wikiModel47 = annotatingMarkupParser45.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser48 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList49 = annotatingMarkupParser48.getHeaderAnnotations();
        java.util.List<java.lang.String> strList50 = annotatingMarkupParser48.getParagraphs();
        java.lang.Appendable appendable51 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable52 = annotatingMarkupParser48.new CountingAppendable(appendable51);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable53 = annotatingMarkupParser45.new CountingAppendable(appendable51);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser54 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList55 = annotatingMarkupParser54.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList56 = annotatingMarkupParser54.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel58 = annotatingMarkupParser54.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        java.util.List<pignlproc.markup.Annotation> annotationList59 = annotatingMarkupParser54.getHeaderAnnotations();
        java.lang.String str60 = annotatingMarkupParser54.getRedirect();
        info.bliki.wiki.model.WikiModel wikiModel62 = annotatingMarkupParser54.makeWikiModel("\"\"\"hi!\"\" \"\n");
        // The following exception was thrown during execution in test generation
        try {
            annotatingMarkupParser1.imageNodeToText(tagNode42, imageFormat43, (java.lang.Appendable) countingAppendable53, (info.bliki.wiki.model.IWikiModel) wikiModel62);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(annotationList7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(strList10);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel16);
        org.junit.Assert.assertNotNull(strList20);
        org.junit.Assert.assertNotNull(strList21);
        org.junit.Assert.assertNotNull(annotationList22);
        org.junit.Assert.assertNull(str23);
        org.junit.Assert.assertNotNull(strList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertNotNull(wikiModel47);
        org.junit.Assert.assertNotNull(annotationList49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(annotationList56);
        org.junit.Assert.assertNotNull(wikiModel58);
        org.junit.Assert.assertNotNull(annotationList59);
        org.junit.Assert.assertNull(str60);
        org.junit.Assert.assertNotNull(wikiModel62);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("\"\"\"\"\"\"\"opennlp / en - sent . bin\"\"\"\"\"\"\"", "http://http://\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"  \".wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22.wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2Fhttp%3A%2F%2F%22%22title%22%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_hi_%2521_._wikipedia_._org_%252F_wiki_%252F_opennlp___%2525_2_F___en___-___sent___.___bin");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://http://http://\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"  \".wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22.wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2Fhttp%3A%2F%2F%22%22title%22%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_hi_%2521_._wikipedia_._org_%252F_wiki_%252F_opennlp___%2525_2_F___en___-___sent___.___bin.wikipedia.org/wiki/%22%22%22%22%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22%22%22%22%22" + "'", str2, "http://http://http://\"\"\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\"  \".wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22.wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2Fhttp%3A%2F%2F%22%22title%22%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_hi_%2521_._wikipedia_._org_%252F_wiki_%252F_opennlp___%2525_2_F___en___-___sent___.___bin.wikipedia.org/wiki/%22%22%22%22%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22%22%22%22%22");
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http://\"opennlp/en-sent.bin\"\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhref%0A.wikipedia.org%2Fwiki%2F%2522%2522");
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("http://http://.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/hi_%21\n");
        boolean boolean2 = concatTextBag1.isAsynchronous();
        org.apache.commons.logging.Log log3 = concatTextBag1.getLogger();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(log3);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer1 = new pignlproc.storage.UriUriNTriplesStorer("http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21href");
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        java.lang.Enum enum5 = null;
        checkAbstract0.warn("opennlp / en - sent . bin", enum5);
        checkAbstract0.finish();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = checkAbstract0.getArgToFuncMapping();
        org.junit.Assert.assertNull(funcSpecList8);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Illegal character in scheme name at index 0: \"\"\"\"\"\"\"\"\"\"\"\"\"\"\"http://hi%20!%20.wikipedia.org/wiki/http%253A%252F%252Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%250A.wikipedia.org%252Fwiki%252F%252522title%252522%22%22%22%22%22%22%22%22%22%22%22%22%22%22%22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"\n\n");
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        java.lang.String[] strArray8 = uriStringLiteralNTriplesLoader2.getPartitionKeys("\"hi! \"\n", job7);
        org.apache.pig.Expression expression9 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression9);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(strArray8);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((int) (short) 0, (-1), "\" opennlp / en - sent . bin \"", "\"hi! \"");
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("http://.wikipedia.org/wiki/", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel6 = annotatingMarkupParser0.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser8 = new pignlproc.markup.AnnotatingMarkupParser("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21");
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser8.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel11 = annotatingMarkupParser8.makeWikiModel("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/%22opennlp_%2F_en_-_sent_._bin%22%0A");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser12 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser12.getHeaders();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser12.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList15 = annotatingMarkupParser12.getHeaderAnnotations();
        java.lang.String str16 = annotatingMarkupParser12.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList18 = annotatingMarkupParser17.getHeaders();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser17.getHeaders();
        java.lang.Appendable appendable20 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser17.new CountingAppendable(appendable20);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable22 = annotatingMarkupParser12.new CountingAppendable((java.lang.Appendable) countingAppendable21);
        java.util.List<java.lang.String> strList23 = annotatingMarkupParser12.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel25 = annotatingMarkupParser12.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser26 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser26.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList28 = annotatingMarkupParser26.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel30 = annotatingMarkupParser26.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel32 = annotatingMarkupParser26.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList33 = annotatingMarkupParser26.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser34 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser34.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList36 = annotatingMarkupParser34.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList37 = annotatingMarkupParser34.getParagraphAnnotations();
        java.util.List<java.lang.String> strList38 = annotatingMarkupParser34.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList39 = annotatingMarkupParser34.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser40 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList41 = annotatingMarkupParser40.getHeaderAnnotations();
        java.util.List<java.lang.String> strList42 = annotatingMarkupParser40.getParagraphs();
        java.lang.Appendable appendable43 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable44 = annotatingMarkupParser40.new CountingAppendable(appendable43);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable45 = annotatingMarkupParser34.new CountingAppendable((java.lang.Appendable) countingAppendable44);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser46 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList47 = annotatingMarkupParser46.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList48 = annotatingMarkupParser46.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel50 = annotatingMarkupParser46.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel52 = annotatingMarkupParser46.makeWikiModel("hi!\n");
        annotatingMarkupParser12.nodesToText(annotationList33, (java.lang.Appendable) countingAppendable45, (info.bliki.wiki.model.IWikiModel) wikiModel52);
        countingAppendable45.currentPosition = 0;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable56 = annotatingMarkupParser8.new CountingAppendable((java.lang.Appendable) countingAppendable45);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable57 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable45);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Appendable appendable61 = countingAppendable57.append((java.lang.CharSequence) "http://http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n.wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521\n", (int) (byte) 100, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(wikiModel6);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNotNull(wikiModel11);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(annotationList15);
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(wikiModel25);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(annotationList28);
        org.junit.Assert.assertNotNull(wikiModel30);
        org.junit.Assert.assertNotNull(wikiModel32);
        org.junit.Assert.assertNotNull(annotationList33);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(annotationList36);
        org.junit.Assert.assertNotNull(annotationList37);
        org.junit.Assert.assertNotNull(strList38);
        org.junit.Assert.assertNotNull(annotationList39);
        org.junit.Assert.assertNotNull(annotationList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(annotationList48);
        org.junit.Assert.assertNotNull(wikiModel50);
        org.junit.Assert.assertNotNull(wikiModel52);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"\n\n");
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser1.getHeaderAnnotations();
        org.junit.Assert.assertNotNull(annotationList2);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("hi !");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = parsingWikipediaLoader1.getStatistics("hi!\n", job5);
        org.apache.hadoop.mapreduce.InputFormat inputFormat7 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader8, pigSplit9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", job12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        org.apache.pig.ResourceStatistics resourceStatistics16 = parsingWikipediaLoader1.getStatistics("http : // http : // \" http : // \"\" opennlp / en - sent . bin \"\" . wikipedia . org / wiki / href \" . wikipedia . org / wiki / % 22 _ opennlp _ % 2 F _ en _ - _ sent _ . _ bin _ % 22 . wikipedia . org / wiki / http % 3 A % 2 F % 2 F % 22 http % 3 A % 2 F % 2 Fhi _ % 21 _ . wikipedia . org % 2 Fwiki % 2 Fhttp % 253 A % 252 F % 252 Fhttp % 253 A % 252 F % 252 F . wikipedia . org % 252 Fwiki % 252 Fhi % 252521 % 250 A . wikipedia . org % 252 Fwiki % 252 F % 252522 title % 252522 % 22 . wikipedia . org % 2 Fwiki % 2 F % 2522 % 2522 % 2522 opennlp _ % 252 F _ en _ - _ sent _ . _ bin % 2522 % 2522 % 2522", job15);
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(inputFormat7);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNull(resourceStatistics16);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("http://hi!\n.wikipedia.org/wiki/%22_title_%22");
        boolean boolean2 = noLoopInPath1.isAsynchronous();
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = noLoopInPath1.exec(tuple3);
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = noLoopInPath1.exec(tuple5);
        noLoopInPath1.finish();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + true + "'", boolean4, true);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("\"hi!\"\n\n");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("\"http://hi! .wikipedia.org/wiki/%22_title_%22\"", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"http://hi! .wikipedia.org/wiki/%22_title_%22\" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, 1L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = uriUriNTriplesLoader3.getStatistics("\"hi! \"", job6);
        org.apache.hadoop.mapreduce.RecordReader recordReader8 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit9 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader8, pigSplit9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceStatistics resourceStatistics13 = uriUriNTriplesLoader3.getStatistics("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href", job12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        org.apache.pig.ResourceSchema resourceSchema16 = uriUriNTriplesLoader3.getSchema("http://.wikipedia.org/wiki/%22_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_%22", job15);
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNull(resourceStatistics7);
        org.junit.Assert.assertNull(resourceStatistics13);
        org.junit.Assert.assertNotNull(resourceSchema16);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("opennlp / en - sent . bin", false);
        java.lang.reflect.Type type3 = concatTextBag2.getReturnType();
        concatTextBag2.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = null;
        concatTextBag2.setPigLogger(pigLogger5);
        org.apache.commons.logging.Log log7 = concatTextBag2.getLogger();
        java.lang.Enum enum9 = null;
        concatTextBag2.warn("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"", enum9);
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNotNull(log7);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser0.getParagraphs();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser0.makeWikiModel("http://.wikipedia.org/wiki/http%3A%2F%2F%22%22%22hi%21%22%22_%22.wikipedia.org%2Fwiki%2F");
        java.lang.String str14 = annotatingMarkupParser0.getRedirect();
        boolean boolean15 = annotatingMarkupParser0.noLinks();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((-1), false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        aggregateTextBag2.setReporter(pigProgressable3);
        boolean boolean5 = aggregateTextBag2.isAsynchronous();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.RecordReader recordReader9 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit10 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader9, pigSplit10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceSchema resourceSchema14 = uriUriNTriplesLoader3.getSchema("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22href\"", job13);
        org.apache.hadoop.mapreduce.InputFormat inputFormat15 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job17 = null;
        org.apache.pig.ResourceSchema resourceSchema18 = uriUriNTriplesLoader3.getSchema("\" hi ! \"", job17);
        org.apache.hadoop.mapreduce.RecordReader recordReader19 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit20 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader19, pigSplit20);
        org.apache.pig.Expression expression22 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression22);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(resourceSchema14);
        org.junit.Assert.assertNotNull(inputFormat15);
        org.junit.Assert.assertNotNull(resourceSchema18);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("\"hi!\"\n");
        org.apache.hadoop.mapreduce.Job job3 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.cleanupOnFailure("http://\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\".wikipedia.org/wiki/%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22\n", job3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser0.makeWikiModel("title");
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser6.getHeaders();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser6.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser6.getHeaderAnnotations();
        java.lang.String str10 = annotatingMarkupParser6.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.lang.Appendable appendable14 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser11.new CountingAppendable(appendable14);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList18 = annotatingMarkupParser17.getHeaders();
        java.util.List<java.lang.String> strList19 = annotatingMarkupParser17.getHeaders();
        java.lang.Appendable appendable20 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser17.new CountingAppendable(appendable20);
        countingAppendable21.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable24 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable21);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser25 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser25.getHeaders();
        java.util.List<java.lang.String> strList27 = annotatingMarkupParser25.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList28 = annotatingMarkupParser25.getHeaderAnnotations();
        java.lang.String str29 = annotatingMarkupParser25.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser30 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList31 = annotatingMarkupParser30.getHeaders();
        java.util.List<java.lang.String> strList32 = annotatingMarkupParser30.getHeaders();
        java.lang.Appendable appendable33 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable34 = annotatingMarkupParser30.new CountingAppendable(appendable33);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable35 = annotatingMarkupParser25.new CountingAppendable((java.lang.Appendable) countingAppendable34);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable36 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable34);
        countingAppendable34.currentPosition = 0;
        countingAppendable34.currentPosition = (short) 100;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable41 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable34);
        int int42 = countingAppendable34.currentPosition;
        countingAppendable34.currentPosition = 'a';
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(wikiModel3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(strList18);
        org.junit.Assert.assertNotNull(strList19);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(strList27);
        org.junit.Assert.assertNotNull(annotationList28);
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(strList31);
        org.junit.Assert.assertNotNull(strList32);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 100 + "'", int42 == 100);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer3 = new pignlproc.storage.UriStringLiteralNTriplesStorer("http : // . wikipedia . org / wiki / hi % 21", "http://\"\"\"http://.wikipedia.org/wiki/hi%21\"\" \".wikipedia.org/wiki/%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22", "\"http://\"\"\"\"\"\"hi!\"\"\"\" \"\".wikipedia.org/wiki/\"");
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = sentencesWithLink0.getArgToFuncMapping();
        sentencesWithLink0.finish();
        java.lang.Enum enum9 = null;
        sentencesWithLink0.warn("http://.wikipedia.org/wiki/hi%21", enum9);
        org.apache.commons.logging.Log log11 = sentencesWithLink0.getLogger();
        java.lang.Enum enum13 = null;
        sentencesWithLink0.warn("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22", enum13);
        boolean boolean15 = sentencesWithLink0.isAsynchronous();
        boolean boolean16 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger17 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable18 = null;
        sentencesWithLink0.setReporter(pigProgressable18);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger20 = sentencesWithLink0.getPigLogger();
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(funcSpecList6);
        org.junit.Assert.assertNotNull(log11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(pigLogger17);
        org.junit.Assert.assertNull(pigLogger20);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("opennlp/en-sent.bin", enum2);
        safeTsvText0.finish();
        org.apache.pig.data.Tuple tuple5 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = safeTsvText0.exec(tuple5);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.reflect.Type type1 = safeTsvText0.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract2 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema3 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema4 = checkAbstract2.outputSchema(schema3);
        org.apache.pig.impl.logicalLayer.schema.Schema schema5 = safeTsvText0.outputSchema(schema4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = null;
        safeTsvText0.setReporter(pigProgressable6);
        org.apache.pig.data.Tuple tuple8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = safeTsvText0.exec(tuple8);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(type1);
        org.junit.Assert.assertNotNull(schema4);
        org.junit.Assert.assertNotNull(schema5);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("hi !");
        org.apache.pig.Expression expression8 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = parsingWikipediaLoader1.getSchema("http : // hi ! . wikipedia . org / wiki / opennlp _ % 2 F _ en _ - _ sent _ . _ bin", job11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceSchema resourceSchema15 = parsingWikipediaLoader1.getSchema("\"opennlp / en - sent . bin\"", job14);
        org.apache.pig.LoadCaster loadCaster16 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job18 = null;
        org.apache.pig.ResourceSchema resourceSchema19 = parsingWikipediaLoader1.getSchema("\"http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/hi%21\"", job18);
        org.apache.hadoop.mapreduce.Job job21 = null;
        org.apache.pig.ResourceStatistics resourceStatistics22 = parsingWikipediaLoader1.getStatistics("\" opennlp / en - sent . bin \"\n", job21);
        org.apache.pig.LoadCaster loadCaster23 = parsingWikipediaLoader1.getLoadCaster();
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNotNull(resourceSchema15);
        org.junit.Assert.assertNotNull(loadCaster16);
        org.junit.Assert.assertNotNull(resourceSchema19);
        org.junit.Assert.assertNull(resourceStatistics22);
        org.junit.Assert.assertNotNull(loadCaster23);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("wikiobject");
        boolean boolean2 = noLoopInPath1.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath3 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText4 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = null;
        safeTsvText4.setPigLogger(pigLogger5);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText7 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = mergeAsOpenNLPAnnotatedText7.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract9 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = checkAbstract9.outputSchema(schema10);
        org.apache.pig.impl.logicalLayer.schema.Schema schema12 = mergeAsOpenNLPAnnotatedText7.outputSchema(schema10);
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = safeTsvText4.outputSchema(schema12);
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = noLoopInPath3.outputSchema(schema12);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink15 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath16 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText17 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger18 = null;
        safeTsvText17.setPigLogger(pigLogger18);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText20 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable21 = mergeAsOpenNLPAnnotatedText20.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract22 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = checkAbstract22.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = mergeAsOpenNLPAnnotatedText20.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = safeTsvText17.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = noLoopInPath16.outputSchema(schema25);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag28 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText29 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger30 = null;
        safeTsvText29.setPigLogger(pigLogger30);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText32 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable33 = mergeAsOpenNLPAnnotatedText32.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract34 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = checkAbstract34.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = mergeAsOpenNLPAnnotatedText32.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = safeTsvText29.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = aggregateTextBag28.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = noLoopInPath16.outputSchema(schema37);
        pignlproc.evaluation.CheckAbstract checkAbstract41 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum43 = null;
        checkAbstract41.warn("http://.wikipedia.org/wiki/hi%21", enum43);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger45 = null;
        checkAbstract41.setPigLogger(pigLogger45);
        checkAbstract41.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText48 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger49 = null;
        safeTsvText48.setPigLogger(pigLogger49);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText51 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable52 = mergeAsOpenNLPAnnotatedText51.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract53 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = checkAbstract53.outputSchema(schema54);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = mergeAsOpenNLPAnnotatedText51.outputSchema(schema54);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = safeTsvText48.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = checkAbstract41.outputSchema(schema57);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = noLoopInPath16.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = sentencesWithLink15.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = noLoopInPath3.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = noLoopInPath1.outputSchema(schema61);
        java.lang.reflect.Type type63 = noLoopInPath1.getReturnType();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(pigProgressable8);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNotNull(schema12);
        org.junit.Assert.assertNotNull(schema13);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNull(pigProgressable21);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(pigProgressable33);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNull(pigProgressable52);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(type63);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation((-1), 97, "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n", "http://\"\"\"title\"\" \"hrefhref.wikipedia.org/wiki/%22title%22href");
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("http://\"title\".wikipedia.org/wiki/%22hi%21%22", true);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink3 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList4 = sentencesWithLink3.getArgToFuncMapping();
        pignlproc.evaluation.CheckAbstract checkAbstract5 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum7 = null;
        checkAbstract5.warn("http://.wikipedia.org/wiki/hi%21", enum7);
        java.lang.Enum enum10 = null;
        checkAbstract5.warn("hi !", enum10);
        pignlproc.evaluation.NoLoopInPath noLoopInPath12 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText13 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        safeTsvText13.setPigLogger(pigLogger14);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText16.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract18.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText13.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = noLoopInPath12.outputSchema(schema21);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag24 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText25 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger26 = null;
        safeTsvText25.setPigLogger(pigLogger26);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText28 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable29 = mergeAsOpenNLPAnnotatedText28.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract30 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = checkAbstract30.outputSchema(schema31);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = mergeAsOpenNLPAnnotatedText28.outputSchema(schema31);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = safeTsvText25.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = aggregateTextBag24.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = noLoopInPath12.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = checkAbstract5.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = sentencesWithLink3.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = concatTextBag2.outputSchema(schema37);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger40 = concatTextBag2.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger41 = null;
        concatTextBag2.setPigLogger(pigLogger41);
        org.junit.Assert.assertNull(funcSpecList4);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNull(pigProgressable29);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(pigLogger40);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum2 = null;
        checkAbstract0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract0.setReporter(pigProgressable4);
        java.lang.reflect.Type type6 = checkAbstract0.getReturnType();
        boolean boolean7 = checkAbstract0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList8 = checkAbstract0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        checkAbstract0.setPigLogger(pigLogger9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = checkAbstract0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger12 = checkAbstract0.getPigLogger();
        org.apache.commons.logging.Log log13 = checkAbstract0.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable14 = checkAbstract0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger15 = null;
        checkAbstract0.setPigLogger(pigLogger15);
        checkAbstract0.finish();
        org.junit.Assert.assertNotNull(type6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(funcSpecList8);
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNull(pigLogger12);
        org.junit.Assert.assertNotNull(log13);
        org.junit.Assert.assertNull(pigProgressable14);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        mergeAsOpenNLPAnnotatedText1.setPigLogger(pigLogger2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        mergeAsOpenNLPAnnotatedText1.setReporter(pigProgressable4);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable1 = mergeAsOpenNLPAnnotatedText0.getReporter();
        java.lang.Enum enum3 = null;
        mergeAsOpenNLPAnnotatedText0.warn("title", enum3);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList5 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        org.apache.commons.logging.Log log6 = mergeAsOpenNLPAnnotatedText0.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = null;
        mergeAsOpenNLPAnnotatedText0.setReporter(pigProgressable7);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable9 = mergeAsOpenNLPAnnotatedText0.getReporter();
        org.junit.Assert.assertNull(pigProgressable1);
        org.junit.Assert.assertNull(funcSpecList5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNull(pigProgressable9);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"\"\"opennlp / en - sent . bin\"\"\"", "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n", "http://\" title \".wikipedia.org/wiki/");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("http://.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%250A", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        java.lang.String[] strArray9 = uriUriNTriplesLoader3.getPartitionKeys("hi !", job8);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        pignlproc.evaluation.CheckAbstract checkAbstract0 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema1 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema2 = checkAbstract0.outputSchema(schema1);
        org.apache.pig.data.Tuple tuple3 = null;
        java.lang.Boolean boolean4 = checkAbstract0.exec(tuple3);
        java.lang.Enum enum6 = null;
        checkAbstract0.warn("href", enum6);
        checkAbstract0.finish();
        pignlproc.evaluation.SafeTsvText safeTsvText9 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger10 = null;
        safeTsvText9.setPigLogger(pigLogger10);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText12 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable13 = mergeAsOpenNLPAnnotatedText12.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract14 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = checkAbstract14.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = mergeAsOpenNLPAnnotatedText12.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = safeTsvText9.outputSchema(schema17);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText19 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray21 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList22 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList22, spanArray21);
        java.lang.String str24 = mergeAsOpenNLPAnnotatedText19.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList22);
        pignlproc.evaluation.ConcatTextBag concatTextBag26 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract27 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum29 = null;
        checkAbstract27.warn("http://.wikipedia.org/wiki/hi%21", enum29);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        checkAbstract27.setPigLogger(pigLogger31);
        checkAbstract27.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText34 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        safeTsvText34.setPigLogger(pigLogger35);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText37 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable38 = mergeAsOpenNLPAnnotatedText37.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract39 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = checkAbstract39.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = mergeAsOpenNLPAnnotatedText37.outputSchema(schema40);
        org.apache.pig.impl.logicalLayer.schema.Schema schema43 = safeTsvText34.outputSchema(schema42);
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = checkAbstract27.outputSchema(schema43);
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = concatTextBag26.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = mergeAsOpenNLPAnnotatedText19.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = safeTsvText9.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract0.outputSchema(schema44);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable49 = checkAbstract0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger50 = checkAbstract0.getPigLogger();
        org.junit.Assert.assertNotNull(schema2);
        org.junit.Assert.assertEquals("'" + boolean4 + "' != '" + false + "'", boolean4, false);
        org.junit.Assert.assertNull(pigProgressable13);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNotNull(schema18);
        org.junit.Assert.assertNotNull(spanArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "href" + "'", str24, "href");
        org.junit.Assert.assertNull(pigProgressable38);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNotNull(schema43);
        org.junit.Assert.assertNotNull(schema44);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNull(pigProgressable49);
        org.junit.Assert.assertNull(pigLogger50);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.RecordWriter recordWriter2 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter2);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter5 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter5);
        org.apache.hadoop.fs.Path path8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("\"hi! \"\n\n", path8);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"hi! \"?? curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21.wikipedia.org/wiki/http_%3A_%2F%2F_http_%3A_%2F%2F_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21_._wikipedia_._org_%2F_wiki_%2F_hi_%25_21", "http://http://\"title\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21");
        org.apache.hadoop.mapreduce.Job job4 = null;
        java.lang.String[] strArray5 = uriStringLiteralNTriplesLoader2.getPartitionKeys("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", job4);
        org.apache.pig.Expression expression6 = null;
        uriStringLiteralNTriplesLoader2.setPartitionFilter(expression6);
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceSchema resourceSchema10 = uriStringLiteralNTriplesLoader2.getSchema("http://\"http://.wikipedia.org/wiki/ \".wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521%0A", job9);
        org.junit.Assert.assertNull(strArray5);
        org.junit.Assert.assertNotNull(resourceSchema10);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        safeTsvText0.setPigLogger(pigLogger1);
        org.apache.commons.logging.Log log3 = safeTsvText0.getLogger();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList4 = safeTsvText0.getArgToFuncMapping();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink5 = new pignlproc.evaluation.SentencesWithLink();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = sentencesWithLink5.getArgToFuncMapping();
        pignlproc.evaluation.CheckAbstract checkAbstract7 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum9 = null;
        checkAbstract7.warn("http://.wikipedia.org/wiki/hi%21", enum9);
        java.lang.Enum enum12 = null;
        checkAbstract7.warn("hi !", enum12);
        pignlproc.evaluation.NoLoopInPath noLoopInPath14 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = noLoopInPath14.outputSchema(schema23);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag26 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText27 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger28 = null;
        safeTsvText27.setPigLogger(pigLogger28);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText30 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable31 = mergeAsOpenNLPAnnotatedText30.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract32 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = checkAbstract32.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = mergeAsOpenNLPAnnotatedText30.outputSchema(schema33);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = safeTsvText27.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag26.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = noLoopInPath14.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = checkAbstract7.outputSchema(schema38);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = sentencesWithLink5.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = safeTsvText0.outputSchema(schema40);
        org.apache.commons.logging.Log log42 = safeTsvText0.getLogger();
        org.apache.commons.logging.Log log43 = safeTsvText0.getLogger();
        org.junit.Assert.assertNotNull(log3);
        org.junit.Assert.assertNull(funcSpecList4);
        org.junit.Assert.assertNull(funcSpecList6);
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNull(pigProgressable31);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(log42);
        org.junit.Assert.assertNotNull(log43);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = sentencesWithLink0.getPigLogger();
        java.lang.reflect.Type type8 = sentencesWithLink0.getReturnType();
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("\"hi! \"");
        org.apache.commons.logging.Log log2 = noLoopInPath1.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        noLoopInPath1.setReporter(pigProgressable3);
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = noLoopInPath1.exec(tuple5);
        java.lang.reflect.Type type7 = noLoopInPath1.getReturnType();
        org.apache.pig.data.Tuple tuple8 = null;
        java.lang.Boolean boolean9 = noLoopInPath1.exec(tuple8);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable10 = null;
        noLoopInPath1.setReporter(pigProgressable10);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNotNull(type7);
        org.junit.Assert.assertEquals("'" + boolean9 + "' != '" + true + "'", boolean9, true);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("http : // \"\"\"\"\"\"\" http : // . wikipedia . org / wiki / hi % 21 \"\"\"\" \"\"\" . wikipedia . org / wiki / href");
        info.bliki.wiki.model.WikiModel wikiModel3 = annotatingMarkupParser1.makeWikiModel("http://\"http://.wikipedia.org/wiki/ \".wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521%0A");
        org.junit.Assert.assertNotNull(wikiModel3);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("hi !", "title", "title");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader5 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster6 = parsingWikipediaLoader5.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = parsingWikipediaLoader5.getSchema("hi!", job8);
        uriUriNTriplesStorer3.checkSchema(resourceSchema9);
        org.apache.hadoop.mapreduce.RecordWriter recordWriter11 = null;
        uriUriNTriplesStorer3.prepareToWrite(recordWriter11);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat13 = uriUriNTriplesStorer3.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter14 = null;
        uriUriNTriplesStorer3.prepareToWrite(recordWriter14);
        org.apache.hadoop.mapreduce.OutputFormat outputFormat16 = uriUriNTriplesStorer3.getOutputFormat();
        org.junit.Assert.assertNotNull(loadCaster6);
        org.junit.Assert.assertNotNull(resourceSchema9);
        org.junit.Assert.assertNotNull(outputFormat13);
        org.junit.Assert.assertNotNull(outputFormat16);
    }

    @Test
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("http://\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"href.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522");
        boolean boolean2 = noLoopInPath1.isAsynchronous();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceStatistics resourceStatistics9 = uriUriNTriplesLoader3.getStatistics("opennlp/en-sent.bin", job8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = uriUriNTriplesLoader3.getSchema("http://\"title\".wikipedia.org/wiki/%22hi%21%22", job11);
        org.apache.hadoop.mapreduce.Job job14 = null;
        org.apache.pig.ResourceSchema resourceSchema15 = uriUriNTriplesLoader3.getSchema("wikiobject", job14);
        org.apache.pig.Expression expression16 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression16);
        org.apache.hadoop.mapreduce.Job job19 = null;
        org.apache.pig.ResourceSchema resourceSchema20 = uriUriNTriplesLoader3.getSchema("http://http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21.wikipedia.org/wiki/%22http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521_.wikipedia.org%2Fwiki%2F%2522title%2522href%22\n", job19);
        org.apache.hadoop.mapreduce.Job job22 = null;
        org.apache.pig.ResourceSchema resourceSchema23 = uriUriNTriplesLoader3.getSchema("http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/http%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhrefwikiobject%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22wikiobject%22hi%21%22%0Awikiobject%0Awikiobjectopennlp%2Fen-sent.binwikiobjecthttp%3A%2F%2Fhi%21%0A.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._binwikiobjecthttp%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521wikiobjecthttp%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522wikiobject%22opennlp_%2F_en_-_sent_._bin%22wikiobject%22%22\n", job22);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple24 = uriUriNTriplesLoader3.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNull(resourceStatistics9);
        org.junit.Assert.assertNotNull(resourceSchema12);
        org.junit.Assert.assertNotNull(resourceSchema15);
        org.junit.Assert.assertNotNull(resourceSchema20);
        org.junit.Assert.assertNotNull(resourceSchema23);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http://\" title \".wikipedia.org/wiki/");
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", "http://.wikipedia.org/wiki/hi%21\n", "http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22");
        org.apache.hadoop.mapreduce.Job job5 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriUriNTriplesStorer3.setStoreLocation("\"http://http://http://http://.wikipedia.org/wiki/hi%21 .wikipedia.org/wiki/%22title%22 .wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521\"", job5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        org.apache.hadoop.fs.Path path1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.apache.pig.LoadFunc.getAbsolutePath("http://http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/%22title%22\n.wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22", path1);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: http://http://http://.wikipedia.org/wiki/hi%21?.wikipedia.org/wiki/%22title%22?.wikipedia.org/wiki/%22http%3A%2F%2F%22%22%22%22%22%22hi%21%22%22%22%22_%22%22.wikipedia.org%2Fwiki%2F%22 curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract((int) (short) 10);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable2 = checkAbstract1.getReporter();
        checkAbstract1.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        checkAbstract1.setReporter(pigProgressable4);
        org.apache.pig.data.Tuple tuple6 = null;
        java.lang.Boolean boolean7 = checkAbstract1.exec(tuple6);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = null;
        checkAbstract1.setReporter(pigProgressable8);
        org.junit.Assert.assertNull(pigProgressable2);
        org.junit.Assert.assertEquals("'" + boolean7 + "' != '" + false + "'", boolean7, false);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable1 = mergeAsOpenNLPAnnotatedText0.getReporter();
        java.lang.Enum enum3 = null;
        mergeAsOpenNLPAnnotatedText0.warn("title", enum3);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList5 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        org.apache.commons.logging.Log log6 = mergeAsOpenNLPAnnotatedText0.getLogger();
        mergeAsOpenNLPAnnotatedText0.finish();
        java.lang.reflect.Type type8 = mergeAsOpenNLPAnnotatedText0.getReturnType();
        org.junit.Assert.assertNull(pigProgressable1);
        org.junit.Assert.assertNull(funcSpecList5);
        org.junit.Assert.assertNotNull(log6);
        org.junit.Assert.assertNotNull(type8);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceSchema resourceSchema11 = uriUriNTriplesLoader3.getSchema("\"hi! \"\n", job10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceStatistics resourceStatistics14 = uriUriNTriplesLoader3.getStatistics("\"\"\" opennlp / en - sent . bin \"\"\"", job13);
        org.apache.hadoop.mapreduce.Job job16 = null;
        org.apache.pig.ResourceSchema resourceSchema17 = uriUriNTriplesLoader3.getSchema("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n", job16);
        org.apache.hadoop.mapreduce.RecordReader recordReader18 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit19 = null;
        uriUriNTriplesLoader3.prepareToRead(recordReader18, pigSplit19);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(resourceSchema11);
        org.junit.Assert.assertNull(resourceStatistics14);
        org.junit.Assert.assertNotNull(resourceSchema17);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.addInputPaths(job0, "http://title\n\n.wikipedia.org/wiki/http%3A%2F%2F%22%22%22http%3A%2F%2Fhttp%3A%2F%2Fhi%21_.wikipedia.org%2Fwiki%2F%2522_title_%2522.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._bin%22%22__%22.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F%2522%2522%2522%2522%2522%2522hi%2521%2522%2522%2522%2522_%2522%2522.wikipedia.org%252Fwiki%252F%2522");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceStatistics resourceStatistics3 = uriUriNTriplesLoader0.getStatistics("wikiobject", job2);
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader0.getInputFormat();
        org.apache.hadoop.mapreduce.RecordReader recordReader5 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit6 = null;
        uriUriNTriplesLoader0.prepareToRead(recordReader5, pigSplit6);
        org.apache.pig.LoadCaster loadCaster8 = uriUriNTriplesLoader0.getLoadCaster();
        org.junit.Assert.assertNull(resourceStatistics3);
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNotNull(loadCaster8);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser0.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser0.getHeaderAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList6 = annotatingMarkupParser0.getParagraphAnnotations();
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(annotationList6);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        java.lang.String[] strArray1 = org.apache.pig.LoadFunc.getPathStrings("\"http://.wikipedia.org/wiki/\"");
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("http://.wikipedia.org/wiki/hi%21", "hi!", "href");
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader3.getSchema("", job5);
        org.apache.pig.Expression expression7 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression7);
        org.apache.hadoop.mapreduce.InputFormat inputFormat9 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.pig.Expression expression10 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression10);
        org.apache.hadoop.mapreduce.Job job13 = null;
        java.lang.String[] strArray14 = uriUriNTriplesLoader3.getPartitionKeys("opennlp/en-sent.bin", job13);
        org.apache.hadoop.mapreduce.Job job16 = null;
        org.apache.pig.ResourceSchema resourceSchema17 = uriUriNTriplesLoader3.getSchema("http://\"http://.wikipedia.org/wiki/hi%21\"\n\n.wikipedia.org/wiki/%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22", job16);
        java.lang.Class<?> wildcardClass18 = resourceSchema17.getClass();
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(inputFormat9);
        org.junit.Assert.assertNull(strArray14);
        org.junit.Assert.assertNotNull(resourceSchema17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("wikiobject", "");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", job4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceStatistics resourceStatistics8 = uriStringLiteralNTriplesLoader2.getStatistics("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", job7);
        org.apache.hadoop.mapreduce.Job job10 = null;
        org.apache.pig.ResourceStatistics resourceStatistics11 = uriStringLiteralNTriplesLoader2.getStatistics("opennlp/en-sent.bin", job10);
        org.apache.hadoop.mapreduce.RecordReader recordReader12 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit13 = null;
        uriStringLiteralNTriplesLoader2.prepareToRead(recordReader12, pigSplit13);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(resourceStatistics8);
        org.junit.Assert.assertNull(resourceStatistics11);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("href");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat2 = uriStringLiteralNTriplesStorer1.getOutputFormat();
        org.apache.hadoop.mapreduce.RecordWriter recordWriter3 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter3);
        org.apache.hadoop.mapreduce.RecordWriter recordWriter5 = null;
        uriStringLiteralNTriplesStorer1.prepareToWrite(recordWriter5);
        uriStringLiteralNTriplesStorer1.setStoreFuncUDFContextSignature("\"http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21\"");
        org.apache.pig.data.Tuple tuple9 = null;
        // The following exception was thrown during execution in test generation
        try {
            uriStringLiteralNTriplesStorer1.putNext(tuple9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(outputFormat2);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        org.apache.hadoop.mapreduce.Job job1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.StoreFunc.cleanupOnFailureImpl("http://http://\"http://\"\"opennlp / en - sent . bin\"\".wikipedia.org/wiki/href\".wikipedia.org/wiki/%22_opennlp_%2F_en_-_sent_._bin_%22.wikipedia.org/wiki/http%3A%2F%2F%22http%3A%2F%2Fhi_%21_.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%250A.wikipedia.org%252Fwiki%252F%252522title%252522%22.wikipedia.org%2Fwiki%2F%2522%2522%2522opennlp_%252F_en_-_sent_._bin%2522%2522%2522", job1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("href");
        org.apache.commons.logging.Log log2 = noLoopInPath1.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        noLoopInPath1.setReporter(pigProgressable3);
        org.apache.pig.impl.logicalLayer.schema.Schema schema5 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema6 = noLoopInPath1.outputSchema(schema5);
        java.lang.Enum enum8 = null;
        noLoopInPath1.warn("\"\"\"hi ! \"\"\"", enum8);
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertNotNull(schema6);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("hi !");
        org.apache.hadoop.mapreduce.RecordReader recordReader2 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit3 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader2, pigSplit3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = parsingWikipediaLoader1.getSchema("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href", job6);
        org.apache.pig.LoadCaster loadCaster8 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job10 = null;
        java.lang.String[] strArray11 = parsingWikipediaLoader1.getPartitionKeys("\"http://\"\"opennlp / en - sent . bin\"\".wikipedia.org/wiki/href\"", job10);
        org.junit.Assert.assertNotNull(resourceSchema7);
        org.junit.Assert.assertNotNull(loadCaster8);
        org.junit.Assert.assertNull(strArray11);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("href");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("opennlp/en-sent.bin", job3);
        org.apache.pig.LoadCaster loadCaster5 = parsingWikipediaLoader1.getLoadCaster();
        parsingWikipediaLoader1.setUDFContextSignature("\"title\"\n");
        org.apache.pig.LoadCaster loadCaster8 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.pig.LoadCaster loadCaster9 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.pig.LoadCaster loadCaster10 = parsingWikipediaLoader1.getLoadCaster();
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNotNull(loadCaster5);
        org.junit.Assert.assertNotNull(loadCaster8);
        org.junit.Assert.assertNotNull(loadCaster9);
        org.junit.Assert.assertNotNull(loadCaster10);
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        pignlproc.evaluation.NoLoopInPath noLoopInPath1 = new pignlproc.evaluation.NoLoopInPath("\"hi! \"");
        org.apache.commons.logging.Log log2 = noLoopInPath1.getLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = null;
        noLoopInPath1.setReporter(pigProgressable3);
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.Boolean boolean6 = noLoopInPath1.exec(tuple5);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList7 = noLoopInPath1.getArgToFuncMapping();
        org.junit.Assert.assertNotNull(log2);
        org.junit.Assert.assertEquals("'" + boolean6 + "' != '" + true + "'", boolean6, true);
        org.junit.Assert.assertNull(funcSpecList7);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        pignlproc.storage.UriUriNTriplesStorer uriUriNTriplesStorer3 = new pignlproc.storage.UriUriNTriplesStorer("http://.wikipedia.org/wiki/\n", "\"http://http://hi! .wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin\"", "title");
        org.apache.hadoop.mapreduce.OutputFormat outputFormat4 = uriUriNTriplesStorer3.getOutputFormat();
        org.junit.Assert.assertNotNull(outputFormat4);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        pignlproc.evaluation.SafeTsvText safeTsvText0 = new pignlproc.evaluation.SafeTsvText();
        java.lang.Enum enum2 = null;
        safeTsvText0.warn("http://.wikipedia.org/wiki/hi%21", enum2);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = safeTsvText0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        safeTsvText0.setReporter(pigProgressable5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = null;
        safeTsvText0.setReporter(pigProgressable7);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        safeTsvText0.setPigLogger(pigLogger9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = null;
        safeTsvText0.setReporter(pigProgressable11);
        org.apache.pig.data.Tuple tuple13 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = safeTsvText0.exec(tuple13);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.backend.executionengine.ExecException; message: Error while computing aggregate text of bag in SafeTsvText");
        } catch (org.apache.pig.backend.executionengine.ExecException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(pigProgressable4);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "http://\"\"\" hi ! \"\" \".wikipedia.org/wiki/hi_%21%0A%0A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
        java.lang.String str2 = pignlproc.markup.AnnotatingMarkupParser.titleToUri("", "\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\"");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "http://\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/" + "'", str2, "http://\"http://http://\"\"title\"\".wikipedia.org/wiki/%22hi%21%22.wikipedia.org/wiki/hi%21\".wikipedia.org/wiki/");
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
        java.net.URL uRL0 = null;
        // The following exception was thrown during execution in test generation
        try {
            pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader wikipediaRecordReader3 = new pignlproc.format.WikipediaPageInputFormat.WikipediaRecordReader(uRL0, (long) (short) 0, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("http://http://\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\".wikipedia.org/wiki/%22%22%22opennlp_%2F_en_-_sent_._bin%22%22%22.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhi_%2521\n");
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 1, true);
        java.lang.Enum enum4 = null;
        aggregateTextBag2.warn("http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/http%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhrefwikiobject%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22wikiobject%22hi%21%22%0Awikiobject%0Awikiobjectopennlp%2Fen-sent.binwikiobjecthttp%3A%2F%2Fhi%21%0A.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._binwikiobjecthttp%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521wikiobjecthttp%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522wikiobject%22opennlp_%2F_en_-_sent_._bin%22wikiobject%22%22", enum4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger6 = aggregateTextBag2.getPigLogger();
        org.junit.Assert.assertNull(pigLogger6);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        pignlproc.evaluation.CheckAbstract checkAbstract1 = new pignlproc.evaluation.CheckAbstract(10);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag4 = new pignlproc.evaluation.AggregateTextBag((int) (byte) 1, false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = null;
        aggregateTextBag4.setReporter(pigProgressable5);
        pignlproc.evaluation.ConcatTextBag concatTextBag8 = new pignlproc.evaluation.ConcatTextBag("opennlp/en-sent.bin");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable9 = concatTextBag8.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger10 = concatTextBag8.getPigLogger();
        java.lang.Enum enum12 = null;
        concatTextBag8.warn("http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521", enum12);
        boolean boolean14 = concatTextBag8.isAsynchronous();
        pignlproc.evaluation.NoLoopInPath noLoopInPath15 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText16 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger17 = null;
        safeTsvText16.setPigLogger(pigLogger17);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText19 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable20 = mergeAsOpenNLPAnnotatedText19.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract21 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = checkAbstract21.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = mergeAsOpenNLPAnnotatedText19.outputSchema(schema22);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = safeTsvText16.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = noLoopInPath15.outputSchema(schema24);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag27 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText28 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger29 = null;
        safeTsvText28.setPigLogger(pigLogger29);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText31 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable32 = mergeAsOpenNLPAnnotatedText31.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract33 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = checkAbstract33.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = mergeAsOpenNLPAnnotatedText31.outputSchema(schema34);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = safeTsvText28.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = aggregateTextBag27.outputSchema(schema36);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = noLoopInPath15.outputSchema(schema36);
        pignlproc.evaluation.CheckAbstract checkAbstract40 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum42 = null;
        checkAbstract40.warn("http://.wikipedia.org/wiki/hi%21", enum42);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger44 = null;
        checkAbstract40.setPigLogger(pigLogger44);
        checkAbstract40.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText47 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger48 = null;
        safeTsvText47.setPigLogger(pigLogger48);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText50 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable51 = mergeAsOpenNLPAnnotatedText50.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract52 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = checkAbstract52.outputSchema(schema53);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = mergeAsOpenNLPAnnotatedText50.outputSchema(schema53);
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = safeTsvText47.outputSchema(schema55);
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = checkAbstract40.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = noLoopInPath15.outputSchema(schema57);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = concatTextBag8.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = aggregateTextBag4.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = checkAbstract1.outputSchema(schema60);
        org.apache.commons.logging.Log log62 = checkAbstract1.getLogger();
        org.junit.Assert.assertNull(pigProgressable9);
        org.junit.Assert.assertNull(pigLogger10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(pigProgressable20);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNull(pigProgressable32);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNull(pigProgressable51);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNotNull(schema56);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(log62);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader0 = new pignlproc.storage.UriStringLiteralNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        org.apache.pig.ResourceSchema resourceSchema3 = uriStringLiteralNTriplesLoader0.getSchema("", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceStatistics resourceStatistics6 = uriStringLiteralNTriplesLoader0.getStatistics("opennlp/en-sent.bin", job5);
        org.apache.hadoop.mapreduce.Job job8 = null;
        org.apache.pig.ResourceSchema resourceSchema9 = uriStringLiteralNTriplesLoader0.getSchema("", job8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceStatistics resourceStatistics12 = uriStringLiteralNTriplesLoader0.getStatistics("\" http : // . wikipedia . org / wiki / hi % 21 \"", job11);
        org.junit.Assert.assertNotNull(resourceSchema3);
        org.junit.Assert.assertNull(resourceStatistics6);
        org.junit.Assert.assertNotNull(resourceSchema9);
        org.junit.Assert.assertNull(resourceStatistics12);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("title");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceStatistics resourceStatistics4 = parsingWikipediaLoader1.getStatistics("href", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        // The following exception was thrown during execution in test generation
        try {
            parsingWikipediaLoader1.setLocation("\" http : // hi ! . wikipedia . org / wiki / http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 % 0 A . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 \"", job6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: java.net.URISyntaxException: Relative path in absolute URI: \" http :%20/%20hi%20!%20.%20wikipedia%20.%20org%20/%20wiki%20/%20http%20%25%203%20A%20%25%202%20F%20%25%202%20Fhttp%20%25%203%20A%20%25%202%20F%20%25%202%20F%20.%20wikipedia%20.%20org%20%25%202%20Fwiki%20%25%202%20Fhi%20%25%202521%20%25%200%20A%20.%20wikipedia%20.%20org%20%25%202%20Fwiki%20%25%202%20F%20%25%202522%20title%20%25%202522%20%22");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(resourceStatistics4);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText0 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray2 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList3 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean4 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList3, spanArray2);
        java.lang.String str5 = mergeAsOpenNLPAnnotatedText0.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList3);
        pignlproc.evaluation.ConcatTextBag concatTextBag7 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract8 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum10 = null;
        checkAbstract8.warn("http://.wikipedia.org/wiki/hi%21", enum10);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger12 = null;
        checkAbstract8.setPigLogger(pigLogger12);
        checkAbstract8.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText15 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger16 = null;
        safeTsvText15.setPigLogger(pigLogger16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText18 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable19 = mergeAsOpenNLPAnnotatedText18.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract20 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = checkAbstract20.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = mergeAsOpenNLPAnnotatedText18.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = safeTsvText15.outputSchema(schema23);
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = checkAbstract8.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = concatTextBag7.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema25);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList28 = mergeAsOpenNLPAnnotatedText0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable29 = mergeAsOpenNLPAnnotatedText0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable30 = mergeAsOpenNLPAnnotatedText0.getReporter();
        pignlproc.evaluation.AggregateTextBag aggregateTextBag32 = new pignlproc.evaluation.AggregateTextBag((int) (short) 10);
        pignlproc.evaluation.ConcatTextBag concatTextBag34 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract35 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum37 = null;
        checkAbstract35.warn("http://.wikipedia.org/wiki/hi%21", enum37);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger39 = null;
        checkAbstract35.setPigLogger(pigLogger39);
        checkAbstract35.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText42 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger43 = null;
        safeTsvText42.setPigLogger(pigLogger43);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText45 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable46 = mergeAsOpenNLPAnnotatedText45.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract47 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = checkAbstract47.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = mergeAsOpenNLPAnnotatedText45.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema51 = safeTsvText42.outputSchema(schema50);
        org.apache.pig.impl.logicalLayer.schema.Schema schema52 = checkAbstract35.outputSchema(schema51);
        org.apache.pig.impl.logicalLayer.schema.Schema schema53 = concatTextBag34.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema54 = aggregateTextBag32.outputSchema(schema52);
        org.apache.pig.impl.logicalLayer.schema.Schema schema55 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema52);
        pignlproc.evaluation.SentencesWithLink sentencesWithLink56 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger57 = null;
        sentencesWithLink56.setPigLogger(pigLogger57);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList59 = sentencesWithLink56.getArgToFuncMapping();
        sentencesWithLink56.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger61 = null;
        sentencesWithLink56.setPigLogger(pigLogger61);
        pignlproc.evaluation.ConcatTextBag concatTextBag65 = new pignlproc.evaluation.ConcatTextBag("title", false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable66 = concatTextBag65.getReporter();
        pignlproc.evaluation.AggregateTextBag aggregateTextBag68 = new pignlproc.evaluation.AggregateTextBag((int) (short) 0);
        aggregateTextBag68.progress();
        org.apache.commons.logging.Log log70 = aggregateTextBag68.getLogger();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink71 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger72 = null;
        sentencesWithLink71.setPigLogger(pigLogger72);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList74 = sentencesWithLink71.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger75 = sentencesWithLink71.getPigLogger();
        boolean boolean76 = sentencesWithLink71.isAsynchronous();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText77 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable78 = mergeAsOpenNLPAnnotatedText77.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract79 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema80 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema81 = checkAbstract79.outputSchema(schema80);
        org.apache.pig.impl.logicalLayer.schema.Schema schema82 = mergeAsOpenNLPAnnotatedText77.outputSchema(schema80);
        org.apache.pig.impl.logicalLayer.schema.Schema schema83 = sentencesWithLink71.outputSchema(schema82);
        org.apache.pig.impl.logicalLayer.schema.Schema schema84 = aggregateTextBag68.outputSchema(schema83);
        org.apache.pig.impl.logicalLayer.schema.Schema schema85 = concatTextBag65.outputSchema(schema84);
        org.apache.pig.impl.logicalLayer.schema.Schema schema86 = sentencesWithLink56.outputSchema(schema85);
        org.apache.pig.impl.logicalLayer.schema.Schema schema87 = mergeAsOpenNLPAnnotatedText0.outputSchema(schema86);
        org.junit.Assert.assertNotNull(spanArray2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "href" + "'", str5, "href");
        org.junit.Assert.assertNull(pigProgressable19);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNull(funcSpecList28);
        org.junit.Assert.assertNull(pigProgressable29);
        org.junit.Assert.assertNull(pigProgressable30);
        org.junit.Assert.assertNull(pigProgressable46);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNotNull(schema51);
        org.junit.Assert.assertNotNull(schema52);
        org.junit.Assert.assertNotNull(schema53);
        org.junit.Assert.assertNotNull(schema54);
        org.junit.Assert.assertNotNull(schema55);
        org.junit.Assert.assertNull(funcSpecList59);
        org.junit.Assert.assertNull(pigProgressable66);
        org.junit.Assert.assertNotNull(log70);
        org.junit.Assert.assertNull(funcSpecList74);
        org.junit.Assert.assertNull(pigLogger75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNull(pigProgressable78);
        org.junit.Assert.assertNotNull(schema81);
        org.junit.Assert.assertNotNull(schema82);
        org.junit.Assert.assertNotNull(schema83);
        org.junit.Assert.assertNotNull(schema84);
        org.junit.Assert.assertNotNull(schema85);
        org.junit.Assert.assertNotNull(schema86);
        org.junit.Assert.assertNotNull(schema87);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        pignlproc.evaluation.ConcatTextBag concatTextBag2 = new pignlproc.evaluation.ConcatTextBag("\"hi! \"\n", false);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = null;
        concatTextBag2.setPigLogger(pigLogger3);
        org.apache.pig.data.Tuple tuple5 = null;
        java.lang.String str6 = concatTextBag2.exec(tuple5);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable7 = null;
        concatTextBag2.setReporter(pigProgressable7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("wikiobject", job6);
        parsingWikipediaLoader1.setUDFContextSignature("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22");
        org.apache.hadoop.mapreduce.InputFormat inputFormat10 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("http://\" title \".wikipedia.org/wiki/", job12);
        org.apache.hadoop.mapreduce.RecordReader recordReader14 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit15 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader14, pigSplit15);
        java.lang.Class<?> wildcardClass17 = parsingWikipediaLoader1.getClass();
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(inputFormat10);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) '4', true);
        java.lang.reflect.Type type3 = aggregateTextBag2.getReturnType();
        pignlproc.evaluation.CheckAbstract checkAbstract4 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum6 = null;
        checkAbstract4.warn("http://.wikipedia.org/wiki/hi%21", enum6);
        java.lang.Enum enum9 = null;
        checkAbstract4.warn("hi !", enum9);
        pignlproc.evaluation.NoLoopInPath noLoopInPath11 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText12 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger13 = null;
        safeTsvText12.setPigLogger(pigLogger13);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText15 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable16 = mergeAsOpenNLPAnnotatedText15.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract17 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema18 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = checkAbstract17.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = mergeAsOpenNLPAnnotatedText15.outputSchema(schema18);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = safeTsvText12.outputSchema(schema20);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = noLoopInPath11.outputSchema(schema20);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag23 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText24 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger25 = null;
        safeTsvText24.setPigLogger(pigLogger25);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText27 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable28 = mergeAsOpenNLPAnnotatedText27.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract29 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema31 = checkAbstract29.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema32 = mergeAsOpenNLPAnnotatedText27.outputSchema(schema30);
        org.apache.pig.impl.logicalLayer.schema.Schema schema33 = safeTsvText24.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema34 = aggregateTextBag23.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema35 = noLoopInPath11.outputSchema(schema32);
        org.apache.pig.impl.logicalLayer.schema.Schema schema36 = checkAbstract4.outputSchema(schema35);
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = aggregateTextBag2.outputSchema(schema35);
        aggregateTextBag2.finish();
        org.junit.Assert.assertNotNull(type3);
        org.junit.Assert.assertNull(pigProgressable16);
        org.junit.Assert.assertNotNull(schema19);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNull(pigProgressable28);
        org.junit.Assert.assertNotNull(schema31);
        org.junit.Assert.assertNotNull(schema32);
        org.junit.Assert.assertNotNull(schema33);
        org.junit.Assert.assertNotNull(schema34);
        org.junit.Assert.assertNotNull(schema35);
        org.junit.Assert.assertNotNull(schema36);
        org.junit.Assert.assertNotNull(schema37);
    }

    @Test
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.pig.LoadCaster loadCaster2 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = parsingWikipediaLoader1.getSchema("hi!", job4);
        parsingWikipediaLoader1.setUDFContextSignature("hi !\n\nhref");
        org.apache.hadoop.mapreduce.Job job9 = null;
        org.apache.pig.ResourceStatistics resourceStatistics10 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521\n", job9);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple11 = parsingWikipediaLoader1.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(loadCaster2);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNull(resourceStatistics10);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        pignlproc.storage.UriStringLiteralNTriplesStorer uriStringLiteralNTriplesStorer1 = new pignlproc.storage.UriStringLiteralNTriplesStorer("title\n\n");
        org.apache.hadoop.fs.Path path3 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = uriStringLiteralNTriplesStorer1.relToAbsPathForStoreLocation("\"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\" \"", path3);
            org.junit.Assert.fail("Expected exception of type org.apache.pig.impl.logicalLayer.FrontendException; message: location: \"\"\"\"\"\"\"http://hi ! .wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522\"\"\"\"\"\" \" curDir: null");
        } catch (org.apache.pig.impl.logicalLayer.FrontendException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText1 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText("\"hi!\"\n");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        mergeAsOpenNLPAnnotatedText1.setPigLogger(pigLogger2);
        java.lang.Enum enum5 = null;
        mergeAsOpenNLPAnnotatedText1.warn("hi!", enum5);
        java.lang.reflect.Type type7 = mergeAsOpenNLPAnnotatedText1.getReturnType();
        org.junit.Assert.assertNotNull(type7);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = sentencesWithLink0.getPigLogger();
        java.lang.Enum enum3 = null;
        sentencesWithLink0.warn("opennlp / en - sent . bin", enum3);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger5 = null;
        sentencesWithLink0.setPigLogger(pigLogger5);
        org.apache.commons.logging.Log log7 = sentencesWithLink0.getLogger();
        sentencesWithLink0.progress();
        java.lang.reflect.Type type9 = sentencesWithLink0.getReturnType();
        org.junit.Assert.assertNull(pigLogger1);
        org.junit.Assert.assertNotNull(log7);
        org.junit.Assert.assertNotNull(type9);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList2 = annotatingMarkupParser0.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser4 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList5 = annotatingMarkupParser4.getHeaders();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser4.getHeaders();
        java.lang.Appendable appendable7 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable8 = annotatingMarkupParser4.new CountingAppendable(appendable7);
        java.lang.String str10 = annotatingMarkupParser4.parse("");
        java.util.List<pignlproc.markup.Annotation> annotationList11 = annotatingMarkupParser4.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser12 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList13 = annotatingMarkupParser12.getHeaderAnnotations();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser12.getParagraphs();
        java.lang.Appendable appendable15 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser12.new CountingAppendable(appendable15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser17.getHeaderAnnotations();
        java.lang.String str19 = annotatingMarkupParser17.getRedirect();
        pignlproc.markup.Annotation annotation24 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation29 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int30 = annotation29.end;
        int int31 = annotation29.begin;
        pignlproc.markup.Annotation[] annotationArray32 = new pignlproc.markup.Annotation[] { annotation24, annotation29 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList33 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList33, annotationArray32);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser35 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList36 = annotatingMarkupParser35.getHeaders();
        java.util.List<java.lang.String> strList37 = annotatingMarkupParser35.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList38 = annotatingMarkupParser35.getHeaderAnnotations();
        java.lang.String str39 = annotatingMarkupParser35.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser40 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList41 = annotatingMarkupParser40.getHeaders();
        java.util.List<java.lang.String> strList42 = annotatingMarkupParser40.getHeaders();
        java.lang.Appendable appendable43 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable44 = annotatingMarkupParser40.new CountingAppendable(appendable43);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable45 = annotatingMarkupParser35.new CountingAppendable((java.lang.Appendable) countingAppendable44);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser46 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList47 = annotatingMarkupParser46.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel49 = annotatingMarkupParser46.makeWikiModel("title");
        annotatingMarkupParser17.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList33, (java.lang.Appendable) countingAppendable44, (info.bliki.wiki.model.IWikiModel) wikiModel49);
        annotatingMarkupParser0.nodesToText(annotationList11, appendable15, (info.bliki.wiki.model.IWikiModel) wikiModel49);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser53 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser54 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList55 = annotatingMarkupParser54.getHeaders();
        java.util.List<java.lang.String> strList56 = annotatingMarkupParser54.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList57 = annotatingMarkupParser54.getHeaderAnnotations();
        java.lang.String str58 = annotatingMarkupParser54.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser59 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList60 = annotatingMarkupParser59.getHeaders();
        java.util.List<java.lang.String> strList61 = annotatingMarkupParser59.getHeaders();
        java.lang.Appendable appendable62 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable63 = annotatingMarkupParser59.new CountingAppendable(appendable62);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable64 = annotatingMarkupParser54.new CountingAppendable((java.lang.Appendable) countingAppendable63);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser65 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList66 = annotatingMarkupParser65.getHeaders();
        java.util.List<java.lang.String> strList67 = annotatingMarkupParser65.getHeaders();
        java.lang.Appendable appendable68 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable69 = annotatingMarkupParser65.new CountingAppendable(appendable68);
        countingAppendable69.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable72 = annotatingMarkupParser54.new CountingAppendable((java.lang.Appendable) countingAppendable69);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable73 = annotatingMarkupParser53.new CountingAppendable((java.lang.Appendable) countingAppendable72);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable74 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable73);
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(annotationList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNotNull(strList5);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(annotationList11);
        org.junit.Assert.assertNotNull(annotationList13);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(annotationArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(annotationList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(annotationList47);
        org.junit.Assert.assertNotNull(wikiModel49);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(strList56);
        org.junit.Assert.assertNotNull(annotationList57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList61);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertNotNull(strList67);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser0.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser0.makeWikiModel("opennlp / en - sent . bin");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser14 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser14.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList16 = annotatingMarkupParser14.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel18 = annotatingMarkupParser14.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel20 = annotatingMarkupParser14.makeWikiModel("hi!\n");
        java.util.List<pignlproc.markup.Annotation> annotationList21 = annotatingMarkupParser14.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser22 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList23 = annotatingMarkupParser22.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList24 = annotatingMarkupParser22.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList25 = annotatingMarkupParser22.getParagraphAnnotations();
        java.util.List<java.lang.String> strList26 = annotatingMarkupParser22.getParagraphs();
        java.util.List<pignlproc.markup.Annotation> annotationList27 = annotatingMarkupParser22.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser28 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList29 = annotatingMarkupParser28.getHeaderAnnotations();
        java.util.List<java.lang.String> strList30 = annotatingMarkupParser28.getParagraphs();
        java.lang.Appendable appendable31 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable32 = annotatingMarkupParser28.new CountingAppendable(appendable31);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable33 = annotatingMarkupParser22.new CountingAppendable((java.lang.Appendable) countingAppendable32);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser34 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList35 = annotatingMarkupParser34.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList36 = annotatingMarkupParser34.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel38 = annotatingMarkupParser34.makeWikiModel("http://\"title\".wikipedia.org/wiki/%22hi%21%22");
        info.bliki.wiki.model.WikiModel wikiModel40 = annotatingMarkupParser34.makeWikiModel("hi!\n");
        annotatingMarkupParser0.nodesToText(annotationList21, (java.lang.Appendable) countingAppendable33, (info.bliki.wiki.model.IWikiModel) wikiModel40);
        java.lang.String str43 = annotatingMarkupParser0.parse("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href");
        info.bliki.wiki.model.WikiModel wikiModel45 = annotatingMarkupParser0.makeWikiModel("http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n");
        java.util.List<pignlproc.markup.Annotation> annotationList46 = annotatingMarkupParser0.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser47 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList48 = annotatingMarkupParser47.getHeaderAnnotations();
        java.util.List<java.lang.String> strList49 = annotatingMarkupParser47.getParagraphs();
        java.lang.Appendable appendable50 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable51 = annotatingMarkupParser47.new CountingAppendable(appendable50);
        java.util.List<pignlproc.markup.Annotation> annotationList52 = annotatingMarkupParser47.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser53 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList54 = annotatingMarkupParser53.getHeaders();
        java.util.List<java.lang.String> strList55 = annotatingMarkupParser53.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList56 = annotatingMarkupParser53.getHeaderAnnotations();
        java.lang.String str57 = annotatingMarkupParser53.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser58 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList59 = annotatingMarkupParser58.getHeaders();
        java.util.List<java.lang.String> strList60 = annotatingMarkupParser58.getHeaders();
        java.lang.Appendable appendable61 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable62 = annotatingMarkupParser58.new CountingAppendable(appendable61);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable63 = annotatingMarkupParser53.new CountingAppendable((java.lang.Appendable) countingAppendable62);
        info.bliki.wiki.model.WikiModel wikiModel65 = annotatingMarkupParser53.makeWikiModel("\"hi!\"\n");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser67 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser68 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList69 = annotatingMarkupParser68.getHeaders();
        java.util.List<java.lang.String> strList70 = annotatingMarkupParser68.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList71 = annotatingMarkupParser68.getHeaderAnnotations();
        java.lang.String str72 = annotatingMarkupParser68.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser73 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList74 = annotatingMarkupParser73.getHeaders();
        java.util.List<java.lang.String> strList75 = annotatingMarkupParser73.getHeaders();
        java.lang.Appendable appendable76 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable77 = annotatingMarkupParser73.new CountingAppendable(appendable76);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable78 = annotatingMarkupParser68.new CountingAppendable((java.lang.Appendable) countingAppendable77);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser79 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList80 = annotatingMarkupParser79.getHeaders();
        java.util.List<java.lang.String> strList81 = annotatingMarkupParser79.getHeaders();
        java.lang.Appendable appendable82 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable83 = annotatingMarkupParser79.new CountingAppendable(appendable82);
        countingAppendable83.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable86 = annotatingMarkupParser68.new CountingAppendable((java.lang.Appendable) countingAppendable83);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable87 = annotatingMarkupParser67.new CountingAppendable((java.lang.Appendable) countingAppendable86);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable88 = annotatingMarkupParser53.new CountingAppendable((java.lang.Appendable) countingAppendable86);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser89 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList90 = annotatingMarkupParser89.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel92 = annotatingMarkupParser89.makeWikiModel("title");
        annotatingMarkupParser0.nodesToText(annotationList52, (java.lang.Appendable) countingAppendable86, (info.bliki.wiki.model.IWikiModel) wikiModel92);
        info.bliki.wiki.model.WikiModel wikiModel95 = annotatingMarkupParser0.makeWikiModel("http://\"\"\"hi!\"\" \".wikipedia.org/wiki/");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(annotationList16);
        org.junit.Assert.assertNotNull(wikiModel18);
        org.junit.Assert.assertNotNull(wikiModel20);
        org.junit.Assert.assertNotNull(annotationList21);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(annotationList24);
        org.junit.Assert.assertNotNull(annotationList25);
        org.junit.Assert.assertNotNull(strList26);
        org.junit.Assert.assertNotNull(annotationList27);
        org.junit.Assert.assertNotNull(annotationList29);
        org.junit.Assert.assertNotNull(strList30);
        org.junit.Assert.assertNotNull(strList35);
        org.junit.Assert.assertNotNull(annotationList36);
        org.junit.Assert.assertNotNull(wikiModel38);
        org.junit.Assert.assertNotNull(wikiModel40);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n" + "'", str43, "http://\"opennlp / en - sent . bin\".wikipedia.org/wiki/href\n");
        org.junit.Assert.assertNotNull(wikiModel45);
        org.junit.Assert.assertNotNull(annotationList46);
        org.junit.Assert.assertNotNull(annotationList48);
        org.junit.Assert.assertNotNull(strList49);
        org.junit.Assert.assertNotNull(annotationList52);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(annotationList56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(wikiModel65);
        org.junit.Assert.assertNotNull(strList69);
        org.junit.Assert.assertNotNull(strList70);
        org.junit.Assert.assertNotNull(annotationList71);
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(strList74);
        org.junit.Assert.assertNotNull(strList75);
        org.junit.Assert.assertNotNull(strList80);
        org.junit.Assert.assertNotNull(strList81);
        org.junit.Assert.assertNotNull(annotationList90);
        org.junit.Assert.assertNotNull(wikiModel92);
        org.junit.Assert.assertNotNull(wikiModel95);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("hi !", "opennlp/en-sent.bin", "wikiobject");
        org.apache.hadoop.mapreduce.InputFormat inputFormat4 = uriUriNTriplesLoader3.getInputFormat();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceSchema resourceSchema7 = uriUriNTriplesLoader3.getSchema("http://http://http : // \" hi ! \" . wikipedia . org / wiki / % 22 hi % 21 _ % 22.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhttp%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%0A.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2Fhi%2521.wikipedia.org%2Fwiki%2Fhttp_%253A_%252F%252F_http_%253A_%252F%252F_._wikipedia_._org_%252F_wiki_%252F_hi_%2525_21_._wikipedia_._org_%252F_wiki_%252F_hi_%2525_21", job6);
        org.junit.Assert.assertNotNull(inputFormat4);
        org.junit.Assert.assertNotNull(resourceSchema7);
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList1 = annotatingMarkupParser0.getHeaders();
        java.util.List<java.lang.String> strList2 = annotatingMarkupParser0.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList3 = annotatingMarkupParser0.getHeaderAnnotations();
        java.lang.String str4 = annotatingMarkupParser0.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser5 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList6 = annotatingMarkupParser5.getHeaders();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser5.getHeaders();
        java.lang.Appendable appendable8 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable9 = annotatingMarkupParser5.new CountingAppendable(appendable8);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable10 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable9);
        java.util.List<java.lang.String> strList11 = annotatingMarkupParser0.getHeaders();
        info.bliki.wiki.model.WikiModel wikiModel13 = annotatingMarkupParser0.makeWikiModel("opennlp / en - sent . bin");
        java.lang.String str14 = annotatingMarkupParser0.getRedirect();
        java.lang.String str16 = annotatingMarkupParser0.parse("");
        org.junit.Assert.assertNotNull(strList1);
        org.junit.Assert.assertNotNull(strList2);
        org.junit.Assert.assertNotNull(annotationList3);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNotNull(strList6);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList11);
        org.junit.Assert.assertNotNull(wikiModel13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList6 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = null;
        sentencesWithLink0.setPigLogger(pigLogger8);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable10 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger11 = null;
        sentencesWithLink0.setPigLogger(pigLogger11);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger13 = null;
        sentencesWithLink0.setPigLogger(pigLogger13);
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(funcSpecList6);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertNull(pigProgressable10);
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("\"\"\"opennlp / en - sent . bin\"\"\"", "\"\"\"\"\"\"\"http://.wikipedia.org/wiki/hi%21\"\"\"\" \"\"\"\n", "http://\" title \".wikipedia.org/wiki/");
        org.apache.pig.LoadCaster loadCaster4 = uriUriNTriplesLoader3.getLoadCaster();
        org.junit.Assert.assertNotNull(loadCaster4);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        pignlproc.evaluation.NoLoopInPath noLoopInPath0 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText1 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        safeTsvText1.setPigLogger(pigLogger2);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText4 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = mergeAsOpenNLPAnnotatedText4.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = mergeAsOpenNLPAnnotatedText4.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = safeTsvText1.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = noLoopInPath0.outputSchema(schema9);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger12 = noLoopInPath0.getPigLogger();
        java.lang.Enum enum14 = null;
        noLoopInPath0.warn("hi !\n\n", enum14);
        java.lang.reflect.Type type16 = noLoopInPath0.getReturnType();
        pignlproc.evaluation.SentencesWithLink sentencesWithLink17 = new pignlproc.evaluation.SentencesWithLink();
        pignlproc.evaluation.NoLoopInPath noLoopInPath18 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText19 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger20 = null;
        safeTsvText19.setPigLogger(pigLogger20);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText22 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable23 = mergeAsOpenNLPAnnotatedText22.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract24 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = checkAbstract24.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = mergeAsOpenNLPAnnotatedText22.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = safeTsvText19.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = noLoopInPath18.outputSchema(schema27);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag30 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText31 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger32 = null;
        safeTsvText31.setPigLogger(pigLogger32);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText34 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable35 = mergeAsOpenNLPAnnotatedText34.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract36 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema37 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema38 = checkAbstract36.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema39 = mergeAsOpenNLPAnnotatedText34.outputSchema(schema37);
        org.apache.pig.impl.logicalLayer.schema.Schema schema40 = safeTsvText31.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema41 = aggregateTextBag30.outputSchema(schema39);
        org.apache.pig.impl.logicalLayer.schema.Schema schema42 = noLoopInPath18.outputSchema(schema39);
        pignlproc.evaluation.CheckAbstract checkAbstract43 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum45 = null;
        checkAbstract43.warn("http://.wikipedia.org/wiki/hi%21", enum45);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger47 = null;
        checkAbstract43.setPigLogger(pigLogger47);
        checkAbstract43.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText50 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger51 = null;
        safeTsvText50.setPigLogger(pigLogger51);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText53 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable54 = mergeAsOpenNLPAnnotatedText53.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract55 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema56 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema57 = checkAbstract55.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema58 = mergeAsOpenNLPAnnotatedText53.outputSchema(schema56);
        org.apache.pig.impl.logicalLayer.schema.Schema schema59 = safeTsvText50.outputSchema(schema58);
        org.apache.pig.impl.logicalLayer.schema.Schema schema60 = checkAbstract43.outputSchema(schema59);
        org.apache.pig.impl.logicalLayer.schema.Schema schema61 = noLoopInPath18.outputSchema(schema60);
        org.apache.pig.impl.logicalLayer.schema.Schema schema62 = sentencesWithLink17.outputSchema(schema61);
        org.apache.pig.impl.logicalLayer.schema.Schema schema63 = noLoopInPath0.outputSchema(schema62);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable64 = noLoopInPath0.getReporter();
        noLoopInPath0.progress();
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(pigLogger12);
        org.junit.Assert.assertNotNull(type16);
        org.junit.Assert.assertNull(pigProgressable23);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNull(pigProgressable35);
        org.junit.Assert.assertNotNull(schema38);
        org.junit.Assert.assertNotNull(schema39);
        org.junit.Assert.assertNotNull(schema40);
        org.junit.Assert.assertNotNull(schema41);
        org.junit.Assert.assertNotNull(schema42);
        org.junit.Assert.assertNull(pigProgressable54);
        org.junit.Assert.assertNotNull(schema57);
        org.junit.Assert.assertNotNull(schema58);
        org.junit.Assert.assertNotNull(schema59);
        org.junit.Assert.assertNotNull(schema60);
        org.junit.Assert.assertNotNull(schema61);
        org.junit.Assert.assertNotNull(schema62);
        org.junit.Assert.assertNotNull(schema63);
        org.junit.Assert.assertNull(pigProgressable64);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        pignlproc.evaluation.NoLoopInPath noLoopInPath0 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText1 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger2 = null;
        safeTsvText1.setPigLogger(pigLogger2);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText4 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable5 = mergeAsOpenNLPAnnotatedText4.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract6 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema7 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema8 = checkAbstract6.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema9 = mergeAsOpenNLPAnnotatedText4.outputSchema(schema7);
        org.apache.pig.impl.logicalLayer.schema.Schema schema10 = safeTsvText1.outputSchema(schema9);
        org.apache.pig.impl.logicalLayer.schema.Schema schema11 = noLoopInPath0.outputSchema(schema9);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag12 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText13 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger14 = null;
        safeTsvText13.setPigLogger(pigLogger14);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText16 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable17 = mergeAsOpenNLPAnnotatedText16.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract18 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema19 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema20 = checkAbstract18.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema21 = mergeAsOpenNLPAnnotatedText16.outputSchema(schema19);
        org.apache.pig.impl.logicalLayer.schema.Schema schema22 = safeTsvText13.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema23 = aggregateTextBag12.outputSchema(schema21);
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = noLoopInPath0.outputSchema(schema21);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger25 = null;
        noLoopInPath0.setPigLogger(pigLogger25);
        org.apache.pig.data.Tuple tuple27 = null;
        java.lang.Boolean boolean28 = noLoopInPath0.exec(tuple27);
        noLoopInPath0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger30 = noLoopInPath0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger31 = null;
        noLoopInPath0.setPigLogger(pigLogger31);
        org.apache.pig.data.Tuple tuple33 = null;
        java.lang.Boolean boolean34 = noLoopInPath0.exec(tuple33);
        org.apache.pig.data.Tuple tuple35 = null;
        java.lang.Boolean boolean36 = noLoopInPath0.exec(tuple35);
        org.junit.Assert.assertNull(pigProgressable5);
        org.junit.Assert.assertNotNull(schema8);
        org.junit.Assert.assertNotNull(schema9);
        org.junit.Assert.assertNotNull(schema10);
        org.junit.Assert.assertNotNull(schema11);
        org.junit.Assert.assertNull(pigProgressable17);
        org.junit.Assert.assertNotNull(schema20);
        org.junit.Assert.assertNotNull(schema21);
        org.junit.Assert.assertNotNull(schema22);
        org.junit.Assert.assertNotNull(schema23);
        org.junit.Assert.assertNotNull(schema24);
        org.junit.Assert.assertEquals("'" + boolean28 + "' != '" + true + "'", boolean28, true);
        org.junit.Assert.assertNull(pigLogger30);
        org.junit.Assert.assertEquals("'" + boolean34 + "' != '" + true + "'", boolean34, true);
        org.junit.Assert.assertEquals("'" + boolean36 + "' != '" + true + "'", boolean36, true);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser0 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList1 = annotatingMarkupParser0.getHeaderAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser2 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser2.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList4 = annotatingMarkupParser2.getWikiLinkAnnotations();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser2.getParagraphAnnotations();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser6 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList7 = annotatingMarkupParser6.getHeaders();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser6.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList9 = annotatingMarkupParser6.getHeaderAnnotations();
        java.lang.String str10 = annotatingMarkupParser6.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser11 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList12 = annotatingMarkupParser11.getHeaders();
        java.util.List<java.lang.String> strList13 = annotatingMarkupParser11.getHeaders();
        java.lang.Appendable appendable14 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable15 = annotatingMarkupParser11.new CountingAppendable(appendable14);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable16 = annotatingMarkupParser6.new CountingAppendable((java.lang.Appendable) countingAppendable15);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser17 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList18 = annotatingMarkupParser17.getHeaderAnnotations();
        java.lang.String str19 = annotatingMarkupParser17.getRedirect();
        pignlproc.markup.Annotation annotation24 = new pignlproc.markup.Annotation((int) (short) 10, (int) (short) 10, "title", "hi!");
        pignlproc.markup.Annotation annotation29 = new pignlproc.markup.Annotation((int) '4', (int) (byte) 0, "http://.wikipedia.org/wiki/hi%21", "http://.wikipedia.org/wiki/hi%21");
        int int30 = annotation29.end;
        int int31 = annotation29.begin;
        pignlproc.markup.Annotation[] annotationArray32 = new pignlproc.markup.Annotation[] { annotation24, annotation29 };
        java.util.ArrayList<pignlproc.markup.Annotation> annotationList33 = new java.util.ArrayList<pignlproc.markup.Annotation>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<pignlproc.markup.Annotation>) annotationList33, annotationArray32);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser35 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList36 = annotatingMarkupParser35.getHeaders();
        java.util.List<java.lang.String> strList37 = annotatingMarkupParser35.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList38 = annotatingMarkupParser35.getHeaderAnnotations();
        java.lang.String str39 = annotatingMarkupParser35.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser40 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList41 = annotatingMarkupParser40.getHeaders();
        java.util.List<java.lang.String> strList42 = annotatingMarkupParser40.getHeaders();
        java.lang.Appendable appendable43 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable44 = annotatingMarkupParser40.new CountingAppendable(appendable43);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable45 = annotatingMarkupParser35.new CountingAppendable((java.lang.Appendable) countingAppendable44);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser46 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<pignlproc.markup.Annotation> annotationList47 = annotatingMarkupParser46.getWikiLinkAnnotations();
        info.bliki.wiki.model.WikiModel wikiModel49 = annotatingMarkupParser46.makeWikiModel("title");
        annotatingMarkupParser17.nodesToText((java.util.List<pignlproc.markup.Annotation>) annotationList33, (java.lang.Appendable) countingAppendable44, (info.bliki.wiki.model.IWikiModel) wikiModel49);
        annotatingMarkupParser0.nodesToText(annotationList5, (java.lang.Appendable) countingAppendable16, (info.bliki.wiki.model.IWikiModel) wikiModel49);
        boolean boolean52 = annotatingMarkupParser0.noLinks();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser53 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList54 = annotatingMarkupParser53.getHeaders();
        java.util.List<java.lang.String> strList55 = annotatingMarkupParser53.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList56 = annotatingMarkupParser53.getHeaderAnnotations();
        java.lang.String str57 = annotatingMarkupParser53.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser58 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList59 = annotatingMarkupParser58.getHeaders();
        java.util.List<java.lang.String> strList60 = annotatingMarkupParser58.getHeaders();
        java.lang.Appendable appendable61 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable62 = annotatingMarkupParser58.new CountingAppendable(appendable61);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable63 = annotatingMarkupParser53.new CountingAppendable((java.lang.Appendable) countingAppendable62);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser64 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList65 = annotatingMarkupParser64.getHeaders();
        java.util.List<java.lang.String> strList66 = annotatingMarkupParser64.getHeaders();
        java.lang.Appendable appendable67 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable68 = annotatingMarkupParser64.new CountingAppendable(appendable67);
        countingAppendable68.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable71 = annotatingMarkupParser53.new CountingAppendable((java.lang.Appendable) countingAppendable68);
        countingAppendable68.currentPosition = (short) -1;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable74 = annotatingMarkupParser0.new CountingAppendable((java.lang.Appendable) countingAppendable68);
        int int75 = countingAppendable74.currentPosition;
        org.junit.Assert.assertNotNull(annotationList1);
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(annotationList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNotNull(strList7);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(annotationList9);
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(strList12);
        org.junit.Assert.assertNotNull(strList13);
        org.junit.Assert.assertNotNull(annotationList18);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 52 + "'", int31 == 52);
        org.junit.Assert.assertNotNull(annotationArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(strList36);
        org.junit.Assert.assertNotNull(strList37);
        org.junit.Assert.assertNotNull(annotationList38);
        org.junit.Assert.assertNull(str39);
        org.junit.Assert.assertNotNull(strList41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertNotNull(annotationList47);
        org.junit.Assert.assertNotNull(wikiModel49);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertNotNull(strList54);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertNotNull(annotationList56);
        org.junit.Assert.assertNull(str57);
        org.junit.Assert.assertNotNull(strList59);
        org.junit.Assert.assertNotNull(strList60);
        org.junit.Assert.assertNotNull(strList65);
        org.junit.Assert.assertNotNull(strList66);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 0 + "'", int75 == 0);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
        org.apache.hadoop.mapreduce.Job job0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.apache.hadoop.mapreduce.lib.input.FileInputFormat.setInputPaths(job0, "\"\"\"title\"\" \"");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
        java.lang.String[] strArray1 = new java.lang.String[] { "opennlp/en-sent.bin" };
        java.util.ArrayList<java.lang.String> strList2 = new java.util.ArrayList<java.lang.String>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList2, strArray1);
        java.lang.String str5 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "");
        java.lang.String str7 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://.wikipedia.org/wiki/hi%21");
        java.lang.String str9 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://.wikipedia.org/wiki/http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521");
        java.lang.String str11 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "\"hi!\"");
        java.lang.String str13 = org.apache.pig.LoadFunc.join((java.util.AbstractCollection<java.lang.String>) strList2, "http://.wikipedia.org/wiki/");
        org.junit.Assert.assertNotNull(strArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "opennlp/en-sent.bin" + "'", str5, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "opennlp/en-sent.bin" + "'", str7, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "opennlp/en-sent.bin" + "'", str9, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "opennlp/en-sent.bin" + "'", str11, "opennlp/en-sent.bin");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "opennlp/en-sent.bin" + "'", str13, "opennlp/en-sent.bin");
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("\"hi!\"\n\n");
        org.apache.hadoop.mapreduce.InputFormat inputFormat2 = parsingWikipediaLoader1.getInputFormat();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText3 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray5 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList6 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList6, spanArray5);
        java.lang.String str8 = mergeAsOpenNLPAnnotatedText3.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList6);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        mergeAsOpenNLPAnnotatedText3.setPigLogger(pigLogger9);
        boolean boolean11 = mergeAsOpenNLPAnnotatedText3.isAsynchronous();
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText13 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray15 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList16 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean17 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList16, spanArray15);
        java.lang.String str18 = mergeAsOpenNLPAnnotatedText13.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList16);
        java.lang.String str19 = mergeAsOpenNLPAnnotatedText3.merge("opennlp/en-sent.bin", (java.util.List<opennlp.tools.util.Span>) spanList16);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText21 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable22 = mergeAsOpenNLPAnnotatedText21.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract23 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema24 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = checkAbstract23.outputSchema(schema24);
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = mergeAsOpenNLPAnnotatedText21.outputSchema(schema24);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText28 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray30 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList31 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean32 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList31, spanArray30);
        java.lang.String str33 = mergeAsOpenNLPAnnotatedText28.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList31);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText35 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        opennlp.tools.util.Span[] spanArray37 = new opennlp.tools.util.Span[] {};
        java.util.ArrayList<opennlp.tools.util.Span> spanList38 = new java.util.ArrayList<opennlp.tools.util.Span>();
        boolean boolean39 = java.util.Collections.addAll((java.util.Collection<opennlp.tools.util.Span>) spanList38, spanArray37);
        java.lang.String str40 = mergeAsOpenNLPAnnotatedText35.merge("href", (java.util.List<opennlp.tools.util.Span>) spanList38);
        java.lang.String str41 = mergeAsOpenNLPAnnotatedText28.merge("hi!", (java.util.List<opennlp.tools.util.Span>) spanList38);
        java.lang.String str42 = mergeAsOpenNLPAnnotatedText21.merge("title", (java.util.List<opennlp.tools.util.Span>) spanList38);
        java.lang.String str43 = mergeAsOpenNLPAnnotatedText3.merge("http://http://.wikipedia.org/wiki/hi%21\n.wikipedia.org/wiki/hi%21", (java.util.List<opennlp.tools.util.Span>) spanList38);
        java.lang.reflect.Type type44 = mergeAsOpenNLPAnnotatedText3.getReturnType();
        java.util.List<org.apache.pig.FuncSpec> funcSpecList45 = mergeAsOpenNLPAnnotatedText3.getArgToFuncMapping();
        mergeAsOpenNLPAnnotatedText3.finish();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable47 = mergeAsOpenNLPAnnotatedText3.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger48 = mergeAsOpenNLPAnnotatedText3.getPigLogger();
        java.lang.Enum enum50 = null;
        mergeAsOpenNLPAnnotatedText3.warn("\" http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 \"", enum50);
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader53 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job55 = null;
        org.apache.pig.ResourceStatistics resourceStatistics56 = parsingWikipediaLoader53.getStatistics("hi!", job55);
        org.apache.hadoop.mapreduce.Job job58 = null;
        org.apache.pig.ResourceSchema resourceSchema59 = parsingWikipediaLoader53.getSchema("\"hi!\"", job58);
        org.apache.hadoop.mapreduce.Job job61 = null;
        java.lang.String[] strArray62 = parsingWikipediaLoader53.getPartitionKeys("\"opennlp / en - sent . bin\"\n", job61);
        org.apache.hadoop.mapreduce.Job job64 = null;
        org.apache.pig.ResourceSchema resourceSchema65 = parsingWikipediaLoader53.getSchema("http://title\n\n.wikipedia.org/wiki/http%3A%2F%2Fhttp%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%0A.wikipedia.org%2Fwiki%2F%2522title%2522", job64);
        java.util.List<opennlp.tools.util.Span> spanList66 = pignlproc.helpers.SpanHelper.tupleFieldsToSpans((java.lang.Object) inputFormat2, (java.lang.Object) enum50, (java.lang.Object) resourceSchema65);
        org.junit.Assert.assertNotNull(inputFormat2);
        org.junit.Assert.assertNotNull(spanArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi !" + "'", str8, "hi !");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(spanArray15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "href" + "'", str18, "href");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "opennlp / en - sent . bin" + "'", str19, "opennlp / en - sent . bin");
        org.junit.Assert.assertNull(pigProgressable22);
        org.junit.Assert.assertNotNull(schema25);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(spanArray30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "hi !" + "'", str33, "hi !");
        org.junit.Assert.assertNotNull(spanArray37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "href" + "'", str40, "href");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi !" + "'", str41, "hi !");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "title" + "'", str42, "title");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21" + "'", str43, "http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21");
        org.junit.Assert.assertNotNull(type44);
        org.junit.Assert.assertNull(funcSpecList45);
        org.junit.Assert.assertNull(pigProgressable47);
        org.junit.Assert.assertNull(pigLogger48);
        org.junit.Assert.assertNull(resourceStatistics56);
        org.junit.Assert.assertNotNull(resourceSchema59);
        org.junit.Assert.assertNull(strArray62);
        org.junit.Assert.assertNotNull(resourceSchema65);
        org.junit.Assert.assertNotNull(spanList66);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("hi !");
        org.apache.pig.Expression expression2 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression2);
        org.apache.pig.LoadCaster loadCaster4 = parsingWikipediaLoader1.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job6 = null;
        org.apache.pig.ResourceStatistics resourceStatistics7 = parsingWikipediaLoader1.getStatistics("http://\"title\"\n.wikipedia.org/wiki/\n", job6);
        org.apache.pig.Expression expression8 = null;
        parsingWikipediaLoader1.setPartitionFilter(expression8);
        org.apache.hadoop.mapreduce.Job job11 = null;
        org.apache.pig.ResourceSchema resourceSchema12 = parsingWikipediaLoader1.getSchema("http://http://hi!\n.wikipedia.org/wiki/%22_title_%22.wikipedia.org/wiki/opennlp_%2F_en_-_sent_._bin", job11);
        org.junit.Assert.assertNotNull(loadCaster4);
        org.junit.Assert.assertNull(resourceStatistics7);
        org.junit.Assert.assertNotNull(resourceSchema12);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        pignlproc.storage.UriStringLiteralNTriplesLoader uriStringLiteralNTriplesLoader2 = new pignlproc.storage.UriStringLiteralNTriplesLoader("href", "opennlp/en-sent.bin");
        org.apache.hadoop.mapreduce.Job job4 = null;
        org.apache.pig.ResourceSchema resourceSchema5 = uriStringLiteralNTriplesLoader2.getSchema("http://.wikipedia.org/wiki/hi%21", job4);
        org.apache.hadoop.mapreduce.InputFormat inputFormat6 = uriStringLiteralNTriplesLoader2.getInputFormat();
        org.apache.hadoop.mapreduce.Job job8 = null;
        java.lang.String[] strArray9 = uriStringLiteralNTriplesLoader2.getPartitionKeys("http : // http : // http : // http : // . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / hi % 21 . wikipedia . org / wiki / http _ % 3 A _ % 2 F % 2 F _ http _ % 3 A _ % 2 F % 2 F _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 _ . _ wikipedia _ . _ org _ % 2 F _ wiki _ % 2 F _ hi _ % 25 _ 21 . wikipedia . org / wiki / % 22 http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 _ . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 href % 22", job8);
        org.junit.Assert.assertNotNull(resourceSchema5);
        org.junit.Assert.assertNotNull(inputFormat6);
        org.junit.Assert.assertNull(strArray9);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader3 = new pignlproc.storage.UriUriNTriplesLoader("hi !", "opennlp/en-sent.bin", "wikiobject");
        org.apache.pig.Expression expression4 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression4);
        org.apache.hadoop.mapreduce.Job job7 = null;
        org.apache.pig.ResourceSchema resourceSchema8 = uriUriNTriplesLoader3.getSchema("\"\"\n", job7);
        org.apache.pig.Expression expression9 = null;
        uriUriNTriplesLoader3.setPartitionFilter(expression9);
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = uriUriNTriplesLoader3.getSchema("", job12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        java.lang.String[] strArray16 = uriUriNTriplesLoader3.getPartitionKeys("\" http : // hi ! . wikipedia . org / wiki / http % 3 A % 2 F % 2 Fhttp % 3 A % 2 F % 2 F . wikipedia . org % 2 Fwiki % 2 Fhi % 2521 % 0 A . wikipedia . org % 2 Fwiki % 2 F % 2522 title % 2522 \"", job15);
        org.junit.Assert.assertNotNull(resourceSchema8);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNull(strArray16);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable3 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable4 = null;
        sentencesWithLink0.setReporter(pigProgressable4);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = sentencesWithLink0.getReporter();
        sentencesWithLink0.progress();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable8 = sentencesWithLink0.getReporter();
        org.junit.Assert.assertNull(pigProgressable3);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNull(pigProgressable8);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        pignlproc.evaluation.SentencesWithLink sentencesWithLink0 = new pignlproc.evaluation.SentencesWithLink();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger1 = null;
        sentencesWithLink0.setPigLogger(pigLogger1);
        java.util.List<org.apache.pig.FuncSpec> funcSpecList3 = sentencesWithLink0.getArgToFuncMapping();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger4 = sentencesWithLink0.getPigLogger();
        boolean boolean5 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable6 = sentencesWithLink0.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger7 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = sentencesWithLink0.getPigLogger();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger9 = null;
        sentencesWithLink0.setPigLogger(pigLogger9);
        boolean boolean11 = sentencesWithLink0.isAsynchronous();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger12 = null;
        sentencesWithLink0.setPigLogger(pigLogger12);
        org.junit.Assert.assertNull(funcSpecList3);
        org.junit.Assert.assertNull(pigLogger4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(pigProgressable6);
        org.junit.Assert.assertNull(pigLogger7);
        org.junit.Assert.assertNull(pigLogger8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        pignlproc.evaluation.ConcatTextBag concatTextBag1 = new pignlproc.evaluation.ConcatTextBag("opennlp/en-sent.bin");
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable2 = concatTextBag1.getReporter();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger3 = concatTextBag1.getPigLogger();
        org.apache.pig.data.Tuple tuple4 = null;
        java.lang.String str5 = concatTextBag1.exec(tuple4);
        org.apache.pig.data.Tuple tuple6 = null;
        java.lang.String str7 = concatTextBag1.exec(tuple6);
        org.apache.pig.data.Tuple tuple8 = null;
        java.lang.String str9 = concatTextBag1.exec(tuple8);
        org.junit.Assert.assertNull(pigProgressable2);
        org.junit.Assert.assertNull(pigLogger3);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser1 = new pignlproc.markup.AnnotatingMarkupParser("\"title\"");
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser2 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList3 = annotatingMarkupParser2.getHeaders();
        java.util.List<java.lang.String> strList4 = annotatingMarkupParser2.getHeaders();
        java.util.List<pignlproc.markup.Annotation> annotationList5 = annotatingMarkupParser2.getHeaderAnnotations();
        java.lang.String str6 = annotatingMarkupParser2.getRedirect();
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser7 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList8 = annotatingMarkupParser7.getHeaders();
        java.util.List<java.lang.String> strList9 = annotatingMarkupParser7.getHeaders();
        java.lang.Appendable appendable10 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable11 = annotatingMarkupParser7.new CountingAppendable(appendable10);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable12 = annotatingMarkupParser2.new CountingAppendable((java.lang.Appendable) countingAppendable11);
        pignlproc.markup.AnnotatingMarkupParser annotatingMarkupParser13 = new pignlproc.markup.AnnotatingMarkupParser();
        java.util.List<java.lang.String> strList14 = annotatingMarkupParser13.getHeaders();
        java.util.List<java.lang.String> strList15 = annotatingMarkupParser13.getHeaders();
        java.lang.Appendable appendable16 = null;
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable17 = annotatingMarkupParser13.new CountingAppendable(appendable16);
        countingAppendable17.currentPosition = '#';
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable20 = annotatingMarkupParser2.new CountingAppendable((java.lang.Appendable) countingAppendable17);
        pignlproc.markup.AnnotatingMarkupParser.CountingAppendable countingAppendable21 = annotatingMarkupParser1.new CountingAppendable((java.lang.Appendable) countingAppendable20);
        java.util.List<java.lang.String> strList22 = annotatingMarkupParser1.getHeaders();
        java.util.List<java.lang.String> strList23 = annotatingMarkupParser1.getHeaders();
        org.junit.Assert.assertNotNull(strList3);
        org.junit.Assert.assertNotNull(strList4);
        org.junit.Assert.assertNotNull(annotationList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertNotNull(strList8);
        org.junit.Assert.assertNotNull(strList9);
        org.junit.Assert.assertNotNull(strList14);
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(strList22);
        org.junit.Assert.assertNotNull(strList23);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        pignlproc.storage.UriUriNTriplesLoader uriUriNTriplesLoader0 = new pignlproc.storage.UriUriNTriplesLoader();
        org.apache.hadoop.mapreduce.Job job2 = null;
        java.lang.String[] strArray3 = uriUriNTriplesLoader0.getPartitionKeys("title", job2);
        org.apache.hadoop.mapreduce.Job job5 = null;
        org.apache.pig.ResourceSchema resourceSchema6 = uriUriNTriplesLoader0.getSchema("http://.wikipedia.org/wiki/hi%21", job5);
        org.apache.hadoop.mapreduce.RecordReader recordReader7 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit8 = null;
        uriUriNTriplesLoader0.prepareToRead(recordReader7, pigSplit8);
        org.apache.pig.LoadCaster loadCaster10 = uriUriNTriplesLoader0.getLoadCaster();
        org.apache.pig.LoadCaster loadCaster11 = uriUriNTriplesLoader0.getLoadCaster();
        org.apache.hadoop.mapreduce.Job job13 = null;
        org.apache.pig.ResourceSchema resourceSchema14 = uriUriNTriplesLoader0.getSchema("http://http://\"\"\"http://.wikipedia.org/wiki/hi%21\"\" \".wikipedia.org/wiki/%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22.wikipedia.org/wiki/wikiobject", job13);
        // The following exception was thrown during execution in test generation
        try {
            org.apache.pig.data.Tuple tuple15 = uriUriNTriplesLoader0.getNext();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(strArray3);
        org.junit.Assert.assertNotNull(resourceSchema6);
        org.junit.Assert.assertNotNull(loadCaster10);
        org.junit.Assert.assertNotNull(loadCaster11);
        org.junit.Assert.assertNotNull(resourceSchema14);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        pignlproc.evaluation.AggregateTextBag aggregateTextBag2 = new pignlproc.evaluation.AggregateTextBag((int) (short) 100, true);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag5 = new pignlproc.evaluation.AggregateTextBag((int) 'a', false);
        pignlproc.evaluation.NoLoopInPath noLoopInPath6 = new pignlproc.evaluation.NoLoopInPath();
        pignlproc.evaluation.SafeTsvText safeTsvText7 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger8 = null;
        safeTsvText7.setPigLogger(pigLogger8);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText10 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable11 = mergeAsOpenNLPAnnotatedText10.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract12 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema13 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema14 = checkAbstract12.outputSchema(schema13);
        org.apache.pig.impl.logicalLayer.schema.Schema schema15 = mergeAsOpenNLPAnnotatedText10.outputSchema(schema13);
        org.apache.pig.impl.logicalLayer.schema.Schema schema16 = safeTsvText7.outputSchema(schema15);
        org.apache.pig.impl.logicalLayer.schema.Schema schema17 = noLoopInPath6.outputSchema(schema15);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag18 = new pignlproc.evaluation.AggregateTextBag();
        pignlproc.evaluation.SafeTsvText safeTsvText19 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger20 = null;
        safeTsvText19.setPigLogger(pigLogger20);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText22 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable23 = mergeAsOpenNLPAnnotatedText22.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract24 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema25 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema26 = checkAbstract24.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema27 = mergeAsOpenNLPAnnotatedText22.outputSchema(schema25);
        org.apache.pig.impl.logicalLayer.schema.Schema schema28 = safeTsvText19.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema29 = aggregateTextBag18.outputSchema(schema27);
        org.apache.pig.impl.logicalLayer.schema.Schema schema30 = noLoopInPath6.outputSchema(schema27);
        pignlproc.evaluation.CheckAbstract checkAbstract31 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum33 = null;
        checkAbstract31.warn("http://.wikipedia.org/wiki/hi%21", enum33);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger35 = null;
        checkAbstract31.setPigLogger(pigLogger35);
        checkAbstract31.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText38 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger39 = null;
        safeTsvText38.setPigLogger(pigLogger39);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText41 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable42 = mergeAsOpenNLPAnnotatedText41.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract43 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema44 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema45 = checkAbstract43.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema46 = mergeAsOpenNLPAnnotatedText41.outputSchema(schema44);
        org.apache.pig.impl.logicalLayer.schema.Schema schema47 = safeTsvText38.outputSchema(schema46);
        org.apache.pig.impl.logicalLayer.schema.Schema schema48 = checkAbstract31.outputSchema(schema47);
        org.apache.pig.impl.logicalLayer.schema.Schema schema49 = noLoopInPath6.outputSchema(schema48);
        org.apache.pig.impl.logicalLayer.schema.Schema schema50 = aggregateTextBag5.outputSchema(schema48);
        pignlproc.evaluation.AggregateTextBag aggregateTextBag52 = new pignlproc.evaluation.AggregateTextBag((int) (short) 10);
        pignlproc.evaluation.ConcatTextBag concatTextBag54 = new pignlproc.evaluation.ConcatTextBag("http://.wikipedia.org/wiki/hi%21");
        pignlproc.evaluation.CheckAbstract checkAbstract55 = new pignlproc.evaluation.CheckAbstract();
        java.lang.Enum enum57 = null;
        checkAbstract55.warn("http://.wikipedia.org/wiki/hi%21", enum57);
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger59 = null;
        checkAbstract55.setPigLogger(pigLogger59);
        checkAbstract55.progress();
        pignlproc.evaluation.SafeTsvText safeTsvText62 = new pignlproc.evaluation.SafeTsvText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigLogger pigLogger63 = null;
        safeTsvText62.setPigLogger(pigLogger63);
        pignlproc.evaluation.MergeAsOpenNLPAnnotatedText mergeAsOpenNLPAnnotatedText65 = new pignlproc.evaluation.MergeAsOpenNLPAnnotatedText();
        org.apache.pig.backend.hadoop.executionengine.physicalLayer.PigProgressable pigProgressable66 = mergeAsOpenNLPAnnotatedText65.getReporter();
        pignlproc.evaluation.CheckAbstract checkAbstract67 = new pignlproc.evaluation.CheckAbstract();
        org.apache.pig.impl.logicalLayer.schema.Schema schema68 = null;
        org.apache.pig.impl.logicalLayer.schema.Schema schema69 = checkAbstract67.outputSchema(schema68);
        org.apache.pig.impl.logicalLayer.schema.Schema schema70 = mergeAsOpenNLPAnnotatedText65.outputSchema(schema68);
        org.apache.pig.impl.logicalLayer.schema.Schema schema71 = safeTsvText62.outputSchema(schema70);
        org.apache.pig.impl.logicalLayer.schema.Schema schema72 = checkAbstract55.outputSchema(schema71);
        org.apache.pig.impl.logicalLayer.schema.Schema schema73 = concatTextBag54.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema74 = aggregateTextBag52.outputSchema(schema72);
        org.apache.pig.impl.logicalLayer.schema.Schema schema75 = aggregateTextBag5.outputSchema(schema74);
        org.apache.pig.impl.logicalLayer.schema.Schema schema76 = aggregateTextBag2.outputSchema(schema74);
        boolean boolean77 = aggregateTextBag2.isAsynchronous();
        org.junit.Assert.assertNull(pigProgressable11);
        org.junit.Assert.assertNotNull(schema14);
        org.junit.Assert.assertNotNull(schema15);
        org.junit.Assert.assertNotNull(schema16);
        org.junit.Assert.assertNotNull(schema17);
        org.junit.Assert.assertNull(pigProgressable23);
        org.junit.Assert.assertNotNull(schema26);
        org.junit.Assert.assertNotNull(schema27);
        org.junit.Assert.assertNotNull(schema28);
        org.junit.Assert.assertNotNull(schema29);
        org.junit.Assert.assertNotNull(schema30);
        org.junit.Assert.assertNull(pigProgressable42);
        org.junit.Assert.assertNotNull(schema45);
        org.junit.Assert.assertNotNull(schema46);
        org.junit.Assert.assertNotNull(schema47);
        org.junit.Assert.assertNotNull(schema48);
        org.junit.Assert.assertNotNull(schema49);
        org.junit.Assert.assertNotNull(schema50);
        org.junit.Assert.assertNull(pigProgressable66);
        org.junit.Assert.assertNotNull(schema69);
        org.junit.Assert.assertNotNull(schema70);
        org.junit.Assert.assertNotNull(schema71);
        org.junit.Assert.assertNotNull(schema72);
        org.junit.Assert.assertNotNull(schema73);
        org.junit.Assert.assertNotNull(schema74);
        org.junit.Assert.assertNotNull(schema75);
        org.junit.Assert.assertNotNull(schema76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        pignlproc.markup.Annotation annotation4 = new pignlproc.markup.Annotation(0, (-1), "\"\"\"title\"\" \"href", "http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/http%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhrefwikiobject%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22wikiobject%22hi%21%22%0Awikiobject%0Awikiobjectopennlp%2Fen-sent.binwikiobjecthttp%3A%2F%2Fhi%21%0A.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._binwikiobjecthttp%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521wikiobjecthttp%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522wikiobject%22opennlp_%2F_en_-_sent_._bin%22wikiobject%22%22");
        java.lang.String str5 = annotation4.value;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/http%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhrefwikiobject%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22wikiobject%22hi%21%22%0Awikiobject%0Awikiobjectopennlp%2Fen-sent.binwikiobjecthttp%3A%2F%2Fhi%21%0A.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._binwikiobjecthttp%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521wikiobjecthttp%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522wikiobject%22opennlp_%2F_en_-_sent_._bin%22wikiobject%22%22" + "'", str5, "http://http : // \" opennlp / en - sent . bin \" . wikipedia . org / wiki / href.wikipedia.org/wiki/http%3A%2F%2F%22opennlp_%2F_en_-_sent_._bin%22.wikipedia.org%2Fwiki%2Fhrefwikiobject%22%22%22http%3A%2F%2Fhi%21.wikipedia.org%2Fwiki%2F%2522http%253A%252F%252F.wikipedia.org%252Fwiki%252Fhi%252521%2522%250A%22%22%22wikiobject%22hi%21%22%0Awikiobject%0Awikiobjectopennlp%2Fen-sent.binwikiobjecthttp%3A%2F%2Fhi%21%0A.wikipedia.org%2Fwiki%2Fopennlp_%252F_en_-_sent_._binwikiobjecthttp%3A%2F%2Fhttp%3A%2F%2F%22title%22.wikipedia.org%2Fwiki%2F%2522hi%2521%2522.wikipedia.org%2Fwiki%2Fhi%2521wikiobjecthttp%3A%2F%2F%22http%3A%2F%2F.wikipedia.org%2Fwiki%2Fhi%2521%22.wikipedia.org%2Fwiki%2F%2522%2522%2522http%253A%252F%252Fhi_%2521_.wikipedia.org%252Fwiki%252Fhttp%25253A%25252F%25252Fhttp%25253A%25252F%25252F.wikipedia.org%25252Fwiki%25252Fhi%25252521%25250A.wikipedia.org%25252Fwiki%25252F%25252522title%25252522%2522%2522%2522wikiobject%22opennlp_%2F_en_-_sent_._bin%22wikiobject%22%22");
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
        pignlproc.storage.ParsingWikipediaLoader parsingWikipediaLoader1 = new pignlproc.storage.ParsingWikipediaLoader("");
        org.apache.hadoop.mapreduce.Job job3 = null;
        org.apache.pig.ResourceSchema resourceSchema4 = parsingWikipediaLoader1.getSchema("title", job3);
        org.apache.hadoop.mapreduce.Job job6 = null;
        java.lang.String[] strArray7 = parsingWikipediaLoader1.getPartitionKeys("wikiobject", job6);
        parsingWikipediaLoader1.setUDFContextSignature("http://\"hi!\"\n.wikipedia.org/wiki/%22hi%21_%22");
        org.apache.hadoop.mapreduce.InputFormat inputFormat10 = parsingWikipediaLoader1.getInputFormat();
        org.apache.hadoop.mapreduce.Job job12 = null;
        org.apache.pig.ResourceSchema resourceSchema13 = parsingWikipediaLoader1.getSchema("hi !", job12);
        org.apache.hadoop.mapreduce.Job job15 = null;
        org.apache.pig.ResourceStatistics resourceStatistics16 = parsingWikipediaLoader1.getStatistics("hi !\n", job15);
        org.apache.hadoop.mapreduce.Job job18 = null;
        org.apache.pig.ResourceStatistics resourceStatistics19 = parsingWikipediaLoader1.getStatistics("http://.wikipedia.org/wiki/hi%21\n", job18);
        org.apache.hadoop.mapreduce.RecordReader recordReader20 = null;
        org.apache.pig.backend.hadoop.executionengine.mapReduceLayer.PigSplit pigSplit21 = null;
        parsingWikipediaLoader1.prepareToRead(recordReader20, pigSplit21);
        org.apache.hadoop.mapreduce.Job job24 = null;
        org.apache.pig.ResourceSchema resourceSchema25 = parsingWikipediaLoader1.getSchema("hi !\n", job24);
        org.junit.Assert.assertNotNull(resourceSchema4);
        org.junit.Assert.assertNull(strArray7);
        org.junit.Assert.assertNotNull(inputFormat10);
        org.junit.Assert.assertNotNull(resourceSchema13);
        org.junit.Assert.assertNull(resourceStatistics16);
        org.junit.Assert.assertNull(resourceStatistics19);
        org.junit.Assert.assertNotNull(resourceSchema25);
    }
}

